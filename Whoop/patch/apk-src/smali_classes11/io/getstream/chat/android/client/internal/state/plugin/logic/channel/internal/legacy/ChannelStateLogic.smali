.class public final Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001f\n\u0002\u0010%\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u00d9\u00012\u00020\u0001:\u0002\u00d9\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J%\u0010\u001c\u001a\u00020\u001b2\u0016\u0010\u001a\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008 \u0010!J\u0015\u0010#\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001e\u00a2\u0006\u0004\u0008#\u0010!J\r\u0010$\u001a\u00020\u001b\u00a2\u0006\u0004\u0008$\u0010%J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0004\u0008\u001c\u0010(J\u0015\u0010+\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020)\u00a2\u0006\u0004\u0008+\u0010,J\u0015\u0010-\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020)\u00a2\u0006\u0004\u0008-\u0010,J\u001f\u00101\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020.2\u0008\u0010\'\u001a\u0004\u0018\u000100\u00a2\u0006\u0004\u00081\u00102J#\u00108\u001a\u00020\u001b2\u000c\u00105\u001a\u0008\u0012\u0004\u0012\u000204032\u0006\u00107\u001a\u000206\u00a2\u0006\u0004\u00088\u00109J\u0017\u0010<\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:H\u0016\u00a2\u0006\u0004\u0008<\u0010=J\u0015\u0010>\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:\u00a2\u0006\u0004\u0008>\u0010=J%\u0010B\u001a\u00020\u001b2\u000c\u0010?\u001a\u0008\u0012\u0004\u0012\u00020:032\u0008\u0008\u0002\u0010A\u001a\u00020@\u00a2\u0006\u0004\u0008B\u0010CJ#\u0010D\u001a\u00020\u001b2\u000c\u0010?\u001a\u0008\u0012\u0004\u0012\u00020:032\u0006\u0010A\u001a\u00020@\u00a2\u0006\u0004\u0008D\u0010CJ\u001d\u0010E\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001032\u0006\u0010;\u001a\u00020:\u00a2\u0006\u0004\u0008E\u0010FJ\u0015\u0010G\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:\u00a2\u0006\u0004\u0008G\u0010=J!\u0010K\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020H2\n\u0008\u0002\u0010J\u001a\u0004\u0018\u00010:\u00a2\u0006\u0004\u0008K\u0010LJ\u0015\u0010O\u001a\u00020\u001b2\u0006\u0010N\u001a\u00020M\u00a2\u0006\u0004\u0008O\u0010PJ%\u0010S\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020.2\u0006\u0010Q\u001a\u00020@2\u0006\u0010R\u001a\u00020H\u00a2\u0006\u0004\u0008S\u0010TJ\u0015\u0010U\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020H\u00a2\u0006\u0004\u0008U\u0010VJ\u0015\u0010X\u001a\u00020\u001b2\u0006\u0010W\u001a\u000204\u00a2\u0006\u0004\u0008X\u0010YJ\u0015\u0010Z\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001e\u00a2\u0006\u0004\u0008Z\u0010!J\u001b\u0010\\\u001a\u00020\u001b2\u000c\u0010[\u001a\u0008\u0012\u0004\u0012\u00020\u001e03\u00a2\u0006\u0004\u0008\\\u0010]J#\u0010_\u001a\u00020\u001b2\u000c\u0010[\u001a\u0008\u0012\u0004\u0012\u00020\u001e032\u0006\u0010^\u001a\u000206\u00a2\u0006\u0004\u0008_\u00109J\u0015\u0010`\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001e\u00a2\u0006\u0004\u0008`\u0010!J1\u0010e\u001a\u00020\u001b2\u0008\u0010a\u001a\u0004\u0018\u00010.2\u0006\u0010b\u001a\u00020@2\u0008\u0010c\u001a\u0004\u0018\u00010H2\u0006\u0010d\u001a\u00020@\u00a2\u0006\u0004\u0008e\u0010fJ\u0015\u0010h\u001a\u00020\u001b2\u0006\u0010g\u001a\u00020H\u00a2\u0006\u0004\u0008h\u0010VJ\u0015\u0010j\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020i\u00a2\u0006\u0004\u0008j\u0010kJ\u0015\u0010m\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020l\u00a2\u0006\u0004\u0008m\u0010nJ\u0015\u0010p\u001a\u00020\u001b2\u0006\u0010o\u001a\u00020@\u00a2\u0006\u0004\u0008p\u0010qJ\u0019\u0010s\u001a\u00020\u001b2\u0008\u0010r\u001a\u0004\u0018\u00010:H\u0016\u00a2\u0006\u0004\u0008s\u0010=J\r\u0010t\u001a\u00020@\u00a2\u0006\u0004\u0008t\u0010uJ\u0015\u0010w\u001a\u00020\u001b2\u0006\u0010v\u001a\u00020@\u00a2\u0006\u0004\u0008w\u0010qJP\u0010\u007f\u001a\u00020\u001b2\u0006\u0010y\u001a\u00020x2\u0006\u0010z\u001a\u0002062\u0008\u0008\u0002\u0010A\u001a\u00020@2\u0008\u0008\u0002\u0010{\u001a\u00020@2\u0008\u0008\u0002\u0010|\u001a\u00020@2\u0008\u0008\u0002\u0010}\u001a\u00020@2\u0008\u0008\u0002\u0010~\u001a\u00020@\u00a2\u0006\u0005\u0008\u007f\u0010\u0080\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u001b2\u0007\u0010\u0081\u0001\u001a\u00020x\u00a2\u0006\u0006\u0008\u0082\u0001\u0010\u0083\u0001J\"\u0010\u0086\u0001\u001a\u00020\u001b2\u0006\u0010y\u001a\u00020x2\u0008\u0010\u0085\u0001\u001a\u00030\u0084\u0001\u00a2\u0006\u0006\u0008\u0086\u0001\u0010\u0087\u0001J\u001a\u0010\u008a\u0001\u001a\u00020\u001b2\u0008\u0010\u0089\u0001\u001a\u00030\u0088\u0001\u00a2\u0006\u0006\u0008\u008a\u0001\u0010\u008b\u0001J\u0011\u0010\u008d\u0001\u001a\u00020\u001bH\u0000\u00a2\u0006\u0005\u0008\u008c\u0001\u0010%J\u0017\u0010\u008e\u0001\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001e\u00a2\u0006\u0005\u0008\u008e\u0001\u0010!J\u000f\u0010\u008f\u0001\u001a\u00020\u001b\u00a2\u0006\u0005\u0008\u008f\u0001\u0010%J\u000f\u0010\u0090\u0001\u001a\u00020\u001b\u00a2\u0006\u0005\u0008\u0090\u0001\u0010%J\u000f\u0010\u0091\u0001\u001a\u00020\u001b\u00a2\u0006\u0005\u0008\u0091\u0001\u0010%J \u0010\u0093\u0001\u001a\u00020\u001b2\u0007\u0010\u0092\u0001\u001a\u00020H2\u0006\u0010;\u001a\u00020:\u00a2\u0006\u0005\u0008\u0093\u0001\u0010LJ\u001a\u0010\u0096\u0001\u001a\u00020\u001b2\u0008\u0010\u0095\u0001\u001a\u00030\u0094\u0001\u00a2\u0006\u0006\u0008\u0096\u0001\u0010\u0097\u0001J\u001a\u0010\u0098\u0001\u001a\u00020\u001b2\u0008\u0010\u0095\u0001\u001a\u00030\u0094\u0001\u00a2\u0006\u0006\u0008\u0098\u0001\u0010\u0097\u0001J\u001c\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0094\u00012\u0007\u0010\u0099\u0001\u001a\u00020.\u00a2\u0006\u0006\u0008\u009a\u0001\u0010\u009b\u0001J\u0019\u0010\u009d\u0001\u001a\u00020\u001b2\u0007\u0010\u009c\u0001\u001a\u000206\u00a2\u0006\u0006\u0008\u009d\u0001\u0010\u009e\u0001J\u0017\u0010\u009f\u0001\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:\u00a2\u0006\u0005\u0008\u009f\u0001\u0010=J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010y\u001a\u00020xH\u0002\u00a2\u0006\u0005\u0008\u001c\u0010\u0083\u0001J \u0010\u00a1\u0001\u001a\u00020\u001b2\r\u0010\u00a0\u0001\u001a\u0008\u0012\u0004\u0012\u00020)03H\u0002\u00a2\u0006\u0005\u0008\u00a1\u0001\u0010]J$\u0010\u00a4\u0001\u001a\u00020)2\u0007\u0010\u00a2\u0001\u001a\u00020)2\u0007\u0010\u00a3\u0001\u001a\u00020)H\u0002\u00a2\u0006\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001J2\u0010\u00aa\u0001\u001a\u00020\u001b2\u0014\u0010\u00a7\u0001\u001a\u000f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u0002000\u00a6\u00012\u0008\u0010\u00a9\u0001\u001a\u00030\u00a8\u0001H\u0002\u00a2\u0006\u0006\u0008\u00aa\u0001\u0010\u00ab\u0001J\'\u0010\u00ac\u0001\u001a\u00020\u001b2\u000c\u00105\u001a\u0008\u0012\u0004\u0012\u000204032\u0006\u00107\u001a\u000206H\u0002\u00a2\u0006\u0005\u0008\u00ac\u0001\u00109J\"\u0010\u00ae\u0001\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001032\u0007\u0010\u00ad\u0001\u001a\u00020:H\u0002\u00a2\u0006\u0005\u0008\u00ae\u0001\u0010FJ\u001f\u0010\u00af\u0001\u001a\u00020\u001b2\u000c\u0010?\u001a\u0008\u0012\u0004\u0012\u00020:03H\u0002\u00a2\u0006\u0005\u0008\u00af\u0001\u0010]J-\u0010\u00b0\u0001\u001a\u000f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020:0\u00a6\u00012\u000c\u0010?\u001a\u0008\u0012\u0004\u0012\u00020:03H\u0002\u00a2\u0006\u0006\u0008\u00b0\u0001\u0010\u00b1\u0001JD\u0010\u00b4\u0001\u001a\u00020@2\u0006\u0010|\u001a\u00020@2\u0007\u0010\u00b2\u0001\u001a\u00020@2\u0007\u0010\u00b3\u0001\u001a\u00020@2\u0006\u0010A\u001a\u00020@2\u0006\u0010}\u001a\u00020@2\u0006\u0010~\u001a\u00020@H\u0002\u00a2\u0006\u0006\u0008\u00b4\u0001\u0010\u00b5\u0001J%\u0010\u00b7\u0001\u001a\u00020\u001b2\u0008\u0010\u0085\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u00b6\u0001\u001a\u00020@H\u0002\u00a2\u0006\u0006\u0008\u00b7\u0001\u0010\u00b8\u0001J&\u0010\u00bb\u0001\u001a\u00020@2\t\u0010\u00b9\u0001\u001a\u0004\u0018\u00010:2\u0007\u0010\u00ba\u0001\u001a\u00020:H\u0002\u00a2\u0006\u0006\u0008\u00bb\u0001\u0010\u00bc\u0001J\u0016\u0010\u00bd\u0001\u001a\u00020\r*\u00020:H\u0002\u00a2\u0006\u0006\u0008\u00bd\u0001\u0010\u00be\u0001J\u0016\u0010\u00bf\u0001\u001a\u00020\r*\u00020:H\u0002\u00a2\u0006\u0006\u0008\u00bf\u0001\u0010\u00be\u0001J\u0019\u0010\u00c0\u0001\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:H\u0002\u00a2\u0006\u0005\u0008\u00c0\u0001\u0010=J\u0015\u0010\u00c1\u0001\u001a\u00020\u001b*\u00020:H\u0002\u00a2\u0006\u0005\u0008\u00c1\u0001\u0010=R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0003\u0010\u00c2\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0005\u0010\u00c3\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0007\u0010\u00c4\u0001R\u0015\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\t\u0010\u00c5\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u000b\u0010\u00c6\u0001R\u001b\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u000e\u0010\u00c7\u0001R%\u0010\u00c9\u0001\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0005\u0012\u00030\u0094\u00010\u00c8\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00c9\u0001\u0010\u00ca\u0001R+\u0010\u00cc\u0001\u001a\u0016\u0012\u0004\u0012\u00020.\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020.0\u00cb\u00010\u00c8\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00cc\u0001\u0010\u00ca\u0001R!\u0010\u00d2\u0001\u001a\u00030\u00cd\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u00ce\u0001\u0010\u00cf\u0001\u001a\u0006\u0008\u00d0\u0001\u0010\u00d1\u0001R$\u0010\u00d4\u0001\u001a\u000f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020@0\u00d3\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d4\u0001\u0010\u00d5\u0001R\u0018\u0010\u00d7\u0001\u001a\u00030\u00d6\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d7\u0001\u0010\u00d8\u0001\u00a8\u0006\u00da\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;",
        "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;",
        "mutableState",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "globalMutableState",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;",
        "searchLogic",
        "Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;",
        "attachmentUrlValidator",
        "Lkotlin/Function0;",
        "",
        "now",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;Lc93/a;Lbc3/c0;)V",
        "Lio/getstream/chat/android/client/channel/state/ChannelState;",
        "channelState",
        "()Lio/getstream/chat/android/client/channel/state/ChannelState;",
        "writeChannelState",
        "()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/ChannelData;",
        "update",
        "Ll83/a0;",
        "updateChannelData",
        "(Lkotlin/jvm/functions/Function1;)V",
        "Lio/getstream/chat/android/models/Member;",
        "membership",
        "updateMembership",
        "(Lio/getstream/chat/android/models/Member;)V",
        "member",
        "addMembership",
        "removeMembership",
        "()V",
        "Lio/getstream/chat/android/client/events/HasChannel;",
        "event",
        "(Lio/getstream/chat/android/client/events/HasChannel;)V",
        "Lio/getstream/chat/android/models/ChannelUserRead;",
        "read",
        "updateRead",
        "(Lio/getstream/chat/android/models/ChannelUserRead;)V",
        "updateDelivered",
        "",
        "userId",
        "Lio/getstream/chat/android/client/events/TypingStartEvent;",
        "setTyping",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/events/TypingStartEvent;)V",
        "",
        "Lio/getstream/chat/android/models/User;",
        "watchers",
        "",
        "watchersCount",
        "setWatchers",
        "(Ljava/util/List;I)V",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "upsertMessage",
        "(Lio/getstream/chat/android/models/Message;)V",
        "delsertPinnedMessage",
        "messages",
        "",
        "shouldRefreshMessages",
        "upsertMessages",
        "(Ljava/util/List;Z)V",
        "upsertPinnedMessages",
        "getAllReplies",
        "(Lio/getstream/chat/android/models/Message;)Ljava/util/List;",
        "deleteMessage",
        "Ljava/util/Date;",
        "date",
        "systemMessage",
        "removeMessagesBefore",
        "(Ljava/util/Date;Lio/getstream/chat/android/models/Message;)V",
        "Lio/getstream/chat/android/models/PushPreference;",
        "preference",
        "setPushPreference",
        "(Lio/getstream/chat/android/models/PushPreference;)V",
        "hard",
        "deletedAt",
        "deleteMessagesFromUser",
        "(Ljava/lang/String;ZLjava/util/Date;)V",
        "hideMessagesBefore",
        "(Ljava/util/Date;)V",
        "user",
        "upsertUserPresence",
        "(Lio/getstream/chat/android/models/User;)V",
        "upsertMember",
        "members",
        "upsertMembers",
        "(Ljava/util/List;)V",
        "membersCount",
        "setMembers",
        "deleteMember",
        "memberUserId",
        "banned",
        "banExpires",
        "shadow",
        "updateMemberBanned",
        "(Ljava/lang/String;ZLjava/util/Date;Z)V",
        "deleteDate",
        "deleteChannel",
        "Lio/getstream/chat/android/client/events/UserStartWatchingEvent;",
        "upsertWatcher",
        "(Lio/getstream/chat/android/client/events/UserStartWatchingEvent;)V",
        "Lio/getstream/chat/android/client/events/UserStopWatchingEvent;",
        "deleteWatcher",
        "(Lio/getstream/chat/android/client/events/UserStopWatchingEvent;)V",
        "hidden",
        "setHidden",
        "(Z)V",
        "repliedMessage",
        "setRepliedMessage",
        "markRead",
        "()Z",
        "isMuted",
        "updateMute",
        "Lio/getstream/chat/android/models/Channel;",
        "channel",
        "messageLimit",
        "scrollUpdate",
        "isNotificationUpdate",
        "isChannelsStateUpdate",
        "isWatchChannel",
        "updateDataForChannel",
        "(Lio/getstream/chat/android/models/Channel;IZZZZZ)V",
        "c",
        "updateOldMessagesFromChannel",
        "(Lio/getstream/chat/android/models/Channel;)V",
        "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
        "request",
        "propagateChannelQuery",
        "(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)V",
        "Ln23/e;",
        "error",
        "propagateQueryError",
        "(Ln23/e;)V",
        "syncMuteState$stream_chat_android_client_release",
        "syncMuteState",
        "addMember",
        "loadingNewestMessages",
        "loadingNewerMessages",
        "loadingOlderMessages",
        "eventReceivedDate",
        "updateCurrentUserRead",
        "Lio/getstream/chat/android/models/Poll;",
        "poll",
        "upsertPoll",
        "(Lio/getstream/chat/android/models/Poll;)V",
        "deletePoll",
        "pollId",
        "getPoll",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;",
        "channelMessageCount",
        "updateMessageCount",
        "(I)V",
        "updateLastMessageAt",
        "reads",
        "updateReads",
        "localRead",
        "serverRead",
        "mergeCurrentUserRead",
        "(Lio/getstream/chat/android/models/ChannelUserRead;Lio/getstream/chat/android/models/ChannelUserRead;)Lio/getstream/chat/android/models/ChannelUserRead;",
        "",
        "rawTypingEvents",
        "Lio/getstream/chat/android/models/TypingEvent;",
        "typingEvent",
        "updateTypingStates",
        "(Ljava/util/Map;Lio/getstream/chat/android/models/TypingEvent;)V",
        "upsertWatchers",
        "quotedMessage",
        "normalizeReplyMessages",
        "upsertCachedMessages",
        "parseCachedMessages",
        "(Ljava/util/List;)Ljava/util/Map;",
        "isInsideSearch",
        "isScrollUpdate",
        "shouldUpsertMessages",
        "(ZZZZZZ)Z",
        "noMoreMessages",
        "determinePaginationEnd",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Z)V",
        "currentMessage",
        "newMessage",
        "isMessageNewerThanCurrent",
        "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z",
        "lastUpdateTime",
        "(Lio/getstream/chat/android/models/Message;)J",
        "lastLocalUpdateTime",
        "addQuotedMessage",
        "storePoll",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;",
        "Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;",
        "Lc93/a;",
        "",
        "polls",
        "Ljava/util/Map;",
        "",
        "messageIdsWithPoll",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "La0/a0;",
        "processedMessageIds",
        "La0/a0;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;",
        "typingEventPruner",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;",
        "Companion",
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


# static fields
.field private static final CACHE_SIZE:I = 0x64

.field private static final Companion:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic$Companion;

.field private static final TAG:Ljava/lang/String; = "Chat:ChannelStateLogic"

.field private static final TEXT_LIMIT:I = 0xa


# instance fields
.field private final attachmentUrlValidator:Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;

.field private final clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

.field private final globalMutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

.field private final logger$delegate:Ll83/h;

.field private final messageIdsWithPoll:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

.field private final now:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final polls:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Poll;",
            ">;"
        }
    .end annotation
.end field

.field private final processedMessageIds:La0/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La0/a0;"
        }
    .end annotation
.end field

.field private final searchLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;

.field private final typingEventPruner:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->Companion:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic$Companion;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;Lc93/a;Lbc3/c0;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/setup/state/ClientState;",
            "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;",
            "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;",
            "Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;",
            "Lc93/a;",
            "Lbc3/c0;",
            ")V"
        }
    .end annotation

    const-string v0, "clientState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mutableState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "globalMutableState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchLogic"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachmentUrlValidator"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->globalMutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->searchLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->attachmentUrlValidator:Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;

    .line 7
    iput-object p6, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->now:Lc93/a;

    .line 8
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->polls:Ljava/util/Map;

    .line 9
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->messageIdsWithPoll:Ljava/util/Map;

    .line 10
    const-string p1, "Chat:ChannelStateLogic"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->logger$delegate:Ll83/h;

    .line 11
    new-instance p1, La0/a0;

    const/16 p3, 0x64

    invoke-direct {p1, p3}, La0/a0;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->processedMessageIds:La0/a0;

    .line 12
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getChannelId()Ljava/lang/String;

    move-result-object v1

    .line 13
    new-instance v5, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic$typingEventPruner$1;

    invoke-direct {v5, p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic$typingEventPruner$1;-><init>(Ljava/lang/Object;)V

    .line 14
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-wide/16 v3, 0x0

    move-object v2, p7

    invoke-direct/range {v0 .. v7}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;-><init>(Ljava/lang/String;Lbc3/c0;JLc93/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->typingEventPruner:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;

    .line 15
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->syncMuteState$stream_chat_android_client_release()V

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;Lc93/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_0

    .line 16
    new-instance v0, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;-><init>(Lio/getstream/chat/android/client/helpers/AttachmentHelper;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v0

    goto :goto_0

    :cond_0
    move-object/from16 v8, p5

    :goto_0
    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_1

    .line 17
    new-instance v0, Lio/getstream/chat/android/client/k;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/k;-><init>(I)V

    move-object v9, v0

    :goto_1
    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    move-object/from16 v10, p7

    goto :goto_2

    :cond_1
    move-object/from16 v9, p6

    goto :goto_1

    .line 18
    :goto_2
    invoke-direct/range {v3 .. v10}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;-><init>(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;Lc93/a;Lbc3/c0;)V

    return-void
.end method

.method private static final _init_$lambda$0()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic a(Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->removeMembership$lambda$7(Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateTypingStates(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;Ljava/util/Map;Lio/getstream/chat/android/models/TypingEvent;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateTypingStates(Ljava/util/Map;Lio/getstream/chat/android/models/TypingEvent;)V

    return-void
.end method

.method private static final addMembership$lambda$6(Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 24

    if-eqz p1, :cond_0

    const v22, 0xfbfff

    const/16 v23, 0x0

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

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v16, p0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v23}, Lio/getstream/chat/android/models/ChannelData;->copy$default(Lio/getstream/chat/android/models/ChannelData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private final addQuotedMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getReplyTo()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getReplyMessageId()Ljava/lang/String;

    move-result-object v0

    :cond_1
    if-eqz v0, :cond_2

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->addQuotedMessage(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/models/Message;ZLio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateLastMessageAt$lambda$56(Lio/getstream/chat/android/models/Message;ZLio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->addMembership$lambda$6(Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateMembership$lambda$5(Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p0

    return-object p0
.end method

.method private final determinePaginationEnd(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Z)V
    .locals 2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isFilteringMessages()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setEndOfOlderMessages(Z)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setEndOfNewerMessages(Z)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isFilteringAroundIdMessages()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setEndOfOlderMessages(Z)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setEndOfNewerMessages(Z)V

    return-void

    :cond_1
    if-eqz p2, :cond_3

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isFilteringNewerMessages()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setEndOfNewerMessages(Z)V

    return-void

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setEndOfOlderMessages(Z)V

    :cond_3
    return-void
.end method

.method public static synthetic e(ILio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateMessageCount$lambda$55(ILio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lio/getstream/chat/android/models/PushPreference;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->setPushPreference$lambda$33(Lio/getstream/chat/android/models/PushPreference;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lio/getstream/chat/android/client/events/HasChannel;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateChannelData$lambda$9(Lio/getstream/chat/android/client/events/HasChannel;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p0

    return-object p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final isMessageNewerThanCurrent(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z
    .locals 4

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_2

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->lastUpdateTime(Lio/getstream/chat/android/models/Message;)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    :goto_0
    invoke-direct {p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->lastUpdateTime(Lio/getstream/chat/android/models/Message;)J

    move-result-wide p1

    cmp-long p1, v0, p1

    if-gtz p1, :cond_1

    return v3

    :cond_1
    return v2

    :cond_2
    if-eqz p1, :cond_3

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->lastLocalUpdateTime(Lio/getstream/chat/android/models/Message;)J

    move-result-wide v0

    goto :goto_1

    :cond_3
    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    :goto_1
    invoke-direct {p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->lastLocalUpdateTime(Lio/getstream/chat/android/models/Message;)J

    move-result-wide p1

    cmp-long p1, v0, p1

    if-gtz p1, :cond_4

    return v3

    :cond_4
    return v2
.end method

.method private final lastLocalUpdateTime(Lio/getstream/chat/android/models/Message;)J
    .locals 3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUpdatedLocallyAt()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getDeletedAt()Ljava/util/Date;

    move-result-object p1

    filled-new-array {v0, v1, p1}, [Ljava/util/Date;

    move-result-object p1

    invoke-static {p1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lm83/s;->S0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_1
    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    return-wide v0
.end method

.method private final lastUpdateTime(Lio/getstream/chat/android/models/Message;)J
    .locals 3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getCreatedAt()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUpdatedAt()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getDeletedAt()Ljava/util/Date;

    move-result-object p1

    filled-new-array {v0, v1, p1}, [Ljava/util/Date;

    move-result-object p1

    invoke-static {p1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lm83/s;->S0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_1
    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    return-wide v0
.end method

.method private final mergeCurrentUserRead(Lio/getstream/chat/android/models/ChannelUserRead;Lio/getstream/chat/android/models/ChannelUserRead;)Lio/getstream/chat/android/models/ChannelUserRead;
    .locals 15

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastReceivedEventDate()Ljava/util/Date;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastReceivedEventDate()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastReceivedEventDate()Ljava/util/Date;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastReceivedEventDate()Ljava/util/Date;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getUnreadMessages()I

    move-result v5

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/models/ChannelUserRead;->getUnreadMessages()I

    move-result v6

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "[updateReads] Local read state is more recent, preserving: local.lastReceivedEventDate="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", server.lastReceivedEventDate="

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", local.unreadMessages="

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", server.unreadMessages="

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v3, v2, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/models/ChannelUserRead;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastRead()Ljava/util/Date;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastRead()Ljava/util/Date;

    move-result-object v1

    invoke-static {v0, v1}, Lq83/g;->M(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/util/Date;

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastReadMessageId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastReadMessageId()Ljava/lang/String;

    move-result-object v0

    :cond_1
    move-object v10, v0

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastDeliveredAt()Ljava/util/Date;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastDeliveredAt()Ljava/util/Date;

    move-result-object v0

    :cond_2
    move-object v11, v0

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastDeliveredMessageId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastDeliveredMessageId()Ljava/lang/String;

    move-result-object v0

    :cond_3
    move-object v12, v0

    const/4 v13, 0x6

    const/4 v14, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v5, p1

    invoke-static/range {v5 .. v14}, Lio/getstream/chat/android/models/ChannelUserRead;->copy$default(Lio/getstream/chat/android/models/ChannelUserRead;Lio/getstream/chat/android/models/User;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object v0

    return-object v0

    :cond_4
    return-object p2
.end method

.method private final normalizeReplyMessages(Lio/getstream/chat/android/models/Message;)Ljava/util/List;
    .locals 55
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation

    invoke-virtual/range {p0 .. p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->getAllReplies(Lio/getstream/chat/android/models/Message;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

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

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/Message;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v35

    const v53, 0xffff

    const/16 v54, 0x0

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

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

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

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const v52, 0x3fffffff    # 1.9999999f

    move-object/from16 v34, p1

    invoke-static/range {v3 .. v54}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private final parseCachedMessages(Ljava/util/List;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getCachedLatestMessages$stream_chat_android_client_release()Lec3/p1;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->attachmentUrlValidator:Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;

    invoke-virtual {v1, p1, v0}, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;->updateValidAttachmentsUrl$stream_chat_android_client_release(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/models/Message;

    invoke-direct {p0, v4, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->isMessageNewerThanCurrent(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/16 p1, 0xa

    invoke-static {v1, p1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p1

    invoke-static {p1}, Lm83/g0;->W(I)I

    move-result p1

    const/16 v2, 0x10

    if-ge p1, v2, :cond_2

    move p1, v2

    :cond_2
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, p1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-static {v0, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    return-object p1
.end method

.method private static final removeMembership$lambda$7(Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 24

    if-eqz p0, :cond_0

    const v22, 0xfbfff

    const/16 v23, 0x0

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

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v23}, Lio/getstream/chat/android/models/ChannelData;->copy$default(Lio/getstream/chat/android/models/ChannelData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static synthetic removeMessagesBefore$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;Ljava/util/Date;Lio/getstream/chat/android/models/Message;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->removeMessagesBefore(Ljava/util/Date;Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method private static final setPushPreference$lambda$33(Lio/getstream/chat/android/models/PushPreference;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 24

    if-eqz p1, :cond_0

    const v22, 0xdffff

    const/16 v23, 0x0

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

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v19, p0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v23}, Lio/getstream/chat/android/models/ChannelData;->copy$default(Lio/getstream/chat/android/models/ChannelData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private final shouldUpsertMessages(ZZZZZZ)Z
    .locals 0

    if-nez p6, :cond_2

    if-nez p4, :cond_2

    if-nez p3, :cond_2

    if-eqz p1, :cond_0

    if-eqz p2, :cond_2

    :cond_0
    if-eqz p5, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getMessages()Lec3/f2;

    move-result-object p1

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private final storePoll(Lio/getstream/chat/android/models/Message;)V
    .locals 4

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertPoll(Lio/getstream/chat/android/models/Poll;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->messageIdsWithPoll:Ljava/util/Map;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->messageIdsWithPoll:Ljava/util/Map;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_0

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method private final updateChannelData(Lio/getstream/chat/android/models/Channel;)V
    .locals 24

    move-object/from16 v0, p0

    .line 1
    invoke-static/range {p1 .. p1}, Lio/getstream/chat/android/models/ChannelKt;->toChannelData(Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object v1

    .line 2
    invoke-virtual {v1}, Lio/getstream/chat/android/models/ChannelData;->getOwnCapabilities()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    .line 3
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getChannelData()Lec3/f2;

    move-result-object v2

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/ChannelData;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelData;->getOwnCapabilities()Ljava/util/Set;

    move-result-object v15

    const v22, 0xfdfff

    const/16 v23, 0x0

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

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v1 .. v23}, Lio/getstream/chat/android/models/ChannelData;->copy$default(Lio/getstream/chat/android/models/ChannelData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object v1

    .line 4
    :cond_0
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setChannelData(Lio/getstream/chat/android/models/ChannelData;)V

    return-void
.end method

.method private static final updateChannelData$lambda$9(Lio/getstream/chat/android/client/events/HasChannel;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 0

    invoke-interface {p0}, Lio/getstream/chat/android/client/events/HasChannel;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object p0

    invoke-static {p0}, Lio/getstream/chat/android/models/ChannelKt;->toChannelData(Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p0

    if-eqz p1, :cond_1

    invoke-static {p1, p0}, Lio/getstream/chat/android/models/ChannelDataKt;->mergeFromEvent(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static synthetic updateDataForChannel$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;Lio/getstream/chat/android/models/Channel;IZZZZZILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p9, p8, 0x4

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move p3, v0

    :cond_0
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_1

    move p4, v0

    :cond_1
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_2

    move p5, v0

    :cond_2
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_3

    move p6, v0

    :cond_3
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_4

    move p7, v0

    :cond_4
    invoke-virtual/range {p0 .. p7}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateDataForChannel(Lio/getstream/chat/android/models/Channel;IZZZZZ)V

    return-void
.end method

.method private static final updateLastMessageAt$lambda$56(Lio/getstream/chat/android/models/Message;ZLio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 25

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/models/ChannelData;->getLastMessageAt()Ljava/util/Date;

    move-result-object v1

    :goto_0
    move-object/from16 v2, p0

    move/from16 v3, p1

    goto :goto_1

    :cond_0
    move-object v1, v0

    goto :goto_0

    :goto_1
    invoke-static {v2, v1, v3}, Lio/getstream/chat/android/client/utils/channel/ChannelUtilsKt;->calculateNewLastMessageAt(Lio/getstream/chat/android/models/Message;Ljava/util/Date;Z)Ljava/util/Date;

    move-result-object v1

    if-eqz p2, :cond_1

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/models/ChannelData;->getLastMessageAt()Ljava/util/Date;

    move-result-object v2

    goto :goto_2

    :cond_1
    move-object v2, v0

    :goto_2
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    if-eqz p2, :cond_2

    const v23, 0x7ffff

    const/16 v24, 0x0

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

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v2, p2

    move-object/from16 v22, v1

    invoke-static/range {v2 .. v24}, Lio/getstream/chat/android/models/ChannelData;->copy$default(Lio/getstream/chat/android/models/ChannelData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object v0

    :cond_2
    return-object v0

    :cond_3
    return-object p2
.end method

.method private static final updateMembership$lambda$5(Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 29

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/models/ChannelData;->getMembership()Lio/getstream/chat/android/models/Member;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_1
    move-object v1, v0

    :goto_1
    if-nez v1, :cond_3

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/models/ChannelData;->getMembership()Lio/getstream/chat/android/models/Member;

    move-result-object v1

    invoke-direct/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v3

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :cond_2
    move-object v6, v0

    :goto_2
    const-string v7, ") != curMembershipUserId("

    const-string v8, ")"

    const-string v9, "[updateMembership] rejected; newMembershipUserId("

    invoke-static {v9, v3, v7, v6, v8}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v5, v4, v3, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    move-object/from16 v21, v1

    const v27, 0xfbfff

    const/16 v28, 0x0

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

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v6, p2

    invoke-static/range {v6 .. v28}, Lio/getstream/chat/android/models/ChannelData;->copy$default(Lio/getstream/chat/android/models/ChannelData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object v0

    :cond_4
    return-object v0
.end method

.method private static final updateMessageCount$lambda$55(ILio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 24

    if-eqz p1, :cond_0

    invoke-static/range {p0 .. p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    const v22, 0xeffff

    const/16 v23, 0x0

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

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v23}, Lio/getstream/chat/android/models/ChannelData;->copy$default(Lio/getstream/chat/android/models/ChannelData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private final updateReads(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    const-string v6, "[updateReads] cid: "

    const-string v7, ", reads.size: "

    invoke-static {v5, v6, v1, v7}, Lm4/a;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {v0}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/User;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getRead()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/ChannelUserRead;

    if-eqz v4, :cond_4

    if-eqz v0, :cond_4

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/ChannelUserRead;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelUserRead;->getUserId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-direct {p0, v0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mergeCurrentUserRead(Lio/getstream/chat/android/models/ChannelUserRead;Lio/getstream/chat/android/models/ChannelUserRead;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object v2

    :cond_2
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    move-object p1, v1

    :cond_4
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->upsertReads(Ljava/util/List;)V

    return-void
.end method

.method private final updateTypingStates(Ljava/util/Map;Lio/getstream/chat/android/models/TypingEvent;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/events/TypingStartEvent;",
            ">;",
            "Lio/getstream/chat/android/models/TypingEvent;",
            ")V"
        }
    .end annotation

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->updateTypingEvent(Lio/getstream/chat/android/models/TypingEvent;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->globalMutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getCid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->tryEmitTypingEvent(Ljava/lang/String;Lio/getstream/chat/android/models/TypingEvent;)V

    return-void
.end method

.method private final upsertCachedMessages(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->parseCachedMessages(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->updateCachedLatestMessages(Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic upsertMessages$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;Ljava/util/List;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertMessages(Ljava/util/List;Z)V

    return-void
.end method

.method private final upsertWatchers(Ljava/util/List;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;I)V"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->upsertWatchers(Ljava/util/List;I)V

    return-void
.end method


# virtual methods
.method public final addMember(Lio/getstream/chat/android/models/Member;)V
    .locals 1

    const-string v0, "member"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->addMember(Lio/getstream/chat/android/models/Member;)V

    return-void
.end method

.method public final addMembership(Lio/getstream/chat/android/models/Member;)V
    .locals 3

    const-string v0, "member"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/c;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/c;-><init>(Lio/getstream/chat/android/models/Member;I)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->updateChannelData(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final channelState()Lio/getstream/chat/android/client/channel/state/ChannelState;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    return-object v0
.end method

.method public final deleteChannel(Ljava/util/Date;)V
    .locals 25

    const-string v0, "deleteDate"

    move-object/from16 v11, p1

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getChannelData()Lec3/f2;

    move-result-object v2

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/ChannelData;

    const v22, 0xffdff

    const/16 v23, 0x0

    move-object v3, v1

    move-object v1, v2

    const/4 v2, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v12, v10

    const/4 v10, 0x0

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

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v24, v21

    const/16 v21, 0x0

    move-object/from16 v0, v24

    invoke-static/range {v1 .. v23}, Lio/getstream/chat/android/models/ChannelData;->copy$default(Lio/getstream/chat/android/models/ChannelData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setChannelData(Lio/getstream/chat/android/models/ChannelData;)V

    return-void
.end method

.method public final deleteMember(Lio/getstream/chat/android/models/Member;)V
    .locals 1

    const-string v0, "member"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->deleteMember(Lio/getstream/chat/android/models/Member;)V

    return-void
.end method

.method public final deleteMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->deleteMessage(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public final deleteMessagesFromUser(Ljava/lang/String;ZLjava/util/Date;)V
    .locals 55

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "userId"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "deletedAt"

    move-object/from16 v3, p3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getMessagesFromUser(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_1

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->deleteMessages(Ljava/util/List;)V

    return-void

    :cond_1
    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/models/Message;

    const v53, 0xffff

    const/16 v54, 0x0

    move-object v3, v4

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

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

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

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const v52, -0x100001

    move-object/from16 v24, p3

    invoke-static/range {v3 .. v54}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v3, p3

    goto :goto_0

    :cond_2
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->upsertMessages(Ljava/util/Collection;)V

    return-void
.end method

.method public final deletePoll(Lio/getstream/chat/android/models/Poll;)V
    .locals 57

    move-object/from16 v0, p0

    const-string v1, "poll"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->polls:Ljava/util/Map;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->messageIdsWithPoll:Ljava/util/Map;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    if-eqz v1, :cond_1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v5

    if-eqz v5, :cond_0

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    const v55, 0xfbff

    const/16 v56, 0x0

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

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

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

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, -0x1

    invoke-static/range {v5 .. v56}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v4

    invoke-virtual {v3, v4}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->upsertMessage(Lio/getstream/chat/android/models/Message;)V

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->messageIdsWithPoll:Ljava/util/Map;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final deleteWatcher(Lio/getstream/chat/android/client/events/UserStopWatchingEvent;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UserStopWatchingEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UserStopWatchingEvent;->getWatcherCount()I

    move-result p1

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->deleteWatcher$stream_chat_android_client_release(Lio/getstream/chat/android/models/User;I)V

    return-void
.end method

.method public final delsertPinnedMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 12

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v1

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->now:Lc93/a;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getPinExpires()Ljava/util/Date;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    invoke-interface {v5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    cmp-long v5, v6, v8

    if-gez v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    move v5, v4

    :goto_0
    invoke-static {p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v6

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v8

    const-string v9, ", pinExpired: "

    const-string v10, ", deleted: "

    const-string v11, "[delsertPinnedMessage] pinned: "

    invoke-static {v11, v9, v10, v1, v5}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, ", message.id: "

    const-string v9, ", message.text: "

    invoke-static {v1, v6, v5, v7, v9}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x0

    invoke-interface {v0, v2, v3, v1, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->now:Lc93/a;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getPinExpires()Ljava/util/Date;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    cmp-long v0, v1, v5

    if-gez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertPinnedMessages(Ljava/util/List;Z)V

    return-void

    :cond_3
    :goto_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->deletePinnedMessage(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public final getAllReplies(Lio/getstream/chat/android/models/Message;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getQuotedMessagesMap()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_2

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getPoll(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;
    .locals 1

    const-string v0, "pollId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->polls:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Poll;

    return-object p1
.end method

.method public final hideMessagesBefore(Ljava/util/Date;)V
    .locals 1

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setHideMessagesBefore(Ljava/util/Date;)V

    return-void
.end method

.method public final loadingNewerMessages()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setLoadingNewerMessages(Z)V

    return-void
.end method

.method public final loadingNewestMessages()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->resetMessageLimit$stream_chat_android_client_release()V

    return-void
.end method

.method public final loadingOlderMessages()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setLoadingOlderMessages(Z)V

    return-void
.end method

.method public final markRead()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->markChannelAsRead()Z

    move-result v0

    return v0
.end method

.method public final propagateChannelQuery(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)V
    .locals 13

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[propagateChannelQuery] cid: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", request: "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {p2}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messagesLimit()I

    move-result v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    if-le v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    invoke-virtual {p2}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isNotificationUpdate()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messagesLimit()I

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->searchLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;

    invoke-virtual {v1, p2, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;->handleMessageBounds(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Z)V

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setRecoveryNeeded(Z)V

    invoke-direct {p0, p2, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->determinePaginationEnd(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Z)V

    :cond_2
    invoke-virtual {p2}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->getShouldRefresh()Z

    move-result v6

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isFilteringMessages()Z

    move-result v7

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isNotificationUpdate()Z

    move-result v8

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messagesLimit()I

    move-result v5

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isWatchChannel()Z

    move-result v10

    const/16 v11, 0x20

    const/4 v12, 0x0

    const/4 v9, 0x0

    move-object v3, p0

    move-object v4, p1

    invoke-static/range {v3 .. v12}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateDataForChannel$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;Lio/getstream/chat/android/models/Channel;IZZZZZILjava/lang/Object;)V

    return-void
.end method

.method public final propagateQueryError(Ln23/e;)V
    .locals 7

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->isPermanent(Ln23/e;)Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "Chat:ChannelStateLogic"

    if-eqz v0, :cond_0

    sget-object v0, Lb23/i;->a:Lb23/i;

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v0, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lb23/i;->c:Lb23/j;

    iget-object v4, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v4}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getCid()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Permanent failure calling channel.watch for channel "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", with error "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v3, v2, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lb23/i;->a:Lb23/i;

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v0, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lb23/i;->c:Lb23/j;

    iget-object v4, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v4}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getCid()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Temporary failure calling channel.watch for channel "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ". Marking the channel as needing recovery. Error was "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v3, v2, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setRecoveryNeeded(Z)V

    :cond_2
    :goto_0
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setLoadingOlderMessages(Z)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setLoadingNewerMessages(Z)V

    return-void
.end method

.method public final removeMembership()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    new-instance v1, Lio/getstream/chat/android/client/api/state/a;

    const/16 v2, 0x17

    invoke-direct {v1, v2}, Lio/getstream/chat/android/client/api/state/a;-><init>(I)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->updateChannelData(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final removeMessagesBefore(Ljava/util/Date;Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->removeMessagesBefore(Ljava/util/Date;)V

    if-eqz p2, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->upsertMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_0
    return-void
.end method

.method public final setHidden(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setHidden(Z)V

    return-void
.end method

.method public final setMembers(Ljava/util/List;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;I)V"
        }
    .end annotation

    const-string v0, "members"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setMembers(Ljava/util/List;I)V

    return-void
.end method

.method public final setPushPreference(Lio/getstream/chat/android/models/PushPreference;)V
    .locals 2

    const-string v0, "preference"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/b;-><init>(Lio/getstream/chat/android/models/PushPreference;I)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateChannelData(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final setRepliedMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setRepliedMessage(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public final setTyping(Ljava/lang/String;Lio/getstream/chat/android/client/events/TypingStartEvent;)V
    .locals 1

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {v0}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/User;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->typingEventPruner:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->processEvent(Ljava/lang/String;Lio/getstream/chat/android/client/events/TypingStartEvent;)V

    :cond_1
    return-void
.end method

.method public final setWatchers(Ljava/util/List;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;I)V"
        }
    .end annotation

    const-string v0, "watchers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setWatchers(Ljava/util/List;I)V

    return-void
.end method

.method public final syncMuteState$stream_chat_android_client_release()V
    .locals 8

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getCid()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->globalMutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->getChannelMutes()Lec3/f2;

    move-result-object v1

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    instance-of v2, v1, Ljava/util/Collection;

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/ChannelMute;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelMute;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_2
    move-object v2, v3

    :goto_0
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v4, 0x1

    :cond_3
    :goto_1
    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v5, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[syncMuteState] cid: "

    const-string v7, ", isMuted: "

    invoke-static {v2, v0, v7, v4}, Ld13/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v6, v5, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    invoke-virtual {p0, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateMute(Z)V

    return-void
.end method

.method public final updateChannelData(Lio/getstream/chat/android/client/events/HasChannel;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/a;-><init>(Lio/getstream/chat/android/client/events/HasChannel;I)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->updateChannelData(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final updateChannelData(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "update"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->updateChannelData(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final updateCurrentUserRead(Ljava/util/Date;Lio/getstream/chat/android/models/Message;)V
    .locals 11

    const-string v0, "eventReceivedDate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->processedMessageIds:La0/a0;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, La0/a0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getMuted()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->processedMessageIds:La0/a0;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getShowInChannel()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->processedMessageIds:La0/a0;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {v2}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object v2

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/User;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_3
    move-object v2, v3

    :goto_0
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->processedMessageIds:La0/a0;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_4
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->globalMutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->getMuted()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_5

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Mute;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Mute;->getTarget()Lio/getstream/chat/android/models/User;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_7
    move-object v1, v3

    :goto_1
    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->processedMessageIds:La0/a0;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2, v0}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_8
    :goto_2
    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getShadowed()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->processedMessageIds:La0/a0;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2, v0}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_9
    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getSilent()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->processedMessageIds:La0/a0;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2, v0}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_a
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getRead()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/models/ChannelUserRead;

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastReceivedEventDate()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->processedMessageIds:La0/a0;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2, v0}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_b
    if-eqz v1, :cond_c

    invoke-virtual {v1}, Lio/getstream/chat/android/models/ChannelUserRead;->getUnreadMessages()I

    move-result v0

    add-int/lit8 v4, v0, 0x1

    const/16 v9, 0x79

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v10}, Lio/getstream/chat/android/models/ChannelUserRead;->copy$default(Lio/getstream/chat/android/models/ChannelUserRead;Lio/getstream/chat/android/models/User;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateRead(Lio/getstream/chat/android/models/ChannelUserRead;)V

    :cond_c
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->processedMessageIds:La0/a0;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2, v0}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final updateDataForChannel(Lio/getstream/chat/android/models/Channel;IZZZZZ)V
    .locals 7

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v1

    const-string v4, ", messageLimit: "

    const-string v5, ", shouldRefreshMessages: "

    const-string v6, "[updateDataForChannel] cid: "

    invoke-static {p2, v6, v1, v4, v5}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, ", scrollUpdate: "

    const-string v5, ", isNotificationUpdate: "

    invoke-static {v1, p3, v4, p4, v5}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v4, ", isChannelsStateUpdate: "

    const-string v5, ", isWatchChannel: "

    invoke-static {v1, p5, v4, p6, v5}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v1, p7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateChannelData(Lio/getstream/chat/android/models/Channel;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMemberCount()I

    move-result v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setMembersCount(I)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getRead()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateReads(Ljava/util/List;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertMembers(Ljava/util/List;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getWatchers()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getWatcherCount()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertWatchers(Ljava/util/List;I)V

    if-eqz p2, :cond_4

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getInsideSearch()Lec3/f2;

    move-result-object p2

    invoke-interface {p2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    move-object v0, p0

    move v4, p3

    move v3, p4

    move v1, p5

    move v5, p6

    move v6, p7

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->shouldUpsertMessages(ZZZZZZ)Z

    move-result p2

    const/16 p3, 0xa

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getPendingMessages()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    new-instance p4, Ljava/util/ArrayList;

    invoke-static {p2, p3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p4, p3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lio/getstream/chat/android/models/PendingMessage;

    invoke-virtual {p3}, Lio/getstream/chat/android/models/PendingMessage;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-static {p2, p4}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p0, p2, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertMessages(Ljava/util/List;Z)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getPinnedMessages()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p2, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertPinnedMessages(Ljava/util/List;Z)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getPendingMessages()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    new-instance p4, Ljava/util/ArrayList;

    invoke-static {p2, p3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p4, p3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lio/getstream/chat/android/models/PendingMessage;

    invoke-virtual {p3}, Lio/getstream/chat/android/models/PendingMessage;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getPinnedMessages()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    invoke-static {p2, p3}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-static {p2, p4}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertCachedMessages(Ljava/util/List;)V

    goto :goto_2

    :cond_4
    move-object v0, p0

    :goto_2
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getConfig()Lio/getstream/chat/android/models/Config;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setChannelConfig(Lio/getstream/chat/android/models/Config;)V

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setLoadingOlderMessages(Z)V

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setLoadingNewerMessages(Z)V

    return-void
.end method

.method public final updateDelivered(Lio/getstream/chat/android/models/ChannelUserRead;)V
    .locals 1

    const-string v0, "read"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->upsertDelivered(Lio/getstream/chat/android/models/ChannelUserRead;)V

    return-void
.end method

.method public final updateLastMessageAt(Lio/getstream/chat/android/models/Message;)V
    .locals 3

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getChannelConfig()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Config;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getSkipLastMsgUpdateForSystemMsgs()Z

    move-result v0

    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/d;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/d;-><init>(Lio/getstream/chat/android/models/Message;ZI)V

    invoke-virtual {p0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateChannelData(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final updateMemberBanned(Ljava/lang/String;ZLjava/util/Date;Z)V
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getMembers()Lec3/f2;

    move-result-object v2

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v6, p1

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const/4 v7, 0x1

    if-ne v4, v7, :cond_0

    const/16 v21, 0x773f

    const/16 v22, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move/from16 v13, p2

    move-object/from16 v17, p3

    move/from16 v12, p4

    invoke-static/range {v5 .. v22}, Lio/getstream/chat/android/models/Member;->copy$default(Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/User;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Member;

    move-result-object v5

    goto :goto_1

    :cond_0
    if-nez v4, :cond_1

    :goto_1
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_2
    invoke-virtual {v1, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->upsertMembers(Ljava/util/List;)V

    return-void
.end method

.method public final updateMembership(Lio/getstream/chat/android/models/Member;)V
    .locals 3

    const-string v0, "membership"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;

    const/16 v2, 0xc

    invoke-direct {v1, v2, p1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->updateChannelData(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final updateMessageCount(I)V
    .locals 2

    new-instance v0, Lcom/whoop/data/local/room/dao/persistent/e;

    const/16 v1, 0x11

    invoke-direct {v0, p1, v1}, Lcom/whoop/data/local/room/dao/persistent/e;-><init>(II)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateChannelData(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final updateMute(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setMuted(Z)V

    return-void
.end method

.method public final updateOldMessagesFromChannel(Lio/getstream/chat/android/models/Channel;)V
    .locals 2

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getHiddenMessagesBefore()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setHideMessagesBefore(Ljava/util/Date;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateChannelData(Lio/getstream/chat/android/models/Channel;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getRead()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateReads(Ljava/util/List;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMemberCount()I

    move-result v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setMembersCount(I)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertMembers(Ljava/util/List;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getWatchers()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getWatcherCount()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertWatchers(Ljava/util/List;I)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertMessages(Ljava/util/List;Z)V

    return-void
.end method

.method public final updateRead(Lio/getstream/chat/android/models/ChannelUserRead;)V
    .locals 1

    const-string v0, "read"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateReads(Ljava/util/List;)V

    return-void
.end method

.method public final upsertMember(Lio/getstream/chat/android/models/Member;)V
    .locals 1

    const-string v0, "member"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertMembers(Ljava/util/List;)V

    return-void
.end method

.method public final upsertMembers(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;)V"
        }
    .end annotation

    const-string v0, "members"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->upsertMembers(Ljava/util/List;)V

    return-void
.end method

.method public final upsertMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 7

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v4

    const-string v5, "[upsertMessage] message.id: "

    const-string v6, ", message.text: "

    invoke-static {v5, v1, v6, v4}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getVisibleMessages$stream_chat_android_client_release()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getInsideSearch()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->parseCachedMessages(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->updateCachedLatestMessages(Ljava/util/Map;)V

    return-void

    :cond_2
    :goto_0
    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertMessages(Ljava/util/List;Z)V

    return-void
.end method

.method public final upsertMessages(Ljava/util/List;Z)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "messages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Message;

    invoke-static {p1}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Message;

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->y:Lb23/g;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    const/16 v6, 0xa

    if-eqz v3, :cond_2

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v7, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v6, v0}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v7

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v6, v1}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v7

    :goto_1
    const-string v8, ", first: "

    const-string v9, ", last: "

    const-string v10, "[upsertMessages] messages.size: "

    invoke-static {v3, v10, v8, v0, v9}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", shouldRefreshMessages: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v4, v5, v0, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/models/Message;

    invoke-static {v4}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isReply(Lio/getstream/chat/android/models/Message;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-direct {p0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->addQuotedMessage(Lio/getstream/chat/android/models/Message;)V

    goto :goto_3

    :cond_5
    const/4 v1, 0x1

    if-ne p2, v1, :cond_6

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setMessages(Ljava/util/List;)V

    goto/16 :goto_7

    :cond_6
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getMessageList()Lec3/f2;

    move-result-object p1

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-static {p2}, Lm83/g0;->W(I)I

    move-result p2

    const/16 v1, 0x10

    if-ge p2, v1, :cond_7

    move p2, v1

    :cond_7
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, p2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v2, p2

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_8
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_9
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/models/Message;

    invoke-direct {p0, v4, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->isMessageNewerThanCurrent(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->attachmentUrlValidator:Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;

    invoke-virtual {p2, p1, v1}, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;->updateValidAttachmentsUrl$stream_chat_android_client_release(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-direct {p0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->normalizeReplyMessages(Lio/getstream/chat/android/models/Message;)Ljava/util/List;

    move-result-object v2

    if-nez v2, :cond_b

    sget-object v2, Lm83/y;->w:Lm83/y;

    :cond_b
    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_6

    :cond_c
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->upsertMessages(Ljava/util/Collection;)V

    :goto_7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/models/Message;

    invoke-direct {p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->storePoll(Lio/getstream/chat/android/models/Message;)V

    goto :goto_8

    :cond_d
    return-void
.end method

.method public final upsertPinnedMessages(Ljava/util/List;Z)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "messages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Message;

    invoke-static {p1}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Message;

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->y:Lb23/g;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v6, 0x0

    const/16 v7, 0xa

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v7, v0}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v6

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v7, v1}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v6

    :goto_1
    const-string v7, ", first: "

    const-string v8, ", last: "

    const-string v9, "[upsertPinnedMessages] messages.size: "

    invoke-static {v3, v9, v7, v0, v8}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", shouldRefreshMessages: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/models/Message;

    invoke-static {v4}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isReply(Lio/getstream/chat/android/models/Message;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-direct {p0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->addQuotedMessage(Lio/getstream/chat/android/models/Message;)V

    goto :goto_3

    :cond_5
    const/4 v1, 0x1

    if-ne p2, v1, :cond_6

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setPinnedMessages(Ljava/util/List;)V

    goto/16 :goto_7

    :cond_6
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getRawPinnedMessages()Ljava/util/Map;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/models/Message;

    invoke-direct {p0, v4, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->isMessageNewerThanCurrent(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_9
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v4, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->now:Lc93/a;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-static {v3}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v5

    if-nez v5, :cond_9

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getPinExpires()Ljava/util/Date;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    invoke-interface {v4}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    cmp-long v3, v5, v3

    if-gez v3, :cond_a

    goto :goto_5

    :cond_a
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_b
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->attachmentUrlValidator:Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;

    invoke-virtual {p2, v1, p1}, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;->updateValidAttachmentsUrl$stream_chat_android_client_release(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-direct {p0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->normalizeReplyMessages(Lio/getstream/chat/android/models/Message;)Ljava/util/List;

    move-result-object v2

    if-nez v2, :cond_c

    sget-object v2, Lm83/y;->w:Lm83/y;

    :cond_c
    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_6

    :cond_d
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->upsertPinnedMessages(Ljava/util/Collection;)V

    :goto_7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/models/Message;

    invoke-direct {p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->storePoll(Lio/getstream/chat/android/models/Message;)V

    goto :goto_8

    :cond_e
    return-void
.end method

.method public final upsertPoll(Lio/getstream/chat/android/models/Poll;)V
    .locals 54

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "poll"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->polls:Ljava/util/Map;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->messageIdsWithPoll:Ljava/util/Map;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    if-eqz v2, :cond_1

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v53

    :goto_0
    invoke-interface/range {v53 .. v53}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface/range {v53 .. v53}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    const v51, 0xfbff

    const/16 v52, 0x0

    move-object v1, v2

    const/4 v2, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

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

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v23, v22

    const/16 v22, 0x0

    move-object/from16 v24, v23

    const/16 v23, 0x0

    move-object/from16 v25, v24

    const/16 v24, 0x0

    move-object/from16 v26, v25

    const/16 v25, 0x0

    move-object/from16 v27, v26

    const/16 v26, 0x0

    move-object/from16 v28, v27

    const/16 v27, 0x0

    move-object/from16 v29, v28

    const/16 v28, 0x0

    move-object/from16 v30, v29

    const/16 v29, 0x0

    move-object/from16 v31, v30

    const/16 v30, 0x0

    move-object/from16 v32, v31

    const/16 v31, 0x0

    move-object/from16 v33, v32

    const/16 v32, 0x0

    move-object/from16 v34, v33

    const/16 v33, 0x0

    move-object/from16 v35, v34

    const/16 v34, 0x0

    move-object/from16 v36, v35

    const/16 v35, 0x0

    move-object/from16 v37, v36

    const/16 v36, 0x0

    move-object/from16 v38, v37

    const/16 v37, 0x0

    move-object/from16 v39, v38

    const/16 v38, 0x0

    move-object/from16 v40, v39

    const/16 v39, 0x0

    move-object/from16 v41, v40

    const/16 v40, 0x0

    move-object/from16 v42, v41

    const/16 v41, 0x0

    move-object/from16 v43, v42

    const/16 v42, 0x0

    move-object/from16 v44, v43

    const/16 v43, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, -0x1

    move-object/from16 v0, v44

    move-object/from16 v44, p1

    invoke-static/range {v1 .. v52}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->upsertMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_0
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    goto/16 :goto_0

    :cond_1
    return-void
.end method

.method public final upsertUserPresence(Lio/getstream/chat/android/models/User;)V
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->upsertUserPresence(Lio/getstream/chat/android/models/User;)V

    return-void
.end method

.method public final upsertWatcher(Lio/getstream/chat/android/client/events/UserStartWatchingEvent;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UserStartWatchingEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UserStartWatchingEvent;->getWatcherCount()I

    move-result p1

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v1, v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->upsertWatchers(Ljava/util/List;I)V

    return-void
.end method

.method public final writeChannelState()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    return-object v0
.end method
