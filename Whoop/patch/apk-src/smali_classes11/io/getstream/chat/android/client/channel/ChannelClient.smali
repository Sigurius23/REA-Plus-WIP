.class public final Lio/getstream/chat/android/client/channel/ChannelClient;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0018\u00002\u00020\u0001B!\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J1\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J7\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0014H\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001d\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u001aJ\u001b\u0010\u001f\u001a\u00020\u001e2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\u0004\u0008\u001f\u0010 J/\u0010#\u001a\u00020\u001e2\u0012\u0010\"\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020!\"\u00020\u00022\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\u0004\u0008#\u0010$J7\u0010#\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020%2\u0012\u0010\"\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020!\"\u00020\u00022\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\u0004\u0008#\u0010\'J?\u0010#\u001a\u00020\u001e2\"\u0010\"\u001a\u0012\u0012\u000e\u0008\u0001\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u001c0(0!\"\n\u0012\u0006\u0008\u0001\u0012\u00020\u001c0(2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\u0004\u0008#\u0010)JG\u0010#\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020%2\"\u0010\"\u001a\u0012\u0012\u000e\u0008\u0001\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u001c0(0!\"\n\u0012\u0006\u0008\u0001\u0012\u00020\u001c0(2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\u0004\u0008#\u0010*J#\u0010,\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u00022\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\u0004\u0008,\u0010-J3\u0010,\u001a\u00020\u001e\"\u0008\u0008\u0000\u0010.*\u00020\u001c2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00028\u00000(2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001b\u00a2\u0006\u0004\u0008,\u0010/J\u001d\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u00101\u001a\u000200H\u0007\u00a2\u0006\u0004\u00082\u00103J\u001d\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u00101\u001a\u000204H\u0007\u00a2\u0006\u0004\u00085\u00106J)\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0014H\u0007\u00a2\u0006\u0004\u00085\u00108J\u0015\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007\u00a2\u0006\u0004\u00085\u00109J\u0015\u0010;\u001a\u0008\u0012\u0004\u0012\u00020:0\u000eH\u0007\u00a2\u0006\u0004\u0008;\u00109J\u001d\u0010>\u001a\u0008\u0012\u0004\u0012\u00020=0\u000e2\u0006\u0010<\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008>\u0010?J\u001d\u0010A\u001a\u0008\u0012\u0004\u0012\u00020=0\u000e2\u0006\u0010@\u001a\u00020=H\u0007\u00a2\u0006\u0004\u0008A\u0010BJ\'\u0010D\u001a\u0008\u0012\u0004\u0012\u00020=0\u000e2\u0006\u0010<\u001a\u00020\u00022\u0008\u0008\u0002\u0010C\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008D\u0010EJ\'\u0010G\u001a\u0008\u0012\u0004\u0012\u00020=0\u000e2\u0006\u0010@\u001a\u00020=2\u0008\u0008\u0002\u0010F\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008G\u0010HJ1\u0010L\u001a\u0008\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010I\u001a\u00020\u00022\u0008\u0010J\u001a\u0004\u0018\u00010\u00022\u0008\u0010K\u001a\u0004\u0018\u00010\tH\u0007\u00a2\u0006\u0004\u0008L\u0010MJ\u001d\u0010N\u001a\u0008\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010I\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008N\u0010?J1\u0010O\u001a\u0008\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010I\u001a\u00020\u00022\u0008\u0010J\u001a\u0004\u0018\u00010\u00022\u0008\u0010K\u001a\u0004\u0018\u00010\tH\u0007\u00a2\u0006\u0004\u0008O\u0010MJ\u001d\u0010P\u001a\u0008\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010I\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008P\u0010?J\u007f\u0010^\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020]0\u00120\u000e2\n\u0008\u0002\u0010R\u001a\u0004\u0018\u00010Q2\u000e\u0008\u0002\u0010U\u001a\u0008\u0012\u0004\u0012\u00020T0S2\n\u0008\u0002\u0010V\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010W\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010Y\u001a\u0004\u0018\u00010X2\n\u0008\u0002\u0010Z\u001a\u0004\u0018\u00010X2\n\u0008\u0002\u0010[\u001a\u0004\u0018\u00010X2\n\u0008\u0002\u0010\\\u001a\u0004\u0018\u00010XH\u0007\u00a2\u0006\u0004\u0008^\u0010_J\u001d\u0010`\u001a\u0008\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010<\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008`\u0010?J\u001d\u0010b\u001a\u0008\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010a\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008b\u0010?J\u001d\u0010c\u001a\u0008\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010<\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008c\u0010?J\u001d\u0010c\u001a\u0008\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010d\u001a\u00020XH\u0007\u00a2\u0006\u0004\u0008c\u0010eJ\u001d\u0010f\u001a\u0008\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010a\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008f\u0010?J\u0015\u0010g\u001a\u0008\u0012\u0004\u0012\u00020:0\u000eH\u0007\u00a2\u0006\u0004\u0008g\u00109J\u0015\u0010h\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007\u00a2\u0006\u0004\u0008h\u00109J\u0015\u0010i\u001a\u0008\u0012\u0004\u0012\u00020:0\u000eH\u0007\u00a2\u0006\u0004\u0008i\u00109J\u001f\u0010k\u001a\u0008\u0012\u0004\u0012\u00020:0\u000e2\u0008\u0008\u0002\u0010j\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008k\u0010lJ!\u0010n\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\n\u0008\u0002\u0010m\u001a\u0004\u0018\u00010=H\u0007\u00a2\u0006\u0004\u0008n\u0010BJ)\u0010t\u001a\u0008\u0012\u0004\u0012\u00020s0\u000e2\u0006\u0010p\u001a\u00020o2\n\u0008\u0002\u0010r\u001a\u0004\u0018\u00010qH\u0007\u00a2\u0006\u0004\u0008t\u0010uJ)\u0010v\u001a\u0008\u0012\u0004\u0012\u00020s0\u000e2\u0006\u0010p\u001a\u00020o2\n\u0008\u0002\u0010r\u001a\u0004\u0018\u00010qH\u0007\u00a2\u0006\u0004\u0008v\u0010uJ\u001d\u0010x\u001a\u0008\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010w\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008x\u0010?J\u001d\u0010y\u001a\u0008\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010w\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008y\u0010?J1\u0010~\u001a\u0008\u0012\u0004\u0012\u00020z0\u000e2\u0006\u0010{\u001a\u00020z2\u0008\u0008\u0002\u0010|\u001a\u00020\u000c2\u0008\u0008\u0002\u0010}\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008~\u0010\u007fJ!\u0010\u0081\u0001\u001a\u0008\u0012\u0004\u0012\u00020=0\u000e2\u0007\u00101\u001a\u00030\u0080\u0001H\u0007\u00a2\u0006\u0006\u0008\u0081\u0001\u0010\u0082\u0001J)\u0010\u0084\u0001\u001a\u0008\u0012\u0004\u0012\u00020=0\u000e2\u0006\u0010<\u001a\u00020\u00022\u0007\u0010\u0083\u0001\u001a\u00020\u0002H\u0007\u00a2\u0006\u0006\u0008\u0084\u0001\u0010\u0085\u0001J6\u0010\u0086\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020z0\u00120\u000e2\u0006\u0010<\u001a\u00020\u00022\u0006\u0010V\u001a\u00020\t2\u0006\u0010W\u001a\u00020\tH\u0007\u00a2\u0006\u0006\u0008\u0086\u0001\u0010\u0087\u0001J:\u0010\u0088\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\n\u0008\u0002\u0010@\u001a\u0004\u0018\u00010=2\u0014\u0008\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0014H\u0007\u00a2\u0006\u0006\u0008\u0088\u0001\u0010\u0089\u0001J@\u0010\u008c\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0015\u0008\u0002\u0010\u008a\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00142\u000f\u0008\u0002\u0010\u008b\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0012H\u0007\u00a2\u0006\u0006\u0008\u008c\u0001\u0010\u008d\u0001JJ\u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\u000e2\u0007\u0010\u008e\u0001\u001a\u00020\u00022\u0015\u0008\u0002\u0010\u008a\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00142\u000f\u0008\u0002\u0010\u008b\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0012H\u0007\u00a2\u0006\u0006\u0008\u0090\u0001\u0010\u0091\u0001J!\u0010\u0093\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0007\u0010\u0092\u0001\u001a\u00020\tH\u0007\u00a2\u0006\u0006\u0008\u0093\u0001\u0010\u0094\u0001J\u0017\u0010\u0095\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007\u00a2\u0006\u0005\u0008\u0095\u0001\u00109JX\u0010\u0098\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00122\n\u0008\u0002\u0010m\u001a\u0004\u0018\u00010=2\u000b\u0008\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u000c2\u000b\u0008\u0002\u0010\u0097\u0001\u001a\u0004\u0018\u00010X2\n\u0008\u0002\u0010}\u001a\u0004\u0018\u00010\u000cH\u0007\u00a2\u0006\u0006\u0008\u0098\u0001\u0010\u0099\u0001J!\u0010\u0098\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0007\u0010\u0019\u001a\u00030\u009a\u0001H\u0007\u00a2\u0006\u0006\u0008\u0098\u0001\u0010\u009b\u0001J>\u0010\u009c\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00122\n\u0008\u0002\u0010m\u001a\u0004\u0018\u00010=2\n\u0008\u0002\u0010}\u001a\u0004\u0018\u00010\u000cH\u0007\u00a2\u0006\u0006\u0008\u009c\u0001\u0010\u009d\u0001J>\u0010\u009e\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00122\n\u0008\u0002\u0010m\u001a\u0004\u0018\u00010=2\n\u0008\u0002\u0010}\u001a\u0004\u0018\u00010\u000cH\u0007\u00a2\u0006\u0006\u0008\u009e\u0001\u0010\u009d\u0001J!\u0010\u009f\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0008\u0010@\u001a\u0004\u0018\u00010\u0002H\u0007\u00a2\u0006\u0005\u0008\u009f\u0001\u0010?J\u0017\u0010\u00a0\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007\u00a2\u0006\u0005\u0008\u00a0\u0001\u00109J%\u0010\u00a2\u0001\u001a\u0008\u0012\u0004\u0012\u00020:0\u000e2\u000b\u0008\u0002\u0010\u00a1\u0001\u001a\u0004\u0018\u00010\tH\u0007\u00a2\u0006\u0006\u0008\u00a2\u0001\u0010\u00a3\u0001J\u0017\u0010\u00a4\u0001\u001a\u0008\u0012\u0004\u0012\u00020:0\u000eH\u0007\u00a2\u0006\u0005\u0008\u00a4\u0001\u00109J.\u0010\u00a6\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a5\u00010\u000e2\u0007\u0010\u008e\u0001\u001a\u00020\u00022\n\u0008\u0002\u0010K\u001a\u0004\u0018\u00010\tH\u0007\u00a2\u0006\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001J \u0010\u00a8\u0001\u001a\u0008\u0012\u0004\u0012\u00020:0\u000e2\u0007\u0010\u008e\u0001\u001a\u00020\u0002H\u0007\u00a2\u0006\u0005\u0008\u00a8\u0001\u0010?J\u0018\u0010\u00a9\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a5\u00010\u000eH\u0007\u00a2\u0006\u0005\u0008\u00a9\u0001\u00109J\u0017\u0010\u00aa\u0001\u001a\u0008\u0012\u0004\u0012\u00020:0\u000eH\u0007\u00a2\u0006\u0005\u0008\u00aa\u0001\u00109J$\u0010\u00ac\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000e2\u000b\u0008\u0002\u0010\u00ab\u0001\u001a\u0004\u0018\u00010\u0002H\u0007\u00a2\u0006\u0005\u0008\u00ac\u0001\u0010?J$\u0010\u00ad\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000e2\u000b\u0008\u0002\u0010\u00ab\u0001\u001a\u0004\u0018\u00010\u0002H\u0007\u00a2\u0006\u0005\u0008\u00ad\u0001\u0010?J6\u0010\u00ae\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000e2\u0006\u0010+\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0014H\u0007\u00a2\u0006\u0006\u0008\u00ae\u0001\u0010\u00af\u0001JX\u0010\u00b1\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008f\u00010\u00120\u000e2\u0006\u0010V\u001a\u00020\t2\u0006\u0010W\u001a\u00020\t2\u0006\u0010R\u001a\u00020Q2\r\u0010U\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010S2\u0010\u0008\u0002\u0010\u00b0\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\u0012H\u0007\u00a2\u0006\u0006\u0008\u00b1\u0001\u0010\u00b2\u0001J/\u0010\u00b4\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00b3\u00010\u00120\u000e2\u0006\u0010V\u001a\u00020\t2\u0006\u0010W\u001a\u00020\tH\u0007\u00a2\u0006\u0006\u0008\u00b4\u0001\u0010\u00b5\u0001J/\u0010\u00b6\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00b3\u00010\u00120\u000e2\u0006\u0010V\u001a\u00020\t2\u0006\u0010W\u001a\u00020\tH\u0007\u00a2\u0006\u0006\u0008\u00b6\u0001\u0010\u00b5\u0001J=\u0010\u00b8\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020=0\u00120\u000e2\u0006\u0010V\u001a\u00020\t2\u0006\u0010W\u001a\u00020\t2\r\u0010\u00b7\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0012H\u0007\u00a2\u0006\u0006\u0008\u00b8\u0001\u0010\u00b9\u0001J>\u0010\u00bc\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020=0\u00120\u000e2\u0006\u0010W\u001a\u00020\t2\u000c\u0010U\u001a\u0008\u0012\u0004\u0012\u00020=0S2\u0008\u0010\u00bb\u0001\u001a\u00030\u00ba\u0001H\u0007\u00a2\u0006\u0006\u0008\u00bc\u0001\u0010\u00bd\u0001J+\u0010\u00bf\u0001\u001a\u0008\u0012\u0004\u0012\u00020=0\u000e2\u0006\u0010@\u001a\u00020=2\t\u0010\u00be\u0001\u001a\u0004\u0018\u00010XH\u0007\u00a2\u0006\u0006\u0008\u00bf\u0001\u0010\u00c0\u0001J(\u0010\u00bf\u0001\u001a\u0008\u0012\u0004\u0012\u00020=0\u000e2\u0006\u0010@\u001a\u00020=2\u0006\u0010K\u001a\u00020\tH\u0007\u00a2\u0006\u0006\u0008\u00bf\u0001\u0010\u00c1\u0001J\u001f\u0010\u00c2\u0001\u001a\u0008\u0012\u0004\u0012\u00020=0\u000e2\u0006\u0010@\u001a\u00020=H\u0007\u00a2\u0006\u0005\u0008\u00c2\u0001\u0010BJ\u0018\u0010\u00c3\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\u000eH\u0007\u00a2\u0006\u0005\u0008\u00c3\u0001\u00109J\u0018\u0010\u00c4\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\u000eH\u0007\u00a2\u0006\u0005\u0008\u00c4\u0001\u00109J\u0018\u0010\u00c5\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\u000eH\u0007\u00a2\u0006\u0005\u0008\u00c5\u0001\u00109J\u0018\u0010\u00c6\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\u000eH\u0007\u00a2\u0006\u0005\u0008\u00c6\u0001\u00109J0\u0010\u00c7\u0001\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001b\"\u0008\u0008\u0000\u0010.*\u00020\u001c2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001bH\u0002\u00a2\u0006\u0006\u0008\u00c7\u0001\u0010\u00c8\u0001J\u001b\u0010\u00ca\u0001\u001a\u00020\u000c2\u0007\u0010\u00c9\u0001\u001a\u00020\u001cH\u0002\u00a2\u0006\u0006\u0008\u00ca\u0001\u0010\u00cb\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000f\n\u0005\u0008\u0003\u0010\u00cc\u0001\u001a\u0006\u0008\u00cd\u0001\u0010\u00ce\u0001R\u001a\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000f\n\u0005\u0008\u0004\u0010\u00cc\u0001\u001a\u0006\u0008\u00cf\u0001\u0010\u00ce\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0006\u0010\u00d0\u0001R\u001c\u0010\u00d1\u0001\u001a\u00020\u00028\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00d1\u0001\u0010\u00cc\u0001\u001a\u0006\u0008\u00d2\u0001\u0010\u00ce\u0001\u00a8\u0006\u00d3\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/channel/ChannelClient;",
        "",
        "",
        "channelType",
        "channelId",
        "Lio/getstream/chat/android/client/ChatClient;",
        "client",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;)V",
        "",
        "messageLimit",
        "memberLimit",
        "",
        "state",
        "Lo23/d;",
        "Lio/getstream/chat/android/models/Channel;",
        "get",
        "(IIZ)Lo23/d;",
        "",
        "memberIds",
        "",
        "extraData",
        "create",
        "(Ljava/util/List;Ljava/util/Map;)Lo23/d;",
        "Lio/getstream/chat/android/client/query/CreateChannelParams;",
        "params",
        "(Lio/getstream/chat/android/client/query/CreateChannelParams;)Lo23/d;",
        "Lio/getstream/chat/android/client/ChatEventListener;",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "listener",
        "Lio/getstream/chat/android/client/utils/observable/Disposable;",
        "subscribe",
        "(Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;",
        "",
        "eventTypes",
        "subscribeFor",
        "([Ljava/lang/String;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;",
        "Landroidx/lifecycle/g0;",
        "lifecycleOwner",
        "(Landroidx/lifecycle/g0;[Ljava/lang/String;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;",
        "Ljava/lang/Class;",
        "([Ljava/lang/Class;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;",
        "(Landroidx/lifecycle/g0;[Ljava/lang/Class;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;",
        "eventType",
        "subscribeForSingle",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;",
        "T",
        "(Ljava/lang/Class;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;",
        "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
        "request",
        "query",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)Lo23/d;",
        "Lio/getstream/chat/android/client/api/models/WatchChannelRequest;",
        "watch",
        "(Lio/getstream/chat/android/client/api/models/WatchChannelRequest;)Lo23/d;",
        "data",
        "(Ljava/util/Map;)Lo23/d;",
        "()Lo23/d;",
        "Ll83/a0;",
        "stopWatching",
        "messageId",
        "Lio/getstream/chat/android/models/Message;",
        "getMessage",
        "(Ljava/lang/String;)Lo23/d;",
        "message",
        "updateMessage",
        "(Lio/getstream/chat/android/models/Message;)Lo23/d;",
        "hard",
        "deleteMessage",
        "(Ljava/lang/String;Z)Lo23/d;",
        "isRetrying",
        "sendMessage",
        "(Lio/getstream/chat/android/models/Message;Z)Lo23/d;",
        "targetId",
        "reason",
        "timeout",
        "banUser",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;",
        "unbanUser",
        "shadowBanUser",
        "removeShadowBan",
        "Lio/getstream/chat/android/models/FilterObject;",
        "filter",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/BannedUsersSort;",
        "sort",
        "offset",
        "limit",
        "Ljava/util/Date;",
        "createdAtAfter",
        "createdAtAfterOrEqual",
        "createdAtBefore",
        "createdAtBeforeOrEqual",
        "Lio/getstream/chat/android/models/BannedUser;",
        "queryBannedUsers",
        "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lo23/d;",
        "markMessageRead",
        "threadId",
        "markThreadRead",
        "markUnread",
        "timestamp",
        "(Ljava/util/Date;)Lo23/d;",
        "markThreadUnread",
        "markRead",
        "delete",
        "show",
        "clearHistory",
        "hide",
        "(Z)Lo23/d;",
        "systemMessage",
        "truncate",
        "Ljava/io/File;",
        "file",
        "Lio/getstream/chat/android/client/utils/ProgressCallback;",
        "callback",
        "Lio/getstream/chat/android/models/UploadedFile;",
        "sendFile",
        "(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;",
        "sendImage",
        "url",
        "deleteFile",
        "deleteImage",
        "Lio/getstream/chat/android/models/Reaction;",
        "reaction",
        "enforceUnique",
        "skipPush",
        "sendReaction",
        "(Lio/getstream/chat/android/models/Reaction;ZZ)Lo23/d;",
        "Lio/getstream/chat/android/client/api/models/SendActionRequest;",
        "sendAction",
        "(Lio/getstream/chat/android/client/api/models/SendActionRequest;)Lo23/d;",
        "reactionType",
        "deleteReaction",
        "(Ljava/lang/String;Ljava/lang/String;)Lo23/d;",
        "getReactions",
        "(Ljava/lang/String;II)Lo23/d;",
        "update",
        "(Lio/getstream/chat/android/models/Message;Ljava/util/Map;)Lo23/d;",
        "set",
        "unset",
        "updatePartial",
        "(Ljava/util/Map;Ljava/util/List;)Lo23/d;",
        "userId",
        "Lio/getstream/chat/android/models/Member;",
        "partialUpdateMember",
        "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;",
        "cooldownTimeInSeconds",
        "enableSlowMode",
        "(I)Lo23/d;",
        "disableSlowMode",
        "hideHistory",
        "hideHistoryBefore",
        "addMembers",
        "(Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/Boolean;)Lo23/d;",
        "Lio/getstream/chat/android/client/query/AddMembersParams;",
        "(Lio/getstream/chat/android/client/query/AddMembersParams;)Lo23/d;",
        "removeMembers",
        "(Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;)Lo23/d;",
        "inviteMembers",
        "acceptInvite",
        "rejectInvite",
        "expiration",
        "mute",
        "(Ljava/lang/Integer;)Lo23/d;",
        "unmute",
        "Lio/getstream/chat/android/models/Mute;",
        "muteUser",
        "(Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;",
        "unmuteUser",
        "muteCurrentUser",
        "unmuteCurrentUser",
        "parentId",
        "keystroke",
        "stopTyping",
        "sendEvent",
        "(Ljava/lang/String;Ljava/util/Map;)Lo23/d;",
        "members",
        "queryMembers",
        "(IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/d;",
        "Lio/getstream/chat/android/models/Attachment;",
        "getFileAttachments",
        "(II)Lo23/d;",
        "getImageAttachments",
        "types",
        "getMessagesWithAttachments",
        "(IILjava/util/List;)Lo23/d;",
        "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;",
        "pagination",
        "getPinnedMessages",
        "(ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)Lo23/d;",
        "expirationDate",
        "pinMessage",
        "(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Lo23/d;",
        "(Lio/getstream/chat/android/models/Message;I)Lo23/d;",
        "unpinMessage",
        "pin",
        "unpin",
        "archive",
        "unarchive",
        "filterRelevantEvents",
        "(Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/ChatEventListener;",
        "event",
        "isRelevantForChannel",
        "(Lio/getstream/chat/android/client/events/ChatEvent;)Z",
        "Ljava/lang/String;",
        "getChannelType",
        "()Ljava/lang/String;",
        "getChannelId",
        "Lio/getstream/chat/android/client/ChatClient;",
        "cid",
        "getCid",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final channelId:Ljava/lang/String;

.field private final channelType:Ljava/lang/String;

.field private final cid:Ljava/lang/String;

.field private final client:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;)V
    .locals 1

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "client"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    const-string p3, ":"

    invoke-static {p1, p3, p2}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/channel/ChannelClient;Lio/getstream/chat/android/client/ChatEventListener;Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/channel/ChannelClient;->filterRelevantEvents$lambda$0(Lio/getstream/chat/android/client/channel/ChannelClient;Lio/getstream/chat/android/client/ChatEventListener;Lio/getstream/chat/android/client/events/ChatEvent;)V

    return-void
.end method

.method public static synthetic addMembers$default(Lio/getstream/chat/android/client/channel/ChannelClient;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/Boolean;ILjava/lang/Object;)Lo23/d;
    .locals 1

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_3

    move-object p5, v0

    :cond_3
    invoke-virtual/range {p0 .. p5}, Lio/getstream/chat/android/client/channel/ChannelClient;->addMembers(Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/Boolean;)Lo23/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic deleteMessage$default(Lio/getstream/chat/android/client/channel/ChannelClient;Ljava/lang/String;ZILjava/lang/Object;)Lo23/d;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/channel/ChannelClient;->deleteMessage(Ljava/lang/String;Z)Lo23/d;

    move-result-object p0

    return-object p0
.end method

.method private final filterRelevantEvents(Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/ChatEventListener;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">(",
            "Lio/getstream/chat/android/client/ChatEventListener<",
            "TT;>;)",
            "Lio/getstream/chat/android/client/ChatEventListener<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/h;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, v1}, Lio/getstream/chat/android/client/h;-><init>(Ljava/lang/Object;Lio/getstream/chat/android/client/ChatEventListener;I)V

    return-object v0
.end method

.method private static final filterRelevantEvents$lambda$0(Lio/getstream/chat/android/client/channel/ChannelClient;Lio/getstream/chat/android/client/ChatEventListener;Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lio/getstream/chat/android/client/channel/ChannelClient;->isRelevantForChannel(Lio/getstream/chat/android/client/events/ChatEvent;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p2}, Lio/getstream/chat/android/client/ChatEventListener;->onEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V

    :cond_0
    return-void
.end method

.method public static synthetic get$default(Lio/getstream/chat/android/client/channel/ChannelClient;IIZILjava/lang/Object;)Lo23/d;
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move p3, v0

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/client/channel/ChannelClient;->get(IIZ)Lo23/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic hide$default(Lio/getstream/chat/android/client/channel/ChannelClient;ZILjava/lang/Object;)Lo23/d;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/channel/ChannelClient;->hide(Z)Lo23/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic inviteMembers$default(Lio/getstream/chat/android/client/channel/ChannelClient;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;ILjava/lang/Object;)Lo23/d;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/client/channel/ChannelClient;->inviteMembers(Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;)Lo23/d;

    move-result-object p0

    return-object p0
.end method

.method private final isRelevantForChannel(Lio/getstream/chat/android/client/events/ChatEvent;)Z
    .locals 1

    instance-of v0, p1, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;

    if-eqz v0, :cond_0

    check-cast p1, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;

    if-eqz v0, :cond_1

    check-cast p1, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;

    if-eqz v0, :cond_2

    check-cast p1, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    instance-of v0, p1, Lio/getstream/chat/android/client/events/ChannelUpdatedEvent;

    if-eqz v0, :cond_3

    check-cast p1, Lio/getstream/chat/android/client/events/ChannelUpdatedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ChannelUpdatedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    instance-of v0, p1, Lio/getstream/chat/android/client/events/ChannelUpdatedByUserEvent;

    if-eqz v0, :cond_4

    check-cast p1, Lio/getstream/chat/android/client/events/ChannelUpdatedByUserEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ChannelUpdatedByUserEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    instance-of v0, p1, Lio/getstream/chat/android/client/events/ChannelVisibleEvent;

    if-eqz v0, :cond_5

    check-cast p1, Lio/getstream/chat/android/client/events/ChannelVisibleEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ChannelVisibleEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_5
    instance-of v0, p1, Lio/getstream/chat/android/client/events/MemberAddedEvent;

    if-eqz v0, :cond_6

    check-cast p1, Lio/getstream/chat/android/client/events/MemberAddedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/MemberAddedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_6
    instance-of v0, p1, Lio/getstream/chat/android/client/events/MemberRemovedEvent;

    if-eqz v0, :cond_7

    check-cast p1, Lio/getstream/chat/android/client/events/MemberRemovedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/MemberRemovedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_7
    instance-of v0, p1, Lio/getstream/chat/android/client/events/MemberUpdatedEvent;

    if-eqz v0, :cond_8

    check-cast p1, Lio/getstream/chat/android/client/events/MemberUpdatedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/MemberUpdatedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_8
    instance-of v0, p1, Lio/getstream/chat/android/client/events/MessageDeletedEvent;

    if-eqz v0, :cond_9

    check-cast p1, Lio/getstream/chat/android/client/events/MessageDeletedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_9
    instance-of v0, p1, Lio/getstream/chat/android/client/events/MessageReadEvent;

    if-eqz v0, :cond_a

    check-cast p1, Lio/getstream/chat/android/client/events/MessageReadEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/MessageReadEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_a
    instance-of v0, p1, Lio/getstream/chat/android/client/events/MessageDeliveredEvent;

    if-eqz v0, :cond_b

    check-cast p1, Lio/getstream/chat/android/client/events/MessageDeliveredEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/MessageDeliveredEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_b
    instance-of v0, p1, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;

    if-eqz v0, :cond_c

    check-cast p1, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_c
    instance-of v0, p1, Lio/getstream/chat/android/client/events/NewMessageEvent;

    if-eqz v0, :cond_d

    check-cast p1, Lio/getstream/chat/android/client/events/NewMessageEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_d
    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;

    if-eqz v0, :cond_e

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_e
    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;

    if-eqz v0, :cond_f

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_f
    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;

    if-eqz v0, :cond_10

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_10
    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationInviteAcceptedEvent;

    if-eqz v0, :cond_11

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationInviteAcceptedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationInviteAcceptedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_11
    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;

    if-eqz v0, :cond_12

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_12
    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationInvitedEvent;

    if-eqz v0, :cond_13

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationInvitedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationInvitedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_13
    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;

    if-eqz v0, :cond_14

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_14
    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;

    if-eqz v0, :cond_15

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_15
    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;

    if-eqz v0, :cond_16

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_16
    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;

    if-eqz v0, :cond_17

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_17
    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;

    if-eqz v0, :cond_18

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_18
    instance-of v0, p1, Lio/getstream/chat/android/client/events/ReactionDeletedEvent;

    if-eqz v0, :cond_19

    check-cast p1, Lio/getstream/chat/android/client/events/ReactionDeletedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ReactionDeletedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_19
    instance-of v0, p1, Lio/getstream/chat/android/client/events/ReactionNewEvent;

    if-eqz v0, :cond_1a

    check-cast p1, Lio/getstream/chat/android/client/events/ReactionNewEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ReactionNewEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1a
    instance-of v0, p1, Lio/getstream/chat/android/client/events/ReactionUpdateEvent;

    if-eqz v0, :cond_1b

    check-cast p1, Lio/getstream/chat/android/client/events/ReactionUpdateEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ReactionUpdateEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1b
    instance-of v0, p1, Lio/getstream/chat/android/client/events/TypingStartEvent;

    if-eqz v0, :cond_1c

    check-cast p1, Lio/getstream/chat/android/client/events/TypingStartEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/TypingStartEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1c
    instance-of v0, p1, Lio/getstream/chat/android/client/events/TypingStopEvent;

    if-eqz v0, :cond_1d

    check-cast p1, Lio/getstream/chat/android/client/events/TypingStopEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/TypingStopEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1d
    instance-of v0, p1, Lio/getstream/chat/android/client/events/ChannelUserBannedEvent;

    if-eqz v0, :cond_1e

    check-cast p1, Lio/getstream/chat/android/client/events/ChannelUserBannedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ChannelUserBannedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1e
    instance-of v0, p1, Lio/getstream/chat/android/client/events/UserStartWatchingEvent;

    if-eqz v0, :cond_1f

    check-cast p1, Lio/getstream/chat/android/client/events/UserStartWatchingEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UserStartWatchingEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1f
    instance-of v0, p1, Lio/getstream/chat/android/client/events/UserStopWatchingEvent;

    if-eqz v0, :cond_20

    check-cast p1, Lio/getstream/chat/android/client/events/UserStopWatchingEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UserStopWatchingEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_20
    instance-of v0, p1, Lio/getstream/chat/android/client/events/ChannelUserUnbannedEvent;

    if-eqz v0, :cond_21

    check-cast p1, Lio/getstream/chat/android/client/events/ChannelUserUnbannedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ChannelUserUnbannedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_21
    instance-of v0, p1, Lio/getstream/chat/android/client/events/PollClosedEvent;

    if-eqz v0, :cond_22

    check-cast p1, Lio/getstream/chat/android/client/events/PollClosedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/PollClosedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_22
    instance-of v0, p1, Lio/getstream/chat/android/client/events/PollDeletedEvent;

    if-eqz v0, :cond_23

    check-cast p1, Lio/getstream/chat/android/client/events/PollDeletedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/PollDeletedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_23
    instance-of v0, p1, Lio/getstream/chat/android/client/events/PollUpdatedEvent;

    if-eqz v0, :cond_24

    check-cast p1, Lio/getstream/chat/android/client/events/PollUpdatedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/PollUpdatedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_24
    instance-of v0, p1, Lio/getstream/chat/android/client/events/VoteCastedEvent;

    if-eqz v0, :cond_25

    check-cast p1, Lio/getstream/chat/android/client/events/VoteCastedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/VoteCastedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_25
    instance-of v0, p1, Lio/getstream/chat/android/client/events/VoteChangedEvent;

    if-eqz v0, :cond_26

    check-cast p1, Lio/getstream/chat/android/client/events/VoteChangedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/VoteChangedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_26
    instance-of v0, p1, Lio/getstream/chat/android/client/events/VoteRemovedEvent;

    if-eqz v0, :cond_27

    check-cast p1, Lio/getstream/chat/android/client/events/VoteRemovedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/VoteRemovedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_27
    instance-of v0, p1, Lio/getstream/chat/android/client/events/AnswerCastedEvent;

    if-eqz v0, :cond_28

    check-cast p1, Lio/getstream/chat/android/client/events/AnswerCastedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/AnswerCastedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_28
    instance-of v0, p1, Lio/getstream/chat/android/client/events/UnknownEvent;

    if-eqz v0, :cond_29

    check-cast p1, Lio/getstream/chat/android/client/events/UnknownEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UnknownEvent;->getRawData()Ljava/util/Map;

    move-result-object p1

    const-string v0, "cid"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_29
    instance-of v0, p1, Lio/getstream/chat/android/client/events/AIIndicatorUpdatedEvent;

    if-eqz v0, :cond_2a

    check-cast p1, Lio/getstream/chat/android/client/events/AIIndicatorUpdatedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/AIIndicatorUpdatedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2a
    instance-of v0, p1, Lio/getstream/chat/android/client/events/AIIndicatorClearEvent;

    if-eqz v0, :cond_2b

    check-cast p1, Lio/getstream/chat/android/client/events/AIIndicatorClearEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/AIIndicatorClearEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2b
    instance-of v0, p1, Lio/getstream/chat/android/client/events/AIIndicatorStopEvent;

    if-eqz v0, :cond_2c

    check-cast p1, Lio/getstream/chat/android/client/events/AIIndicatorStopEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/AIIndicatorStopEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2c
    instance-of v0, p1, Lio/getstream/chat/android/client/events/DraftMessageUpdatedEvent;

    if-eqz v0, :cond_2d

    check-cast p1, Lio/getstream/chat/android/client/events/DraftMessageUpdatedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/DraftMessageUpdatedEvent;->getDraftMessage()Lio/getstream/chat/android/models/DraftMessage;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/DraftMessage;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2d
    instance-of v0, p1, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;

    if-eqz v0, :cond_2e

    check-cast p1, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->getDraftMessage()Lio/getstream/chat/android/models/DraftMessage;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/DraftMessage;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2e
    instance-of v0, p1, Lio/getstream/chat/android/client/events/ReminderCreatedEvent;

    if-eqz v0, :cond_2f

    check-cast p1, Lio/getstream/chat/android/client/events/ReminderCreatedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ReminderCreatedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2f
    instance-of v0, p1, Lio/getstream/chat/android/client/events/ReminderUpdatedEvent;

    if-eqz v0, :cond_30

    check-cast p1, Lio/getstream/chat/android/client/events/ReminderUpdatedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ReminderUpdatedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_30
    instance-of v0, p1, Lio/getstream/chat/android/client/events/ReminderDeletedEvent;

    if-eqz v0, :cond_31

    check-cast p1, Lio/getstream/chat/android/client/events/ReminderDeletedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ReminderDeletedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_31
    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationReminderDueEvent;

    if-eqz v0, :cond_32

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationReminderDueEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationReminderDueEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_32
    instance-of v0, p1, Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;

    if-eqz v0, :cond_33

    check-cast p1, Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_33
    instance-of v0, p1, Lio/getstream/chat/android/client/events/ThreadUpdatedEvent;

    if-eqz v0, :cond_34

    check-cast p1, Lio/getstream/chat/android/client/events/ThreadUpdatedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ThreadUpdatedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_34
    instance-of v0, p1, Lio/getstream/chat/android/client/events/HealthEvent;

    if-nez v0, :cond_36

    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationChannelMutesUpdatedEvent;

    if-nez v0, :cond_36

    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationMutesUpdatedEvent;

    if-nez v0, :cond_36

    instance-of v0, p1, Lio/getstream/chat/android/client/events/GlobalUserBannedEvent;

    if-nez v0, :cond_36

    instance-of v0, p1, Lio/getstream/chat/android/client/events/UserDeletedEvent;

    if-nez v0, :cond_36

    instance-of v0, p1, Lio/getstream/chat/android/client/events/UserPresenceChangedEvent;

    if-nez v0, :cond_36

    instance-of v0, p1, Lio/getstream/chat/android/client/events/GlobalUserUnbannedEvent;

    if-nez v0, :cond_36

    instance-of v0, p1, Lio/getstream/chat/android/client/events/UserUpdatedEvent;

    if-nez v0, :cond_36

    instance-of v0, p1, Lio/getstream/chat/android/client/events/ConnectedEvent;

    if-nez v0, :cond_36

    instance-of v0, p1, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;

    if-nez v0, :cond_36

    instance-of v0, p1, Lio/getstream/chat/android/client/events/ConnectingEvent;

    if-nez v0, :cond_36

    instance-of v0, p1, Lio/getstream/chat/android/client/events/DisconnectedEvent;

    if-nez v0, :cond_36

    instance-of v0, p1, Lio/getstream/chat/android/client/events/ErrorEvent;

    if-nez v0, :cond_36

    instance-of p1, p1, Lio/getstream/chat/android/client/events/MarkAllReadEvent;

    if-eqz p1, :cond_35

    goto :goto_0

    :cond_35
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_36
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic keystroke$default(Lio/getstream/chat/android/client/channel/ChannelClient;Ljava/lang/String;ILjava/lang/Object;)Lo23/d;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/channel/ChannelClient;->keystroke(Ljava/lang/String;)Lo23/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic mute$default(Lio/getstream/chat/android/client/channel/ChannelClient;Ljava/lang/Integer;ILjava/lang/Object;)Lo23/d;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/channel/ChannelClient;->mute(Ljava/lang/Integer;)Lo23/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic muteUser$default(Lio/getstream/chat/android/client/channel/ChannelClient;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)Lo23/d;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/channel/ChannelClient;->muteUser(Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic partialUpdateMember$default(Lio/getstream/chat/android/client/channel/ChannelClient;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;ILjava/lang/Object;)Lo23/d;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p2, Lm83/z;->w:Lm83/z;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    sget-object p3, Lm83/y;->w:Lm83/y;

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/client/channel/ChannelClient;->partialUpdateMember(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic queryBannedUsers$default(Lio/getstream/chat/android/client/channel/ChannelClient;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/Object;)Lo23/d;
    .locals 1

    and-int/lit8 p10, p9, 0x1

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    sget-object p2, Lio/getstream/chat/android/models/querysort/QuerySortByField;->Companion:Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;

    const-string p10, "created_at"

    invoke-virtual {p2, p10}, Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;->ascByName(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object p2

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    move-object p8, v0

    :cond_7
    invoke-virtual/range {p0 .. p8}, Lio/getstream/chat/android/client/channel/ChannelClient;->queryBannedUsers(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lo23/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic queryMembers$default(Lio/getstream/chat/android/client/channel/ChannelClient;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;ILjava/lang/Object;)Lo23/d;
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    sget-object p5, Lm83/y;->w:Lm83/y;

    :cond_0
    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lio/getstream/chat/android/client/channel/ChannelClient;->queryMembers(IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic removeMembers$default(Lio/getstream/chat/android/client/channel/ChannelClient;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;ILjava/lang/Object;)Lo23/d;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/client/channel/ChannelClient;->removeMembers(Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;)Lo23/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic sendEvent$default(Lio/getstream/chat/android/client/channel/ChannelClient;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lo23/d;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lm83/z;->w:Lm83/z;

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/channel/ChannelClient;->sendEvent(Ljava/lang/String;Ljava/util/Map;)Lo23/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic sendFile$default(Lio/getstream/chat/android/client/channel/ChannelClient;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;ILjava/lang/Object;)Lo23/d;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/channel/ChannelClient;->sendFile(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic sendImage$default(Lio/getstream/chat/android/client/channel/ChannelClient;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;ILjava/lang/Object;)Lo23/d;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/channel/ChannelClient;->sendImage(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic sendMessage$default(Lio/getstream/chat/android/client/channel/ChannelClient;Lio/getstream/chat/android/models/Message;ZILjava/lang/Object;)Lo23/d;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/channel/ChannelClient;->sendMessage(Lio/getstream/chat/android/models/Message;Z)Lo23/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic sendReaction$default(Lio/getstream/chat/android/client/channel/ChannelClient;Lio/getstream/chat/android/models/Reaction;ZZILjava/lang/Object;)Lo23/d;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/client/channel/ChannelClient;->sendReaction(Lio/getstream/chat/android/models/Reaction;ZZ)Lo23/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic stopTyping$default(Lio/getstream/chat/android/client/channel/ChannelClient;Ljava/lang/String;ILjava/lang/Object;)Lo23/d;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/channel/ChannelClient;->stopTyping(Ljava/lang/String;)Lo23/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic truncate$default(Lio/getstream/chat/android/client/channel/ChannelClient;Lio/getstream/chat/android/models/Message;ILjava/lang/Object;)Lo23/d;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/channel/ChannelClient;->truncate(Lio/getstream/chat/android/models/Message;)Lo23/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic update$default(Lio/getstream/chat/android/client/channel/ChannelClient;Lio/getstream/chat/android/models/Message;Ljava/util/Map;ILjava/lang/Object;)Lo23/d;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    sget-object p2, Lm83/z;->w:Lm83/z;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/channel/ChannelClient;->update(Lio/getstream/chat/android/models/Message;Ljava/util/Map;)Lo23/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic updatePartial$default(Lio/getstream/chat/android/client/channel/ChannelClient;Ljava/util/Map;Ljava/util/List;ILjava/lang/Object;)Lo23/d;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    sget-object p1, Lm83/z;->w:Lm83/z;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/channel/ChannelClient;->updatePartial(Ljava/util/Map;Ljava/util/List;)Lo23/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final acceptInvite(Ljava/lang/String;)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/client/ChatClient;->acceptInvite(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final addMembers(Lio/getstream/chat/android/client/query/AddMembersParams;)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/query/AddMembersParams;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    .line 6
    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    .line 7
    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    .line 8
    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/client/ChatClient;->addMembers(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/query/AddMembersParams;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final addMembers(Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/Boolean;)Lo23/d;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/Boolean;",
            "Ljava/util/Date;",
            "Ljava/lang/Boolean;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "memberIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    .line 2
    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    .line 3
    iget-object v3, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    move-object v8, p5

    .line 4
    invoke-virtual/range {v1 .. v8}, Lio/getstream/chat/android/client/ChatClient;->addMembers(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/Boolean;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final archive()Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/client/ChatClient;->archiveChannel(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final banUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "targetId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v3, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    move-object v2, p1

    move-object v5, p2

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Lio/getstream/chat/android/client/ChatClient;->banUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final create(Lio/getstream/chat/android/client/query/CreateChannelParams;)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/query/CreateChannelParams;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    .line 6
    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    .line 7
    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    .line 8
    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/client/ChatClient;->createChannel(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/query/CreateChannelParams;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/util/List;Ljava/util/Map;)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "memberIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    .line 2
    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    .line 3
    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    .line 4
    invoke-virtual {v0, v1, v2, p1, p2}, Lio/getstream/chat/android/client/ChatClient;->createChannel(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final delete()Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/client/ChatClient;->deleteChannel(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final deleteFile(Ljava/lang/String;)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/client/ChatClient;->deleteFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final deleteImage(Ljava/lang/String;)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/client/ChatClient;->deleteImage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final deleteMessage(Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lio/getstream/chat/android/client/channel/ChannelClient;->deleteMessage(Ljava/lang/String;Z)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final deleteMessage(Ljava/lang/String;Z)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/ChatClient;->deleteMessage(Ljava/lang/String;Z)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final deleteReaction(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-virtual {v0, p1, p2, v1}, Lio/getstream/chat/android/client/ChatClient;->deleteReaction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final disableSlowMode()Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/client/ChatClient;->disableSlowMode(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final enableSlowMode(I)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/client/ChatClient;->enableSlowMode(Ljava/lang/String;Ljava/lang/String;I)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final get(IIZ)Lo23/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIZ)",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, p2, p3}, Lio/getstream/chat/android/client/ChatClient;->getChannel(Ljava/lang/String;IIZ)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final getChannelId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    return-object v0
.end method

.method public final getChannelType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    return-object v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getFileAttachments(II)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1, p2}, Lio/getstream/chat/android/client/ChatClient;->getFileAttachments(Ljava/lang/String;Ljava/lang/String;II)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final getImageAttachments(II)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1, p2}, Lio/getstream/chat/android/client/ChatClient;->getImageAttachments(Ljava/lang/String;Ljava/lang/String;II)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final getMessage(Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/ChatClient;->getMessage(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final getMessagesWithAttachments(IILjava/util/List;)Lo23/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "types"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    move v4, p1

    move v5, p2

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Lio/getstream/chat/android/client/ChatClient;->getMessagesWithAttachments(Ljava/lang/String;Ljava/lang/String;IILjava/util/List;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final getPinnedMessages(ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)Lo23/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pagination"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    move v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Lio/getstream/chat/android/client/ChatClient;->getPinnedMessages(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final getReactions(Ljava/lang/String;II)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0, p1, p2, p3}, Lio/getstream/chat/android/client/ChatClient;->getReactions(Ljava/lang/String;II)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final hide(Z)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/client/ChatClient;->hideChannel(Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final inviteMembers(Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;)Lo23/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/Boolean;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "memberIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Lio/getstream/chat/android/client/ChatClient;->inviteMembers(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final keystroke()Lo23/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-static {p0, v0, v1, v0}, Lio/getstream/chat/android/client/channel/ChannelClient;->keystroke$default(Lio/getstream/chat/android/client/channel/ChannelClient;Ljava/lang/String;ILjava/lang/Object;)Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final keystroke(Ljava/lang/String;)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/client/ChatClient;->keystroke(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final markMessageRead(Ljava/lang/String;)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/client/ChatClient;->markMessageRead(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final markRead()Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/client/ChatClient;->markRead(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final markThreadRead(Ljava/lang/String;)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "threadId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/client/ChatClient;->markThreadRead(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final markThreadUnread(Ljava/lang/String;)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "threadId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/client/ChatClient;->markThreadUnread(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final markUnread(Ljava/lang/String;)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/client/ChatClient;->markUnread(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final markUnread(Ljava/util/Date;)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "timestamp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/client/ChatClient;->markUnread(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final mute()Lo23/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-static {p0, v0, v1, v0}, Lio/getstream/chat/android/client/channel/ChannelClient;->mute$default(Lio/getstream/chat/android/client/channel/ChannelClient;Ljava/lang/Integer;ILjava/lang/Object;)Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final mute(Ljava/lang/Integer;)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/client/ChatClient;->muteChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final muteCurrentUser()Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->muteCurrentUser()Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final muteUser(Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lio/getstream/chat/android/client/channel/ChannelClient;->muteUser(Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final muteUser(Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/ChatClient;->muteUser(Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final partialUpdateMember(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "set"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unset"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Lio/getstream/chat/android/client/ChatClient;->partialUpdateMember(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final pin()Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/client/ChatClient;->pinChannel(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final pinMessage(Lio/getstream/chat/android/models/Message;I)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "I)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/ChatClient;->pinMessage(Lio/getstream/chat/android/models/Message;I)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final pinMessage(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/util/Date;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/ChatClient;->pinMessage(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final query(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)Lo23/d;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v4, p1

    invoke-static/range {v1 .. v7}, Lio/getstream/chat/android/client/ChatClient;->queryChannel$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;ZILjava/lang/Object;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final queryBannedUsers()Lo23/d;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    const/16 v9, 0xff

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    .line 1
    invoke-static/range {v0 .. v10}, Lio/getstream/chat/android/client/channel/ChannelClient;->queryBannedUsers$default(Lio/getstream/chat/android/client/channel/ChannelClient;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/Object;)Lo23/d;

    move-result-object v1

    return-object v1
.end method

.method public final queryBannedUsers(Lio/getstream/chat/android/models/FilterObject;)Lo23/d;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const/16 v9, 0xfe

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 2
    invoke-static/range {v0 .. v10}, Lio/getstream/chat/android/client/channel/ChannelClient;->queryBannedUsers$default(Lio/getstream/chat/android/client/channel/ChannelClient;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/Object;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final queryBannedUsers(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/BannedUsersSort;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    .line 3
    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0xfc

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v11}, Lio/getstream/chat/android/client/channel/ChannelClient;->queryBannedUsers$default(Lio/getstream/chat/android/client/channel/ChannelClient;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/Object;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final queryBannedUsers(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;)Lo23/d;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/BannedUsersSort;",
            ">;",
            "Ljava/lang/Integer;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    .line 4
    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0xf8

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v1 .. v11}, Lio/getstream/chat/android/client/channel/ChannelClient;->queryBannedUsers$default(Lio/getstream/chat/android/client/channel/ChannelClient;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/Object;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final queryBannedUsers(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;)Lo23/d;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/BannedUsersSort;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    .line 5
    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0xf0

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    invoke-static/range {v1 .. v11}, Lio/getstream/chat/android/client/channel/ChannelClient;->queryBannedUsers$default(Lio/getstream/chat/android/client/channel/ChannelClient;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/Object;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final queryBannedUsers(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;)Lo23/d;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/BannedUsersSort;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/util/Date;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    .line 6
    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0xe0

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    invoke-static/range {v1 .. v11}, Lio/getstream/chat/android/client/channel/ChannelClient;->queryBannedUsers$default(Lio/getstream/chat/android/client/channel/ChannelClient;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/Object;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final queryBannedUsers(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;)Lo23/d;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/BannedUsersSort;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    .line 7
    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0xc0

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-static/range {v1 .. v11}, Lio/getstream/chat/android/client/channel/ChannelClient;->queryBannedUsers$default(Lio/getstream/chat/android/client/channel/ChannelClient;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/Object;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final queryBannedUsers(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lo23/d;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/BannedUsersSort;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    .line 8
    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0x80

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-static/range {v1 .. v11}, Lio/getstream/chat/android/client/channel/ChannelClient;->queryBannedUsers$default(Lio/getstream/chat/android/client/channel/ChannelClient;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/Object;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final queryBannedUsers(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lo23/d;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/BannedUsersSort;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    const-string v0, "channel_cid"

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-static {v0, v1}, Lio/getstream/chat/android/models/Filters;->eq(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object v0

    .line 10
    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    if-eqz p1, :cond_1

    .line 11
    filled-new-array {v0, p1}, [Lio/getstream/chat/android/models/FilterObject;

    move-result-object p1

    invoke-static {p1}, Lio/getstream/chat/android/models/Filters;->and([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    move-object v2, p1

    :goto_0
    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    goto :goto_2

    :cond_1
    :goto_1
    move-object v2, v0

    goto :goto_0

    .line 12
    :goto_2
    invoke-virtual/range {v1 .. v9}, Lio/getstream/chat/android/client/ChatClient;->queryBannedUsers(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final queryMembers(IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/d;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Member;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "filter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sort"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "members"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    move v4, p1

    move v5, p2

    move-object v6, p3

    move-object v7, p4

    move-object v8, p5

    invoke-virtual/range {v1 .. v8}, Lio/getstream/chat/android/client/ChatClient;->queryMembers(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final rejectInvite()Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/client/ChatClient;->rejectInvite(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final removeMembers(Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;)Lo23/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/Boolean;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "memberIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Lio/getstream/chat/android/client/ChatClient;->removeMembers(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final removeShadowBan(Ljava/lang/String;)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "targetId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, p1, v1, v2}, Lio/getstream/chat/android/client/ChatClient;->removeShadowBan(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final sendAction(Lio/getstream/chat/android/client/api/models/SendActionRequest;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/SendActionRequest;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/ChatClient;->sendAction(Lio/getstream/chat/android/client/api/models/SendActionRequest;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final sendEvent(Ljava/lang/String;Ljava/util/Map;)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "eventType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, p1, v1, v2, p2}, Lio/getstream/chat/android/client/ChatClient;->sendEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final sendFile(Ljava/io/File;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lio/getstream/chat/android/client/channel/ChannelClient;->sendFile(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final sendFile(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lio/getstream/chat/android/client/utils/ProgressCallback;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1, p2}, Lio/getstream/chat/android/client/ChatClient;->sendFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final sendImage(Ljava/io/File;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lio/getstream/chat/android/client/channel/ChannelClient;->sendImage(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final sendImage(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lio/getstream/chat/android/client/utils/ProgressCallback;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1, p2}, Lio/getstream/chat/android/client/ChatClient;->sendImage(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final sendMessage(Lio/getstream/chat/android/models/Message;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lio/getstream/chat/android/client/channel/ChannelClient;->sendMessage(Lio/getstream/chat/android/models/Message;Z)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final sendMessage(Lio/getstream/chat/android/models/Message;Z)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Z)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1, p2}, Lio/getstream/chat/android/client/ChatClient;->sendMessage(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Z)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final sendReaction(Lio/getstream/chat/android/models/Reaction;)Lo23/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Reaction;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    .line 1
    const-string v0, "reaction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/client/channel/ChannelClient;->sendReaction$default(Lio/getstream/chat/android/client/channel/ChannelClient;Lio/getstream/chat/android/models/Reaction;ZZILjava/lang/Object;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final sendReaction(Lio/getstream/chat/android/models/Reaction;Z)Lo23/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Reaction;",
            "Z)",
            "Lo23/d;"
        }
    .end annotation

    .line 2
    const-string v0, "reaction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/client/channel/ChannelClient;->sendReaction$default(Lio/getstream/chat/android/client/channel/ChannelClient;Lio/getstream/chat/android/models/Reaction;ZZILjava/lang/Object;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final sendReaction(Lio/getstream/chat/android/models/Reaction;ZZ)Lo23/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Reaction;",
            "ZZ)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "reaction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->cid:Ljava/lang/String;

    invoke-virtual {v0, p1, p2, v1, p3}, Lio/getstream/chat/android/client/ChatClient;->sendReaction(Lio/getstream/chat/android/models/Reaction;ZLjava/lang/String;Z)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final shadowBanUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "targetId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v3, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    move-object v2, p1

    move-object v5, p2

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Lio/getstream/chat/android/client/ChatClient;->shadowBanUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final show()Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/client/ChatClient;->showChannel(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final stopTyping()Lo23/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-static {p0, v0, v1, v0}, Lio/getstream/chat/android/client/channel/ChannelClient;->stopTyping$default(Lio/getstream/chat/android/client/channel/ChannelClient;Ljava/lang/String;ILjava/lang/Object;)Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final stopTyping(Ljava/lang/String;)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/client/ChatClient;->stopTyping(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final stopWatching()Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/client/ChatClient;->stopWatching(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final subscribe(Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatEventListener<",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;)",
            "Lio/getstream/chat/android/client/utils/observable/Disposable;"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    new-instance v1, Lio/getstream/chat/android/client/h;

    const/4 v2, 0x2

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/h;-><init>(Ljava/lang/Object;Lio/getstream/chat/android/client/ChatEventListener;I)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/ChatClient;->subscribe(Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;

    move-result-object p1

    return-object p1
.end method

.method public final subscribeFor(Landroidx/lifecycle/g0;[Ljava/lang/Class;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/g0;",
            "[",
            "Ljava/lang/Class<",
            "+",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;",
            "Lio/getstream/chat/android/client/ChatEventListener<",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;)",
            "Lio/getstream/chat/android/client/utils/observable/Disposable;"
        }
    .end annotation

    const-string v0, "lifecycleOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    .line 12
    array-length v1, p2

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/Class;

    .line 13
    new-instance v1, Lio/getstream/chat/android/client/h;

    const/4 v2, 0x2

    invoke-direct {v1, p0, p3, v2}, Lio/getstream/chat/android/client/h;-><init>(Ljava/lang/Object;Lio/getstream/chat/android/client/ChatEventListener;I)V

    .line 14
    invoke-virtual {v0, p1, p2, v1}, Lio/getstream/chat/android/client/ChatClient;->subscribeFor(Landroidx/lifecycle/g0;[Ljava/lang/Class;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;

    move-result-object p1

    return-object p1
.end method

.method public final subscribeFor(Landroidx/lifecycle/g0;[Ljava/lang/String;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/g0;",
            "[",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/ChatEventListener<",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;)",
            "Lio/getstream/chat/android/client/utils/observable/Disposable;"
        }
    .end annotation

    const-string v0, "lifecycleOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    .line 5
    array-length v1, p2

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    .line 6
    new-instance v1, Lio/getstream/chat/android/client/h;

    const/4 v2, 0x2

    invoke-direct {v1, p0, p3, v2}, Lio/getstream/chat/android/client/h;-><init>(Ljava/lang/Object;Lio/getstream/chat/android/client/ChatEventListener;I)V

    .line 7
    invoke-virtual {v0, p1, p2, v1}, Lio/getstream/chat/android/client/ChatClient;->subscribeFor(Landroidx/lifecycle/g0;[Ljava/lang/String;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;

    move-result-object p1

    return-object p1
.end method

.method public final subscribeFor([Ljava/lang/Class;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "+",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;",
            "Lio/getstream/chat/android/client/ChatEventListener<",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;)",
            "Lio/getstream/chat/android/client/utils/observable/Disposable;"
        }
    .end annotation

    const-string v0, "eventTypes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Class;

    .line 9
    new-instance v1, Lio/getstream/chat/android/client/h;

    const/4 v2, 0x2

    invoke-direct {v1, p0, p2, v2}, Lio/getstream/chat/android/client/h;-><init>(Ljava/lang/Object;Lio/getstream/chat/android/client/ChatEventListener;I)V

    .line 10
    invoke-virtual {v0, p1, v1}, Lio/getstream/chat/android/client/ChatClient;->subscribeFor([Ljava/lang/Class;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;

    move-result-object p1

    return-object p1
.end method

.method public final subscribeFor([Ljava/lang/String;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/ChatEventListener<",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;)",
            "Lio/getstream/chat/android/client/utils/observable/Disposable;"
        }
    .end annotation

    const-string v0, "eventTypes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    .line 2
    new-instance v1, Lio/getstream/chat/android/client/h;

    const/4 v2, 0x2

    invoke-direct {v1, p0, p2, v2}, Lio/getstream/chat/android/client/h;-><init>(Ljava/lang/Object;Lio/getstream/chat/android/client/ChatEventListener;I)V

    .line 3
    invoke-virtual {v0, p1, v1}, Lio/getstream/chat/android/client/ChatClient;->subscribeFor([Ljava/lang/String;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;

    move-result-object p1

    return-object p1
.end method

.method public final subscribeForSingle(Ljava/lang/Class;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lio/getstream/chat/android/client/ChatEventListener<",
            "TT;>;)",
            "Lio/getstream/chat/android/client/utils/observable/Disposable;"
        }
    .end annotation

    const-string v0, "eventType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    .line 5
    new-instance v1, Lio/getstream/chat/android/client/h;

    const/4 v2, 0x2

    invoke-direct {v1, p0, p2, v2}, Lio/getstream/chat/android/client/h;-><init>(Ljava/lang/Object;Lio/getstream/chat/android/client/ChatEventListener;I)V

    .line 6
    invoke-virtual {v0, p1, v1}, Lio/getstream/chat/android/client/ChatClient;->subscribeForSingle(Ljava/lang/Class;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;

    move-result-object p1

    return-object p1
.end method

.method public final subscribeForSingle(Ljava/lang/String;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/ChatEventListener<",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;)",
            "Lio/getstream/chat/android/client/utils/observable/Disposable;"
        }
    .end annotation

    const-string v0, "eventType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    .line 2
    new-instance v1, Lio/getstream/chat/android/client/h;

    const/4 v2, 0x2

    invoke-direct {v1, p0, p2, v2}, Lio/getstream/chat/android/client/h;-><init>(Ljava/lang/Object;Lio/getstream/chat/android/client/ChatEventListener;I)V

    .line 3
    invoke-virtual {v0, p1, v1}, Lio/getstream/chat/android/client/ChatClient;->subscribeForSingle(Ljava/lang/String;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;

    move-result-object p1

    return-object p1
.end method

.method public final truncate()Lo23/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-static {p0, v0, v1, v0}, Lio/getstream/chat/android/client/channel/ChannelClient;->truncate$default(Lio/getstream/chat/android/client/channel/ChannelClient;Lio/getstream/chat/android/models/Message;ILjava/lang/Object;)Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final truncate(Lio/getstream/chat/android/models/Message;)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/client/ChatClient;->truncateChannel(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final unarchive()Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/client/ChatClient;->unarchiveChannel(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final unbanUser(Ljava/lang/String;)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "targetId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, p1, v1, v2}, Lio/getstream/chat/android/client/ChatClient;->unbanUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final unmute()Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/client/ChatClient;->unmuteChannel(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final unmuteCurrentUser()Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->unmuteCurrentUser()Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final unmuteUser(Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/ChatClient;->unmuteUser(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final unpin()Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/client/ChatClient;->unpinChannel(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final unpinMessage(Lio/getstream/chat/android/models/Message;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/ChatClient;->unpinMessage(Lio/getstream/chat/android/models/Message;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final update(Lio/getstream/chat/android/models/Message;Ljava/util/Map;)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "extraData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1, p2}, Lio/getstream/chat/android/client/ChatClient;->updateChannel(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Ljava/util/Map;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final updateMessage(Lio/getstream/chat/android/models/Message;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/ChatClient;->updateMessage(Lio/getstream/chat/android/models/Message;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final updatePartial(Ljava/util/Map;Ljava/util/List;)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "set"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unset"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1, p2}, Lio/getstream/chat/android/client/ChatClient;->updateChannelPartial(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final watch()Lo23/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    .line 5
    iget-object v0, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    new-instance v3, Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    invoke-direct {v3}, Lio/getstream/chat/android/client/api/models/WatchChannelRequest;-><init>()V

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lio/getstream/chat/android/client/ChatClient;->queryChannel$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;ZILjava/lang/Object;)Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final watch(Lio/getstream/chat/android/client/api/models/WatchChannelRequest;)Lo23/d;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/WatchChannelRequest;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v1, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->client:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/channel/ChannelClient;->channelId:Ljava/lang/String;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v4, p1

    invoke-static/range {v1 .. v7}, Lio/getstream/chat/android/client/ChatClient;->queryChannel$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;ZILjava/lang/Object;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final watch(Ljava/util/Map;)Lo23/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    invoke-direct {v0}, Lio/getstream/chat/android/client/api/models/WatchChannelRequest;-><init>()V

    .line 3
    invoke-virtual {v0}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->getData()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 4
    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/channel/ChannelClient;->watch(Lio/getstream/chat/android/client/api/models/WatchChannelRequest;)Lo23/d;

    move-result-object p1

    return-object p1
.end method
