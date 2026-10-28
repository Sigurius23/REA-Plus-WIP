.class public final Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b2\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010$\n\u0002\u0008#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\u0008$\u0010%J6\u0010.\u001a\u0004\u0018\u00010&2\u0008\u0010\'\u001a\u0004\u0018\u00010&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0008\u0008\u0002\u0010-\u001a\u00020,H\u0086@\u00a2\u0006\u0004\u0008.\u0010/J*\u00106\u001a\u0004\u0018\u00010&2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0082@\u00a2\u0006\u0004\u00086\u00107J\u0015\u0010:\u001a\u0004\u0018\u000109*\u000208H\u0002\u00a2\u0006\u0004\u0008:\u0010;J\u0013\u0010<\u001a\u00020&*\u00020&H\u0002\u00a2\u0006\u0004\u0008<\u0010=J\u0017\u0010>\u001a\u0004\u0018\u00010&*\u0004\u0018\u00010&H\u0002\u00a2\u0006\u0004\u0008>\u0010=J\u0013\u0010?\u001a\u00020&*\u00020&H\u0002\u00a2\u0006\u0004\u0008?\u0010=J\u0013\u0010@\u001a\u00020&*\u00020&H\u0002\u00a2\u0006\u0004\u0008@\u0010=J+\u0010D\u001a\u00020&*\u00020&2\u0006\u0010+\u001a\u00020*2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u000204H\u0002\u00a2\u0006\u0004\u0008D\u0010EJ\u0013\u0010F\u001a\u000204*\u00020&H\u0002\u00a2\u0006\u0004\u0008F\u0010GJ\u001b\u0010H\u001a\u00020&*\u00020&2\u0006\u0010B\u001a\u00020AH\u0002\u00a2\u0006\u0004\u0008H\u0010IJ\u0013\u0010J\u001a\u000204*\u00020&H\u0002\u00a2\u0006\u0004\u0008J\u0010GJ$\u0010K\u001a\u00020&*\u00020&2\u0006\u0010+\u001a\u00020*2\u0006\u0010B\u001a\u00020AH\u0082@\u00a2\u0006\u0004\u0008K\u0010LJ\u0013\u0010M\u001a\u00020&*\u00020&H\u0002\u00a2\u0006\u0004\u0008M\u0010=J\u0010\u0010N\u001a\u000204H\u0082@\u00a2\u0006\u0004\u0008N\u0010OJ\u0013\u0010P\u001a\u00020&*\u00020&H\u0002\u00a2\u0006\u0004\u0008P\u0010=J\u001b\u0010R\u001a\u00020&*\u00020&2\u0006\u0010Q\u001a\u000209H\u0002\u00a2\u0006\u0004\u0008R\u0010SJ\u001b\u0010V\u001a\u00020&*\u00020&2\u0006\u0010U\u001a\u00020TH\u0002\u00a2\u0006\u0004\u0008V\u0010WJ\u001c\u0010X\u001a\u00020&*\u00020&2\u0006\u0010-\u001a\u00020,H\u0082@\u00a2\u0006\u0004\u0008X\u0010YJ\u0014\u0010Z\u001a\u00020&*\u00020&H\u0082@\u00a2\u0006\u0004\u0008Z\u0010[J \u0010^\u001a\u00020&*\u00020&2\n\u0010]\u001a\u0006\u0012\u0002\u0008\u00030\\H\u0082@\u00a2\u0006\u0004\u0008^\u0010_J\u001c\u0010`\u001a\u00020&*\u00020&2\u0006\u0010-\u001a\u00020,H\u0082@\u00a2\u0006\u0004\u0008`\u0010YJ\u0013\u0010a\u001a\u00020&*\u00020&H\u0002\u00a2\u0006\u0004\u0008a\u0010=J#\u0010e\u001a\u00020&*\u00020&2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020bH\u0002\u00a2\u0006\u0004\u0008e\u0010fJ\u0013\u0010g\u001a\u00020&*\u00020&H\u0002\u00a2\u0006\u0004\u0008g\u0010=J%\u0010k\u001a\u00020&*\u00020&2\u0006\u0010)\u001a\u00020h2\u0008\u0008\u0002\u0010j\u001a\u00020iH\u0002\u00a2\u0006\u0004\u0008k\u0010lJ\u001b\u0010n\u001a\u00020&*\u00020&2\u0006\u0010)\u001a\u00020mH\u0002\u00a2\u0006\u0004\u0008n\u0010oJ\u0013\u0010p\u001a\u00020&*\u00020&H\u0002\u00a2\u0006\u0004\u0008p\u0010=J\u001b\u0010r\u001a\u00020&*\u00020&2\u0006\u0010q\u001a\u000209H\u0002\u00a2\u0006\u0004\u0008r\u0010SJ\u0013\u0010s\u001a\u00020&*\u00020&H\u0002\u00a2\u0006\u0004\u0008s\u0010=J\u0013\u0010t\u001a\u00020&*\u00020&H\u0002\u00a2\u0006\u0004\u0008t\u0010=J#\u0010v\u001a\u00020&*\u00020&2\u0006\u0010)\u001a\u00020u2\u0006\u0010+\u001a\u00020*H\u0002\u00a2\u0006\u0004\u0008v\u0010wJ\u001b\u0010y\u001a\u00020x*\u00020&2\u0006\u0010)\u001a\u00020uH\u0002\u00a2\u0006\u0004\u0008y\u0010zJ\u001b\u0010|\u001a\u00020x*\u00020&2\u0006\u0010)\u001a\u00020{H\u0002\u00a2\u0006\u0004\u0008|\u0010}J\u001c\u0010\u007f\u001a\u00020x*\u00020&2\u0006\u0010)\u001a\u00020~H\u0002\u00a2\u0006\u0005\u0008\u007f\u0010\u0080\u0001J\u0015\u0010\u0081\u0001\u001a\u00020&*\u00020&H\u0002\u00a2\u0006\u0005\u0008\u0081\u0001\u0010=J\u001e\u0010\u0082\u0001\u001a\u00020&*\u00020&2\u0006\u0010)\u001a\u00020uH\u0002\u00a2\u0006\u0006\u0008\u0082\u0001\u0010\u0083\u0001J%\u0010\u0084\u0001\u001a\u00020&*\u00020&2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020bH\u0002\u00a2\u0006\u0005\u0008\u0084\u0001\u0010fJ&\u0010\u0086\u0001\u001a\u00020&*\u00020&2\u0006\u0010c\u001a\u00020b2\u0007\u0010\u0085\u0001\u001a\u00020bH\u0002\u00a2\u0006\u0005\u0008\u0086\u0001\u0010fJ\u001e\u0010\u0087\u0001\u001a\u00020&*\u00020&2\u0006\u0010)\u001a\u00020uH\u0002\u00a2\u0006\u0006\u0008\u0087\u0001\u0010\u0083\u0001J%\u0010\u0088\u0001\u001a\u00020&*\u00020&2\u0006\u0010)\u001a\u00020u2\u0006\u0010+\u001a\u00020*H\u0002\u00a2\u0006\u0005\u0008\u0088\u0001\u0010wJ/\u0010\u0089\u0001\u001a\u00020&*\u00020&2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020b2\u0007\u0010\u0085\u0001\u001a\u00020bH\u0002\u00a2\u0006\u0006\u0008\u0089\u0001\u0010\u008a\u0001J7\u0010\u008b\u0001\u001a\u00020&*\u00020&2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020b2\u0007\u0010\u0085\u0001\u001a\u00020b2\u0006\u0010+\u001a\u00020*H\u0002\u00a2\u0006\u0006\u0008\u008b\u0001\u0010\u008c\u0001J\u0015\u0010\u008d\u0001\u001a\u00020&*\u00020&H\u0002\u00a2\u0006\u0005\u0008\u008d\u0001\u0010=J\u001e\u0010\u008e\u0001\u001a\u00020&*\u00020&2\u0006\u0010c\u001a\u00020bH\u0002\u00a2\u0006\u0006\u0008\u008e\u0001\u0010\u008f\u0001J\u0015\u0010\u0090\u0001\u001a\u00020&*\u00020&H\u0002\u00a2\u0006\u0005\u0008\u0090\u0001\u0010=J+\u0010\u0094\u0001\u001a\u0004\u0018\u000109*\u00020&2\u0011\u0008\u0002\u0010\u0093\u0001\u001a\n\u0012\u0005\u0012\u00030\u0092\u00010\u0091\u0001H\u0002\u00a2\u0006\u0006\u0008\u0094\u0001\u0010\u0095\u0001J+\u0010\u0097\u0001\u001a\u00020x*\u00020&2\u0006\u0010+\u001a\u00020*2\u000b\u0008\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010bH\u0002\u00a2\u0006\u0006\u0008\u0097\u0001\u0010\u0098\u0001J\u0015\u0010\u0099\u0001\u001a\u00020&*\u00020&H\u0002\u00a2\u0006\u0005\u0008\u0099\u0001\u0010=J)\u0010\u009a\u0001\u001a\u00020&*\u00020&2\u0011\u0008\u0002\u0010\u0093\u0001\u001a\n\u0012\u0005\u0012\u00030\u0092\u00010\u0091\u0001H\u0002\u00a2\u0006\u0006\u0008\u009a\u0001\u0010\u009b\u0001J\u0015\u0010\u009c\u0001\u001a\u00020&*\u00020&H\u0002\u00a2\u0006\u0005\u0008\u009c\u0001\u0010=J \u0010\u009e\u0001\u001a\u00020&*\u00020&2\u0008\u0010\u009d\u0001\u001a\u00030\u0092\u0001H\u0002\u00a2\u0006\u0006\u0008\u009e\u0001\u0010\u009f\u0001J)\u0010\u00a2\u0001\u001a\u0006\u0012\u0002\u0008\u00030\\2\u0008\u0010\u00a1\u0001\u001a\u00030\u00a0\u00012\u0006\u0010-\u001a\u00020,H\u0082@\u00a2\u0006\u0006\u0008\u00a2\u0001\u0010\u00a3\u0001J!\u0010\u00a4\u0001\u001a\u00020x*\u00020&2\u0008\u0010\u00a1\u0001\u001a\u00030\u00a0\u0001H\u0082@\u00a2\u0006\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001J/\u0010\u00a8\u0001\u001a\u00020x2\u0007\u0010\u00a6\u0001\u001a\u00020i2\u0007\u0010\u00a7\u0001\u001a\u00020i2\u0008\u0010\u00a1\u0001\u001a\u00030\u00a0\u0001H\u0082@\u00a2\u0006\u0006\u0008\u00a8\u0001\u0010\u00a9\u0001J \u0010\u00ab\u0001\u001a\u00020x*\u00020&2\u0007\u0010\u00aa\u0001\u001a\u000208H\u0082@\u00a2\u0006\u0006\u0008\u00ab\u0001\u0010\u00ac\u0001J%\u0010\u00ae\u0001\u001a\u00020x2\u0007\u0010\u00a6\u0001\u001a\u00020i2\u0007\u0010\u00ad\u0001\u001a\u00020iH\u0082@\u00a2\u0006\u0006\u0008\u00ae\u0001\u0010\u00af\u0001J\u0017\u0010\u00b0\u0001\u001a\u00030\u00a0\u0001*\u00020&H\u0002\u00a2\u0006\u0006\u0008\u00b0\u0001\u0010\u00b1\u0001J\u001a\u0010\u00b2\u0001\u001a\u00020x2\u0006\u0010-\u001a\u00020,H\u0002\u00a2\u0006\u0006\u0008\u00b2\u0001\u0010\u00b3\u0001J?\u0010\u00b6\u0001\u001a\u00020&*\u00020&2\u0008\u0010\u00a1\u0001\u001a\u00030\u00a0\u00012\u0006\u0010-\u001a\u00020,2\t\u0008\u0002\u0010\u00b4\u0001\u001a\u0002042\t\u0008\u0002\u0010\u00b5\u0001\u001a\u000204H\u0082@\u00a2\u0006\u0006\u0008\u00b6\u0001\u0010\u00b7\u0001J4\u0010\u00b8\u0001\u001a\u00020&*\u00020&2\u0008\u0010\u00a1\u0001\u001a\u00030\u00a0\u00012\u0006\u0010-\u001a\u00020,2\t\u0008\u0002\u0010\u00b4\u0001\u001a\u000204H\u0082@\u00a2\u0006\u0006\u0008\u00b8\u0001\u0010\u00b9\u0001J\u001b\u0010\u00bb\u0001\u001a\u00020x2\u0007\u0010\u00ba\u0001\u001a\u00020iH\u0002\u00a2\u0006\u0006\u0008\u00bb\u0001\u0010\u00bc\u0001J\u001a\u0010\u00bd\u0001\u001a\u0006\u0012\u0002\u0008\u00030\\*\u00020&H\u0082@\u00a2\u0006\u0005\u0008\u00bd\u0001\u0010[J)\u0010\u00bf\u0001\u001a\u00020&*\u00020&2\u0006\u0010)\u001a\u00020(2\t\u0010\u00be\u0001\u001a\u0004\u0018\u00010&H\u0002\u00a2\u0006\u0006\u0008\u00bf\u0001\u0010\u00c0\u0001J\u0016\u0010\u00c1\u0001\u001a\u000204*\u00020(H\u0002\u00a2\u0006\u0006\u0008\u00c1\u0001\u0010\u00c2\u0001JA\u0010\u00c7\u0001\u001a\u00028\u0000\"\u0005\u0008\u0000\u0010\u00c3\u00012%\u0010\u00c6\u0001\u001a \u0008\u0001\u0012\u0004\u0012\u00020*\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u00c5\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00c4\u0001H\u0082@\u00a2\u0006\u0006\u0008\u00c7\u0001\u0010\u00c8\u0001J\u001e\u0010\u00c9\u0001\u001a\u00020&*\u00020&2\u0006\u0010)\u001a\u00020uH\u0002\u00a2\u0006\u0006\u0008\u00c9\u0001\u0010\u0083\u0001JH\u0010\u00cb\u0001\u001a\n\u0012\u0005\u0012\u00030\u0092\u00010\u0091\u0001*\u00020&2\u000f\u0010\u00ca\u0001\u001a\n\u0012\u0005\u0012\u00030\u0092\u00010\u0091\u00012\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020b2\u0007\u0010\u0085\u0001\u001a\u00020bH\u0002\u00a2\u0006\u0006\u0008\u00cb\u0001\u0010\u00cc\u0001J%\u0010\u00ce\u0001\u001a\u0011\u0012\u0004\u0012\u00020i\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00cd\u0001*\u00020&H\u0002\u00a2\u0006\u0006\u0008\u00ce\u0001\u0010\u00cf\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d0\u0001\u0010\u00d1\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d2\u0001\u0010\u00d3\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d4\u0001\u0010\u00d5\u0001R\u0016\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d6\u0001\u0010\u00d7\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d8\u0001\u0010\u00d9\u0001R\u0016\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00da\u0001\u0010\u00db\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00dc\u0001\u0010\u00dd\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00de\u0001\u0010\u00df\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e0\u0001\u0010\u00e1\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e2\u0001\u0010\u00e3\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e4\u0001\u0010\u00e5\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e6\u0001\u0010\u00e7\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e8\u0001\u0010\u00e9\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ea\u0001\u0010\u00eb\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ec\u0001\u0010\u00ed\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ee\u0001\u0010\u00ef\u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00c9\u0001\u0010\u00f0\u0001R!\u0010\u00f4\u0001\u001a\u000c\u0012\u0007\u0012\u0005\u0018\u00010\u00f2\u00010\u00f1\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00c7\u0001\u0010\u00f3\u0001\u00a8\u0006\u00f5\u0001"
    }
    d2 = {
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;",
        "",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "Lfu2/d;",
        "editableWorkoutSharedInteractor",
        "Liu2/b;",
        "weightliftingRepository",
        "Lcom/whoop/weightlifting/data/WeightliftingApi;",
        "weightliftingApi",
        "Li92/e;",
        "networkMonitor",
        "Ltr2/n;",
        "logger",
        "Lwm0/a;",
        "scopeCoordinator",
        "Lfu2/i;",
        "strengthTrainerInteractor",
        "Lfi0/a;",
        "baseAnalytics",
        "Lu92/d;",
        "prefsStore",
        "Lin2/d;",
        "dispatcherFactory",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lmi1/d;",
        "hapticsWrapper",
        "Lic/p0;",
        "workManager",
        "Llu2/e;",
        "weightliftingSerializer",
        "Ldt0/e;",
        "processNowApi",
        "Llf1/m;",
        "simplerStrengthExperimentHelper",
        "<init>",
        "(Lzr2/a;Lfu2/d;Liu2/b;Lcom/whoop/weightlifting/data/WeightliftingApi;Li92/e;Ltr2/n;Lwm0/a;Lfu2/i;Lfi0/a;Lu92/d;Lin2/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Lmi1/d;Lic/p0;Llu2/e;Ldt0/e;Llf1/m;)V",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "activeWorkout",
        "Lfu2/a;",
        "action",
        "Lbc3/c0;",
        "activeWorkoutScope",
        "Landroidx/lifecycle/k1;",
        "savedStateHandle",
        "X",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/a;Lbc3/c0;Landroidx/lifecycle/k1;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/weightlifting/data/domain/StrapLocation;",
        "strapLocation",
        "Lcom/whoop/weightlifting/data/domain/StrapLaterality;",
        "strapLaterality",
        "",
        "isQuickStart",
        "x0",
        "(Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;ZLq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;",
        "I",
        "(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;",
        "B",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "k0",
        "i0",
        "y",
        "Ldu2/c;",
        "onScreen",
        "fromIcon",
        "w0",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lbc3/c0;Ldu2/c;Z)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "x",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Z",
        "A",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ldu2/c;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "u0",
        "y0",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lbc3/c0;Ldu2/c;Lq83/d;)Ljava/lang/Object;",
        "z",
        "l0",
        "(Lq83/d;)Ljava/lang/Object;",
        "s",
        "nextSetPosition",
        "H0",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "Lnu2/a;",
        "asyncProcess",
        "v0",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lnu2/a;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "m0",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Landroidx/lifecycle/k1;Lq83/d;)Ljava/lang/Object;",
        "L0",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lq83/d;)Ljava/lang/Object;",
        "Lu02/a;",
        "apiCall",
        "V",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lu02/a;Lq83/d;)Ljava/lang/Object;",
        "n0",
        "z0",
        "",
        "groupIndex",
        "exerciseIndex",
        "Y",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;II)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "Z",
        "Lfu2/a$j;",
        "",
        "analyticsAction",
        "a0",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/a$j;Ljava/lang/String;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "Lfu2/a$x;",
        "K0",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/a$x;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "E0",
        "undoSetPosition",
        "F0",
        "u",
        "G0",
        "Lfu2/b$n;",
        "U",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$n;Lbc3/c0;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "Ll83/a0;",
        "D0",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$n;)V",
        "Lfu2/b$a;",
        "A0",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$a;)V",
        "Lfu2/b$j;",
        "C0",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$j;)V",
        "B0",
        "h0",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$n;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "d0",
        "setIndex",
        "e0",
        "c0",
        "O0",
        "O",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;III)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "W",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;IIILbc3/c0;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "L",
        "R",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;I)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "N",
        "",
        "Ljava/util/UUID;",
        "idsOfSetsToSkip",
        "D",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;",
        "numMillis",
        "q0",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lbc3/c0;Ljava/lang/Integer;)V",
        "t",
        "I0",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "v",
        "exerciseId",
        "j0",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/UUID;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;",
        "completedWorkout",
        "o0",
        "(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;Lq83/d;)Ljava/lang/Object;",
        "p0",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)Ljava/lang/Object;",
        "workoutStartTimeInMillis",
        "serializedWorkout",
        "f0",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)Ljava/lang/Object;",
        "workoutTemplate",
        "N0",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Lq83/d;)Ljava/lang/Object;",
        "serializedWorkoutTemplate",
        "g0",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "w",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;",
        "M",
        "(Landroidx/lifecycle/k1;)V",
        "alsoFailedToUpdateTemplate",
        "isServerError",
        "S",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;ZZLq83/d;)Ljava/lang/Object;",
        "P",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;ZLq83/d;)Ljava/lang/Object;",
        "failureReason",
        "s0",
        "(Ljava/lang/String;)V",
        "M0",
        "previousWorkout",
        "C",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/a;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "t0",
        "(Lfu2/a;)Z",
        "T",
        "Lkotlin/Function2;",
        "Lq83/d;",
        "block",
        "r",
        "(Lc93/m;Lq83/d;)Ljava/lang/Object;",
        "q",
        "origSetIds",
        "K",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;III)Ljava/util/Set;",
        "",
        "J",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Ljava/util/Map;",
        "a",
        "Lzr2/a;",
        "b",
        "Lfu2/d;",
        "c",
        "Liu2/b;",
        "d",
        "Lcom/whoop/weightlifting/data/WeightliftingApi;",
        "e",
        "Li92/e;",
        "f",
        "Ltr2/n;",
        "g",
        "Lwm0/a;",
        "h",
        "Lfu2/i;",
        "i",
        "Lfi0/a;",
        "j",
        "Lu92/d;",
        "k",
        "Lin2/d;",
        "l",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "m",
        "Lmi1/d;",
        "n",
        "Lic/p0;",
        "o",
        "Llu2/e;",
        "p",
        "Ldt0/e;",
        "Llf1/m;",
        "Lec3/p1;",
        "Lbc3/k1;",
        "Lec3/p1;",
        "setTimerHapticsJob",
        "weightlifting_release"
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
.field private final a:Lzr2/a;

.field private final b:Lfu2/d;

.field private final c:Liu2/b;

.field private final d:Lcom/whoop/weightlifting/data/WeightliftingApi;

.field private final e:Li92/e;

.field private final f:Ltr2/n;

.field private final g:Lwm0/a;

.field private final h:Lfu2/i;

.field private final i:Lfi0/a;

.field private final j:Lu92/d;

.field private final k:Lin2/d;

.field private final l:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final m:Lmi1/d;

.field private final n:Lic/p0;

.field private final o:Llu2/e;

.field private final p:Ldt0/e;

.field private final q:Llf1/m;

.field private final r:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lzr2/a;Lfu2/d;Liu2/b;Lcom/whoop/weightlifting/data/WeightliftingApi;Li92/e;Ltr2/n;Lwm0/a;Lfu2/i;Lfi0/a;Lu92/d;Lin2/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Lmi1/d;Lic/p0;Llu2/e;Ldt0/e;Llf1/m;)V
    .locals 16

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

    const-string v0, "dateAndTimeProvider"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editableWorkoutSharedInteractor"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weightliftingRepository"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weightliftingApi"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkMonitor"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeCoordinator"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strengthTrainerInteractor"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "baseAnalytics"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prefsStore"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcherFactory"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hapticsWrapper"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workManager"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weightliftingSerializer"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "processNowApi"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "simplerStrengthExperimentHelper"

    move-object/from16 v15, p17

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    .line 2
    iput-object v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->a:Lzr2/a;

    .line 3
    iput-object v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->b:Lfu2/d;

    .line 4
    iput-object v3, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->c:Liu2/b;

    .line 5
    iput-object v4, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->d:Lcom/whoop/weightlifting/data/WeightliftingApi;

    .line 6
    iput-object v5, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->e:Li92/e;

    .line 7
    iput-object v6, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->f:Ltr2/n;

    .line 8
    iput-object v7, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->g:Lwm0/a;

    .line 9
    iput-object v8, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->h:Lfu2/i;

    .line 10
    iput-object v9, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->i:Lfi0/a;

    .line 11
    iput-object v10, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->j:Lu92/d;

    .line 12
    iput-object v11, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->k:Lin2/d;

    .line 13
    iput-object v12, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->l:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 14
    iput-object v13, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->m:Lmi1/d;

    .line 15
    iput-object v14, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->n:Lic/p0;

    move-object/from16 v1, p15

    .line 16
    iput-object v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->o:Llu2/e;

    move-object/from16 v1, p16

    .line 17
    iput-object v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->p:Ldt0/e;

    .line 18
    iput-object v15, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->q:Llf1/m;

    const/4 v1, 0x0

    .line 19
    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->r:Lec3/p1;

    return-void
.end method

.method public synthetic constructor <init>(Lzr2/a;Lfu2/d;Liu2/b;Lcom/whoop/weightlifting/data/WeightliftingApi;Li92/e;Ltr2/n;Lwm0/a;Lfu2/i;Lfi0/a;Lu92/d;Lin2/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Lmi1/d;Lic/p0;Llu2/e;Ldt0/e;Llf1/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    and-int/lit8 v0, p18, 0x20

    if-eqz v0, :cond_0

    .line 20
    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "ActiveWorkoutInteractor"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    move-object v7, v0

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    goto :goto_1

    :cond_0
    move-object/from16 v7, p6

    goto :goto_0

    .line 21
    :goto_1
    invoke-direct/range {v1 .. v18}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;-><init>(Lzr2/a;Lfu2/d;Liu2/b;Lcom/whoop/weightlifting/data/WeightliftingApi;Li92/e;Ltr2/n;Lwm0/a;Lfu2/i;Lfi0/a;Lu92/d;Lin2/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Lmi1/d;Lic/p0;Llu2/e;Ldt0/e;Llf1/m;)V

    return-void
.end method

.method private final A(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ldu2/c;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 41

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v2

    instance-of v2, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;

    if-eqz v2, :cond_4

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSet()Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    move-result-object v2

    if-nez v2, :cond_1

    goto/16 :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentExercise()Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    move-result-object v3

    if-nez v3, :cond_2

    goto/16 :goto_1

    :cond_2
    iget-object v4, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->i:Lfi0/a;

    invoke-virtual {v3}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getExercise()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getExerciseId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplateId()Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCompletedSetData()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v5

    const/4 v13, 0x1

    add-int/lit8 v8, v5, 0x1

    const/16 v11, 0x20

    const/4 v12, 0x0

    const-string v5, "End Set"

    const/4 v10, 0x0

    move-object/from16 v9, p2

    invoke-static/range {v4 .. v12}, Ldu2/b;->l(Lfi0/a;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILdu2/c;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v4, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->a:Lzr2/a;

    invoke-interface {v4}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v4

    check-cast v4, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;

    invoke-virtual {v4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;->getWasEditedAfterStarting()Z

    move-result v19

    invoke-direct/range {p0 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->u0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v4

    check-cast v4, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;

    invoke-virtual {v4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;->getStartTime()Lorg/joda/time/DateTime;

    move-result-object v4

    invoke-static {v4, v7}, Lorg/joda/time/Seconds;->secondsBetween(Lorg/joda/time/ReadableInstant;Lorg/joda/time/ReadableInstant;)Lorg/joda/time/Seconds;

    move-result-object v4

    new-instance v5, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getNumberOfRepsAsInt()I

    move-result v6

    invoke-virtual {v4}, Lorg/joda/time/Seconds;->getSeconds()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getWeightAsFloat()F

    move-result v8

    invoke-direct {v5, v6, v4, v8}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;-><init>(ILjava/lang/Integer;F)V

    new-instance v20, Lfu2/b$q;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentGroupIndex()I

    move-result v21

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentExerciseIndex()I

    move-result v22

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetIndex()I

    move-result v23

    invoke-virtual {v5}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getTime()Ljava/lang/String;

    move-result-object v24

    const/16 v25, 0x1

    invoke-direct/range {v20 .. v25}, Lfu2/b$q;-><init>(IIILjava/lang/String;Z)V

    move-object/from16 v4, v20

    invoke-direct {v0, v1, v4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->c0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$n;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v4

    move-object/from16 v20, v4

    goto :goto_0

    :cond_3
    move-object/from16 v20, v1

    :goto_0
    new-instance v4, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v12, 0x0

    invoke-direct {v4, v7, v5, v6, v12}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;-><init>(Lorg/joda/time/DateTime;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCompletedSetData()Ljava/util/Map;

    move-result-object v14

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object v2

    move-object v15, v14

    new-instance v14, Lcom/whoop/weightlifting/data/domain/CompletedSetData;

    new-instance v5, Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v6

    check-cast v6, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;

    invoke-virtual {v6}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;->getStartTime()Lorg/joda/time/DateTime;

    move-result-object v6

    const/16 v10, 0xc

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;-><init>(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/data/remote/domain/dto/BoundType;Lcom/whoop/data/remote/domain/dto/BoundType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getExercise()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getTrackable()Z

    move-result v16

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getStrapLocation()Lcom/whoop/weightlifting/data/domain/StrapLocation;

    move-result-object v17

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getStrapLaterality()Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    move-result-object v18

    move-object v1, v15

    move-object v15, v5

    invoke-direct/range {v14 .. v19}, Lcom/whoop/weightlifting/data/domain/CompletedSetData;-><init>(Lcom/whoop/data/remote/domain/dto/DateTimeRange;ZLcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Z)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v3}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v30

    const v39, 0x3fcff

    const/16 v40, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    move-object/from16 v29, v4

    invoke-static/range {v20 .. v40}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->v(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v1

    invoke-static {v0, v1, v12, v13, v12}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->J0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;ILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v1

    :cond_4
    :goto_1
    return-object v1
.end method

.method private final A0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$a;)V
    .locals 6

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2}, Lfu2/b$a;->a()I

    move-result p2

    invoke-static {p2, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-static {p2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->i:Lfi0/a;

    invoke-virtual {p2}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getExercise()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getExerciseId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplateId()Ljava/lang/Long;

    move-result-object p1

    new-instance v2, Ll83/k;

    const-string v3, "workoutId"

    invoke-direct {v2, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance p2, Ll83/k;

    const-string v3, "setNumber"

    invoke-direct {p2, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, p2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v5

    const-string v3, ""

    const-string v4, "Workout Builder"

    const-string v2, "Add Set"

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private final B(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 32

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->i:Lfi0/a;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplateId()Ljava/lang/Long;

    move-result-object v2

    new-instance v3, Ll83/k;

    const-string v4, "workoutId"

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v6

    const-string v2, ""

    const-string v3, "End Workout"

    const-string v4, ""

    const-string v5, "Workout Builder"

    invoke-interface/range {v1 .. v6}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    new-instance v7, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getParentTemplateId()Ljava/lang/Long;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplateId()Ljava/lang/Long;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getOriginalGroups()Ljava/util/List;

    move-result-object v11

    const/16 v13, 0x10

    const/4 v14, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v7 .. v14}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getParentTemplateId()Ljava/lang/Long;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplateId()Ljava/lang/Long;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v12

    const/16 v14, 0x10

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v8 .. v15}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v8, v7}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->hasSameContentAs(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;)Z

    move-result v1

    xor-int/lit8 v10, v1, 0x1

    new-instance v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v1, :cond_1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplateId()Ljava/lang/Long;

    move-result-object v5

    if-eqz v5, :cond_1

    move v5, v4

    goto :goto_0

    :cond_1
    move v5, v3

    :goto_0
    if-nez v1, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplateId()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_2

    move v3, v4

    :cond_2
    invoke-direct {v2, v5, v3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;-><init>(ZZ)V

    move-object/from16 v26, v2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v2

    const/16 v14, 0x77f

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;IIIIIIIZLjava/util/Set;Ljava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v24

    const v30, 0x3afff

    const/16 v31, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object/from16 v11, p1

    invoke-static/range {v11 .. v31}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v1

    return-object v1
.end method

.method private final B0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 7

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->isSimpleStrengthLogging()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->i:Lfi0/a;

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplateId()Ljava/lang/Long;

    move-result-object v0

    new-instance v2, Ll83/k;

    const-string v3, "workoutId"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v6

    const-string v4, ""

    const-string v5, "Workout Builder"

    const-string v2, ""

    const-string v3, "Enter Add Exercise"

    invoke-interface/range {v1 .. v6}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    return-object p1
.end method

.method private final C(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/a;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v4

    instance-of v4, v4, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez v4, :cond_0

    iget-object v4, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->r:Lec3/p1;

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbc3/k1;

    if-eqz v4, :cond_0

    invoke-interface {v4}, Lbc3/k1;->isActive()Z

    move-result v4

    if-ne v4, v5, :cond_0

    iget-object v4, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->r:Lec3/p1;

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbc3/k1;

    if-eqz v4, :cond_0

    invoke-interface {v4, v6}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplate()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-result-object v4

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplate()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-result-object v6

    :cond_1
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->h:Lfu2/i;

    new-instance v5, Lfu2/g$i;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplate()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-result-object v6

    invoke-direct {v5, v6}, Lfu2/g$i;-><init>(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;)V

    invoke-virtual {v4, v5}, Lfu2/i;->j(Lfu2/g;)V

    :cond_2
    invoke-direct {v0, v2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->t0(Lfu2/a;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1, v3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->c:Liu2/b;

    invoke-virtual {v2, v1}, Liu2/b;->D(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)V

    :cond_3
    return-object v1

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_5
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCompletedSetData()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v10

    invoke-static {v9, v10}, Lnu2/d;->b(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;Ljava/util/Set;)Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCompletedSetData()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v11

    invoke-static {v10, v11}, Lnu2/d;->b(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;Ljava/util/Set;)Z

    move-result v10

    if-nez v10, :cond_7

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getPositionInWorkout()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    move-result-object v4

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getPositionInWorkout()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    move-result-object v9

    goto :goto_2

    :cond_9
    move-object v9, v6

    :goto_2
    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getNumSetsLeft()I

    move-result v4

    if-lez v4, :cond_a

    goto :goto_3

    :cond_a
    const/4 v5, 0x0

    :goto_3
    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentExercise()Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    move-result-object v4

    if-eqz v4, :cond_b

    invoke-virtual {v4}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getId()Ljava/util/UUID;

    move-result-object v4

    goto :goto_4

    :cond_b
    move-object v4, v6

    :goto_4
    invoke-static {v7, v8}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getFinishedFinalSet()Z

    move-result v8

    if-eqz v8, :cond_c

    new-instance v8, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v9

    invoke-interface {v9}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;->getStartTime()Lorg/joda/time/DateTime;

    move-result-object v9

    invoke-direct {v8, v9}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;-><init>(Lorg/joda/time/DateTime;)V

    :goto_5
    move-object v10, v8

    goto :goto_6

    :cond_c
    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v8

    goto :goto_5

    :goto_6
    if-eqz v5, :cond_d

    if-eqz v4, :cond_d

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getIdsOfExpandedExercises()Ljava/util/Set;

    move-result-object v5

    invoke-static {v4, v5}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v4

    goto :goto_7

    :cond_d
    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getIdsOfExpandedExercises()Ljava/util/Set;

    move-result-object v4

    :goto_7
    const v20, 0x3fed7

    const/16 v21, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v5, v7

    move-object v7, v4

    const/4 v4, 0x0

    move-object v8, v6

    const/4 v6, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v22, v19

    const/16 v19, 0x0

    move-object/from16 v0, p3

    invoke-static/range {v1 .. v21}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplate()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-result-object v2

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplate()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-result-object v6

    goto :goto_8

    :cond_e
    move-object/from16 v6, v22

    :goto_8
    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    move-object/from16 v2, p0

    iget-object v3, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->h:Lfu2/i;

    new-instance v4, Lfu2/g$i;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplate()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-result-object v5

    invoke-direct {v4, v5}, Lfu2/g$i;-><init>(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;)V

    invoke-virtual {v3, v4}, Lfu2/i;->j(Lfu2/g;)V

    :goto_9
    move-object/from16 v3, p2

    goto :goto_a

    :cond_f
    move-object/from16 v2, p0

    goto :goto_9

    :goto_a
    invoke-direct {v2, v3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->t0(Lfu2/a;)Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-virtual {v1, v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    iget-object v0, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->c:Liu2/b;

    invoke-virtual {v0, v1}, Liu2/b;->D(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)V

    :cond_10
    return-object v1
.end method

.method private final C0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$j;)V
    .locals 7

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2}, Lfu2/b$j;->a()I

    move-result v1

    invoke-static {v1, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->i:Lfi0/a;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getExercise()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getExerciseId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplateId()Ljava/lang/Long;

    move-result-object p1

    new-instance v0, Ll83/k;

    const-string v3, "workoutId"

    invoke-direct {v0, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lfu2/b$j;->b()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance p2, Ll83/k;

    const-string v3, "setNumber"

    invoke-direct {p2, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, p2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v6

    const-string v4, ""

    const-string v5, "Workout Builder"

    const-string v3, "Remove Set"

    invoke-interface/range {v1 .. v6}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private final D(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;)",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getPositionInWorkout()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getFinishedFinalSet()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getPositionInWorkout()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Lkotlin/jvm/internal/e0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentGroupIndex()I

    move-result v1

    iput v1, v0, Lkotlin/jvm/internal/e0;->w:I

    new-instance v1, Lkotlin/jvm/internal/e0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentExerciseIndex()I

    move-result v2

    iput v2, v1, Lkotlin/jvm/internal/e0;->w:I

    new-instance v2, Lkotlin/jvm/internal/e0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetIndex()I

    move-result v3

    iput v3, v2, Lkotlin/jvm/internal/e0;->w:I

    :cond_2
    :goto_0
    invoke-static {v2, v1, p1, v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->H(Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lkotlin/jvm/internal/e0;)Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    iget v3, v1, Lkotlin/jvm/internal/e0;->w:I

    invoke-static {p1, v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->G(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lkotlin/jvm/internal/e0;)Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v4

    if-ne v3, v4, :cond_3

    iget v3, v2, Lkotlin/jvm/internal/e0;->w:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v2, Lkotlin/jvm/internal/e0;->w:I

    :cond_3
    iget v3, v1, Lkotlin/jvm/internal/e0;->w:I

    add-int/lit8 v3, v3, 0x1

    invoke-static {p1, v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->G(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lkotlin/jvm/internal/e0;)Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    rem-int/2addr v3, v4

    iput v3, v1, Lkotlin/jvm/internal/e0;->w:I

    iget v3, v2, Lkotlin/jvm/internal/e0;->w:I

    invoke-static {v1, p1, v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->F(Lkotlin/jvm/internal/e0;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lkotlin/jvm/internal/e0;)Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v4

    if-le v3, v4, :cond_2

    iget v3, v0, Lkotlin/jvm/internal/e0;->w:I

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    rem-int/2addr v3, v4

    iput v3, v0, Lkotlin/jvm/internal/e0;->w:I

    const/4 v3, 0x0

    iput v3, v1, Lkotlin/jvm/internal/e0;->w:I

    iput v3, v2, Lkotlin/jvm/internal/e0;->w:I

    goto :goto_0

    :cond_4
    new-instance p2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    invoke-static {p1, v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->G(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lkotlin/jvm/internal/e0;)Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getId()Ljava/util/UUID;

    move-result-object v3

    invoke-static {v1, p1, v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->F(Lkotlin/jvm/internal/e0;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lkotlin/jvm/internal/e0;)Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getId()Ljava/util/UUID;

    move-result-object v4

    invoke-static {v2, v1, p1, v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->H(Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lkotlin/jvm/internal/e0;)Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object p1

    invoke-direct {p2, v3, v4, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;-><init>(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;)V

    return-object p2
.end method

.method private final D0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$n;)V
    .locals 1

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->isSimpleStrengthLogging()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p2, Lfu2/b$a;

    if-eqz v0, :cond_1

    check-cast p2, Lfu2/b$a;

    invoke-direct {p0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->A0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$a;)V

    return-void

    :cond_1
    instance-of v0, p2, Lfu2/b$j;

    if-eqz v0, :cond_2

    check-cast p2, Lfu2/b$j;

    invoke-direct {p0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->C0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$j;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static synthetic E(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;ILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCompletedSetData()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p2

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->D(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    move-result-object p0

    return-object p0
.end method

.method private final E0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 2

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getLastCompletedSetId()Ljava/util/UUID;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getSetPositionById(Ljava/util/UUID;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lfu2/a$j;

    invoke-direct {v1, v0}, Lfu2/a$j;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;)V

    const-string v0, "Undo Last Completed From Menu"

    invoke-direct {p0, p1, v1, v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->a0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/a$j;Ljava/lang/String;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private static final F(Lkotlin/jvm/internal/e0;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lkotlin/jvm/internal/e0;)Lcom/whoop/weightlifting/data/domain/WorkoutExercise;
    .locals 0

    invoke-static {p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->G(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lkotlin/jvm/internal/e0;)Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object p1

    iget p0, p0, Lkotlin/jvm/internal/e0;->w:I

    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    return-object p0
.end method

.method private final F0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 24

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentDialog()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;

    move-result-object v1

    instance-of v1, v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$d;

    if-nez v1, :cond_1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCompletedSetData()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->getSetId()Ljava/util/UUID;

    move-result-object v2

    invoke-static {v1, v2}, Lm83/s;->J0(Ljava/lang/Iterable;Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iget-object v3, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->i:Lfi0/a;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getLastCompletedSetId()Ljava/util/UUID;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->getSetId()Ljava/util/UUID;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-ne v4, v2, :cond_0

    const-string v2, "Is Last Completed Set"

    :goto_0
    move-object v6, v2

    goto :goto_1

    :cond_0
    const-string v2, ""

    goto :goto_0

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplateId()Ljava/lang/Long;

    move-result-object v2

    new-instance v4, Ll83/k;

    const-string v5, "workoutId"

    invoke-direct {v4, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ll83/k;

    const-string v5, "setNumber"

    invoke-direct {v2, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v2}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v8

    const-string v5, "Uncompleted Set"

    const-string v7, "Workout Builder"

    const-string v4, "Undo Set"

    invoke-interface/range {v3 .. v8}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_2

    :cond_1
    iget-object v9, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->i:Lfi0/a;

    const/16 v16, 0x34

    const/16 v17, 0x0

    const-string v10, "Undo Set"

    const-string v11, "Confirmed Undo"

    const/4 v12, 0x0

    const-string v13, "Workout Builder"

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v9 .. v17}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCompletedSetData()Ljava/util/Map;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->getSetId()Ljava/util/UUID;

    move-result-object v2

    invoke-static {v2, v1}, Lm83/g0;->Z(Ljava/lang/Object;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v1

    instance-of v1, v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;

    if-eqz v1, :cond_2

    new-instance v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v2

    check-cast v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;

    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;->getStartTime()Lorg/joda/time/DateTime;

    move-result-object v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v1, v2, v5, v3, v4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;-><init>(Lorg/joda/time/DateTime;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_3
    move-object v12, v1

    goto :goto_4

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v1

    goto :goto_3

    :goto_4
    const v22, 0x3bc7f

    const/16 v23, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v3, p1

    move-object/from16 v11, p2

    invoke-static/range {v3 .. v23}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v1

    return-object v1
.end method

.method private static final G(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lkotlin/jvm/internal/e0;)Lcom/whoop/weightlifting/data/domain/WorkoutGroup;
    .locals 0

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object p0

    iget p1, p1, Lkotlin/jvm/internal/e0;->w:I

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    return-object p0
.end method

.method private final G0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 35

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->getNumDragAndDrops()I

    move-result v1

    add-int/lit8 v5, v1, 0x1

    const/16 v12, 0x7ef

    const/4 v13, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v0 .. v13}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;IIIIIIIZLjava/util/Set;Ljava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v27

    const v33, 0x3efff

    const/16 v34, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    move-object/from16 v14, p1

    invoke-static/range {v14 .. v34}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v0

    return-object v0
.end method

.method private static final H(Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lkotlin/jvm/internal/e0;)Lcom/whoop/weightlifting/data/domain/WorkoutSet;
    .locals 0

    invoke-static {p1, p2, p3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->F(Lkotlin/jvm/internal/e0;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lkotlin/jvm/internal/e0;)Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object p1

    iget p0, p0, Lkotlin/jvm/internal/e0;->w:I

    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    return-object p0
.end method

.method private final H0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 36

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v0

    invoke-static {v0}, Lnu2/d;->a(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->getNumTimesPlayButtonClicked()I

    move-result v0

    add-int/lit8 v7, v0, 0x1

    const/16 v13, 0x7df

    const/4 v14, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v1 .. v14}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;IIIIIIIZLjava/util/Set;Ljava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v28

    const v34, 0x3ef7f

    const/16 v35, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v15, p1

    move-object/from16 v23, p2

    invoke-static/range {v15 .. v35}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v0

    return-object v0

    :cond_0
    return-object p1
.end method

.method private final I(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;
    .locals 3

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getGroups()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    if-nez v2, :cond_2

    return-object v0

    :cond_2
    new-instance v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getId()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getId()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;-><init>(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;)V

    return-object v0
.end method

.method private final I0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;)",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;"
        }
    .end annotation

    invoke-direct/range {p0 .. p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->D(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    move-result-object v9

    const v20, 0x3ff7f

    const/16 v21, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v21}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v0

    return-object v0
.end method

.method private final J(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Ljava/util/Map;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplateId()Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "workoutId"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ll83/k;

    const-string v3, "workoutName"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->getNumExercisesAddedDuringWorkout()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v3, Ll83/k;

    const-string v4, "numberOfExercisesAdded"

    invoke-direct {v3, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->getNumExercisesRemovedDuringWorkout()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v4, Ll83/k;

    const-string v5, "numberOfExerciseRemoved"

    invoke-direct {v4, v5, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->getNumSetsAddedDuringWorkout()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v5, Ll83/k;

    const-string v6, "numberOfSetsAdded"

    invoke-direct {v5, v6, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->getNumSetsRemovedDuringWorkout()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v6, Ll83/k;

    const-string v7, "numberOfSetsRemoved"

    invoke-direct {v6, v7, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->getNumDragAndDrops()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v7, Ll83/k;

    const-string v8, "numberOfDragAndDrop"

    invoke-direct {v7, v8, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->getNumTimesPlayButtonClicked()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v8, Ll83/k;

    const-string v9, "numberOfTimesPlayButtonWasClicked"

    invoke-direct {v8, v9, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->getNumSetsCancelled()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v9, Ll83/k;

    const-string v10, "numberOfSetsCancelled"

    invoke-direct {v9, v10, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCompletedSetData()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v10, Ll83/k;

    const-string v11, "numberOfSetsCompleted"

    invoke-direct {v10, v11, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getOriginalGroups()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v11, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    invoke-virtual {v12}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getTotalSets()I

    move-result v12

    add-int/2addr v11, v12

    goto :goto_0

    :cond_0
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v11, Ll83/k;

    const-string v12, "numberOfSetsOriginallyPlanned"

    invoke-direct {v11, v12, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->getChangedTemplate()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    new-instance v12, Ll83/k;

    const-string v13, "changedTemplete"

    invoke-direct {v12, v13, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->getSetIdsRepsEditedDuringWorkout()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v13, Ll83/k;

    const-string v14, "numberOfSetsRepsEdited"

    invoke-direct {v13, v14, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->getSetIdsWeightEditedDuringWorkout()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v14, Ll83/k;

    const-string v15, "numberOfSetsWeightEdited"

    invoke-direct {v14, v15, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getRpe()Ljava/lang/Integer;

    move-result-object v0

    new-instance v15, Ll83/k;

    move-object/from16 v16, v1

    const-string v1, "rpe"

    invoke-direct {v15, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getParentTemplateId()Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Ll83/k;

    move-object/from16 v17, v2

    const-string v2, "originId"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v2, v16

    move-object/from16 v16, v1

    move-object v1, v2

    move-object/from16 v2, v17

    filled-new-array/range {v1 .. v16}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->isQuickStart()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "source"

    const-string v2, "quick_start"

    invoke-static {v1, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    goto :goto_1

    :cond_1
    sget-object v1, Lm83/z;->w:Lm83/z;

    :goto_1
    invoke-static {v0, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic J0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;ILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCompletedSetData()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p2

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->I0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p0

    return-object p0
.end method

.method private final K(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;III)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;III)",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object p1

    invoke-static {p3, p1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p4, p1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p5, p1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object p1

    invoke-static {p1, p2}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p2
.end method

.method private final K0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/a$x;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 22

    invoke-virtual/range {p2 .. p2}, Lfu2/a$x;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const v20, 0x3dfff

    const/16 v21, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v21}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v0

    return-object v0
.end method

.method private final L(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 22

    move-object/from16 v1, p1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v0

    instance-of v0, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;

    if-eqz v0, :cond_0

    new-instance v10, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;->getStartTime()Lorg/joda/time/DateTime;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v10, v0, v2, v3, v4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;-><init>(Lorg/joda/time/DateTime;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x1

    move-object/from16 v2, p0

    invoke-static {v2, v1, v4, v0, v4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->E(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;ILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    move-result-object v9

    const v20, 0x3fe7f

    const/16 v21, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v1 .. v21}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v0

    return-object v0

    :cond_0
    return-object p1
.end method

.method private final L0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lq83/d;)V

    invoke-direct {p0, v0, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->r(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final M(Landroidx/lifecycle/k1;)V
    .locals 2

    const-string v0, "workoutCompleted"

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v1, v0}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->c:Liu2/b;

    invoke-virtual {p1}, Liu2/b;->q()V

    return-void
.end method

.method private final M0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            "Lq83/d<",
            "-",
            "Lu02/a<",
            "*>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplateId()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->f:Ltr2/n;

    new-instance v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$o;

    const/4 v0, 0x0

    invoke-direct {v5, p0, p1, v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$o;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lq83/d;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v3, 0x0

    const-string v4, "failed to update workout template edited during session"

    move-object v6, p2

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Required value was null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final N(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, p1, v0, v1, v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->J0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;ILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->u(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    return-object p1
.end method

.method private final N0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getStartTime()Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->o:Llu2/e;

    invoke-virtual {v0, p2}, Llu2/e;->d(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getWorkoutTemplateKey()Ljava/lang/Long;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-direct {p0, p1, v0, p3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->g0(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    iget-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->f:Ltr2/n;

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    const-string p3, "Failed to start UpdatingTemplateInBackgroundWorker because of serializedWorkoutTemplate and/or workoutTemplateKey is null"

    invoke-interface {p1, p3, p2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v1
.end method

.method private final O(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;III)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 23

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v0

    move/from16 v1, p2

    invoke-static {v1, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    move/from16 v1, p3

    invoke-static {v1, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    move/from16 v1, p4

    invoke-static {v1, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCompletedSetData()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/whoop/weightlifting/data/domain/CompletedSetData;

    if-eqz v2, :cond_1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCompletedSetData()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Lm83/g0;->Z(Ljava/lang/Object;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static/range {v2 .. v9}, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->copy$default(Lcom/whoop/weightlifting/data/domain/CompletedSetData;Lcom/whoop/data/remote/domain/dto/DateTimeRange;ZLcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;ZILjava/lang/Object;)Lcom/whoop/weightlifting/data/domain/CompletedSetData;

    move-result-object v2

    new-instance v3, Ll83/k;

    invoke-direct {v3, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v3}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v1

    :goto_0
    move-object v12, v1

    goto :goto_1

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCompletedSetData()Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v1

    instance-of v1, v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;

    if-eqz v1, :cond_3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSet()Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v2

    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;

    const/4 v1, 0x1

    invoke-static {v0, v2, v1, v1, v2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;Lorg/joda/time/DateTime;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;

    move-result-object v0

    :goto_3
    move-object v11, v0

    goto :goto_4

    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v0

    goto :goto_3

    :goto_4
    const v21, 0x3fcff

    const/16 v22, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v22}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v0

    return-object v0

    :cond_4
    :goto_5
    return-object p1
.end method

.method private final O0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$n;Lbc3/c0;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 6

    instance-of v0, p2, Lfu2/b$p;

    if-eqz v0, :cond_0

    check-cast p2, Lfu2/b$p;

    invoke-virtual {p2}, Lfu2/b$p;->b()I

    move-result p3

    invoke-virtual {p2}, Lfu2/b$p;->a()I

    move-result v0

    invoke-virtual {p2}, Lfu2/b$p;->d()I

    move-result p2

    invoke-direct {p0, p1, p3, v0, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->O(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;III)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p2, Lfu2/b$q;

    if-eqz v0, :cond_1

    check-cast p2, Lfu2/b$q;

    invoke-virtual {p2}, Lfu2/b$q;->b()I

    move-result v2

    invoke-virtual {p2}, Lfu2/b$q;->a()I

    move-result v3

    invoke-virtual {p2}, Lfu2/b$q;->d()I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->W(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;IIILbc3/c0;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    return-object p1

    :cond_1
    move-object v0, p0

    move-object v1, p1

    instance-of p1, p2, Lfu2/b$r;

    if-eqz p1, :cond_2

    check-cast p2, Lfu2/b$r;

    invoke-virtual {p2}, Lfu2/b$r;->b()I

    move-result p1

    invoke-virtual {p2}, Lfu2/b$r;->a()I

    move-result p3

    invoke-virtual {p2}, Lfu2/b$r;->d()I

    move-result p2

    invoke-direct {p0, v1, p1, p3, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->O(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;III)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, p2, Lfu2/b$a;

    if-eqz p1, :cond_3

    invoke-direct {p0, v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->L(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of p1, p2, Lfu2/b$j;

    if-eqz p1, :cond_4

    check-cast p2, Lfu2/b$j;

    invoke-virtual {p2}, Lfu2/b$j;->a()I

    move-result p1

    invoke-direct {p0, v1, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->R(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;I)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, p2, Lfu2/b$d;

    if-eqz p1, :cond_5

    invoke-direct {p0, v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->N(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    return-object p1

    :cond_5
    return-object v1
.end method

.method private final P(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;ZLq83/d;)Ljava/lang/Object;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;",
            "Landroidx/lifecycle/k1;",
            "Z",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p5

    instance-of v3, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;

    iget v4, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;->G:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;->G:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;

    invoke-direct {v3, v0, v2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;->E:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;->G:I

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v5, :cond_3

    if-eq v5, v8, :cond_2

    if-ne v5, v7, :cond_1

    iget-object v1, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/k1;

    iget-object v4, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;->x:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    iget-object v3, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;->w:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-boolean v1, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;->z:Z

    iget-object v5, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;->y:Ljava/lang/Object;

    check-cast v5, Landroidx/lifecycle/k1;

    iget-object v8, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;->x:Ljava/lang/Object;

    check-cast v8, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    iget-object v8, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;->w:Ljava/lang/Object;

    check-cast v8, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, v5

    move v5, v1

    move-object v1, v8

    goto :goto_1

    :cond_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object v1, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;->w:Ljava/lang/Object;

    iput-object v6, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;->x:Ljava/lang/Object;

    move-object/from16 v2, p3

    iput-object v2, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;->y:Ljava/lang/Object;

    move/from16 v5, p4

    iput-boolean v5, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;->z:Z

    iput v8, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;->G:I

    move-object/from16 v8, p2

    invoke-direct {v0, v1, v8, v3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->p0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v4, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    if-eqz v5, :cond_6

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplate()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-result-object v8

    iput-object v1, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;->w:Ljava/lang/Object;

    iput-object v6, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;->x:Ljava/lang/Object;

    iput-object v2, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;->y:Ljava/lang/Object;

    iput-boolean v5, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;->z:Z

    iput v7, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$a;->G:I

    invoke-direct {v0, v1, v8, v3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->N0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_5

    :goto_2
    return-object v4

    :cond_5
    move-object v3, v1

    move-object v1, v2

    :goto_3
    move-object v2, v1

    move-object v4, v3

    goto :goto_4

    :cond_6
    move-object v4, v1

    :goto_4
    invoke-direct {v0, v2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->M(Landroidx/lifecycle/k1;)V

    sget-object v19, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$a$e;->a:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$a$e;

    const v23, 0x3bfff

    const/16 v24, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v4 .. v24}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v1

    return-object v1
.end method

.method public static synthetic Q(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;ZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    const/4 p4, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->P(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final R(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;I)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 25

    move/from16 v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x1

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-static {v3, v4, v1, v2, v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->E(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;ILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    move-result-object v12

    invoke-virtual {v4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    if-eqz v1, :cond_1

    invoke-virtual {v4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCompletedSetData()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-static {v1, v5}, Lnu2/d;->b(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;Ljava/util/Set;)Z

    move-result v1

    if-ne v1, v2, :cond_1

    invoke-virtual {v4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getIdsOfExpandedExercises()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v0, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    invoke-virtual {v5}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getId()Ljava/util/UUID;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v1, v0}, Ldt/b;->z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    :goto_1
    move-object v10, v0

    goto :goto_2

    :cond_1
    invoke-virtual {v4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getIdsOfExpandedExercises()Ljava/util/Set;

    move-result-object v0

    goto :goto_1

    :goto_2
    const v23, 0x3ff5f

    const/16 v24, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v4 .. v24}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v0

    return-object v0
.end method

.method private final S(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;ZZLq83/d;)Ljava/lang/Object;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;",
            "Landroidx/lifecycle/k1;",
            "ZZ",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p5, :cond_0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->P(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;ZLq83/d;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_0
    new-instance v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$a$a$a;

    move/from16 v4, p4

    invoke-direct {v0, v4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$a$a$a;-><init>(Z)V

    const v21, 0x3bfff

    const/16 v22, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v2, p1

    move-object/from16 v17, v0

    invoke-static/range {v2 .. v22}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic T(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;ZZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    and-int/lit8 p8, p7, 0x4

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move p4, v0

    :cond_0
    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_1

    move p5, v0

    :cond_1
    invoke-direct/range {p0 .. p6}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->S(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;ZZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final U(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$n;Lbc3/c0;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->D0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$n;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->q(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$n;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->h0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$n;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->c0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$n;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->O0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$n;Lbc3/c0;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    return-object p1
.end method

.method private final V(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lu02/a;Lq83/d;)Ljava/lang/Object;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            "Lu02/a<",
            "*>;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    instance-of v3, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$b;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$b;

    iget v4, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$b;->E:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$b;->E:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$b;

    invoke-direct {v3, v0, v2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$b;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$b;->y:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$b;->E:I

    const/4 v6, 0x1

    if-eqz v5, :cond_3

    if-ne v5, v6, :cond_2

    iget-object v1, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$b;->x:Ljava/lang/Object;

    check-cast v1, Lu02/a;

    iget-object v1, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$b;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_1
    move-object v5, v1

    goto/16 :goto_2

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v2, v1, Lu02/a$c;

    if-eqz v2, :cond_4

    sget-object v16, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$a$c;->a:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$a$c;

    const v20, 0x3bfff

    const/16 v21, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v21}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v1

    return-object v1

    :cond_4
    instance-of v2, v1, Lu02/a$b$b;

    if-nez v2, :cond_5

    instance-of v2, v1, Lu02/a$b$a;

    if-eqz v2, :cond_6

    check-cast v1, Lu02/a$b$a;

    invoke-static {v1}, Lu02/b;->c(Lu02/a$b$a;)Z

    move-result v1

    if-eqz v1, :cond_6

    :cond_5
    move-object/from16 v1, p1

    goto :goto_1

    :cond_6
    sget-object v16, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$a$b;->a:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$a$b;

    const v20, 0x3bfff

    const/16 v21, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v21}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v1

    return-object v1

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplate()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-result-object v2

    iput-object v1, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$b;->w:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$b;->x:Ljava/lang/Object;

    iput v6, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$b;->E:I

    invoke-direct {v0, v1, v2, v3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->N0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_1

    return-object v4

    :goto_2
    sget-object v20, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$a$f;->a:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$a$f;

    const v24, 0x3bfff

    const/16 v25, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v5 .. v25}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v1

    return-object v1
.end method

.method private final W(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;IIILbc3/c0;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 2

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v0

    invoke-static {p2, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-static {p3, p2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-static {p4, p2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSet()Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    move-result-object p3

    if-nez p3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p3}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object p4

    invoke-virtual {p2, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object p2

    instance-of p2, p2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;

    if-eqz p2, :cond_4

    invoke-virtual {p3}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getTimeAsIntSeconds()Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    mul-int/lit16 p2, p2, 0x3e8

    goto :goto_0

    :cond_2
    const/high16 p2, -0x80000000

    :goto_0
    iget-object p3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->a:Lzr2/a;

    invoke-interface {p3}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object p3

    invoke-virtual {p3}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide p3

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;->getStartTime()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v0

    sub-long/2addr p3, v0

    int-to-long v0, p2

    cmp-long v0, p3, v0

    if-gez v0, :cond_3

    long-to-int p3, p3

    sub-int/2addr p2, p3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p0, p1, p5, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->q0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lbc3/c0;Ljava/lang/Integer;)V

    return-object p1

    :cond_3
    iget-object p2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->r:Lec3/p1;

    check-cast p2, Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lbc3/k1;

    if-eqz p2, :cond_4

    const/4 p3, 0x0

    invoke-interface {p2, p3}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_4
    :goto_1
    return-object p1
.end method

.method private final Y(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;II)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 22

    new-instance v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$a;

    move/from16 v1, p2

    move/from16 v2, p3

    invoke-direct {v0, v1, v2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$a;-><init>(II)V

    const v20, 0x3bfff

    const/16 v21, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v1, p1

    move-object/from16 v16, v0

    invoke-static/range {v1 .. v21}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v0

    return-object v0
.end method

.method private final Z(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 22

    sget-object v16, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$b;->a:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$b;

    const v20, 0x3bfff

    const/16 v21, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v21}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic a(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->w(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    move-result-object p0

    return-object p0
.end method

.method private final a0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/a$j;Ljava/lang/String;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 26

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->l:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "st-undo-sets-android"

    invoke-interface {v1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v1

    instance-of v1, v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;

    if-nez v1, :cond_0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v1

    instance-of v1, v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;

    if-eqz v1, :cond_2

    :cond_0
    iget-object v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->i:Lfi0/a;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getLastCompletedSetId()Ljava/util/UUID;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual/range {p2 .. p2}, Lfu2/a$j;->a()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->getSetId()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    const-string v2, "Is Last Completed Set"

    goto :goto_0

    :cond_1
    const-string v2, ""

    :goto_0
    const-string v3, "Undo Set"

    const-string v4, "Workout Builder"

    move-object/from16 v5, p3

    invoke-interface {v1, v3, v5, v2, v4}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$d;

    invoke-virtual/range {p2 .. p2}, Lfu2/a$j;->a()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$d;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;)V

    const v24, 0x3bfff

    const/16 v25, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v5, p1

    move-object/from16 v20, v1

    invoke-static/range {v5 .. v25}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v1

    return-object v1

    :cond_2
    return-object p1
.end method

.method public static final synthetic b(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;)Li92/e;
    .locals 0

    iget-object p0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->e:Li92/e;

    return-object p0
.end method

.method public static synthetic b0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/a$j;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const-string p3, "Tapped on Icon"

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->a0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/a$j;Ljava/lang/String;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;)Lu92/d;
    .locals 0

    iget-object p0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->j:Lu92/d;

    return-object p0
.end method

.method private final c0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$n;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 23

    new-instance v0, Lfu2/c;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getIdsOfExpandedExercises()Ljava/util/Set;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getManuallyEditedSetIds()Ljava/util/Set;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCompletedSetData()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lfu2/c;-><init>(Ljava/util/List;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)V

    move-object/from16 v1, p0

    iget-object v2, v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->b:Lfu2/d;

    move-object/from16 v3, p2

    invoke-virtual {v2, v0, v3}, Lfu2/d;->t(Lfu2/c;Lfu2/b$n;)Lfu2/c;

    move-result-object v0

    invoke-virtual {v0}, Lfu2/c;->f()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v0}, Lfu2/c;->g()Ljava/util/Set;

    move-result-object v8

    invoke-virtual {v0}, Lfu2/c;->h()Ljava/util/Set;

    move-result-object v19

    const v21, 0x2ffd7

    const/16 v22, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v22}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic d(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;)Ldt0/e;
    .locals 0

    iget-object p0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->p:Ldt0/e;

    return-object p0
.end method

.method private final d0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;II)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 2

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v0

    invoke-static {p2, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-static {p3, p2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSet()Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    move-result-object p3

    if-nez p3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_2

    goto :goto_1

    :cond_2
    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->t(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    invoke-virtual {p2}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p3, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p3

    invoke-direct {p0, p1, p3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->I0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    invoke-virtual {p2}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getId()Ljava/util/UUID;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->j0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/UUID;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    :cond_4
    :goto_1
    return-object p1
.end method

.method public static final synthetic e(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;)Lcom/whoop/weightlifting/data/WeightliftingApi;
    .locals 0

    iget-object p0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->d:Lcom/whoop/weightlifting/data/WeightliftingApi;

    return-object p0
.end method

.method private final e0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;II)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 2

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v0

    invoke-static {p2, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_5

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v1

    invoke-static {p3, v1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSet()Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    move-result-object p2

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    goto :goto_2

    :cond_3
    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->t(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    const/16 p3, 0xa

    invoke-static {v0, p3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->I0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    :cond_5
    :goto_2
    return-object p1
.end method

.method public static final synthetic f(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;)Lic/p0;
    .locals 0

    iget-object p0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->n:Lic/p0;

    return-object p0
.end method

.method private final f0(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->k:Lin2/d;

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;

    const/4 v6, 0x0

    move-object v3, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;-><init>(Ljava/lang/String;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)V

    invoke-static {v0, v1, p4}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public static final synthetic g(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;ZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->P(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final g0(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
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

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->k:Lin2/d;

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$e;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, p2, v2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$e;-><init>(Ljava/lang/String;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Ljava/lang/String;Lq83/d;)V

    invoke-static {v0, v1, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public static final synthetic h(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;ZZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->S(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;ZZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final h0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$n;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 1

    instance-of v0, p2, Lfu2/b$d;

    if-eqz v0, :cond_0

    check-cast p2, Lfu2/b$d;

    invoke-virtual {p2}, Lfu2/b$d;->b()I

    move-result v0

    invoke-virtual {p2}, Lfu2/b$d;->a()I

    move-result p2

    invoke-direct {p0, p1, v0, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->d0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;II)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p2, Lfu2/b$j;

    if-eqz v0, :cond_1

    check-cast p2, Lfu2/b$j;

    invoke-virtual {p2}, Lfu2/b$j;->a()I

    move-result v0

    invoke-virtual {p2}, Lfu2/b$j;->b()I

    move-result p2

    invoke-direct {p0, p1, v0, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->e0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;II)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public static final synthetic i(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lu02/a;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->V(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lu02/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final i0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 48

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->h:Lfu2/i;

    invoke-virtual {v1}, Lfu2/i;->h()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getWorkoutTemplateKey()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplate()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getWorkoutTemplateKey()Ljava/lang/Long;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplate()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getAllExerciseIds()Ljava/util/Set;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplate()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getAllExerciseIds()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v2, v3}, Ldt/b;->z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v3

    instance-of v3, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    move v3, v5

    goto :goto_0

    :cond_1
    move v3, v4

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getGroups()Ljava/util/List;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getIdsOfExpandedExercises()Ljava/util/Set;

    move-result-object v6

    move-object v7, v2

    check-cast v7, Ljava/lang/Iterable;

    invoke-static {v6, v7}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v12

    const/4 v6, 0x0

    if-eqz v3, :cond_2

    new-instance v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v8

    check-cast v8, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;

    invoke-virtual {v8}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;->getStartTime()Lorg/joda/time/DateTime;

    move-result-object v8

    const/4 v9, 0x2

    invoke-direct {v7, v8, v4, v9, v6}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;-><init>(Lorg/joda/time/DateTime;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    move-object v15, v7

    goto :goto_2

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v7

    goto :goto_1

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v16

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->getNumExercisesAddedDuringWorkout()I

    move-result v4

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v2

    add-int v17, v2, v4

    const/16 v28, 0x7fe

    const/16 v29, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v16 .. v29}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;IIIIIIIZLjava/util/Set;Ljava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v19

    const v25, 0x3eed7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object v2, v6

    move-object/from16 v6, p1

    invoke-static/range {v6 .. v26}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getPositionInWorkout()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    move-result-object v6

    if-nez v6, :cond_3

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->I(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    move-result-object v1

    :goto_3
    move-object/from16 v35, v1

    goto :goto_4

    :cond_3
    if-eqz v3, :cond_4

    invoke-static {v0, v4, v2, v5, v2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->E(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;ILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    move-result-object v1

    goto :goto_3

    :cond_4
    invoke-virtual {v4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getPositionInWorkout()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    move-result-object v1

    goto :goto_3

    :goto_4
    const v46, 0x3ff7f

    const/16 v47, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    move-object/from16 v27, v4

    invoke-static/range {v27 .. v47}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v1

    return-object v1

    :cond_5
    :goto_5
    return-object p1
.end method

.method public static final synthetic j(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->l0(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final j0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/UUID;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 22

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getIdsOfExpandedExercises()Ljava/util/Set;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Ldt/b;->y(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v7

    const v20, 0x3ffdf

    const/16 v21, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v21}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic k(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->o0(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final k0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 3

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->c:Liu2/b;

    invoke-virtual {p1}, Liu2/b;->t()Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;->getLastSavedActiveWorkout()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->f:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "RestoreWorkout called but no saved active workout is available"

    invoke-interface {p1, v2, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v0

    :cond_2
    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->t(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    return-object p1
.end method

.method public static final synthetic l(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->p0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final l0(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->m:Lmi1/d;

    invoke-virtual {v0, p1}, Lmi1/d;->f(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public static final synthetic m(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->s0(Ljava/lang/String;)V

    return-void
.end method

.method private final m0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Landroidx/lifecycle/k1;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            "Landroidx/lifecycle/k1;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Landroidx/lifecycle/k1;Lq83/d;)V

    invoke-direct {p0, v0, p3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->r(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public static final synthetic n(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;ZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->x0(Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final n0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Landroidx/lifecycle/k1;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            "Landroidx/lifecycle/k1;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Landroidx/lifecycle/k1;Lq83/d;)V

    invoke-direct {p0, v0, p3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->r(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public static final synthetic o(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lbc3/c0;Ldu2/c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->y0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lbc3/c0;Ldu2/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final o0(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;",
            "Landroidx/lifecycle/k1;",
            "Lq83/d<",
            "-",
            "Lu02/a<",
            "*>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$h;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$h;

    iget v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$h;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$h;->H:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$h;

    invoke-direct {v0, p0, p3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$h;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$h;->F:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$h;->H:I

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v10, :cond_2

    if-ne v1, v9, :cond_1

    iget-object p1, v6, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$h;->z:Ljava/lang/Object;

    check-cast p1, Lu02/a;

    iget-object p1, v6, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$h;->y:Ljava/lang/Object;

    iget-object p2, v6, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$h;->x:Ljava/lang/Object;

    check-cast p2, Landroidx/lifecycle/k1;

    iget-object v0, v6, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$h;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v6, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$h;->x:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Landroidx/lifecycle/k1;

    iget-object p1, v6, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$h;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->f:Ltr2/n;

    new-instance v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$i;

    invoke-direct {v5, p0, p1, v11}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$i;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)V

    iput-object v11, v6, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$h;->w:Ljava/lang/Object;

    iput-object p2, v6, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$h;->x:Ljava/lang/Object;

    iput v10, v6, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$h;->H:I

    const/4 v3, 0x0

    const-string v4, "failed to save weightlifting workout"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    move-object p1, p3

    check-cast p1, Lu02/a;

    instance-of v1, p1, Lu02/a$c;

    if-eqz v1, :cond_6

    iget-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->j:Lu92/d;

    const-string v1, "START_ACTIVITY_COMPLETED"

    invoke-virtual {p1, v1, v10}, Lu92/d;->q(Ljava/lang/String;Z)V

    iget-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->g:Lwm0/a;

    iput-object v11, v6, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$h;->w:Ljava/lang/Object;

    iput-object p2, v6, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$h;->x:Ljava/lang/Object;

    iput-object p3, v6, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$h;->y:Ljava/lang/Object;

    iput-object v11, v6, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$h;->z:Ljava/lang/Object;

    const/4 v1, 0x0

    iput v1, v6, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$h;->E:I

    iput v9, v6, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$h;->H:I

    invoke-static {p1, v11, v6, v10, v11}, Lwm0/a;->c(Lwm0/a;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_3
    return-object v0

    :cond_5
    move-object p1, p3

    :goto_4
    invoke-direct {p0, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->M(Landroidx/lifecycle/k1;)V

    return-object p1

    :cond_6
    instance-of p2, p1, Lu02/a$b$b;

    if-eqz p2, :cond_7

    const-string p1, "Timeout"

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->s0(Ljava/lang/String;)V

    return-object p3

    :cond_7
    instance-of p2, p1, Lu02/a$b$a;

    if-eqz p2, :cond_8

    check-cast p1, Lu02/a$b$a;

    invoke-virtual {p1}, Lu02/a$b$a;->d()I

    move-result p1

    const-string p2, "error "

    invoke-static {p1, p2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->s0(Ljava/lang/String;)V

    return-object p3

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public static final synthetic p(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->M0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final p0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;

    iget v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;

    invoke-direct {v0, p0, p3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;->G:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;->E:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;->z:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;->x:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getStartTime()Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    iget-object p3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->o:Llu2/e;

    invoke-virtual {p3, p2}, Llu2/e;->c(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;)Ljava/lang/String;

    move-result-object p3

    const/4 v2, 0x0

    if-eqz p3, :cond_3

    const/4 v4, 0x0

    iput-object v4, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;->w:Ljava/lang/Object;

    iput-object v4, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;->x:Ljava/lang/Object;

    iput-object v4, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;->y:Ljava/lang/Object;

    iput-object v4, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;->z:Ljava/lang/Object;

    iput-object v4, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;->E:Ljava/lang/Object;

    iput v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;->F:I

    iput v3, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;->I:I

    invoke-direct {p0, p1, p3, p2, v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->f0(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_3
    iget-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->f:Ltr2/n;

    const-string p2, "Failed to start SavingWorkoutInBackgroundWorker because of serializedWorkout being null"

    new-array p3, v2, [Lqr2/a$a;

    invoke-interface {p1, p2, p3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_4
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final q(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$n;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 33

    move-object/from16 v0, p2

    instance-of v1, v0, Lfu2/b$a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->getNumSetsAddedDuringWorkout()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v5

    check-cast v0, Lfu2/b$a;

    invoke-virtual {v0}, Lfu2/b$a;->a()I

    move-result v6

    invoke-static {v6, v5}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    :cond_0
    add-int v7, v1, v2

    const/16 v16, 0x7fb

    const/16 v17, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v4 .. v17}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;IIIIIIIZLjava/util/Set;Ljava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0}, Lfu2/b$a;->a()I

    move-result v0

    invoke-static {v0, v2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    move-object v3, v1

    :cond_1
    if-nez v3, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v3

    :cond_2
    :goto_0
    move-object/from16 v25, v3

    goto/16 :goto_3

    :cond_3
    instance-of v1, v0, Lfu2/b$d;

    if-eqz v1, :cond_6

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->getNumExercisesRemovedDuringWorkout()I

    move-result v1

    add-int/lit8 v6, v1, 0x1

    const/16 v16, 0x7fd

    const/16 v17, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v4 .. v17}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;IIIIIIIZLjava/util/Set;Ljava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v2

    check-cast v0, Lfu2/b$d;

    invoke-virtual {v0}, Lfu2/b$d;->b()I

    move-result v4

    invoke-static {v4, v2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v0}, Lfu2/b$d;->a()I

    move-result v0

    invoke-static {v0, v2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    goto :goto_1

    :cond_4
    move-object v0, v3

    :goto_1
    if-eqz v0, :cond_5

    move-object v3, v1

    :cond_5
    if-nez v3, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v3

    goto :goto_0

    :cond_6
    instance-of v1, v0, Lfu2/b$j;

    if-eqz v1, :cond_a

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->getNumSetsRemovedDuringWorkout()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v5

    check-cast v0, Lfu2/b$j;

    invoke-virtual {v0}, Lfu2/b$j;->a()I

    move-result v6

    invoke-static {v6, v5}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    :cond_7
    add-int v8, v1, v2

    const/16 v16, 0x7f7

    const/16 v17, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v4 .. v17}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;IIIIIIIZLjava/util/Set;Ljava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0}, Lfu2/b$j;->a()I

    move-result v4

    invoke-static {v4, v2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-static {v2}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v0}, Lfu2/b$j;->b()I

    move-result v0

    invoke-static {v0, v2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    goto :goto_2

    :cond_8
    move-object v0, v3

    :goto_2
    if-eqz v0, :cond_9

    move-object v3, v1

    :cond_9
    if-nez v3, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v3

    goto/16 :goto_0

    :cond_a
    instance-of v1, v0, Lfu2/b$p;

    if-eqz v1, :cond_b

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->getSetIdsRepsEditedDuringWorkout()Ljava/util/Set;

    move-result-object v5

    check-cast v0, Lfu2/b$p;

    invoke-virtual {v0}, Lfu2/b$p;->b()I

    move-result v6

    invoke-virtual {v0}, Lfu2/b$p;->a()I

    move-result v7

    invoke-virtual {v0}, Lfu2/b$p;->d()I

    move-result v8

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct/range {v3 .. v8}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->K(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;III)Ljava/util/Set;

    move-result-object v11

    const/16 v14, 0x6ff

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;IIIIIIIZLjava/util/Set;Ljava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v3

    goto/16 :goto_0

    :cond_b
    instance-of v1, v0, Lfu2/b$q;

    if-eqz v1, :cond_c

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->getSetIdsRepsEditedDuringWorkout()Ljava/util/Set;

    move-result-object v5

    check-cast v0, Lfu2/b$q;

    invoke-virtual {v0}, Lfu2/b$q;->b()I

    move-result v6

    invoke-virtual {v0}, Lfu2/b$q;->a()I

    move-result v7

    invoke-virtual {v0}, Lfu2/b$q;->d()I

    move-result v8

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct/range {v3 .. v8}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->K(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;III)Ljava/util/Set;

    move-result-object v11

    const/16 v14, 0x6ff

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;IIIIIIIZLjava/util/Set;Ljava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v3

    goto/16 :goto_0

    :cond_c
    instance-of v1, v0, Lfu2/b$r;

    if-eqz v1, :cond_d

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->getSetIdsWeightEditedDuringWorkout()Ljava/util/Set;

    move-result-object v5

    check-cast v0, Lfu2/b$r;

    invoke-virtual {v0}, Lfu2/b$r;->b()I

    move-result v6

    invoke-virtual {v0}, Lfu2/b$r;->a()I

    move-result v7

    invoke-virtual {v0}, Lfu2/b$r;->d()I

    move-result v8

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct/range {v3 .. v8}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->K(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;III)Ljava/util/Set;

    move-result-object v12

    const/16 v14, 0x5ff

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;IIIIIIIZLjava/util/Set;Ljava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v3

    goto/16 :goto_0

    :cond_d
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v3

    goto/16 :goto_0

    :goto_3
    const v31, 0x3efff

    const/16 v32, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v12, p1

    invoke-static/range {v12 .. v32}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v0

    return-object v0
.end method

.method private final q0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lbc3/c0;Ljava/lang/Integer;)V
    .locals 6

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->r:Lec3/p1;

    new-instance v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;

    const/4 p1, 0x0

    invoke-direct {v3, p3, p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;-><init>(Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lq83/d;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lor2/m0;->b(Lbc3/c0;Lec3/p1;Lq83/j;Lc93/m;ILjava/lang/Object;)V

    return-void
.end method

.method private final r(Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lc93/m;",
            "Lq83/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-wide/16 v0, 0x5dc

    invoke-static {v0, v1, p1, p2}, Lor2/p0;->a(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic r0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lbc3/c0;Ljava/lang/Integer;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSet()Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getTimeAsIntSeconds()Ljava/lang/Integer;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    mul-int/lit16 p3, p3, 0x3e8

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :cond_1
    :goto_0
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->q0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lbc3/c0;Ljava/lang/Integer;)V

    return-void
.end method

.method private final s(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 32

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->i:Lfi0/a;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplateId()Ljava/lang/Long;

    move-result-object v2

    new-instance v3, Ll83/k;

    const-string v4, "workoutId"

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCompletedSetData()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    const/4 v7, 0x1

    add-int/2addr v2, v7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v4, Ll83/k;

    const-string v5, "setNumber"

    invoke-direct {v4, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v4}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v6

    const-string v2, "Leave Set"

    const-string v3, "Pause Workout"

    const-string v4, ""

    const-string v5, "Workout Builder"

    invoke-interface/range {v1 .. v6}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCompletedSetData()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;

    iget-object v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->a:Lzr2/a;

    invoke-interface {v2}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;-><init>(Lorg/joda/time/DateTime;)V

    :goto_0
    move-object/from16 v17, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;

    iget-object v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->a:Lzr2/a;

    invoke-interface {v2}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object v2

    invoke-direct {v1, v2, v7}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;-><init>(Lorg/joda/time/DateTime;Z)V

    goto :goto_0

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v18

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->getNumSetsCancelled()I

    move-result v1

    add-int/lit8 v25, v1, 0x1

    const/16 v30, 0x7bf

    const/16 v31, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-static/range {v18 .. v31}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;IIIIIIIZLjava/util/Set;Ljava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object v21

    const v27, 0x3eeff

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v8, p1

    invoke-static/range {v8 .. v28}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v1

    return-object v1
.end method

.method private final s0(Ljava/lang/String;)V
    .locals 9

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->i:Lfi0/a;

    const-string v1, "failureReason"

    invoke-static {v1, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const/16 v7, 0x14

    const/4 v8, 0x0

    const-string v1, "Save Workout"

    const-string v2, "Failed"

    const/4 v3, 0x0

    const-string v4, "Workout Builder"

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method private final t(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 1

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v0

    instance-of v0, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->s(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private final t0(Lfu2/a;)Z
    .locals 2

    instance-of v0, p1, Lfu2/a$e;

    if-nez v0, :cond_1

    instance-of v0, p1, Lfu2/a$d;

    if-nez v0, :cond_1

    instance-of v0, p1, Lfu2/a$r;

    if-nez v0, :cond_1

    instance-of v0, p1, Lfu2/a$k;

    if-nez v0, :cond_1

    instance-of v0, p1, Lfu2/b$n;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->l:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "strengthtrainer-interactive-workout-notification"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    instance-of p1, p1, Lfu2/a$q;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private final u(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 26

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentDialog()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;

    move-result-object v0

    instance-of v0, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$b;

    if-eqz v0, :cond_0

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->i:Lfi0/a;

    const-string v2, "Discard Workout - Cancel"

    const-string v3, "Workout Builder"

    const-string v4, ""

    invoke-interface {v1, v4, v2, v4, v3}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object/from16 v0, p0

    :goto_0
    const v24, 0x39fff

    const/16 v25, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v5, p1

    invoke-static/range {v5 .. v25}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v1

    return-object v1
.end method

.method private final u0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Z
    .locals 3

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentExercise()Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSet()Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    move-result-object p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getExercise()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getVolumeInputFormat()Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    move-result-object v0

    sget-object v2, Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;->Time:Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    if-ne v0, v2, :cond_2

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getTimeAsIntSeconds()Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method private final v(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 23

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentExercise()Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    instance-of v2, v1, Ljava/util/Collection;

    if-eqz v2, :cond_1

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCompletedSetData()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :goto_0
    return-object p1

    :cond_3
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getIdsOfExpandedExercises()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getId()Ljava/util/UUID;

    move-result-object v0

    invoke-static {v0, v1}, Ldt/b;->y(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v8

    const v21, 0x3ffdf

    const/16 v22, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v22}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v0

    return-object v0
.end method

.method private final v0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lnu2/a;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 22

    new-instance v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$a$d;

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$a$d;-><init>(Lnu2/a;)V

    const v20, 0x3bfff

    const/16 v21, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v1, p1

    move-object/from16 v16, v0

    invoke-static/range {v1 .. v21}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v0

    return-object v0
.end method

.method private final w(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;
    .locals 9

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->i:Lfi0/a;

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->J(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Ljava/util/Map;

    move-result-object v6

    const/16 v7, 0x14

    const/4 v8, 0x0

    const-string v1, "Save Workout"

    const-string v2, "End Workout"

    const/4 v3, 0x0

    const-string v4, "Workout Builder"

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->a:Lzr2/a;

    invoke-interface {v0}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->toCompletedWeightliftingWorkout(Lorg/joda/time/DateTime;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutKt;->toDto(Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    move-result-object p1

    return-object p1
.end method

.method private final w0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lbc3/c0;Ldu2/c;Z)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 22

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v1

    instance-of v1, v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;

    if-nez v1, :cond_3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    iget-object v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->i:Lfi0/a;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplateId()Ljava/lang/Long;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCompletedSetData()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    add-int/lit8 v6, v1, 0x1

    if-eqz p4, :cond_1

    const-string v1, "From Triangle"

    :goto_0
    move-object v8, v1

    goto :goto_1

    :cond_1
    const-string v1, ""

    goto :goto_0

    :goto_1
    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v3, "Start Set"

    const/4 v5, 0x0

    move-object/from16 v7, p3

    invoke-static/range {v2 .. v10}, Ldu2/b;->l(Lfi0/a;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILdu2/c;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-direct/range {p0 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->x(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-static/range {v0 .. v5}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->r0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lbc3/c0;Ljava/lang/Integer;ILjava/lang/Object;)V

    :cond_2
    new-instance v10, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;

    iget-object v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->a:Lzr2/a;

    invoke-interface {v1}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v10, v1, v4, v2, v3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;-><init>(Lorg/joda/time/DateTime;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v20, 0x3feff

    const/16 v21, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v21}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v1

    return-object v1

    :cond_3
    :goto_2
    return-object p1
.end method

.method private final x(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Z
    .locals 3

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentExercise()Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSet()Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    move-result-object p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getExercise()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getVolumeInputFormat()Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    move-result-object v0

    sget-object v2, Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;->Time:Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    if-ne v0, v2, :cond_2

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getTimeAsIntSeconds()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    if-lez p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method private final x0(Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;ZLq83/d;)Ljava/lang/Object;
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/data/domain/StrapLocation;",
            "Lcom/whoop/weightlifting/data/domain/StrapLaterality;",
            "Z",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    instance-of v2, v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$l;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$l;

    iget v3, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$l;->I:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$l;->I:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$l;

    invoke-direct {v2, v0, v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$l;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$l;->G:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$l;->I:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v6, :cond_1

    iget-boolean v3, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$l;->E:Z

    iget-object v4, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$l;->z:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    iget-object v7, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$l;->y:Ljava/lang/Object;

    check-cast v7, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    iget-object v8, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$l;->x:Ljava/lang/Object;

    check-cast v8, Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    iget-object v2, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$l;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/weightlifting/data/domain/StrapLocation;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v19, v2

    move/from16 v32, v3

    move-object/from16 v20, v8

    :goto_1
    move-object/from16 v16, v4

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->h:Lfu2/i;

    invoke-virtual {v1}, Lfu2/i;->h()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-result-object v7

    invoke-direct {v0, v7}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->I(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    move-result-object v4

    iget-object v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->q:Llf1/m;

    move-object/from16 v8, p1

    iput-object v8, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$l;->w:Ljava/lang/Object;

    move-object/from16 v9, p2

    iput-object v9, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$l;->x:Ljava/lang/Object;

    iput-object v7, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$l;->y:Ljava/lang/Object;

    iput-object v4, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$l;->z:Ljava/lang/Object;

    move/from16 v10, p3

    iput-boolean v10, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$l;->E:Z

    iput v5, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$l;->F:I

    iput v6, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$l;->I:I

    invoke-virtual {v1, v2}, Llf1/m;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_3

    return-object v3

    :cond_3
    move-object/from16 v19, v8

    move-object/from16 v20, v9

    move/from16 v32, v10

    goto :goto_1

    :goto_2
    sget-object v2, Llf1/n;->CHECKMARK:Llf1/n;

    if-ne v1, v2, :cond_4

    goto :goto_3

    :cond_4
    move v6, v5

    :goto_3
    const-string v1, " "

    const-string v2, "strapLocation"

    const-string v3, "workoutId"

    if-nez v16, :cond_5

    if-nez v32, :cond_5

    iget-object v4, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->f:Ltr2/n;

    const-string v6, "Unable to start workout because workout template has no startable sets"

    new-array v5, v5, [Lqr2/a$a;

    invoke-interface {v4, v6, v5}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v8, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->i:Lfi0/a;

    new-instance v4, Ll83/k;

    const-string v5, "failureReason"

    const-string v6, "invalid_workout_template_on_start_workout"

    invoke-direct {v4, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getWorkoutTemplateKey()Ljava/lang/Long;

    move-result-object v5

    new-instance v6, Ll83/k;

    invoke-direct {v6, v3, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v1, v5}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v6, v3}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v14

    const/16 v15, 0x14

    const/16 v16, 0x0

    const-string v9, "Start Workout"

    const-string v10, "Failed"

    const/4 v11, 0x0

    const-string v12, "Workout Builder"

    const/4 v13, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    const/4 v1, 0x0

    return-object v1

    :cond_5
    iget-object v8, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->i:Lfi0/a;

    invoke-virtual {v7}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getWorkoutTemplateKey()Ljava/lang/Long;

    move-result-object v4

    new-instance v5, Ll83/k;

    invoke-direct {v5, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v1, v4}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v3}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v13

    const-string v9, ""

    const-string v10, "Start Workout"

    const-string v11, ""

    const-string v12, "Workout Builder"

    invoke-interface/range {v8 .. v13}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {v7}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getParentTemplateKey()Ljava/lang/Long;

    move-result-object v10

    invoke-virtual {v7}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getWorkoutTemplateKey()Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v7}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getGroups()Ljava/util/List;

    move-result-object v12

    invoke-virtual {v7}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getAllExerciseIds()Ljava/util/Set;

    move-result-object v14

    iget-object v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->a:Lzr2/a;

    invoke-interface {v1}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object v15

    new-instance v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;

    iget-object v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->a:Lzr2/a;

    invoke-interface {v2}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;-><init>(Lorg/joda/time/DateTime;)V

    new-instance v21, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    const/16 v33, 0x3ff

    const/16 v34, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v21 .. v34}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;-><init>(IIIIIIIZLjava/util/Set;Ljava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    const v27, 0x1e010

    const/16 v28, 0x0

    const/4 v13, 0x0

    sget-object v18, Lm83/z;->w:Lm83/z;

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v17, v1

    move/from16 v26, v6

    invoke-direct/range {v8 .. v28}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;-><init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method

.method private final y(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 29

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->c:Liu2/b;

    invoke-virtual {v1}, Liu2/b;->q()V

    iget-object v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->i:Lfi0/a;

    const-string v6, "Workout Builder"

    invoke-direct/range {p0 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->J(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Ljava/util/Map;

    move-result-object v7

    const-string v3, ""

    const-string v4, "Discard Workout"

    const-string v5, ""

    invoke-interface/range {v2 .. v7}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    const v27, 0x37fff

    const/16 v28, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v8, p1

    invoke-static/range {v8 .. v28}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v1

    return-object v1
.end method

.method private final y0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lbc3/c0;Ldu2/c;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            "Lbc3/c0;",
            "Ldu2/c;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$m;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$m;

    iget v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$m;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$m;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$m;

    invoke-direct {v0, p0, p4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$m;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$m;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$m;->F:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$m;->y:Ljava/lang/Object;

    check-cast p1, Ldu2/c;

    iget-object p2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$m;->x:Ljava/lang/Object;

    check-cast p2, Lbc3/c0;

    iget-object p2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$m;->w:Ljava/lang/Object;

    check-cast p2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$m;->y:Ljava/lang/Object;

    move-object p3, p1

    check-cast p3, Ldu2/c;

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$m;->x:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lbc3/c0;

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$m;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object p4

    instance-of p4, p4, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;

    if-nez p4, :cond_4

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object p4

    instance-of p4, p4, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;

    if-eqz p4, :cond_6

    :cond_4
    iput-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$m;->w:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$m;->x:Ljava/lang/Object;

    iput-object p3, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$m;->y:Ljava/lang/Object;

    iput v4, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$m;->F:I

    invoke-direct {p0, v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->l0(Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    if-eqz p4, :cond_6

    const/4 p4, 0x0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->w0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lbc3/c0;Ldu2/c;Z)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    return-object p1

    :cond_6
    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object p2

    instance-of p2, p2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;

    if-eqz p2, :cond_9

    iput-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$m;->w:Ljava/lang/Object;

    const/4 p2, 0x0

    iput-object p2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$m;->x:Ljava/lang/Object;

    iput-object p3, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$m;->y:Ljava/lang/Object;

    iput v3, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$m;->F:I

    invoke-direct {p0, v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->l0(Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    move-object p2, p1

    move-object p1, p3

    :goto_3
    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_8

    invoke-direct {p0, p2, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->A(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ldu2/c;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    return-object p1

    :cond_8
    return-object p2

    :cond_9
    return-object p1
.end method

.method private final z(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 34

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v1

    instance-of v1, v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;

    if-nez v1, :cond_3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSet()Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    move-result-object v1

    if-nez v1, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentExercise()Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    move-result-object v2

    if-nez v2, :cond_2

    goto/16 :goto_0

    :cond_2
    iget-object v3, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->i:Lfi0/a;

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getExercise()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getExerciseId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getWorkoutTemplateId()Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCompletedSetData()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v4

    const/4 v12, 0x1

    add-int/lit8 v7, v4, 0x1

    sget-object v8, Ldu2/c;->EXERCISES:Ldu2/c;

    const/16 v10, 0x20

    const/4 v11, 0x0

    const-string v4, "Complete Set"

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Ldu2/b;->l(Lfi0/a;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILdu2/c;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v3, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->a:Lzr2/a;

    invoke-interface {v3}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object v5

    new-instance v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;

    const/4 v4, 0x0

    const/4 v6, 0x2

    invoke-direct {v3, v5, v4, v6, v11}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;-><init>(Lorg/joda/time/DateTime;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCompletedSetData()Ljava/util/Map;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object v1

    new-instance v14, Lcom/whoop/weightlifting/data/domain/CompletedSetData;

    new-instance v15, Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    invoke-virtual {v5, v12}, Lorg/joda/time/DateTime;->plusMillis(I)Lorg/joda/time/DateTime;

    move-result-object v6

    const-string v4, "plusMillis(...)"

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0xc

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, v15

    invoke-direct/range {v4 .. v10}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;-><init>(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/data/remote/domain/dto/BoundType;Lcom/whoop/data/remote/domain/dto/BoundType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getExercise()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getTrackable()Z

    move-result v16

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getStrapLocation()Lcom/whoop/weightlifting/data/domain/StrapLocation;

    move-result-object v17

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getStrapLaterality()Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    move-result-object v18

    const/16 v19, 0x0

    invoke-direct/range {v14 .. v19}, Lcom/whoop/weightlifting/data/domain/CompletedSetData;-><init>(Lcom/whoop/data/remote/domain/dto/DateTimeRange;ZLcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Z)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v1, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v13, v2}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v23

    const v32, 0x3fcff

    const/16 v33, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v13, p1

    move-object/from16 v22, v3

    invoke-static/range {v13 .. v33}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->v(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v1

    invoke-static {v0, v1, v11, v12, v11}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->J0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;ILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v1

    return-object v1

    :cond_3
    :goto_0
    return-object p1
.end method

.method private final z0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 26

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentDialog()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;

    move-result-object v0

    instance-of v0, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentDialog()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentDialog()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;

    move-result-object v1

    check-cast v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;->e()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v4, v1, v2, v3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;->c(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;ZZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;

    move-result-object v20

    const v24, 0x3bfff

    const/16 v25, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v5, p1

    invoke-static/range {v5 .. v25}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final X(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/a;Lbc3/c0;Landroidx/lifecycle/k1;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            "Lfu2/a;",
            "Lbc3/c0;",
            "Landroidx/lifecycle/k1;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;

    iget v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;

    invoke-direct {v0, p0, p5}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lq83/d;)V

    :goto_0
    iget-object p5, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->G:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v2, :cond_6

    if-eq v2, v7, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->z:Ljava/lang/Object;

    check-cast p1, Landroidx/lifecycle/k1;

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->x:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lfu2/a;

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->z:Ljava/lang/Object;

    check-cast p1, Landroidx/lifecycle/k1;

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->x:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lfu2/a;

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_3
    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->z:Ljava/lang/Object;

    check-cast p1, Landroidx/lifecycle/k1;

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->x:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lfu2/a;

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_4
    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->z:Ljava/lang/Object;

    check-cast p1, Landroidx/lifecycle/k1;

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->x:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lfu2/a;

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_5
    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->z:Ljava/lang/Object;

    check-cast p1, Landroidx/lifecycle/k1;

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->x:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lfu2/a;

    iget-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_6
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p5, p2, Lfu2/a$q;

    if-eqz p5, :cond_9

    move-object p3, p2

    check-cast p3, Lfu2/a$q;

    invoke-virtual {p3}, Lfu2/a$q;->b()Lcom/whoop/weightlifting/data/domain/StrapLocation;

    move-result-object p4

    invoke-virtual {p3}, Lfu2/a$q;->a()Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    move-result-object p5

    invoke-virtual {p3}, Lfu2/a$q;->c()Z

    move-result p3

    iput-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->w:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->x:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->y:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->z:Ljava/lang/Object;

    iput v7, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->G:I

    invoke-direct {p0, p4, p5, p3, v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->x0(Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;ZLq83/d;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_7

    goto/16 :goto_6

    :cond_7
    :goto_1
    check-cast p5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-object v0, p0

    move-object v1, p1

    if-nez p5, :cond_8

    goto/16 :goto_8

    :cond_8
    move-object p1, p5

    goto/16 :goto_8

    :cond_9
    instance-of p5, p2, Lfu2/a$f;

    if-eqz p5, :cond_c

    if-eqz p1, :cond_a

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->B(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p3

    :goto_2
    move-object v0, p0

    move-object v1, p1

    move-object p1, p3

    goto/16 :goto_8

    :cond_a
    move-object v0, p0

    move-object v1, p1

    :cond_b
    move-object p1, v8

    goto/16 :goto_8

    :cond_c
    instance-of p5, p2, Lfu2/a$l;

    if-eqz p5, :cond_d

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->k0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p3

    goto :goto_2

    :cond_d
    instance-of p5, p2, Lfu2/a$k;

    if-eqz p5, :cond_e

    if-eqz p1, :cond_a

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->i0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p3

    goto :goto_2

    :cond_e
    instance-of p5, p2, Lfu2/a$c;

    if-eqz p5, :cond_f

    if-eqz p1, :cond_a

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->y(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p3

    goto :goto_2

    :cond_f
    instance-of p5, p2, Lfu2/a$p;

    if-eqz p5, :cond_10

    if-eqz p1, :cond_a

    move-object p4, p2

    check-cast p4, Lfu2/a$p;

    invoke-virtual {p4}, Lfu2/a$p;->b()Ldu2/c;

    move-result-object p5

    invoke-virtual {p4}, Lfu2/a$p;->a()Z

    move-result p4

    invoke-direct {p0, p1, p3, p5, p4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->w0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lbc3/c0;Ldu2/c;Z)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p3

    goto :goto_2

    :cond_10
    instance-of p5, p2, Lfu2/a$e;

    if-eqz p5, :cond_11

    if-eqz p1, :cond_a

    move-object p3, p2

    check-cast p3, Lfu2/a$e;

    invoke-virtual {p3}, Lfu2/a$e;->a()Ldu2/c;

    move-result-object p3

    invoke-direct {p0, p1, p3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->A(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ldu2/c;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p3

    goto :goto_2

    :cond_11
    instance-of p5, p2, Lfu2/a$r;

    if-eqz p5, :cond_13

    if-eqz p1, :cond_a

    move-object p4, p2

    check-cast p4, Lfu2/a$r;

    invoke-virtual {p4}, Lfu2/a$r;->a()Ldu2/c;

    move-result-object p4

    iput-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->w:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->x:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->y:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->z:Ljava/lang/Object;

    iput v6, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->G:I

    invoke-direct {p0, p1, p3, p4, v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->y0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lbc3/c0;Ldu2/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_12

    goto/16 :goto_6

    :cond_12
    :goto_3
    move-object p3, p5

    check-cast p3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    goto :goto_2

    :cond_13
    instance-of p5, p2, Lfu2/a$d;

    if-eqz p5, :cond_14

    if-eqz p1, :cond_a

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->z(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p3

    goto :goto_2

    :cond_14
    instance-of p5, p2, Lfu2/a$a;

    if-eqz p5, :cond_15

    if-eqz p1, :cond_a

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->s(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p3

    goto/16 :goto_2

    :cond_15
    instance-of p5, p2, Lfu2/a$w;

    if-eqz p5, :cond_16

    if-eqz p1, :cond_a

    move-object p3, p2

    check-cast p3, Lfu2/a$w;

    invoke-virtual {p3}, Lfu2/a$w;->a()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    move-result-object p3

    invoke-direct {p0, p1, p3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->H0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p3

    goto/16 :goto_2

    :cond_16
    instance-of p5, p2, Lfu2/a$o;

    if-eqz p5, :cond_17

    if-eqz p1, :cond_a

    move-object p3, p2

    check-cast p3, Lfu2/a$o;

    invoke-virtual {p3}, Lfu2/a$o;->a()Lnu2/a;

    move-result-object p3

    invoke-direct {p0, p1, p3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->v0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lnu2/a;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p3

    goto/16 :goto_2

    :cond_17
    instance-of p5, p2, Lfu2/a$m;

    if-eqz p5, :cond_19

    if-eqz p1, :cond_a

    iput-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->w:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->x:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->y:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->z:Ljava/lang/Object;

    iput v5, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->G:I

    invoke-direct {p0, p1, p4, v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->m0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Landroidx/lifecycle/k1;Lq83/d;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_18

    goto :goto_6

    :cond_18
    :goto_4
    move-object p3, p5

    check-cast p3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    goto/16 :goto_2

    :cond_19
    instance-of p5, p2, Lfu2/a$y;

    if-eqz p5, :cond_1b

    if-eqz p1, :cond_a

    iput-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->w:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->x:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->y:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->z:Ljava/lang/Object;

    iput v4, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->G:I

    invoke-direct {p0, p1, v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->L0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lq83/d;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_1a

    goto :goto_6

    :cond_1a
    :goto_5
    move-object p3, p5

    check-cast p3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    goto/16 :goto_2

    :cond_1b
    instance-of p5, p2, Lfu2/a$n;

    if-eqz p5, :cond_1d

    if-eqz p1, :cond_a

    iput-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->w:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->x:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->y:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->z:Ljava/lang/Object;

    iput v3, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$c;->G:I

    invoke-direct {p0, p1, p4, v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->n0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Landroidx/lifecycle/k1;Lq83/d;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_1c

    :goto_6
    return-object v1

    :cond_1c
    :goto_7
    move-object p3, p5

    check-cast p3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    goto/16 :goto_2

    :cond_1d
    instance-of p4, p2, Lfu2/a$s;

    if-eqz p4, :cond_1e

    if-eqz p1, :cond_a

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->z0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p3

    goto/16 :goto_2

    :cond_1e
    instance-of p4, p2, Lfu2/a$h;

    if-eqz p4, :cond_1f

    if-eqz p1, :cond_a

    move-object p3, p2

    check-cast p3, Lfu2/a$h;

    invoke-virtual {p3}, Lfu2/a$h;->b()I

    move-result p4

    invoke-virtual {p3}, Lfu2/a$h;->a()I

    move-result p3

    invoke-direct {p0, p1, p4, p3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->Y(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;II)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p3

    goto/16 :goto_2

    :cond_1f
    instance-of p4, p2, Lfu2/a$i;

    if-eqz p4, :cond_20

    if-eqz p1, :cond_a

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->Z(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p3

    goto/16 :goto_2

    :cond_20
    instance-of p4, p2, Lfu2/a$b;

    if-eqz p4, :cond_21

    if-eqz p1, :cond_a

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->u(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p3

    goto/16 :goto_2

    :cond_21
    instance-of p4, p2, Lfu2/a$v;

    if-eqz p4, :cond_22

    if-eqz p1, :cond_a

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->G0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p3

    goto/16 :goto_2

    :cond_22
    instance-of p4, p2, Lfu2/b$n;

    if-eqz p4, :cond_23

    if-eqz p1, :cond_a

    move-object p4, p2

    check-cast p4, Lfu2/b$n;

    invoke-direct {p0, p1, p4, p3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->U(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$n;Lbc3/c0;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p3

    goto/16 :goto_2

    :cond_23
    instance-of p3, p2, Lfu2/a$x;

    if-eqz p3, :cond_24

    if-eqz p1, :cond_a

    move-object p3, p2

    check-cast p3, Lfu2/a$x;

    invoke-direct {p0, p1, p3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->K0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/a$x;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p3

    goto/16 :goto_2

    :cond_24
    instance-of p3, p2, Lfu2/a$u;

    if-eqz p3, :cond_25

    if-eqz p1, :cond_a

    move-object p3, p2

    check-cast p3, Lfu2/a$u;

    invoke-virtual {p3}, Lfu2/a$u;->a()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    move-result-object p3

    invoke-direct {p0, p1, p3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->F0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p3

    goto/16 :goto_2

    :cond_25
    instance-of p3, p2, Lfu2/a$j;

    if-eqz p3, :cond_26

    if-eqz p1, :cond_a

    move-object v2, p2

    check-cast v2, Lfu2/a$j;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->b0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/a$j;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    goto :goto_8

    :cond_26
    move-object v0, p0

    move-object v1, p1

    instance-of p1, p2, Lfu2/a$t;

    if-eqz p1, :cond_27

    if-eqz v1, :cond_b

    invoke-direct {p0, v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->E0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    goto :goto_8

    :cond_27
    instance-of p1, p2, Lfu2/a$g;

    if-eqz p1, :cond_29

    if-eqz v1, :cond_b

    invoke-direct {p0, v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->B0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    :goto_8
    if-eqz p1, :cond_28

    invoke-direct {p0, p1, p2, v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->C(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/a;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    return-object p1

    :cond_28
    return-object v8

    :cond_29
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
