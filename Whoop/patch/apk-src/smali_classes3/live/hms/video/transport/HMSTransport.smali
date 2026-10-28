.class public final Llive/hms/video/transport/HMSTransport;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/transport/ITransport;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/transport/HMSTransport$Companion;,
        Llive/hms/video/transport/HMSTransport$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d0\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0003\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008*\u0006\u008a\u0003\u0090\u0003\u0093\u0003\u0008\u0000\u0018\u0000 \u00bc\u00032\u00020\u0001:\u0002\u00bc\u0003BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u0096@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010$\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 H\u0016\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010(\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u0018\u0010,\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*H\u0096@\u00a2\u0006\u0004\u0008,\u0010-J\u000f\u0010.\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008.\u0010/J\u000f\u00101\u001a\u000200H\u0016\u00a2\u0006\u0004\u00081\u00102JP\u0010=\u001a\u00020;2\u0006\u00103\u001a\u00020&2\u0006\u00104\u001a\u00020&2\u0006\u00105\u001a\u00020&2\u0006\u00107\u001a\u0002062\u0008\u00109\u001a\u0004\u0018\u0001082\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u001b\u0018\u00010:H\u0096@\u00a2\u0006\u0004\u0008=\u0010>J\u001f\u0010A\u001a\u00020\u001b2\u0006\u0010?\u001a\u0002002\u0006\u0010@\u001a\u000200H\u0016\u00a2\u0006\u0004\u0008A\u0010BJ\u0018\u0010D\u001a\u00020\u001b2\u0006\u0010C\u001a\u000200H\u0096@\u00a2\u0006\u0004\u0008D\u0010EJ\u0010\u0010F\u001a\u00020\u001bH\u0096@\u00a2\u0006\u0004\u0008F\u0010\u001dJA\u0010M\u001a\u00020\u001b2\u0008\u00103\u001a\u0004\u0018\u00010&2\u0008\u0010G\u001a\u0004\u0018\u00010&2\u0008\u0010I\u001a\u0004\u0018\u00010H2\u0008\u0010K\u001a\u0004\u0018\u00010J2\u0008\u0010L\u001a\u0004\u0018\u00010&H\u0016\u00a2\u0006\u0004\u0008M\u0010NJX\u0010V\u001a\u00020\u001b2\u0006\u0010O\u001a\u00020&2\u0006\u00105\u001a\u00020&2\u0006\u0010P\u001a\u00020&2\u0006\u0010Q\u001a\u00020&2\u0006\u0010R\u001a\u0002002\u0006\u0010S\u001a\u0002002\u0006\u00104\u001a\u00020&2\u0006\u0010T\u001a\u0002002\u0006\u0010U\u001a\u000200H\u0096@\u00a2\u0006\u0004\u0008V\u0010WJ\u0018\u0010Y\u001a\u00020\u001b2\u0006\u0010X\u001a\u000200H\u0096@\u00a2\u0006\u0004\u0008Y\u0010EJ(\u0010]\u001a\u00020\u001b2\u0006\u0010Z\u001a\u00020&2\u0006\u0010[\u001a\u00020&2\u0006\u0010\\\u001a\u000200H\u0096@\u00a2\u0006\u0004\u0008]\u0010^J*\u0010`\u001a\u00020\u001b2\u0006\u00103\u001a\u00020&2\u0006\u0010[\u001a\u00020&2\u0008\u0010_\u001a\u0004\u0018\u00010HH\u0096@\u00a2\u0006\u0004\u0008`\u0010aJ\'\u0010c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010?\u001a\u0002002\u0006\u0010b\u001a\u000200H\u0016\u00a2\u0006\u0004\u0008c\u0010dJ\u0010\u0010e\u001a\u00020\u001bH\u0096@\u00a2\u0006\u0004\u0008e\u0010\u001dJ*\u0010h\u001a\u0004\u0018\u00010*2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010g\u001a\u00020fH\u0096@\u00a2\u0006\u0004\u0008h\u0010iJ\u000f\u0010j\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008j\u0010/J6\u0010o\u001a\u0004\u0018\u00010*2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010l\u001a\u0004\u0018\u00010k2\u0008\u0010n\u001a\u0004\u0018\u00010mH\u0096@\u00a2\u0006\u0004\u0008o\u0010pJ3\u0010t\u001a\u00020s2\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010l\u001a\u0004\u0018\u00010k2\u0006\u0010r\u001a\u00020q2\u0008\u0010n\u001a\u0004\u0018\u00010mH\u0016\u00a2\u0006\u0004\u0008t\u0010uJ\u0017\u0010v\u001a\u00020\u001b2\u0006\u0010r\u001a\u00020qH\u0016\u00a2\u0006\u0004\u0008v\u0010wJ$\u0010{\u001a\u0008\u0012\u0004\u0012\u00020*0z2\u000c\u0010y\u001a\u0008\u0012\u0004\u0012\u00020*0xH\u0096@\u00a2\u0006\u0004\u0008{\u0010|J\u001e\u0010}\u001a\u00020\u001b2\u000c\u0010y\u001a\u0008\u0012\u0004\u0012\u00020*0xH\u0096@\u00a2\u0006\u0004\u0008}\u0010|J\u0010\u0010~\u001a\u00020\u001bH\u0096@\u00a2\u0006\u0004\u0008~\u0010\u001dJ\u001d\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0096@\u00a2\u0006\u0006\u0008\u0082\u0001\u0010\u0083\u0001J\u0015\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0096@\u00a2\u0006\u0005\u0008\u0085\u0001\u0010\u001dJ\u0015\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0096@\u00a2\u0006\u0005\u0008\u0086\u0001\u0010\u001dJ$\u0010\u0088\u0001\u001a\u00020\u001b2\u0006\u00105\u001a\u00020&2\u0007\u0010\u0087\u0001\u001a\u00020&H\u0096@\u00a2\u0006\u0006\u0008\u0088\u0001\u0010\u0089\u0001J%\u0010\u008b\u0001\u001a\u0002002\u0007\u0010\u0087\u0001\u001a\u00020&2\u0007\u0010\u008a\u0001\u001a\u000200H\u0096@\u00a2\u0006\u0006\u0008\u008b\u0001\u0010\u008c\u0001J-\u0010\u008f\u0001\u001a\u00020\u001b2\u0007\u0010\u008d\u0001\u001a\u00020*2\u0006\u00105\u001a\u00020&2\u0007\u0010\u008e\u0001\u001a\u000200H\u0096@\u00a2\u0006\u0006\u0008\u008f\u0001\u0010\u0090\u0001JJ\u0010\u008f\u0001\u001a\u00020\u001b2\u0007\u0010\u008e\u0001\u001a\u0002002\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010f2\u0008\u00107\u001a\u0004\u0018\u00010&2\u000f\u0010\u0092\u0001\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010z2\u0006\u0010_\u001a\u00020&H\u0096@\u00a2\u0006\u0006\u0008\u008f\u0001\u0010\u0093\u0001J\u001d\u0010\u0096\u0001\u001a\u00020\u001b2\u0008\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0096@\u00a2\u0006\u0006\u0008\u0096\u0001\u0010\u0097\u0001J\u001f\u0010\u0099\u0001\u001a\u00020\u001b2\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0098\u0001H\u0096@\u00a2\u0006\u0006\u0008\u0099\u0001\u0010\u009a\u0001J\u001f\u0010\u009b\u0001\u001a\u00020\u001b2\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0098\u0001H\u0096@\u00a2\u0006\u0006\u0008\u009b\u0001\u0010\u009a\u0001J\u0012\u0010\u009c\u0001\u001a\u00020\u001bH\u0096@\u00a2\u0006\u0005\u0008\u009c\u0001\u0010\u001dJ\u001c\u0010\u009e\u0001\u001a\u00020\u001b2\u0007\u0010\u009d\u0001\u001a\u00020&H\u0096@\u00a2\u0006\u0006\u0008\u009e\u0001\u0010\u009f\u0001J\u001c\u0010\u00a1\u0001\u001a\u00020\u001b2\u0007\u0010\u00a0\u0001\u001a\u00020&H\u0096@\u00a2\u0006\u0006\u0008\u00a1\u0001\u0010\u009f\u0001J\u001f\u0010\u00a4\u0001\u001a\u00030\u00a3\u00012\t\u0010\u00a2\u0001\u001a\u0004\u0018\u00010&H\u0096@\u00a2\u0006\u0006\u0008\u00a4\u0001\u0010\u009f\u0001J)\u0010\u00a7\u0001\u001a\u00030\u00a6\u00012\u0007\u0010\u00a2\u0001\u001a\u00020&2\n\u0010\u00a0\u0001\u001a\u0005\u0018\u00010\u00a5\u0001H\u0096@\u00a2\u0006\u0006\u0008\u00a7\u0001\u0010\u00a8\u0001J=\u0010\u00ac\u0001\u001a\u00020\u001b2\u000e\u0010\u00aa\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a9\u00010z2\u0008\u0010\u00ab\u0001\u001a\u00030\u00a9\u00012\u0006\u0010\\\u001a\u0002002\u0006\u0010!\u001a\u00020 H\u0096@\u00a2\u0006\u0006\u0008\u00ac\u0001\u0010\u00ad\u0001J2\u0010\u00b4\u0001\u001a\u00020\u001b2\u0008\u0010\u00af\u0001\u001a\u00030\u00ae\u00012\n\u0010\u00b1\u0001\u001a\u0005\u0018\u00010\u00b0\u00012\u0008\u0010\u00b3\u0001\u001a\u00030\u00b2\u0001H\u0016\u00a2\u0006\u0006\u0008\u00b4\u0001\u0010\u00b5\u0001J0\u0010\u00ba\u0001\u001a\u00020\u001b2\u0006\u00103\u001a\u00020&2\n\u0010\u00b7\u0001\u001a\u0005\u0018\u00010\u00b6\u00012\u0008\u0010\u00b9\u0001\u001a\u00030\u00b8\u0001H\u0016\u00a2\u0006\u0006\u0008\u00ba\u0001\u0010\u00bb\u0001J#\u0010\u00be\u0001\u001a\u00020\u001b2\u000e\u0010\u00bd\u0001\u001a\t\u0012\u0005\u0012\u00030\u00bc\u00010zH\u0096@\u00a2\u0006\u0006\u0008\u00be\u0001\u0010\u00bf\u0001J#\u0010\u00c2\u0001\u001a\u00030\u00c1\u00012\r\u0010\u00c0\u0001\u001a\u0008\u0012\u0004\u0012\u00020&0zH\u0096@\u00a2\u0006\u0006\u0008\u00c2\u0001\u0010\u00bf\u0001J\u001e\u0010\u00c5\u0001\u001a\u00030\u00c4\u00012\u0008\u0010\u0080\u0001\u001a\u00030\u00c3\u0001H\u0096@\u00a2\u0006\u0006\u0008\u00c5\u0001\u0010\u00c6\u0001J\u001e\u0010\u00c9\u0001\u001a\u00030\u00c8\u00012\u0008\u0010\u0080\u0001\u001a\u00030\u00c7\u0001H\u0096@\u00a2\u0006\u0006\u0008\u00c9\u0001\u0010\u00ca\u0001J\u001c\u0010\u00cc\u0001\u001a\u00020\u001b2\u0007\u0010\u00cb\u0001\u001a\u00020&H\u0096@\u00a2\u0006\u0006\u0008\u00cc\u0001\u0010\u009f\u0001J\u001c\u0010\u00cd\u0001\u001a\u00020\u001b2\u0007\u0010\u00cb\u0001\u001a\u00020&H\u0096@\u00a2\u0006\u0006\u0008\u00cd\u0001\u0010\u009f\u0001J\u001e\u0010\u00cf\u0001\u001a\u00030\u00d0\u00012\u0008\u0010\u00cf\u0001\u001a\u00030\u00ce\u0001H\u0096@\u00a2\u0006\u0006\u0008\u00cf\u0001\u0010\u00d1\u0001J\u001e\u0010\u00d5\u0001\u001a\u00030\u00d4\u00012\u0008\u0010\u00d3\u0001\u001a\u00030\u00d2\u0001H\u0096@\u00a2\u0006\u0006\u0008\u00d5\u0001\u0010\u00d6\u0001J\u001e\u0010\u00da\u0001\u001a\u00030\u00d9\u00012\u0008\u0010\u00d8\u0001\u001a\u00030\u00d7\u0001H\u0096@\u00a2\u0006\u0006\u0008\u00da\u0001\u0010\u00db\u0001J\u001d\u0010\u00dd\u0001\u001a\u00030\u00dc\u00012\u0007\u0010\u00cb\u0001\u001a\u00020&H\u0096@\u00a2\u0006\u0006\u0008\u00dd\u0001\u0010\u009f\u0001J\u001e\u0010\u00e0\u0001\u001a\u00030\u00df\u00012\u0008\u0010\u00d8\u0001\u001a\u00030\u00de\u0001H\u0096@\u00a2\u0006\u0006\u0008\u00e0\u0001\u0010\u00e1\u0001J2\u0010\u00e7\u0001\u001a\u00030\u00e6\u00012\u0008\u0010\u00e3\u0001\u001a\u00030\u00e2\u00012\u0007\u0010\u00e4\u0001\u001a\u00020\u001e2\t\u0010\u00e5\u0001\u001a\u0004\u0018\u00010&H\u0096@\u00a2\u0006\u0006\u0008\u00e7\u0001\u0010\u00e8\u0001J\u001e\u0010\u00ec\u0001\u001a\u00030\u00eb\u00012\u0008\u0010\u00ea\u0001\u001a\u00030\u00e9\u0001H\u0096@\u00a2\u0006\u0006\u0008\u00ec\u0001\u0010\u00ed\u0001J\u001d\u0010\u00f0\u0001\u001a\u00030\u00ef\u00012\u0007\u0010\u00ee\u0001\u001a\u00020&H\u0096@\u00a2\u0006\u0006\u0008\u00f0\u0001\u0010\u009f\u0001J\u001d\u0010\u00f3\u0001\u001a\u00030\u00f2\u00012\u0007\u0010\u00f1\u0001\u001a\u00020&H\u0096@\u00a2\u0006\u0006\u0008\u00f3\u0001\u0010\u009f\u0001J\u001d\u0010\u00f4\u0001\u001a\u00030\u00f2\u00012\u0007\u0010\u00f1\u0001\u001a\u00020&H\u0096@\u00a2\u0006\u0006\u0008\u00f4\u0001\u0010\u009f\u0001J$\u0010\u00f5\u0001\u001a\u00020\u001b2\u0006\u00105\u001a\u00020&2\u0007\u0010\u00f1\u0001\u001a\u00020&H\u0096@\u00a2\u0006\u0006\u0008\u00f5\u0001\u0010\u0089\u0001J$\u0010\u00f6\u0001\u001a\u00020\u001b2\u0006\u00105\u001a\u00020&2\u0007\u0010\u00f1\u0001\u001a\u00020&H\u0096@\u00a2\u0006\u0006\u0008\u00f6\u0001\u0010\u0089\u0001JE\u0010\u00fc\u0001\u001a\u00030\u00fb\u00012\t\u0010\u00f1\u0001\u001a\u0004\u0018\u00010&2\t\u0010\u00f7\u0001\u001a\u0004\u0018\u00010&2\u0010\u0010\u00f9\u0001\u001a\u000b\u0012\u0004\u0012\u00020&\u0018\u00010\u00f8\u00012\u0007\u0010\u00fa\u0001\u001a\u00020\u001eH\u0096@\u00a2\u0006\u0006\u0008\u00fc\u0001\u0010\u00fd\u0001J&\u0010\u00ff\u0001\u001a\u00030\u00fb\u00012\u0007\u0010\u00fe\u0001\u001a\u00020&2\u0007\u0010\u00fa\u0001\u001a\u00020\u001eH\u0096@\u00a2\u0006\u0006\u0008\u00ff\u0001\u0010\u0080\u0002J\u001d\u0010\u0083\u0002\u001a\u00020\u001b2\u0008\u0010\u0082\u0002\u001a\u00030\u0081\u0002H\u0096@\u00a2\u0006\u0006\u0008\u0083\u0002\u0010\u0084\u0002J\u001d\u0010\u0085\u0002\u001a\u00020\u001b2\u0008\u0010\u0082\u0002\u001a\u00030\u0081\u0002H\u0096@\u00a2\u0006\u0006\u0008\u0085\u0002\u0010\u0084\u0002J0\u0010\u008a\u0002\u001a\u00030\u0089\u00022\u0007\u0010\u0086\u0002\u001a\u00020&2\u0007\u0010\u00fa\u0001\u001a\u00020\u001e2\u0008\u0010\u0088\u0002\u001a\u00030\u0087\u0002H\u0096@\u00a2\u0006\u0006\u0008\u008a\u0002\u0010\u008b\u0002J\u001e\u0010\u008e\u0002\u001a\u0002002\n\u0010\u008d\u0002\u001a\u0005\u0018\u00010\u008c\u0002H\u0002\u00a2\u0006\u0006\u0008\u008e\u0002\u0010\u008f\u0002J\u001d\u0010\u0092\u0002\u001a\u00020\u001b2\u0008\u0010\u0091\u0002\u001a\u00030\u0090\u0002H\u0082@\u00a2\u0006\u0006\u0008\u0092\u0002\u0010\u0093\u0002J<\u0010\u0094\u0002\u001a\u00020\u001b2\u0007\u0010\u009d\u0001\u001a\u00020&2\u0006\u0010Q\u001a\u00020&2\u0006\u0010R\u001a\u0002002\u0006\u0010S\u001a\u0002002\u0006\u0010T\u001a\u000200H\u0082@\u00a2\u0006\u0006\u0008\u0094\u0002\u0010\u0095\u0002JA\u0010\u0098\u0002\u001a\u00030\u0096\u00022\u0007\u0010\u009d\u0001\u001a\u00020&2\u0006\u0010Q\u001a\u00020&2\u0006\u0010R\u001a\u0002002\n\u0010\u0097\u0002\u001a\u0005\u0018\u00010\u0096\u00022\u0006\u0010T\u001a\u000200H\u0082@\u00a2\u0006\u0006\u0008\u0098\u0002\u0010\u0099\u0002J\"\u0010{\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*2\u0007\u0010\u009a\u0002\u001a\u000200H\u0082@\u00a2\u0006\u0005\u0008{\u0010\u009b\u0002J\u0018\u0010}\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*H\u0082@\u00a2\u0006\u0004\u0008}\u0010-J\u001d\u0010\u009e\u0002\u001a\u00020\u001b2\u0008\u0010\u009d\u0002\u001a\u00030\u009c\u0002H\u0082@\u00a2\u0006\u0006\u0008\u009e\u0002\u0010\u009f\u0002JC\u0010\u00a0\u0002\u001a\u00020;2\u0006\u00103\u001a\u00020&2\u0006\u00104\u001a\u00020&2\u0006\u00105\u001a\u00020&2\u0016\u0008\u0002\u0010<\u001a\u0010\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u001b\u0018\u00010:H\u0082@\u00a2\u0006\u0006\u0008\u00a0\u0002\u0010\u00a1\u0002J3\u0010\u00a3\u0002\u001a\u00020&2\u0006\u00104\u001a\u00020&2\u0006\u00105\u001a\u00020&2\u0006\u00103\u001a\u00020&2\u0007\u0010\u00a2\u0002\u001a\u00020&H\u0002\u00a2\u0006\u0006\u0008\u00a3\u0002\u0010\u00a4\u0002J\u001c\u0010\u00a7\u0002\u001a\u0002002\u0008\u0010\u00a6\u0002\u001a\u00030\u00a5\u0002H\u0002\u00a2\u0006\u0006\u0008\u00a7\u0002\u0010\u00a8\u0002Jd\u0010\u00ae\u0002\u001a\u00020\u001e2\u0008\u0010\u00a6\u0002\u001a\u00030\u00a5\u00022\u0008\u0010\u00aa\u0002\u001a\u00030\u00a9\u00022;\u0010\u00ad\u0002\u001a6\u0008\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002000\u00ab\u0002\u0012\u0007\u0012\u0005\u0018\u00010\u00ac\u00020:j\u001a\u0008\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002000\u00ab\u0002\u0012\u0007\u0012\u0005\u0018\u00010\u00ac\u00020:H\u0082@\u00a2\u0006\u0006\u0008\u00ae\u0002\u0010\u00af\u0002J\u0012\u0010\u00b0\u0002\u001a\u00020\u001bH\u0082@\u00a2\u0006\u0005\u0008\u00b0\u0002\u0010\u001dR\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0005\u0010\u00b1\u0002R\u0015\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\t\u0010\u00b2\u0002R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u000b\u0010\u00b3\u0002R\u0015\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\r\u0010\u00b4\u0002R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u000f\u0010\u00b5\u0002R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0011\u0010\u00b6\u0002R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0013\u0010\u00b7\u0002R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0015\u0010\u00b8\u0002R\u001c\u0010\u00ba\u0002\u001a\u0005\u0018\u00010\u00b9\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ba\u0002\u0010\u00bb\u0002R\u001c\u0010\u00bd\u0002\u001a\u0005\u0018\u00010\u00bc\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00bd\u0002\u0010\u00be\u0002R\u0019\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u00089\u0010\u00bf\u0002R\u0019\u0010\u00c0\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00c0\u0002\u0010\u00c1\u0002R\u0019\u0010\u00c2\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00c2\u0002\u0010\u00c1\u0002R\u0019\u0010\u00c3\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00c3\u0002\u0010\u00c1\u0002R\u0019\u0010\u00c4\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00c4\u0002\u0010\u00c1\u0002R%\u0010?\u001a\u0002008\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0015\n\u0005\u0008?\u0010\u00c1\u0002\u001a\u0004\u0008?\u00102\"\u0006\u0008\u00c5\u0002\u0010\u00c6\u0002R&\u0010@\u001a\u0002008\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0016\n\u0005\u0008@\u0010\u00c1\u0002\u001a\u0005\u0008\u00c7\u0002\u00102\"\u0006\u0008\u00c8\u0002\u0010\u00c6\u0002R\u001a\u0010\u00ca\u0002\u001a\u00030\u00c9\u00028\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u00ca\u0002\u0010\u00cb\u0002R\u001a\u0010\u00cd\u0002\u001a\u00030\u00cc\u00028\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u00cd\u0002\u0010\u00ce\u0002R\u001b\u0010\u00cf\u0002\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00cf\u0002\u0010\u00d0\u0002R4\u0010\u00e3\u0001\u001a\u00030\u00d1\u00022\u0008\u0010\u00d2\u0002\u001a\u00030\u00d1\u00028\u0016@RX\u0096\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00e3\u0001\u0010\u00d3\u0002\u001a\u0006\u0008\u00d4\u0002\u0010\u00d5\u0002\"\u0006\u0008\u00d6\u0002\u0010\u00d7\u0002R \u0010\u00d9\u0002\u001a\u00030\u00d8\u00028\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00d9\u0002\u0010\u00da\u0002\u001a\u0006\u0008\u00db\u0002\u0010\u00dc\u0002R \u0010\u00dd\u0002\u001a\t\u0012\u0004\u0012\u00020*0\u00f8\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00dd\u0002\u0010\u00de\u0002R\u001b\u0010\u00df\u0002\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00df\u0002\u0010\u00e0\u0002R\u0019\u0010\u00e1\u0002\u001a\u00020;8\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u00e1\u0002\u0010\u00e2\u0002R\u001c\u0010\u00e4\u0002\u001a\u0005\u0018\u00010\u00e3\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00e4\u0002\u0010\u00e5\u0002R\u001c\u0010\u00e7\u0002\u001a\u0005\u0018\u00010\u00e6\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00e7\u0002\u0010\u00e8\u0002R!\u0010\u00ee\u0002\u001a\u00030\u00e9\u00028BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u00ea\u0002\u0010\u00eb\u0002\u001a\u0006\u0008\u00ec\u0002\u0010\u00ed\u0002R\u0019\u0010\u00ef\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ef\u0002\u0010\u00c1\u0002R,\u0010\u00f1\u0002\u001a\u0005\u0018\u00010\u00f0\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00f1\u0002\u0010\u00f2\u0002\u001a\u0006\u0008\u00f3\u0002\u0010\u00f4\u0002\"\u0006\u0008\u00f5\u0002\u0010\u00f6\u0002R%\u0010\u00f8\u0002\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030\u008c\u00020\u00f7\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00f8\u0002\u0010\u00f9\u0002R\u0018\u0010\u00fb\u0002\u001a\u00030\u00fa\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00fb\u0002\u0010\u00fc\u0002RK\u0010\u00fd\u0002\u001a6\u0008\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002000\u00ab\u0002\u0012\u0007\u0012\u0005\u0018\u00010\u00ac\u00020:j\u001a\u0008\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002000\u00ab\u0002\u0012\u0007\u0012\u0005\u0018\u00010\u00ac\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00fd\u0002\u0010\u00fe\u0002RK\u0010\u00ff\u0002\u001a6\u0008\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002000\u00ab\u0002\u0012\u0007\u0012\u0005\u0018\u00010\u00ac\u00020:j\u001a\u0008\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002000\u00ab\u0002\u0012\u0007\u0012\u0005\u0018\u00010\u00ac\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ff\u0002\u0010\u00fe\u0002R*\u0010\u0080\u0003\u001a\u00030\u0087\u00028\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0080\u0003\u0010\u0081\u0003\u001a\u0006\u0008\u0082\u0003\u0010\u0083\u0003\"\u0006\u0008\u0084\u0003\u0010\u0085\u0003R*\u0010\u0086\u0003\u001a\u00030\u0087\u00028\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0086\u0003\u0010\u0081\u0003\u001a\u0006\u0008\u0087\u0003\u0010\u0083\u0003\"\u0006\u0008\u0088\u0003\u0010\u0085\u0003RK\u0010\u0089\u0003\u001a6\u0008\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002000\u00ab\u0002\u0012\u0007\u0012\u0005\u0018\u00010\u00ac\u00020:j\u001a\u0008\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002000\u00ab\u0002\u0012\u0007\u0012\u0005\u0018\u00010\u00ac\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0089\u0003\u0010\u00fe\u0002R\u0018\u0010\u008b\u0003\u001a\u00030\u008a\u00038\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008b\u0003\u0010\u008c\u0003R\u0018\u0010\u008e\u0003\u001a\u00030\u008d\u00038\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008e\u0003\u0010\u008f\u0003R\u0018\u0010\u0091\u0003\u001a\u00030\u0090\u00038\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0091\u0003\u0010\u0092\u0003R\u0018\u0010\u0094\u0003\u001a\u00030\u0093\u00038\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0094\u0003\u0010\u0095\u0003R(\u0010\u0096\u0003\u001a\u00020&8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0006\u0008\u0096\u0003\u0010\u00d0\u0002\u001a\u0006\u0008\u0097\u0003\u0010\u0098\u0003\"\u0005\u0008\u0099\u0003\u0010)R\u0018\u0010\u009b\u0003\u001a\u00030\u009a\u00038\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u009b\u0003\u0010\u009c\u0003R\u0018\u0010\u009e\u0003\u001a\u00030\u009d\u00038\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u009e\u0003\u0010\u009f\u0003R,\u0010\u00a1\u0003\u001a\u0005\u0018\u00010\u00a0\u00038\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00a1\u0003\u0010\u00a2\u0003\u001a\u0006\u0008\u00a3\u0003\u0010\u00a4\u0003\"\u0006\u0008\u00a5\u0003\u0010\u00a6\u0003R,\u0010\u00a8\u0003\u001a\u0005\u0018\u00010\u00a7\u00038\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00a8\u0003\u0010\u00a9\u0003\u001a\u0006\u0008\u00aa\u0003\u0010\u00ab\u0003\"\u0006\u0008\u00ac\u0003\u0010\u00ad\u0003R,\u0010\u00af\u0003\u001a\u0005\u0018\u00010\u00ae\u00038\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00af\u0003\u0010\u00b0\u0003\u001a\u0006\u0008\u00b1\u0003\u0010\u00b2\u0003\"\u0006\u0008\u00b3\u0003\u0010\u00b4\u0003R,\u0010\u00b6\u0003\u001a\u0005\u0018\u00010\u00b5\u00038\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00b6\u0003\u0010\u00b7\u0003\u001a\u0006\u0008\u00b8\u0003\u0010\u00b9\u0003\"\u0006\u0008\u00ba\u0003\u0010\u00bb\u0003\u00a8\u0006\u00bd\u0003"
    }
    d2 = {
        "Llive/hms/video/transport/HMSTransport;",
        "Llive/hms/video/transport/ITransport;",
        "Landroid/content/Context;",
        "context",
        "Llive/hms/video/transport/ITransportObserver;",
        "observer",
        "Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;",
        "analyticsEventLevel",
        "Llive/hms/video/media/settings/HMSTrackSettings;",
        "hmsTrackSettings",
        "Llive/hms/video/connection/subscribe/RemoteTrackFactory;",
        "trackFactory",
        "Llive/hms/video/utils/HMSAgentOs;",
        "agentOs",
        "Llive/hms/video/transport/IsQaLink;",
        "isQaLink",
        "Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;",
        "offlineAnalyticsPeerInfo",
        "Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;",
        "noiseCancellationStatusChecker",
        "Llive/hms/video/network/HMSNetworkManager;",
        "hmsNetworkManager",
        "<init>",
        "(Landroid/content/Context;Llive/hms/video/transport/ITransportObserver;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;Llive/hms/video/media/settings/HMSTrackSettings;Llive/hms/video/connection/subscribe/RemoteTrackFactory;Llive/hms/video/utils/HMSAgentOs;Llive/hms/video/transport/IsQaLink;Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;Llive/hms/video/network/HMSNetworkManager;)V",
        "Llive/hms/video/factories/noisecancellation/NoiseCancellation;",
        "noiseCancellation",
        "()Llive/hms/video/factories/noisecancellation/NoiseCancellation;",
        "Ll83/a0;",
        "initPeerConnections",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "audioResourceId",
        "Llive/hms/video/sdk/HMSActionResultListener;",
        "hmsActionResultListener",
        "streamAndPlayAudioFromRawFile",
        "(ILlive/hms/video/sdk/HMSActionResultListener;)V",
        "stopAudioFromRawFile",
        "(Llive/hms/video/sdk/HMSActionResultListener;)V",
        "",
        "nodeId",
        "setNodeInfo",
        "(Ljava/lang/String;)V",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "track",
        "publishScreenshare",
        "(Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;",
        "deInitLocalStreams",
        "()V",
        "",
        "isSocketConnectionOpen",
        "()Z",
        "token",
        "endpoint",
        "peerId",
        "Llive/hms/video/sdk/models/enums/RetrySchedulerState;",
        "source",
        "Llive/hms/video/sdk/models/PerformanceMeasurement;",
        "performanceMeasurement",
        "Lkotlin/Function1;",
        "Llive/hms/video/signal/init/InitConfig;",
        "initSdkStoreFlags",
        "connect",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/enums/RetrySchedulerState;Llive/hms/video/sdk/models/PerformanceMeasurement;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;",
        "isSimulcastEnabled",
        "serverSoftwareEchoCancellationEnabled",
        "initHmsPeerConnectionFactory",
        "(ZZ)V",
        "isBackground",
        "reInitPeerConnectionFactory",
        "(ZLq83/d;)Ljava/lang/Object;",
        "disposePeerConnectionFactory",
        "sessionId",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "hmsPeer",
        "Llive/hms/video/sdk/models/HMSRoom;",
        "hmsRoom",
        "websocketUrl",
        "updateAnalyticsParams",
        "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/HMSRoom;Ljava/lang/String;)V",
        "authToken",
        "peerName",
        "data",
        "serverSideSubscribeDegradation",
        "shouldSendOffer",
        "simulcastEnabled",
        "iceGatheringOnAnyAddressPorts",
        "join",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLq83/d;)Ljava/lang/Object;",
        "notifyServer",
        "leave",
        "forPeerId",
        "toRoleName",
        "force",
        "roleChangeRequest",
        "(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "requestedBy",
        "roleChangeAccept",
        "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Lq83/d;)Ljava/lang/Object;",
        "isSoftwareEchoCancellationEnabled",
        "initializePeerConnectionFactoryIfNeeded",
        "(Llive/hms/video/media/settings/HMSTrackSettings;ZZ)V",
        "renegotiationICE",
        "Llive/hms/video/media/tracks/HMSTrackType;",
        "hmsTrackType",
        "getLocalTrackByType",
        "(Landroid/content/Context;Llive/hms/video/media/settings/HMSTrackSettings;Llive/hms/video/media/tracks/HMSTrackType;Lq83/d;)Ljava/lang/Object;",
        "removeTrackFromStream",
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
        "",
        "tracks",
        "",
        "publish",
        "([Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;",
        "unpublish",
        "unpublishScreenshare",
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
        "Llive/hms/video/sdk/models/role/HMSRole;",
        "ofRoles",
        "toRole",
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
        "Llive/hms/video/signal/init/LayoutRequestOptions;",
        "layoutRequestOptions",
        "Llive/hms/video/signal/init/HMSLayoutListener;",
        "hmsLayoutConfigListener",
        "getLayoutConfigByToken",
        "(Ljava/lang/String;Llive/hms/video/signal/init/LayoutRequestOptions;Llive/hms/video/signal/init/HMSLayoutListener;)V",
        "Llive/hms/video/sdk/models/HMSHLSTimedMetadata;",
        "metadataModelList",
        "setHlsSessionMetadata",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "tags",
        "Llive/hms/video/sessionstore/SetMetadataListenerResult;",
        "setMetadataListener",
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
        "groupName",
        "Llive/hms/video/groups/GroupJoinLeaveResponse;",
        "groupJoin",
        "groupLeave",
        "groupAdd",
        "groupRemove",
        "roleName",
        "Ljava/util/ArrayList;",
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
        "query",
        "",
        "offset",
        "Llive/hms/video/sdk/models/PeerNameSearchResponse;",
        "peerNameSearch",
        "(Ljava/lang/String;IJLq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/transport/models/TransportCallbackTriple;",
        "callback",
        "isPeerConnectionDisposed",
        "(Llive/hms/video/transport/models/TransportCallbackTriple;)Z",
        "Lhms/webrtc/MediaConstraints;",
        "constraints",
        "performPublishRenegotiation",
        "(Lhms/webrtc/MediaConstraints;Lq83/d;)Ljava/lang/Object;",
        "internalJoin",
        "(Ljava/lang/String;Ljava/lang/String;ZZZLq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/connection/models/HMSSessionDescription;",
        "offer",
        "measuredJoin",
        "(Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/connection/models/HMSSessionDescription;ZLq83/d;)Ljava/lang/Object;",
        "isScreenShare",
        "(Llive/hms/video/media/tracks/HMSTrack;ZLq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/connection/models/HMSConnectionRole;",
        "role",
        "handleIceConnectionFailed",
        "(Llive/hms/video/connection/models/HMSConnectionRole;Lq83/d;)Ljava/lang/Object;",
        "internalConnect",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;",
        "userAgent",
        "makeWebsocketURL",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;",
        "Llive/hms/video/error/HMSException;",
        "ex",
        "shouldRetry",
        "(Llive/hms/video/error/HMSException;)Z",
        "Llive/hms/video/transport/models/TransportFailureCategory;",
        "category",
        "Lq83/d;",
        "",
        "task",
        "scheduleRetry",
        "(Llive/hms/video/error/HMSException;Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;",
        "tearDownTransport",
        "Llive/hms/video/transport/ITransportObserver;",
        "Llive/hms/video/media/settings/HMSTrackSettings;",
        "Llive/hms/video/connection/subscribe/RemoteTrackFactory;",
        "Llive/hms/video/utils/HMSAgentOs;",
        "Llive/hms/video/transport/IsQaLink;",
        "Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;",
        "Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;",
        "Llive/hms/video/network/HMSNetworkManager;",
        "Llive/hms/video/transport/models/JoinParameters;",
        "joinParameters",
        "Llive/hms/video/transport/models/JoinParameters;",
        "Llive/hms/video/transport/models/ConnectParameters;",
        "connectParameters",
        "Llive/hms/video/transport/models/ConnectParameters;",
        "Llive/hms/video/sdk/models/PerformanceMeasurement;",
        "isTearDownInProgress",
        "Z",
        "hasJoined",
        "isRenegotiationDone",
        "isPeerConnectionReady",
        "setSimulcastEnabled",
        "(Z)V",
        "getServerSoftwareEchoCancellationEnabled",
        "setServerSoftwareEchoCancellationEnabled",
        "Llive/hms/video/connection/publish/HMSPublishConnection;",
        "publishConnection",
        "Llive/hms/video/connection/publish/HMSPublishConnection;",
        "Llive/hms/video/connection/subscribe/HMSSubscribeConnection;",
        "subscribeConnection",
        "Llive/hms/video/connection/subscribe/HMSSubscribeConnection;",
        "lastKnownNetworkType",
        "Ljava/lang/String;",
        "Llive/hms/video/transport/models/TransportState;",
        "value",
        "Llive/hms/video/transport/models/TransportState;",
        "getState",
        "()Llive/hms/video/transport/models/TransportState;",
        "setState",
        "(Llive/hms/video/transport/models/TransportState;)V",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "analyticsEventsService",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "getAnalyticsEventsService",
        "()Llive/hms/video/events/AnalyticsEventsService;",
        "tracksToPublish",
        "Ljava/util/ArrayList;",
        "screenShareTrack",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "initConfig",
        "Llive/hms/video/signal/init/InitConfig;",
        "Lhms/webrtc/MediaStream;",
        "nativeStream",
        "Lhms/webrtc/MediaStream;",
        "Llive/hms/video/media/streams/HMSLocalStream;",
        "stream",
        "Llive/hms/video/media/streams/HMSLocalStream;",
        "Llive/hms/video/factories/HMSPeerConnectionFactory;",
        "hmsPeerConnectionFactory$delegate",
        "Ll83/h;",
        "getHmsPeerConnectionFactory",
        "()Llive/hms/video/factories/HMSPeerConnectionFactory;",
        "hmsPeerConnectionFactory",
        "isHmsPeerConnectionFactoryInitialized",
        "Llive/hms/video/transport/ITransportListener;",
        "connectivityListener",
        "Llive/hms/video/transport/ITransportListener;",
        "getConnectivityListener",
        "()Llive/hms/video/transport/ITransportListener;",
        "setConnectivityListener",
        "(Llive/hms/video/transport/ITransportListener;)V",
        "Ljava/util/HashMap;",
        "callbacks",
        "Ljava/util/HashMap;",
        "Llive/hms/video/transport/RetryScheduler;",
        "retryScheduler",
        "Llive/hms/video/transport/RetryScheduler;",
        "retryPublishIceFailedTask",
        "Lkotlin/jvm/functions/Function1;",
        "retrySignalDisconnectTask",
        "timeAfterJoinResponse",
        "J",
        "getTimeAfterJoinResponse",
        "()J",
        "setTimeAfterJoinResponse",
        "(J)V",
        "timeAfterWSOpen",
        "getTimeAfterWSOpen",
        "setTimeAfterWSOpen",
        "retrySubscribeIceFailedTask",
        "live/hms/video/transport/HMSTransport$signalObserver$1",
        "signalObserver",
        "Llive/hms/video/transport/HMSTransport$signalObserver$1;",
        "Llive/hms/video/signal/ISignal;",
        "signal",
        "Llive/hms/video/signal/ISignal;",
        "live/hms/video/transport/HMSTransport$publishConnectionObserver$1",
        "publishConnectionObserver",
        "Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1;",
        "live/hms/video/transport/HMSTransport$subscribeConnectionObserver$1",
        "subscribeConnectionObserver",
        "Llive/hms/video/transport/HMSTransport$subscribeConnectionObserver$1;",
        "nodeID",
        "getNodeID",
        "()Ljava/lang/String;",
        "setNodeID",
        "Landroid/os/HandlerThread;",
        "rtcConfigurationThread",
        "Landroid/os/HandlerThread;",
        "Landroid/os/Handler;",
        "rtcConfigurationHandler",
        "Landroid/os/Handler;",
        "Lhms/webrtc/AudioTrack;",
        "nativeAudioTrack",
        "Lhms/webrtc/AudioTrack;",
        "getNativeAudioTrack",
        "()Lhms/webrtc/AudioTrack;",
        "setNativeAudioTrack",
        "(Lhms/webrtc/AudioTrack;)V",
        "Lhms/webrtc/VideoTrack;",
        "nativeVideoTrack",
        "Lhms/webrtc/VideoTrack;",
        "getNativeVideoTrack",
        "()Lhms/webrtc/VideoTrack;",
        "setNativeVideoTrack",
        "(Lhms/webrtc/VideoTrack;)V",
        "Llive/hms/video/media/tracks/HMSLocalVideoTrack;",
        "localVideoTrack",
        "Llive/hms/video/media/tracks/HMSLocalVideoTrack;",
        "getLocalVideoTrack",
        "()Llive/hms/video/media/tracks/HMSLocalVideoTrack;",
        "setLocalVideoTrack",
        "(Llive/hms/video/media/tracks/HMSLocalVideoTrack;)V",
        "Llive/hms/video/media/tracks/HMSLocalAudioTrack;",
        "localAudioTrack",
        "Llive/hms/video/media/tracks/HMSLocalAudioTrack;",
        "getLocalAudioTrack",
        "()Llive/hms/video/media/tracks/HMSLocalAudioTrack;",
        "setLocalAudioTrack",
        "(Llive/hms/video/media/tracks/HMSLocalAudioTrack;)V",
        "Companion",
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
.field public static final Companion:Llive/hms/video/transport/HMSTransport$Companion;

.field private static final PROTOCOL_SPEC:Ljava/lang/String; = "20240720"

.field private static final PROTOCOL_VERSION:Ljava/lang/String; = "2.5"

.field private static final TAG:Ljava/lang/String; = "HMSTransport"


# instance fields
.field private final agentOs:Llive/hms/video/utils/HMSAgentOs;

.field private final analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

.field private final callbacks:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Llive/hms/video/transport/models/TransportCallbackTriple;",
            ">;"
        }
    .end annotation
.end field

.field private connectParameters:Llive/hms/video/transport/models/ConnectParameters;

.field private connectivityListener:Llive/hms/video/transport/ITransportListener;

.field private hasJoined:Z

.field private final hmsNetworkManager:Llive/hms/video/network/HMSNetworkManager;

.field private final hmsPeerConnectionFactory$delegate:Ll83/h;

.field private final hmsTrackSettings:Llive/hms/video/media/settings/HMSTrackSettings;

.field private initConfig:Llive/hms/video/signal/init/InitConfig;

.field private isHmsPeerConnectionFactoryInitialized:Z

.field private isPeerConnectionReady:Z

.field private final isQaLink:Llive/hms/video/transport/IsQaLink;

.field private isRenegotiationDone:Z

.field private isSimulcastEnabled:Z

.field private volatile isTearDownInProgress:Z

.field private joinParameters:Llive/hms/video/transport/models/JoinParameters;

.field private lastKnownNetworkType:Ljava/lang/String;

.field private localAudioTrack:Llive/hms/video/media/tracks/HMSLocalAudioTrack;

.field private localVideoTrack:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

.field private nativeAudioTrack:Lhms/webrtc/AudioTrack;

.field private nativeStream:Lhms/webrtc/MediaStream;

.field private nativeVideoTrack:Lhms/webrtc/VideoTrack;

.field private nodeID:Ljava/lang/String;

.field private final noiseCancellationStatusChecker:Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;

.field private final observer:Llive/hms/video/transport/ITransportObserver;

.field private final offlineAnalyticsPeerInfo:Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;

.field private performanceMeasurement:Llive/hms/video/sdk/models/PerformanceMeasurement;

.field private publishConnection:Llive/hms/video/connection/publish/HMSPublishConnection;

.field private final publishConnectionObserver:Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1;

.field private final retryPublishIceFailedTask:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final retryScheduler:Llive/hms/video/transport/RetryScheduler;

.field private final retrySignalDisconnectTask:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final retrySubscribeIceFailedTask:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final rtcConfigurationHandler:Landroid/os/Handler;

.field private final rtcConfigurationThread:Landroid/os/HandlerThread;

.field private screenShareTrack:Llive/hms/video/media/tracks/HMSTrack;

.field private serverSoftwareEchoCancellationEnabled:Z

.field private final signal:Llive/hms/video/signal/ISignal;

.field private final signalObserver:Llive/hms/video/transport/HMSTransport$signalObserver$1;

.field private state:Llive/hms/video/transport/models/TransportState;

.field private stream:Llive/hms/video/media/streams/HMSLocalStream;

.field private subscribeConnection:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

.field private final subscribeConnectionObserver:Llive/hms/video/transport/HMSTransport$subscribeConnectionObserver$1;

.field private timeAfterJoinResponse:J

.field private timeAfterWSOpen:J

.field private final trackFactory:Llive/hms/video/connection/subscribe/RemoteTrackFactory;

.field private tracksToPublish:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Llive/hms/video/media/tracks/HMSTrack;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/transport/HMSTransport$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/transport/HMSTransport$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/transport/HMSTransport;->Companion:Llive/hms/video/transport/HMSTransport$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Llive/hms/video/transport/ITransportObserver;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;Llive/hms/video/media/settings/HMSTrackSettings;Llive/hms/video/connection/subscribe/RemoteTrackFactory;Llive/hms/video/utils/HMSAgentOs;Llive/hms/video/transport/IsQaLink;Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;Llive/hms/video/network/HMSNetworkManager;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "observer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsEventLevel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsTrackSettings"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "agentOs"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isQaLink"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offlineAnalyticsPeerInfo"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "noiseCancellationStatusChecker"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsNetworkManager"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Llive/hms/video/transport/HMSTransport;->observer:Llive/hms/video/transport/ITransportObserver;

    iput-object p4, p0, Llive/hms/video/transport/HMSTransport;->hmsTrackSettings:Llive/hms/video/media/settings/HMSTrackSettings;

    iput-object p5, p0, Llive/hms/video/transport/HMSTransport;->trackFactory:Llive/hms/video/connection/subscribe/RemoteTrackFactory;

    iput-object p6, p0, Llive/hms/video/transport/HMSTransport;->agentOs:Llive/hms/video/utils/HMSAgentOs;

    iput-object p7, p0, Llive/hms/video/transport/HMSTransport;->isQaLink:Llive/hms/video/transport/IsQaLink;

    iput-object p8, p0, Llive/hms/video/transport/HMSTransport;->offlineAnalyticsPeerInfo:Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;

    iput-object p9, p0, Llive/hms/video/transport/HMSTransport;->noiseCancellationStatusChecker:Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;

    iput-object p10, p0, Llive/hms/video/transport/HMSTransport;->hmsNetworkManager:Llive/hms/video/network/HMSNetworkManager;

    const/4 p2, 0x1

    iput-boolean p2, p0, Llive/hms/video/transport/HMSTransport;->isSimulcastEnabled:Z

    sget-object p2, Llive/hms/video/transport/models/TransportState;->Disconnected:Llive/hms/video/transport/models/TransportState;

    iput-object p2, p0, Llive/hms/video/transport/HMSTransport;->state:Llive/hms/video/transport/models/TransportState;

    move-object p5, p3

    new-instance p3, Llive/hms/video/events/AnalyticsEventsService;

    move-object p2, p7

    new-instance p7, Llive/hms/video/transport/HMSTransport$analyticsEventsService$1;

    invoke-direct {p7, p2}, Llive/hms/video/transport/HMSTransport$analyticsEventsService$1;-><init>(Ljava/lang/Object;)V

    move-object p4, p1

    invoke-direct/range {p3 .. p8}, Llive/hms/video/events/AnalyticsEventsService;-><init>(Landroid/content/Context;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;Llive/hms/video/utils/HMSAgentOs;Lc93/a;Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;)V

    iput-object p3, p0, Llive/hms/video/transport/HMSTransport;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport;->tracksToPublish:Ljava/util/ArrayList;

    new-instance p1, Ll01/q;

    const/16 p2, 0x14

    invoke-direct {p1, p2, p4, p0}, Ll01/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport;->hmsPeerConnectionFactory$delegate:Ll83/h;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport;->callbacks:Ljava/util/HashMap;

    new-instance p1, Llive/hms/video/transport/RetryScheduler;

    invoke-virtual {p0}, Llive/hms/video/transport/HMSTransport;->getAnalyticsEventsService()Llive/hms/video/events/AnalyticsEventsService;

    move-result-object p2

    new-instance p3, Lkk1/b;

    const/16 p4, 0x15

    invoke-direct {p3, p0, p4}, Lkk1/b;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p1, p2, p3}, Llive/hms/video/transport/RetryScheduler;-><init>(Llive/hms/video/events/AnalyticsEventsService;Lc93/m;)V

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport;->retryScheduler:Llive/hms/video/transport/RetryScheduler;

    new-instance p1, Llive/hms/video/transport/HMSTransport$retryPublishIceFailedTask$1;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Llive/hms/video/transport/HMSTransport$retryPublishIceFailedTask$1;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport;->retryPublishIceFailedTask:Lkotlin/jvm/functions/Function1;

    new-instance p1, Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;

    invoke-direct {p1, p0, p2}, Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport;->retrySignalDisconnectTask:Lkotlin/jvm/functions/Function1;

    new-instance p1, Llive/hms/video/transport/HMSTransport$retrySubscribeIceFailedTask$1;

    invoke-direct {p1, p0, p2}, Llive/hms/video/transport/HMSTransport$retrySubscribeIceFailedTask$1;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport;->retrySubscribeIceFailedTask:Lkotlin/jvm/functions/Function1;

    new-instance p1, Llive/hms/video/transport/HMSTransport$signalObserver$1;

    invoke-direct {p1, p0}, Llive/hms/video/transport/HMSTransport$signalObserver$1;-><init>(Llive/hms/video/transport/HMSTransport;)V

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport;->signalObserver:Llive/hms/video/transport/HMSTransport$signalObserver$1;

    new-instance p2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    invoke-direct {p2, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;-><init>(Llive/hms/video/signal/ISignalEventsObserver;)V

    iput-object p2, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    new-instance p1, Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1;

    invoke-direct {p1, p0}, Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1;-><init>(Llive/hms/video/transport/HMSTransport;)V

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport;->publishConnectionObserver:Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1;

    new-instance p1, Llive/hms/video/transport/HMSTransport$subscribeConnectionObserver$1;

    invoke-direct {p1, p0}, Llive/hms/video/transport/HMSTransport$subscribeConnectionObserver$1;-><init>(Llive/hms/video/transport/HMSTransport;)V

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport;->subscribeConnectionObserver:Llive/hms/video/transport/HMSTransport$subscribeConnectionObserver$1;

    const-string p1, ""

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport;->nodeID:Ljava/lang/String;

    new-instance p1, Landroid/os/HandlerThread;

    const-string p2, "RTCConfigurationThread"

    invoke-direct {p1, p2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport;->rtcConfigurationThread:Landroid/os/HandlerThread;

    new-instance p2, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {p2, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Llive/hms/video/transport/HMSTransport;->rtcConfigurationHandler:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;Llive/hms/video/transport/HMSTransport;)Llive/hms/video/factories/HMSPeerConnectionFactory;
    .locals 0

    invoke-static {p0, p1}, Llive/hms/video/transport/HMSTransport;->hmsPeerConnectionFactory_delegate$lambda$0(Landroid/content/Context;Llive/hms/video/transport/HMSTransport;)Llive/hms/video/factories/HMSPeerConnectionFactory;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCallbacks$p(Llive/hms/video/transport/HMSTransport;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Llive/hms/video/transport/HMSTransport;->callbacks:Ljava/util/HashMap;

    return-object p0
.end method

.method public static final synthetic access$getConnectParameters$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/transport/models/ConnectParameters;
    .locals 0

    iget-object p0, p0, Llive/hms/video/transport/HMSTransport;->connectParameters:Llive/hms/video/transport/models/ConnectParameters;

    return-object p0
.end method

.method public static final synthetic access$getObserver$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/transport/ITransportObserver;
    .locals 0

    iget-object p0, p0, Llive/hms/video/transport/HMSTransport;->observer:Llive/hms/video/transport/ITransportObserver;

    return-object p0
.end method

.method public static final synthetic access$getPublishConnection$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/connection/publish/HMSPublishConnection;
    .locals 0

    iget-object p0, p0, Llive/hms/video/transport/HMSTransport;->publishConnection:Llive/hms/video/connection/publish/HMSPublishConnection;

    return-object p0
.end method

.method public static final synthetic access$getRetryPublishIceFailedTask$p(Llive/hms/video/transport/HMSTransport;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, Llive/hms/video/transport/HMSTransport;->retryPublishIceFailedTask:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$getRetryScheduler$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/transport/RetryScheduler;
    .locals 0

    iget-object p0, p0, Llive/hms/video/transport/HMSTransport;->retryScheduler:Llive/hms/video/transport/RetryScheduler;

    return-object p0
.end method

.method public static final synthetic access$getRetrySignalDisconnectTask$p(Llive/hms/video/transport/HMSTransport;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, Llive/hms/video/transport/HMSTransport;->retrySignalDisconnectTask:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$getSignal$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/signal/ISignal;
    .locals 0

    iget-object p0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    return-object p0
.end method

.method public static final synthetic access$getSubscribeConnection$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/connection/subscribe/HMSSubscribeConnection;
    .locals 0

    iget-object p0, p0, Llive/hms/video/transport/HMSTransport;->subscribeConnection:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    return-object p0
.end method

.method public static final synthetic access$handleIceConnectionFailed(Llive/hms/video/transport/HMSTransport;Llive/hms/video/connection/models/HMSConnectionRole;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Llive/hms/video/transport/HMSTransport;->handleIceConnectionFailed(Llive/hms/video/connection/models/HMSConnectionRole;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$internalConnect(Llive/hms/video/transport/HMSTransport;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p5}, Llive/hms/video/transport/HMSTransport;->internalConnect(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$internalJoin(Llive/hms/video/transport/HMSTransport;Ljava/lang/String;Ljava/lang/String;ZZZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p6}, Llive/hms/video/transport/HMSTransport;->internalJoin(Ljava/lang/String;Ljava/lang/String;ZZZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$isPeerConnectionReady$p(Llive/hms/video/transport/HMSTransport;)Z
    .locals 0

    iget-boolean p0, p0, Llive/hms/video/transport/HMSTransport;->isPeerConnectionReady:Z

    return p0
.end method

.method public static final synthetic access$isRenegotiationDone$p(Llive/hms/video/transport/HMSTransport;)Z
    .locals 0

    iget-boolean p0, p0, Llive/hms/video/transport/HMSTransport;->isRenegotiationDone:Z

    return p0
.end method

.method public static final synthetic access$isTearDownInProgress$p(Llive/hms/video/transport/HMSTransport;)Z
    .locals 0

    iget-boolean p0, p0, Llive/hms/video/transport/HMSTransport;->isTearDownInProgress:Z

    return p0
.end method

.method public static final synthetic access$measuredJoin(Llive/hms/video/transport/HMSTransport;Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/connection/models/HMSSessionDescription;ZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p6}, Llive/hms/video/transport/HMSTransport;->measuredJoin(Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/connection/models/HMSSessionDescription;ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$performPublishRenegotiation(Llive/hms/video/transport/HMSTransport;Lhms/webrtc/MediaConstraints;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Llive/hms/video/transport/HMSTransport;->performPublishRenegotiation(Lhms/webrtc/MediaConstraints;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$publish(Llive/hms/video/transport/HMSTransport;Llive/hms/video/media/tracks/HMSTrack;ZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Llive/hms/video/transport/HMSTransport;->publish(Llive/hms/video/media/tracks/HMSTrack;ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$scheduleRetry(Llive/hms/video/transport/HMSTransport;Llive/hms/video/error/HMSException;Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Llive/hms/video/transport/HMSTransport;->scheduleRetry(Llive/hms/video/error/HMSException;Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setState(Llive/hms/video/transport/HMSTransport;Llive/hms/video/transport/models/TransportState;)V
    .locals 0

    invoke-direct {p0, p1}, Llive/hms/video/transport/HMSTransport;->setState(Llive/hms/video/transport/models/TransportState;)V

    return-void
.end method

.method public static final synthetic access$tearDownTransport(Llive/hms/video/transport/HMSTransport;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Llive/hms/video/transport/HMSTransport;->tearDownTransport(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$unpublish(Llive/hms/video/transport/HMSTransport;Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Llive/hms/video/transport/HMSTransport;->unpublish(Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llive/hms/video/transport/HMSTransport;Llive/hms/video/transport/models/TransportState;Llive/hms/video/error/HMSException;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Llive/hms/video/transport/HMSTransport;->retryScheduler$lambda$1(Llive/hms/video/transport/HMSTransport;Llive/hms/video/transport/models/TransportState;Llive/hms/video/error/HMSException;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final getHmsPeerConnectionFactory()Llive/hms/video/factories/HMSPeerConnectionFactory;
    .locals 1

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->hmsPeerConnectionFactory$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/video/factories/HMSPeerConnectionFactory;

    return-object v0
.end method

.method private final handleIceConnectionFailed(Llive/hms/video/connection/models/HMSConnectionRole;Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/connection/models/HMSConnectionRole;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Llive/hms/video/transport/HMSTransport$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    iget-object v2, p0, Llive/hms/video/transport/HMSTransport;->retryScheduler:Llive/hms/video/transport/RetryScheduler;

    sget-object v3, Llive/hms/video/transport/models/TransportFailureCategory;->SubscribeIceConnectionFailed:Llive/hms/video/transport/models/TransportFailureCategory;

    sget-object v4, Llive/hms/video/error/ErrorFactory$WebrtcErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$WebrtcErrors;

    sget-object v5, Llive/hms/video/error/ErrorFactory$Action;->SUBSCRIBE:Llive/hms/video/error/ErrorFactory$Action;

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Llive/hms/video/error/ErrorFactory$WebrtcErrors;->ICEFailure$default(Llive/hms/video/error/ErrorFactory$WebrtcErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object v4

    iget-object v6, p0, Llive/hms/video/transport/HMSTransport;->retrySubscribeIceFailedTask:Lkotlin/jvm/functions/Function1;

    const/16 v10, 0x10

    const/4 v11, 0x0

    const/4 v5, 0x1

    const-wide/16 v7, 0x0

    move-object v9, p2

    invoke-static/range {v2 .. v11}, Llive/hms/video/transport/RetryScheduler;->schedule$default(Llive/hms/video/transport/RetryScheduler;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/error/HMSException;ZLkotlin/jvm/functions/Function1;JLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    iget-object v2, p0, Llive/hms/video/transport/HMSTransport;->retryScheduler:Llive/hms/video/transport/RetryScheduler;

    sget-object v3, Llive/hms/video/transport/models/TransportFailureCategory;->PublishIceConnectionFailed:Llive/hms/video/transport/models/TransportFailureCategory;

    sget-object v4, Llive/hms/video/error/ErrorFactory$WebrtcErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$WebrtcErrors;

    sget-object v5, Llive/hms/video/error/ErrorFactory$Action;->PUBLISH:Llive/hms/video/error/ErrorFactory$Action;

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Llive/hms/video/error/ErrorFactory$WebrtcErrors;->ICEFailure$default(Llive/hms/video/error/ErrorFactory$WebrtcErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object v4

    iget-object v6, p0, Llive/hms/video/transport/HMSTransport;->retryPublishIceFailedTask:Lkotlin/jvm/functions/Function1;

    const/16 v10, 0x10

    const/4 v11, 0x0

    const/4 v5, 0x1

    const-wide/16 v7, 0x0

    move-object v9, p2

    invoke-static/range {v2 .. v11}, Llive/hms/video/transport/RetryScheduler;->schedule$default(Llive/hms/video/transport/RetryScheduler;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/error/HMSException;ZLkotlin/jvm/functions/Function1;JLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_3

    return-object p1

    :cond_3
    return-object v1
.end method

.method private static final hmsPeerConnectionFactory_delegate$lambda$0(Landroid/content/Context;Llive/hms/video/transport/HMSTransport;)Llive/hms/video/factories/HMSPeerConnectionFactory;
    .locals 2

    const-string v0, "$context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/factories/HMSPeerConnectionFactory;

    invoke-virtual {p1}, Llive/hms/video/transport/HMSTransport;->getAnalyticsEventsService()Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v1

    iget-object p1, p1, Llive/hms/video/transport/HMSTransport;->noiseCancellationStatusChecker:Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;

    invoke-direct {v0, p0, v1, p1}, Llive/hms/video/factories/HMSPeerConnectionFactory;-><init>(Landroid/content/Context;Llive/hms/video/events/AnalyticsEventsService;Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;)V

    return-object v0
.end method

.method private final internalConnect(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/signal/init/InitConfig;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p5

    const-string v2, "time taken to open web socket : "

    const-string v3, "time taken to initialize peerconnection  "

    const-string v4, "time taken to fetch init : "

    instance-of v5, v0, Llive/hms/video/transport/HMSTransport$internalConnect$1;

    if-eqz v5, :cond_0

    move-object v5, v0

    check-cast v5, Llive/hms/video/transport/HMSTransport$internalConnect$1;

    iget v6, v5, Llive/hms/video/transport/HMSTransport$internalConnect$1;->label:I

    const/high16 v7, -0x80000000

    and-int v8, v6, v7

    if-eqz v8, :cond_0

    sub-int/2addr v6, v7

    iput v6, v5, Llive/hms/video/transport/HMSTransport$internalConnect$1;->label:I

    :goto_0
    move-object v11, v5

    goto :goto_1

    :cond_0
    new-instance v5, Llive/hms/video/transport/HMSTransport$internalConnect$1;

    invoke-direct {v5, v1, v0}, Llive/hms/video/transport/HMSTransport$internalConnect$1;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v0, v11, Llive/hms/video/transport/HMSTransport$internalConnect$1;->result:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, v11, Llive/hms/video/transport/HMSTransport$internalConnect$1;->label:I

    const/4 v7, 0x1

    const-string v14, "Profiling"

    const-string v15, "HMSTransport"

    const/4 v8, 0x2

    const/4 v9, 0x0

    if-eqz v6, :cond_3

    if-eq v6, v7, :cond_2

    if-ne v6, v8, :cond_1

    iget-wide v3, v11, Llive/hms/video/transport/HMSTransport$internalConnect$1;->J$0:J

    iget-object v5, v11, Llive/hms/video/transport/HMSTransport$internalConnect$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v11, Llive/hms/video/transport/HMSTransport$internalConnect$1;->L$1:Ljava/lang/Object;

    check-cast v6, Llive/hms/video/signal/init/InitConfig;

    iget-object v7, v11, Llive/hms/video/transport/HMSTransport$internalConnect$1;->L$0:Ljava/lang/Object;

    check-cast v7, Llive/hms/video/transport/HMSTransport;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_9

    :catch_0
    move-exception v0

    goto/16 :goto_a

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-wide v6, v11, Llive/hms/video/transport/HMSTransport$internalConnect$1;->J$0:J

    iget-object v10, v11, Llive/hms/video/transport/HMSTransport$internalConnect$1;->L$3:Ljava/lang/Object;

    check-cast v10, Lkotlin/jvm/functions/Function1;

    iget-object v12, v11, Llive/hms/video/transport/HMSTransport$internalConnect$1;->L$2:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    iget-object v13, v11, Llive/hms/video/transport/HMSTransport$internalConnect$1;->L$1:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v8, v11, Llive/hms/video/transport/HMSTransport$internalConnect$1;->L$0:Ljava/lang/Object;

    check-cast v8, Llive/hms/video/transport/HMSTransport;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-wide/from16 v16, v6

    move-object v7, v8

    move-object v6, v0

    move-object v0, v9

    goto :goto_3

    :catch_1
    move-exception v0

    goto/16 :goto_b

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    const-string v0, "connect: started \u23f0"

    invoke-static {v15, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_2
    iget-object v0, v1, Llive/hms/video/transport/HMSTransport;->performanceMeasurement:Llive/hms/video/sdk/models/PerformanceMeasurement;

    if-eqz v0, :cond_4

    sget-object v6, Llive/hms/video/sdk/models/EVENT_TYPE;->INIT_CALL:Llive/hms/video/sdk/models/EVENT_TYPE;

    invoke-virtual {v0, v6}, Llive/hms/video/sdk/models/PerformanceMeasurement;->start$lib_release(Llive/hms/video/sdk/models/EVENT_TYPE;)V
    :try_end_2
    .catch Llive/hms/video/error/HMSException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v0

    goto/16 :goto_c

    :cond_4
    :goto_2
    :try_start_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    sget-object v6, Llive/hms/video/signal/init/InitService;->INSTANCE:Llive/hms/video/signal/init/InitService;

    move-object v0, v9

    iget-object v9, v1, Llive/hms/video/transport/HMSTransport;->agentOs:Llive/hms/video/utils/HMSAgentOs;

    iput-object v1, v11, Llive/hms/video/transport/HMSTransport$internalConnect$1;->L$0:Ljava/lang/Object;

    move-object/from16 v8, p1

    iput-object v8, v11, Llive/hms/video/transport/HMSTransport$internalConnect$1;->L$1:Ljava/lang/Object;

    move-object/from16 v10, p3

    iput-object v10, v11, Llive/hms/video/transport/HMSTransport$internalConnect$1;->L$2:Ljava/lang/Object;

    move-object/from16 v0, p4

    iput-object v0, v11, Llive/hms/video/transport/HMSTransport$internalConnect$1;->L$3:Ljava/lang/Object;

    iput-wide v12, v11, Llive/hms/video/transport/HMSTransport$internalConnect$1;->J$0:J

    iput v7, v11, Llive/hms/video/transport/HMSTransport$internalConnect$1;->label:I

    const/4 v8, 0x0

    move-wide/from16 v16, v12

    const/4 v12, 0x2

    const/4 v13, 0x0

    move-object/from16 v7, p1

    move-object/from16 v10, p2

    const/4 v0, 0x0

    invoke-static/range {v6 .. v13}, Llive/hms/video/signal/init/InitService;->fetchInitConfig$default(Llive/hms/video/signal/init/InitService;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    if-ne v6, v5, :cond_5

    goto/16 :goto_8

    :cond_5
    move-object/from16 v13, p1

    move-object/from16 v12, p3

    move-object/from16 v10, p4

    move-object v7, v1

    :goto_3
    :try_start_4
    check-cast v6, Llive/hms/video/signal/init/InitConfig;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v18

    sub-long v0, v18, v16

    invoke-virtual {v8, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v7, Llive/hms/video/transport/HMSTransport;->observer:Llive/hms/video/transport/ITransportObserver;

    invoke-interface {v0}, Llive/hms/video/transport/ITransportObserver;->onInitFetched()V

    if-eqz v10, :cond_6

    invoke-interface {v10, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :catch_3
    move-exception v0

    move-object v8, v7

    goto/16 :goto_b

    :cond_6
    :goto_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v6}, Llive/hms/video/signal/init/InitConfig;->getServerConfiguration()Llive/hms/video/signal/init/ServerConfiguration;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Llive/hms/video/signal/init/ServerConfiguration;->getEnabledFlags()Ljava/util/List;

    move-result-object v9
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_5

    :cond_7
    const/4 v9, 0x0

    :goto_5
    sget-object v4, Lm83/y;->w:Lm83/y;

    if-nez v9, :cond_8

    move-object v9, v4

    :cond_8
    :try_start_5
    sget-object v8, Llive/hms/video/sdk/featureflags/Features$SIMULCAST;->INSTANCE:Llive/hms/video/sdk/featureflags/Features$SIMULCAST;

    invoke-virtual {v8}, Llive/hms/video/sdk/featureflags/Features;->getServerName()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v9, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    iput-boolean v8, v7, Llive/hms/video/transport/HMSTransport;->isSimulcastEnabled:Z

    invoke-virtual {v6}, Llive/hms/video/signal/init/InitConfig;->getServerConfiguration()Llive/hms/video/signal/init/ServerConfiguration;

    move-result-object v8

    if-eqz v8, :cond_9

    invoke-virtual {v8}, Llive/hms/video/signal/init/ServerConfiguration;->getEnabledFlags()Ljava/util/List;

    move-result-object v9

    goto :goto_6

    :cond_9
    const/4 v9, 0x0

    :goto_6
    if-nez v9, :cond_a

    goto :goto_7

    :cond_a
    move-object v4, v9

    :goto_7
    sget-object v8, Llive/hms/video/sdk/featureflags/Features$SOFTWARE_ECHO_CANCELLATION_ENABLED;->INSTANCE:Llive/hms/video/sdk/featureflags/Features$SOFTWARE_ECHO_CANCELLATION_ENABLED;

    invoke-virtual {v8}, Llive/hms/video/sdk/featureflags/Features;->getServerName()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    iput-boolean v4, v7, Llive/hms/video/transport/HMSTransport;->serverSoftwareEchoCancellationEnabled:Z

    iget-boolean v8, v7, Llive/hms/video/transport/HMSTransport;->isSimulcastEnabled:Z

    invoke-virtual {v7, v8, v4}, Llive/hms/video/transport/HMSTransport;->initHmsPeerConnectionFactory(ZZ)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sub-long/2addr v8, v0

    invoke-virtual {v4, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    :try_start_6
    iget-object v0, v7, Llive/hms/video/transport/HMSTransport;->performanceMeasurement:Llive/hms/video/sdk/models/PerformanceMeasurement;

    if-eqz v0, :cond_b

    sget-object v1, Llive/hms/video/sdk/models/EVENT_TYPE;->INIT_CALL:Llive/hms/video/sdk/models/EVENT_TYPE;

    invoke-virtual {v0, v1}, Llive/hms/video/sdk/models/PerformanceMeasurement;->end$lib_release(Llive/hms/video/sdk/models/EVENT_TYPE;)Llive/hms/video/sdk/models/PerformanceMeasurement;

    :cond_b
    iget-object v0, v7, Llive/hms/video/transport/HMSTransport;->agentOs:Llive/hms/video/utils/HMSAgentOs;

    invoke-virtual {v0}, Llive/hms/video/utils/HMSAgentOs;->getUserAgentUrlEncoded()Ljava/lang/String;

    move-result-object v0

    iget-object v1, v7, Llive/hms/video/transport/HMSTransport;->performanceMeasurement:Llive/hms/video/sdk/models/PerformanceMeasurement;

    if-eqz v1, :cond_c

    sget-object v3, Llive/hms/video/sdk/models/EVENT_TYPE;->WEB_SOCKET_CONNECT_TIME:Llive/hms/video/sdk/models/EVENT_TYPE;

    invoke-virtual {v1, v3}, Llive/hms/video/sdk/models/PerformanceMeasurement;->start$lib_release(Llive/hms/video/sdk/models/EVENT_TYPE;)V
    :try_end_6
    .catch Llive/hms/video/error/HMSException; {:try_start_6 .. :try_end_6} :catch_2

    :cond_c
    :try_start_7
    invoke-virtual {v6}, Llive/hms/video/signal/init/InitConfig;->getEndpoint()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v7, v1, v12, v13, v0}, Llive/hms/video/transport/HMSTransport;->makeWebsocketURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object v1, v7, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    iput-object v7, v11, Llive/hms/video/transport/HMSTransport$internalConnect$1;->L$0:Ljava/lang/Object;

    iput-object v6, v11, Llive/hms/video/transport/HMSTransport$internalConnect$1;->L$1:Ljava/lang/Object;

    iput-object v0, v11, Llive/hms/video/transport/HMSTransport$internalConnect$1;->L$2:Ljava/lang/Object;

    const/4 v8, 0x0

    iput-object v8, v11, Llive/hms/video/transport/HMSTransport$internalConnect$1;->L$3:Ljava/lang/Object;

    iput-wide v3, v11, Llive/hms/video/transport/HMSTransport$internalConnect$1;->J$0:J

    const/4 v8, 0x2

    iput v8, v11, Llive/hms/video/transport/HMSTransport$internalConnect$1;->label:I

    invoke-interface {v1, v0, v11}, Llive/hms/video/signal/ISignal;->open(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_d

    :goto_8
    return-object v5

    :cond_d
    move-object v5, v0

    :goto_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v7, Llive/hms/video/transport/HMSTransport;->hmsNetworkManager:Llive/hms/video/network/HMSNetworkManager;

    invoke-virtual {v0}, Llive/hms/video/network/HMSNetworkManager;->getConnectedNetworkType()Ljava/lang/String;

    move-result-object v0

    iget-object v1, v7, Llive/hms/video/transport/HMSTransport;->lastKnownNetworkType:Ljava/lang/String;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    iget-object v1, v7, Llive/hms/video/transport/HMSTransport;->lastKnownNetworkType:Ljava/lang/String;

    if-eqz v1, :cond_e

    invoke-virtual {v7}, Llive/hms/video/transport/HMSTransport;->getAnalyticsEventsService()Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v1

    sget-object v2, Llive/hms/video/events/AnalyticsEventFactory;->INSTANCE:Llive/hms/video/events/AnalyticsEventFactory;

    invoke-virtual {v2, v0}, Llive/hms/video/events/AnalyticsEventFactory;->networkTypeEvent(Ljava/lang/String;)Llive/hms/video/events/AnalyticsEvent;

    move-result-object v2

    invoke-virtual {v1, v2}, Llive/hms/video/events/AnalyticsEventsService;->queue(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v1

    invoke-virtual {v1}, Llive/hms/video/events/AnalyticsEventsService;->flush()V

    :cond_e
    iput-object v0, v7, Llive/hms/video/transport/HMSTransport;->lastKnownNetworkType:Ljava/lang/String;

    :cond_f
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Llive/hms/video/transport/HMSTransport;->setTimeAfterWSOpen(J)V

    iget-object v0, v7, Llive/hms/video/transport/HMSTransport;->observer:Llive/hms/video/transport/ITransportObserver;

    invoke-interface {v0, v5}, Llive/hms/video/transport/ITransportObserver;->onWebSocketConnected(Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    :try_start_8
    iget-object v0, v7, Llive/hms/video/transport/HMSTransport;->performanceMeasurement:Llive/hms/video/sdk/models/PerformanceMeasurement;

    if-eqz v0, :cond_10

    sget-object v1, Llive/hms/video/sdk/models/EVENT_TYPE;->WEB_SOCKET_CONNECT_TIME:Llive/hms/video/sdk/models/EVENT_TYPE;

    invoke-virtual {v0, v1}, Llive/hms/video/sdk/models/PerformanceMeasurement;->end$lib_release(Llive/hms/video/sdk/models/EVENT_TYPE;)Llive/hms/video/sdk/models/PerformanceMeasurement;

    :cond_10
    iget-object v0, v7, Llive/hms/video/transport/HMSTransport;->performanceMeasurement:Llive/hms/video/sdk/models/PerformanceMeasurement;

    if-eqz v0, :cond_11

    sget-object v1, Llive/hms/video/sdk/models/EVENT_TYPE;->POLICY_CHANGE:Llive/hms/video/sdk/models/EVENT_TYPE;

    invoke-virtual {v0, v1}, Llive/hms/video/sdk/models/PerformanceMeasurement;->start$lib_release(Llive/hms/video/sdk/models/EVENT_TYPE;)V

    :cond_11
    iget-object v0, v7, Llive/hms/video/transport/HMSTransport;->performanceMeasurement:Llive/hms/video/sdk/models/PerformanceMeasurement;

    if-eqz v0, :cond_12

    sget-object v1, Llive/hms/video/sdk/models/EVENT_TYPE;->ROOM_STATE:Llive/hms/video/sdk/models/EVENT_TYPE;

    invoke-virtual {v0, v1}, Llive/hms/video/sdk/models/PerformanceMeasurement;->start$lib_release(Llive/hms/video/sdk/models/EVENT_TYPE;)V

    :cond_12
    invoke-virtual {v7}, Llive/hms/video/transport/HMSTransport;->getAnalyticsEventsService()Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v0

    iget-object v1, v7, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-virtual {v0, v1}, Llive/hms/video/events/AnalyticsEventsService;->addTransport(Llive/hms/video/events/IAnalyticsTransport;)Z

    invoke-virtual {v7}, Llive/hms/video/transport/HMSTransport;->getAnalyticsEventsService()Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/events/AnalyticsEventsService;->flush()V
    :try_end_8
    .catch Llive/hms/video/error/HMSException; {:try_start_8 .. :try_end_8} :catch_2

    const-string v0, "connect: successful \u2705"

    invoke-static {v15, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/transport/models/TransportState;->SignalConnected:Llive/hms/video/transport/models/TransportState;

    invoke-direct {v7, v0}, Llive/hms/video/transport/HMSTransport;->setState(Llive/hms/video/transport/models/TransportState;)V

    iget-object v0, v7, Llive/hms/video/transport/HMSTransport;->observer:Llive/hms/video/transport/ITransportObserver;

    invoke-virtual {v7}, Llive/hms/video/transport/HMSTransport;->getState()Llive/hms/video/transport/models/TransportState;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, v8, v2}, Llive/hms/video/transport/ITransportObserver$DefaultImpls;->onStateChange$default(Llive/hms/video/transport/ITransportObserver;Llive/hms/video/transport/models/TransportState;Llive/hms/video/error/HMSException;ILjava/lang/Object;)V

    return-object v6

    :goto_a
    :try_start_9
    iget-object v1, v7, Llive/hms/video/transport/HMSTransport;->performanceMeasurement:Llive/hms/video/sdk/models/PerformanceMeasurement;

    if-eqz v1, :cond_13

    sget-object v2, Llive/hms/video/sdk/models/EVENT_TYPE;->WEB_SOCKET_CONNECT_TIME:Llive/hms/video/sdk/models/EVENT_TYPE;

    invoke-virtual {v1, v2}, Llive/hms/video/sdk/models/PerformanceMeasurement;->end$lib_release(Llive/hms/video/sdk/models/EVENT_TYPE;)Llive/hms/video/sdk/models/PerformanceMeasurement;

    :cond_13
    throw v0

    :catch_4
    move-exception v0

    move-object/from16 v8, p0

    :goto_b
    iget-object v1, v8, Llive/hms/video/transport/HMSTransport;->performanceMeasurement:Llive/hms/video/sdk/models/PerformanceMeasurement;

    if-eqz v1, :cond_14

    sget-object v2, Llive/hms/video/sdk/models/EVENT_TYPE;->INIT_CALL:Llive/hms/video/sdk/models/EVENT_TYPE;

    invoke-virtual {v1, v2}, Llive/hms/video/sdk/models/PerformanceMeasurement;->end$lib_release(Llive/hms/video/sdk/models/EVENT_TYPE;)Llive/hms/video/sdk/models/PerformanceMeasurement;

    :cond_14
    throw v0
    :try_end_9
    .catch Llive/hms/video/error/HMSException; {:try_start_9 .. :try_end_9} :catch_2

    :goto_c
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "internalConnect:: failed \u274c [error="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v15, v1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic internalConnect$default(Llive/hms/video/transport/HMSTransport;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    const/4 p4, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Llive/hms/video/transport/HMSTransport;->internalConnect(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final internalJoin(Ljava/lang/String;Ljava/lang/String;ZZZLq83/d;)Ljava/lang/Object;
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZZ",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p6

    const-string v3, "time taken to set remote answer : "

    const-string v4, "time taken for join response : "

    const-string v5, "time taken to set local offer : "

    const-string v6, "time taken to create offer : "

    const-string v7, "time taken to init PC connections : "

    instance-of v8, v0, Llive/hms/video/transport/HMSTransport$internalJoin$1;

    if-eqz v8, :cond_0

    move-object v8, v0

    check-cast v8, Llive/hms/video/transport/HMSTransport$internalJoin$1;

    iget v9, v8, Llive/hms/video/transport/HMSTransport$internalJoin$1;->label:I

    const/high16 v10, -0x80000000

    and-int v11, v9, v10

    if-eqz v11, :cond_0

    sub-int/2addr v9, v10

    iput v9, v8, Llive/hms/video/transport/HMSTransport$internalJoin$1;->label:I

    :goto_0
    move-object v15, v8

    goto :goto_1

    :cond_0
    new-instance v8, Llive/hms/video/transport/HMSTransport$internalJoin$1;

    invoke-direct {v8, v1, v0}, Llive/hms/video/transport/HMSTransport$internalJoin$1;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v0, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->result:Ljava/lang/Object;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v9, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->label:I

    const-string v16, "publishConnection"

    const/4 v12, 0x2

    const-string v13, "Profiling"

    const/4 v14, 0x1

    const-string v10, "HMSTransport"

    if-eqz v9, :cond_5

    if-eq v9, v14, :cond_4

    const/4 v2, 0x3

    if-eq v9, v12, :cond_3

    if-eq v9, v2, :cond_2

    const/4 v2, 0x4

    if-ne v9, v2, :cond_1

    iget-object v2, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/util/Date;

    iget-object v3, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$0:Ljava/lang/Object;

    check-cast v4, Llive/hms/video/transport/HMSTransport;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v10

    move-object v10, v3

    goto/16 :goto_a

    :catch_0
    move-exception v0

    move-object v1, v4

    goto/16 :goto_b

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v2, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$4:Ljava/lang/Object;

    check-cast v2, Llive/hms/video/connection/publish/HMSPublishConnection;

    iget-object v4, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$3:Ljava/lang/Object;

    check-cast v4, Llive/hms/video/connection/publish/HMSPublishConnection;

    iget-object v4, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$2:Ljava/lang/Object;

    check-cast v4, Ljava/util/Date;

    iget-object v5, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$1:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$0:Ljava/lang/Object;

    check-cast v6, Llive/hms/video/transport/HMSTransport;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Llive/hms/video/error/HMSException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v9, v10

    move-object v10, v5

    move-object v5, v9

    move-object/from16 v25, v3

    move-object v12, v4

    move-object v9, v6

    move-object v6, v13

    goto/16 :goto_6

    :catch_1
    move-exception v0

    move-object v2, v4

    move-object v1, v6

    goto/16 :goto_b

    :cond_3
    iget-wide v5, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->J$0:J

    iget-object v7, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$4:Ljava/lang/Object;

    check-cast v7, Llive/hms/video/connection/publish/HMSPublishConnection;

    iget-object v9, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$3:Ljava/lang/Object;

    check-cast v9, Llive/hms/video/connection/publish/HMSPublishConnection;

    iget-object v12, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$2:Ljava/lang/Object;

    check-cast v12, Ljava/util/Date;

    iget-object v2, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v11, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$0:Ljava/lang/Object;

    check-cast v11, Llive/hms/video/transport/HMSTransport;

    :try_start_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Llive/hms/video/error/HMSException; {:try_start_2 .. :try_end_2} :catch_2

    move-object/from16 v25, v3

    move-object/from16 p2, v4

    move-object v3, v9

    move-object v9, v11

    const/16 v18, 0x0

    move-object v4, v0

    const/4 v0, 0x3

    move-object/from16 v26, v10

    move-object v10, v2

    move-object v2, v7

    move v7, v14

    move-wide/from16 v27, v5

    move-object/from16 v5, v26

    move-object v6, v13

    move-wide/from16 v13, v27

    goto/16 :goto_4

    :catch_2
    move-exception v0

    move-object v1, v11

    :goto_2
    move-object v2, v12

    goto/16 :goto_b

    :cond_4
    move-object v11, v13

    iget-wide v12, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->J$0:J

    iget-boolean v2, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->Z$1:Z

    iget-boolean v9, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->Z$0:Z

    iget-object v14, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$4:Ljava/lang/Object;

    check-cast v14, Ljava/util/Date;

    move-object/from16 v20, v0

    iget-object v0, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lhms/webrtc/MediaConstraints;

    move-object/from16 p1, v0

    iget-object v0, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p2, v0

    iget-object v0, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p3, v0

    iget-object v0, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$0:Ljava/lang/Object;

    move-object/from16 v21, v0

    check-cast v21, Llive/hms/video/transport/HMSTransport;

    :try_start_3
    invoke-static/range {v20 .. v20}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catch Llive/hms/video/error/HMSException; {:try_start_3 .. :try_end_3} :catch_3

    move-wide/from16 v26, v12

    move-object/from16 v13, v21

    move-wide/from16 v20, v26

    move-object/from16 v0, p1

    move v12, v9

    move-object/from16 v22, v11

    move-object v9, v14

    const/16 v17, 0x3

    move-object/from16 v11, p2

    move v14, v2

    move-object/from16 v2, p3

    goto/16 :goto_3

    :catch_3
    move-exception v0

    move-object v2, v14

    move-object/from16 v1, v21

    goto/16 :goto_b

    :cond_5
    move-object/from16 v20, v0

    move-object v11, v13

    const/16 v17, 0x3

    invoke-static/range {v20 .. v20}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Llive/hms/video/factories/MediaConstraintsFactory;->INSTANCE:Llive/hms/video/factories/MediaConstraintsFactory;

    invoke-virtual {v0}, Llive/hms/video/factories/MediaConstraintsFactory;->makePublishOfferConstraints()Lhms/webrtc/MediaConstraints;

    move-result-object v0

    new-instance v9, Ljava/util/Date;

    invoke-direct {v9}, Ljava/util/Date;-><init>()V

    sget-object v12, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "Joining with name="

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v10, v13}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p4, :cond_10

    :try_start_4
    const-string v12, "joining with offer"

    invoke-static {v10, v12}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    iput-object v1, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$0:Ljava/lang/Object;

    iput-object v2, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$1:Ljava/lang/Object;

    move-object/from16 v14, p2

    iput-object v14, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$2:Ljava/lang/Object;

    iput-object v0, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$3:Ljava/lang/Object;

    iput-object v9, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$4:Ljava/lang/Object;

    move-object/from16 v20, v0

    move/from16 v0, p3

    iput-boolean v0, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->Z$0:Z

    move/from16 v0, p5

    iput-boolean v0, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->Z$1:Z

    iput-wide v12, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->J$0:J

    const/4 v0, 0x1

    iput v0, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->label:I

    invoke-virtual {v1, v15}, Llive/hms/video/transport/HMSTransport;->initPeerConnections(Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catch Llive/hms/video/error/HMSException; {:try_start_4 .. :try_end_4} :catch_7

    if-ne v0, v8, :cond_6

    goto/16 :goto_9

    :cond_6
    move-object/from16 v22, v11

    move-object v11, v14

    move-object/from16 v0, v20

    move/from16 v14, p5

    move-wide/from16 v20, v12

    move/from16 v12, p3

    move-object v13, v1

    :goto_3
    :try_start_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v23

    move-object/from16 p1, v11

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v25, v3

    move-object v7, v4

    sub-long v3, v23, v20

    invoke-virtual {v11, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v11, v22

    invoke-static {v11, v3}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, v13, Llive/hms/video/transport/HMSTransport;->publishConnection:Llive/hms/video/connection/publish/HMSPublishConnection;

    if-eqz v3, :cond_f

    const-string v4, "join: Starting offer negotiation with server"

    invoke-static {v10, v4}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Llive/hms/video/transport/HMSTransport$internalJoin$2$offer$1;

    move-object/from16 p2, v7

    const/4 v7, 0x0

    invoke-direct {v4, v3, v0, v7}, Llive/hms/video/transport/HMSTransport$internalJoin$2$offer$1;-><init>(Llive/hms/video/connection/publish/HMSPublishConnection;Lhms/webrtc/MediaConstraints;Lq83/d;)V

    sget-object v0, Lq83/k;->w:Lq83/k;

    invoke-static {v0, v4}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhms/webrtc/SessionDescription;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v20

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sub-long v6, v20, v23

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v11, v4}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Llive/hms/video/transport/HMSTransport$internalJoin$2$1;

    const/4 v7, 0x0

    invoke-direct {v4, v3, v0, v7}, Llive/hms/video/transport/HMSTransport$internalJoin$2$1;-><init>(Llive/hms/video/connection/publish/HMSPublishConnection;Lhms/webrtc/SessionDescription;Lq83/d;)V

    invoke-static {v4}, Lbc3/f0;->F(Lc93/m;)Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-wide/from16 p3, v6

    sub-long v5, p3, v20

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v11, v4}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v4, Llive/hms/video/connection/models/HMSSessionDescription;->Companion:Llive/hms/video/connection/models/HMSSessionDescription$Companion;

    const/4 v7, 0x0

    invoke-virtual {v4, v0, v7}, Llive/hms/video/connection/models/HMSSessionDescription$Companion;->from(Lhms/webrtc/SessionDescription;Ljava/lang/String;)Llive/hms/video/connection/models/HMSSessionDescription;

    move-result-object v0

    iput-object v13, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$0:Ljava/lang/Object;

    iput-object v2, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$1:Ljava/lang/Object;

    iput-object v9, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$2:Ljava/lang/Object;

    iput-object v3, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$3:Ljava/lang/Object;

    iput-object v3, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$4:Ljava/lang/Object;

    move-wide/from16 v4, p3

    iput-wide v4, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->J$0:J

    const/4 v6, 0x2

    iput v6, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->label:I
    :try_end_5
    .catch Llive/hms/video/error/HMSException; {:try_start_5 .. :try_end_5} :catch_6

    move-wide/from16 p3, v4

    move-object/from16 v18, v7

    move-object v5, v10

    move-object v6, v11

    const/4 v7, 0x1

    move-object/from16 v11, p1

    move-object v10, v2

    move-object v2, v9

    move-object v9, v13

    move-object v13, v0

    move/from16 v0, v17

    :try_start_6
    invoke-direct/range {v9 .. v15}, Llive/hms/video/transport/HMSTransport;->measuredJoin(Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/connection/models/HMSSessionDescription;ZLq83/d;)Ljava/lang/Object;

    move-result-object v4
    :try_end_6
    .catch Llive/hms/video/error/HMSException; {:try_start_6 .. :try_end_6} :catch_5

    if-ne v4, v8, :cond_7

    goto/16 :goto_9

    :cond_7
    move-wide/from16 v13, p3

    move-object v12, v2

    move-object v2, v3

    :goto_4
    :try_start_7
    check-cast v4, Llive/hms/video/connection/models/HMSSessionDescription;

    invoke-virtual {v2}, Llive/hms/video/connection/publish/HMSPublishConnection;->isClose()Z

    move-result v11

    if-nez v11, :cond_e

    iget-object v11, v9, Llive/hms/video/transport/HMSTransport;->publishConnection:Llive/hms/video/connection/publish/HMSPublishConnection;

    if-eqz v11, :cond_d

    invoke-virtual {v4}, Llive/hms/video/connection/models/HMSSessionDescription;->getSfuNodeId()Ljava/lang/String;

    move-result-object v16
    :try_end_7
    .catch Llive/hms/video/error/HMSException; {:try_start_7 .. :try_end_7} :catch_4

    const-string v17, ""

    if-nez v16, :cond_8

    move-object/from16 v7, v17

    goto :goto_5

    :cond_8
    move-object/from16 v7, v16

    :goto_5
    :try_start_8
    invoke-virtual {v11, v7}, Llive/hms/video/connection/HMSConnection;->setNodeInfo(Ljava/lang/String;)V

    iget-object v7, v9, Llive/hms/video/transport/HMSTransport;->subscribeConnection:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    if-eqz v7, :cond_c

    invoke-virtual {v4}, Llive/hms/video/connection/models/HMSSessionDescription;->getSfuNodeId()Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_9

    move-object/from16 v11, v17

    :cond_9
    invoke-virtual {v7, v11}, Llive/hms/video/connection/HMSConnection;->setNodeInfo(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Llive/hms/video/transport/HMSTransport;->setTimeAfterJoinResponse(J)V

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v7, p2

    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Llive/hms/video/transport/HMSTransport;->getTimeAfterJoinResponse()J

    move-result-wide v18

    sub-long v13, v18, v13

    invoke-virtual {v0, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Llive/hms/video/connection/models/HMSSessionDescription;->native()Lhms/webrtc/SessionDescription;

    move-result-object v0

    iput-object v9, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$0:Ljava/lang/Object;

    iput-object v10, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$1:Ljava/lang/Object;

    iput-object v12, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$2:Ljava/lang/Object;

    iput-object v3, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$3:Ljava/lang/Object;

    iput-object v2, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$4:Ljava/lang/Object;

    const/4 v1, 0x3

    iput v1, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->label:I

    invoke-virtual {v2, v0, v15}, Llive/hms/video/connection/HMSConnection;->setRemoteDescription(Lhms/webrtc/SessionDescription;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_a

    goto/16 :goto_9

    :cond_a
    :goto_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    new-instance v3, Ljava/lang/StringBuilder;

    move-object/from16 v4, v25

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Llive/hms/video/transport/HMSTransport;->getTimeAfterJoinResponse()J

    move-result-wide v7

    sub-long/2addr v0, v7

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Llive/hms/video/connection/HMSConnection;->getCandidates()Ljava/util/ArrayList;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhms/webrtc/IceCandidate;

    invoke-virtual {v2, v1}, Llive/hms/video/connection/HMSConnection;->addIceCandidate(Lhms/webrtc/IceCandidate;)Z

    goto :goto_7

    :catch_4
    move-exception v0

    move-object v1, v9

    goto/16 :goto_2

    :cond_b
    const-string v0, "join: Offer negotiation with server successful"

    invoke-static {v5, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, v9, Llive/hms/video/transport/HMSTransport;->isRenegotiationDone:Z

    move-object v0, v5

    goto :goto_a

    :cond_c
    const-string v0, "subscribeConnection"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v18

    :cond_d
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v18

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Transport is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_8
    .catch Llive/hms/video/error/HMSException; {:try_start_8 .. :try_end_8} :catch_4

    :catch_5
    move-exception v0

    :goto_8
    move-object v1, v9

    goto :goto_b

    :catch_6
    move-exception v0

    move-object v2, v9

    move-object v9, v13

    goto :goto_8

    :cond_f
    move-object v2, v9

    move-object v9, v13

    const/16 v18, 0x0

    :try_start_9
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v18
    :try_end_9
    .catch Llive/hms/video/error/HMSException; {:try_start_9 .. :try_end_9} :catch_5

    :catch_7
    move-exception v0

    move-object/from16 v1, p0

    move-object v2, v9

    goto :goto_b

    :cond_10
    move-object/from16 v14, p2

    move-object v5, v10

    :try_start_a
    const-string v0, "joining without offer"

    invoke-static {v5, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p0

    iput-object v1, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$0:Ljava/lang/Object;

    iput-object v2, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$1:Ljava/lang/Object;

    iput-object v9, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->L$2:Ljava/lang/Object;

    const/4 v0, 0x4

    iput v0, v15, Llive/hms/video/transport/HMSTransport$internalJoin$1;->label:I

    move-object v0, v5

    const/4 v5, 0x0

    move/from16 v4, p3

    move/from16 v6, p5

    move-object v3, v14

    move-object v7, v15

    invoke-direct/range {v1 .. v7}, Llive/hms/video/transport/HMSTransport;->measuredJoin(Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/connection/models/HMSSessionDescription;ZLq83/d;)Ljava/lang/Object;

    move-result-object v3
    :try_end_a
    .catch Llive/hms/video/error/HMSException; {:try_start_a .. :try_end_a} :catch_7

    if-ne v3, v8, :cond_11

    :goto_9
    return-object v8

    :cond_11
    move-object/from16 v10, p1

    :goto_a
    sget-object v1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Join successful [name="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5d

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :goto_b
    iget-object v3, v1, Llive/hms/video/transport/HMSTransport;->hmsNetworkManager:Llive/hms/video/network/HMSNetworkManager;

    invoke-virtual {v3}, Llive/hms/video/network/HMSNetworkManager;->getConnectedNetworkType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Llive/hms/video/transport/HMSTransport;->getAnalyticsEventsService()Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v1

    sget-object v4, Llive/hms/video/events/AnalyticsEventFactory;->INSTANCE:Llive/hms/video/events/AnalyticsEventFactory;

    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    invoke-virtual {v4, v2, v5, v0, v3}, Llive/hms/video/events/AnalyticsEventFactory;->joinFailedEvent(Ljava/util/Date;Ljava/util/Date;Llive/hms/video/error/HMSException;Ljava/lang/String;)Llive/hms/video/events/AnalyticsEvent;

    move-result-object v2

    invoke-virtual {v1, v2}, Llive/hms/video/events/AnalyticsEventsService;->queue(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v1

    invoke-virtual {v1}, Llive/hms/video/events/AnalyticsEventsService;->flush()V

    throw v0
.end method

.method private final isPeerConnectionDisposed(Llive/hms/video/transport/models/TransportCallbackTriple;)Z
    .locals 2

    iget-boolean v0, p0, Llive/hms/video/transport/HMSTransport;->isPeerConnectionReady:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->publishConnection:Llive/hms/video/connection/publish/HMSPublishConnection;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Llive/hms/video/connection/publish/HMSPublishConnection;->getNativeConnection()Lhms/webrtc/PeerConnection;

    move-result-object v0

    invoke-virtual {v0}, Lhms/webrtc/PeerConnection;->connectionState()Lhms/webrtc/PeerConnection$PeerConnectionState;

    move-result-object v0

    sget-object v1, Lhms/webrtc/PeerConnection$PeerConnectionState;->CLOSED:Lhms/webrtc/PeerConnection$PeerConnectionState;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    const-string p1, "publishConnection"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_2
    :goto_0
    const-string v0, "HMSTransport"

    const-string v1, "[role=PUBLISH]  publish renegotiation IGNORED as PeerConnection is closed \u274c already"

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Llive/hms/video/transport/models/TransportCallbackTriple;->getDeferred()Lbc3/s;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "publish renegotiation IGNORED as PeerConnection is closed"

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    check-cast p1, Lbc3/t1;

    invoke-virtual {p1, v0}, Lbc3/t1;->p(Ljava/util/concurrent/CancellationException;)V

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method private final makeWebsocketURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "?peer="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&token="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x26

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&protocol_version=2.5&protocol_spec=20240720"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final measuredJoin(Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/connection/models/HMSSessionDescription;ZLq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Llive/hms/video/connection/models/HMSSessionDescription;",
            "Z",
            "Lq83/d<",
            "-",
            "Llive/hms/video/connection/models/HMSSessionDescription;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p6, Llive/hms/video/transport/HMSTransport$measuredJoin$1;

    if-eqz v0, :cond_0

    move-object v0, p6

    check-cast v0, Llive/hms/video/transport/HMSTransport$measuredJoin$1;

    iget v1, v0, Llive/hms/video/transport/HMSTransport$measuredJoin$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/transport/HMSTransport$measuredJoin$1;->label:I

    :goto_0
    move-object v8, v0

    goto :goto_1

    :cond_0
    new-instance v0, Llive/hms/video/transport/HMSTransport$measuredJoin$1;

    invoke-direct {v0, p0, p6}, Llive/hms/video/transport/HMSTransport$measuredJoin$1;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p6, v8, Llive/hms/video/transport/HMSTransport$measuredJoin$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Llive/hms/video/transport/HMSTransport$measuredJoin$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v8, Llive/hms/video/transport/HMSTransport$measuredJoin$1;->L$0:Ljava/lang/Object;

    check-cast p1, Llive/hms/video/transport/HMSTransport;

    :try_start_0
    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p2, v0

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p6, p0, Llive/hms/video/transport/HMSTransport;->performanceMeasurement:Llive/hms/video/sdk/models/PerformanceMeasurement;

    if-eqz p6, :cond_3

    sget-object v1, Llive/hms/video/sdk/models/EVENT_TYPE;->JOIN_RESPONSE_TIME:Llive/hms/video/sdk/models/EVENT_TYPE;

    invoke-virtual {p6, v1}, Llive/hms/video/sdk/models/PerformanceMeasurement;->start$lib_release(Llive/hms/video/sdk/models/EVENT_TYPE;)V

    :cond_3
    :try_start_1
    iget-object v1, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    iget-object v6, p0, Llive/hms/video/transport/HMSTransport;->performanceMeasurement:Llive/hms/video/sdk/models/PerformanceMeasurement;

    iput-object p0, v8, Llive/hms/video/transport/HMSTransport$measuredJoin$1;->L$0:Ljava/lang/Object;

    iput v2, v8, Llive/hms/video/transport/HMSTransport$measuredJoin$1;->label:I

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move v7, p5

    invoke-interface/range {v1 .. v8}, Llive/hms/video/signal/ISignal;->join(Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/connection/models/HMSSessionDescription;Llive/hms/video/sdk/models/IRetryAttemptTracking;ZLq83/d;)Ljava/lang/Object;

    move-result-object p6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p6, v0, :cond_4

    return-object v0

    :cond_4
    move-object p1, p0

    :goto_2
    iget-object p1, p1, Llive/hms/video/transport/HMSTransport;->performanceMeasurement:Llive/hms/video/sdk/models/PerformanceMeasurement;

    if-eqz p1, :cond_5

    sget-object p2, Llive/hms/video/sdk/models/EVENT_TYPE;->JOIN_RESPONSE_TIME:Llive/hms/video/sdk/models/EVENT_TYPE;

    invoke-virtual {p1, p2}, Llive/hms/video/sdk/models/PerformanceMeasurement;->end$lib_release(Llive/hms/video/sdk/models/EVENT_TYPE;)Llive/hms/video/sdk/models/PerformanceMeasurement;

    :cond_5
    return-object p6

    :catchall_1
    move-exception v0

    move-object p2, v0

    move-object p1, p0

    :goto_3
    iget-object p1, p1, Llive/hms/video/transport/HMSTransport;->performanceMeasurement:Llive/hms/video/sdk/models/PerformanceMeasurement;

    if-eqz p1, :cond_6

    sget-object p3, Llive/hms/video/sdk/models/EVENT_TYPE;->JOIN_RESPONSE_TIME:Llive/hms/video/sdk/models/EVENT_TYPE;

    invoke-virtual {p1, p3}, Llive/hms/video/sdk/models/PerformanceMeasurement;->end$lib_release(Llive/hms/video/sdk/models/EVENT_TYPE;)Llive/hms/video/sdk/models/PerformanceMeasurement;

    :cond_6
    throw p2
.end method

.method private final performPublishRenegotiation(Lhms/webrtc/MediaConstraints;Lq83/d;)Ljava/lang/Object;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhms/webrtc/MediaConstraints;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;

    iget v3, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;

    invoke-direct {v2, v1, v0}, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    :goto_0
    iget-object v0, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->label:I

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const-string v10, "publish renegotiation IGNORED as PeerConnection is already closed"

    const-string v11, "publishConnection"

    const-string v12, "HMSTransport"

    if-eqz v4, :cond_5

    if-eq v4, v9, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v3, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$1:Ljava/lang/Object;

    check-cast v3, Llive/hms/video/connection/publish/HMSPublishConnection;

    iget-object v2, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$0:Ljava/lang/Object;

    check-cast v2, Llive/hms/video/transport/models/TransportCallbackTriple;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_7

    :catch_0
    move-exception v0

    goto/16 :goto_8

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v4, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$3:Ljava/lang/Object;

    check-cast v4, Llive/hms/video/connection/publish/HMSPublishConnection;

    iget-object v7, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$2:Ljava/lang/Object;

    check-cast v7, Llive/hms/video/connection/publish/HMSPublishConnection;

    iget-object v8, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$1:Ljava/lang/Object;

    check-cast v8, Llive/hms/video/transport/models/TransportCallbackTriple;

    iget-object v9, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$0:Ljava/lang/Object;

    check-cast v9, Llive/hms/video/transport/HMSTransport;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v14, v8

    goto/16 :goto_4

    :catch_1
    move-exception v0

    move-object v2, v8

    goto/16 :goto_8

    :cond_3
    iget-object v4, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$4:Ljava/lang/Object;

    check-cast v4, Lhms/webrtc/SessionDescription;

    iget-object v8, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$3:Ljava/lang/Object;

    check-cast v8, Llive/hms/video/connection/publish/HMSPublishConnection;

    iget-object v9, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$2:Ljava/lang/Object;

    check-cast v9, Llive/hms/video/connection/publish/HMSPublishConnection;

    iget-object v14, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$1:Ljava/lang/Object;

    check-cast v14, Llive/hms/video/transport/models/TransportCallbackTriple;

    iget-object v15, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$0:Ljava/lang/Object;

    check-cast v15, Llive/hms/video/transport/HMSTransport;

    :try_start_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-object v0, v4

    move-object v4, v8

    goto/16 :goto_2

    :catch_2
    move-exception v0

    move-object v2, v14

    goto/16 :goto_8

    :cond_4
    iget-object v4, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$3:Ljava/lang/Object;

    check-cast v4, Llive/hms/video/connection/publish/HMSPublishConnection;

    iget-object v9, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$2:Ljava/lang/Object;

    check-cast v9, Llive/hms/video/connection/publish/HMSPublishConnection;

    iget-object v14, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$1:Ljava/lang/Object;

    check-cast v14, Llive/hms/video/transport/models/TransportCallbackTriple;

    iget-object v15, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$0:Ljava/lang/Object;

    check-cast v15, Llive/hms/video/transport/HMSTransport;

    :try_start_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_1

    :cond_5
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    const-string v0, "[role=PUBLISH] onRenegotiationNeeded START \u23f0"

    invoke-static {v12, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v1, Llive/hms/video/transport/HMSTransport;->callbacks:Ljava/util/HashMap;

    const-string v4, "publish-renegotiation-callback"

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Llive/hms/video/transport/models/TransportCallbackTriple;

    if-nez v4, :cond_6

    const-string v0, "[role=PUBLISH] onRenegotiationNeeded called without any callback"

    invoke-static {v12, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :try_start_4
    iget-object v0, v1, Llive/hms/video/transport/HMSTransport;->publishConnection:Llive/hms/video/connection/publish/HMSPublishConnection;

    if-eqz v0, :cond_17

    const-string v14, "[role=PUBLISH] onRenegotiationNeeded: initiating renegotiation"

    invoke-static {v12, v14}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v1, v4}, Llive/hms/video/transport/HMSTransport;->isPeerConnectionDisposed(Llive/hms/video/transport/models/TransportCallbackTriple;)Z

    move-result v14

    if-nez v14, :cond_16

    iput-object v1, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$0:Ljava/lang/Object;

    iput-object v4, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$1:Ljava/lang/Object;

    iput-object v0, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$2:Ljava/lang/Object;

    iput-object v0, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$3:Ljava/lang/Object;

    iput v9, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->label:I

    move-object/from16 v9, p1

    invoke-virtual {v0, v9, v2}, Llive/hms/video/connection/HMSConnection;->createOffer(Lhms/webrtc/MediaConstraints;Lq83/d;)Ljava/lang/Object;

    move-result-object v9
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    if-ne v9, v3, :cond_7

    goto/16 :goto_6

    :cond_7
    move-object v15, v1

    move-object v14, v4

    move-object v4, v0

    move-object v0, v9

    move-object v9, v4

    :goto_1
    :try_start_5
    check-cast v0, Lhms/webrtc/SessionDescription;

    invoke-direct {v15, v14}, Llive/hms/video/transport/HMSTransport;->isPeerConnectionDisposed(Llive/hms/video/transport/models/TransportCallbackTriple;)Z

    move-result v16

    if-nez v16, :cond_15

    iput-object v15, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$0:Ljava/lang/Object;

    iput-object v14, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$1:Ljava/lang/Object;

    iput-object v9, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$2:Ljava/lang/Object;

    iput-object v4, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$3:Ljava/lang/Object;

    iput-object v0, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$4:Ljava/lang/Object;

    iput v8, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->label:I

    invoke-virtual {v4, v0, v2}, Llive/hms/video/connection/HMSConnection;->setLocalDescription(Lhms/webrtc/SessionDescription;Lq83/d;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v3, :cond_8

    goto/16 :goto_6

    :cond_8
    :goto_2
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iget-object v6, v15, Llive/hms/video/transport/HMSTransport;->tracksToPublish:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const-string v7, "iterator(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    const-string v13, "next(...)"

    invoke-static {v7, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Llive/hms/video/media/tracks/HMSTrack;

    sget-object v13, Llive/hms/video/sdk/models/HMSNotifications$Track;->Companion:Llive/hms/video/sdk/models/HMSNotifications$Track$Companion;

    invoke-virtual {v13, v7}, Llive/hms/video/sdk/models/HMSNotifications$Track$Companion;->from(Llive/hms/video/media/tracks/HMSTrack;)Llive/hms/video/sdk/models/HMSNotifications$Track;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_9
    invoke-virtual {v4}, Llive/hms/video/connection/HMSConnection;->getSignal()Llive/hms/video/signal/ISignal;

    move-result-object v6

    sget-object v7, Llive/hms/video/connection/models/HMSSessionDescription;->Companion:Llive/hms/video/connection/models/HMSSessionDescription$Companion;

    iget-object v13, v15, Llive/hms/video/transport/HMSTransport;->publishConnection:Llive/hms/video/connection/publish/HMSPublishConnection;

    if-eqz v13, :cond_14

    invoke-virtual {v13}, Llive/hms/video/connection/HMSConnection;->getNodeInfo()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v7, v0, v13}, Llive/hms/video/connection/models/HMSSessionDescription$Companion;->from(Lhms/webrtc/SessionDescription;Ljava/lang/String;)Llive/hms/video/connection/models/HMSSessionDescription;

    move-result-object v0

    iget-object v7, v15, Llive/hms/video/transport/HMSTransport;->publishConnection:Llive/hms/video/connection/publish/HMSPublishConnection;

    if-eqz v7, :cond_13

    invoke-virtual {v7}, Llive/hms/video/connection/HMSConnection;->getNodeInfo()Ljava/lang/String;

    move-result-object v7

    iput-object v15, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$0:Ljava/lang/Object;

    iput-object v14, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$1:Ljava/lang/Object;

    iput-object v9, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$2:Ljava/lang/Object;

    iput-object v4, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$3:Ljava/lang/Object;

    const/4 v13, 0x0

    iput-object v13, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$4:Ljava/lang/Object;

    const/4 v13, 0x3

    iput v13, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->label:I

    invoke-interface {v6, v0, v8, v7, v2}, Llive/hms/video/signal/ISignal;->offer(Llive/hms/video/connection/models/HMSSessionDescription;Ljava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_a

    goto/16 :goto_6

    :cond_a
    move-object v7, v9

    move-object v9, v15

    :goto_4
    check-cast v0, Llive/hms/video/connection/models/HMSSessionDescription;

    invoke-direct {v9, v14}, Llive/hms/video/transport/HMSTransport;->isPeerConnectionDisposed(Llive/hms/video/transport/models/TransportCallbackTriple;)Z

    move-result v6

    if-nez v6, :cond_12

    invoke-virtual {v0}, Llive/hms/video/connection/models/HMSSessionDescription;->getSfuNodeId()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_10

    iget-object v6, v9, Llive/hms/video/transport/HMSTransport;->publishConnection:Llive/hms/video/connection/publish/HMSPublishConnection;

    if-eqz v6, :cond_f

    invoke-virtual {v6}, Llive/hms/video/connection/HMSConnection;->getNodeInfo()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-nez v6, :cond_b

    goto :goto_5

    :cond_b
    invoke-virtual {v0}, Llive/hms/video/connection/models/HMSSessionDescription;->getSfuNodeId()Ljava/lang/String;

    move-result-object v6

    iget-object v8, v9, Llive/hms/video/transport/HMSTransport;->publishConnection:Llive/hms/video/connection/publish/HMSPublishConnection;

    if-eqz v8, :cond_e

    invoke-virtual {v8}, Llive/hms/video/connection/HMSConnection;->getNodeInfo()Ljava/lang/String;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_10

    sget-object v2, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string v3, "SFUMIGRATION"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "[role=PUBLISH] node-mismatch the current peerConnection is old node id :"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v9, Llive/hms/video/transport/HMSTransport;->publishConnection:Llive/hms/video/connection/publish/HMSPublishConnection;

    if-eqz v6, :cond_d

    invoke-virtual {v6}, Llive/hms/video/connection/HMSConnection;->getNodeInfo()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " and the offer is from node id "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Llive/hms/video/connection/models/HMSSessionDescription;->getSfuNodeId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "  \u274c"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v14, :cond_c

    invoke-virtual {v14}, Llive/hms/video/transport/models/TransportCallbackTriple;->getDeferred()Lbc3/s;

    move-result-object v0

    if-eqz v0, :cond_c

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    check-cast v0, Lbc3/t;

    invoke-virtual {v0, v2}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    :cond_c
    return-object v5

    :cond_d
    invoke-static {v11}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/16 v17, 0x0

    throw v17

    :cond_e
    invoke-static {v11}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/16 v17, 0x0

    throw v17

    :cond_f
    invoke-static {v11}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/16 v17, 0x0

    throw v17

    :cond_10
    :goto_5
    invoke-virtual {v0}, Llive/hms/video/connection/models/HMSSessionDescription;->native()Lhms/webrtc/SessionDescription;

    move-result-object v0

    iput-object v14, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$0:Ljava/lang/Object;

    iput-object v7, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$1:Ljava/lang/Object;

    const/4 v13, 0x0

    iput-object v13, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$2:Ljava/lang/Object;

    iput-object v13, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->L$3:Ljava/lang/Object;

    const/4 v6, 0x4

    iput v6, v2, Llive/hms/video/transport/HMSTransport$performPublishRenegotiation$1;->label:I

    invoke-virtual {v4, v0, v2}, Llive/hms/video/connection/HMSConnection;->setRemoteDescription(Lhms/webrtc/SessionDescription;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    if-ne v0, v3, :cond_11

    :goto_6
    return-object v3

    :cond_11
    move-object v2, v14

    :goto_7
    :try_start_6
    const-string v0, "[role=PUBLISH] onRenegotiationNeeded DONE \u2705"

    invoke-static {v12, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v2, :cond_1d

    invoke-virtual {v2}, Llive/hms/video/transport/models/TransportCallbackTriple;->getDeferred()Lbc3/s;

    move-result-object v0

    if-eqz v0, :cond_1d

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    check-cast v0, Lbc3/t;

    invoke-virtual {v0, v3}, Lbc3/t1;->L(Ljava/lang/Object;)Z
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    goto/16 :goto_a

    :cond_12
    :try_start_7
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    invoke-static {v11}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/16 v17, 0x0

    throw v17

    :cond_14
    invoke-static {v11}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/16 v17, 0x0

    throw v17

    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    :catch_3
    move-exception v0

    move-object v2, v4

    goto :goto_8

    :cond_16
    :try_start_8
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    invoke-static {v11}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/16 v17, 0x0

    throw v17
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    :goto_8
    instance-of v3, v0, Llive/hms/video/error/HMSException;

    if-nez v3, :cond_19

    sget-object v13, Llive/hms/video/error/ErrorFactory$GenericErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$GenericErrors;

    sget-object v14, Llive/hms/video/error/ErrorFactory$Action;->PUBLISH:Llive/hms/video/error/ErrorFactory$Action;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_18

    const-string v3, "Renegotiation of local offer with server failed"

    :cond_18
    move-object v15, v3

    const/16 v18, 0x8

    const/16 v19, 0x0

    const/16 v17, 0x0

    move-object/from16 v16, v0

    invoke-static/range {v13 .. v19}, Llive/hms/video/error/ErrorFactory$GenericErrors;->Unknown$default(Llive/hms/video/error/ErrorFactory$GenericErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object v0

    move-object/from16 v3, v16

    goto :goto_9

    :cond_19
    move-object v3, v0

    move-object v0, v3

    check-cast v0, Llive/hms/video/error/HMSException;

    :goto_9
    invoke-virtual {v0}, Llive/hms/video/error/HMSException;->getCode()I

    move-result v4

    const/16 v6, 0x1a5

    if-ne v4, v6, :cond_1b

    if-eqz v2, :cond_1a

    invoke-virtual {v2}, Llive/hms/video/transport/models/TransportCallbackTriple;->getDeferred()Lbc3/s;

    move-result-object v0

    if-eqz v0, :cond_1a

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    check-cast v0, Lbc3/t;

    invoke-virtual {v0, v2}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    :cond_1a
    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string v2, "[role=PUBLISH] onRenegotiationNeeded IGNORED \ud83e\udd3a"

    invoke-virtual {v0, v12, v2, v3}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_a

    :cond_1b
    if-eqz v2, :cond_1c

    invoke-virtual {v2}, Llive/hms/video/transport/models/TransportCallbackTriple;->getDeferred()Lbc3/s;

    move-result-object v2

    if-eqz v2, :cond_1c

    check-cast v2, Lbc3/t;

    invoke-virtual {v2, v0}, Lbc3/t;->completeExceptionally(Ljava/lang/Throwable;)Z

    :cond_1c
    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string v2, "[role=PUBLISH] onRenegotiationNeeded FAILED \u274c"

    invoke-virtual {v0, v12, v2, v3}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1d
    :goto_a
    return-object v5
.end method

.method private final publish(Llive/hms/video/media/tracks/HMSTrack;ZLq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/media/tracks/HMSTrack;",
            "Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p3

    instance-of v1, v0, Llive/hms/video/transport/HMSTransport$publish$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Llive/hms/video/transport/HMSTransport$publish$1;

    iget v2, v1, Llive/hms/video/transport/HMSTransport$publish$1;->label:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Llive/hms/video/transport/HMSTransport$publish$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Llive/hms/video/transport/HMSTransport$publish$1;

    invoke-direct {v1, p0, v0}, Llive/hms/video/transport/HMSTransport$publish$1;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    :goto_0
    iget-object v0, v1, Llive/hms/video/transport/HMSTransport$publish$1;->result:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    .line 1
    iget v3, v1, Llive/hms/video/transport/HMSTransport$publish$1;->label:I

    const/4 v4, 0x2

    const-string v5, "HMSTransport"

    const/4 v6, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v6, :cond_1

    iget-object p1, v1, Llive/hms/video/transport/HMSTransport$publish$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lhms/webrtc/RtpTransceiver;

    iget-object v2, v1, Llive/hms/video/transport/HMSTransport$publish$1;->L$1:Ljava/lang/Object;

    check-cast v2, Llive/hms/video/media/tracks/HMSTrack;

    iget-object v1, v1, Llive/hms/video/transport/HMSTransport$publish$1;->L$0:Ljava/lang/Object;

    check-cast v1, Llive/hms/video/transport/HMSTransport;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    move-object p1, v2

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "publish: track="

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " STARTING"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v8

    .line 4
    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->callbacks:Ljava/util/HashMap;

    new-instance v7, Llive/hms/video/transport/models/TransportCallbackTriple;

    .line 5
    sget-object v9, Llive/hms/video/error/HMSAction;->Publish:Llive/hms/video/error/HMSAction;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    .line 6
    invoke-direct/range {v7 .. v12}, Llive/hms/video/transport/models/TransportCallbackTriple;-><init>(Lbc3/s;Llive/hms/video/error/HMSAction;Ljava/util/HashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v3, "publish-renegotiation-callback"

    invoke-interface {v0, v3, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getType()Llive/hms/video/media/tracks/HMSTrackType;

    move-result-object v0

    sget-object v3, Llive/hms/video/transport/HMSTransport$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v3, v0

    if-eq v0, v6, :cond_4

    if-ne v0, v4, :cond_3

    .line 8
    move-object v0, p1

    check-cast v0, Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->getStream$lib_release()Llive/hms/video/media/streams/HMSLocalStream;

    move-result-object v0

    goto :goto_1

    .line 9
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 10
    :cond_4
    move-object v0, p1

    check-cast v0, Llive/hms/video/media/tracks/HMSLocalAudioTrack;

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSLocalAudioTrack;->getStream$lib_release()Llive/hms/video/media/streams/HMSLocalStream;

    move-result-object v0

    .line 11
    :goto_1
    iget-object v3, p0, Llive/hms/video/transport/HMSTransport;->publishConnection:Llive/hms/video/connection/publish/HMSPublishConnection;

    if-eqz v3, :cond_8

    iget-object v7, p0, Llive/hms/video/transport/HMSTransport;->hmsTrackSettings:Llive/hms/video/media/settings/HMSTrackSettings;

    invoke-virtual {v0, v3, p1, p2, v7}, Llive/hms/video/media/streams/HMSLocalStream;->addTransceiver(Llive/hms/video/connection/publish/HMSPublishConnection;Llive/hms/video/media/tracks/HMSTrack;ZLlive/hms/video/media/settings/HMSTrackSettings;)Lhms/webrtc/RtpTransceiver;

    move-result-object v0

    .line 12
    iput-object p0, v1, Llive/hms/video/transport/HMSTransport$publish$1;->L$0:Ljava/lang/Object;

    iput-object p1, v1, Llive/hms/video/transport/HMSTransport$publish$1;->L$1:Ljava/lang/Object;

    iput-object v0, v1, Llive/hms/video/transport/HMSTransport$publish$1;->L$2:Ljava/lang/Object;

    iput v6, v1, Llive/hms/video/transport/HMSTransport$publish$1;->label:I

    .line 13
    invoke-virtual {v8, v1}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_5

    return-object v2

    :cond_5
    move-object v1, p0

    .line 14
    :goto_2
    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getType()Llive/hms/video/media/tracks/HMSTrackType;

    move-result-object v2

    sget-object v3, Llive/hms/video/transport/HMSTransport$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    if-eq v2, v6, :cond_7

    if-ne v2, v4, :cond_6

    .line 15
    move-object v2, p1

    check-cast v2, Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    .line 16
    iget-object v3, v1, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-virtual {v2, v3}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->setSignal$lib_release(Llive/hms/video/signal/ISignal;)V

    .line 17
    invoke-virtual {v2, v0}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->setTransceiver$lib_release(Lhms/webrtc/RtpTransceiver;)V

    .line 18
    new-instance v0, Llive/hms/video/transport/HMSTransport$publish$2$1;

    iget-object v1, v1, Llive/hms/video/transport/HMSTransport;->observer:Llive/hms/video/transport/ITransportObserver;

    invoke-direct {v0, v1}, Llive/hms/video/transport/HMSTransport$publish$2$1;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->setSendLocalUpdate$lib_release(Lkotlin/jvm/functions/Function1;)V

    goto :goto_3

    .line 19
    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 20
    :cond_7
    move-object v2, p1

    check-cast v2, Llive/hms/video/media/tracks/HMSLocalAudioTrack;

    .line 21
    iget-object v3, v1, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-virtual {v2, v3}, Llive/hms/video/media/tracks/HMSLocalAudioTrack;->setSignal$lib_release(Llive/hms/video/signal/ISignal;)V

    .line 22
    invoke-virtual {v2, v0}, Llive/hms/video/media/tracks/HMSLocalAudioTrack;->setTransceiver$lib_release(Lhms/webrtc/RtpTransceiver;)V

    .line 23
    new-instance v0, Llive/hms/video/transport/HMSTransport$publish$3$1;

    iget-object v1, v1, Llive/hms/video/transport/HMSTransport;->observer:Llive/hms/video/transport/ITransportObserver;

    invoke-direct {v0, v1}, Llive/hms/video/transport/HMSTransport$publish$3$1;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, Llive/hms/video/media/tracks/HMSLocalAudioTrack;->setSendLocalUpdate$lib_release(Lkotlin/jvm/functions/Function1;)V

    .line 24
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "publish: trackId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " DONE"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v5, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    .line 26
    :cond_8
    const-string p1, "publishConnection"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private static final retryScheduler$lambda$1(Llive/hms/video/transport/HMSTransport;Llive/hms/video/transport/models/TransportState;Llive/hms/video/error/HMSException;)Ll83/a0;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Llive/hms/video/transport/HMSTransport;->hasJoined:Z

    if-nez v0, :cond_0

    sget-object v0, Llive/hms/video/transport/models/TransportState;->Joined:Llive/hms/video/transport/models/TransportState;

    if-ne p1, v0, :cond_0

    sget-object p1, Llive/hms/video/transport/models/TransportState;->SignalConnected:Llive/hms/video/transport/models/TransportState;

    invoke-direct {p0, p1}, Llive/hms/video/transport/HMSTransport;->setState(Llive/hms/video/transport/models/TransportState;)V

    iget-object p0, p0, Llive/hms/video/transport/HMSTransport;->observer:Llive/hms/video/transport/ITransportObserver;

    invoke-interface {p0, p1, p2}, Llive/hms/video/transport/ITransportObserver;->onStateChange(Llive/hms/video/transport/models/TransportState;Llive/hms/video/error/HMSException;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Llive/hms/video/transport/HMSTransport;->setState(Llive/hms/video/transport/models/TransportState;)V

    iget-object p0, p0, Llive/hms/video/transport/HMSTransport;->observer:Llive/hms/video/transport/ITransportObserver;

    invoke-interface {p0, p1, p2}, Llive/hms/video/transport/ITransportObserver;->onStateChange(Llive/hms/video/transport/models/TransportState;Llive/hms/video/error/HMSException;)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final scheduleRetry(Llive/hms/video/error/HMSException;Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/error/HMSException;",
            "Llive/hms/video/transport/models/TransportFailureCategory;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Llive/hms/video/transport/HMSTransport$scheduleRetry$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Llive/hms/video/transport/HMSTransport$scheduleRetry$1;

    iget v1, v0, Llive/hms/video/transport/HMSTransport$scheduleRetry$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/transport/HMSTransport$scheduleRetry$1;->label:I

    :goto_0
    move-object v8, v0

    goto :goto_1

    :cond_0
    new-instance v0, Llive/hms/video/transport/HMSTransport$scheduleRetry$1;

    invoke-direct {v0, p0, p4}, Llive/hms/video/transport/HMSTransport$scheduleRetry$1;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p4, v8, Llive/hms/video/transport/HMSTransport$scheduleRetry$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Llive/hms/video/transport/HMSTransport$scheduleRetry$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v8, Llive/hms/video/transport/HMSTransport$scheduleRetry$1;->L$0:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Llive/hms/video/transport/models/TransportFailureCategory;

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p4

    :catch_0
    move-exception v0

    :goto_2
    move-object p1, v0

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    sget-object p4, Llive/hms/video/transport/models/TransportFailureCategory;->JoinAPIFailed:Llive/hms/video/transport/models/TransportFailureCategory;

    if-ne p2, p4, :cond_3

    const-wide/16 v3, 0x1f4

    :goto_3
    move-wide v6, v3

    goto :goto_4

    :cond_3
    const-wide/32 v3, 0xea60

    goto :goto_3

    :goto_4
    iget-object v1, p0, Llive/hms/video/transport/HMSTransport;->retryScheduler:Llive/hms/video/transport/RetryScheduler;

    iput-object p2, v8, Llive/hms/video/transport/HMSTransport$scheduleRetry$1;->L$0:Ljava/lang/Object;

    iput v2, v8, Llive/hms/video/transport/HMSTransport$scheduleRetry$1;->label:I
    :try_end_1
    .catch Llive/hms/video/error/HMSException; {:try_start_1 .. :try_end_1} :catch_2

    const/4 v4, 0x0

    move-object v3, p1

    move-object v2, p2

    move-object v5, p3

    :try_start_2
    invoke-virtual/range {v1 .. v8}, Llive/hms/video/transport/RetryScheduler;->schedule(Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/error/HMSException;ZLkotlin/jvm/functions/Function1;JLq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Llive/hms/video/error/HMSException; {:try_start_2 .. :try_end_2} :catch_1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    return-object p1

    :catch_1
    move-exception v0

    move-object p1, v0

    move-object p2, v2

    goto :goto_5

    :catch_2
    move-exception v0

    move-object v2, p2

    goto :goto_2

    :goto_5
    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Failed while retrying "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " :: "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Llive/hms/video/error/HMSException;->getDescription()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "HMSTransport"

    invoke-static {p3, p2}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    throw p1
.end method

.method private setState(Llive/hms/video/transport/models/TransportState;)V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Transport state change: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Llive/hms/video/transport/HMSTransport;->getState()Llive/hms/video/transport/models/TransportState;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSTransport"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/transport/models/TransportState;->Failed:Llive/hms/video/transport/models/TransportState;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Llive/hms/video/transport/HMSTransport;->getState()Llive/hms/video/transport/models/TransportState;

    move-result-object v1

    if-eq v1, v0, :cond_0

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/transport/HMSTransport$state$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Llive/hms/video/transport/HMSTransport$state$1;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    iput-object p1, p0, Llive/hms/video/transport/HMSTransport;->state:Llive/hms/video/transport/models/TransportState;

    return-void
.end method

.method private final shouldRetry(Llive/hms/video/error/HMSException;)Z
    .locals 3

    const/16 v0, 0x7d3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x3eb

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1}, Llive/hms/video/error/HMSException;->getCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lm83/n;->a0([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Llive/hms/video/error/HMSException;->getCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "5"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Llive/hms/video/error/HMSException;->getCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "429"

    invoke-static {p1, v0, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private final tearDownTransport(Lq83/d;)Ljava/lang/Object;
    .locals 16
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

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    instance-of v2, v0, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;

    iget v3, v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;

    invoke-direct {v2, v1, v0}, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    :goto_0
    iget-object v0, v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;->label:I

    const-string v5, "disposing peer connection factory \u2705"

    const-string v6, "VideoTrack capturer Disposed"

    const-string v7, "VideoTrack capturer stopped"

    const-string v8, "disposing native video track \u2705"

    const-string v9, "disposing audio source \u2705"

    const-string v11, "tearDownTransport: DONE \u2705"

    const/4 v12, 0x0

    const-string v13, "HMSTransport"

    const/4 v14, 0x0

    packed-switch v4, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v3, v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Throwable;

    iget-object v2, v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;->L$0:Ljava/lang/Object;

    check-cast v2, Llive/hms/video/transport/HMSTransport;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_1
    iget-object v2, v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;->L$0:Ljava/lang/Object;

    check-cast v2, Llive/hms/video/transport/HMSTransport;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_2
    iget-object v4, v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;->L$0:Ljava/lang/Object;

    check-cast v4, Llive/hms/video/transport/HMSTransport;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :catch_0
    move-exception v0

    goto/16 :goto_6

    :pswitch_3
    iget-object v4, v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;->L$0:Ljava/lang/Object;

    check-cast v4, Llive/hms/video/transport/HMSTransport;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_3

    :pswitch_4
    iget-object v4, v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;->L$0:Ljava/lang/Object;

    check-cast v4, Llive/hms/video/transport/HMSTransport;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_5
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v1}, Llive/hms/video/transport/HMSTransport;->getState()Llive/hms/video/transport/models/TransportState;

    move-result-object v0

    sget-object v4, Llive/hms/video/transport/models/TransportState;->Disconnected:Llive/hms/video/transport/models/TransportState;

    if-eq v0, v4, :cond_23

    const/4 v0, 0x1

    iput-boolean v0, v1, Llive/hms/video/transport/HMSTransport;->isTearDownInProgress:Z

    invoke-direct {v1}, Llive/hms/video/transport/HMSTransport;->getHmsPeerConnectionFactory()Llive/hms/video/factories/HMSPeerConnectionFactory;

    move-result-object v4

    invoke-virtual {v4}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getFactory()Llive/hms/video/factories/SafeVariable;

    move-result-object v4

    iput-object v1, v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;->L$0:Ljava/lang/Object;

    iput v0, v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;->label:I

    invoke-virtual {v4, v2}, Llive/hms/video/factories/SafeVariable;->get(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_1

    goto/16 :goto_8

    :cond_1
    move-object v4, v1

    :goto_1
    const-string v0, "tearDownTransport: START \u23f0"

    invoke-static {v13, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->retryScheduler:Llive/hms/video/transport/RetryScheduler;

    invoke-virtual {v0}, Llive/hms/video/transport/RetryScheduler;->reset()V

    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->tracksToPublish:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v15, "iterator(...)"

    invoke-static {v0, v15}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    const-string v10, "next(...)"

    invoke-static {v15, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v15, Llive/hms/video/media/tracks/HMSTrack;

    instance-of v10, v15, Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    if-eqz v10, :cond_2

    invoke-virtual {v15}, Llive/hms/video/media/tracks/HMSTrack;->isMute()Z

    move-result v10

    if-nez v10, :cond_2

    check-cast v15, Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    invoke-virtual {v15}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->stopCapturing$lib_release()V

    goto :goto_2

    :cond_3
    iput-object v14, v4, Llive/hms/video/transport/HMSTransport;->joinParameters:Llive/hms/video/transport/models/JoinParameters;

    iput-object v14, v4, Llive/hms/video/transport/HMSTransport;->connectParameters:Llive/hms/video/transport/models/ConnectParameters;

    invoke-virtual {v4}, Llive/hms/video/transport/HMSTransport;->getAnalyticsEventsService()Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v0

    iget-object v10, v4, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-virtual {v0, v10}, Llive/hms/video/events/AnalyticsEventsService;->removeTransport(Llive/hms/video/events/IAnalyticsTransport;)Z

    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->tracksToPublish:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const-string v0, "Clearing all the callbacks"

    invoke-static {v13, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->callbacks:Ljava/util/HashMap;

    const-string v10, "publish-renegotiation-callback"

    invoke-virtual {v0, v10}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/video/transport/models/TransportCallbackTriple;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Llive/hms/video/transport/models/TransportCallbackTriple;->getDeferred()Lbc3/s;

    move-result-object v0

    if-eqz v0, :cond_4

    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    check-cast v0, Lbc3/t;

    invoke-virtual {v0, v10}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    :cond_4
    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->callbacks:Ljava/util/HashMap;

    const-string v10, "subscribe-renegotiation-callback"

    invoke-virtual {v0, v10}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/video/transport/models/TransportCallbackTriple;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Llive/hms/video/transport/models/TransportCallbackTriple;->getDeferred()Lbc3/s;

    move-result-object v0

    if-eqz v0, :cond_5

    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    check-cast v0, Lbc3/t;

    invoke-virtual {v0, v10}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    :cond_5
    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0}, Llive/hms/video/signal/ISignal;->close()V

    :try_start_2
    iput-boolean v12, v4, Llive/hms/video/transport/HMSTransport;->isPeerConnectionReady:Z

    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->publishConnection:Llive/hms/video/connection/publish/HMSPublishConnection;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_8

    const-string v10, "publishConnection"

    if-eqz v0, :cond_7

    :try_start_3
    invoke-virtual {v0}, Llive/hms/video/connection/publish/HMSPublishConnection;->isClose()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->publishConnection:Llive/hms/video/connection/publish/HMSPublishConnection;

    if-eqz v0, :cond_6

    iput-object v4, v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;->L$0:Ljava/lang/Object;

    const/4 v10, 0x2

    iput v10, v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;->label:I

    invoke-virtual {v0, v2}, Llive/hms/video/connection/publish/HMSPublishConnection;->close(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_8

    goto/16 :goto_8

    :cond_6
    invoke-static {v10}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v14

    :cond_7
    invoke-static {v10}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v14

    :cond_8
    :goto_3
    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->subscribeConnection:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v0, :cond_b

    const-string v10, "subscribeConnection"

    if-eqz v0, :cond_a

    :try_start_4
    invoke-virtual {v0}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->isClose()Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->subscribeConnection:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    if-eqz v0, :cond_9

    iput-object v4, v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;->L$0:Ljava/lang/Object;

    const/4 v10, 0x3

    iput v10, v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;->label:I

    invoke-virtual {v0, v2}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->close(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_b

    goto/16 :goto_8

    :cond_9
    invoke-static {v10}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v14

    :cond_a
    invoke-static {v10}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v14

    :cond_b
    :goto_4
    iput-boolean v12, v4, Llive/hms/video/transport/HMSTransport;->isRenegotiationDone:Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    sget-object v0, Llive/hms/video/transport/models/TransportState;->Disconnected:Llive/hms/video/transport/models/TransportState;

    invoke-direct {v4, v0}, Llive/hms/video/transport/HMSTransport;->setState(Llive/hms/video/transport/models/TransportState;)V

    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->observer:Llive/hms/video/transport/ITransportObserver;

    invoke-virtual {v4}, Llive/hms/video/transport/HMSTransport;->getState()Llive/hms/video/transport/models/TransportState;

    move-result-object v10

    const/4 v15, 0x2

    invoke-static {v0, v10, v14, v15, v14}, Llive/hms/video/transport/ITransportObserver$DefaultImpls;->onStateChange$default(Llive/hms/video/transport/ITransportObserver;Llive/hms/video/transport/models/TransportState;Llive/hms/video/error/HMSException;ILjava/lang/Object;)V

    invoke-static {v13, v11}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean v12, v4, Llive/hms/video/transport/HMSTransport;->isTearDownInProgress:Z

    iput-object v14, v4, Llive/hms/video/transport/HMSTransport;->stream:Llive/hms/video/media/streams/HMSLocalStream;

    iput-object v14, v4, Llive/hms/video/transport/HMSTransport;->nativeStream:Lhms/webrtc/MediaStream;

    iput-boolean v12, v4, Llive/hms/video/transport/HMSTransport;->hasJoined:Z

    iput-object v14, v4, Llive/hms/video/transport/HMSTransport;->performanceMeasurement:Llive/hms/video/sdk/models/PerformanceMeasurement;

    iput-object v14, v4, Llive/hms/video/transport/HMSTransport;->lastKnownNetworkType:Ljava/lang/String;

    invoke-static {v13, v9}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/media/streams/HMSStreamFactory;->INSTANCE:Llive/hms/video/media/streams/HMSStreamFactory;

    invoke-virtual {v0}, Llive/hms/video/media/streams/HMSStreamFactory;->getAudioSource()Lhms/webrtc/AudioSource;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lhms/webrtc/MediaSource;->dispose()V

    :cond_c
    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->localAudioTrack:Llive/hms/video/media/tracks/HMSLocalAudioTrack;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSLocalAudioTrack;->setIsDispose()V

    :cond_d
    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->nativeAudioTrack:Lhms/webrtc/AudioTrack;

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Lhms/webrtc/MediaStreamTrack;->dispose()V

    :cond_e
    iput-object v14, v4, Llive/hms/video/transport/HMSTransport;->nativeAudioTrack:Lhms/webrtc/AudioTrack;

    invoke-static {v13, v8}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->localVideoTrack:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->setIsDispose()V

    :cond_f
    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->nativeVideoTrack:Lhms/webrtc/VideoTrack;

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Lhms/webrtc/VideoTrack;->dispose()V

    :cond_10
    iput-object v14, v4, Llive/hms/video/transport/HMSTransport;->nativeVideoTrack:Lhms/webrtc/VideoTrack;

    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->localVideoTrack:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->stopCapturing$lib_release()V

    :cond_11
    invoke-static {v13, v7}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->localVideoTrack:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->dispose$lib_release()V

    :cond_12
    invoke-static {v13, v6}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean v12, v4, Llive/hms/video/transport/HMSTransport;->isHmsPeerConnectionFactoryInitialized:Z

    invoke-static {v13, v5}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v4}, Llive/hms/video/transport/HMSTransport;->getHmsPeerConnectionFactory()Llive/hms/video/factories/HMSPeerConnectionFactory;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getFactory()Llive/hms/video/factories/SafeVariable;

    move-result-object v0

    iput-object v4, v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;->L$0:Ljava/lang/Object;

    const/4 v5, 0x4

    iput v5, v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;->label:I

    invoke-virtual {v0, v2}, Llive/hms/video/factories/SafeVariable;->get(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_13

    goto/16 :goto_8

    :cond_13
    move-object v2, v4

    :goto_5
    check-cast v0, Lhms/webrtc/PeerConnectionFactory;

    invoke-virtual {v0}, Lhms/webrtc/PeerConnectionFactory;->dispose()V

    invoke-direct {v2}, Llive/hms/video/transport/HMSTransport;->getHmsPeerConnectionFactory()Llive/hms/video/factories/HMSPeerConnectionFactory;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getFactory()Llive/hms/video/factories/SafeVariable;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/factories/SafeVariable;->reset()V

    invoke-static {v13, v11}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_a

    :goto_6
    :try_start_5
    sget-object v10, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string v15, "tearDownTransport:: Closing peer connection FAILED \u274c"

    invoke-virtual {v10, v13, v15, v0}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    sget-object v0, Llive/hms/video/transport/models/TransportState;->Disconnected:Llive/hms/video/transport/models/TransportState;

    invoke-direct {v4, v0}, Llive/hms/video/transport/HMSTransport;->setState(Llive/hms/video/transport/models/TransportState;)V

    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->observer:Llive/hms/video/transport/ITransportObserver;

    invoke-virtual {v4}, Llive/hms/video/transport/HMSTransport;->getState()Llive/hms/video/transport/models/TransportState;

    move-result-object v10

    const/4 v15, 0x2

    invoke-static {v0, v10, v14, v15, v14}, Llive/hms/video/transport/ITransportObserver$DefaultImpls;->onStateChange$default(Llive/hms/video/transport/ITransportObserver;Llive/hms/video/transport/models/TransportState;Llive/hms/video/error/HMSException;ILjava/lang/Object;)V

    invoke-static {v13, v11}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean v12, v4, Llive/hms/video/transport/HMSTransport;->isTearDownInProgress:Z

    iput-object v14, v4, Llive/hms/video/transport/HMSTransport;->stream:Llive/hms/video/media/streams/HMSLocalStream;

    iput-object v14, v4, Llive/hms/video/transport/HMSTransport;->nativeStream:Lhms/webrtc/MediaStream;

    iput-boolean v12, v4, Llive/hms/video/transport/HMSTransport;->hasJoined:Z

    iput-object v14, v4, Llive/hms/video/transport/HMSTransport;->performanceMeasurement:Llive/hms/video/sdk/models/PerformanceMeasurement;

    iput-object v14, v4, Llive/hms/video/transport/HMSTransport;->lastKnownNetworkType:Ljava/lang/String;

    invoke-static {v13, v9}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/media/streams/HMSStreamFactory;->INSTANCE:Llive/hms/video/media/streams/HMSStreamFactory;

    invoke-virtual {v0}, Llive/hms/video/media/streams/HMSStreamFactory;->getAudioSource()Lhms/webrtc/AudioSource;

    move-result-object v0

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Lhms/webrtc/MediaSource;->dispose()V

    :cond_14
    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->localAudioTrack:Llive/hms/video/media/tracks/HMSLocalAudioTrack;

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSLocalAudioTrack;->setIsDispose()V

    :cond_15
    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->nativeAudioTrack:Lhms/webrtc/AudioTrack;

    if-eqz v0, :cond_16

    invoke-virtual {v0}, Lhms/webrtc/MediaStreamTrack;->dispose()V

    :cond_16
    iput-object v14, v4, Llive/hms/video/transport/HMSTransport;->nativeAudioTrack:Lhms/webrtc/AudioTrack;

    invoke-static {v13, v8}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->localVideoTrack:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->setIsDispose()V

    :cond_17
    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->nativeVideoTrack:Lhms/webrtc/VideoTrack;

    if-eqz v0, :cond_18

    invoke-virtual {v0}, Lhms/webrtc/VideoTrack;->dispose()V

    :cond_18
    iput-object v14, v4, Llive/hms/video/transport/HMSTransport;->nativeVideoTrack:Lhms/webrtc/VideoTrack;

    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->localVideoTrack:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    if-eqz v0, :cond_19

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->stopCapturing$lib_release()V

    :cond_19
    invoke-static {v13, v7}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v4, Llive/hms/video/transport/HMSTransport;->localVideoTrack:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    if-eqz v0, :cond_1a

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->dispose$lib_release()V

    :cond_1a
    invoke-static {v13, v6}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean v12, v4, Llive/hms/video/transport/HMSTransport;->isHmsPeerConnectionFactoryInitialized:Z

    invoke-static {v13, v5}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v4}, Llive/hms/video/transport/HMSTransport;->getHmsPeerConnectionFactory()Llive/hms/video/factories/HMSPeerConnectionFactory;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getFactory()Llive/hms/video/factories/SafeVariable;

    move-result-object v0

    iput-object v4, v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;->L$0:Ljava/lang/Object;

    const/4 v5, 0x5

    iput v5, v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;->label:I

    invoke-virtual {v0, v2}, Llive/hms/video/factories/SafeVariable;->get(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_13

    goto/16 :goto_8

    :goto_7
    sget-object v10, Llive/hms/video/transport/models/TransportState;->Disconnected:Llive/hms/video/transport/models/TransportState;

    invoke-direct {v4, v10}, Llive/hms/video/transport/HMSTransport;->setState(Llive/hms/video/transport/models/TransportState;)V

    iget-object v10, v4, Llive/hms/video/transport/HMSTransport;->observer:Llive/hms/video/transport/ITransportObserver;

    invoke-virtual {v4}, Llive/hms/video/transport/HMSTransport;->getState()Llive/hms/video/transport/models/TransportState;

    move-result-object v15

    const/4 v12, 0x2

    invoke-static {v10, v15, v14, v12, v14}, Llive/hms/video/transport/ITransportObserver$DefaultImpls;->onStateChange$default(Llive/hms/video/transport/ITransportObserver;Llive/hms/video/transport/models/TransportState;Llive/hms/video/error/HMSException;ILjava/lang/Object;)V

    invoke-static {v13, v11}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v10, 0x0

    iput-boolean v10, v4, Llive/hms/video/transport/HMSTransport;->isTearDownInProgress:Z

    iput-object v14, v4, Llive/hms/video/transport/HMSTransport;->stream:Llive/hms/video/media/streams/HMSLocalStream;

    iput-object v14, v4, Llive/hms/video/transport/HMSTransport;->nativeStream:Lhms/webrtc/MediaStream;

    iput-boolean v10, v4, Llive/hms/video/transport/HMSTransport;->hasJoined:Z

    iput-object v14, v4, Llive/hms/video/transport/HMSTransport;->performanceMeasurement:Llive/hms/video/sdk/models/PerformanceMeasurement;

    iput-object v14, v4, Llive/hms/video/transport/HMSTransport;->lastKnownNetworkType:Ljava/lang/String;

    invoke-static {v13, v9}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v9, Llive/hms/video/media/streams/HMSStreamFactory;->INSTANCE:Llive/hms/video/media/streams/HMSStreamFactory;

    invoke-virtual {v9}, Llive/hms/video/media/streams/HMSStreamFactory;->getAudioSource()Lhms/webrtc/AudioSource;

    move-result-object v9

    if-eqz v9, :cond_1b

    invoke-virtual {v9}, Lhms/webrtc/MediaSource;->dispose()V

    :cond_1b
    iget-object v9, v4, Llive/hms/video/transport/HMSTransport;->localAudioTrack:Llive/hms/video/media/tracks/HMSLocalAudioTrack;

    if-eqz v9, :cond_1c

    invoke-virtual {v9}, Llive/hms/video/media/tracks/HMSLocalAudioTrack;->setIsDispose()V

    :cond_1c
    iget-object v9, v4, Llive/hms/video/transport/HMSTransport;->nativeAudioTrack:Lhms/webrtc/AudioTrack;

    if-eqz v9, :cond_1d

    invoke-virtual {v9}, Lhms/webrtc/MediaStreamTrack;->dispose()V

    :cond_1d
    iput-object v14, v4, Llive/hms/video/transport/HMSTransport;->nativeAudioTrack:Lhms/webrtc/AudioTrack;

    invoke-static {v13, v8}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v8, v4, Llive/hms/video/transport/HMSTransport;->localVideoTrack:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    if-eqz v8, :cond_1e

    invoke-virtual {v8}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->setIsDispose()V

    :cond_1e
    iget-object v8, v4, Llive/hms/video/transport/HMSTransport;->nativeVideoTrack:Lhms/webrtc/VideoTrack;

    if-eqz v8, :cond_1f

    invoke-virtual {v8}, Lhms/webrtc/VideoTrack;->dispose()V

    :cond_1f
    iput-object v14, v4, Llive/hms/video/transport/HMSTransport;->nativeVideoTrack:Lhms/webrtc/VideoTrack;

    iget-object v8, v4, Llive/hms/video/transport/HMSTransport;->localVideoTrack:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    if-eqz v8, :cond_20

    invoke-virtual {v8}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->stopCapturing$lib_release()V

    :cond_20
    invoke-static {v13, v7}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v7, v4, Llive/hms/video/transport/HMSTransport;->localVideoTrack:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    if-eqz v7, :cond_21

    invoke-virtual {v7}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->dispose$lib_release()V

    :cond_21
    invoke-static {v13, v6}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v10, 0x0

    iput-boolean v10, v4, Llive/hms/video/transport/HMSTransport;->isHmsPeerConnectionFactoryInitialized:Z

    invoke-static {v13, v5}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v4}, Llive/hms/video/transport/HMSTransport;->getHmsPeerConnectionFactory()Llive/hms/video/factories/HMSPeerConnectionFactory;

    move-result-object v5

    invoke-virtual {v5}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getFactory()Llive/hms/video/factories/SafeVariable;

    move-result-object v5

    iput-object v4, v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;->L$0:Ljava/lang/Object;

    iput-object v0, v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;->L$1:Ljava/lang/Object;

    const/4 v6, 0x6

    iput v6, v2, Llive/hms/video/transport/HMSTransport$tearDownTransport$1;->label:I

    invoke-virtual {v5, v2}, Llive/hms/video/factories/SafeVariable;->get(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_22

    :goto_8
    return-object v3

    :cond_22
    move-object v3, v0

    move-object v0, v2

    move-object v2, v4

    :goto_9
    check-cast v0, Lhms/webrtc/PeerConnectionFactory;

    invoke-virtual {v0}, Lhms/webrtc/PeerConnectionFactory;->dispose()V

    invoke-direct {v2}, Llive/hms/video/transport/HMSTransport;->getHmsPeerConnectionFactory()Llive/hms/video/factories/HMSPeerConnectionFactory;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getFactory()Llive/hms/video/factories/SafeVariable;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/factories/SafeVariable;->reset()V

    invoke-static {v13, v11}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    throw v3

    :cond_23
    :goto_a
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final unpublish(Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;
    .locals 12
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

    const-string v0, "unpublish: trackId="

    instance-of v1, p2, Llive/hms/video/transport/HMSTransport$unpublish$1;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Llive/hms/video/transport/HMSTransport$unpublish$1;

    iget v2, v1, Llive/hms/video/transport/HMSTransport$unpublish$1;->label:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Llive/hms/video/transport/HMSTransport$unpublish$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Llive/hms/video/transport/HMSTransport$unpublish$1;

    invoke-direct {v1, p0, p2}, Llive/hms/video/transport/HMSTransport$unpublish$1;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    :goto_0
    iget-object p2, v1, Llive/hms/video/transport/HMSTransport$unpublish$1;->result:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    .line 1
    iget v3, v1, Llive/hms/video/transport/HMSTransport$unpublish$1;->label:I

    const-string v4, "HMSTransport"

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v5, :cond_1

    iget-object p1, v1, Llive/hms/video/transport/HMSTransport$unpublish$1;->L$0:Ljava/lang/Object;

    check-cast p1, Llive/hms/video/media/tracks/HMSTrack;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    .line 2
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v3, "unpublish: track="

    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " STARTING"

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v4, p2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v7

    .line 4
    iget-object p2, p0, Llive/hms/video/transport/HMSTransport;->callbacks:Ljava/util/HashMap;

    new-instance v6, Llive/hms/video/transport/models/TransportCallbackTriple;

    .line 5
    sget-object v8, Llive/hms/video/error/HMSAction;->Unpublish:Llive/hms/video/error/HMSAction;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    .line 6
    invoke-direct/range {v6 .. v11}, Llive/hms/video/transport/models/TransportCallbackTriple;-><init>(Lbc3/s;Llive/hms/video/error/HMSAction;Ljava/util/HashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v3, "publish-renegotiation-callback"

    invoke-interface {p2, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getType()Llive/hms/video/media/tracks/HMSTrackType;

    move-result-object p2

    sget-object v3, Llive/hms/video/transport/HMSTransport$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v3, p2

    const/4 v6, 0x2

    if-eq p2, v5, :cond_4

    if-ne p2, v6, :cond_3

    .line 8
    move-object p2, p1

    check-cast p2, Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    invoke-virtual {p2}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->getStream$lib_release()Llive/hms/video/media/streams/HMSLocalStream;

    move-result-object p2

    goto :goto_1

    .line 9
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 10
    :cond_4
    move-object p2, p1

    check-cast p2, Llive/hms/video/media/tracks/HMSLocalAudioTrack;

    invoke-virtual {p2}, Llive/hms/video/media/tracks/HMSLocalAudioTrack;->getStream$lib_release()Llive/hms/video/media/streams/HMSLocalStream;

    move-result-object p2

    .line 11
    :goto_1
    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getType()Llive/hms/video/media/tracks/HMSTrackType;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v3, v3, v8

    const/4 v8, 0x0

    if-eq v3, v5, :cond_6

    if-ne v3, v6, :cond_5

    .line 12
    move-object v3, p1

    check-cast v3, Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    .line 13
    invoke-virtual {v3, v8}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->setSignal$lib_release(Llive/hms/video/signal/ISignal;)V

    .line 14
    invoke-virtual {v3, v8}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->setTransceiver$lib_release(Lhms/webrtc/RtpTransceiver;)V

    .line 15
    invoke-virtual {v3}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->stopCapturing$lib_release()V

    .line 16
    invoke-virtual {v3, v8}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->setSendLocalUpdate$lib_release(Lkotlin/jvm/functions/Function1;)V

    goto :goto_2

    .line 17
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 18
    :cond_6
    move-object v3, p1

    check-cast v3, Llive/hms/video/media/tracks/HMSLocalAudioTrack;

    .line 19
    invoke-virtual {v3, v8}, Llive/hms/video/media/tracks/HMSLocalAudioTrack;->setSignal$lib_release(Llive/hms/video/signal/ISignal;)V

    .line 20
    invoke-virtual {v3, v8}, Llive/hms/video/media/tracks/HMSLocalAudioTrack;->setTransceiver$lib_release(Lhms/webrtc/RtpTransceiver;)V

    .line 21
    invoke-virtual {v3, v8}, Llive/hms/video/media/tracks/HMSLocalAudioTrack;->setSendLocalUpdate$lib_release(Lkotlin/jvm/functions/Function1;)V

    .line 22
    :goto_2
    :try_start_1
    iget-object v3, p0, Llive/hms/video/transport/HMSTransport;->publishConnection:Llive/hms/video/connection/publish/HMSPublishConnection;

    if-eqz v3, :cond_8

    invoke-virtual {p2, v3, p1}, Llive/hms/video/media/streams/HMSLocalStream;->removeSender(Llive/hms/video/connection/publish/HMSPublishConnection;Llive/hms/video/media/tracks/HMSTrack;)V

    .line 23
    iput-object p1, v1, Llive/hms/video/transport/HMSTransport$unpublish$1;->L$0:Ljava/lang/Object;

    iput v5, v1, Llive/hms/video/transport/HMSTransport$unpublish$1;->label:I

    .line 24
    invoke-virtual {v7, v1}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v2, :cond_7

    return-object v2

    .line 25
    :cond_7
    :goto_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " DONE"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    .line 26
    :cond_8
    const-string p1, "publishConnection"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v8
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 27
    :catch_0
    const-string p1, "MediaStreamTrack has already been disposed"

    invoke-static {v4, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public bulkRoleChangeRequest(Ljava/util/List;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;
    .locals 6
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Llive/hms/video/signal/ISignal;->bulkRoleChangeRequest(Ljava/util/List;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public changeMetadata(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->changeMetadata(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public changeName(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->changeName(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public changeSessionMetadata(Ljava/lang/String;Lcom/google/gson/JsonElement;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2, p3}, Llive/hms/video/signal/ISignal;->changeSessionMetadata(Ljava/lang/String;Lcom/google/gson/JsonElement;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public changeTrackState(Llive/hms/video/media/tracks/HMSTrack;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 1
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
    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2, p3, p4}, Llive/hms/video/signal/ISignal;->changeTrackState(Llive/hms/video/media/tracks/HMSTrack;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public changeTrackState(ZLlive/hms/video/media/tracks/HMSTrackType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 7
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

    .line 2
    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Llive/hms/video/signal/ISignal;->changeTrackState(ZLlive/hms/video/media/tracks/HMSTrackType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public connect(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/enums/RetrySchedulerState;Llive/hms/video/sdk/models/PerformanceMeasurement;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 21
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

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v7, p5

    move-object/from16 v0, p7

    instance-of v5, v0, Llive/hms/video/transport/HMSTransport$connect$1;

    if-eqz v5, :cond_0

    move-object v5, v0

    check-cast v5, Llive/hms/video/transport/HMSTransport$connect$1;

    iget v6, v5, Llive/hms/video/transport/HMSTransport$connect$1;->label:I

    const/high16 v8, -0x80000000

    and-int v9, v6, v8

    if-eqz v9, :cond_0

    sub-int/2addr v6, v8

    iput v6, v5, Llive/hms/video/transport/HMSTransport$connect$1;->label:I

    :goto_0
    move-object v6, v5

    goto :goto_1

    :cond_0
    new-instance v5, Llive/hms/video/transport/HMSTransport$connect$1;

    invoke-direct {v5, v1, v0}, Llive/hms/video/transport/HMSTransport$connect$1;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v0, v6, Llive/hms/video/transport/HMSTransport$connect$1;->result:Ljava/lang/Object;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v5, v6, Llive/hms/video/transport/HMSTransport$connect$1;->label:I

    const/4 v9, 0x3

    const/4 v10, 0x2

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eqz v5, :cond_4

    if-eq v5, v11, :cond_3

    if-eq v5, v10, :cond_2

    if-ne v5, v9, :cond_1

    iget-object v2, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    iget-object v3, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$0:Ljava/lang/Object;

    check-cast v3, Llive/hms/video/transport/HMSTransport;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_7

    :catch_0
    move-exception v0

    goto/16 :goto_a

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v2, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    iget-object v3, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$1:Ljava/lang/Object;

    check-cast v3, Llive/hms/video/sdk/models/PerformanceMeasurement;

    iget-object v4, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$0:Ljava/lang/Object;

    check-cast v4, Llive/hms/video/transport/HMSTransport;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Llive/hms/video/error/HMSException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v15, v4

    goto/16 :goto_5

    :catch_1
    move-exception v0

    move-object v3, v4

    goto/16 :goto_a

    :cond_3
    iget-object v2, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$5:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$4:Ljava/lang/Object;

    check-cast v3, Llive/hms/video/sdk/models/PerformanceMeasurement;

    iget-object v4, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v7, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$1:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v11, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$0:Ljava/lang/Object;

    check-cast v11, Llive/hms/video/transport/HMSTransport;

    :try_start_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Llive/hms/video/error/HMSException; {:try_start_2 .. :try_end_2} :catch_2

    move-object v1, v11

    goto :goto_3

    :catch_2
    move-exception v0

    move-object/from16 v19, v2

    move-object/from16 v18, v4

    move-object/from16 v17, v5

    move-object/from16 v16, v7

    move-object v15, v11

    :goto_2
    move-object v7, v3

    goto :goto_4

    :cond_4
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object v7, v1, Llive/hms/video/transport/HMSTransport;->performanceMeasurement:Llive/hms/video/sdk/models/PerformanceMeasurement;

    :try_start_3
    new-instance v0, Llive/hms/video/transport/models/ConnectParameters;

    invoke-direct {v0, v2, v4, v3}, Llive/hms/video/transport/models/ConnectParameters;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, v1, Llive/hms/video/transport/HMSTransport;->connectParameters:Llive/hms/video/transport/models/ConnectParameters;

    iget-object v0, v1, Llive/hms/video/transport/HMSTransport;->retryScheduler:Llive/hms/video/transport/RetryScheduler;

    move-object/from16 v5, p4

    invoke-virtual {v0, v5}, Llive/hms/video/transport/RetryScheduler;->setState$lib_release(Llive/hms/video/sdk/models/enums/RetrySchedulerState;)V

    iput-object v1, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$0:Ljava/lang/Object;

    iput-object v2, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$1:Ljava/lang/Object;

    iput-object v3, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$2:Ljava/lang/Object;

    iput-object v4, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$3:Ljava/lang/Object;

    iput-object v7, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$4:Ljava/lang/Object;

    move-object/from16 v5, p6

    iput-object v5, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$5:Ljava/lang/Object;

    iput v11, v6, Llive/hms/video/transport/HMSTransport$connect$1;->label:I

    invoke-direct/range {v1 .. v6}, Llive/hms/video/transport/HMSTransport;->internalConnect(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catch Llive/hms/video/error/HMSException; {:try_start_3 .. :try_end_3} :catch_4

    if-ne v0, v8, :cond_5

    goto/16 :goto_6

    :cond_5
    move-object/from16 v1, p0

    move-object/from16 v5, p2

    move-object/from16 v4, p3

    move-object/from16 v2, p6

    move-object v3, v7

    move-object/from16 v7, p1

    :goto_3
    :try_start_4
    check-cast v0, Llive/hms/video/signal/init/InitConfig;
    :try_end_4
    .catch Llive/hms/video/error/HMSException; {:try_start_4 .. :try_end_4} :catch_3

    goto/16 :goto_9

    :catch_3
    move-exception v0

    move-object v15, v1

    move-object/from16 v19, v2

    move-object/from16 v18, v4

    move-object/from16 v17, v5

    move-object/from16 v16, v7

    goto :goto_2

    :catch_4
    move-exception v0

    move-object/from16 v15, p0

    move-object/from16 v16, p1

    move-object/from16 v17, p2

    move-object/from16 v18, p3

    move-object/from16 v19, p6

    :goto_4
    new-instance v14, Lkotlin/jvm/internal/g0;

    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    sget-object v1, Llive/hms/video/transport/models/TransportFailureCategory;->SignalDisconnect:Llive/hms/video/transport/models/TransportFailureCategory;

    new-instance v13, Llive/hms/video/transport/HMSTransport$connect$connectConfig$task$1;

    const/16 v20, 0x0

    invoke-direct/range {v13 .. v20}, Llive/hms/video/transport/HMSTransport$connect$connectConfig$task$1;-><init>(Lkotlin/jvm/internal/g0;Llive/hms/video/transport/HMSTransport;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-direct {v15, v0}, Llive/hms/video/transport/HMSTransport;->shouldRetry(Llive/hms/video/error/HMSException;)Z

    move-result v2

    if-eqz v2, :cond_d

    :try_start_5
    iput-object v15, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$0:Ljava/lang/Object;

    iput-object v7, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$1:Ljava/lang/Object;

    iput-object v14, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$2:Ljava/lang/Object;

    iput-object v12, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$3:Ljava/lang/Object;

    iput-object v12, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$4:Ljava/lang/Object;

    iput-object v12, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$5:Ljava/lang/Object;

    iput v10, v6, Llive/hms/video/transport/HMSTransport$connect$1;->label:I

    invoke-direct {v15, v0, v1, v13, v6}, Llive/hms/video/transport/HMSTransport;->scheduleRetry(Llive/hms/video/error/HMSException;Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_6

    goto :goto_6

    :cond_6
    move-object v3, v7

    move-object v2, v14

    :goto_5
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-eqz v3, :cond_8

    sget-object v1, Llive/hms/video/sdk/models/EVENT_TYPE;->CONNECT_RETRIES:Llive/hms/video/sdk/models/EVENT_TYPE;

    int-to-long v4, v0

    iput-object v15, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$0:Ljava/lang/Object;

    iput-object v2, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$1:Ljava/lang/Object;

    iput-object v12, v6, Llive/hms/video/transport/HMSTransport$connect$1;->L$2:Ljava/lang/Object;

    iput v9, v6, Llive/hms/video/transport/HMSTransport$connect$1;->label:I

    invoke-virtual {v3, v1, v4, v5, v6}, Llive/hms/video/sdk/models/PerformanceMeasurement;->numberedValue(Llive/hms/video/sdk/models/EVENT_TYPE;JLq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catch Llive/hms/video/error/HMSException; {:try_start_5 .. :try_end_5} :catch_5

    if-ne v0, v8, :cond_7

    :goto_6
    return-object v8

    :cond_7
    move-object v3, v15

    :goto_7
    move-object v1, v3

    goto :goto_8

    :catch_5
    move-exception v0

    move-object v3, v15

    goto :goto_a

    :cond_8
    move-object v1, v15

    :goto_8
    iget-object v0, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz v0, :cond_9

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Llive/hms/video/signal/init/InitConfig;

    goto :goto_9

    :cond_9
    iget-object v0, v1, Llive/hms/video/transport/HMSTransport;->initConfig:Llive/hms/video/signal/init/InitConfig;

    if-eqz v0, :cond_b

    :goto_9
    iput-object v0, v1, Llive/hms/video/transport/HMSTransport;->initConfig:Llive/hms/video/signal/init/InitConfig;

    iget-object v1, v1, Llive/hms/video/transport/HMSTransport;->connectivityListener:Llive/hms/video/transport/ITransportListener;

    if-eqz v1, :cond_a

    invoke-interface {v1}, Llive/hms/video/transport/ITransportListener;->onSignalConnected()V

    :cond_a
    return-object v0

    :cond_b
    const-string v0, "initConfig"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v12

    :goto_a
    iget-object v1, v3, Llive/hms/video/transport/HMSTransport;->connectivityListener:Llive/hms/video/transport/ITransportListener;

    if-eqz v1, :cond_c

    invoke-interface {v1, v0}, Llive/hms/video/transport/ITransportListener;->onError(Llive/hms/video/error/HMSException;)V

    :cond_c
    throw v0

    :cond_d
    iget-object v1, v15, Llive/hms/video/transport/HMSTransport;->connectivityListener:Llive/hms/video/transport/ITransportListener;

    if-eqz v1, :cond_e

    invoke-interface {v1, v0}, Llive/hms/video/transport/ITransportListener;->onError(Llive/hms/video/error/HMSException;)V

    :cond_e
    throw v0
.end method

.method public createPoll(Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->createPoll(Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createQuestion(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->createQuestion(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createWhiteBoard(Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->createWhiteBoard(Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public deInitLocalStreams()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Llive/hms/video/transport/HMSTransport;->stream:Llive/hms/video/media/streams/HMSLocalStream;

    iput-object v0, p0, Llive/hms/video/transport/HMSTransport;->nativeStream:Lhms/webrtc/MediaStream;

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->tracksToPublish:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public disposePeerConnectionFactory(Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    const/4 p1, 0x0

    iput-boolean p1, p0, Llive/hms/video/transport/HMSTransport;->isHmsPeerConnectionFactoryInitialized:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public endRoom(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2, p3}, Llive/hms/video/signal/ISignal;->endRoom(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public findPeers(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILq83/d;)Ljava/lang/Object;
    .locals 6
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Llive/hms/video/signal/ISignal;->findPeer(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getAnalyticsEventsService()Llive/hms/video/events/AnalyticsEventsService;
    .locals 1

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    return-object v0
.end method

.method public getAudioShareCapturer(Landroid/content/Context;Landroid/content/Intent;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/app/Notification;)Llive/hms/video/media/capturers/HMSCapturer;
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "audioMixingMode"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Llive/hms/video/media/streams/HMSStreamFactory;->INSTANCE:Llive/hms/video/media/streams/HMSStreamFactory;

    invoke-direct {p0}, Llive/hms/video/transport/HMSTransport;->getHmsPeerConnectionFactory()Llive/hms/video/factories/HMSPeerConnectionFactory;

    move-result-object v3

    new-instance v7, Llive/hms/video/transport/HMSTransport$getAudioShareCapturer$1;

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->observer:Llive/hms/video/transport/ITransportObserver;

    invoke-direct {v7, v0}, Llive/hms/video/transport/HMSTransport$getAudioShareCapturer$1;-><init>(Ljava/lang/Object;)V

    move-object v2, p1

    move-object v5, p2

    move-object v4, p3

    move-object v6, p4

    invoke-virtual/range {v1 .. v7}, Llive/hms/video/media/streams/HMSStreamFactory;->makeAudioShareCapturer(Landroid/content/Context;Llive/hms/video/factories/HMSPeerConnectionFactory;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/content/Intent;Landroid/app/Notification;Lc93/a;)Llive/hms/video/media/capturers/HMSCapturer;

    move-result-object p1

    return-object p1
.end method

.method public getAuthTokenByRoomCode(Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/TokenRequestOptions;Llive/hms/video/signal/init/HMSTokenListener;)V
    .locals 2

    const-string v0, "tokenRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsTokenListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/TokenUtils;->INSTANCE:Llive/hms/video/utils/TokenUtils;

    iget-object v1, p0, Llive/hms/video/transport/HMSTransport;->agentOs:Llive/hms/video/utils/HMSAgentOs;

    invoke-virtual {v0, p1, p2, p3, v1}, Llive/hms/video/utils/TokenUtils;->getAuthTokenByRoomCode(Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/TokenRequestOptions;Llive/hms/video/signal/init/HMSTokenListener;Llive/hms/video/utils/HMSAgentOs;)V

    return-void
.end method

.method public final getConnectivityListener()Llive/hms/video/transport/ITransportListener;
    .locals 1

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->connectivityListener:Llive/hms/video/transport/ITransportListener;

    return-object v0
.end method

.method public getLayoutConfigByToken(Ljava/lang/String;Llive/hms/video/signal/init/LayoutRequestOptions;Llive/hms/video/signal/init/HMSLayoutListener;)V
    .locals 2

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsLayoutConfigListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/LayoutUtils;->INSTANCE:Llive/hms/video/utils/LayoutUtils;

    iget-object v1, p0, Llive/hms/video/transport/HMSTransport;->agentOs:Llive/hms/video/utils/HMSAgentOs;

    invoke-virtual {v0, p1, p2, p3, v1}, Llive/hms/video/utils/LayoutUtils;->getLayoutConfigByToken(Ljava/lang/String;Llive/hms/video/signal/init/LayoutRequestOptions;Llive/hms/video/signal/init/HMSLayoutListener;Llive/hms/video/utils/HMSAgentOs;)V

    return-void
.end method

.method public final getLocalAudioTrack()Llive/hms/video/media/tracks/HMSLocalAudioTrack;
    .locals 1

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->localAudioTrack:Llive/hms/video/media/tracks/HMSLocalAudioTrack;

    return-object v0
.end method

.method public getLocalTrackByType(Landroid/content/Context;Llive/hms/video/media/settings/HMSTrackSettings;Llive/hms/video/media/tracks/HMSTrackType;Lq83/d;)Ljava/lang/Object;
    .locals 9
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

    instance-of v0, p4, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;

    iget v1, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;

    invoke-direct {v0, p0, p4}, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide p1, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->J$0:J

    iget-object p3, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$5:Ljava/lang/Object;

    check-cast p3, Llive/hms/video/transport/HMSTransport;

    iget-object v1, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$4:Ljava/lang/Object;

    check-cast v1, Llive/hms/video/media/streams/HMSStreamFactory;

    iget-object v2, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$3:Ljava/lang/Object;

    check-cast v2, Llive/hms/video/media/settings/HMSVideoTrackSettings;

    iget-object v3, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$2:Ljava/lang/Object;

    check-cast v3, Llive/hms/video/media/settings/HMSTrackSettings;

    iget-object v4, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$1:Ljava/lang/Object;

    check-cast v4, Landroid/content/Context;

    iget-object v0, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$0:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/transport/HMSTransport;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_1
    move-object v5, v2

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$3:Ljava/lang/Object;

    check-cast p1, Llive/hms/video/transport/HMSTransport;

    iget-object p2, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$2:Ljava/lang/Object;

    check-cast p2, Llive/hms/video/media/streams/HMSStreamFactory;

    iget-object p3, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$1:Ljava/lang/Object;

    check-cast p3, Llive/hms/video/media/settings/HMSAudioTrackSettings;

    iget-object v0, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$0:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/transport/HMSTransport;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_3
    iget-object p1, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$6:Ljava/lang/Object;

    check-cast p1, Llive/hms/video/transport/HMSTransport;

    iget-object p2, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$5:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object p3, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$4:Ljava/lang/Object;

    check-cast p3, Llive/hms/video/utils/HMSPermissionsChecker;

    iget-object v2, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$3:Ljava/lang/Object;

    check-cast v2, Llive/hms/video/media/tracks/HMSTrackType;

    iget-object v5, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$2:Ljava/lang/Object;

    check-cast v5, Llive/hms/video/media/settings/HMSTrackSettings;

    iget-object v6, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$1:Ljava/lang/Object;

    check-cast v6, Landroid/content/Context;

    iget-object v7, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$0:Ljava/lang/Object;

    check-cast v7, Llive/hms/video/transport/HMSTransport;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v8, p4

    move-object p4, p3

    move-object p3, v2

    move-object v2, v8

    goto :goto_3

    :cond_4
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p4, Llive/hms/video/utils/HMSPermissionsChecker;

    invoke-direct {p4}, Llive/hms/video/utils/HMSPermissionsChecker;-><init>()V

    iget-object v2, p0, Llive/hms/video/transport/HMSTransport;->nativeStream:Lhms/webrtc/MediaStream;

    if-eqz v2, :cond_6

    iget-object v2, p0, Llive/hms/video/transport/HMSTransport;->stream:Llive/hms/video/media/streams/HMSLocalStream;

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    move-object v7, p0

    goto :goto_4

    :cond_6
    :goto_2
    sget-object v2, Llive/hms/video/utils/IdHelper;->INSTANCE:Llive/hms/video/utils/IdHelper;

    invoke-virtual {v2}, Llive/hms/video/utils/IdHelper;->makeStreamId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0}, Llive/hms/video/transport/HMSTransport;->getHmsPeerConnectionFactory()Llive/hms/video/factories/HMSPeerConnectionFactory;

    move-result-object v6

    invoke-virtual {v6}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getFactory()Llive/hms/video/factories/SafeVariable;

    move-result-object v6

    iput-object p0, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$2:Ljava/lang/Object;

    iput-object p3, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$3:Ljava/lang/Object;

    iput-object p4, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$4:Ljava/lang/Object;

    iput-object v2, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$5:Ljava/lang/Object;

    iput-object p0, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$6:Ljava/lang/Object;

    iput v5, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->label:I

    invoke-virtual {v6, v0}, Llive/hms/video/factories/SafeVariable;->get(Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_7

    goto/16 :goto_6

    :cond_7
    move-object v6, v5

    move-object v5, p2

    move-object p2, v2

    move-object v2, v6

    move-object v7, p0

    move-object v6, p1

    move-object p1, v7

    :goto_3
    check-cast v2, Lhms/webrtc/PeerConnectionFactory;

    invoke-virtual {v2, p2}, Lhms/webrtc/PeerConnectionFactory;->createLocalMediaStream(Ljava/lang/String;)Lhms/webrtc/MediaStream;

    move-result-object p2

    iput-object p2, p1, Llive/hms/video/transport/HMSTransport;->nativeStream:Lhms/webrtc/MediaStream;

    new-instance p1, Llive/hms/video/media/streams/HMSLocalStream;

    iget-object p2, v7, Llive/hms/video/transport/HMSTransport;->nativeStream:Lhms/webrtc/MediaStream;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p1, p2}, Llive/hms/video/media/streams/HMSLocalStream;-><init>(Lhms/webrtc/MediaStream;)V

    iput-object p1, v7, Llive/hms/video/transport/HMSTransport;->stream:Llive/hms/video/media/streams/HMSLocalStream;

    move-object p2, v5

    move-object p1, v6

    :goto_4
    sget-object v2, Llive/hms/video/media/tracks/HMSTrackType;->AUDIO:Llive/hms/video/media/tracks/HMSTrackType;

    const/4 v5, 0x0

    if-ne p3, v2, :cond_9

    invoke-virtual {p2}, Llive/hms/video/media/settings/HMSTrackSettings;->getAudioSettings()Llive/hms/video/media/settings/HMSAudioTrackSettings;

    move-result-object p3

    if-eqz p3, :cond_b

    const-string p2, "android.permission.RECORD_AUDIO"

    invoke-virtual {p4, p1, p2}, Llive/hms/video/utils/HMSPermissionsChecker;->checkPermissionAndThrowError(Landroid/content/Context;Ljava/lang/String;)V

    sget-object p2, Llive/hms/video/media/streams/HMSStreamFactory;->INSTANCE:Llive/hms/video/media/streams/HMSStreamFactory;

    invoke-direct {v7}, Llive/hms/video/transport/HMSTransport;->getHmsPeerConnectionFactory()Llive/hms/video/factories/HMSPeerConnectionFactory;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getFactory()Llive/hms/video/factories/SafeVariable;

    move-result-object p1

    iput-object v7, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$0:Ljava/lang/Object;

    iput-object p3, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$2:Ljava/lang/Object;

    iput-object v7, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$3:Ljava/lang/Object;

    iput-object v5, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$4:Ljava/lang/Object;

    iput-object v5, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$5:Ljava/lang/Object;

    iput-object v5, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$6:Ljava/lang/Object;

    iput v4, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->label:I

    invoke-virtual {p1, v0}, Llive/hms/video/factories/SafeVariable;->get(Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_8

    goto :goto_6

    :cond_8
    move-object p1, v7

    move-object v0, p1

    :goto_5
    check-cast p4, Lhms/webrtc/PeerConnectionFactory;

    iget-object v1, v0, Llive/hms/video/transport/HMSTransport;->noiseCancellationStatusChecker:Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;

    invoke-virtual {v1}, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;->enableWebrtcNoiseSuppression()Z

    move-result v1

    invoke-virtual {p2, p4, p3, v1}, Llive/hms/video/media/streams/HMSStreamFactory;->makeLocalAudioTrack(Lhms/webrtc/PeerConnectionFactory;Llive/hms/video/media/settings/HMSAudioTrackSettings;Z)Lhms/webrtc/AudioTrack;

    move-result-object p2

    iput-object p2, p1, Llive/hms/video/transport/HMSTransport;->nativeAudioTrack:Lhms/webrtc/AudioTrack;

    iget-object p1, v0, Llive/hms/video/transport/HMSTransport;->nativeStream:Lhms/webrtc/MediaStream;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p2, v0, Llive/hms/video/transport/HMSTransport;->nativeAudioTrack:Lhms/webrtc/AudioTrack;

    invoke-virtual {p1, p2}, Lhms/webrtc/MediaStream;->addTrack(Lhms/webrtc/AudioTrack;)Z

    new-instance p1, Llive/hms/video/media/tracks/HMSLocalAudioTrack;

    iget-object p2, v0, Llive/hms/video/transport/HMSTransport;->stream:Llive/hms/video/media/streams/HMSLocalStream;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p4, v0, Llive/hms/video/transport/HMSTransport;->nativeAudioTrack:Lhms/webrtc/AudioTrack;

    invoke-static {p4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v1, "regular"

    invoke-direct {p1, p2, p4, p3, v1}, Llive/hms/video/media/tracks/HMSLocalAudioTrack;-><init>(Llive/hms/video/media/streams/HMSLocalStream;Lhms/webrtc/AudioTrack;Llive/hms/video/media/settings/HMSAudioTrackSettings;Ljava/lang/String;)V

    iput-object p1, v0, Llive/hms/video/transport/HMSTransport;->localAudioTrack:Llive/hms/video/media/tracks/HMSLocalAudioTrack;

    return-object p1

    :cond_9
    sget-object v2, Llive/hms/video/media/tracks/HMSTrackType;->VIDEO:Llive/hms/video/media/tracks/HMSTrackType;

    if-ne p3, v2, :cond_b

    invoke-virtual {p2}, Llive/hms/video/media/settings/HMSTrackSettings;->getVideoSettings()Llive/hms/video/media/settings/HMSVideoTrackSettings;

    move-result-object v2

    if-eqz v2, :cond_b

    const-string p3, "android.permission.CAMERA"

    invoke-virtual {p4, p1, p3}, Llive/hms/video/utils/HMSPermissionsChecker;->checkPermissionAndThrowError(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p3

    sget-object v4, Llive/hms/video/media/streams/HMSStreamFactory;->INSTANCE:Llive/hms/video/media/streams/HMSStreamFactory;

    invoke-direct {v7}, Llive/hms/video/transport/HMSTransport;->getHmsPeerConnectionFactory()Llive/hms/video/factories/HMSPeerConnectionFactory;

    move-result-object v6

    invoke-virtual {v6}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getFactory()Llive/hms/video/factories/SafeVariable;

    move-result-object v6

    iput-object v7, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$2:Ljava/lang/Object;

    iput-object v2, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$3:Ljava/lang/Object;

    iput-object v4, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$4:Ljava/lang/Object;

    iput-object v7, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$5:Ljava/lang/Object;

    iput-object v5, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->L$6:Ljava/lang/Object;

    iput-wide p3, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->J$0:J

    iput v3, v0, Llive/hms/video/transport/HMSTransport$getLocalTrackByType$1;->label:I

    invoke-virtual {v6, v0}, Llive/hms/video/factories/SafeVariable;->get(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_a

    :goto_6
    return-object v1

    :cond_a
    move-object v3, p2

    move-object v1, v4

    move-object v4, p1

    move-wide p1, p3

    move-object p4, v0

    move-object p3, v7

    move-object v0, p3

    goto/16 :goto_1

    :goto_7
    check-cast p4, Lhms/webrtc/PeerConnectionFactory;

    invoke-virtual {v3}, Llive/hms/video/media/settings/HMSTrackSettings;->getVideoSettings()Llive/hms/video/media/settings/HMSVideoTrackSettings;

    move-result-object v2

    invoke-virtual {v2}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getDisableAutoResize()Z

    move-result v2

    invoke-virtual {v1, p4, v2}, Llive/hms/video/media/streams/HMSStreamFactory;->makeLocalVideoTrack(Lhms/webrtc/PeerConnectionFactory;Z)Lhms/webrtc/VideoTrack;

    move-result-object p4

    iput-object p4, p3, Llive/hms/video/transport/HMSTransport;->nativeVideoTrack:Lhms/webrtc/VideoTrack;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "time taken to make local video Track : "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v1, p1

    invoke-virtual {p3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Profiling"

    invoke-static {p2, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, v0, Llive/hms/video/transport/HMSTransport;->nativeStream:Lhms/webrtc/MediaStream;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p3, v0, Llive/hms/video/transport/HMSTransport;->nativeVideoTrack:Lhms/webrtc/VideoTrack;

    invoke-virtual {p1, p3}, Lhms/webrtc/MediaStream;->addTrack(Lhms/webrtc/VideoTrack;)Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p3

    sget-object p1, Llive/hms/video/media/streams/HMSStreamFactory;->INSTANCE:Llive/hms/video/media/streams/HMSStreamFactory;

    invoke-virtual {v0}, Llive/hms/video/transport/HMSTransport;->getAnalyticsEventsService()Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v1

    invoke-virtual {p1, v4, v5, v1}, Llive/hms/video/media/streams/HMSStreamFactory;->makeLocalVideoCapturer(Landroid/content/Context;Llive/hms/video/media/settings/HMSVideoTrackSettings;Llive/hms/video/events/AnalyticsEventsService;)Llive/hms/video/media/capturers/HMSCameraCapturer;

    move-result-object v6

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "time taken to create video capturer : "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v1, p3

    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    iget-object v3, v0, Llive/hms/video/transport/HMSTransport;->stream:Llive/hms/video/media/streams/HMSLocalStream;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v4, v0, Llive/hms/video/transport/HMSTransport;->nativeVideoTrack:Lhms/webrtc/VideoTrack;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v7, "regular"

    invoke-direct/range {v2 .. v7}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;-><init>(Llive/hms/video/media/streams/HMSLocalStream;Lhms/webrtc/VideoTrack;Llive/hms/video/media/settings/HMSVideoTrackSettings;Llive/hms/video/media/capturers/HMSCapturer;Ljava/lang/String;)V

    iput-object v2, v0, Llive/hms/video/transport/HMSTransport;->localVideoTrack:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    return-object v2

    :cond_b
    return-object v5
.end method

.method public final getLocalVideoTrack()Llive/hms/video/media/tracks/HMSLocalVideoTrack;
    .locals 1

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->localVideoTrack:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    return-object v0
.end method

.method public final getNativeAudioTrack()Lhms/webrtc/AudioTrack;
    .locals 1

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->nativeAudioTrack:Lhms/webrtc/AudioTrack;

    return-object v0
.end method

.method public final getNativeVideoTrack()Lhms/webrtc/VideoTrack;
    .locals 1

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->nativeVideoTrack:Lhms/webrtc/VideoTrack;

    return-object v0
.end method

.method public final getNodeID()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->nodeID:Ljava/lang/String;

    return-object v0
.end method

.method public getPublishPacketStats(Lq83/d;)Ljava/lang/Object;
    .locals 3
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->publishConnection:Llive/hms/video/connection/publish/HMSPublishConnection;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    const-string v2, "publishConnection"

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Llive/hms/video/connection/publish/HMSPublishConnection;->isClose()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->publishConnection:Llive/hms/video/connection/publish/HMSPublishConnection;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Llive/hms/video/connection/HMSConnection;->getStats(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    check-cast p1, Lhms/webrtc/RTCStatsReport;

    return-object p1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    return-object v1
.end method

.method public getScreenShareTrack(Landroid/content/Context;Llive/hms/video/media/settings/HMSTrackSettings;Landroid/content/Intent;Landroid/app/Notification;Lq83/d;)Ljava/lang/Object;
    .locals 12
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

    move-object/from16 v0, p5

    instance-of v1, v0, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;

    iget v2, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->label:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;

    invoke-direct {v1, p0, v0}, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    :goto_0
    iget-object v0, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->result:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->label:I

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v3, :cond_4

    if-eq v3, v6, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v2, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$7:Ljava/lang/Object;

    check-cast v2, Llive/hms/video/media/streams/HMSLocalStream;

    iget-object v3, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$6:Ljava/lang/Object;

    check-cast v3, Lhms/webrtc/VideoTrack;

    iget-object v4, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$5:Ljava/lang/Object;

    check-cast v4, Landroid/content/Context;

    iget-object v5, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$4:Ljava/lang/Object;

    check-cast v5, Llive/hms/video/media/streams/HMSStreamFactory;

    iget-object v6, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$3:Ljava/lang/Object;

    check-cast v6, Llive/hms/video/media/settings/HMSVideoTrackSettings;

    iget-object v7, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$2:Ljava/lang/Object;

    check-cast v7, Landroid/app/Notification;

    iget-object v8, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$1:Ljava/lang/Object;

    check-cast v8, Landroid/content/Intent;

    iget-object v1, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$0:Ljava/lang/Object;

    check-cast v1, Llive/hms/video/transport/HMSTransport;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v6

    move-object v6, v4

    move-object v4, v3

    move-object v3, v2

    :goto_1
    move-object v10, v7

    goto/16 :goto_5

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v3, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$6:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v5, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$5:Ljava/lang/Object;

    check-cast v5, Lhms/webrtc/VideoTrack;

    iget-object v6, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$4:Ljava/lang/Object;

    check-cast v6, Llive/hms/video/media/settings/HMSVideoTrackSettings;

    iget-object v7, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$3:Ljava/lang/Object;

    check-cast v7, Landroid/app/Notification;

    iget-object v8, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$2:Ljava/lang/Object;

    check-cast v8, Landroid/content/Intent;

    iget-object v9, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$1:Ljava/lang/Object;

    check-cast v9, Landroid/content/Context;

    iget-object v10, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$0:Ljava/lang/Object;

    check-cast v10, Llive/hms/video/transport/HMSTransport;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    iget-object v3, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$5:Ljava/lang/Object;

    check-cast v3, Llive/hms/video/media/streams/HMSStreamFactory;

    iget-object v7, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$4:Ljava/lang/Object;

    check-cast v7, Llive/hms/video/media/settings/HMSVideoTrackSettings;

    iget-object v8, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$3:Ljava/lang/Object;

    check-cast v8, Landroid/app/Notification;

    iget-object v9, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$2:Ljava/lang/Object;

    check-cast v9, Landroid/content/Intent;

    iget-object v10, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$1:Ljava/lang/Object;

    check-cast v10, Landroid/content/Context;

    iget-object v11, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$0:Ljava/lang/Object;

    check-cast v11, Llive/hms/video/transport/HMSTransport;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p2}, Llive/hms/video/media/settings/HMSTrackSettings;->getVideoSettings()Llive/hms/video/media/settings/HMSVideoTrackSettings;

    move-result-object v7

    if-eqz v7, :cond_8

    sget-object v3, Llive/hms/video/media/streams/HMSStreamFactory;->INSTANCE:Llive/hms/video/media/streams/HMSStreamFactory;

    invoke-direct {p0}, Llive/hms/video/transport/HMSTransport;->getHmsPeerConnectionFactory()Llive/hms/video/factories/HMSPeerConnectionFactory;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getFactory()Llive/hms/video/factories/SafeVariable;

    move-result-object v0

    iput-object p0, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$0:Ljava/lang/Object;

    iput-object p1, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$1:Ljava/lang/Object;

    move-object v9, p3

    iput-object v9, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$2:Ljava/lang/Object;

    move-object/from16 v10, p4

    iput-object v10, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$3:Ljava/lang/Object;

    iput-object v7, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$4:Ljava/lang/Object;

    iput-object v3, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$5:Ljava/lang/Object;

    iput v6, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->label:I

    invoke-virtual {v0, v1}, Llive/hms/video/factories/SafeVariable;->get(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_5

    goto/16 :goto_4

    :cond_5
    move-object v11, p0

    move-object v8, v10

    move-object v10, p1

    :goto_2
    check-cast v0, Lhms/webrtc/PeerConnectionFactory;

    invoke-virtual {v3, v0, v6}, Llive/hms/video/media/streams/HMSStreamFactory;->makeLocalVideoTrack(Lhms/webrtc/PeerConnectionFactory;Z)Lhms/webrtc/VideoTrack;

    move-result-object v0

    sget-object v3, Llive/hms/video/utils/IdHelper;->INSTANCE:Llive/hms/video/utils/IdHelper;

    invoke-virtual {v3}, Llive/hms/video/utils/IdHelper;->makeStreamId()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v11}, Llive/hms/video/transport/HMSTransport;->getHmsPeerConnectionFactory()Llive/hms/video/factories/HMSPeerConnectionFactory;

    move-result-object v6

    invoke-virtual {v6}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getFactory()Llive/hms/video/factories/SafeVariable;

    move-result-object v6

    iput-object v11, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$0:Ljava/lang/Object;

    iput-object v10, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$1:Ljava/lang/Object;

    iput-object v9, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$2:Ljava/lang/Object;

    iput-object v8, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$3:Ljava/lang/Object;

    iput-object v7, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$4:Ljava/lang/Object;

    iput-object v0, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$5:Ljava/lang/Object;

    iput-object v3, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$6:Ljava/lang/Object;

    iput v5, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->label:I

    invoke-virtual {v6, v1}, Llive/hms/video/factories/SafeVariable;->get(Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_6

    goto :goto_4

    :cond_6
    move-object v6, v5

    move-object v5, v0

    move-object v0, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    :goto_3
    check-cast v0, Lhms/webrtc/PeerConnectionFactory;

    invoke-virtual {v0, v3}, Lhms/webrtc/PeerConnectionFactory;->createLocalMediaStream(Ljava/lang/String;)Lhms/webrtc/MediaStream;

    move-result-object v0

    new-instance v3, Llive/hms/video/media/streams/HMSLocalStream;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v3, v0}, Llive/hms/video/media/streams/HMSLocalStream;-><init>(Lhms/webrtc/MediaStream;)V

    sget-object v0, Llive/hms/video/media/streams/HMSStreamFactory;->INSTANCE:Llive/hms/video/media/streams/HMSStreamFactory;

    invoke-direct {v10}, Llive/hms/video/transport/HMSTransport;->getHmsPeerConnectionFactory()Llive/hms/video/factories/HMSPeerConnectionFactory;

    move-result-object v11

    invoke-virtual {v11}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getFactory()Llive/hms/video/factories/SafeVariable;

    move-result-object v11

    iput-object v10, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$0:Ljava/lang/Object;

    iput-object v8, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$1:Ljava/lang/Object;

    iput-object v7, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$2:Ljava/lang/Object;

    iput-object v6, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$3:Ljava/lang/Object;

    iput-object v0, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$4:Ljava/lang/Object;

    iput-object v9, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$5:Ljava/lang/Object;

    iput-object v5, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$6:Ljava/lang/Object;

    iput-object v3, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->L$7:Ljava/lang/Object;

    iput v4, v1, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$1;->label:I

    invoke-virtual {v11, v1}, Llive/hms/video/factories/SafeVariable;->get(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_7

    :goto_4
    return-object v2

    :cond_7
    move-object v4, v9

    move-object v9, v6

    move-object v6, v4

    move-object v4, v5

    move-object v5, v0

    move-object v0, v1

    move-object v1, v10

    goto/16 :goto_1

    :goto_5
    move-object v7, v0

    check-cast v7, Lhms/webrtc/PeerConnectionFactory;

    new-instance v11, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$2$hmsScreenCapturer$1;

    iget-object v0, v1, Llive/hms/video/transport/HMSTransport;->observer:Llive/hms/video/transport/ITransportObserver;

    invoke-direct {v11, v0}, Llive/hms/video/transport/HMSTransport$getScreenShareTrack$2$hmsScreenCapturer$1;-><init>(Ljava/lang/Object;)V

    invoke-virtual/range {v5 .. v11}, Llive/hms/video/media/streams/HMSStreamFactory;->makeScreenShareCapturer(Landroid/content/Context;Lhms/webrtc/PeerConnectionFactory;Landroid/content/Intent;Llive/hms/video/media/settings/HMSVideoTrackSettings;Landroid/app/Notification;Lc93/a;)Llive/hms/video/media/capturers/HMSCapturer;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type live.hms.video.media.capturers.HMSScreenCapturer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v0

    check-cast v6, Llive/hms/video/media/capturers/HMSScreenCapturer;

    new-instance v2, Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    const-string v7, "screen"

    move-object v5, v9

    invoke-direct/range {v2 .. v7}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;-><init>(Llive/hms/video/media/streams/HMSLocalStream;Lhms/webrtc/VideoTrack;Llive/hms/video/media/settings/HMSVideoTrackSettings;Llive/hms/video/media/capturers/HMSCapturer;Ljava/lang/String;)V

    return-object v2

    :cond_8
    const-string v0, "HMSTransport"

    const-string v1, "getScreenShareTrack :: Video Settings of HMSTrackSettings is null"

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getServerSoftwareEchoCancellationEnabled()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/transport/HMSTransport;->serverSoftwareEchoCancellationEnabled:Z

    return v0
.end method

.method public getSessionMetadata(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->getSessionMetadata(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getState()Llive/hms/video/transport/models/TransportState;
    .locals 1

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->state:Llive/hms/video/transport/models/TransportState;

    return-object v0
.end method

.method public getSubscribePacketStats(Lq83/d;)Ljava/lang/Object;
    .locals 3
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->subscribeConnection:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    const-string v2, "subscribeConnection"

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->isClose()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->subscribeConnection:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Llive/hms/video/connection/HMSConnection;->getStats(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    check-cast p1, Lhms/webrtc/RTCStatsReport;

    return-object p1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    return-object v1
.end method

.method public getTimeAfterJoinResponse()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/transport/HMSTransport;->timeAfterJoinResponse:J

    return-wide v0
.end method

.method public getTimeAfterWSOpen()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/transport/HMSTransport;->timeAfterWSOpen:J

    return-wide v0
.end method

.method public getWhiteBoard(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->getWhiteBoard(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public groupAdd(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2, p3}, Llive/hms/video/signal/ISignal;->groupAdd(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public groupJoin(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->groupJoin(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public groupLeave(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->groupLeave(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public groupRemove(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2, p3}, Llive/hms/video/signal/ISignal;->groupRemove(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public initHmsPeerConnectionFactory(ZZ)V
    .locals 2

    iget-boolean v0, p0, Llive/hms/video/transport/HMSTransport;->isHmsPeerConnectionFactoryInitialized:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Llive/hms/video/transport/HMSTransport;->getHmsPeerConnectionFactory()Llive/hms/video/factories/HMSPeerConnectionFactory;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/transport/HMSTransport;->hmsTrackSettings:Llive/hms/video/media/settings/HMSTrackSettings;

    invoke-virtual {v0, v1, p1, p2}, Llive/hms/video/factories/HMSPeerConnectionFactory;->initialize(Llive/hms/video/media/settings/HMSTrackSettings;ZZ)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Llive/hms/video/transport/HMSTransport;->isHmsPeerConnectionFactoryInitialized:Z

    :cond_0
    return-void
.end method

.method public initPeerConnections(Lq83/d;)Ljava/lang/Object;
    .locals 12
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

    instance-of v0, p1, Llive/hms/video/transport/HMSTransport$initPeerConnections$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Llive/hms/video/transport/HMSTransport$initPeerConnections$1;

    iget v1, v0, Llive/hms/video/transport/HMSTransport$initPeerConnections$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/transport/HMSTransport$initPeerConnections$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Llive/hms/video/transport/HMSTransport$initPeerConnections$1;

    invoke-direct {v0, p0, p1}, Llive/hms/video/transport/HMSTransport$initPeerConnections$1;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Llive/hms/video/transport/HMSTransport$initPeerConnections$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llive/hms/video/transport/HMSTransport$initPeerConnections$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Llive/hms/video/transport/HMSTransport$initPeerConnections$1;->L$2:Ljava/lang/Object;

    check-cast v1, Llive/hms/video/transport/HMSTransport;

    iget-object v2, v0, Llive/hms/video/transport/HMSTransport$initPeerConnections$1;->L$1:Ljava/lang/Object;

    check-cast v2, Llive/hms/video/connection/models/HMSConfiguration;

    iget-object v0, v0, Llive/hms/video/transport/HMSTransport$initPeerConnections$1;->L$0:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/transport/HMSTransport;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v2

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Llive/hms/video/transport/HMSTransport$initPeerConnections$1;->L$2:Ljava/lang/Object;

    check-cast v2, Llive/hms/video/transport/HMSTransport;

    iget-object v6, v0, Llive/hms/video/transport/HMSTransport$initPeerConnections$1;->L$1:Ljava/lang/Object;

    check-cast v6, Llive/hms/video/connection/models/HMSConfiguration;

    iget-object v7, v0, Llive/hms/video/transport/HMSTransport$initPeerConnections$1;->L$0:Ljava/lang/Object;

    check-cast v7, Llive/hms/video/transport/HMSTransport;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Llive/hms/video/connection/models/HMSConfiguration;->Companion:Llive/hms/video/connection/models/HMSConfiguration$Companion;

    iget-object v2, p0, Llive/hms/video/transport/HMSTransport;->initConfig:Llive/hms/video/signal/init/InitConfig;

    if-eqz v2, :cond_9

    invoke-virtual {p1, v2}, Llive/hms/video/connection/models/HMSConfiguration$Companion;->from(Llive/hms/video/signal/init/InitConfig;)Llive/hms/video/connection/models/HMSConfiguration;

    move-result-object p1

    iget-object v2, p0, Llive/hms/video/transport/HMSTransport;->joinParameters:Llive/hms/video/transport/models/JoinParameters;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Llive/hms/video/transport/models/JoinParameters;->getIceGatheringOnAnyAddressPorts()Z

    move-result v2

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {p1, v2}, Llive/hms/video/connection/models/HMSConfiguration;->enableIceGatheringOnAnyAddressPorts(Z)V

    invoke-direct {p0}, Llive/hms/video/transport/HMSTransport;->getHmsPeerConnectionFactory()Llive/hms/video/factories/HMSPeerConnectionFactory;

    move-result-object v2

    invoke-virtual {v2}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getFactory()Llive/hms/video/factories/SafeVariable;

    move-result-object v2

    iput-object p0, v0, Llive/hms/video/transport/HMSTransport$initPeerConnections$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Llive/hms/video/transport/HMSTransport$initPeerConnections$1;->L$1:Ljava/lang/Object;

    iput-object p0, v0, Llive/hms/video/transport/HMSTransport$initPeerConnections$1;->L$2:Ljava/lang/Object;

    iput v5, v0, Llive/hms/video/transport/HMSTransport$initPeerConnections$1;->label:I

    invoke-virtual {v2, v0}, Llive/hms/video/factories/SafeVariable;->get(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    goto :goto_3

    :cond_5
    move-object v7, p0

    move-object v6, p1

    move-object p1, v2

    move-object v2, v7

    :goto_2
    check-cast p1, Lhms/webrtc/PeerConnectionFactory;

    iget-object v8, v7, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    iget-object v9, v7, Llive/hms/video/transport/HMSTransport;->publishConnectionObserver:Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1;

    new-instance v10, Llive/hms/video/connection/publish/HMSPublishConnection;

    invoke-direct {v10, p1, v8, v6, v9}, Llive/hms/video/connection/publish/HMSPublishConnection;-><init>(Lhms/webrtc/PeerConnectionFactory;Llive/hms/video/signal/ISignal;Lhms/webrtc/PeerConnection$RTCConfiguration;Llive/hms/video/connection/publish/IPublishConnectionObserver;)V

    iput-object v10, v2, Llive/hms/video/transport/HMSTransport;->publishConnection:Llive/hms/video/connection/publish/HMSPublishConnection;

    invoke-direct {v7}, Llive/hms/video/transport/HMSTransport;->getHmsPeerConnectionFactory()Llive/hms/video/factories/HMSPeerConnectionFactory;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getFactory()Llive/hms/video/factories/SafeVariable;

    move-result-object p1

    iput-object v7, v0, Llive/hms/video/transport/HMSTransport$initPeerConnections$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Llive/hms/video/transport/HMSTransport$initPeerConnections$1;->L$1:Ljava/lang/Object;

    iput-object v7, v0, Llive/hms/video/transport/HMSTransport$initPeerConnections$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Llive/hms/video/transport/HMSTransport$initPeerConnections$1;->label:I

    invoke-virtual {p1, v0}, Llive/hms/video/factories/SafeVariable;->get(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_3
    return-object v1

    :cond_6
    move-object v9, v6

    move-object v0, v7

    move-object v1, v0

    :goto_4
    move-object v7, p1

    check-cast v7, Lhms/webrtc/PeerConnectionFactory;

    iget-object v8, v0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    iget-object v10, v0, Llive/hms/video/transport/HMSTransport;->subscribeConnectionObserver:Llive/hms/video/transport/HMSTransport$subscribeConnectionObserver$1;

    iget-object v11, v0, Llive/hms/video/transport/HMSTransport;->trackFactory:Llive/hms/video/connection/subscribe/RemoteTrackFactory;

    new-instance v6, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    invoke-direct/range {v6 .. v11}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;-><init>(Lhms/webrtc/PeerConnectionFactory;Llive/hms/video/signal/ISignal;Lhms/webrtc/PeerConnection$RTCConfiguration;Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;Llive/hms/video/connection/subscribe/RemoteTrackFactory;)V

    iput-object v6, v1, Llive/hms/video/transport/HMSTransport;->subscribeConnection:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iget-object p1, v0, Llive/hms/video/transport/HMSTransport;->publishConnection:Llive/hms/video/connection/publish/HMSPublishConnection;

    if-eqz p1, :cond_8

    iget-object v1, v0, Llive/hms/video/transport/HMSTransport;->nodeID:Ljava/lang/String;

    invoke-virtual {p1, v1}, Llive/hms/video/connection/HMSConnection;->setNodeInfo(Ljava/lang/String;)V

    iget-object p1, v0, Llive/hms/video/transport/HMSTransport;->subscribeConnection:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    if-eqz p1, :cond_7

    iget-object v1, v0, Llive/hms/video/transport/HMSTransport;->nodeID:Ljava/lang/String;

    invoke-virtual {p1, v1}, Llive/hms/video/connection/HMSConnection;->setNodeInfo(Ljava/lang/String;)V

    iput-boolean v5, v0, Llive/hms/video/transport/HMSTransport;->isPeerConnectionReady:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_7
    const-string p1, "subscribeConnection"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_8
    const-string p1, "publishConnection"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_9
    const-string p1, "initConfig"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4
.end method

.method public initializePeerConnectionFactoryIfNeeded(Llive/hms/video/media/settings/HMSTrackSettings;ZZ)V
    .locals 1

    const-string v0, "hmsTrackSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p3}, Llive/hms/video/transport/HMSTransport;->initHmsPeerConnectionFactory(ZZ)V

    return-void
.end method

.method public final isSimulcastEnabled()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/transport/HMSTransport;->isSimulcastEnabled:Z

    return v0
.end method

.method public isSocketConnectionOpen()Z
    .locals 1

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0}, Llive/hms/video/signal/ISignal;->isConnected()Z

    move-result v0

    return v0
.end method

.method public join(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLq83/d;)Ljava/lang/Object;
    .locals 25
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

    move-object/from16 v1, p0

    move-object/from16 v0, p10

    instance-of v2, v0, Llive/hms/video/transport/HMSTransport$join$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Llive/hms/video/transport/HMSTransport$join$1;

    iget v3, v2, Llive/hms/video/transport/HMSTransport$join$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Llive/hms/video/transport/HMSTransport$join$1;->label:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Llive/hms/video/transport/HMSTransport$join$1;

    invoke-direct {v2, v1, v0}, Llive/hms/video/transport/HMSTransport$join$1;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v0, v8, Llive/hms/video/transport/HMSTransport$join$1;->result:Ljava/lang/Object;

    sget-object v11, Lr83/a;->w:Lr83/a;

    iget v2, v8, Llive/hms/video/transport/HMSTransport$join$1;->label:I

    const-string v13, "join: failed \u274c [token="

    const/4 v14, 0x1

    const/4 v15, 0x2

    const-string v3, "HMSTransport"

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v14, :cond_2

    if-ne v2, v15, :cond_1

    iget-object v2, v8, Llive/hms/video/transport/HMSTransport$join$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v5, v8, Llive/hms/video/transport/HMSTransport$join$1;->L$0:Ljava/lang/Object;

    check-cast v5, Llive/hms/video/transport/HMSTransport;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v24, v3

    move-object v15, v4

    goto/16 :goto_6

    :catch_0
    move-exception v0

    move-object v1, v3

    goto/16 :goto_9

    :catch_1
    move-exception v0

    move-object v1, v3

    goto/16 :goto_a

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-boolean v2, v8, Llive/hms/video/transport/HMSTransport$join$1;->Z$2:Z

    iget-boolean v5, v8, Llive/hms/video/transport/HMSTransport$join$1;->Z$1:Z

    iget-boolean v6, v8, Llive/hms/video/transport/HMSTransport$join$1;->Z$0:Z

    iget-object v7, v8, Llive/hms/video/transport/HMSTransport$join$1;->L$5:Ljava/lang/Object;

    check-cast v7, Llive/hms/video/transport/HMSTransport;

    iget-object v9, v8, Llive/hms/video/transport/HMSTransport$join$1;->L$4:Ljava/lang/Object;

    check-cast v9, Llive/hms/video/transport/HMSTransport;

    iget-object v9, v8, Llive/hms/video/transport/HMSTransport$join$1;->L$3:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v10, v8, Llive/hms/video/transport/HMSTransport$join$1;->L$2:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v12, v8, Llive/hms/video/transport/HMSTransport$join$1;->L$1:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    iget-object v14, v8, Llive/hms/video/transport/HMSTransport$join$1;->L$0:Ljava/lang/Object;

    check-cast v14, Llive/hms/video/transport/HMSTransport;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Llive/hms/video/error/HMSException; {:try_start_1 .. :try_end_1} :catch_2

    move-object/from16 v24, v3

    move-object v15, v4

    move-object v1, v7

    goto/16 :goto_3

    :catch_2
    move-exception v0

    move-object v1, v3

    goto/16 :goto_d

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v1}, Llive/hms/video/transport/HMSTransport;->getState()Llive/hms/video/transport/models/TransportState;

    move-result-object v0

    sget-object v2, Llive/hms/video/transport/models/TransportState;->Failed:Llive/hms/video/transport/models/TransportState;

    if-ne v0, v2, :cond_4

    sget-object v0, Llive/hms/video/transport/models/TransportState;->Disconnected:Llive/hms/video/transport/models/TransportState;

    invoke-direct {v1, v0}, Llive/hms/video/transport/HMSTransport;->setState(Llive/hms/video/transport/models/TransportState;)V

    :cond_4
    iget-object v0, v1, Llive/hms/video/transport/HMSTransport;->retryScheduler:Llive/hms/video/transport/RetryScheduler;

    sget-object v2, Llive/hms/video/sdk/models/enums/RetrySchedulerState;->JOINED:Llive/hms/video/sdk/models/enums/RetrySchedulerState;

    invoke-virtual {v0, v2}, Llive/hms/video/transport/RetryScheduler;->setState$lib_release(Llive/hms/video/sdk/models/enums/RetrySchedulerState;)V

    sget-object v0, Llive/hms/video/transport/models/TransportState;->Disconnected:Llive/hms/video/transport/models/TransportState;

    sget-object v2, Llive/hms/video/transport/models/TransportState;->Reconnecting:Llive/hms/video/transport/models/TransportState;

    sget-object v5, Llive/hms/video/transport/models/TransportState;->SignalConnected:Llive/hms/video/transport/models/TransportState;

    filled-new-array {v0, v2, v5}, [Llive/hms/video/transport/models/TransportState;

    move-result-object v2

    invoke-virtual {v1}, Llive/hms/video/transport/HMSTransport;->getState()Llive/hms/video/transport/models/TransportState;

    move-result-object v5

    invoke-static {v2, v5}, Lm83/n;->a0([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual {v1}, Llive/hms/video/transport/HMSTransport;->getState()Llive/hms/video/transport/models/TransportState;

    move-result-object v2

    if-ne v2, v0, :cond_5

    sget-object v0, Llive/hms/video/transport/models/TransportState;->Connecting:Llive/hms/video/transport/models/TransportState;

    invoke-direct {v1, v0}, Llive/hms/video/transport/HMSTransport;->setState(Llive/hms/video/transport/models/TransportState;)V

    iget-object v0, v1, Llive/hms/video/transport/HMSTransport;->observer:Llive/hms/video/transport/ITransportObserver;

    invoke-virtual {v1}, Llive/hms/video/transport/HMSTransport;->getState()Llive/hms/video/transport/models/TransportState;

    move-result-object v2

    invoke-static {v0, v2, v4, v15, v4}, Llive/hms/video/transport/ITransportObserver$DefaultImpls;->onStateChange$default(Llive/hms/video/transport/ITransportObserver;Llive/hms/video/transport/models/TransportState;Llive/hms/video/error/HMSException;ILjava/lang/Object;)V

    :cond_5
    new-instance v16, Llive/hms/video/transport/models/JoinParameters;

    move-object/from16 v17, p1

    move-object/from16 v18, p2

    move-object/from16 v19, p3

    move-object/from16 v20, p4

    move/from16 v22, p5

    move-object/from16 v21, p7

    move/from16 v23, p9

    invoke-direct/range {v16 .. v23}, Llive/hms/video/transport/models/JoinParameters;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    move-object/from16 v0, v16

    iput-object v0, v1, Llive/hms/video/transport/HMSTransport;->joinParameters:Llive/hms/video/transport/models/JoinParameters;

    const-string v0, "join: started \u23f0"

    invoke-static {v3, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v1, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0}, Llive/hms/video/signal/ISignal;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, v1, Llive/hms/video/transport/HMSTransport;->initConfig:Llive/hms/video/signal/init/InitConfig;

    if-nez v0, :cond_6

    goto :goto_2

    :cond_6
    move-object/from16 v12, p1

    move-object/from16 v10, p3

    move-object/from16 v9, p4

    move/from16 v6, p5

    move/from16 v5, p6

    move/from16 v2, p8

    move-object/from16 v24, v3

    move-object v15, v4

    goto/16 :goto_4

    :cond_7
    :goto_2
    :try_start_2
    iget-object v6, v1, Llive/hms/video/transport/HMSTransport;->performanceMeasurement:Llive/hms/video/sdk/models/PerformanceMeasurement;

    iput-object v1, v8, Llive/hms/video/transport/HMSTransport$join$1;->L$0:Ljava/lang/Object;

    move-object/from16 v2, p1

    iput-object v2, v8, Llive/hms/video/transport/HMSTransport$join$1;->L$1:Ljava/lang/Object;

    move-object/from16 v0, p3

    iput-object v0, v8, Llive/hms/video/transport/HMSTransport$join$1;->L$2:Ljava/lang/Object;

    move-object/from16 v12, p4

    iput-object v12, v8, Llive/hms/video/transport/HMSTransport$join$1;->L$3:Ljava/lang/Object;

    iput-object v1, v8, Llive/hms/video/transport/HMSTransport$join$1;->L$4:Ljava/lang/Object;

    iput-object v1, v8, Llive/hms/video/transport/HMSTransport$join$1;->L$5:Ljava/lang/Object;

    move/from16 v14, p5

    iput-boolean v14, v8, Llive/hms/video/transport/HMSTransport$join$1;->Z$0:Z

    move/from16 v5, p6

    iput-boolean v5, v8, Llive/hms/video/transport/HMSTransport$join$1;->Z$1:Z

    move/from16 v7, p8

    iput-boolean v7, v8, Llive/hms/video/transport/HMSTransport$join$1;->Z$2:Z

    const/4 v9, 0x1

    iput v9, v8, Llive/hms/video/transport/HMSTransport$join$1;->label:I
    :try_end_2
    .catch Llive/hms/video/error/HMSException; {:try_start_2 .. :try_end_2} :catch_b

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/16 v9, 0x28

    const/4 v10, 0x0

    move-object/from16 v24, v3

    move-object v15, v4

    move-object/from16 v4, p2

    move-object/from16 v3, p7

    :try_start_3
    invoke-static/range {v1 .. v10}, Llive/hms/video/transport/ITransport$DefaultImpls;->connect$default(Llive/hms/video/transport/ITransport;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/enums/RetrySchedulerState;Llive/hms/video/sdk/models/PerformanceMeasurement;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_3
    .catch Llive/hms/video/error/HMSException; {:try_start_3 .. :try_end_3} :catch_a

    if-ne v3, v11, :cond_8

    goto/16 :goto_5

    :cond_8
    move-object/from16 v1, p0

    move/from16 v5, p6

    move/from16 v2, p8

    move-object v10, v0

    move-object v0, v3

    move-object v9, v12

    move v6, v14

    move-object v14, v1

    move-object/from16 v12, p1

    :goto_3
    :try_start_4
    move-object v3, v0

    check-cast v3, Llive/hms/video/signal/init/InitConfig;

    iget-object v3, v14, Llive/hms/video/transport/HMSTransport;->initConfig:Llive/hms/video/signal/init/InitConfig;

    if-eqz v3, :cond_b

    invoke-virtual {v3}, Llive/hms/video/signal/init/InitConfig;->getEndpoint()Ljava/lang/String;

    move-result-object v3
    :try_end_4
    .catch Llive/hms/video/error/HMSException; {:try_start_4 .. :try_end_4} :catch_7

    const/16 v4, 0xf

    const/4 v7, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 p6, v3

    move/from16 p7, v4

    move-object/from16 p8, v7

    move-object/from16 p1, v14

    move-object/from16 p2, v17

    move-object/from16 p3, v18

    move-object/from16 p4, v19

    move-object/from16 p5, v20

    :try_start_5
    invoke-static/range {p1 .. p8}, Llive/hms/video/transport/ITransport$DefaultImpls;->updateAnalyticsParams$default(Llive/hms/video/transport/ITransport;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/HMSRoom;Ljava/lang/String;ILjava/lang/Object;)V
    :try_end_5
    .catch Llive/hms/video/error/HMSException; {:try_start_5 .. :try_end_5} :catch_8

    :try_start_6
    check-cast v0, Llive/hms/video/signal/init/InitConfig;
    :try_end_6
    .catch Llive/hms/video/error/HMSException; {:try_start_6 .. :try_end_6} :catch_7

    iput-object v0, v1, Llive/hms/video/transport/HMSTransport;->initConfig:Llive/hms/video/signal/init/InitConfig;

    move-object v1, v14

    :goto_4
    :try_start_7
    iput-object v1, v8, Llive/hms/video/transport/HMSTransport$join$1;->L$0:Ljava/lang/Object;

    iput-object v12, v8, Llive/hms/video/transport/HMSTransport$join$1;->L$1:Ljava/lang/Object;

    iput-object v15, v8, Llive/hms/video/transport/HMSTransport$join$1;->L$2:Ljava/lang/Object;

    iput-object v15, v8, Llive/hms/video/transport/HMSTransport$join$1;->L$3:Ljava/lang/Object;

    iput-object v15, v8, Llive/hms/video/transport/HMSTransport$join$1;->L$4:Ljava/lang/Object;

    iput-object v15, v8, Llive/hms/video/transport/HMSTransport$join$1;->L$5:Ljava/lang/Object;

    const/4 v0, 0x2

    iput v0, v8, Llive/hms/video/transport/HMSTransport$join$1;->label:I
    :try_end_7
    .catch Llive/hms/video/error/HMSException; {:try_start_7 .. :try_end_7} :catch_6
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_3

    move-object/from16 p1, v1

    move/from16 p6, v2

    move/from16 p5, v5

    move/from16 p4, v6

    move-object/from16 p7, v8

    move-object/from16 p3, v9

    move-object/from16 p2, v10

    :try_start_8
    invoke-direct/range {p1 .. p7}, Llive/hms/video/transport/HMSTransport;->internalJoin(Ljava/lang/String;Ljava/lang/String;ZZZLq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_8
    .catch Llive/hms/video/error/HMSException; {:try_start_8 .. :try_end_8} :catch_5
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_3

    move-object/from16 v5, p1

    if-ne v0, v11, :cond_9

    :goto_5
    return-object v11

    :cond_9
    move-object v2, v12

    :goto_6
    :try_start_9
    iget-object v0, v5, Llive/hms/video/transport/HMSTransport;->performanceMeasurement:Llive/hms/video/sdk/models/PerformanceMeasurement;

    if-eqz v0, :cond_a

    sget-object v1, Llive/hms/video/sdk/models/EVENT_TYPE;->PEER_LIST:Llive/hms/video/sdk/models/EVENT_TYPE;

    invoke-virtual {v0, v1}, Llive/hms/video/sdk/models/PerformanceMeasurement;->start$lib_release(Llive/hms/video/sdk/models/EVENT_TYPE;)V
    :try_end_9
    .catch Llive/hms/video/error/HMSException; {:try_start_9 .. :try_end_9} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_9 .. :try_end_9} :catch_3

    goto :goto_7

    :catch_3
    move-exception v0

    move-object/from16 v1, v24

    goto :goto_9

    :catch_4
    move-exception v0

    move-object/from16 v1, v24

    goto :goto_a

    :cond_a
    :goto_7
    const-string v0, "join: successful \u2705"

    move-object/from16 v1, v24

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/transport/models/TransportState;->Joined:Llive/hms/video/transport/models/TransportState;

    invoke-direct {v5, v0}, Llive/hms/video/transport/HMSTransport;->setState(Llive/hms/video/transport/models/TransportState;)V

    const/4 v9, 0x1

    iput-boolean v9, v5, Llive/hms/video/transport/HMSTransport;->hasJoined:Z

    iget-object v0, v5, Llive/hms/video/transport/HMSTransport;->observer:Llive/hms/video/transport/ITransportObserver;

    invoke-virtual {v5}, Llive/hms/video/transport/HMSTransport;->getState()Llive/hms/video/transport/models/TransportState;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v0, v1, v15, v2, v15}, Llive/hms/video/transport/ITransportObserver$DefaultImpls;->onStateChange$default(Llive/hms/video/transport/ITransportObserver;Llive/hms/video/transport/models/TransportState;Llive/hms/video/error/HMSException;ILjava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :catch_5
    move-exception v0

    move-object/from16 v5, p1

    :goto_8
    move-object/from16 v1, v24

    move-object v2, v12

    goto :goto_a

    :catch_6
    move-exception v0

    move-object v5, v1

    goto :goto_8

    :goto_9
    sget-object v2, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string v3, "join: failed cause peer is closed \u274c "

    invoke-virtual {v2, v1, v3, v0}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_a
    sget-object v3, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const/16 v4, 0x5d

    invoke-static {v4, v13, v2}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v1, v2, v0}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v1, Llive/hms/video/transport/models/TransportState;->Failed:Llive/hms/video/transport/models/TransportState;

    invoke-direct {v5, v1}, Llive/hms/video/transport/HMSTransport;->setState(Llive/hms/video/transport/models/TransportState;)V

    throw v0

    :catch_7
    move-exception v0

    :goto_b
    move-object/from16 v1, v24

    goto :goto_d

    :catch_8
    move-exception v0

    move-object/from16 v14, p1

    goto :goto_b

    :cond_b
    move-object/from16 v1, v24

    :try_start_a
    const-string v0, "initConfig"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v15
    :try_end_a
    .catch Llive/hms/video/error/HMSException; {:try_start_a .. :try_end_a} :catch_9

    :catch_9
    move-exception v0

    goto :goto_d

    :catch_a
    move-exception v0

    move-object/from16 v1, v24

    :goto_c
    move-object/from16 v14, p0

    move-object/from16 v12, p1

    goto :goto_d

    :catch_b
    move-exception v0

    move-object v1, v3

    goto :goto_c

    :goto_d
    sget-object v2, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const/16 v4, 0x5d

    invoke-static {v4, v13, v12}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3, v0}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v14}, Llive/hms/video/transport/HMSTransport;->getAnalyticsEventsService()Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v1

    sget-object v2, Llive/hms/video/events/AnalyticsEventFactory;->INSTANCE:Llive/hms/video/events/AnalyticsEventFactory;

    sget-object v3, Llive/hms/video/sdk/models/enums/RetrySchedulerState;->JOINED:Llive/hms/video/sdk/models/enums/RetrySchedulerState;

    invoke-virtual {v2, v0, v3}, Llive/hms/video/events/AnalyticsEventFactory;->connect(Llive/hms/video/error/HMSException;Llive/hms/video/sdk/models/enums/RetrySchedulerState;)Llive/hms/video/events/AnalyticsEvent;

    move-result-object v2

    invoke-virtual {v1, v2}, Llive/hms/video/events/AnalyticsEventsService;->queue(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v1

    invoke-virtual {v1}, Llive/hms/video/events/AnalyticsEventsService;->flush()V

    sget-object v1, Llive/hms/video/transport/models/TransportState;->Failed:Llive/hms/video/transport/models/TransportState;

    invoke-direct {v14, v1}, Llive/hms/video/transport/HMSTransport;->setState(Llive/hms/video/transport/models/TransportState;)V

    throw v0

    :cond_c
    sget-object v0, Llive/hms/video/error/ErrorFactory$WebsocketMethodErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$WebsocketMethodErrors;

    sget-object v1, Llive/hms/video/error/ErrorFactory$Action;->JOIN:Llive/hms/video/error/ErrorFactory$Action;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Cannot join a meeting in "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Llive/hms/video/transport/HMSTransport;->getState()Llive/hms/video/transport/models/TransportState;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xc

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 p1, v0

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    invoke-static/range {p1 .. p7}, Llive/hms/video/error/ErrorFactory$WebsocketMethodErrors;->AlreadyJoined$default(Llive/hms/video/error/ErrorFactory$WebsocketMethodErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object v0

    throw v0
.end method

.method public leave(ZLq83/d;)Ljava/lang/Object;
    .locals 3
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

    invoke-virtual {p0}, Llive/hms/video/transport/HMSTransport;->getState()Llive/hms/video/transport/models/TransportState;

    move-result-object v0

    sget-object v1, Llive/hms/video/transport/models/TransportState;->Disconnected:Llive/hms/video/transport/models/TransportState;

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1}, Llive/hms/video/signal/ISignal;->leave(Z)V

    invoke-direct {p0, p2}, Llive/hms/video/transport/HMSTransport;->tearDownTransport(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    return-object v2

    :cond_1
    const-string p1, "HMSTransport"

    const-string p2, "Ignoring leave() call, transport is already in disconnected state"

    invoke-static {p1, p2}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method public noiseCancellation()Llive/hms/video/factories/noisecancellation/NoiseCancellation;
    .locals 1

    invoke-direct {p0}, Llive/hms/video/transport/HMSTransport;->getHmsPeerConnectionFactory()Llive/hms/video/factories/HMSPeerConnectionFactory;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getNoiseCancellation()Llive/hms/video/factories/noisecancellation/NoiseCancellation;

    move-result-object v0

    return-object v0
.end method

.method public peerIteratorNext(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2, p3}, Llive/hms/video/signal/ISignal;->peerIteratorNext(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public peerNameSearch(Ljava/lang/String;IJLq83/d;)Ljava/lang/Object;
    .locals 6
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    move-object v1, p1

    move v2, p2

    move-wide v3, p3

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Llive/hms/video/signal/ISignal;->peerNameSearch(Ljava/lang/String;IJLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public pollAddResponse(Llive/hms/video/polls/HMSPollResponseBuilder;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->pollAddResponse(Llive/hms/video/polls/HMSPollResponseBuilder;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public pollGetLeaderboard(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->pollGetLeaderboard(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public pollGetList(Llive/hms/video/polls/models/HmsPollState;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2, p3, p4}, Llive/hms/video/signal/ISignal;->pollGetList(Llive/hms/video/polls/models/HmsPollState;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public pollGetResponses(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->pollGetResponses(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public pollGetResults(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->pollGetResults(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public pollQuestionsGet(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->pollQuestionsGet(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public pollStart(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->pollStart(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public pollStop(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->pollStop(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public publish([Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;
    .locals 16
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

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Llive/hms/video/transport/HMSTransport$publish$4;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Llive/hms/video/transport/HMSTransport$publish$4;

    iget v4, v3, Llive/hms/video/transport/HMSTransport$publish$4;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Llive/hms/video/transport/HMSTransport$publish$4;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Llive/hms/video/transport/HMSTransport$publish$4;

    invoke-direct {v3, v1, v2}, Llive/hms/video/transport/HMSTransport$publish$4;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Llive/hms/video/transport/HMSTransport$publish$4;->result:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    .line 27
    iget v5, v3, Llive/hms/video/transport/HMSTransport$publish$4;->label:I

    const/4 v6, 0x3

    const/4 v7, 0x2

    const-string v9, "HMSTransport"

    const/4 v10, 0x1

    if-eqz v5, :cond_4

    if-eq v5, v10, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget v0, v3, Llive/hms/video/transport/HMSTransport$publish$4;->I$1:I

    iget v5, v3, Llive/hms/video/transport/HMSTransport$publish$4;->I$0:I

    iget-object v7, v3, Llive/hms/video/transport/HMSTransport$publish$4;->L$3:Ljava/lang/Object;

    check-cast v7, Llive/hms/video/media/tracks/HMSTrack;

    iget-object v11, v3, Llive/hms/video/transport/HMSTransport$publish$4;->L$2:Ljava/lang/Object;

    check-cast v11, [Llive/hms/video/media/tracks/HMSTrack;

    iget-object v12, v3, Llive/hms/video/transport/HMSTransport$publish$4;->L$1:Ljava/lang/Object;

    check-cast v12, Ljava/util/ArrayList;

    iget-object v13, v3, Llive/hms/video/transport/HMSTransport$publish$4;->L$0:Ljava/lang/Object;

    check-cast v13, Llive/hms/video/transport/HMSTransport;

    :try_start_0
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x0

    goto/16 :goto_a

    :catch_0
    const/4 v2, 0x0

    goto/16 :goto_b

    :catch_1
    move-exception v0

    goto/16 :goto_c

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v3, Llive/hms/video/transport/HMSTransport$publish$4;->L$1:Ljava/lang/Object;

    check-cast v0, [Llive/hms/video/media/tracks/HMSTrack;

    iget-object v5, v3, Llive/hms/video/transport/HMSTransport$publish$4;->L$0:Ljava/lang/Object;

    check-cast v5, Llive/hms/video/transport/HMSTransport;

    :try_start_1
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Llive/hms/video/error/HMSException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_2

    goto/16 :goto_4

    :catch_2
    move-exception v0

    goto/16 :goto_5

    :catch_3
    move-exception v0

    goto/16 :goto_6

    :cond_3
    iget-object v0, v3, Llive/hms/video/transport/HMSTransport$publish$4;->L$1:Ljava/lang/Object;

    check-cast v0, [Llive/hms/video/media/tracks/HMSTrack;

    iget-object v5, v3, Llive/hms/video/transport/HMSTransport$publish$4;->L$0:Ljava/lang/Object;

    check-cast v5, Llive/hms/video/transport/HMSTransport;

    :try_start_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Llive/hms/video/error/HMSException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_3

    :cond_4
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    .line 28
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "publish :: tracks from local peer "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    new-instance v5, Ljava/util/ArrayList;

    array-length v11, v0

    invoke-direct {v5, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    array-length v11, v0

    const/4 v12, 0x0

    :goto_1
    const-string v13, " trackid "

    const-string v14, "track type is "

    if-ge v12, v11, :cond_5

    aget-object v15, v0, v12

    .line 31
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15}, Llive/hms/video/media/tracks/HMSTrack;->getType()Llive/hms/video/media/tracks/HMSTrackType;

    move-result-object v14

    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 32
    invoke-interface {v5, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    .line 33
    :cond_5
    invoke-static {v5}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " pending tracks to publish "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v1, Llive/hms/video/transport/HMSTransport;->tracksToPublish:Ljava/util/ArrayList;

    .line 34
    new-instance v8, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v5, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v8, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 36
    check-cast v11, Llive/hms/video/media/tracks/HMSTrack;

    .line 37
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11}, Llive/hms/video/media/tracks/HMSTrack;->getType()Llive/hms/video/media/tracks/HMSTrackType;

    move-result-object v15

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 38
    invoke-interface {v8, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 39
    :cond_6
    invoke-static {v8}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v9, v2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    iget-boolean v2, v1, Llive/hms/video/transport/HMSTransport;->isRenegotiationDone:Z

    if-nez v2, :cond_9

    .line 41
    :try_start_3
    iput-object v1, v3, Llive/hms/video/transport/HMSTransport$publish$4;->L$0:Ljava/lang/Object;

    iput-object v0, v3, Llive/hms/video/transport/HMSTransport$publish$4;->L$1:Ljava/lang/Object;

    iput v10, v3, Llive/hms/video/transport/HMSTransport$publish$4;->label:I

    invoke-virtual {v1, v3}, Llive/hms/video/transport/HMSTransport;->initPeerConnections(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_7

    goto :goto_9

    :cond_7
    move-object v5, v1

    .line 42
    :goto_3
    sget-object v2, Llive/hms/video/factories/MediaConstraintsFactory;->INSTANCE:Llive/hms/video/factories/MediaConstraintsFactory;

    invoke-virtual {v2}, Llive/hms/video/factories/MediaConstraintsFactory;->makePublishOfferConstraints()Lhms/webrtc/MediaConstraints;

    move-result-object v2

    iput-object v5, v3, Llive/hms/video/transport/HMSTransport$publish$4;->L$0:Ljava/lang/Object;

    iput-object v0, v3, Llive/hms/video/transport/HMSTransport$publish$4;->L$1:Ljava/lang/Object;

    iput v7, v3, Llive/hms/video/transport/HMSTransport$publish$4;->label:I

    invoke-direct {v5, v2, v3}, Llive/hms/video/transport/HMSTransport;->performPublishRenegotiation(Lhms/webrtc/MediaConstraints;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_8

    goto :goto_9

    .line 43
    :cond_8
    :goto_4
    iput-boolean v10, v5, Llive/hms/video/transport/HMSTransport;->isRenegotiationDone:Z
    :try_end_3
    .catch Llive/hms/video/error/HMSException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_7

    .line 44
    :goto_5
    sget-object v2, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Renegotiation didnt complete due to : "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v9, v3}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    throw v0

    .line 46
    :goto_6
    throw v0

    :cond_9
    move-object v5, v1

    .line 47
    :goto_7
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 48
    array-length v7, v0

    move-object v11, v0

    move-object v12, v2

    move-object v13, v5

    move v0, v7

    const/4 v5, 0x0

    :goto_8
    if-ge v5, v0, :cond_c

    aget-object v7, v11, v5

    .line 49
    iget-object v2, v13, Llive/hms/video/transport/HMSTransport;->tracksToPublish:Ljava/util/ArrayList;

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    .line 50
    iget-object v2, v13, Llive/hms/video/transport/HMSTransport;->tracksToPublish:Ljava/util/ArrayList;

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    :try_start_4
    iput-object v13, v3, Llive/hms/video/transport/HMSTransport$publish$4;->L$0:Ljava/lang/Object;

    iput-object v12, v3, Llive/hms/video/transport/HMSTransport$publish$4;->L$1:Ljava/lang/Object;

    iput-object v11, v3, Llive/hms/video/transport/HMSTransport$publish$4;->L$2:Ljava/lang/Object;

    iput-object v7, v3, Llive/hms/video/transport/HMSTransport$publish$4;->L$3:Ljava/lang/Object;

    iput v5, v3, Llive/hms/video/transport/HMSTransport$publish$4;->I$0:I

    iput v0, v3, Llive/hms/video/transport/HMSTransport$publish$4;->I$1:I

    iput v6, v3, Llive/hms/video/transport/HMSTransport$publish$4;->label:I
    :try_end_4
    .catch Llive/hms/video/error/HMSException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_0

    const/4 v2, 0x0

    :try_start_5
    invoke-direct {v13, v7, v2, v3}, Llive/hms/video/transport/HMSTransport;->publish(Llive/hms/video/media/tracks/HMSTrack;ZLq83/d;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v4, :cond_a

    :goto_9
    return-object v4

    .line 52
    :cond_a
    :goto_a
    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catch Llive/hms/video/error/HMSException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_4

    goto :goto_d

    .line 53
    :catch_4
    :goto_b
    const-string v7, "Tear down in progress, cannot publish"

    invoke-static {v9, v7}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_d

    .line 54
    :goto_c
    invoke-virtual {v13}, Llive/hms/video/transport/HMSTransport;->getAnalyticsEventsService()Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v2

    sget-object v3, Llive/hms/video/events/AnalyticsEventFactory;->INSTANCE:Llive/hms/video/events/AnalyticsEventFactory;

    invoke-virtual {v3, v0}, Llive/hms/video/events/AnalyticsEventFactory;->publishFail(Llive/hms/video/error/HMSException;)Llive/hms/video/events/AnalyticsEvent;

    move-result-object v3

    invoke-virtual {v2, v3}, Llive/hms/video/events/AnalyticsEventsService;->queue(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v2

    invoke-virtual {v2}, Llive/hms/video/events/AnalyticsEventsService;->flush()V

    .line 55
    throw v0

    :cond_b
    const/4 v2, 0x0

    :goto_d
    add-int/2addr v5, v10

    goto :goto_8

    :cond_c
    return-object v12
.end method

.method public publishScreenshare(Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;
    .locals 2
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

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "publish: screenshare track="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " STARTING"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSTransport"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->tracksToPublish:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-nez v0, :cond_0

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport;->screenShareTrack:Llive/hms/video/media/tracks/HMSTrack;

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->tracksToPublish:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p2}, Llive/hms/video/transport/HMSTransport;->publish(Llive/hms/video/media/tracks/HMSTrack;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    return-object v1
.end method

.method public reInitPeerConnectionFactory(ZLq83/d;)Ljava/lang/Object;
    .locals 0
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

    const/4 p1, 0x0

    iput-boolean p1, p0, Llive/hms/video/transport/HMSTransport;->isHmsPeerConnectionFactoryInitialized:Z

    const-string p1, "SFUMIGRATION"

    const-string p2, "Create new Peer connection"

    invoke-static {p1, p2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Llive/hms/video/transport/HMSTransport;->getHmsPeerConnectionFactory()Llive/hms/video/factories/HMSPeerConnectionFactory;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getFactory()Llive/hms/video/factories/SafeVariable;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/factories/SafeVariable;->reset()V

    iget-boolean p1, p0, Llive/hms/video/transport/HMSTransport;->isSimulcastEnabled:Z

    iget-boolean p2, p0, Llive/hms/video/transport/HMSTransport;->serverSoftwareEchoCancellationEnabled:Z

    invoke-virtual {p0, p1, p2}, Llive/hms/video/transport/HMSTransport;->initHmsPeerConnectionFactory(ZZ)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public removePeerRequest(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2, p3}, Llive/hms/video/signal/ISignal;->removePeer(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public removeTrackFromStream()V
    .locals 2

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->nativeAudioTrack:Lhms/webrtc/AudioTrack;

    if-eqz v0, :cond_0

    iget-object v1, p0, Llive/hms/video/transport/HMSTransport;->nativeStream:Lhms/webrtc/MediaStream;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Lhms/webrtc/MediaStream;->removeTrack(Lhms/webrtc/AudioTrack;)Z

    :cond_0
    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->nativeVideoTrack:Lhms/webrtc/VideoTrack;

    if-eqz v0, :cond_1

    iget-object v1, p0, Llive/hms/video/transport/HMSTransport;->nativeStream:Lhms/webrtc/MediaStream;

    if-eqz v1, :cond_1

    invoke-virtual {v1, v0}, Lhms/webrtc/MediaStream;->removeTrack(Lhms/webrtc/VideoTrack;)Z

    :cond_1
    return-void
.end method

.method public renegotiationICE(Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    instance-of v0, p1, Llive/hms/video/transport/HMSTransport$renegotiationICE$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Llive/hms/video/transport/HMSTransport$renegotiationICE$1;

    iget v1, v0, Llive/hms/video/transport/HMSTransport$renegotiationICE$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/transport/HMSTransport$renegotiationICE$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Llive/hms/video/transport/HMSTransport$renegotiationICE$1;

    invoke-direct {v0, p0, p1}, Llive/hms/video/transport/HMSTransport$renegotiationICE$1;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Llive/hms/video/transport/HMSTransport$renegotiationICE$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llive/hms/video/transport/HMSTransport$renegotiationICE$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    sget-object p1, Llive/hms/video/factories/MediaConstraintsFactory;->INSTANCE:Llive/hms/video/factories/MediaConstraintsFactory;

    invoke-virtual {p1}, Llive/hms/video/factories/MediaConstraintsFactory;->makePublishOfferConstraints()Lhms/webrtc/MediaConstraints;

    move-result-object p1

    iput v3, v0, Llive/hms/video/transport/HMSTransport$renegotiationICE$1;->label:I

    invoke-direct {p0, p1, v0}, Llive/hms/video/transport/HMSTransport;->performPublishRenegotiation(Lhms/webrtc/MediaConstraints;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :goto_1
    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Renegotiation didnt complete due to : "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "HMSTransport"

    invoke-virtual {v0, v1, p1}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public roleChangeAccept(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2, p3, p4}, Llive/hms/video/signal/ISignal;->roleChangeAccept(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public roleChangeRequest(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p3, p2, p4}, Llive/hms/video/signal/ISignal;->roleChangeRequest(Ljava/lang/String;ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public sendMessage(Llive/hms/video/signal/jsonrpc/models/HMSParams;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->sendMessage(Llive/hms/video/signal/jsonrpc/models/HMSParams;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public setAudioMixingMode(Llive/hms/video/sdk/models/enums/AudioMixingMode;)V
    .locals 1

    const-string v0, "audioMixingMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Llive/hms/video/transport/HMSTransport;->getHmsPeerConnectionFactory()Llive/hms/video/factories/HMSPeerConnectionFactory;

    move-result-object v0

    invoke-virtual {v0, p1}, Llive/hms/video/factories/HMSPeerConnectionFactory;->setAudioMixingMode(Llive/hms/video/sdk/models/enums/AudioMixingMode;)V

    return-void
.end method

.method public final setConnectivityListener(Llive/hms/video/transport/ITransportListener;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport;->connectivityListener:Llive/hms/video/transport/ITransportListener;

    return-void
.end method

.method public setHlsSessionMetadata(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->setHlsSessionMetadata(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final setLocalAudioTrack(Llive/hms/video/media/tracks/HMSLocalAudioTrack;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport;->localAudioTrack:Llive/hms/video/media/tracks/HMSLocalAudioTrack;

    return-void
.end method

.method public final setLocalVideoTrack(Llive/hms/video/media/tracks/HMSLocalVideoTrack;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport;->localVideoTrack:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    return-void
.end method

.method public setMetadataListener(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->setMetadataListener(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final setNativeAudioTrack(Lhms/webrtc/AudioTrack;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport;->nativeAudioTrack:Lhms/webrtc/AudioTrack;

    return-void
.end method

.method public final setNativeVideoTrack(Lhms/webrtc/VideoTrack;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport;->nativeVideoTrack:Lhms/webrtc/VideoTrack;

    return-void
.end method

.method public final setNodeID(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport;->nodeID:Ljava/lang/String;

    return-void
.end method

.method public setNodeInfo(Ljava/lang/String;)V
    .locals 1

    const-string v0, "nodeId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport;->nodeID:Ljava/lang/String;

    return-void
.end method

.method public final setServerSoftwareEchoCancellationEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/transport/HMSTransport;->serverSoftwareEchoCancellationEnabled:Z

    return-void
.end method

.method public final setSimulcastEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/transport/HMSTransport;->isSimulcastEnabled:Z

    return-void
.end method

.method public setTimeAfterJoinResponse(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/transport/HMSTransport;->timeAfterJoinResponse:J

    return-void
.end method

.method public setTimeAfterWSOpen(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/transport/HMSTransport;->timeAfterWSOpen:J

    return-void
.end method

.method public startHLSStreaming(Llive/hms/video/sdk/models/HMSHLSConfig;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->startHLSStreaming(Llive/hms/video/sdk/models/HMSHLSConfig;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public startRealTimeTranscription(Llive/hms/video/sdk/models/TranscriptionsMode;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->startRealTimeTranscription(Llive/hms/video/sdk/models/TranscriptionsMode;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public startRtmpOrRecording(Llive/hms/video/sdk/models/HMSRecordingConfig;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->startRtmpOrRecording(Llive/hms/video/sdk/models/HMSRecordingConfig;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public stopAudioFromRawFile(Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "hmsActionResultListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Llive/hms/video/transport/HMSTransport;->getHmsPeerConnectionFactory()Llive/hms/video/factories/HMSPeerConnectionFactory;

    move-result-object v0

    invoke-virtual {v0, p1}, Llive/hms/video/factories/HMSPeerConnectionFactory;->stopAudioFromRawFile(Llive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public stopHLSStreaming(Llive/hms/video/sdk/models/HMSHLSConfig;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->stopHLSStreaming(Llive/hms/video/sdk/models/HMSHLSConfig;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public stopRealTimeTranscription(Llive/hms/video/sdk/models/TranscriptionsMode;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1, p2}, Llive/hms/video/signal/ISignal;->stopRealTimeTranscription(Llive/hms/video/sdk/models/TranscriptionsMode;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public stopRtmpAndRecording(Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport;->signal:Llive/hms/video/signal/ISignal;

    invoke-interface {v0, p1}, Llive/hms/video/signal/ISignal;->stopRtmpAndRecording(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public streamAndPlayAudioFromRawFile(ILlive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "hmsActionResultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Llive/hms/video/transport/HMSTransport;->getHmsPeerConnectionFactory()Llive/hms/video/factories/HMSPeerConnectionFactory;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Llive/hms/video/factories/HMSPeerConnectionFactory;->streamAndPlayAudioFromRawFile(ILlive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public unpublish([Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;
    .locals 7
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

    instance-of v0, p2, Llive/hms/video/transport/HMSTransport$unpublish$4;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Llive/hms/video/transport/HMSTransport$unpublish$4;

    iget v1, v0, Llive/hms/video/transport/HMSTransport$unpublish$4;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/transport/HMSTransport$unpublish$4;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Llive/hms/video/transport/HMSTransport$unpublish$4;

    invoke-direct {v0, p0, p2}, Llive/hms/video/transport/HMSTransport$unpublish$4;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Llive/hms/video/transport/HMSTransport$unpublish$4;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    .line 29
    iget v2, v0, Llive/hms/video/transport/HMSTransport$unpublish$4;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Llive/hms/video/transport/HMSTransport$unpublish$4;->I$1:I

    iget v2, v0, Llive/hms/video/transport/HMSTransport$unpublish$4;->I$0:I

    iget-object v4, v0, Llive/hms/video/transport/HMSTransport$unpublish$4;->L$1:Ljava/lang/Object;

    check-cast v4, [Llive/hms/video/media/tracks/HMSTrack;

    iget-object v5, v0, Llive/hms/video/transport/HMSTransport$unpublish$4;->L$0:Ljava/lang/Object;

    check-cast v5, Llive/hms/video/transport/HMSTransport;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, v4

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    .line 30
    array-length p2, p1

    const/4 v2, 0x0

    move v5, p2

    move-object p2, p1

    move p1, v5

    move-object v5, p0

    :goto_1
    if-ge v2, p1, :cond_4

    aget-object v4, p2, v2

    .line 31
    iget-object v6, v5, Llive/hms/video/transport/HMSTransport;->tracksToPublish:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 32
    iput-object v5, v0, Llive/hms/video/transport/HMSTransport$unpublish$4;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Llive/hms/video/transport/HMSTransport$unpublish$4;->L$1:Ljava/lang/Object;

    iput v2, v0, Llive/hms/video/transport/HMSTransport$unpublish$4;->I$0:I

    iput p1, v0, Llive/hms/video/transport/HMSTransport$unpublish$4;->I$1:I

    iput v3, v0, Llive/hms/video/transport/HMSTransport$unpublish$4;->label:I

    invoke-direct {v5, v4, v0}, Llive/hms/video/transport/HMSTransport;->unpublish(Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    add-int/2addr v2, v3

    goto :goto_1

    .line 33
    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public unpublishScreenshare(Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    instance-of v0, p1, Llive/hms/video/transport/HMSTransport$unpublishScreenshare$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Llive/hms/video/transport/HMSTransport$unpublishScreenshare$1;

    iget v1, v0, Llive/hms/video/transport/HMSTransport$unpublishScreenshare$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/transport/HMSTransport$unpublishScreenshare$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Llive/hms/video/transport/HMSTransport$unpublishScreenshare$1;

    invoke-direct {v0, p0, p1}, Llive/hms/video/transport/HMSTransport$unpublishScreenshare$1;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Llive/hms/video/transport/HMSTransport$unpublishScreenshare$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llive/hms/video/transport/HMSTransport$unpublishScreenshare$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Llive/hms/video/transport/HMSTransport$unpublishScreenshare$1;->L$0:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/transport/HMSTransport;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/transport/HMSTransport;->screenShareTrack:Llive/hms/video/media/tracks/HMSTrack;

    if-eqz p1, :cond_4

    iget-object v2, p0, Llive/hms/video/transport/HMSTransport;->tracksToPublish:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iput-object p0, v0, Llive/hms/video/transport/HMSTransport$unpublishScreenshare$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Llive/hms/video/transport/HMSTransport$unpublishScreenshare$1;->label:I

    invoke-direct {p0, p1, v0}, Llive/hms/video/transport/HMSTransport;->unpublish(Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    const/4 p1, 0x0

    iput-object p1, v0, Llive/hms/video/transport/HMSTransport;->screenShareTrack:Llive/hms/video/media/tracks/HMSTrack;

    goto :goto_2

    :cond_4
    const-string p1, "HMSTransport"

    const-string v0, "No screenshare track present to unpublish"

    invoke-static {p1, v0}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public updateAnalyticsParams(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/HMSRoom;Ljava/lang/String;)V
    .locals 6

    invoke-virtual {p0}, Llive/hms/video/transport/HMSTransport;->getAnalyticsEventsService()Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Llive/hms/video/events/AnalyticsEventsService;->updateAnalyticsParams(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/HMSRoom;Ljava/lang/String;)V

    return-void
.end method
