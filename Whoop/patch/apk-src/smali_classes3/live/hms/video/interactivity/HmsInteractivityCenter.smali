.class public final Llive/hms/video/interactivity/HmsInteractivityCenter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010!\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u00eb\u0003\u0008\u0000\u0012\"\u0010\u0006\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\"\u0010\t\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\"\u0010\u000c\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\"\u0010\r\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\"\u0010\u0010\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\"\u0010\u0013\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00120\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\"\u0010\u0015\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\"\u0010\u0018\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00170\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\"\u0010\u001a\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00190\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u00120\u0010\u001f\u001a,\u0008\u0001\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001e0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b\u0012\"\u0010\"\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020 \u0012\n\u0012\u0008\u0012\u0004\u0012\u00020!0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\"\u0010$\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020#0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020&0%\u0012\u0006\u0010)\u001a\u00020(\u0012\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020*0%\u00a2\u0006\u0004\u0008,\u0010-J\u001d\u00103\u001a\u00020\u000b2\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u00020/0.H\u0000\u00a2\u0006\u0004\u00081\u00102J\u001d\u00108\u001a\u00020\u000b2\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206\u00a2\u0006\u0004\u00088\u00109J\u001d\u0010<\u001a\u00020\u000b2\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u00020:0.H\u0000\u00a2\u0006\u0004\u0008;\u00102J\u000f\u0010?\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\u0008=\u0010>J\u001d\u0010@\u001a\u00020\u000b2\u0006\u00105\u001a\u00020:2\u0006\u00107\u001a\u000206\u00a2\u0006\u0004\u0008@\u0010AJ#\u0010D\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\u000e2\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u000f0C\u00a2\u0006\u0004\u0008D\u0010EJE\u0010J\u001a\u00020\u000b2\u0006\u00105\u001a\u00020:2\u0008\u0008\u0002\u0010F\u001a\u00020\u001d2\u0008\u0008\u0003\u0010G\u001a\u00020\u001d2\u0006\u0010H\u001a\u00020*2\u0012\u00107\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020I0.0C\u00a2\u0006\u0004\u0008J\u0010KJ#\u0010\u0015\u001a\u00020\u000b2\u0006\u00105\u001a\u00020:2\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020:0C\u00a2\u0006\u0004\u0008\u0015\u0010LJA\u0010Q\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020\n2\u0008\u0008\u0002\u0010G\u001a\u00020N2\u0008\u0008\u0002\u0010O\u001a\u00020N2\u0008\u0008\u0002\u0010P\u001a\u00020*2\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u00170C\u00a2\u0006\u0004\u0008Q\u0010RJ)\u0010T\u001a\u00020\u000b2\u0006\u00105\u001a\u00020:2\u0012\u00107\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020S0.0C\u00a2\u0006\u0004\u0008T\u0010LJ)\u0010V\u001a\u00020\u000b2\u0006\u0010U\u001a\u00020\u001c2\u0012\u00107\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020:0.0C\u00a2\u0006\u0004\u0008V\u0010WJA\u0010_\u001a\u00020\u000b2\u000c\u0010Y\u001a\u0008\u0012\u0004\u0012\u00020X0.2\n\u0008\u0002\u0010Z\u001a\u0004\u0018\u00010N2\n\u0008\u0002\u0010[\u001a\u0004\u0018\u00010N2\n\u0008\u0002\u0010\\\u001a\u0004\u0018\u00010NH\u0000\u00a2\u0006\u0004\u0008]\u0010^J\u0017\u0010b\u001a\u00020\u000b2\u0008\u0010a\u001a\u0004\u0018\u00010`\u00a2\u0006\u0004\u0008b\u0010cJ\u0017\u0010d\u001a\u00020\u000b2\u0008\u0010a\u001a\u0004\u0018\u00010`\u00a2\u0006\u0004\u0008d\u0010cJ\u001d\u0010f\u001a\u00020\u000b2\u0006\u0010e\u001a\u00020\n2\u0006\u00107\u001a\u000206\u00a2\u0006\u0004\u0008f\u0010gJ\u0015\u0010h\u001a\u00020\u000b2\u0006\u00107\u001a\u000206\u00a2\u0006\u0004\u0008h\u0010iJ\u0017\u0010n\u001a\u00020\u000b2\u0006\u0010k\u001a\u00020jH\u0001\u00a2\u0006\u0004\u0008l\u0010mJ\u0018\u0010o\u001a\u00020\u00032\u0006\u00105\u001a\u000204H\u0082@\u00a2\u0006\u0004\u0008o\u0010pJQ\u0010u\u001a\u00020\u000b\"\u0004\u0008\u0000\u0010q\"\u0004\u0008\u0001\u0010r2\u0006\u0010s\u001a\u00028\u00002$\u0010t\u001a \u0008\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u0006\u00107\u001a\u000206H\u0002\u00a2\u0006\u0004\u0008u\u0010vJW\u0010u\u001a\u00020\u000b\"\u0004\u0008\u0000\u0010q\"\u0004\u0008\u0001\u0010r2\u0006\u0010s\u001a\u00028\u00002$\u0010t\u001a \u0008\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00028\u00010CH\u0002\u00a2\u0006\u0004\u0008u\u0010wJ\u000f\u0010x\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008x\u0010>J@\u0010{\u001a\u0008\u0012\u0004\u0012\u00020z0.2\u0006\u0010U\u001a\u00020\u001c2\u0006\u0010G\u001a\u00020\u001d2\u0008\u0010y\u001a\u0004\u0018\u00010\n2\u000e\u0008\u0002\u00100\u001a\u0008\u0012\u0004\u0012\u00020z0.H\u0082P\u00a2\u0006\u0004\u0008{\u0010|J\u001b\u0010~\u001a\u00020 2\n\u0008\u0002\u0010}\u001a\u0004\u0018\u00010 H\u0002\u00a2\u0006\u0004\u0008~\u0010\u007fJ$\u0010\u0082\u0001\u001a\u00020\n2\u0007\u0010\u0080\u0001\u001a\u00020\n2\u0007\u0010\u0081\u0001\u001a\u00020\nH\u0002\u00a2\u0006\u0006\u0008\u0082\u0001\u0010\u0083\u0001R1\u0010\u0006\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0006\u0010\u0084\u0001R1\u0010\t\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\t\u0010\u0084\u0001R1\u0010\u000c\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u000c\u0010\u0084\u0001R1\u0010\r\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\r\u0010\u0084\u0001R1\u0010\u0010\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0010\u0010\u0084\u0001R1\u0010\u0013\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00120\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0013\u0010\u0084\u0001R1\u0010\u0015\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0015\u0010\u0084\u0001R1\u0010\u0018\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00170\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0018\u0010\u0084\u0001R1\u0010\u001a\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00190\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u001a\u0010\u0084\u0001R?\u0010\u001f\u001a,\u0008\u0001\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001e0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u001f\u0010\u0085\u0001R1\u0010\"\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020 \u0012\n\u0012\u0008\u0012\u0004\u0012\u00020!0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\"\u0010\u0084\u0001R1\u0010$\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020#0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008$\u0010\u0084\u0001R\u001b\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\'\u0010\u0086\u0001R\u0015\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008)\u0010\u0087\u0001R\u001b\u0010+\u001a\u0008\u0012\u0004\u0012\u00020*0%8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008+\u0010\u0086\u0001R\u0019\u0010a\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008a\u0010\u0088\u0001R\u001c\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008a\u0001\u0010\u008b\u0001R,\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u008d\u0001\u0010\u008e\u0001\u001a\u0006\u0008\u008f\u0001\u0010\u0090\u0001\"\u0006\u0008\u0091\u0001\u0010\u0092\u0001R\u001e\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020:0\u0093\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0094\u0001\u0010\u0095\u0001R \u00100\u001a\u0008\u0012\u0004\u0012\u00020:0.8\u0006\u00a2\u0006\u000f\n\u0005\u00080\u0010\u0095\u0001\u001a\u0006\u0008\u0096\u0001\u0010\u0097\u0001R)\u0010\u0098\u0001\u001a\u00020*8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0098\u0001\u0010\u0099\u0001\u001a\u0006\u0008\u009a\u0001\u0010\u009b\u0001\"\u0006\u0008\u009c\u0001\u0010\u009d\u0001R*\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u009f\u0001\u0010\u00a0\u0001\u001a\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001\"\u0006\u0008\u00a3\u0001\u0010\u00a4\u0001\u00a8\u0006\u00a5\u0001"
    }
    d2 = {
        "Llive/hms/video/interactivity/HmsInteractivityCenter;",
        "",
        "Lkotlin/Function2;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;",
        "Lq83/d;",
        "Llive/hms/video/polls/network/PollCreateResponse;",
        "pollCreate",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;",
        "Llive/hms/video/polls/network/SetQuestionsResponse;",
        "addQuestion",
        "",
        "Ll83/a0;",
        "startPoll",
        "stopPoll",
        "Llive/hms/video/polls/HMSPollResponseBuilder;",
        "Llive/hms/video/polls/models/answer/PollAnswerResponse;",
        "sendAnswers",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;",
        "Llive/hms/video/polls/network/PollGetResponsesReply;",
        "getResponsesInternal",
        "Llive/hms/video/polls/network/PollResultsResponse;",
        "getPollResults",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;",
        "Llive/hms/video/polls/network/PollLeaderboardResponse;",
        "getLeaderboard",
        "Llive/hms/video/polls/network/QuestionContainer;",
        "getAllPollQuestions",
        "Lkotlin/Function4;",
        "Llive/hms/video/polls/models/HmsPollState;",
        "",
        "Llive/hms/video/polls/network/PollListResponse;",
        "pollGetList",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;",
        "Llive/hms/video/whiteboard/network/HMSCreateWhiteBoardResponse;",
        "createWhiteBoard",
        "Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;",
        "getWhiteBoard",
        "Lkotlin/Function0;",
        "Llive/hms/video/transport/models/TransportState;",
        "getTransportState",
        "Llive/hms/video/sdk/SDKStore;",
        "sdkStore",
        "",
        "isQa",
        "<init>",
        "(Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lc93/n;Lc93/m;Lc93/m;Lc93/a;Llive/hms/video/sdk/SDKStore;Lc93/a;)V",
        "",
        "Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;",
        "polls",
        "updatePollsStopped$lib_release",
        "(Ljava/util/List;)V",
        "updatePollsStopped",
        "Llive/hms/video/polls/HMSPollBuilder;",
        "poll",
        "Llive/hms/video/sdk/HMSActionResultListener;",
        "completion",
        "quickStartPoll",
        "(Llive/hms/video/polls/HMSPollBuilder;Llive/hms/video/sdk/HMSActionResultListener;)V",
        "Llive/hms/video/polls/models/HmsPoll;",
        "updatePollsList$lib_release",
        "updatePollsList",
        "close$lib_release",
        "()V",
        "close",
        "stop",
        "(Llive/hms/video/polls/models/HmsPoll;Llive/hms/video/sdk/HMSActionResultListener;)V",
        "response",
        "Llive/hms/video/sdk/HmsTypedActionResultListener;",
        "add",
        "(Llive/hms/video/polls/HMSPollResponseBuilder;Llive/hms/video/sdk/HmsTypedActionResultListener;)V",
        "offset",
        "count",
        "ownResponsesOnly",
        "Llive/hms/video/polls/models/network/HMSPollQuestionResponse;",
        "getResponses",
        "(Llive/hms/video/polls/models/HmsPoll;IIZLlive/hms/video/sdk/HmsTypedActionResultListener;)V",
        "(Llive/hms/video/polls/models/HmsPoll;Llive/hms/video/sdk/HmsTypedActionResultListener;)V",
        "pollId",
        "",
        "startIndex",
        "includeCurrentPeer",
        "fetchLeaderboard",
        "(Ljava/lang/String;JJZLlive/hms/video/sdk/HmsTypedActionResultListener;)V",
        "Llive/hms/video/polls/models/question/HMSPollQuestion;",
        "fetchPollQuestions",
        "pollState",
        "fetchPollList",
        "(Llive/hms/video/polls/models/HmsPollState;Llive/hms/video/sdk/HmsTypedActionResultListener;)V",
        "Llive/hms/video/sdk/models/HMSNotifications$PollStats;",
        "pollUpdate",
        "totalResponses",
        "votingUsers",
        "totalDistinctUsers",
        "updatePollStats$lib_release",
        "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V",
        "updatePollStats",
        "Llive/hms/video/whiteboard/HMSWhiteboardUpdateListener;",
        "whiteBoardUpdateListener",
        "setWhiteboardUpdateListener",
        "(Llive/hms/video/whiteboard/HMSWhiteboardUpdateListener;)V",
        "removeWhiteboardUpdateListener",
        "title",
        "startWhiteboard",
        "(Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;)V",
        "stopWhiteboard",
        "(Llive/hms/video/sdk/HMSActionResultListener;)V",
        "Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;",
        "params",
        "handleWhiteBoardStateNotification$lib_release",
        "(Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;)V",
        "handleWhiteBoardStateNotification",
        "getParams",
        "(Llive/hms/video/polls/HMSPollBuilder;Lq83/d;)Ljava/lang/Object;",
        "T",
        "R",
        "data",
        "op",
        "runNetworkOperationSafely",
        "(Ljava/lang/Object;Lc93/m;Llive/hms/video/sdk/HMSActionResultListener;)V",
        "(Ljava/lang/Object;Lc93/m;Llive/hms/video/sdk/HmsTypedActionResultListener;)V",
        "throwErrorIfNotConnected",
        "last",
        "Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;",
        "getAllPollsRecursively",
        "(Llive/hms/video/polls/models/HmsPollState;ILjava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "createOptions",
        "getCreateOptionsWithDefaults",
        "(Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;)Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;",
        "address",
        "token",
        "formatWhiteBoardUrl",
        "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;",
        "Lc93/m;",
        "Lc93/n;",
        "Lc93/a;",
        "Llive/hms/video/sdk/SDKStore;",
        "Llive/hms/video/whiteboard/HMSWhiteboardUpdateListener;",
        "Llive/hms/video/whiteboard/HMSWhiteboard;",
        "currentWhiteBoard",
        "Llive/hms/video/whiteboard/HMSWhiteboard;",
        "Llive/hms/video/interactivity/HmsPollUpdateListener;",
        "pollUpdateListener",
        "Llive/hms/video/interactivity/HmsPollUpdateListener;",
        "getPollUpdateListener",
        "()Llive/hms/video/interactivity/HmsPollUpdateListener;",
        "setPollUpdateListener",
        "(Llive/hms/video/interactivity/HmsPollUpdateListener;)V",
        "",
        "_polls",
        "Ljava/util/List;",
        "getPolls",
        "()Ljava/util/List;",
        "localWhiteBoardstart",
        "Z",
        "getLocalWhiteBoardstart$lib_release",
        "()Z",
        "setLocalWhiteBoardstart$lib_release",
        "(Z)V",
        "Llive/hms/video/whiteboard/State;",
        "currentWhiteBoardState",
        "Llive/hms/video/whiteboard/State;",
        "getCurrentWhiteBoardState",
        "()Llive/hms/video/whiteboard/State;",
        "setCurrentWhiteBoardState",
        "(Llive/hms/video/whiteboard/State;)V",
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


# instance fields
.field private final _polls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/HmsPoll;",
            ">;"
        }
    .end annotation
.end field

.field private final addQuestion:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final createWhiteBoard:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private currentWhiteBoard:Llive/hms/video/whiteboard/HMSWhiteboard;

.field private currentWhiteBoardState:Llive/hms/video/whiteboard/State;

.field private final getAllPollQuestions:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final getLeaderboard:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final getPollResults:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final getResponsesInternal:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final getTransportState:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final getWhiteBoard:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final isQa:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private localWhiteBoardstart:Z

.field private final pollCreate:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final pollGetList:Lc93/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/n;"
        }
    .end annotation
.end field

.field private pollUpdateListener:Llive/hms/video/interactivity/HmsPollUpdateListener;

.field private final polls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/HmsPoll;",
            ">;"
        }
    .end annotation
.end field

.field private final sdkStore:Llive/hms/video/sdk/SDKStore;

.field private final sendAnswers:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final startPoll:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final stopPoll:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private whiteBoardUpdateListener:Llive/hms/video/whiteboard/HMSWhiteboardUpdateListener;


# direct methods
.method public constructor <init>(Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lc93/n;Lc93/m;Lc93/m;Lc93/a;Llive/hms/video/sdk/SDKStore;Lc93/a;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            "Lc93/m;",
            "Lc93/m;",
            "Lc93/m;",
            "Lc93/m;",
            "Lc93/m;",
            "Lc93/m;",
            "Lc93/m;",
            "Lc93/m;",
            "Lc93/n;",
            "Lc93/m;",
            "Lc93/m;",
            "Lc93/a;",
            "Llive/hms/video/sdk/SDKStore;",
            "Lc93/a;",
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

    const-string v0, "pollCreate"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addQuestion"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startPoll"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stopPoll"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sendAnswers"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getResponsesInternal"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getPollResults"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getLeaderboard"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getAllPollQuestions"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollGetList"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createWhiteBoard"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getWhiteBoard"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getTransportState"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkStore"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isQa"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    iput-object v1, v0, Llive/hms/video/interactivity/HmsInteractivityCenter;->pollCreate:Lc93/m;

    iput-object v2, v0, Llive/hms/video/interactivity/HmsInteractivityCenter;->addQuestion:Lc93/m;

    iput-object v3, v0, Llive/hms/video/interactivity/HmsInteractivityCenter;->startPoll:Lc93/m;

    iput-object v4, v0, Llive/hms/video/interactivity/HmsInteractivityCenter;->stopPoll:Lc93/m;

    iput-object v5, v0, Llive/hms/video/interactivity/HmsInteractivityCenter;->sendAnswers:Lc93/m;

    iput-object v6, v0, Llive/hms/video/interactivity/HmsInteractivityCenter;->getResponsesInternal:Lc93/m;

    iput-object v7, v0, Llive/hms/video/interactivity/HmsInteractivityCenter;->getPollResults:Lc93/m;

    iput-object v8, v0, Llive/hms/video/interactivity/HmsInteractivityCenter;->getLeaderboard:Lc93/m;

    iput-object v9, v0, Llive/hms/video/interactivity/HmsInteractivityCenter;->getAllPollQuestions:Lc93/m;

    iput-object v10, v0, Llive/hms/video/interactivity/HmsInteractivityCenter;->pollGetList:Lc93/n;

    iput-object v11, v0, Llive/hms/video/interactivity/HmsInteractivityCenter;->createWhiteBoard:Lc93/m;

    iput-object v12, v0, Llive/hms/video/interactivity/HmsInteractivityCenter;->getWhiteBoard:Lc93/m;

    iput-object v13, v0, Llive/hms/video/interactivity/HmsInteractivityCenter;->getTransportState:Lc93/a;

    iput-object v14, v0, Llive/hms/video/interactivity/HmsInteractivityCenter;->sdkStore:Llive/hms/video/sdk/SDKStore;

    iput-object v15, v0, Llive/hms/video/interactivity/HmsInteractivityCenter;->isQa:Lc93/a;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Llive/hms/video/interactivity/HmsInteractivityCenter;->_polls:Ljava/util/List;

    iput-object v1, v0, Llive/hms/video/interactivity/HmsInteractivityCenter;->polls:Ljava/util/List;

    sget-object v1, Llive/hms/video/whiteboard/State;->Stopped:Llive/hms/video/whiteboard/State;

    iput-object v1, v0, Llive/hms/video/interactivity/HmsInteractivityCenter;->currentWhiteBoardState:Llive/hms/video/whiteboard/State;

    return-void
.end method

.method public static final synthetic access$formatWhiteBoardUrl(Llive/hms/video/interactivity/HmsInteractivityCenter;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter;->formatWhiteBoardUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAddQuestion$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Lc93/m;
    .locals 0

    iget-object p0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->addQuestion:Lc93/m;

    return-object p0
.end method

.method public static final synthetic access$getAllPollsRecursively(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/polls/models/HmsPollState;ILjava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p5}, Llive/hms/video/interactivity/HmsInteractivityCenter;->getAllPollsRecursively(Llive/hms/video/polls/models/HmsPollState;ILjava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCreateOptionsWithDefaults(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;)Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;
    .locals 0

    invoke-direct {p0, p1}, Llive/hms/video/interactivity/HmsInteractivityCenter;->getCreateOptionsWithDefaults(Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;)Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCreateWhiteBoard$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Lc93/m;
    .locals 0

    iget-object p0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->createWhiteBoard:Lc93/m;

    return-object p0
.end method

.method public static final synthetic access$getCurrentWhiteBoard$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Llive/hms/video/whiteboard/HMSWhiteboard;
    .locals 0

    iget-object p0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->currentWhiteBoard:Llive/hms/video/whiteboard/HMSWhiteboard;

    return-object p0
.end method

.method public static final synthetic access$getGetAllPollQuestions$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Lc93/m;
    .locals 0

    iget-object p0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->getAllPollQuestions:Lc93/m;

    return-object p0
.end method

.method public static final synthetic access$getGetPollResults$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Lc93/m;
    .locals 0

    iget-object p0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->getPollResults:Lc93/m;

    return-object p0
.end method

.method public static final synthetic access$getGetResponsesInternal$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Lc93/m;
    .locals 0

    iget-object p0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->getResponsesInternal:Lc93/m;

    return-object p0
.end method

.method public static final synthetic access$getGetWhiteBoard$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Lc93/m;
    .locals 0

    iget-object p0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->getWhiteBoard:Lc93/m;

    return-object p0
.end method

.method public static final synthetic access$getParams(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/polls/HMSPollBuilder;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter;->getParams(Llive/hms/video/polls/HMSPollBuilder;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getPollCreate$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Lc93/m;
    .locals 0

    iget-object p0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->pollCreate:Lc93/m;

    return-object p0
.end method

.method public static final synthetic access$getSdkStore$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Llive/hms/video/sdk/SDKStore;
    .locals 0

    iget-object p0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->sdkStore:Llive/hms/video/sdk/SDKStore;

    return-object p0
.end method

.method public static final synthetic access$getStartPoll$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Lc93/m;
    .locals 0

    iget-object p0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->startPoll:Lc93/m;

    return-object p0
.end method

.method public static final synthetic access$getWhiteBoardUpdateListener$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Llive/hms/video/whiteboard/HMSWhiteboardUpdateListener;
    .locals 0

    iget-object p0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->whiteBoardUpdateListener:Llive/hms/video/whiteboard/HMSWhiteboardUpdateListener;

    return-object p0
.end method

.method public static final synthetic access$get_polls$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->_polls:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$runNetworkOperationSafely(Llive/hms/video/interactivity/HmsInteractivityCenter;Ljava/lang/Object;Lc93/m;Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Llive/hms/video/interactivity/HmsInteractivityCenter;->runNetworkOperationSafely(Ljava/lang/Object;Lc93/m;Llive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public static final synthetic access$setCurrentWhiteBoard$p(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/whiteboard/HMSWhiteboard;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->currentWhiteBoard:Llive/hms/video/whiteboard/HMSWhiteboard;

    return-void
.end method

.method public static final synthetic access$throwErrorIfNotConnected(Llive/hms/video/interactivity/HmsInteractivityCenter;)V
    .locals 0

    invoke-direct {p0}, Llive/hms/video/interactivity/HmsInteractivityCenter;->throwErrorIfNotConnected()V

    return-void
.end method

.method public static synthetic fetchLeaderboard$default(Llive/hms/video/interactivity/HmsInteractivityCenter;Ljava/lang/String;JJZLlive/hms/video/sdk/HmsTypedActionResultListener;ILjava/lang/Object;)V
    .locals 8

    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    const-wide/16 p2, 0x32

    :cond_0
    move-wide v2, p2

    and-int/lit8 p2, p8, 0x4

    if-eqz p2, :cond_1

    const-wide/16 p4, 0x0

    :cond_1
    move-wide v4, p4

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_2

    const/4 p2, 0x0

    move v6, p2

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-object v7, p7

    goto :goto_1

    :cond_2
    move v6, p6

    goto :goto_0

    :goto_1
    invoke-virtual/range {v0 .. v7}, Llive/hms/video/interactivity/HmsInteractivityCenter;->fetchLeaderboard(Ljava/lang/String;JJZLlive/hms/video/sdk/HmsTypedActionResultListener;)V

    return-void
.end method

.method private final formatWhiteBoardUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->isQa:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "https://whiteboard-qa.100ms.live"

    goto :goto_0

    :cond_0
    const-string v0, "https://whiteboard.100ms.live"

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/?endpoint=https://"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&token="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&zoom_to_content=true"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final getAllPollsRecursively(Llive/hms/video/polls/models/HmsPollState;ILjava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/polls/models/HmsPollState;",
            "I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, Llive/hms/video/interactivity/HmsInteractivityCenter$getAllPollsRecursively$1;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Llive/hms/video/interactivity/HmsInteractivityCenter$getAllPollsRecursively$1;

    iget v1, v0, Llive/hms/video/interactivity/HmsInteractivityCenter$getAllPollsRecursively$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/interactivity/HmsInteractivityCenter$getAllPollsRecursively$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Llive/hms/video/interactivity/HmsInteractivityCenter$getAllPollsRecursively$1;

    invoke-direct {v0, p0, p5}, Llive/hms/video/interactivity/HmsInteractivityCenter$getAllPollsRecursively$1;-><init>(Llive/hms/video/interactivity/HmsInteractivityCenter;Lq83/d;)V

    :goto_0
    iget-object p5, v0, Llive/hms/video/interactivity/HmsInteractivityCenter$getAllPollsRecursively$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llive/hms/video/interactivity/HmsInteractivityCenter$getAllPollsRecursively$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Llive/hms/video/interactivity/HmsInteractivityCenter$getAllPollsRecursively$1;->L$2:Ljava/lang/Object;

    check-cast p1, Llive/hms/video/interactivity/HmsInteractivityCenter;

    iget-object p2, v0, Llive/hms/video/interactivity/HmsInteractivityCenter$getAllPollsRecursively$1;->L$1:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    iget-object p3, v0, Llive/hms/video/interactivity/HmsInteractivityCenter$getAllPollsRecursively$1;->L$0:Ljava/lang/Object;

    check-cast p3, Llive/hms/video/polls/models/HmsPollState;

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p5, p4

    move-object p4, p3

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    :goto_1
    iget-object v2, p1, Llive/hms/video/interactivity/HmsInteractivityCenter;->pollGetList:Lc93/n;

    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, p3}, Ljava/lang/Integer;-><init>(I)V

    iput-object p2, v0, Llive/hms/video/interactivity/HmsInteractivityCenter$getAllPollsRecursively$1;->L$0:Ljava/lang/Object;

    iput-object p5, v0, Llive/hms/video/interactivity/HmsInteractivityCenter$getAllPollsRecursively$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Llive/hms/video/interactivity/HmsInteractivityCenter$getAllPollsRecursively$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Llive/hms/video/interactivity/HmsInteractivityCenter$getAllPollsRecursively$1;->label:I

    invoke-interface {v2, p2, v4, p4, v0}, Lc93/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-object v5, p3

    move-object p3, p2

    move-object p2, p5

    move-object p5, v5

    :goto_2
    check-cast p5, Llive/hms/video/polls/network/PollListResponse;

    invoke-virtual {p5}, Llive/hms/video/polls/network/PollListResponse;->getPolls()Ljava/util/List;

    move-result-object p4

    invoke-static {p4}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;

    if-eqz p4, :cond_4

    invoke-virtual {p4}, Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;->getPollId()Ljava/lang/String;

    move-result-object p4

    goto :goto_3

    :cond_4
    const/4 p4, 0x0

    :goto_3
    invoke-virtual {p5}, Llive/hms/video/polls/network/PollListResponse;->getLast()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_5

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p5}, Llive/hms/video/polls/network/PollListResponse;->getPolls()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p2, p1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :cond_5
    if-eqz p4, :cond_6

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p5}, Llive/hms/video/polls/network/PollListResponse;->getPolls()Ljava/util/List;

    move-result-object p5

    check-cast p5, Ljava/lang/Iterable;

    invoke-static {p2, p5}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p5

    const/16 p2, 0x32

    move-object v5, p3

    move p3, p2

    move-object p2, v5

    goto :goto_1

    :cond_6
    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p5}, Llive/hms/video/polls/network/PollListResponse;->getPolls()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p2, p1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic getAllPollsRecursively$default(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/polls/models/HmsPollState;ILjava/lang/String;Ljava/util/List;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    sget-object p4, Lm83/y;->w:Lm83/y;

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Llive/hms/video/interactivity/HmsInteractivityCenter;->getAllPollsRecursively(Llive/hms/video/polls/models/HmsPollState;ILjava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final getCreateOptionsWithDefaults(Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;)Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Llive/hms/video/interactivity/HmsInteractivityCenter;->sdkStore:Llive/hms/video/sdk/SDKStore;

    invoke-virtual {v1}, Llive/hms/video/sdk/SDKStore;->getPlugins()Llive/hms/video/sdk/models/HMSNotifications$Plugins;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->getWhiteboard()Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;->getPermissions()Llive/hms/video/sdk/models/HMSNotifications$WhiteboardPermissions;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$WhiteboardPermissions;->getAdmin()Ljava/util/List;

    move-result-object v6

    goto :goto_1

    :cond_1
    move-object v6, v2

    :goto_1
    check-cast v6, Ljava/util/Collection;

    sget-object v7, Lm83/y;->w:Lm83/y;

    if-eqz v6, :cond_5

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_3

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$WhiteboardPermissions;->getAdmin()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_3

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v6}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v6

    goto :goto_2

    :cond_3
    move-object v6, v2

    :goto_2
    if-nez v6, :cond_4

    move-object v6, v7

    :cond_4
    check-cast v6, Ljava/util/Collection;

    invoke-interface {v5, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_5
    :goto_3
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$WhiteboardPermissions;->getReader()Ljava/util/List;

    move-result-object v6

    goto :goto_4

    :cond_6
    move-object v6, v2

    :goto_4
    check-cast v6, Ljava/util/Collection;

    if-eqz v6, :cond_a

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_7

    goto :goto_6

    :cond_7
    if-eqz v1, :cond_8

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$WhiteboardPermissions;->getReader()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_8

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v6}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v6

    goto :goto_5

    :cond_8
    move-object v6, v2

    :goto_5
    if-nez v6, :cond_9

    move-object v6, v7

    :cond_9
    check-cast v6, Ljava/util/Collection;

    invoke-interface {v3, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_a
    :goto_6
    if-eqz v1, :cond_b

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$WhiteboardPermissions;->getWriter()Ljava/util/List;

    move-result-object v6

    goto :goto_7

    :cond_b
    move-object v6, v2

    :goto_7
    check-cast v6, Ljava/util/Collection;

    if-eqz v6, :cond_f

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_c

    goto :goto_a

    :cond_c
    if-eqz v1, :cond_d

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$WhiteboardPermissions;->getWriter()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_d

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    goto :goto_8

    :cond_d
    move-object v1, v2

    :goto_8
    if-nez v1, :cond_e

    goto :goto_9

    :cond_e
    move-object v7, v1

    :goto_9
    check-cast v7, Ljava/util/Collection;

    invoke-interface {v4, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_f
    :goto_a
    new-instance v8, Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;

    if-eqz p1, :cond_10

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;->getId()Ljava/lang/String;

    move-result-object v1

    move-object v9, v1

    goto :goto_b

    :cond_10
    move-object v9, v2

    :goto_b
    if-eqz p1, :cond_12

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;->getTitle()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_11

    goto :goto_d

    :cond_11
    :goto_c
    move-object v10, v1

    goto :goto_e

    :cond_12
    :goto_d
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v0, Llive/hms/video/interactivity/HmsInteractivityCenter;->sdkStore:Llive/hms/video/sdk/SDKStore;

    invoke-virtual {v6}, Llive/hms/video/sdk/SDKStore;->get_room()Llive/hms/video/sdk/models/HMSRoom;

    move-result-object v6

    if-eqz v6, :cond_13

    invoke-virtual {v6}, Llive/hms/video/sdk/models/HMSRoom;->getRoomId()Ljava/lang/String;

    move-result-object v2

    :cond_13
    const-string v6, " Whiteboard"

    invoke-static {v2, v6, v1}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    goto :goto_c

    :goto_e
    if-eqz p1, :cond_15

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;->getReader()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_14

    goto :goto_f

    :cond_14
    move-object v11, v1

    goto :goto_10

    :cond_15
    :goto_f
    move-object v11, v3

    :goto_10
    if-eqz p1, :cond_17

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;->getWriter()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_16

    goto :goto_11

    :cond_16
    move-object v12, v1

    goto :goto_12

    :cond_17
    :goto_11
    move-object v12, v4

    :goto_12
    if-eqz p1, :cond_19

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;->getAdmin()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_18

    goto :goto_13

    :cond_18
    move-object v13, v1

    goto :goto_14

    :cond_19
    :goto_13
    move-object v13, v5

    :goto_14
    const/16 v15, 0x20

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v8 .. v16}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method

.method public static synthetic getCreateOptionsWithDefaults$default(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;ILjava/lang/Object;)Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Llive/hms/video/interactivity/HmsInteractivityCenter;->getCreateOptionsWithDefaults(Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;)Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;

    move-result-object p0

    return-object p0
.end method

.method private final getParams(Llive/hms/video/polls/HMSPollBuilder;Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/polls/HMSPollBuilder;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/polls/models/HmsPollCreationParams;

    invoke-virtual {p1}, Llive/hms/video/polls/HMSPollBuilder;->getPollId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llive/hms/video/polls/HMSPollBuilder;->getTitle()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_0

    const-string p2, "toString(...)"

    invoke-static {p2}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :cond_0
    move-object v2, p2

    invoke-virtual {p1}, Llive/hms/video/polls/HMSPollBuilder;->getDuration()J

    move-result-wide v3

    invoke-virtual {p1}, Llive/hms/video/polls/HMSPollBuilder;->getAnonymous()Z

    move-result v5

    invoke-virtual {p1}, Llive/hms/video/polls/HMSPollBuilder;->getMode()Llive/hms/video/polls/models/HmsPollUserTrackingMode;

    move-result-object v8

    invoke-virtual {p1}, Llive/hms/video/polls/HMSPollBuilder;->getRolesThatCanVote()Ljava/util/List;

    move-result-object v9

    invoke-virtual {p1}, Llive/hms/video/polls/HMSPollBuilder;->getRolesThatCanViewResponses()Ljava/util/List;

    move-result-object v10

    invoke-virtual {p1}, Llive/hms/video/polls/HMSPollBuilder;->getCategory()Llive/hms/video/polls/models/HmsPollCategory;

    move-result-object v11

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v11}, Llive/hms/video/polls/models/HmsPollCreationParams;-><init>(Ljava/lang/String;Ljava/lang/String;JZZZLlive/hms/video/polls/models/HmsPollUserTrackingMode;Ljava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollCategory;)V

    new-instance p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;

    invoke-direct {p1, v0}, Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;-><init>(Llive/hms/video/polls/models/HmsPollCreationParams;)V

    return-object p1
.end method

.method public static synthetic getResponses$default(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/polls/models/HmsPoll;IIZLlive/hms/video/sdk/HmsTypedActionResultListener;ILjava/lang/Object;)V
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const/4 p2, 0x0

    :cond_0
    move v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const/16 p3, 0x32

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Llive/hms/video/interactivity/HmsInteractivityCenter;->getResponses(Llive/hms/video/polls/models/HmsPoll;IIZLlive/hms/video/sdk/HmsTypedActionResultListener;)V

    return-void
.end method

.method private final runNetworkOperationSafely(Ljava/lang/Object;Lc93/m;Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lc93/m;",
            "Llive/hms/video/sdk/HMSActionResultListener;",
            ")V"
        }
    .end annotation

    .line 1
    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/interactivity/HmsInteractivityCenter$runNetworkOperationSafely$1;

    const/4 v2, 0x0

    invoke-direct {v1, p2, p1, p3, v2}, Llive/hms/video/interactivity/HmsInteractivityCenter$runNetworkOperationSafely$1;-><init>(Lc93/m;Ljava/lang/Object;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final runNetworkOperationSafely(Ljava/lang/Object;Lc93/m;Llive/hms/video/sdk/HmsTypedActionResultListener;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lc93/m;",
            "Llive/hms/video/sdk/HmsTypedActionResultListener<",
            "TR;>;)V"
        }
    .end annotation

    .line 2
    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/interactivity/HmsInteractivityCenter$runNetworkOperationSafely$2;

    const/4 v2, 0x0

    invoke-direct {v1, p2, p1, p3, v2}, Llive/hms/video/interactivity/HmsInteractivityCenter$runNetworkOperationSafely$2;-><init>(Lc93/m;Ljava/lang/Object;Llive/hms/video/sdk/HmsTypedActionResultListener;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final throwErrorIfNotConnected()V
    .locals 9

    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->getTransportState:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/video/transport/models/TransportState;

    sget-object v1, Llive/hms/video/transport/models/TransportState;->Failed:Llive/hms/video/transport/models/TransportState;

    if-eq v0, v1, :cond_0

    sget-object v1, Llive/hms/video/transport/models/TransportState;->Disconnected:Llive/hms/video/transport/models/TransportState;

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    sget-object v2, Llive/hms/video/error/ErrorFactory$GenericErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$GenericErrors;

    sget-object v3, Llive/hms/video/error/ErrorFactory$Action;->NONE:Llive/hms/video/error/ErrorFactory$Action;

    const/16 v7, 0xc

    const/4 v8, 0x0

    const-string v4, "User not joined."

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Llive/hms/video/error/ErrorFactory$GenericErrors;->NotConnected$default(Llive/hms/video/error/ErrorFactory$GenericErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object v0

    throw v0
.end method

.method public static synthetic updatePollStats$lib_release$default(Llive/hms/video/interactivity/HmsInteractivityCenter;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/interactivity/HmsInteractivityCenter;->updatePollStats$lib_release(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V

    return-void
.end method


# virtual methods
.method public final add(Llive/hms/video/polls/HMSPollResponseBuilder;Llive/hms/video/sdk/HmsTypedActionResultListener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/polls/HMSPollResponseBuilder;",
            "Llive/hms/video/sdk/HmsTypedActionResultListener<",
            "Llive/hms/video/polls/models/answer/PollAnswerResponse;",
            ">;)V"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0}, Llive/hms/video/interactivity/HmsInteractivityCenter;->throwErrorIfNotConnected()V

    new-instance v0, Llive/hms/video/interactivity/HmsInteractivityCenter$add$update$1;

    invoke-direct {v0, p0, p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$add$update$1;-><init>(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/polls/HMSPollResponseBuilder;Llive/hms/video/sdk/HmsTypedActionResultListener;)V

    iget-object v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->sendAnswers:Lc93/m;

    invoke-direct {p0, p1, v1, v0}, Llive/hms/video/interactivity/HmsInteractivityCenter;->runNetworkOperationSafely(Ljava/lang/Object;Lc93/m;Llive/hms/video/sdk/HmsTypedActionResultListener;)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-interface {p2, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    return-void
.end method

.method public final close$lib_release()V
    .locals 1

    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->_polls:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->currentWhiteBoard:Llive/hms/video/whiteboard/HMSWhiteboard;

    const/4 v0, 0x0

    iput-boolean v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->localWhiteBoardstart:Z

    return-void
.end method

.method public final fetchLeaderboard(Ljava/lang/String;JJZLlive/hms/video/sdk/HmsTypedActionResultListener;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JJZ",
            "Llive/hms/video/sdk/HmsTypedActionResultListener<",
            "Llive/hms/video/polls/network/PollLeaderboardResponse;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p7

    const-string v1, "pollId"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "completion"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;

    const/16 v11, 0x22

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v10, 0x0

    move-object v3, p1

    move-wide v5, p2

    move-wide/from16 v7, p4

    move/from16 v9, p6

    invoke-direct/range {v2 .. v12}, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;-><init>(Ljava/lang/String;Ljava/lang/Long;JJZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->getLeaderboard:Lc93/m;

    invoke-direct {p0, v2, p1, v0}, Llive/hms/video/interactivity/HmsInteractivityCenter;->runNetworkOperationSafely(Ljava/lang/Object;Lc93/m;Llive/hms/video/sdk/HmsTypedActionResultListener;)V

    return-void
.end method

.method public final fetchPollList(Llive/hms/video/polls/models/HmsPollState;Llive/hms/video/sdk/HmsTypedActionResultListener;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/polls/models/HmsPollState;",
            "Llive/hms/video/sdk/HmsTypedActionResultListener<",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/HmsPoll;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "pollState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;

    const/4 v6, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;-><init>(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/polls/models/HmsPollState;Llive/hms/video/sdk/HmsTypedActionResultListener;ZLq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {v0, p2, p2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final fetchPollQuestions(Llive/hms/video/polls/models/HmsPoll;Llive/hms/video/sdk/HmsTypedActionResultListener;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/polls/models/HmsPoll;",
            "Llive/hms/video/sdk/HmsTypedActionResultListener<",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/question/HMSPollQuestion;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "poll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0}, Llive/hms/video/interactivity/HmsInteractivityCenter;->throwErrorIfNotConnected()V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;-><init>(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/polls/models/HmsPoll;Llive/hms/video/sdk/HmsTypedActionResultListener;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-interface {p2, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    return-void
.end method

.method public final getCurrentWhiteBoardState()Llive/hms/video/whiteboard/State;
    .locals 1

    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->currentWhiteBoardState:Llive/hms/video/whiteboard/State;

    return-object v0
.end method

.method public final getLocalWhiteBoardstart$lib_release()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->localWhiteBoardstart:Z

    return v0
.end method

.method public final getPollResults(Llive/hms/video/polls/models/HmsPoll;Llive/hms/video/sdk/HmsTypedActionResultListener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/polls/models/HmsPoll;",
            "Llive/hms/video/sdk/HmsTypedActionResultListener<",
            "Llive/hms/video/polls/models/HmsPoll;",
            ">;)V"
        }
    .end annotation

    const-string v0, "poll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0}, Llive/hms/video/interactivity/HmsInteractivityCenter;->throwErrorIfNotConnected()V

    invoke-virtual {p1}, Llive/hms/video/polls/models/HmsPoll;->getPollId()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Llive/hms/video/interactivity/HmsInteractivityCenter$getPollResults$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Llive/hms/video/interactivity/HmsInteractivityCenter$getPollResults$1;-><init>(Llive/hms/video/interactivity/HmsInteractivityCenter;Lq83/d;)V

    invoke-direct {p0, p1, v0, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter;->runNetworkOperationSafely(Ljava/lang/Object;Lc93/m;Llive/hms/video/sdk/HmsTypedActionResultListener;)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-interface {p2, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    return-void
.end method

.method public final getPollUpdateListener()Llive/hms/video/interactivity/HmsPollUpdateListener;
    .locals 1

    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->pollUpdateListener:Llive/hms/video/interactivity/HmsPollUpdateListener;

    return-object v0
.end method

.method public final getPolls()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/HmsPoll;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->polls:Ljava/util/List;

    return-object v0
.end method

.method public final getResponses(Llive/hms/video/polls/models/HmsPoll;IIZLlive/hms/video/sdk/HmsTypedActionResultListener;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/polls/models/HmsPoll;",
            "IIZ",
            "Llive/hms/video/sdk/HmsTypedActionResultListener<",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/network/HMSPollQuestionResponse;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "poll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0}, Llive/hms/video/interactivity/HmsInteractivityCenter;->throwErrorIfNotConnected()V

    new-instance v1, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;

    invoke-virtual {p1}, Llive/hms/video/polls/models/HmsPoll;->getPollId()Ljava/lang/String;

    move-result-object v2

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move v4, p2

    move v5, p3

    move v3, p4

    invoke-direct/range {v1 .. v8}, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;-><init>(Ljava/lang/String;ZIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p2, Llive/hms/video/interactivity/HmsInteractivityCenter$getResponses$1;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p1, p3}, Llive/hms/video/interactivity/HmsInteractivityCenter$getResponses$1;-><init>(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/polls/models/HmsPoll;Lq83/d;)V

    invoke-direct {p0, v1, p2, p5}, Llive/hms/video/interactivity/HmsInteractivityCenter;->runNetworkOperationSafely(Ljava/lang/Object;Lc93/m;Llive/hms/video/sdk/HmsTypedActionResultListener;)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    invoke-interface {p5, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    return-void
.end method

.method public final handleWhiteBoardStateNotification$lib_release(Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;)V
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SuspiciousIndentation"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;->getOwner()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->sdkStore:Llive/hms/video/sdk/SDKStore;

    invoke-virtual {v1}, Llive/hms/video/sdk/SDKStore;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSPeer;->getCustomerUserID()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;->getState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "open"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "handleWhiteBoardStateNotification>state="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;->getState()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " owner "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " params owner ID "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;->getId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, ""

    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "XYZ"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v3, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;

    const/4 v8, 0x0

    move-object v5, p0

    move-object v4, p1

    invoke-direct/range {v3 .. v8}, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;-><init>(Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;Llive/hms/video/interactivity/HmsInteractivityCenter;ZZLq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v3, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final quickStartPoll(Llive/hms/video/polls/HMSPollBuilder;Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 3

    const-string v0, "poll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0}, Llive/hms/video/interactivity/HmsInteractivityCenter;->throwErrorIfNotConnected()V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;

    const/4 v2, 0x0

    invoke-direct {v1, p2, p0, p1, v2}, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;-><init>(Llive/hms/video/sdk/HMSActionResultListener;Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/polls/HMSPollBuilder;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-interface {p2, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    return-void
.end method

.method public final removeWhiteboardUpdateListener(Llive/hms/video/whiteboard/HMSWhiteboardUpdateListener;)V
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Llive/hms/video/interactivity/HmsInteractivityCenter;->setWhiteboardUpdateListener(Llive/hms/video/whiteboard/HMSWhiteboardUpdateListener;)V

    return-void
.end method

.method public final setCurrentWhiteBoardState(Llive/hms/video/whiteboard/State;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->currentWhiteBoardState:Llive/hms/video/whiteboard/State;

    return-void
.end method

.method public final setLocalWhiteBoardstart$lib_release(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->localWhiteBoardstart:Z

    return-void
.end method

.method public final setPollUpdateListener(Llive/hms/video/interactivity/HmsPollUpdateListener;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->pollUpdateListener:Llive/hms/video/interactivity/HmsPollUpdateListener;

    return-void
.end method

.method public final setWhiteboardUpdateListener(Llive/hms/video/whiteboard/HMSWhiteboardUpdateListener;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->whiteBoardUpdateListener:Llive/hms/video/whiteboard/HMSWhiteboardUpdateListener;

    return-void
.end method

.method public final startWhiteboard(Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 7

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lkotlin/jvm/internal/g0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;

    const/4 v6, 0x0

    move-object v2, p0

    move-object v5, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;-><init>(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/sdk/HMSActionResultListener;Lkotlin/jvm/internal/g0;Ljava/lang/String;Lq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {v0, p2, p2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final stop(Llive/hms/video/polls/models/HmsPoll;Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "poll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0}, Llive/hms/video/interactivity/HmsInteractivityCenter;->throwErrorIfNotConnected()V

    invoke-virtual {p1}, Llive/hms/video/polls/models/HmsPoll;->getPollId()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->stopPoll:Lc93/m;

    invoke-direct {p0, p1, v0, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter;->runNetworkOperationSafely(Ljava/lang/Object;Lc93/m;Llive/hms/video/sdk/HMSActionResultListener;)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-interface {p2, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    return-void
.end method

.method public final stopWhiteboard(Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 8

    const-string v0, "completion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->currentWhiteBoard:Llive/hms/video/whiteboard/HMSWhiteboard;

    if-nez v0, :cond_0

    sget-object v1, Llive/hms/video/error/ErrorFactory$GenericErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$GenericErrors;

    sget-object v2, Llive/hms/video/error/ErrorFactory$Action;->WHITEBOARD:Llive/hms/video/error/ErrorFactory$Action;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const-string v3, "No current opened whiteboard"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Llive/hms/video/error/ErrorFactory$GenericErrors;->Unknown$default(Llive/hms/video/error/ErrorFactory$GenericErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object v0

    invoke-interface {p1, v0}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    :cond_0
    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/interactivity/HmsInteractivityCenter$stopWhiteboard$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Llive/hms/video/interactivity/HmsInteractivityCenter$stopWhiteboard$1;-><init>(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final updatePollStats$lib_release(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/HMSNotifications$PollStats;",
            ">;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ")V"
        }
    .end annotation

    const-string v0, "pollUpdate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/video/sdk/models/HMSNotifications$PollStats;

    iget-object v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->_polls:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Llive/hms/video/polls/models/HmsPoll;

    invoke-virtual {v4}, Llive/hms/video/polls/models/HmsPoll;->getPollId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSNotifications$PollStats;->getPollId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_2
    move-object v2, v3

    :goto_1
    check-cast v2, Llive/hms/video/polls/models/HmsPoll;

    if-eqz v2, :cond_1a

    invoke-virtual {v2}, Llive/hms/video/polls/models/HmsPoll;->getQuestions()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSNotifications$PollStats;->getQuestions()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto/16 :goto_e

    :cond_3
    invoke-virtual {v2}, Llive/hms/video/polls/models/HmsPoll;->getResult()Llive/hms/video/polls/network/PollResultsDisplay;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSNotifications$PollStats;->getQuestions()Ljava/util/List;

    move-result-object v4

    if-nez p4, :cond_5

    invoke-virtual {v2}, Llive/hms/video/polls/models/HmsPoll;->getResult()Llive/hms/video/polls/network/PollResultsDisplay;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Llive/hms/video/polls/network/PollResultsDisplay;->getTotalDistinctUsers()Ljava/lang/Long;

    move-result-object v5

    goto :goto_2

    :cond_4
    move-object v5, v3

    goto :goto_2

    :cond_5
    move-object v5, p4

    :goto_2
    if-nez p3, :cond_7

    invoke-virtual {v2}, Llive/hms/video/polls/models/HmsPoll;->getResult()Llive/hms/video/polls/network/PollResultsDisplay;

    move-result-object v6

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Llive/hms/video/polls/network/PollResultsDisplay;->getVotingUsers()Ljava/lang/Long;

    move-result-object v6

    goto :goto_3

    :cond_6
    move-object v6, v3

    goto :goto_3

    :cond_7
    move-object v6, p3

    :goto_3
    if-nez p2, :cond_9

    invoke-virtual {v2}, Llive/hms/video/polls/models/HmsPoll;->getResult()Llive/hms/video/polls/network/PollResultsDisplay;

    move-result-object v7

    if-eqz v7, :cond_8

    invoke-virtual {v7}, Llive/hms/video/polls/network/PollResultsDisplay;->getTotalResponses()Ljava/lang/Long;

    move-result-object v7

    goto :goto_4

    :cond_8
    move-object v7, v3

    goto :goto_4

    :cond_9
    move-object v7, p2

    :goto_4
    invoke-virtual {v1, v7, v6, v5, v4}, Llive/hms/video/polls/network/PollResultsDisplay;->copy(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)Llive/hms/video/polls/network/PollResultsDisplay;

    move-result-object v1

    if-eqz v1, :cond_a

    goto :goto_8

    :cond_a
    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSNotifications$PollStats;->getQuestions()Ljava/util/List;

    move-result-object v1

    if-nez p4, :cond_c

    invoke-virtual {v2}, Llive/hms/video/polls/models/HmsPoll;->getResult()Llive/hms/video/polls/network/PollResultsDisplay;

    move-result-object v4

    if-eqz v4, :cond_b

    invoke-virtual {v4}, Llive/hms/video/polls/network/PollResultsDisplay;->getTotalDistinctUsers()Ljava/lang/Long;

    move-result-object v4

    goto :goto_5

    :cond_b
    move-object v4, v3

    goto :goto_5

    :cond_c
    move-object v4, p4

    :goto_5
    if-nez p3, :cond_e

    invoke-virtual {v2}, Llive/hms/video/polls/models/HmsPoll;->getResult()Llive/hms/video/polls/network/PollResultsDisplay;

    move-result-object v5

    if-eqz v5, :cond_d

    invoke-virtual {v5}, Llive/hms/video/polls/network/PollResultsDisplay;->getVotingUsers()Ljava/lang/Long;

    move-result-object v5

    goto :goto_6

    :cond_d
    move-object v5, v3

    goto :goto_6

    :cond_e
    move-object v5, p3

    :goto_6
    if-nez p2, :cond_10

    invoke-virtual {v2}, Llive/hms/video/polls/models/HmsPoll;->getResult()Llive/hms/video/polls/network/PollResultsDisplay;

    move-result-object v6

    if-eqz v6, :cond_f

    invoke-virtual {v6}, Llive/hms/video/polls/network/PollResultsDisplay;->getTotalResponses()Ljava/lang/Long;

    move-result-object v6

    goto :goto_7

    :cond_f
    move-object v6, v3

    goto :goto_7

    :cond_10
    move-object v6, p2

    :goto_7
    new-instance v7, Llive/hms/video/polls/network/PollResultsDisplay;

    invoke-direct {v7, v6, v5, v4, v1}, Llive/hms/video/polls/network/PollResultsDisplay;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)V

    move-object v1, v7

    :goto_8
    invoke-virtual {v2, v1}, Llive/hms/video/polls/models/HmsPoll;->setResult(Llive/hms/video/polls/network/PollResultsDisplay;)V

    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSNotifications$PollStats;->getQuestions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/polls/models/PollStatsQuestions;

    invoke-virtual {v2}, Llive/hms/video/polls/models/HmsPoll;->getQuestions()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_14

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_12
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_13

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Llive/hms/video/polls/models/question/HMSPollQuestion;

    invoke-virtual {v6}, Llive/hms/video/polls/models/question/HMSPollQuestion;->getQuestionID()I

    move-result v6

    invoke-virtual {v1}, Llive/hms/video/polls/models/PollStatsQuestions;->getIndex()I

    move-result v7

    if-ne v6, v7, :cond_12

    goto :goto_9

    :cond_13
    move-object v5, v3

    :goto_9
    check-cast v5, Llive/hms/video/polls/models/question/HMSPollQuestion;

    goto :goto_a

    :cond_14
    move-object v5, v3

    :goto_a
    if-eqz v5, :cond_15

    invoke-virtual {v1}, Llive/hms/video/polls/models/PollStatsQuestions;->getAttemptedTimes()I

    move-result v4

    invoke-virtual {v5, v4}, Llive/hms/video/polls/models/question/HMSPollQuestion;->setTotal$lib_release(I)V

    :cond_15
    if-eqz v5, :cond_11

    invoke-virtual {v5}, Llive/hms/video/polls/models/question/HMSPollQuestion;->getOptions()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_11

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v5, 0x1

    if-ltz v5, :cond_18

    check-cast v6, Llive/hms/video/polls/models/question/HMSPollQuestionOption;

    invoke-virtual {v1}, Llive/hms/video/polls/models/PollStatsQuestions;->getOptions()Ljava/util/List;

    move-result-object v8

    if-eqz v8, :cond_16

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    goto :goto_c

    :cond_16
    move-object v8, v3

    :goto_c
    if-eqz v8, :cond_17

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-le v8, v5, :cond_17

    invoke-virtual {v1}, Llive/hms/video/polls/models/PollStatsQuestions;->getOptions()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    goto :goto_d

    :cond_17
    const-wide/16 v8, 0x0

    :goto_d
    invoke-virtual {v6, v8, v9}, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->setVoteCount(J)V

    move v5, v7

    goto :goto_b

    :cond_18
    invoke-static {}, Lwb3/f;->d0()V

    throw v3

    :cond_19
    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->pollUpdateListener:Llive/hms/video/interactivity/HmsPollUpdateListener;

    if-eqz v0, :cond_0

    sget-object v1, Llive/hms/video/polls/models/HMSPollUpdateType;->resultsupdated:Llive/hms/video/polls/models/HMSPollUpdateType;

    invoke-interface {v0, v2, v1}, Llive/hms/video/interactivity/HmsPollUpdateListener;->onPollUpdate(Llive/hms/video/polls/models/HmsPoll;Llive/hms/video/polls/models/HMSPollUpdateType;)V

    goto/16 :goto_0

    :cond_1a
    :goto_e
    return-void
.end method

.method public final updatePollsList$lib_release(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/HmsPoll;",
            ">;)V"
        }
    .end annotation

    const-string v0, "polls"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->_polls:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/polls/models/HmsPoll;

    invoke-virtual {v2}, Llive/hms/video/polls/models/HmsPoll;->getPollId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->_polls:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Llive/hms/video/polls/models/HmsPoll;

    invoke-virtual {v4}, Llive/hms/video/polls/models/HmsPoll;->getPollId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final updatePollsStopped$lib_release(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;",
            ">;)V"
        }
    .end annotation

    const-string v0, "polls"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->_polls:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/polls/models/HmsPoll;

    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;

    invoke-virtual {v4}, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->getPollId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Llive/hms/video/polls/models/HmsPoll;->getPollId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    check-cast v3, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->getStoppedAt()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Llive/hms/video/polls/models/HmsPoll;->setStoppedAt(Ljava/lang/Long;)V

    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->getStoppedBy()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Llive/hms/video/polls/models/HmsPoll;->set_stoppedBy$lib_release(Ljava/lang/String;)V

    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->getDuration()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Llive/hms/video/polls/models/HmsPoll;->setDuration(Ljava/lang/Long;)V

    sget-object v2, Llive/hms/video/polls/models/HmsPollState;->STOPPED:Llive/hms/video/polls/models/HmsPollState;

    invoke-virtual {v1, v2}, Llive/hms/video/polls/models/HmsPoll;->set_state$lib_release(Llive/hms/video/polls/models/HmsPollState;)V

    iget-object v2, p0, Llive/hms/video/interactivity/HmsInteractivityCenter;->pollUpdateListener:Llive/hms/video/interactivity/HmsPollUpdateListener;

    if-eqz v2, :cond_0

    sget-object v3, Llive/hms/video/polls/models/HMSPollUpdateType;->stopped:Llive/hms/video/polls/models/HMSPollUpdateType;

    invoke-interface {v2, v1, v3}, Llive/hms/video/interactivity/HmsPollUpdateListener;->onPollUpdate(Llive/hms/video/polls/models/HmsPoll;Llive/hms/video/polls/models/HMSPollUpdateType;)V

    goto :goto_0

    :cond_3
    return-void
.end method
