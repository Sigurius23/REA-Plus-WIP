.class public final Lcom/mapbox/maps/NativeMapImpl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0005\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00072\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ!\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001c2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c\u00a2\u0006\u0004\u0008 \u0010!JG\u0010+\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"2\u0008\u0010%\u001a\u0004\u0018\u00010$2\u0008\u0010\'\u001a\u0004\u0018\u00010&2\u0008\u0010(\u001a\u0004\u0018\u00010&2\u0008\u0010)\u001a\u0004\u0018\u00010&2\u0008\u0010*\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0004\u0008+\u0010,J\u0015\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020\u001d\u00a2\u0006\u0004\u0008/\u00100J!\u00102\u001a\u0008\u0012\u0004\u0012\u00020.012\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d01\u00a2\u0006\u0004\u00082\u0010!J\u0015\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u000203\u00a2\u0006\u0004\u00085\u00106J\u0017\u00109\u001a\u00020\u00072\u0006\u00108\u001a\u000207H\u0007\u00a2\u0006\u0004\u00089\u0010:J)\u0010?\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010<\u001a\u00020;2\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\u0008?\u0010@J!\u0010C\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010B\u001a\u00020A\u00a2\u0006\u0004\u0008C\u0010DJ\u0015\u0010G\u001a\u00020F2\u0006\u0010E\u001a\u00020;\u00a2\u0006\u0004\u0008G\u0010HJ)\u0010J\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010E\u001a\u00020;2\u0006\u0010I\u001a\u00020A\u00a2\u0006\u0004\u0008J\u0010KJ!\u0010L\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010B\u001a\u00020A\u00a2\u0006\u0004\u0008L\u0010DJ\u0015\u0010M\u001a\u00020F2\u0006\u0010E\u001a\u00020;\u00a2\u0006\u0004\u0008M\u0010HJ)\u0010N\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010E\u001a\u00020;2\u0006\u0010I\u001a\u00020A\u00a2\u0006\u0004\u0008N\u0010KJ9\u0010P\u001a\u00020\u00152\u000c\u0010O\u001a\u0008\u0012\u0004\u0012\u00020\u001f012\u0008\u0010%\u001a\u0004\u0018\u00010$2\u0008\u0010\'\u001a\u0004\u0018\u00010&2\u0008\u0010(\u001a\u0004\u0018\u00010&\u00a2\u0006\u0004\u0008P\u0010QJ+\u0010P\u001a\u00020\u00152\u000c\u0010O\u001a\u0008\u0012\u0004\u0012\u00020\u001f012\u0006\u0010R\u001a\u00020\u00152\u0006\u0010T\u001a\u00020S\u00a2\u0006\u0004\u0008P\u0010UJM\u0010P\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00150=2\u000c\u0010O\u001a\u0008\u0012\u0004\u0012\u00020\u001f012\u0006\u0010R\u001a\u00020\u00152\u0008\u0010%\u001a\u0004\u0018\u00010$2\u0008\u0010)\u001a\u0004\u0018\u00010&2\u0008\u0010*\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0004\u0008P\u0010VJ3\u0010Y\u001a\u00020\u00152\u0006\u0010X\u001a\u00020W2\u0008\u0010%\u001a\u0004\u0018\u00010$2\u0008\u0010\'\u001a\u0004\u0018\u00010&2\u0008\u0010(\u001a\u0004\u0018\u00010&\u00a2\u0006\u0004\u0008Y\u0010ZJ\u0017\u0010\\\u001a\u0004\u0018\u00010&2\u0006\u0010[\u001a\u00020\u001f\u00a2\u0006\u0004\u0008\\\u0010]J\u0017\u0010`\u001a\u00020\u00072\u0008\u0010_\u001a\u0004\u0018\u00010^\u00a2\u0006\u0004\u0008`\u0010aJ)\u0010e\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010b\u001a\u00020;2\u0006\u0010d\u001a\u00020c\u00a2\u0006\u0004\u0008e\u0010fJ)\u0010g\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010b\u001a\u00020;2\u0006\u0010d\u001a\u00020c\u00a2\u0006\u0004\u0008g\u0010fJ!\u0010h\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010b\u001a\u00020;\u00a2\u0006\u0004\u0008h\u0010iJ!\u0010j\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020c0=2\u0006\u0010b\u001a\u00020;\u00a2\u0006\u0004\u0008j\u0010iJ%\u0010n\u001a\u0008\u0012\u0004\u0012\u00020m0\u001c2\u0006\u0010l\u001a\u00020k2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008n\u0010oJ\u0015\u0010p\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008p\u0010qJ\u0015\u0010r\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008r\u0010qJ\u0015\u0010t\u001a\u00020s2\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008t\u0010uJ!\u0010w\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c2\u000c\u0010v\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001c\u00a2\u0006\u0004\u0008w\u0010!J\u0015\u0010y\u001a\u00020\u00072\u0006\u0010x\u001a\u000203\u00a2\u0006\u0004\u0008y\u00106J\r\u0010z\u001a\u000203\u00a2\u0006\u0004\u0008z\u0010{J!\u0010~\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010}\u001a\u00020|\u00a2\u0006\u0004\u0008~\u0010\u007fJ\u0011\u0010\u0081\u0001\u001a\u00030\u0080\u0001\u00a2\u0006\u0006\u0008\u0081\u0001\u0010\u0082\u0001J\u001a\u0010\u0085\u0001\u001a\u00020\u00072\u0008\u0010\u0084\u0001\u001a\u00030\u0083\u0001\u00a2\u0006\u0006\u0008\u0085\u0001\u0010\u0086\u0001J\u0011\u0010\u0087\u0001\u001a\u00030\u0083\u0001\u00a2\u0006\u0006\u0008\u0087\u0001\u0010\u0088\u0001J\u001a\u0010\u008b\u0001\u001a\u00020\u00072\u0008\u0010\u008a\u0001\u001a\u00030\u0089\u0001\u00a2\u0006\u0006\u0008\u008b\u0001\u0010\u008c\u0001J\u001a\u0010\u008f\u0001\u001a\u00020\u00072\u0008\u0010\u008e\u0001\u001a\u00030\u008d\u0001\u00a2\u0006\u0006\u0008\u008f\u0001\u0010\u0090\u0001J\u001a\u0010\u0093\u0001\u001a\u00020\u00072\u0008\u0010\u0092\u0001\u001a\u00030\u0091\u0001\u00a2\u0006\u0006\u0008\u0093\u0001\u0010\u0094\u0001J\u0011\u0010\u0096\u0001\u001a\u00030\u0095\u0001\u00a2\u0006\u0006\u0008\u0096\u0001\u0010\u0097\u0001J\u000f\u0010\u0098\u0001\u001a\u00020\u0007\u00a2\u0006\u0005\u0008\u0098\u0001\u0010\u0012J5\u0010\u009a\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010\u0099\u0001\u001a\u00020;2\u0006\u0010E\u001a\u00020;2\u0006\u0010I\u001a\u00020A\u00a2\u0006\u0006\u0008\u009a\u0001\u0010\u009b\u0001J\u0018\u0010\u009c\u0001\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u001f\u00a2\u0006\u0006\u0008\u009c\u0001\u0010\u009d\u0001J\u0019\u0010\u009f\u0001\u001a\u00020\u001f2\u0007\u0010\u009e\u0001\u001a\u00020\u001d\u00a2\u0006\u0006\u0008\u009f\u0001\u0010\u00a0\u0001J\u0017\u0010\u00a2\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a1\u000101\u00a2\u0006\u0006\u0008\u00a2\u0001\u0010\u00a3\u0001J)\u0010\u00a6\u0001\u001a\u00020\u00072\u000e\u0010\u00a4\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a1\u0001012\u0007\u0010\u00a5\u0001\u001a\u000203\u00a2\u0006\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001J1\u0010\u00ab\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010\u00a8\u0001\u001a\u00020A2\n\u0010\u00aa\u0001\u001a\u0005\u0018\u00010\u00a9\u0001\u00a2\u0006\u0006\u0008\u00ab\u0001\u0010\u00ac\u0001J;\u0010\u00af\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010\u0099\u0001\u001a\u00020;2\u0008\u0010\u00ae\u0001\u001a\u00030\u00ad\u00012\n\u0010\u00aa\u0001\u001a\u0005\u0018\u00010\u00a9\u0001\u00a2\u0006\u0006\u0008\u00af\u0001\u0010\u00b0\u0001J0\u0010\u00b1\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010B\u001a\u00020A2\n\u0010\u00aa\u0001\u001a\u0005\u0018\u00010\u00a9\u0001\u00a2\u0006\u0006\u0008\u00b1\u0001\u0010\u00ac\u0001J;\u0010\u00b2\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010\u0099\u0001\u001a\u00020;2\u0008\u0010\u00ae\u0001\u001a\u00030\u00ad\u00012\n\u0010\u00aa\u0001\u001a\u0005\u0018\u00010\u00a9\u0001\u00a2\u0006\u0006\u0008\u00b2\u0001\u0010\u00b0\u0001J$\u0010\u00b3\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u0002030=2\u0007\u0010\u0099\u0001\u001a\u00020;\u00a2\u0006\u0005\u0008\u00b3\u0001\u0010iJ1\u0010\u00b4\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010\u0099\u0001\u001a\u00020;2\n\u0010\u00aa\u0001\u001a\u0005\u0018\u00010\u00a9\u0001\u00a2\u0006\u0006\u0008\u00b4\u0001\u0010\u00b5\u0001J\u0019\u0010\u00b7\u0001\u001a\u00020\u00072\u0007\u0010\u00b6\u0001\u001a\u00020;\u00a2\u0006\u0006\u0008\u00b7\u0001\u0010\u00b8\u0001J\u0010\u0010\u00b9\u0001\u001a\u00020;\u00a2\u0006\u0006\u0008\u00b9\u0001\u0010\u00ba\u0001J\u0010\u0010\u00bb\u0001\u001a\u00020;\u00a2\u0006\u0006\u0008\u00bb\u0001\u0010\u00ba\u0001J\u0019\u0010\u00bd\u0001\u001a\u00020\u00072\u0007\u0010\u00bc\u0001\u001a\u00020;\u00a2\u0006\u0006\u0008\u00bd\u0001\u0010\u00b8\u0001J\u0010\u0010\u00be\u0001\u001a\u00020\u0015\u00a2\u0006\u0006\u0008\u00be\u0001\u0010\u00bf\u0001J\u0011\u0010\u00c1\u0001\u001a\u00030\u00c0\u0001\u00a2\u0006\u0006\u0008\u00c1\u0001\u0010\u00c2\u0001J\u001a\u0010\u00c4\u0001\u001a\u00020\u00072\u0008\u0010\u00c3\u0001\u001a\u00030\u00c0\u0001\u00a2\u0006\u0006\u0008\u00c4\u0001\u0010\u00c5\u0001J$\u0010\u00c6\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010\u0099\u0001\u001a\u00020;\u00a2\u0006\u0005\u0008\u00c6\u0001\u0010iJ\u0019\u0010\u00c7\u0001\u001a\u0002032\u0007\u0010\u0099\u0001\u001a\u00020;\u00a2\u0006\u0006\u0008\u00c7\u0001\u0010\u00c8\u0001J!\u0010\u00c9\u0001\u001a\u00020F2\u0007\u0010\u0099\u0001\u001a\u00020;2\u0006\u0010E\u001a\u00020;\u00a2\u0006\u0006\u0008\u00c9\u0001\u0010\u00ca\u0001J,\u0010\u00cb\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010\u0099\u0001\u001a\u00020;2\u0006\u0010B\u001a\u00020A\u00a2\u0006\u0005\u0008\u00cb\u0001\u0010KJ,\u0010\u00cd\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010<\u001a\u00020;2\u0007\u0010\u00cc\u0001\u001a\u00020A\u00a2\u0006\u0005\u0008\u00cd\u0001\u0010KJ#\u0010\u00ce\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020A0=2\u0006\u0010<\u001a\u00020;\u00a2\u0006\u0005\u0008\u00ce\u0001\u0010iJ.\u0010\u00d1\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010<\u001a\u00020;2\u0008\u0010\u00d0\u0001\u001a\u00030\u00cf\u0001\u00a2\u0006\u0006\u0008\u00d1\u0001\u0010\u00d2\u0001J$\u0010\u00d3\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020A0=2\u0007\u0010\u0099\u0001\u001a\u00020;\u00a2\u0006\u0005\u0008\u00d3\u0001\u0010iJ#\u0010\u00d4\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010<\u001a\u00020;\u00a2\u0006\u0005\u0008\u00d4\u0001\u0010iJ=\u0010\u00d8\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010<\u001a\u00020;2\u0007\u0010\u00d5\u0001\u001a\u00020m2\u000e\u0010\u00d7\u0001\u001a\t\u0012\u0005\u0012\u00030\u00d6\u00010\u001c\u00a2\u0006\u0006\u0008\u00d8\u0001\u0010\u00d9\u0001J\u0018\u0010\u00da\u0001\u001a\u0002032\u0006\u0010<\u001a\u00020;\u00a2\u0006\u0006\u0008\u00da\u0001\u0010\u00c8\u0001J5\u0010\u00dc\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010\u00db\u0001\u001a\u00020;2\u0006\u0010E\u001a\u00020;2\u0006\u0010I\u001a\u00020A\u00a2\u0006\u0006\u0008\u00dc\u0001\u0010\u009b\u0001J\u0017\u0010\u00de\u0001\u001a\t\u0012\u0005\u0012\u00030\u00dd\u00010\u001c\u00a2\u0006\u0006\u0008\u00de\u0001\u0010\u00a3\u0001J$\u0010\u00e0\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010\u00df\u0001\u001a\u00020A\u00a2\u0006\u0005\u0008\u00e0\u0001\u0010DJ#\u0010\u00e1\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010B\u001a\u00020A\u00a2\u0006\u0005\u0008\u00e1\u0001\u0010DJ\u0017\u0010\u00e2\u0001\u001a\u00020F2\u0006\u0010E\u001a\u00020;\u00a2\u0006\u0005\u0008\u00e2\u0001\u0010HJ+\u0010\u00e3\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010E\u001a\u00020;2\u0006\u0010I\u001a\u00020A\u00a2\u0006\u0005\u0008\u00e3\u0001\u0010KJ!\u0010\u00e4\u0001\u001a\u00020F2\u0007\u0010\u00db\u0001\u001a\u00020;2\u0006\u0010E\u001a\u00020;\u00a2\u0006\u0006\u0008\u00e4\u0001\u0010\u00ca\u0001J\u001c\u0010\u00e6\u0001\u001a\u0005\u0018\u00010\u00cf\u00012\u0007\u0010\u00e5\u0001\u001a\u00020;\u00a2\u0006\u0006\u0008\u00e6\u0001\u0010\u00e7\u0001J$\u0010\u00e8\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010\u00e5\u0001\u001a\u00020;\u00a2\u0006\u0005\u0008\u00e8\u0001\u0010iJ\u0019\u0010\u00e9\u0001\u001a\u0002032\u0007\u0010\u00e5\u0001\u001a\u00020;\u00a2\u0006\u0006\u0008\u00e9\u0001\u0010\u00c8\u0001J.\u0010\u00ec\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010\u00ea\u0001\u001a\u00020;2\u0007\u0010\u00eb\u0001\u001a\u00020;\u00a2\u0006\u0006\u0008\u00ec\u0001\u0010\u00ed\u0001J$\u0010\u00ee\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010\u00ea\u0001\u001a\u00020;\u00a2\u0006\u0005\u0008\u00ee\u0001\u0010iJ\u0019\u0010\u00ef\u0001\u001a\u0002032\u0007\u0010\u00ea\u0001\u001a\u00020;\u00a2\u0006\u0006\u0008\u00ef\u0001\u0010\u00c8\u0001J,\u0010\u00f4\u0001\u001a\u00030\u00f3\u00012\u0007\u0010X\u001a\u00030\u00f0\u00012\u0007\u0010d\u001a\u00030\u00f1\u00012\u0007\u0010\u0008\u001a\u00030\u00f2\u0001\u00a2\u0006\u0006\u0008\u00f4\u0001\u0010\u00f5\u0001J+\u0010\u00f8\u0001\u001a\u00030\u00f3\u00012\u0006\u0010<\u001a\u00020;2\u0007\u0010d\u001a\u00030\u00f6\u00012\u0007\u0010\u0008\u001a\u00030\u00f7\u0001\u00a2\u0006\u0006\u0008\u00f8\u0001\u0010\u00f9\u0001Jj\u0010\u0082\u0002\u001a\u00030\u00f3\u00012\u0007\u0010\u00fa\u0001\u001a\u00020;2\u0008\u0010\u00fb\u0001\u001a\u00030\u00d6\u00012\u0007\u0010\u00fc\u0001\u001a\u00020;2\u0007\u0010\u00fd\u0001\u001a\u00020;2)\u0010\u0080\u0002\u001a$\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020A\u0018\u00010\u00fe\u0001j\u0011\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020A\u0018\u0001`\u00ff\u00012\u0007\u0010\u0008\u001a\u00030\u0081\u0002\u00a2\u0006\u0006\u0008\u0082\u0002\u0010\u0083\u0002J?\u0010\u0088\u0002\u001a\u00030\u00f3\u00012\u0006\u0010<\u001a\u00020;2\t\u0010\u0084\u0002\u001a\u0004\u0018\u00010;2\u0007\u0010\u0085\u0002\u001a\u00020;2\u0007\u0010\u0086\u0002\u001a\u00020A2\u0007\u0010\u0008\u001a\u00030\u0087\u0002\u00a2\u0006\u0006\u0008\u0088\u0002\u0010\u0089\u0002J6\u0010\u008b\u0002\u001a\u00030\u00f3\u00012\u0006\u0010<\u001a\u00020;2\t\u0010\u0084\u0002\u001a\u0004\u0018\u00010;2\u0007\u0010\u0085\u0002\u001a\u00020;2\u0007\u0010\u0008\u001a\u00030\u008a\u0002\u00a2\u0006\u0006\u0008\u008b\u0002\u0010\u008c\u0002J\u0011\u0010\u008e\u0002\u001a\u00030\u008d\u0002\u00a2\u0006\u0006\u0008\u008e\u0002\u0010\u008f\u0002J\u0018\u0010\u0017\u001a\u00020\u00072\u0008\u0010\u0090\u0002\u001a\u00030\u008d\u0002\u00a2\u0006\u0005\u0008\u0017\u0010\u0091\u0002J-\u0010\u0092\u0002\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010<\u001a\u00020;2\u0007\u0010\u00d5\u0001\u001a\u00020m\u00a2\u0006\u0006\u0008\u0092\u0002\u0010\u0093\u0002J+\u0010\u0094\u0002\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010<\u001a\u00020;2\u0006\u0010B\u001a\u00020A\u00a2\u0006\u0005\u0008\u0094\u0002\u0010KJ7\u0010\u0098\u0002\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010<\u001a\u00020;2\u0007\u0010\u0095\u0002\u001a\u00020;2\u0008\u0010\u0097\u0002\u001a\u00030\u0096\u0002\u00a2\u0006\u0006\u0008\u0098\u0002\u0010\u0099\u0002JA\u0010\u009b\u0002\u001a\u00030\u00f3\u00012\u0006\u0010<\u001a\u00020;2\t\u0010\u0084\u0002\u001a\u0004\u0018\u00010;2\u0007\u0010\u0085\u0002\u001a\u00020;2\t\u0010\u009a\u0002\u001a\u0004\u0018\u00010;2\u0007\u0010\u0008\u001a\u00030\u0087\u0002\u00a2\u0006\u0006\u0008\u009b\u0002\u0010\u009c\u0002J-\u0010\u009d\u0002\u001a\u00030\u00f3\u00012\u0006\u0010<\u001a\u00020;2\t\u0010\u0084\u0002\u001a\u0004\u0018\u00010;2\u0007\u0010\u0008\u001a\u00030\u0087\u0002\u00a2\u0006\u0006\u0008\u009d\u0002\u0010\u009e\u0002J\u001c\u0010\u00a1\u0002\u001a\u00020\u00072\n\u0010\u00a0\u0002\u001a\u0005\u0018\u00010\u009f\u0002\u00a2\u0006\u0006\u0008\u00a1\u0002\u0010\u00a2\u0002J-\u0010\u00a4\u0002\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010<\u001a\u00020;2\u0007\u0010d\u001a\u00030\u00a3\u0002\u00a2\u0006\u0006\u0008\u00a4\u0002\u0010\u00a5\u0002Jn\u0010\u00ae\u0002\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010\u00e5\u0001\u001a\u00020;2\u0008\u0010\u00a7\u0002\u001a\u00030\u00a6\u00022\u0008\u0010\u00d0\u0001\u001a\u00030\u00cf\u00012\u0007\u0010\u00a8\u0002\u001a\u0002032\u000e\u0010\u00aa\u0002\u001a\t\u0012\u0005\u0012\u00030\u00a9\u00020\u001c2\u000e\u0010\u00ab\u0002\u001a\t\u0012\u0005\u0012\u00030\u00a9\u00020\u001c2\n\u0010\u00ad\u0002\u001a\u0005\u0018\u00010\u00ac\u0002\u00a2\u0006\u0006\u0008\u00ae\u0002\u0010\u00af\u0002J\u000f\u0010\u00b0\u0002\u001a\u00020\u0007\u00a2\u0006\u0005\u0008\u00b0\u0002\u0010\u0012J\u000f\u0010\u00b1\u0002\u001a\u000203\u00a2\u0006\u0005\u0008\u00b1\u0002\u0010{J \u0010\u00b2\u0002\u001a\u00020F2\u0006\u0010<\u001a\u00020;2\u0006\u0010E\u001a\u00020;\u00a2\u0006\u0006\u0008\u00b2\u0002\u0010\u00ca\u0001J\u000f\u0010\u00b3\u0002\u001a\u000203\u00a2\u0006\u0005\u0008\u00b3\u0002\u0010{J4\u0010\u00b4\u0002\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010<\u001a\u00020;2\u0006\u0010E\u001a\u00020;2\u0006\u0010I\u001a\u00020A\u00a2\u0006\u0006\u0008\u00b4\u0002\u0010\u009b\u0001J\u0017\u0010\u00b5\u0002\u001a\u00020s2\u0006\u0010R\u001a\u00020\u0015\u00a2\u0006\u0005\u0008\u00b5\u0002\u0010uJ\u0017\u0010\u00b6\u0002\u001a\t\u0012\u0005\u0012\u00030\u00dd\u000101\u00a2\u0006\u0006\u0008\u00b6\u0002\u0010\u00a3\u0001J\u0017\u0010\u00b7\u0002\u001a\t\u0012\u0005\u0012\u00030\u00dd\u000101\u00a2\u0006\u0006\u0008\u00b7\u0002\u0010\u00a3\u0001J\u0018\u0010\u00b9\u0002\u001a\u00020\u00072\u0007\u0010\u00b8\u0002\u001a\u000203\u00a2\u0006\u0005\u0008\u00b9\u0002\u00106J\u000f\u0010\u00ba\u0002\u001a\u000203\u00a2\u0006\u0005\u0008\u00ba\u0002\u0010{J\u001b\u0010\u00bd\u0002\u001a\u00030\u00f3\u00012\u0008\u0010\u00bc\u0002\u001a\u00030\u00bb\u0002\u00a2\u0006\u0006\u0008\u00bd\u0002\u0010\u00be\u0002J\u001b\u0010\u00bd\u0002\u001a\u00030\u00f3\u00012\u0008\u0010\u00c0\u0002\u001a\u00030\u00bf\u0002\u00a2\u0006\u0006\u0008\u00bd\u0002\u0010\u00c1\u0002J\u001b\u0010\u00bd\u0002\u001a\u00030\u00f3\u00012\u0008\u0010\u00c3\u0002\u001a\u00030\u00c2\u0002\u00a2\u0006\u0006\u0008\u00bd\u0002\u0010\u00c4\u0002J\u001b\u0010\u00bd\u0002\u001a\u00030\u00f3\u00012\u0008\u0010\u00c6\u0002\u001a\u00030\u00c5\u0002\u00a2\u0006\u0006\u0008\u00bd\u0002\u0010\u00c7\u0002J\u001b\u0010\u00bd\u0002\u001a\u00030\u00f3\u00012\u0008\u0010\u00c9\u0002\u001a\u00030\u00c8\u0002\u00a2\u0006\u0006\u0008\u00bd\u0002\u0010\u00ca\u0002J\u001b\u0010\u00bd\u0002\u001a\u00030\u00f3\u00012\u0008\u0010\u00cc\u0002\u001a\u00030\u00cb\u0002\u00a2\u0006\u0006\u0008\u00bd\u0002\u0010\u00cd\u0002J\u001b\u0010\u00bd\u0002\u001a\u00030\u00f3\u00012\u0008\u0010\u00cf\u0002\u001a\u00030\u00ce\u0002\u00a2\u0006\u0006\u0008\u00bd\u0002\u0010\u00d0\u0002J\u001b\u0010\u00bd\u0002\u001a\u00030\u00f3\u00012\u0008\u0010\u00d2\u0002\u001a\u00030\u00d1\u0002\u00a2\u0006\u0006\u0008\u00bd\u0002\u0010\u00d3\u0002J\u001b\u0010\u00bd\u0002\u001a\u00030\u00f3\u00012\u0008\u0010\u00d5\u0002\u001a\u00030\u00d4\u0002\u00a2\u0006\u0006\u0008\u00bd\u0002\u0010\u00d6\u0002J\u001b\u0010\u00bd\u0002\u001a\u00030\u00f3\u00012\u0008\u0010\u00d8\u0002\u001a\u00030\u00d7\u0002\u00a2\u0006\u0006\u0008\u00bd\u0002\u0010\u00d9\u0002J\u001b\u0010\u00bd\u0002\u001a\u00030\u00f3\u00012\u0008\u0010\u00db\u0002\u001a\u00030\u00da\u0002\u00a2\u0006\u0006\u0008\u00bd\u0002\u0010\u00dc\u0002J\u001d\u0010\u00bd\u0002\u001a\u00030\u00f3\u00012\u0008\u0010\u00de\u0002\u001a\u00030\u00dd\u0002H\u0007\u00a2\u0006\u0006\u0008\u00bd\u0002\u0010\u00df\u0002J\u001b\u0010\u00bd\u0002\u001a\u00030\u00f3\u00012\u0008\u0010\u00e1\u0002\u001a\u00030\u00e0\u0002\u00a2\u0006\u0006\u0008\u00bd\u0002\u0010\u00e2\u0002J\u001b\u0010\u00bd\u0002\u001a\u00030\u00f3\u00012\u0008\u0010\u00e4\u0002\u001a\u00030\u00e3\u0002\u00a2\u0006\u0006\u0008\u00bd\u0002\u0010\u00e5\u0002J\u001b\u0010\u00bd\u0002\u001a\u00030\u00f3\u00012\u0008\u0010\u00e7\u0002\u001a\u00030\u00e6\u0002\u00a2\u0006\u0006\u0008\u00bd\u0002\u0010\u00e8\u0002J&\u0010\u00bd\u0002\u001a\u00030\u00f3\u00012\u0007\u0010\u00e9\u0002\u001a\u00020;2\u0008\u0010\u00eb\u0002\u001a\u00030\u00ea\u0002H\u0007\u00a2\u0006\u0006\u0008\u00bd\u0002\u0010\u00ec\u0002J\u0016\u0010\u00ed\u0002\u001a\u0008\u0012\u0004\u0012\u00020;01\u00a2\u0006\u0006\u0008\u00ed\u0002\u0010\u00a3\u0001J\"\u0010\u00f0\u0002\u001a\u00020\u00152\u0007\u0010\u00ee\u0002\u001a\u00020\u001d2\u0007\u0010\u00ef\u0002\u001a\u00020\u001d\u00a2\u0006\u0006\u0008\u00f0\u0002\u0010\u00f1\u0002J\u001a\u0010\u00f4\u0002\u001a\u00020\u00072\u0008\u0010\u00f3\u0002\u001a\u00030\u00f2\u0002\u00a2\u0006\u0006\u0008\u00f4\u0002\u0010\u00f5\u0002J\u0011\u0010\u00f6\u0002\u001a\u00030\u00f2\u0002\u00a2\u0006\u0006\u0008\u00f6\u0002\u0010\u00f7\u0002J \u0010\u00fa\u0002\u001a\u00020\u00072\u000e\u0010\u00f9\u0002\u001a\t\u0012\u0005\u0012\u00030\u00f8\u000201\u00a2\u0006\u0006\u0008\u00fa\u0002\u0010\u00fb\u0002J\u0017\u0010\u00fc\u0002\u001a\t\u0012\u0005\u0012\u00030\u00f8\u000201\u00a2\u0006\u0006\u0008\u00fc\u0002\u0010\u00a3\u0001J\"\u0010\u00ff\u0002\u001a\u00020\u00072\u0007\u0010d\u001a\u00030\u00fd\u00022\u0007\u0010\u0008\u001a\u00030\u00fe\u0002\u00a2\u0006\u0006\u0008\u00ff\u0002\u0010\u0080\u0003J\u000f\u0010\u0081\u0003\u001a\u00020\u0007\u00a2\u0006\u0005\u0008\u0081\u0003\u0010\u0012J0\u0010\u0084\u0003\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0010\u0010\u0083\u0003\u001a\u000b\u0012\u0004\u0012\u00020;\u0018\u00010\u0082\u0003H\u0007\u00a2\u0006\u0006\u0008\u0084\u0003\u0010\u0085\u0003J\u0017\u0010\u0086\u0003\u001a\t\u0012\u0004\u0012\u00020;0\u0082\u0003\u00a2\u0006\u0006\u0008\u0086\u0003\u0010\u0087\u0003J\u001b\u0010\u008a\u0003\u001a\u00030\u00f3\u00012\u0008\u0010\u0089\u0003\u001a\u00030\u0088\u0003\u00a2\u0006\u0006\u0008\u008a\u0003\u0010\u008b\u0003J\u001a\u0010\u008e\u0003\u001a\u00020\u00072\u0008\u0010\u008d\u0003\u001a\u00030\u008c\u0003\u00a2\u0006\u0006\u0008\u008e\u0003\u0010\u008f\u0003J7\u0010\u0088\u0002\u001a\u00030\u00f3\u00012\u0008\u0010\u0091\u0003\u001a\u00030\u0090\u00032\u0008\u0010\u0085\u0002\u001a\u00030\u0092\u00032\u0007\u0010\u0086\u0002\u001a\u00020A2\u0007\u0010\u0008\u001a\u00030\u0087\u0002\u00a2\u0006\u0006\u0008\u0088\u0002\u0010\u0093\u0003J.\u0010\u008b\u0002\u001a\u00030\u00f3\u00012\u0008\u0010\u0091\u0003\u001a\u00030\u0090\u00032\u0008\u0010\u0085\u0002\u001a\u00030\u0092\u00032\u0007\u0010\u0008\u001a\u00030\u008a\u0002\u00a2\u0006\u0006\u0008\u008b\u0002\u0010\u0094\u0003J9\u0010\u009b\u0002\u001a\u00030\u00f3\u00012\u0008\u0010\u0091\u0003\u001a\u00030\u0090\u00032\u0008\u0010\u0085\u0002\u001a\u00030\u0092\u00032\t\u0010\u009a\u0002\u001a\u0004\u0018\u00010;2\u0007\u0010\u0008\u001a\u00030\u0087\u0002\u00a2\u0006\u0006\u0008\u009b\u0002\u0010\u0095\u0003J$\u0010\u009d\u0002\u001a\u00030\u00f3\u00012\u0008\u0010\u0091\u0003\u001a\u00030\u0090\u00032\u0007\u0010\u0008\u001a\u00030\u0087\u0002\u00a2\u0006\u0006\u0008\u009d\u0002\u0010\u0096\u0003J3\u0010\u00f4\u0001\u001a\u00030\u00f3\u00012\u0007\u0010X\u001a\u00030\u00f0\u00012\u000e\u0010\u0098\u0003\u001a\t\u0012\u0005\u0012\u00030\u0097\u0003012\u0007\u0010\u0008\u001a\u00030\u00f2\u0001\u00a2\u0006\u0006\u0008\u00f4\u0001\u0010\u0099\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000f\n\u0005\u0008\u0003\u0010\u009a\u0003\u001a\u0006\u0008\u009b\u0003\u0010\u009c\u0003R/\u0010\u009d\u0003\u001a\u0002032\u0006\u0010I\u001a\u0002038\u0000@@X\u0080\u000e\u00a2\u0006\u0016\n\u0006\u0008\u009d\u0003\u0010\u009e\u0003\u001a\u0005\u0008\u009f\u0003\u0010{\"\u0005\u0008\u00a0\u0003\u00106R&\u0010\u00a2\u0003\u001a\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00a1\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a2\u0003\u0010\u00a3\u0003R\u0018\u0010\u00a5\u0003\u001a\u00030\u00a4\u00038\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a5\u0003\u0010\u00a6\u0003\u00a8\u0006\u00a7\u0003"
    }
    d2 = {
        "Lcom/mapbox/maps/NativeMapImpl;",
        "",
        "Lcom/mapbox/maps/Map;",
        "map",
        "<init>",
        "(Lcom/mapbox/maps/Map;)V",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "callback",
        "whenMapSizeReady",
        "(Lc93/a;)V",
        "Lcom/mapbox/maps/Size;",
        "size",
        "setSize",
        "(Lcom/mapbox/maps/Size;)V",
        "getSize",
        "()Lcom/mapbox/maps/Size;",
        "createRenderer",
        "()V",
        "destroyRenderer",
        "render",
        "Lcom/mapbox/maps/CameraOptions;",
        "cameraOptions",
        "setCamera",
        "(Lcom/mapbox/maps/CameraOptions;)V",
        "Lcom/mapbox/maps/CameraState;",
        "getCameraState",
        "()Lcom/mapbox/maps/CameraState;",
        "",
        "Lcom/mapbox/maps/ScreenCoordinate;",
        "pixels",
        "Lcom/mapbox/geojson/Point;",
        "coordinatesForPixels",
        "(Ljava/util/List;)Ljava/util/List;",
        "Lcom/mapbox/maps/CoordinateBounds;",
        "coordinateBounds",
        "Lcom/mapbox/maps/EdgeInsets;",
        "padding",
        "",
        "bearing",
        "pitch",
        "maxZoom",
        "offset",
        "cameraForCoordinateBounds",
        "(Lcom/mapbox/maps/CoordinateBounds;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;",
        "pixel",
        "Lcom/mapbox/maps/CoordinateInfo;",
        "coordinateInfoForPixel",
        "(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CoordinateInfo;",
        "",
        "coordinatesInfoForPixels",
        "",
        "inProgress",
        "setUserAnimationInProgress",
        "(Z)V",
        "Lcom/mapbox/maps/CameraAnimationHint;",
        "cameraAnimationHint",
        "setCameraAnimationHint",
        "(Lcom/mapbox/maps/CameraAnimationHint;)V",
        "",
        "sourceId",
        "Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/bindgen/None;",
        "invalidateStyleCustomGeometrySourceRegion",
        "(Ljava/lang/String;Lcom/mapbox/maps/CoordinateBounds;)Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/bindgen/Value;",
        "properties",
        "setStyleTerrain",
        "(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;",
        "property",
        "Lcom/mapbox/maps/StylePropertyValue;",
        "getStyleTerrainProperty",
        "(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;",
        "value",
        "setStyleTerrainProperty",
        "(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;",
        "setStyleProjection",
        "getStyleProjectionProperty",
        "setStyleProjectionProperty",
        "points",
        "cameraForCoordinates",
        "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;",
        "camera",
        "Lcom/mapbox/maps/ScreenBox;",
        "box",
        "(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/ScreenBox;)Lcom/mapbox/maps/CameraOptions;",
        "(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/geojson/Geometry;",
        "geometry",
        "cameraForGeometry",
        "(Lcom/mapbox/geojson/Geometry;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;",
        "point",
        "getElevation",
        "(Lcom/mapbox/geojson/Point;)Ljava/lang/Double;",
        "Lcom/mapbox/maps/ViewAnnotationPositionsUpdateListener;",
        "listener",
        "setViewAnnotationPositionsUpdateListener",
        "(Lcom/mapbox/maps/ViewAnnotationPositionsUpdateListener;)V",
        "identifier",
        "Lcom/mapbox/maps/ViewAnnotationOptions;",
        "options",
        "addViewAnnotation",
        "(Ljava/lang/String;Lcom/mapbox/maps/ViewAnnotationOptions;)Lcom/mapbox/bindgen/Expected;",
        "updateViewAnnotation",
        "removeViewAnnotation",
        "(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;",
        "getViewAnnotationOptions",
        "Lcom/mapbox/maps/TileCoverOptions;",
        "tileCoverOptions",
        "Lcom/mapbox/maps/CanonicalTileID;",
        "tileCover",
        "(Lcom/mapbox/maps/TileCoverOptions;Lcom/mapbox/maps/CameraOptions;)Ljava/util/List;",
        "coordinateBoundsForCamera",
        "(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CoordinateBounds;",
        "coordinateBoundsForCameraUnwrapped",
        "Lcom/mapbox/maps/CoordinateBoundsZoom;",
        "coordinateBoundsZoomForCameraUnwrapped",
        "(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CoordinateBoundsZoom;",
        "coordinates",
        "pixelsForCoordinates",
        "gestureInProgress",
        "setGestureInProgress",
        "isGestureInProgress",
        "()Z",
        "Lcom/mapbox/maps/CameraBoundsOptions;",
        "boundOptions",
        "setBounds",
        "(Lcom/mapbox/maps/CameraBoundsOptions;)Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/maps/CameraBounds;",
        "getBounds",
        "()Lcom/mapbox/maps/CameraBounds;",
        "",
        "zoomDelta",
        "setPrefetchZoomDelta",
        "(B)V",
        "getPrefetchZoomDelta",
        "()B",
        "Lcom/mapbox/maps/NorthOrientation;",
        "northOrientation",
        "setNorthOrientation",
        "(Lcom/mapbox/maps/NorthOrientation;)V",
        "Lcom/mapbox/maps/ConstrainMode;",
        "constrainMode",
        "setConstrainMode",
        "(Lcom/mapbox/maps/ConstrainMode;)V",
        "Lcom/mapbox/maps/ViewportMode;",
        "viewportMode",
        "setViewportMode",
        "(Lcom/mapbox/maps/ViewportMode;)V",
        "Lcom/mapbox/maps/MapOptions;",
        "getMapOptions",
        "()Lcom/mapbox/maps/MapOptions;",
        "triggerRepaint",
        "layerId",
        "setStyleLayerProperty",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;",
        "pixelForCoordinate",
        "(Lcom/mapbox/geojson/Point;)Lcom/mapbox/maps/ScreenCoordinate;",
        "screenCoordinate",
        "coordinateForPixel",
        "(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/geojson/Point;",
        "Lcom/mapbox/maps/MapDebugOptions;",
        "getDebug",
        "()Ljava/util/List;",
        "list",
        "debugActive",
        "setDebug",
        "(Ljava/util/List;Z)V",
        "parameters",
        "Lcom/mapbox/maps/LayerPosition;",
        "layerPosition",
        "addStyleLayer",
        "(Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/maps/CustomLayerHost;",
        "layerHost",
        "addStyleCustomLayer",
        "(Ljava/lang/String;Lcom/mapbox/maps/CustomLayerHost;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;",
        "addPersistentStyleLayer",
        "addPersistentStyleCustomLayer",
        "isStyleLayerPersistent",
        "moveStyleLayer",
        "(Ljava/lang/String;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;",
        "json",
        "setStyleJSON",
        "(Ljava/lang/String;)V",
        "getStyleJSON",
        "()Ljava/lang/String;",
        "getStyleURI",
        "uri",
        "setStyleURI",
        "getStyleDefaultCamera",
        "()Lcom/mapbox/maps/CameraOptions;",
        "Lcom/mapbox/maps/TransitionOptions;",
        "getStyleTransition",
        "()Lcom/mapbox/maps/TransitionOptions;",
        "transitionOptions",
        "setStyleTransition",
        "(Lcom/mapbox/maps/TransitionOptions;)V",
        "removeStyleLayer",
        "styleLayerExists",
        "(Ljava/lang/String;)Z",
        "getStyleLayerProperty",
        "(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;",
        "setStyleLayerProperties",
        "source",
        "addStyleSource",
        "getStyleSourceProperties",
        "Lcom/mapbox/maps/Image;",
        "image",
        "updateStyleImageSourceImage",
        "(Ljava/lang/String;Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;",
        "getStyleLayerProperties",
        "removeStyleSource",
        "tileId",
        "Lcom/mapbox/geojson/Feature;",
        "featureCollection",
        "setStyleCustomGeometrySourceTileData",
        "(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;",
        "styleSourceExists",
        "id",
        "setStyleLightProperty",
        "Lcom/mapbox/maps/StyleObjectInfo;",
        "getStyleLights",
        "lights",
        "setStyleLights",
        "setStyleAtmosphere",
        "getStyleAtmosphereProperty",
        "setStyleAtmosphereProperty",
        "getStyleLightProperty",
        "imageId",
        "getStyleImage",
        "(Ljava/lang/String;)Lcom/mapbox/maps/Image;",
        "removeStyleImage",
        "hasStyleImage",
        "modelId",
        "modelUri",
        "addStyleModel",
        "(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;",
        "removeStyleModel",
        "hasStyleModel",
        "Lcom/mapbox/maps/RenderedQueryGeometry;",
        "Lcom/mapbox/maps/RenderedQueryOptions;",
        "Lcom/mapbox/maps/QueryRenderedFeaturesCallback;",
        "Lcom/mapbox/common/Cancelable;",
        "queryRenderedFeatures",
        "(Lcom/mapbox/maps/RenderedQueryGeometry;Lcom/mapbox/maps/RenderedQueryOptions;Lcom/mapbox/maps/QueryRenderedFeaturesCallback;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/SourceQueryOptions;",
        "Lcom/mapbox/maps/QuerySourceFeaturesCallback;",
        "querySourceFeatures",
        "(Ljava/lang/String;Lcom/mapbox/maps/SourceQueryOptions;Lcom/mapbox/maps/QuerySourceFeaturesCallback;)Lcom/mapbox/common/Cancelable;",
        "sourceIdentifier",
        "feature",
        "extension",
        "extensionField",
        "Ljava/util/HashMap;",
        "Lkotlin/collections/HashMap;",
        "args",
        "Lcom/mapbox/maps/QueryFeatureExtensionCallback;",
        "queryFeatureExtensions",
        "(Ljava/lang/String;Lcom/mapbox/geojson/Feature;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lcom/mapbox/maps/QueryFeatureExtensionCallback;)Lcom/mapbox/common/Cancelable;",
        "sourceLayerId",
        "featureId",
        "state",
        "Lcom/mapbox/maps/FeatureStateOperationCallback;",
        "setFeatureState",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/QueryFeatureStateCallback;",
        "getFeatureState",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/QueryFeatureStateCallback;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/FreeCameraOptions;",
        "getFreeCameraOptions",
        "()Lcom/mapbox/maps/FreeCameraOptions;",
        "freeCameraOptions",
        "(Lcom/mapbox/maps/FreeCameraOptions;)V",
        "invalidateStyleCustomGeometrySourceTile",
        "(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;)Lcom/mapbox/bindgen/Expected;",
        "setStyleSourceProperties",
        "dataId",
        "Lcom/mapbox/maps/GeoJSONSourceData;",
        "data",
        "setStyleGeoJSONSourceData",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/GeoJSONSourceData;)Lcom/mapbox/bindgen/Expected;",
        "stateKey",
        "removeFeatureState",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;",
        "resetFeatureStates",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/TileCacheBudget;",
        "tileCacheBudget",
        "setTileCacheBudget",
        "(Lcom/mapbox/maps/TileCacheBudget;)V",
        "Lcom/mapbox/maps/CustomGeometrySourceOptions;",
        "addStyleCustomGeometrySource",
        "(Ljava/lang/String;Lcom/mapbox/maps/CustomGeometrySourceOptions;)Lcom/mapbox/bindgen/Expected;",
        "",
        "scale",
        "sdf",
        "Lcom/mapbox/maps/ImageStretches;",
        "stretchX",
        "stretchY",
        "Lcom/mapbox/maps/ImageContent;",
        "content",
        "addStyleImage",
        "(Ljava/lang/String;FLcom/mapbox/maps/Image;ZLjava/util/List;Ljava/util/List;Lcom/mapbox/maps/ImageContent;)Lcom/mapbox/bindgen/Expected;",
        "reduceMemoryUse",
        "isUserAnimationInProgress",
        "getStyleSourceProperty",
        "isStyleLoaded",
        "setStyleSourceProperty",
        "coordinateBoundsZoomForCamera",
        "getStyleLayers",
        "getStyleSources",
        "renderWorldCopies",
        "setRenderWorldCopies",
        "getRenderWorldCopies",
        "Lcom/mapbox/maps/MapLoadedCallback;",
        "mapLoadedCallback",
        "subscribe",
        "(Lcom/mapbox/maps/MapLoadedCallback;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/MapIdleCallback;",
        "onMapIdleListener",
        "(Lcom/mapbox/maps/MapIdleCallback;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/MapLoadingErrorCallback;",
        "mapLoadingErrorCallback",
        "(Lcom/mapbox/maps/MapLoadingErrorCallback;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/StyleLoadedCallback;",
        "styleLoadedCallback",
        "(Lcom/mapbox/maps/StyleLoadedCallback;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/StyleDataLoadedCallback;",
        "styleDataLoadedCallback",
        "(Lcom/mapbox/maps/StyleDataLoadedCallback;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/SourceDataLoadedCallback;",
        "sourceDataLoadedCallback",
        "(Lcom/mapbox/maps/SourceDataLoadedCallback;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/SourceAddedCallback;",
        "sourceAddedCallback",
        "(Lcom/mapbox/maps/SourceAddedCallback;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/SourceRemovedCallback;",
        "sourceRemovedCallback",
        "(Lcom/mapbox/maps/SourceRemovedCallback;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/StyleImageMissingCallback;",
        "styleImageMissingCallback",
        "(Lcom/mapbox/maps/StyleImageMissingCallback;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;",
        "styleImageRemoveUnusedCallback",
        "(Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/CameraChangedCallback;",
        "cameraChangedCallback",
        "(Lcom/mapbox/maps/CameraChangedCallback;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/CameraChangedCoalescedCallback;",
        "cameraChangedCoalescedCallback",
        "(Lcom/mapbox/maps/CameraChangedCoalescedCallback;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/RenderFrameStartedCallback;",
        "renderFrameStartedCallback",
        "(Lcom/mapbox/maps/RenderFrameStartedCallback;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/RenderFrameFinishedCallback;",
        "renderFrameFinishedCallback",
        "(Lcom/mapbox/maps/RenderFrameFinishedCallback;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/ResourceRequestCallback;",
        "resourceRequestCallback",
        "(Lcom/mapbox/maps/ResourceRequestCallback;)Lcom/mapbox/common/Cancelable;",
        "eventName",
        "Lcom/mapbox/maps/GenericEventCallback;",
        "onGenericEventsListener",
        "(Ljava/lang/String;Lcom/mapbox/maps/GenericEventCallback;)Lcom/mapbox/common/Cancelable;",
        "getAttributions",
        "fromPoint",
        "toPoint",
        "cameraForDrag",
        "(Lcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;",
        "Lcom/mapbox/maps/MapCenterAltitudeMode;",
        "mode",
        "setCenterAltitudeMode",
        "(Lcom/mapbox/maps/MapCenterAltitudeMode;)V",
        "getCenterAltitudeMode",
        "()Lcom/mapbox/maps/MapCenterAltitudeMode;",
        "Lcom/mapbox/maps/Vec2;",
        "shape",
        "setScreenCullingShape",
        "(Ljava/util/List;)V",
        "getScreenCullingShape",
        "Lcom/mapbox/maps/PerformanceStatisticsOptions;",
        "Lcom/mapbox/maps/PerformanceStatisticsCallback;",
        "startPerformanceStatisticsCollection",
        "(Lcom/mapbox/maps/PerformanceStatisticsOptions;Lcom/mapbox/maps/PerformanceStatisticsCallback;)V",
        "stopPerformanceStatisticsCollection",
        "Ljava/util/HashSet;",
        "layerIds",
        "setViewAnnotationAvoidLayers",
        "(Ljava/util/HashSet;)Lcom/mapbox/bindgen/Expected;",
        "getViewAnnotationAvoidLayers",
        "()Ljava/util/HashSet;",
        "Lcom/mapbox/maps/Interaction;",
        "interaction",
        "addInteraction",
        "(Lcom/mapbox/maps/Interaction;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/PlatformEventInfo;",
        "platformEventInfo",
        "dispatch",
        "(Lcom/mapbox/maps/PlatformEventInfo;)V",
        "Lcom/mapbox/maps/FeaturesetDescriptor;",
        "featureset",
        "Lcom/mapbox/maps/FeaturesetFeatureId;",
        "(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;",
        "(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Lcom/mapbox/maps/QueryFeatureStateCallback;)Lcom/mapbox/common/Cancelable;",
        "(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;",
        "(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/FeaturesetQueryTarget;",
        "targets",
        "(Lcom/mapbox/maps/RenderedQueryGeometry;Ljava/util/List;Lcom/mapbox/maps/QueryRenderedFeaturesCallback;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/Map;",
        "getMap",
        "()Lcom/mapbox/maps/Map;",
        "sizeSet",
        "Z",
        "getSizeSet$maps_sdk_release",
        "setSizeSet$maps_sdk_release",
        "Ljava/util/concurrent/CopyOnWriteArrayList;",
        "sizeSetCallbackList",
        "Ljava/util/concurrent/CopyOnWriteArrayList;",
        "Landroid/os/Handler;",
        "mainHandler",
        "Landroid/os/Handler;",
        "maps-sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final mainHandler:Landroid/os/Handler;

.field private final map:Lcom/mapbox/maps/Map;

.field private volatile sizeSet:Z

.field private sizeSetCallbackList:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lc93/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/mapbox/maps/Map;)V
    .locals 1

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/NativeMapImpl;->sizeSetCallbackList:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/mapbox/maps/NativeMapImpl;->mainHandler:Landroid/os/Handler;

    return-void
.end method

.method private static final _set_sizeSet_$lambda$1(Lcom/mapbox/maps/NativeMapImpl;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/mapbox/maps/NativeMapImpl;->sizeSet:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->sizeSetCallbackList:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object p0, p0, Lcom/mapbox/maps/NativeMapImpl;->sizeSetCallbackList:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    :cond_1
    return-void
.end method

.method public static synthetic a(Lcom/mapbox/maps/NativeMapImpl;)V
    .locals 0

    invoke-static {p0}, Lcom/mapbox/maps/NativeMapImpl;->_set_sizeSet_$lambda$1(Lcom/mapbox/maps/NativeMapImpl;)V

    return-void
.end method


# virtual methods
.method public final addInteraction(Lcom/mapbox/maps/Interaction;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "interaction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Map;->addInteraction(Lcom/mapbox/maps/Interaction;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string v0, "map.addInteraction(interaction)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final addPersistentStyleCustomLayer(Ljava/lang/String;Lcom/mapbox/maps/CustomLayerHost;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/CustomLayerHost;",
            "Lcom/mapbox/maps/LayerPosition;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layerHost"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/StyleManager;->addPersistentStyleCustomLayer(Ljava/lang/String;Lcom/mapbox/maps/CustomLayerHost;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.addPersistentStyleCu\u2026layerHost, layerPosition)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final addPersistentStyleLayer(Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Value;",
            "Lcom/mapbox/maps/LayerPosition;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "properties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->addPersistentStyleLayer(Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.addPersistentStyleLa\u2026roperties, layerPosition)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final addStyleCustomGeometrySource(Ljava/lang/String;Lcom/mapbox/maps/CustomGeometrySourceOptions;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/CustomGeometrySourceOptions;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->addStyleCustomGeometrySource(Ljava/lang/String;Lcom/mapbox/maps/CustomGeometrySourceOptions;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.addStyleCustomGeomet\u2026Source(sourceId, options)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final addStyleCustomLayer(Ljava/lang/String;Lcom/mapbox/maps/CustomLayerHost;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/CustomLayerHost;",
            "Lcom/mapbox/maps/LayerPosition;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layerHost"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/StyleManager;->addStyleCustomLayer(Ljava/lang/String;Lcom/mapbox/maps/CustomLayerHost;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.addStyleCustomLayer(\u2026layerHost, layerPosition)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final addStyleImage(Ljava/lang/String;FLcom/mapbox/maps/Image;ZLjava/util/List;Ljava/util/List;Lcom/mapbox/maps/ImageContent;)Lcom/mapbox/bindgen/Expected;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "F",
            "Lcom/mapbox/maps/Image;",
            "Z",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/ImageStretches;",
            ">;",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/ImageStretches;",
            ">;",
            "Lcom/mapbox/maps/ImageContent;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "imageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stretchX"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stretchY"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-virtual/range {v1 .. v8}, Lcom/mapbox/maps/StyleManager;->addStyleImage(Ljava/lang/String;FLcom/mapbox/maps/Image;ZLjava/util/List;Ljava/util/List;Lcom/mapbox/maps/ImageContent;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.addStyleImage(imageI\u2026etchX, stretchY, content)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final addStyleLayer(Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Value;",
            "Lcom/mapbox/maps/LayerPosition;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "parameters"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->addStyleLayer(Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.addStyleLayer(parameters, layerPosition)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final addStyleModel(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "modelId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modelUri"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->addStyleModel(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.addStyleModel(modelId, modelUri)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final addStyleSource(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->addStyleSource(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.addStyleSource(sourceId, source)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final addViewAnnotation(Ljava/lang/String;Lcom/mapbox/maps/ViewAnnotationOptions;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/ViewAnnotationOptions;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/Map;->addViewAnnotation(Ljava/lang/String;Lcom/mapbox/maps/ViewAnnotationOptions;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.addViewAnnotation(identifier, options)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final cameraForCoordinateBounds(Lcom/mapbox/maps/CoordinateBounds;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;
    .locals 8

    const-string v0, "coordinateBounds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-virtual/range {v1 .. v7}, Lcom/mapbox/maps/CameraManager;->cameraForCoordinateBounds(Lcom/mapbox/maps/CoordinateBounds;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;

    move-result-object p1

    const-string p2, "map.cameraForCoordinateB\u2026, pitch, maxZoom, offset)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final cameraForCoordinates(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/bindgen/Expected;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/mapbox/geojson/Point;",
            ">;",
            "Lcom/mapbox/maps/CameraOptions;",
            "Lcom/mapbox/maps/EdgeInsets;",
            "Ljava/lang/Double;",
            "Lcom/mapbox/maps/ScreenCoordinate;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/CameraOptions;",
            ">;"
        }
    .end annotation

    const-string v0, "points"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "camera"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v1, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lcom/mapbox/maps/CameraManager;->cameraForCoordinates(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.cameraForCoordinates\u2026padding, maxZoom, offset)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final cameraForCoordinates(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/ScreenBox;)Lcom/mapbox/maps/CameraOptions;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/mapbox/geojson/Point;",
            ">;",
            "Lcom/mapbox/maps/CameraOptions;",
            "Lcom/mapbox/maps/ScreenBox;",
            ")",
            "Lcom/mapbox/maps/CameraOptions;"
        }
    .end annotation

    const-string v0, "points"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "camera"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "box"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/CameraManager;->cameraForCoordinates(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/ScreenBox;)Lcom/mapbox/maps/CameraOptions;

    move-result-object p1

    const-string p2, "map.cameraForCoordinates(points, camera, box)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final cameraForCoordinates(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/mapbox/geojson/Point;",
            ">;",
            "Lcom/mapbox/maps/EdgeInsets;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            ")",
            "Lcom/mapbox/maps/CameraOptions;"
        }
    .end annotation

    const-string v0, "points"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/mapbox/maps/CameraManager;->cameraForCoordinates(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;

    move-result-object p1

    const-string p2, "map.cameraForCoordinates\u2026 padding, bearing, pitch)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final cameraForDrag(Lcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;
    .locals 1

    const-string v0, "fromPoint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toPoint"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/CameraManager;->cameraForDrag(Lcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;

    move-result-object p1

    const-string p2, "map.cameraForDrag(fromPoint, toPoint)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final cameraForGeometry(Lcom/mapbox/geojson/Geometry;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;
    .locals 1

    const-string v0, "geometry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/mapbox/maps/CameraManager;->cameraForGeometry(Lcom/mapbox/geojson/Geometry;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;

    move-result-object p1

    const-string p2, "map.cameraForGeometry(ge\u2026 padding, bearing, pitch)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final coordinateBoundsForCamera(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CoordinateBounds;
    .locals 1

    const-string v0, "cameraOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/CameraManager;->coordinateBoundsForCamera(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CoordinateBounds;

    move-result-object p1

    const-string v0, "map.coordinateBoundsForCamera(cameraOptions)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final coordinateBoundsForCameraUnwrapped(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CoordinateBounds;
    .locals 1

    const-string v0, "cameraOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/CameraManager;->coordinateBoundsForCameraUnwrapped(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CoordinateBounds;

    move-result-object p1

    const-string v0, "map.coordinateBoundsForC\u2026aUnwrapped(cameraOptions)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final coordinateBoundsZoomForCamera(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CoordinateBoundsZoom;
    .locals 1

    const-string v0, "camera"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/CameraManager;->coordinateBoundsZoomForCamera(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CoordinateBoundsZoom;

    move-result-object p1

    const-string v0, "map.coordinateBoundsZoomForCamera(camera)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final coordinateBoundsZoomForCameraUnwrapped(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CoordinateBoundsZoom;
    .locals 1

    const-string v0, "cameraOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/CameraManager;->coordinateBoundsZoomForCameraUnwrapped(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CoordinateBoundsZoom;

    move-result-object p1

    const-string v0, "map.coordinateBoundsZoom\u2026aUnwrapped(cameraOptions)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final coordinateForPixel(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/geojson/Point;
    .locals 1

    const-string v0, "screenCoordinate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/CameraManager;->coordinateForPixel(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/geojson/Point;

    move-result-object p1

    const-string v0, "map.coordinateForPixel(screenCoordinate)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final coordinateInfoForPixel(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CoordinateInfo;
    .locals 1

    const-string v0, "pixel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/CameraManager;->coordinateInfoForPixel(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CoordinateInfo;

    move-result-object p1

    const-string v0, "map.coordinateInfoForPixel(pixel)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final coordinatesForPixels(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/ScreenCoordinate;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/mapbox/geojson/Point;",
            ">;"
        }
    .end annotation

    const-string v0, "pixels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/CameraManager;->coordinatesForPixels(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    const-string v0, "map.coordinatesForPixels(pixels)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final coordinatesInfoForPixels(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/ScreenCoordinate;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/CoordinateInfo;",
            ">;"
        }
    .end annotation

    const-string v0, "pixels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/CameraManager;->coordinatesInfoForPixels(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    const-string v0, "map.coordinatesInfoForPixels(pixels)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final createRenderer()V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/Map;->createRenderer()V

    return-void
.end method

.method public final destroyRenderer()V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/Map;->destroyRenderer()V

    return-void
.end method

.method public final dispatch(Lcom/mapbox/maps/PlatformEventInfo;)V
    .locals 1

    const-string v0, "platformEventInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Map;->dispatch(Lcom/mapbox/maps/PlatformEventInfo;)V

    return-void
.end method

.method public final getAttributions()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/Map;->getAttributions()Ljava/util/List;

    move-result-object v0

    const-string v1, "map.attributions"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getBounds()Lcom/mapbox/maps/CameraBounds;
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraManager;->getBounds()Lcom/mapbox/maps/CameraBounds;

    move-result-object v0

    const-string v1, "map.bounds"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getCameraState()Lcom/mapbox/maps/CameraState;
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraManager;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v0

    const-string v1, "map.cameraState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getCenterAltitudeMode()Lcom/mapbox/maps/MapCenterAltitudeMode;
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/Map;->getCenterAltitudeMode()Lcom/mapbox/maps/MapCenterAltitudeMode;

    move-result-object v0

    const-string v1, "map.centerAltitudeMode"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getDebug()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/MapDebugOptions;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/Map;->getDebug()Ljava/util/List;

    move-result-object v0

    const-string v1, "map.debug"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getElevation(Lcom/mapbox/geojson/Point;)Ljava/lang/Double;
    .locals 1

    const-string v0, "point"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Map;->getElevation(Lcom/mapbox/geojson/Point;)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public final getFeatureState(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Lcom/mapbox/maps/QueryFeatureStateCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "featureset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/Map;->getFeatureState(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Lcom/mapbox/maps/QueryFeatureStateCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string p2, "map.getFeatureState(feat\u2026set, featureId, callback)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getFeatureState(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/QueryFeatureStateCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/mapbox/maps/Map;->getFeatureState(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/QueryFeatureStateCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string p2, "map.getFeatureState(sour\u2026rId, featureId, callback)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getFreeCameraOptions()Lcom/mapbox/maps/FreeCameraOptions;
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraManager;->getFreeCameraOptions()Lcom/mapbox/maps/FreeCameraOptions;

    move-result-object v0

    const-string v1, "map.freeCameraOptions"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getMap()Lcom/mapbox/maps/Map;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    return-object v0
.end method

.method public final getMapOptions()Lcom/mapbox/maps/MapOptions;
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/Map;->getMapOptions()Lcom/mapbox/maps/MapOptions;

    move-result-object v0

    const-string v1, "map.mapOptions"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getPrefetchZoomDelta()B
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/Map;->getPrefetchZoomDelta()B

    move-result v0

    return v0
.end method

.method public final getRenderWorldCopies()Z
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraManager;->getRenderWorldCopies()Z

    move-result v0

    return v0
.end method

.method public final getScreenCullingShape()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/Vec2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/Map;->getScreenCullingShape()Ljava/util/List;

    move-result-object v0

    const-string v1, "map.screenCullingShape"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getSize()Lcom/mapbox/maps/Size;
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/Map;->getSize()Lcom/mapbox/maps/Size;

    move-result-object v0

    const-string v1, "map.size"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getSizeSet$maps_sdk_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mapbox/maps/NativeMapImpl;->sizeSet:Z

    return v0
.end method

.method public final getStyleAtmosphereProperty(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;
    .locals 1

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->getStyleAtmosphereProperty(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;

    move-result-object p1

    const-string v0, "map.getStyleAtmosphereProperty(property)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getStyleDefaultCamera()Lcom/mapbox/maps/CameraOptions;
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/StyleManager;->getStyleDefaultCamera()Lcom/mapbox/maps/CameraOptions;

    move-result-object v0

    const-string v1, "map.styleDefaultCamera"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getStyleImage(Ljava/lang/String;)Lcom/mapbox/maps/Image;
    .locals 1

    const-string v0, "imageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->getStyleImage(Ljava/lang/String;)Lcom/mapbox/maps/Image;

    move-result-object p1

    return-object p1
.end method

.method public final getStyleJSON()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/StyleManager;->getStyleJSON()Ljava/lang/String;

    move-result-object v0

    const-string v1, "map.styleJSON"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getStyleLayerProperties(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->getStyleLayerProperties(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "map.getStyleLayerProperties(layerId)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getStyleLayerProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;
    .locals 1

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->getStyleLayerProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;

    move-result-object p1

    const-string p2, "map.getStyleLayerProperty(layerId, property)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getStyleLayers()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/StyleObjectInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/StyleManager;->getStyleLayers()Ljava/util/List;

    move-result-object v0

    const-string v1, "map.styleLayers"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getStyleLightProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->getStyleLightProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;

    move-result-object p1

    const-string p2, "map.getStyleLightProperty(id, property)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getStyleLights()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/StyleObjectInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/StyleManager;->getStyleLights()Ljava/util/List;

    move-result-object v0

    const-string v1, "map.styleLights"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getStyleProjectionProperty(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;
    .locals 1

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->getStyleProjectionProperty(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;

    move-result-object p1

    const-string v0, "map.getStyleProjectionProperty(property)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getStyleSourceProperties(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->getStyleSourceProperties(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "map.getStyleSourceProperties(sourceId)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getStyleSourceProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;
    .locals 1

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->getStyleSourceProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;

    move-result-object p1

    const-string p2, "map.getStyleSourceProperty(sourceId, property)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getStyleSources()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/StyleObjectInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/StyleManager;->getStyleSources()Ljava/util/List;

    move-result-object v0

    const-string v1, "map.styleSources"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getStyleTerrainProperty(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;
    .locals 1

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->getStyleTerrainProperty(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;

    move-result-object p1

    const-string v0, "map.getStyleTerrainProperty(property)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getStyleTransition()Lcom/mapbox/maps/TransitionOptions;
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/StyleManager;->getStyleTransition()Lcom/mapbox/maps/TransitionOptions;

    move-result-object v0

    const-string v1, "map.styleTransition"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getStyleURI()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/StyleManager;->getStyleURI()Ljava/lang/String;

    move-result-object v0

    const-string v1, "map.styleURI"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getViewAnnotationAvoidLayers()Ljava/util/HashSet;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/Map;->getViewAnnotationAvoidLayers()Ljava/util/HashSet;

    move-result-object v0

    const-string v1, "map.viewAnnotationAvoidLayers"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getViewAnnotationOptions(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/ViewAnnotationOptions;",
            ">;"
        }
    .end annotation

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Map;->getViewAnnotationOptions(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "map.getViewAnnotationOptions(identifier)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final hasStyleImage(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "imageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->hasStyleImage(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final hasStyleModel(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "modelId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->hasStyleModel(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final invalidateStyleCustomGeometrySourceRegion(Ljava/lang/String;Lcom/mapbox/maps/CoordinateBounds;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/CoordinateBounds;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coordinateBounds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->invalidateStyleCustomGeometrySourceRegion(Ljava/lang/String;Lcom/mapbox/maps/CoordinateBounds;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.invalidateStyleCusto\u2026urceId, coordinateBounds)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final invalidateStyleCustomGeometrySourceTile(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/CanonicalTileID;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tileId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->invalidateStyleCustomGeometrySourceTile(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.invalidateStyleCusto\u2026rceTile(sourceId, tileId)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final isGestureInProgress()Z
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/Map;->isGestureInProgress()Z

    move-result v0

    return v0
.end method

.method public final isStyleLayerPersistent(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->isStyleLayerPersistent(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "map.isStyleLayerPersistent(layerId)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final isStyleLoaded()Z
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/StyleManager;->isStyleLoaded()Z

    move-result v0

    return v0
.end method

.method public final isUserAnimationInProgress()Z
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/Map;->isUserAnimationInProgress()Z

    move-result v0

    return v0
.end method

.method public final moveStyleLayer(Ljava/lang/String;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/LayerPosition;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->moveStyleLayer(Ljava/lang/String;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.moveStyleLayer(layerId, layerPosition)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final pixelForCoordinate(Lcom/mapbox/geojson/Point;)Lcom/mapbox/maps/ScreenCoordinate;
    .locals 1

    const-string v0, "pixel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/CameraManager;->pixelForCoordinate(Lcom/mapbox/geojson/Point;)Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object p1

    const-string v0, "map.pixelForCoordinate((pixel))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final pixelsForCoordinates(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/mapbox/geojson/Point;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/ScreenCoordinate;",
            ">;"
        }
    .end annotation

    const-string v0, "coordinates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/CameraManager;->pixelsForCoordinates(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    const-string v0, "map.pixelsForCoordinates(coordinates)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final queryFeatureExtensions(Ljava/lang/String;Lcom/mapbox/geojson/Feature;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lcom/mapbox/maps/QueryFeatureExtensionCallback;)Lcom/mapbox/common/Cancelable;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/geojson/Feature;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ">;",
            "Lcom/mapbox/maps/QueryFeatureExtensionCallback;",
            ")",
            "Lcom/mapbox/common/Cancelable;"
        }
    .end annotation

    const-string v0, "sourceIdentifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "feature"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extension"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extensionField"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-virtual/range {v1 .. v7}, Lcom/mapbox/maps/Map;->queryFeatureExtensions(Ljava/lang/String;Lcom/mapbox/geojson/Feature;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lcom/mapbox/maps/QueryFeatureExtensionCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string p2, "map.queryFeatureExtensio\u2026ionField, args, callback)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final queryRenderedFeatures(Lcom/mapbox/maps/RenderedQueryGeometry;Lcom/mapbox/maps/RenderedQueryOptions;Lcom/mapbox/maps/QueryRenderedFeaturesCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "geometry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/Map;->queryRenderedFeatures(Lcom/mapbox/maps/RenderedQueryGeometry;Lcom/mapbox/maps/RenderedQueryOptions;Lcom/mapbox/maps/QueryRenderedFeaturesCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string p2, "map.queryRenderedFeature\u2026metry, options, callback)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final queryRenderedFeatures(Lcom/mapbox/maps/RenderedQueryGeometry;Ljava/util/List;Lcom/mapbox/maps/QueryRenderedFeaturesCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/RenderedQueryGeometry;",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/FeaturesetQueryTarget;",
            ">;",
            "Lcom/mapbox/maps/QueryRenderedFeaturesCallback;",
            ")",
            "Lcom/mapbox/common/Cancelable;"
        }
    .end annotation

    const-string v0, "geometry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "targets"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/Map;->queryRenderedFeatures(Lcom/mapbox/maps/RenderedQueryGeometry;Ljava/util/List;Lcom/mapbox/maps/QueryRenderedFeaturesCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string p2, "map.queryRenderedFeature\u2026metry, targets, callback)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final querySourceFeatures(Ljava/lang/String;Lcom/mapbox/maps/SourceQueryOptions;Lcom/mapbox/maps/QuerySourceFeaturesCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/Map;->querySourceFeatures(Ljava/lang/String;Lcom/mapbox/maps/SourceQueryOptions;Lcom/mapbox/maps/QuerySourceFeaturesCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string p2, "map.querySourceFeatures(\u2026rceId, options, callback)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final reduceMemoryUse()V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/Map;->reduceMemoryUse()V

    return-void
.end method

.method public final removeFeatureState(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "featureset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/mapbox/maps/Map;->removeFeatureState(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string p2, "map.removeFeatureState(f\u2026reId, stateKey, callback)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final removeFeatureState(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;
    .locals 7

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v1, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lcom/mapbox/maps/Map;->removeFeatureState(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string p2, "map.removeFeatureState(s\u2026reId, stateKey, callback)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final removeStyleImage(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "imageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->removeStyleImage(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "map.removeStyleImage(imageId)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final removeStyleLayer(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->removeStyleLayer(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "map.removeStyleLayer(layerId)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final removeStyleModel(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "modelId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->removeStyleModel(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "map.removeStyleModel(modelId)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final removeStyleSource(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->removeStyleSource(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "map.removeStyleSource(sourceId)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final removeViewAnnotation(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Map;->removeViewAnnotation(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "map.removeViewAnnotation(identifier)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final render()V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/Map;->render()V

    return-void
.end method

.method public final resetFeatureStates(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "featureset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/Map;->resetFeatureStates(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string p2, "map.resetFeatureStates(featureset, callback)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final resetFeatureStates(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/Map;->resetFeatureStates(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string p2, "map.resetFeatureStates(s\u2026 sourceLayerId, callback)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final setBounds(Lcom/mapbox/maps/CameraBoundsOptions;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/CameraBoundsOptions;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "boundOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/CameraManager;->setBounds(Lcom/mapbox/maps/CameraBoundsOptions;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "map.setBounds(boundOptions)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final setCamera(Lcom/mapbox/maps/CameraOptions;)V
    .locals 1

    const-string v0, "cameraOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/CameraManager;->setCamera(Lcom/mapbox/maps/CameraOptions;)V

    return-void
.end method

.method public final setCamera(Lcom/mapbox/maps/FreeCameraOptions;)V
    .locals 1

    const-string v0, "freeCameraOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/CameraManager;->setCamera(Lcom/mapbox/maps/FreeCameraOptions;)V

    return-void
.end method

.method public final setCameraAnimationHint(Lcom/mapbox/maps/CameraAnimationHint;)V
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    const-string v0, "cameraAnimationHint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Map;->setCameraAnimationHint(Lcom/mapbox/maps/CameraAnimationHint;)V

    return-void
.end method

.method public final setCenterAltitudeMode(Lcom/mapbox/maps/MapCenterAltitudeMode;)V
    .locals 1

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Map;->setCenterAltitudeMode(Lcom/mapbox/maps/MapCenterAltitudeMode;)V

    return-void
.end method

.method public final setConstrainMode(Lcom/mapbox/maps/ConstrainMode;)V
    .locals 1

    const-string v0, "constrainMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Map;->setConstrainMode(Lcom/mapbox/maps/ConstrainMode;)V

    return-void
.end method

.method public final setDebug(Ljava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/mapbox/maps/MapDebugOptions;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/Map;->setDebug(Ljava/util/List;Z)V

    return-void
.end method

.method public final setFeatureState(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "featureset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/mapbox/maps/Map;->setFeatureState(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string p2, "map.setFeatureState(feat\u2026atureId, state, callback)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final setFeatureState(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;
    .locals 7

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v1, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lcom/mapbox/maps/Map;->setFeatureState(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string p2, "map.setFeatureState(sour\u2026atureId, state, callback)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final setGestureInProgress(Z)V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Map;->setGestureInProgress(Z)V

    return-void
.end method

.method public final setNorthOrientation(Lcom/mapbox/maps/NorthOrientation;)V
    .locals 1

    const-string v0, "northOrientation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Map;->setNorthOrientation(Lcom/mapbox/maps/NorthOrientation;)V

    return-void
.end method

.method public final setPrefetchZoomDelta(B)V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Map;->setPrefetchZoomDelta(B)V

    return-void
.end method

.method public final setRenderWorldCopies(Z)V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/CameraManager;->setRenderWorldCopies(Z)V

    return-void
.end method

.method public final setScreenCullingShape(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/Vec2;",
            ">;)V"
        }
    .end annotation

    const-string v0, "shape"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Map;->setScreenCullingShape(Ljava/util/List;)V

    return-void
.end method

.method public final setSize(Lcom/mapbox/maps/Size;)V
    .locals 1

    const-string v0, "size"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Map;->setSize(Lcom/mapbox/maps/Size;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/mapbox/maps/NativeMapImpl;->setSizeSet$maps_sdk_release(Z)V

    return-void
.end method

.method public final declared-synchronized setSizeSet$maps_sdk_release(Z)V
    .locals 3

    monitor-enter p0

    if-eqz p1, :cond_2

    :try_start_0
    iget-boolean v0, p0, Lcom/mapbox/maps/NativeMapImpl;->sizeSet:Z

    if-nez v0, :cond_2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->mainHandler:Landroid/os/Handler;

    new-instance v1, Landroidx/fragment/app/m;

    const/16 v2, 0x10

    invoke-direct {v1, p0, v2}, Landroidx/fragment/app/m;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->sizeSetCallbackList:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->sizeSetCallbackList:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    :cond_2
    :goto_1
    iput-boolean p1, p0, Lcom/mapbox/maps/NativeMapImpl;->sizeSet:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final setStyleAtmosphere(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "properties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->setStyleAtmosphere(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "map.setStyleAtmosphere(properties)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final setStyleAtmosphereProperty(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->setStyleAtmosphereProperty(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.setStyleAtmosphereProperty(property, value)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final setStyleCustomGeometrySourceTileData(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/CanonicalTileID;",
            "Ljava/util/List<",
            "Lcom/mapbox/geojson/Feature;",
            ">;)",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tileId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureCollection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/StyleManager;->setStyleCustomGeometrySourceTileData(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.setStyleCustomGeomet\u2026ileId, featureCollection)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final setStyleGeoJSONSourceData(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/GeoJSONSourceData;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/GeoJSONSourceData;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/StyleManager;->setStyleGeoJSONSourceData(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/GeoJSONSourceData;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.setStyleGeoJSONSourc\u2026a(sourceId, dataId, data)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final setStyleJSON(Ljava/lang/String;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->setStyleJSON(Ljava/lang/String;)V

    return-void
.end method

.method public final setStyleLayerProperties(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "properties"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->setStyleLayerProperties(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.setStyleLayerProperties(layerId, properties)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final setStyleLayerProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/StyleManager;->setStyleLayerProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.setStyleLayerPropert\u2026layerId, property, value)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final setStyleLightProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/StyleManager;->setStyleLightProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.setStyleLightProperty(id, property, value)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final setStyleLights(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "lights"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->setStyleLights(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "map.setStyleLights(lights)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final setStyleProjection(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "properties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->setStyleProjection(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "map.setStyleProjection(properties)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final setStyleProjectionProperty(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->setStyleProjectionProperty(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.setStyleProjectionProperty(property, value)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final setStyleSourceProperties(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "properties"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->setStyleSourceProperties(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.setStyleSourceProperties(sourceId, properties)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final setStyleSourceProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/StyleManager;->setStyleSourceProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.setStyleSourceProper\u2026ourceId, property, value)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final setStyleTerrain(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "properties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->setStyleTerrain(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "map.setStyleTerrain(properties)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final setStyleTerrainProperty(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->setStyleTerrainProperty(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.setStyleTerrainProperty(property, value)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final setStyleTransition(Lcom/mapbox/maps/TransitionOptions;)V
    .locals 1

    const-string v0, "transitionOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->setStyleTransition(Lcom/mapbox/maps/TransitionOptions;)V

    return-void
.end method

.method public final setStyleURI(Ljava/lang/String;)V
    .locals 1

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->setStyleURI(Ljava/lang/String;)V

    return-void
.end method

.method public final setTileCacheBudget(Lcom/mapbox/maps/TileCacheBudget;)V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Map;->setTileCacheBudget(Lcom/mapbox/maps/TileCacheBudget;)V

    return-void
.end method

.method public final setUserAnimationInProgress(Z)V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Map;->setUserAnimationInProgress(Z)V

    return-void
.end method

.method public final setViewAnnotationAvoidLayers(Ljava/util/HashSet;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Map;->setViewAnnotationAvoidLayers(Ljava/util/HashSet;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "map.setViewAnnotationAvoidLayers(layerIds)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final setViewAnnotationPositionsUpdateListener(Lcom/mapbox/maps/ViewAnnotationPositionsUpdateListener;)V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Map;->setViewAnnotationPositionsUpdateListener(Lcom/mapbox/maps/ViewAnnotationPositionsUpdateListener;)V

    return-void
.end method

.method public final setViewportMode(Lcom/mapbox/maps/ViewportMode;)V
    .locals 1

    const-string v0, "viewportMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Map;->setViewportMode(Lcom/mapbox/maps/ViewportMode;)V

    return-void
.end method

.method public final startPerformanceStatisticsCollection(Lcom/mapbox/maps/PerformanceStatisticsOptions;Lcom/mapbox/maps/PerformanceStatisticsCallback;)V
    .locals 1

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/Map;->startPerformanceStatisticsCollection(Lcom/mapbox/maps/PerformanceStatisticsOptions;Lcom/mapbox/maps/PerformanceStatisticsCallback;)V

    return-void
.end method

.method public final stopPerformanceStatisticsCollection()V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/Map;->stopPerformanceStatisticsCollection()V

    return-void
.end method

.method public final styleLayerExists(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->styleLayerExists(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final styleSourceExists(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->styleSourceExists(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final subscribe(Lcom/mapbox/maps/CameraChangedCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "cameraChangedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Observable;->subscribe(Lcom/mapbox/maps/CameraChangedCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string v0, "map.subscribe(cameraChangedCallback)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final subscribe(Lcom/mapbox/maps/CameraChangedCoalescedCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "cameraChangedCoalescedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Observable;->subscribe(Lcom/mapbox/maps/CameraChangedCoalescedCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string v0, "map.subscribe(cameraChangedCoalescedCallback)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final subscribe(Lcom/mapbox/maps/MapIdleCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "onMapIdleListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Observable;->subscribe(Lcom/mapbox/maps/MapIdleCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string v0, "map.subscribe(onMapIdleListener)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final subscribe(Lcom/mapbox/maps/MapLoadedCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "mapLoadedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Observable;->subscribe(Lcom/mapbox/maps/MapLoadedCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string v0, "map.subscribe(mapLoadedCallback)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final subscribe(Lcom/mapbox/maps/MapLoadingErrorCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "mapLoadingErrorCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Observable;->subscribe(Lcom/mapbox/maps/MapLoadingErrorCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string v0, "map.subscribe(mapLoadingErrorCallback)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final subscribe(Lcom/mapbox/maps/RenderFrameFinishedCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "renderFrameFinishedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Observable;->subscribe(Lcom/mapbox/maps/RenderFrameFinishedCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string v0, "map.subscribe(renderFrameFinishedCallback)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final subscribe(Lcom/mapbox/maps/RenderFrameStartedCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "renderFrameStartedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Observable;->subscribe(Lcom/mapbox/maps/RenderFrameStartedCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string v0, "map.subscribe(renderFrameStartedCallback)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final subscribe(Lcom/mapbox/maps/ResourceRequestCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "resourceRequestCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Observable;->subscribe(Lcom/mapbox/maps/ResourceRequestCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string v0, "map.subscribe(resourceRequestCallback)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final subscribe(Lcom/mapbox/maps/SourceAddedCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "sourceAddedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Observable;->subscribe(Lcom/mapbox/maps/SourceAddedCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string v0, "map.subscribe(sourceAddedCallback)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final subscribe(Lcom/mapbox/maps/SourceDataLoadedCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "sourceDataLoadedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Observable;->subscribe(Lcom/mapbox/maps/SourceDataLoadedCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string v0, "map.subscribe(sourceDataLoadedCallback)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final subscribe(Lcom/mapbox/maps/SourceRemovedCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "sourceRemovedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Observable;->subscribe(Lcom/mapbox/maps/SourceRemovedCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string v0, "map.subscribe(sourceRemovedCallback)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final subscribe(Lcom/mapbox/maps/StyleDataLoadedCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "styleDataLoadedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Observable;->subscribe(Lcom/mapbox/maps/StyleDataLoadedCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string v0, "map.subscribe(styleDataLoadedCallback)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final subscribe(Lcom/mapbox/maps/StyleImageMissingCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "styleImageMissingCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Observable;->subscribe(Lcom/mapbox/maps/StyleImageMissingCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string v0, "map.subscribe(styleImageMissingCallback)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final subscribe(Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "styleImageRemoveUnusedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Observable;->subscribe(Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string v0, "map.subscribe(styleImageRemoveUnusedCallback)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final subscribe(Lcom/mapbox/maps/StyleLoadedCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1

    const-string v0, "styleLoadedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/Observable;->subscribe(Lcom/mapbox/maps/StyleLoadedCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string v0, "map.subscribe(styleLoadedCallback)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final subscribe(Ljava/lang/String;Lcom/mapbox/maps/GenericEventCallback;)Lcom/mapbox/common/Cancelable;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    const-string v0, "eventName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onGenericEventsListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/Observable;->subscribe(Ljava/lang/String;Lcom/mapbox/maps/GenericEventCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    const-string p2, "map.subscribe(eventName, onGenericEventsListener)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final tileCover(Lcom/mapbox/maps/TileCoverOptions;Lcom/mapbox/maps/CameraOptions;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/TileCoverOptions;",
            "Lcom/mapbox/maps/CameraOptions;",
            ")",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/CanonicalTileID;",
            ">;"
        }
    .end annotation

    const-string v0, "tileCoverOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/CameraManager;->tileCover(Lcom/mapbox/maps/TileCoverOptions;Lcom/mapbox/maps/CameraOptions;)Ljava/util/List;

    move-result-object p1

    const-string p2, "map.tileCover(tileCoverOptions, cameraOptions)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final triggerRepaint()V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/Map;->triggerRepaint()V

    return-void
.end method

.method public final updateStyleImageSourceImage(Ljava/lang/String;Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/Image;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->updateStyleImageSourceImage(Ljava/lang/String;Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.updateStyleImageSourceImage(sourceId, image)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final updateViewAnnotation(Ljava/lang/String;Lcom/mapbox/maps/ViewAnnotationOptions;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/ViewAnnotationOptions;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->map:Lcom/mapbox/maps/Map;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/Map;->updateViewAnnotation(Ljava/lang/String;Lcom/mapbox/maps/ViewAnnotationOptions;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "map.updateViewAnnotation(identifier, options)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final whenMapSizeReady(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/mapbox/maps/NativeMapImpl;->sizeSet:Z

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :cond_0
    iget-object v0, p0, Lcom/mapbox/maps/NativeMapImpl;->sizeSetCallbackList:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
