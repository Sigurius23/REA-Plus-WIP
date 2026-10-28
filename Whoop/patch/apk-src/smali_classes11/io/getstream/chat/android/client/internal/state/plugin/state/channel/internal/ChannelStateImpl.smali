.class public final Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/channel/state/ChannelState;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$Companion;,
        Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$TrimDirection;,
        Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a4\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\'\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008(\u0008\u0000\u0018\u0000 \u00b2\u00022\u00020\u0001:\u0004\u00b3\u0002\u00b2\u0002B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00080\u0005\u0012\u0012\u0010\u000c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0\u0005\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\n0\u0005\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001b\u0010 \u001a\u00020\u001f2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\n\u00a2\u0006\u0004\u0008 \u0010!J\u0015\u0010#\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001b\u00a2\u0006\u0004\u0008#\u0010$J%\u0010\'\u001a\u00020\u001f2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\n2\u0008\u0008\u0002\u0010&\u001a\u00020%\u00a2\u0006\u0004\u0008\'\u0010(J\u0015\u0010)\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001b\u00a2\u0006\u0004\u0008)\u0010$J\u0015\u0010*\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001b\u00a2\u0006\u0004\u0008*\u0010$J)\u0010-\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00022\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0+\u00a2\u0006\u0004\u0008-\u0010.J/\u00102\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u001b2\u0018\u00101\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b00\u00a2\u0006\u0004\u00082\u00103J\u0015\u00104\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u0002\u00a2\u0006\u0004\u00084\u00105J!\u00109\u001a\u00020\u001f2\u0006\u00107\u001a\u0002062\n\u0008\u0002\u00108\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0004\u00089\u0010:J\u0015\u0010;\u001a\u00020\u001f2\u0006\u00107\u001a\u000206\u00a2\u0006\u0004\u0008;\u0010<J%\u0010@\u001a\u00020\u001f2\u0006\u0010=\u001a\u00020\u00022\u0006\u0010>\u001a\u00020%2\u0006\u0010?\u001a\u000206\u00a2\u0006\u0004\u0008@\u0010AJ\u000f\u0010B\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0004\u0008B\u0010CJ\u001b\u0010D\u001a\u00020\u001f2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\n\u00a2\u0006\u0004\u0008D\u0010!J\u001b\u0010E\u001a\u00020\u001f2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\n\u00a2\u0006\u0004\u0008E\u0010!J\u0015\u0010F\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u0002\u00a2\u0006\u0004\u0008F\u00105J\u0017\u0010G\u001a\u00020\u001f2\u0008\u0010\"\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0004\u0008G\u0010$J\u001d\u0010J\u001a\u00020\u001f2\u0006\u0010H\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u0002\u00a2\u0006\u0004\u0008J\u0010KJ\u0015\u0010M\u001a\u00020\u001f2\u0006\u0010L\u001a\u00020\u001b\u00a2\u0006\u0004\u0008M\u0010$J\u0015\u0010N\u001a\u00020\u001f2\u0006\u0010H\u001a\u00020\u0002\u00a2\u0006\u0004\u0008N\u00105J\u0015\u0010P\u001a\u00020\u001f2\u0006\u0010O\u001a\u00020\u001b\u00a2\u0006\u0004\u0008P\u0010$J\u001b\u0010R\u001a\u00020\u001f2\u000c\u0010Q\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\n\u00a2\u0006\u0004\u0008R\u0010!J\u0015\u0010T\u001a\u00020\u001f2\u0006\u0010S\u001a\u00020\u0002\u00a2\u0006\u0004\u0008T\u00105J1\u0010Y\u001a\u00020\u001f2\u0008\u0010U\u001a\u0004\u0018\u00010\u00022\u0006\u0010V\u001a\u00020%2\u0008\u0010W\u001a\u0004\u0018\u0001062\u0006\u0010X\u001a\u00020%\u00a2\u0006\u0004\u0008Y\u0010ZJ\u0015\u0010\\\u001a\u00020\u001f2\u0006\u0010[\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\\\u0010]J\u001b\u0010`\u001a\u00020\u001f2\u000c\u0010_\u001a\u0008\u0012\u0004\u0012\u00020^0\n\u00a2\u0006\u0004\u0008`\u0010!J\u0015\u0010c\u001a\u00020\u001f2\u0006\u0010b\u001a\u00020a\u00a2\u0006\u0004\u0008c\u0010dJ\u0015\u0010f\u001a\u00020\u001f2\u0006\u0010b\u001a\u00020e\u00a2\u0006\u0004\u0008f\u0010gJ\u0015\u0010f\u001a\u00020\u001f2\u0006\u0010b\u001a\u00020h\u00a2\u0006\u0004\u0008f\u0010iJ\u0015\u0010k\u001a\u00020\u001f2\u0006\u0010j\u001a\u00020^\u00a2\u0006\u0004\u0008k\u0010lJ\u001b\u0010m\u001a\u00020\u001f2\u000c\u0010_\u001a\u0008\u0012\u0004\u0012\u00020^0\n\u00a2\u0006\u0004\u0008m\u0010!J\u0015\u0010o\u001a\u00020\u001f2\u0006\u0010n\u001a\u00020^\u00a2\u0006\u0004\u0008o\u0010lJ\r\u0010p\u001a\u00020\u001f\u00a2\u0006\u0004\u0008p\u0010qJ#\u0010t\u001a\u00020\u001f2\u000c\u0010r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010s\u001a\u00020\u000f\u00a2\u0006\u0004\u0008t\u0010uJ\u0015\u0010w\u001a\u00020\u001f2\u0006\u0010b\u001a\u00020v\u00a2\u0006\u0004\u0008w\u0010xJ\u0015\u0010z\u001a\u00020\u001f2\u0006\u0010b\u001a\u00020y\u00a2\u0006\u0004\u0008z\u0010{J#\u0010|\u001a\u00020\u001f2\u000c\u0010r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010s\u001a\u00020\u000f\u00a2\u0006\u0004\u0008|\u0010uJ\u0017\u0010~\u001a\u0004\u0018\u00010}2\u0006\u0010\u001a\u001a\u00020\u0002\u00a2\u0006\u0004\u0008~\u0010\u007fJ\u0019\u0010\u0081\u0001\u001a\u00020\u001f2\u0007\u0010\u0080\u0001\u001a\u00020}\u00a2\u0006\u0006\u0008\u0081\u0001\u0010\u0082\u0001J\u0019\u0010\u0083\u0001\u001a\u00020\u001f2\u0007\u0010\u0080\u0001\u001a\u00020}\u00a2\u0006\u0006\u0008\u0083\u0001\u0010\u0082\u0001J\u001a\u0010\u0086\u0001\u001a\u00020\u001f2\u0008\u0010\u0085\u0001\u001a\u00030\u0084\u0001\u00a2\u0006\u0006\u0008\u0086\u0001\u0010\u0087\u0001J\u001f\u0010\u0089\u0001\u001a\u00020\u001f2\u000e\u0010\u0088\u0001\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010\n\u00a2\u0006\u0005\u0008\u0089\u0001\u0010!J \u0010\u008b\u0001\u001a\u00020\u001f2\u0007\u0010\u008a\u0001\u001a\u0002062\u0006\u0010\"\u001a\u00020\u001b\u00a2\u0006\u0005\u0008\u008b\u0001\u0010:J\u0010\u0010\u008c\u0001\u001a\u00020%\u00a2\u0006\u0006\u0008\u008c\u0001\u0010\u008d\u0001J\u001a\u0010\u008e\u0001\u001a\u00020\u001f2\u0008\u0010\u0085\u0001\u001a\u00030\u0084\u0001\u00a2\u0006\u0006\u0008\u008e\u0001\u0010\u0087\u0001J+\u0010\u0091\u0001\u001a\u00020\u001f2\u0019\u0010\u0090\u0001\u001a\u0014\u0012\u0007\u0012\u0005\u0018\u00010\u008f\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u008f\u00010+\u00a2\u0006\u0006\u0008\u0091\u0001\u0010\u0092\u0001J\u0019\u0010\u0091\u0001\u001a\u00020\u001f2\u0007\u0010b\u001a\u00030\u0093\u0001\u00a2\u0006\u0006\u0008\u0091\u0001\u0010\u0094\u0001J\u0019\u0010\u0096\u0001\u001a\u00020\u001f2\u0007\u0010\u0095\u0001\u001a\u00020%\u00a2\u0006\u0006\u0008\u0096\u0001\u0010\u0097\u0001J\u0019\u0010\u0099\u0001\u001a\u00020\u001f2\u0007\u0010\u0098\u0001\u001a\u00020%\u00a2\u0006\u0006\u0008\u0099\u0001\u0010\u0097\u0001J\u001a\u0010\u009c\u0001\u001a\u00020\u001f2\u0008\u0010\u009b\u0001\u001a\u00030\u009a\u0001\u00a2\u0006\u0006\u0008\u009c\u0001\u0010\u009d\u0001J\u0017\u0010\u009e\u0001\u001a\u00020\u001f2\u0006\u0010[\u001a\u00020\u000f\u00a2\u0006\u0005\u0008\u009e\u0001\u0010]J\u0017\u0010\u009f\u0001\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001b\u00a2\u0006\u0005\u0008\u009f\u0001\u0010$J\u0017\u0010\u00a0\u0001\u001a\u00020\u001f2\u0006\u0010?\u001a\u000206\u00a2\u0006\u0005\u0008\u00a0\u0001\u0010<J\u001a\u0010\u00a3\u0001\u001a\u00020\u001f2\u0008\u0010\u00a2\u0001\u001a\u00030\u00a1\u0001\u00a2\u0006\u0006\u0008\u00a3\u0001\u0010\u00a4\u0001J\u0019\u0010\u00a6\u0001\u001a\u00020\u001f2\u0007\u0010\u00a5\u0001\u001a\u00020\u0006\u00a2\u0006\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001J\u001a\u0010\u00aa\u0001\u001a\u00020\u001f2\u0008\u0010\u00a9\u0001\u001a\u00030\u00a8\u0001\u00a2\u0006\u0006\u0008\u00aa\u0001\u0010\u00ab\u0001J\u0012\u0010\u00ac\u0001\u001a\u0004\u0018\u000106\u00a2\u0006\u0006\u0008\u00ac\u0001\u0010\u00ad\u0001J\u0019\u0010\u00ae\u0001\u001a\u00020\u001f2\u0008\u00107\u001a\u0004\u0018\u000106\u00a2\u0006\u0005\u0008\u00ae\u0001\u0010<J\u0019\u0010\u00af\u0001\u001a\u00020\u001f2\u0008\u0010S\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0005\u0008\u00af\u0001\u00105J\u000f\u0010\u00b0\u0001\u001a\u00020\u001f\u00a2\u0006\u0005\u0008\u00b0\u0001\u0010qJ\u000f\u0010\u00b1\u0001\u001a\u00020\u001f\u00a2\u0006\u0005\u0008\u00b1\u0001\u0010qJ\u0019\u0010\u00b3\u0001\u001a\u00020\u001f2\u0007\u0010\u00b2\u0001\u001a\u00020%\u00a2\u0006\u0006\u0008\u00b3\u0001\u0010\u0097\u0001J\u0019\u0010\u00b5\u0001\u001a\u00020\u001f2\u0007\u0010\u00b4\u0001\u001a\u00020%\u00a2\u0006\u0006\u0008\u00b5\u0001\u0010\u0097\u0001J\u000f\u0010\u00b6\u0001\u001a\u00020\u001f\u00a2\u0006\u0005\u0008\u00b6\u0001\u0010qJ\u000f\u0010\u00b7\u0001\u001a\u00020\u001f\u00a2\u0006\u0005\u0008\u00b7\u0001\u0010qJ\'\u0010\u00b8\u0001\u001a\u00020\u001f2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\n2\u0008\u0008\u0002\u0010&\u001a\u00020%\u00a2\u0006\u0005\u0008\u00b8\u0001\u0010(J\u000f\u0010\u00b9\u0001\u001a\u00020\u001f\u00a2\u0006\u0005\u0008\u00b9\u0001\u0010qJ\u001c\u0010\u00bc\u0001\u001a\u00020\u001f2\u0008\u0010\u00bb\u0001\u001a\u00030\u00ba\u0001H\u0002\u00a2\u0006\u0006\u0008\u00bc\u0001\u0010\u00bd\u0001J\u001a\u0010\u00be\u0001\u001a\u00020%2\u0006\u0010\"\u001a\u00020\u001bH\u0002\u00a2\u0006\u0006\u0008\u00be\u0001\u0010\u00bf\u0001J#\u0010\u00c0\u0001\u001a\u00020\u001f2\u0007\u0010\u0080\u0001\u001a\u00020}2\u0006\u0010S\u001a\u00020\u0002H\u0002\u00a2\u0006\u0006\u0008\u00c0\u0001\u0010\u00c1\u0001J\'\u0010\u00c4\u0001\u001a\u00030\u0084\u00012\u0008\u0010\u00c2\u0001\u001a\u00030\u0084\u00012\u0008\u0010\u00c3\u0001\u001a\u00030\u0084\u0001H\u0002\u00a2\u0006\u0006\u0008\u00c4\u0001\u0010\u00c5\u0001J\u0019\u0010\u00c6\u0001\u001a\u00020\u001f2\u0006\u0010U\u001a\u00020\u0002H\u0002\u00a2\u0006\u0005\u0008\u00c6\u0001\u00105J\"\u0010&\u001a\u00020\u001b2\u0007\u0010\u00c7\u0001\u001a\u00020\u001b2\u0007\u0010\u00c8\u0001\u001a\u00020\u001bH\u0002\u00a2\u0006\u0005\u0008&\u0010\u00c9\u0001J4\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\n2\r\u0010\u00ca\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\n2\r\u0010\u00cb\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\nH\u0002\u00a2\u0006\u0005\u0008&\u0010\u00cc\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008\u0003\u0010\u00cd\u0001\u001a\u0006\u0008\u00ce\u0001\u0010\u00cf\u0001R\u001d\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008\u0004\u0010\u00cd\u0001\u001a\u0006\u0008\u00d0\u0001\u0010\u00cf\u0001R\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0007\u0010\u00d1\u0001R\'\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00080\u00058\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\t\u0010\u00d1\u0001R!\u0010\u000c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0\u00058\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u000c\u0010\u00d1\u0001R!\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\n0\u00058\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u000e\u0010\u00d1\u0001R\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0010\u0010\u00d2\u0001R\u001a\u0010\u0012\u001a\u00020\u00118\u0006\u00a2\u0006\u000f\n\u0005\u0008\u0012\u0010\u00d3\u0001\u001a\u0006\u0008\u00d4\u0001\u0010\u00d5\u0001R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0014\u0010\u00d6\u0001R\u001f\u0010\u00d7\u0001\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00d7\u0001\u0010\u00cd\u0001\u001a\u0006\u0008\u00d8\u0001\u0010\u00cf\u0001R \u0010\u00da\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00d9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00da\u0001\u0010\u00db\u0001R1\u0010\u00dd\u0001\u001a\u001c\u0012\u0017\u0012\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00020\u00dc\u00010\u00080\u00d9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00dd\u0001\u0010\u00db\u0001R$\u0010\u00de\u0001\u001a\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b0\n0\u00d9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00de\u0001\u0010\u00db\u0001R$\u0010\u00df\u0001\u001a\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b0\n0\u00d9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00df\u0001\u0010\u00db\u0001R\u001e\u0010\u00e0\u0001\u001a\t\u0012\u0004\u0012\u00020%0\u00d9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e0\u0001\u0010\u00db\u0001R$\u0010\u00e1\u0001\u001a\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b0\n0\u00d9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e1\u0001\u0010\u00db\u0001R$\u0010\u00e2\u0001\u001a\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b0\n0\u00d9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e2\u0001\u0010\u00db\u0001R$\u0010\u00e3\u0001\u001a\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b0\n0\u00d9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e3\u0001\u0010\u00db\u0001R\u001e\u0010\u00e4\u0001\u001a\t\u0012\u0004\u0012\u00020\u000f0\u00d9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e4\u0001\u0010\u00db\u0001R$\u0010\u00e5\u0001\u001a\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\n0\u00d9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e5\u0001\u0010\u00db\u0001R\u001f\u0010\u00e6\u0001\u001a\n\u0012\u0005\u0012\u00030\u00a8\u00010\u00d9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e6\u0001\u0010\u00db\u0001R0\u0010\u00e8\u0001\u001a\u001b\u0012\u0016\u0012\u0014\u0012\t\u0012\u00070\u0002j\u0003`\u00e7\u0001\u0012\u0005\u0012\u00030\u0084\u00010\u00080\u00d9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e8\u0001\u0010\u00db\u0001R\u001e\u0010\u00e9\u0001\u001a\t\u0012\u0004\u0012\u00020\u000f0\u00d9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e9\u0001\u0010\u00db\u0001R$\u0010\u00ea\u0001\u001a\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020^0\n0\u00d9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ea\u0001\u0010\u00db\u0001R!\u0010\u00eb\u0001\u001a\u000c\u0012\u0007\u0012\u0005\u0018\u00010\u008f\u00010\u00d9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00eb\u0001\u0010\u00db\u0001R\u001e\u0010\u00ec\u0001\u001a\t\u0012\u0004\u0012\u00020%0\u00d9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ec\u0001\u0010\u00db\u0001R\u001e\u0010\u00ed\u0001\u001a\t\u0012\u0004\u0012\u00020%0\u00d9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ed\u0001\u0010\u00db\u0001R\u001f\u0010\u00ee\u0001\u001a\n\u0012\u0005\u0012\u00030\u00a1\u00010\u00d9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ee\u0001\u0010\u00db\u0001R\u001d\u0010\u00ef\u0001\u001a\u0008\u0012\u0004\u0012\u00020%0\u00058\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ef\u0001\u0010\u00d1\u0001R\u0019\u0010\u00f0\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00f0\u0001\u0010\u00f1\u0001R\u001e\u0010\u00f2\u0001\u001a\t\u0012\u0004\u0012\u00020%0\u00d9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00f2\u0001\u0010\u00db\u0001R\u001b\u0010\u00f3\u0001\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00f3\u0001\u0010\u00f4\u0001R\u001b\u0010\u00f5\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00f5\u0001\u0010\u00cd\u0001R+\u0010\u00f7\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00020\u00dc\u00010\u00f6\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00f7\u0001\u0010\u00f8\u0001R$\u0010\u00f9\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020}0\u00f6\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00f9\u0001\u0010\u00f8\u0001R$\u0010\u00fb\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020%0\u00fa\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00fb\u0001\u0010\u00fc\u0001R#\u0010\u00fd\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b0\n0\u00058\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00fd\u0001\u0010\u00d1\u0001R#\u0010\u00fe\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b0\n0\u00058\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00fe\u0001\u0010\u00d1\u0001R!\u0010\u0084\u0002\u001a\u00030\u00ff\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u0080\u0002\u0010\u0081\u0002\u001a\u0006\u0008\u0082\u0002\u0010\u0083\u0002R\'\u0010\u0085\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0085\u0002\u0010\u00d1\u0001\u001a\u0006\u0008\u0086\u0002\u0010\u0087\u0002R7\u0010\u0088\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\n0\u00080\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0088\u0002\u0010\u00d1\u0001\u001a\u0006\u0008\u0089\u0002\u0010\u0087\u0002R)\u0010\u001e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b0\n0\u00058\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008\u001e\u0010\u00d1\u0001\u001a\u0006\u0008\u008a\u0002\u0010\u0087\u0002R)\u0010Q\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b0\n0\u00058\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008Q\u0010\u00d1\u0001\u001a\u0006\u0008\u008b\u0002\u0010\u0087\u0002R&\u0010\u008d\u0002\u001a\t\u0012\u0005\u0012\u00030\u008c\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u008d\u0002\u0010\u00d1\u0001\u001a\u0006\u0008\u008e\u0002\u0010\u0087\u0002R#\u0010s\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00058\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008s\u0010\u00d1\u0001\u001a\u0006\u0008\u008f\u0002\u0010\u0087\u0002R)\u0010r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\n0\u00058\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008r\u0010\u00d1\u0001\u001a\u0006\u0008\u0090\u0002\u0010\u0087\u0002R&\u0010\u0091\u0002\u001a\t\u0012\u0005\u0012\u00030\u00a8\u00010\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0091\u0002\u0010\u00d1\u0001\u001a\u0006\u0008\u0092\u0002\u0010\u0087\u0002R,\u0010\u0088\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0084\u00010\n0\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0088\u0001\u0010\u00d1\u0001\u001a\u0006\u0008\u0093\u0002\u0010\u0087\u0002R(\u0010\u0085\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0084\u00010\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0085\u0001\u0010\u00d1\u0001\u001a\u0006\u0008\u0094\u0002\u0010\u0087\u0002R%\u0010\u0095\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0095\u0002\u0010\u00d1\u0001\u001a\u0006\u0008\u0096\u0002\u0010\u0087\u0002R%\u0010\u0097\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0097\u0002\u0010\u00d1\u0001\u001a\u0006\u0008\u0098\u0002\u0010\u0087\u0002R)\u0010_\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020^0\n0\u00058\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008_\u0010\u00d1\u0001\u001a\u0006\u0008\u0099\u0002\u0010\u0087\u0002R&\u0010\u009a\u0002\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u009a\u0002\u0010\u00d1\u0001\u001a\u0006\u0008\u009b\u0002\u0010\u0087\u0002R%\u0010\u0095\u0001\u001a\u0008\u0012\u0004\u0012\u00020%0\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0095\u0001\u0010\u00d1\u0001\u001a\u0006\u0008\u009c\u0002\u0010\u0087\u0002R%\u0010\u0098\u0001\u001a\u0008\u0012\u0004\u0012\u00020%0\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0098\u0001\u0010\u00d1\u0001\u001a\u0006\u0008\u009d\u0002\u0010\u0087\u0002R%\u0010\u009e\u0002\u001a\u0008\u0012\u0004\u0012\u00020%0\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u009e\u0002\u0010\u00d1\u0001\u001a\u0006\u0008\u009f\u0002\u0010\u0087\u0002R%\u0010\u00a0\u0002\u001a\u0008\u0012\u0004\u0012\u00020%0\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00a0\u0002\u0010\u00d1\u0001\u001a\u0006\u0008\u00a1\u0002\u0010\u0087\u0002R%\u0010\u00a2\u0002\u001a\u0008\u0012\u0004\u0012\u00020%0\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00a2\u0002\u0010\u00d1\u0001\u001a\u0006\u0008\u00a3\u0002\u0010\u0087\u0002R%\u0010\u00a4\u0002\u001a\u0008\u0012\u0004\u0012\u00020%0\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00a4\u0002\u0010\u00d1\u0001\u001a\u0006\u0008\u00a5\u0002\u0010\u0087\u0002R%\u0010\u00a6\u0002\u001a\u0008\u0012\u0004\u0012\u00020%0\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00a6\u0002\u0010\u00d1\u0001\u001a\u0006\u0008\u00a7\u0002\u0010\u0087\u0002R&\u0010\u00a8\u0002\u001a\t\u0012\u0005\u0012\u00030\u00a1\u00010\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00a8\u0002\u0010\u00d1\u0001\u001a\u0006\u0008\u00a9\u0002\u0010\u0087\u0002R%\u0010\u00b4\u0001\u001a\u0008\u0012\u0004\u0012\u00020%0\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00b4\u0001\u0010\u00d1\u0001\u001a\u0006\u0008\u00aa\u0002\u0010\u0087\u0002R\'\u0010\u00ab\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00ab\u0002\u0010\u00d1\u0001\u001a\u0006\u0008\u00ac\u0002\u0010\u0087\u0002R+\u0010\u00ad\u0002\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\n0\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00ad\u0002\u0010\u00d1\u0001\u001a\u0006\u0008\u00ae\u0002\u0010\u0087\u0002R\'\u0010\u00af\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00af\u0002\u0010\u00d1\u0001\u001a\u0006\u0008\u00b0\u0002\u0010\u0087\u0002R\u0017\u0010\u00b2\u0001\u001a\u00020%8VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00b1\u0002\u0010\u008d\u0001\u00a8\u0006\u00b4\u0002"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;",
        "Lio/getstream/chat/android/client/channel/state/ChannelState;",
        "",
        "channelType",
        "channelId",
        "Lec3/f2;",
        "Lio/getstream/chat/android/models/User;",
        "currentUser",
        "",
        "latestUsers",
        "",
        "Lio/getstream/chat/android/models/Mute;",
        "mutedUsers",
        "Lio/getstream/chat/android/models/Location;",
        "liveLocations",
        "",
        "messageLimit",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;",
        "paginationManager",
        "Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;",
        "attachmentUrlValidator",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;Ljava/lang/Integer;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;)V",
        "Lio/getstream/chat/android/models/Channel;",
        "toChannel",
        "()Lio/getstream/chat/android/models/Channel;",
        "id",
        "Lio/getstream/chat/android/models/Message;",
        "getMessageById",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;",
        "messages",
        "Ll83/a0;",
        "setMessages",
        "(Ljava/util/List;)V",
        "message",
        "upsertMessage",
        "(Lio/getstream/chat/android/models/Message;)V",
        "",
        "preserveAttachmentUrls",
        "upsertMessages",
        "(Ljava/util/List;Z)V",
        "upsertCachedMessage",
        "updateMessage",
        "Lkotlin/Function1;",
        "transform",
        "updateMessageById",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V",
        "eventMessage",
        "Lkotlin/Function2;",
        "enrich",
        "updateMessageFromEvent",
        "(Lio/getstream/chat/android/models/Message;Lc93/m;)V",
        "deleteMessage",
        "(Ljava/lang/String;)V",
        "Ljava/util/Date;",
        "date",
        "systemMessage",
        "removeMessagesBefore",
        "(Ljava/util/Date;Lio/getstream/chat/android/models/Message;)V",
        "hideMessagesBefore",
        "(Ljava/util/Date;)V",
        "userId",
        "hard",
        "deletedAt",
        "deleteMessagesFromUser",
        "(Ljava/lang/String;ZLjava/util/Date;)V",
        "getOldestMessage",
        "()Lio/getstream/chat/android/models/Message;",
        "setLocalOnlyMessages",
        "setPendingMessages",
        "removePendingMessage",
        "setRepliedMessage",
        "quotedMessageId",
        "quotingMessageId",
        "addQuotedMessage",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "quotedMessage",
        "updateQuotedMessageReferences",
        "deleteQuotedMessageReferences",
        "pinnedMessage",
        "addPinnedMessage",
        "pinnedMessages",
        "addPinnedMessages",
        "messageId",
        "deletePinnedMessage",
        "memberId",
        "banned",
        "expiry",
        "shadow",
        "updateMemberBan",
        "(Ljava/lang/String;ZLjava/util/Date;Z)V",
        "count",
        "setMemberCount",
        "(I)V",
        "Lio/getstream/chat/android/models/Member;",
        "members",
        "setMembers",
        "Lio/getstream/chat/android/client/events/MemberAddedEvent;",
        "event",
        "addMember",
        "(Lio/getstream/chat/android/client/events/MemberAddedEvent;)V",
        "Lio/getstream/chat/android/client/events/MemberRemovedEvent;",
        "removeMember",
        "(Lio/getstream/chat/android/client/events/MemberRemovedEvent;)V",
        "Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;",
        "(Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;)V",
        "member",
        "upsertMember",
        "(Lio/getstream/chat/android/models/Member;)V",
        "upsertMembers",
        "membership",
        "setMembership",
        "deleteMembership",
        "()V",
        "watchers",
        "watcherCount",
        "setWatchers",
        "(Ljava/util/List;I)V",
        "Lio/getstream/chat/android/client/events/UserStartWatchingEvent;",
        "addWatcher",
        "(Lio/getstream/chat/android/client/events/UserStartWatchingEvent;)V",
        "Lio/getstream/chat/android/client/events/UserStopWatchingEvent;",
        "removeWatcher",
        "(Lio/getstream/chat/android/client/events/UserStopWatchingEvent;)V",
        "upsertWatchers",
        "Lio/getstream/chat/android/models/Poll;",
        "getPoll",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;",
        "poll",
        "upsertPoll",
        "(Lio/getstream/chat/android/models/Poll;)V",
        "deletePoll",
        "Lio/getstream/chat/android/models/ChannelUserRead;",
        "read",
        "updateRead",
        "(Lio/getstream/chat/android/models/ChannelUserRead;)V",
        "reads",
        "updateReads",
        "eventReceivedDate",
        "updateCurrentUserRead",
        "markRead",
        "()Z",
        "updateDelivered",
        "Lio/getstream/chat/android/models/ChannelData;",
        "update",
        "updateChannelData",
        "(Lkotlin/jvm/functions/Function1;)V",
        "Lio/getstream/chat/android/client/events/HasChannel;",
        "(Lio/getstream/chat/android/client/events/HasChannel;)V",
        "hidden",
        "setHidden",
        "(Z)V",
        "muted",
        "setMuted",
        "Lio/getstream/chat/android/models/PushPreference;",
        "preference",
        "setPushPreference",
        "(Lio/getstream/chat/android/models/PushPreference;)V",
        "setMessageCount",
        "updateLastMessageAt",
        "deleteChannel",
        "Lio/getstream/chat/android/models/Config;",
        "config",
        "setChannelConfig",
        "(Lio/getstream/chat/android/models/Config;)V",
        "user",
        "upsertUserPresence",
        "(Lio/getstream/chat/android/models/User;)V",
        "Lio/getstream/chat/android/models/TypingEvent;",
        "typingEvent",
        "setTyping",
        "(Lio/getstream/chat/android/models/TypingEvent;)V",
        "getLastStartTypingEvent",
        "()Ljava/util/Date;",
        "setLastStartTypingEvent",
        "setKeystrokeParentMessageId",
        "trimOldestMessages",
        "trimNewestMessages",
        "recoveryNeeded",
        "setRecoveryNeeded",
        "insideSearch",
        "setInsideSearch",
        "cacheLatestMessages",
        "clearCachedLatestMessages",
        "upsertCachedLatestMessages",
        "destroy",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$TrimDirection;",
        "direction",
        "applyMessageLimitIfNeeded",
        "(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$TrimDirection;)V",
        "shouldIgnoreUpsertion",
        "(Lio/getstream/chat/android/models/Message;)Z",
        "registerPollForMessage",
        "(Lio/getstream/chat/android/models/Poll;Ljava/lang/String;)V",
        "localRead",
        "serverRead",
        "mergeCurrentUserRead",
        "(Lio/getstream/chat/android/models/ChannelUserRead;Lio/getstream/chat/android/models/ChannelUserRead;)Lio/getstream/chat/android/models/ChannelUserRead;",
        "deleteMemberAndDecrementMemberCount",
        "newMessage",
        "oldMessage",
        "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;",
        "newMessages",
        "oldMessages",
        "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;",
        "Ljava/lang/String;",
        "getChannelType",
        "()Ljava/lang/String;",
        "getChannelId",
        "Lec3/f2;",
        "Ljava/lang/Integer;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;",
        "getPaginationManager",
        "()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;",
        "Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;",
        "cid",
        "getCid",
        "Lec3/p1;",
        "_repliedMessage",
        "Lec3/p1;",
        "",
        "_quotedMessagesMap",
        "_messages",
        "localOnlyMessages",
        "_pendingEnabled",
        "_pendingMessages",
        "_cachedLatestMessages",
        "_pinnedMessages",
        "_watcherCount",
        "_watchers",
        "_typing",
        "Lio/getstream/chat/android/models/UserId;",
        "_reads",
        "_memberCount",
        "_members",
        "_channelData",
        "_hidden",
        "_muted",
        "_channelConfig",
        "_loading",
        "_recoveryNeeded",
        "Z",
        "_insideSearch",
        "lastStartTypingEvent",
        "Ljava/util/Date;",
        "keystrokeParentMessageId",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "messagesWithPolls",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "polls",
        "La0/a0;",
        "processedMessageIds",
        "La0/a0;",
        "localOnlyMessagesInRange",
        "pendingMessagesInRange",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "repliedMessage",
        "getRepliedMessage",
        "()Lec3/f2;",
        "quotedMessagesMap",
        "getQuotedMessagesMap",
        "getMessages",
        "getPinnedMessages",
        "Lio/getstream/chat/android/models/MessagesState;",
        "messagesState",
        "getMessagesState",
        "getWatcherCount",
        "getWatchers",
        "typing",
        "getTyping",
        "getReads",
        "getRead",
        "unreadCount",
        "getUnreadCount",
        "membersCount",
        "getMembersCount",
        "getMembers",
        "channelData",
        "getChannelData",
        "getHidden",
        "getMuted",
        "loading",
        "getLoading",
        "loadingOlderMessages",
        "getLoadingOlderMessages",
        "loadingNewerMessages",
        "getLoadingNewerMessages",
        "endOfOlderMessages",
        "getEndOfOlderMessages",
        "endOfNewerMessages",
        "getEndOfNewerMessages",
        "channelConfig",
        "getChannelConfig",
        "getInsideSearch",
        "lastSentMessageDate",
        "getLastSentMessageDate",
        "activeLiveLocations",
        "getActiveLiveLocations",
        "messageCount",
        "getMessageCount",
        "getRecoveryNeeded",
        "Companion",
        "TrimDirection",
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
.field private static final CACHED_LATEST_MESSAGES_LIMIT:I = 0x19

.field private static final Companion:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$Companion;

.field private static final MESSAGE_COMPARATOR:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation
.end field

.field private static final TRIM_BUFFER:I = 0x1e


# instance fields
.field private final _cachedLatestMessages:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _channelConfig:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _channelData:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _hidden:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _insideSearch:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _loading:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final _memberCount:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _members:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _messages:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _muted:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _pendingEnabled:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _pendingMessages:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _pinnedMessages:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _quotedMessagesMap:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _reads:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _recoveryNeeded:Z

.field private final _repliedMessage:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _typing:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _watcherCount:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _watchers:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final activeLiveLocations:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final attachmentUrlValidator:Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;

.field private final channelConfig:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final channelData:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final channelId:Ljava/lang/String;

.field private final channelType:Ljava/lang/String;

.field private final cid:Ljava/lang/String;

.field private final currentUser:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final endOfNewerMessages:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final endOfOlderMessages:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final hidden:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final insideSearch:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private keystrokeParentMessageId:Ljava/lang/String;

.field private final lastSentMessageDate:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private lastStartTypingEvent:Ljava/util/Date;

.field private final latestUsers:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final liveLocations:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final loading:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final loadingNewerMessages:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final loadingOlderMessages:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final localOnlyMessages:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final localOnlyMessagesInRange:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;

.field private final members:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final membersCount:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final messageCount:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final messageLimit:Ljava/lang/Integer;

.field private final messages:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final messagesState:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final messagesWithPolls:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final muted:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final mutedUsers:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final paginationManager:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;

.field private final pendingMessagesInRange:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final pinnedMessages:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final polls:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
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

.field private final quotedMessagesMap:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final read:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final reads:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final repliedMessage:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final typing:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final unreadCount:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final watcherCount:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final watchers:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->Companion:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$Companion;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$special$$inlined$compareBy$1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->MESSAGE_COMPARATOR:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;Ljava/lang/Integer;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;)V
    .locals 45
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lec3/f2;",
            "Lec3/f2;",
            "Lec3/f2;",
            "Lec3/f2;",
            "Ljava/lang/Integer;",
            "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;",
            "Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    const-string v9, "channelType"

    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "channelId"

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "currentUser"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "latestUsers"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "mutedUsers"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "liveLocations"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "paginationManager"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "attachmentUrlValidator"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->channelType:Ljava/lang/String;

    .line 3
    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->channelId:Ljava/lang/String;

    .line 4
    iput-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->currentUser:Lec3/f2;

    .line 5
    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->latestUsers:Lec3/f2;

    .line 6
    iput-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->mutedUsers:Lec3/f2;

    .line 7
    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->liveLocations:Lec3/f2;

    move-object/from16 v5, p7

    .line 8
    iput-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->messageLimit:Ljava/lang/Integer;

    .line 9
    iput-object v7, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->paginationManager:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;

    .line 10
    iput-object v8, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->attachmentUrlValidator:Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;

    .line 11
    const-string v5, ":"

    .line 12
    invoke-static {v1, v5, v2}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 13
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->cid:Ljava/lang/String;

    const/4 v1, 0x0

    .line 14
    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_repliedMessage:Lec3/p1;

    .line 15
    sget-object v8, Lm83/z;->w:Lm83/z;

    invoke-static {v8}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v9

    iput-object v9, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_quotedMessagesMap:Lec3/p1;

    .line 16
    sget-object v10, Lm83/y;->w:Lm83/y;

    invoke-static {v10}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v11

    iput-object v11, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_messages:Lec3/p1;

    .line 17
    invoke-static {v10}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v12

    iput-object v12, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->localOnlyMessages:Lec3/p1;

    .line 18
    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v13}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v14

    iput-object v14, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_pendingEnabled:Lec3/p1;

    .line 19
    invoke-static {v10}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v15

    iput-object v15, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_pendingMessages:Lec3/p1;

    move-object/from16 p1, v1

    .line 20
    invoke-static {v10}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_cachedLatestMessages:Lec3/p1;

    .line 21
    invoke-static {v10}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_pinnedMessages:Lec3/p1;

    const/16 v16, 0x0

    .line 22
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    move-object/from16 p5, v1

    invoke-static/range {v16 .. v16}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_watcherCount:Lec3/p1;

    move-object/from16 p7, v1

    .line 23
    invoke-static {v10}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_watchers:Lec3/p1;

    move-object/from16 p9, v5

    .line 24
    new-instance v5, Lio/getstream/chat/android/models/TypingEvent;

    invoke-direct {v5, v2, v10}, Lio/getstream/chat/android/models/TypingEvent;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-static {v5}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_typing:Lec3/p1;

    .line 25
    invoke-static {v8}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_reads:Lec3/p1;

    .line 26
    invoke-static/range {v16 .. v16}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v8

    iput-object v8, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_memberCount:Lec3/p1;

    .line 27
    invoke-static {v10}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v10

    iput-object v10, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_members:Lec3/p1;

    move-object/from16 p2, v2

    .line 28
    invoke-static/range {p1 .. p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_channelData:Lec3/p1;

    .line 29
    invoke-static {v13}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v7

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_hidden:Lec3/p1;

    move-object/from16 p1, v7

    .line 30
    invoke-static {v13}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v7

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_muted:Lec3/p1;

    .line 31
    new-instance v16, Lio/getstream/chat/android/models/Config;

    const v43, 0x3ffffff

    const/16 v44, 0x0

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

    invoke-direct/range {v16 .. v44}, Lio/getstream/chat/android/models/Config;-><init>(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZZZZZZZZZZZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v17, v7

    invoke-static/range {v16 .. v16}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v7

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_channelConfig:Lec3/p1;

    move-object/from16 v16, v7

    .line 32
    invoke-interface/range {p8 .. p8}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;->getState()Lec3/f2;

    move-result-object v7

    move-object/from16 v18, v8

    sget-object v8, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$_loading$1;->INSTANCE:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$_loading$1;

    invoke-static {v7, v8}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->mapState(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object v7

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_loading:Lec3/f2;

    .line 33
    invoke-static {v13}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v8

    iput-object v8, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_insideSearch:Lec3/p1;

    .line 34
    new-instance v13, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v13}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v13, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->messagesWithPolls:Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    new-instance v13, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v13}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v13, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->polls:Ljava/util/concurrent/ConcurrentHashMap;

    .line 36
    new-instance v13, La0/a0;

    move-object/from16 v19, v8

    const/16 v8, 0x64

    invoke-direct {v13, v8}, La0/a0;-><init>(I)V

    iput-object v13, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->processedMessageIds:La0/a0;

    .line 37
    invoke-interface/range {p8 .. p8}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;->getState()Lec3/f2;

    move-result-object v8

    new-instance v13, Lio/getstream/chat/android/client/api2/d;

    const/16 v6, 0xc

    invoke-direct {v13, v6}, Lio/getstream/chat/android/client/api2/d;-><init>(I)V

    invoke-static {v12, v8, v13}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->combineStates(Lec3/f2;Lec3/f2;Lc93/m;)Lec3/f2;

    move-result-object v6

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->localOnlyMessagesInRange:Lec3/f2;

    .line 38
    invoke-interface/range {p8 .. p8}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;->getState()Lec3/f2;

    move-result-object v8

    new-instance v12, Lgf1/e;

    const/16 v13, 0xb

    invoke-direct {v12, v13}, Lgf1/e;-><init>(I)V

    invoke-static {v14, v15, v8, v12}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->combineStates(Lec3/f2;Lec3/f2;Lec3/f2;Lkotlin/jvm/functions/Function3;)Lec3/f2;

    move-result-object v8

    iput-object v8, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->pendingMessagesInRange:Lec3/f2;

    .line 39
    const-string v12, "ChannelStateImpl"

    invoke-static {v0, v12}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v12

    iput-object v12, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->logger$delegate:Ll83/h;

    .line 40
    invoke-static/range {p9 .. p9}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v12

    iput-object v12, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->repliedMessage:Lec3/f2;

    .line 41
    new-instance v12, Lio/getstream/chat/android/client/api/state/a;

    const/16 v13, 0x19

    invoke-direct {v12, v13}, Lio/getstream/chat/android/client/api/state/a;-><init>(I)V

    invoke-static {v9, v12}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->mapState(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object v9

    iput-object v9, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->quotedMessagesMap:Lec3/f2;

    .line 42
    new-instance v9, Lgf1/e;

    const/16 v12, 0xc

    invoke-direct {v9, v12}, Lgf1/e;-><init>(I)V

    .line 43
    invoke-static {v11, v8, v6, v9}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->combineStates(Lec3/f2;Lec3/f2;Lec3/f2;Lkotlin/jvm/functions/Function3;)Lec3/f2;

    move-result-object v6

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->messages:Lec3/f2;

    .line 44
    invoke-static/range {p5 .. p5}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v8

    iput-object v8, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->pinnedMessages:Lec3/f2;

    .line 45
    new-instance v8, Lio/getstream/chat/android/client/api2/d;

    const/16 v9, 0x8

    invoke-direct {v8, v9}, Lio/getstream/chat/android/client/api2/d;-><init>(I)V

    invoke-static {v7, v6, v8}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->combineStates(Lec3/f2;Lec3/f2;Lc93/m;)Lec3/f2;

    move-result-object v8

    iput-object v8, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->messagesState:Lec3/f2;

    .line 46
    invoke-static/range {p7 .. p7}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v8

    iput-object v8, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->watcherCount:Lec3/f2;

    .line 47
    new-instance v8, Lio/getstream/chat/android/client/api2/d;

    const/16 v9, 0x9

    invoke-direct {v8, v9}, Lio/getstream/chat/android/client/api2/d;-><init>(I)V

    invoke-static {v1, v4, v8}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->combineStates(Lec3/f2;Lec3/f2;Lc93/m;)Lec3/f2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->watchers:Lec3/f2;

    .line 48
    invoke-static/range {p2 .. p2}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->typing:Lec3/f2;

    .line 49
    new-instance v1, Lio/getstream/chat/android/client/api/state/a;

    const/16 v8, 0x1a

    invoke-direct {v1, v8}, Lio/getstream/chat/android/client/api/state/a;-><init>(I)V

    invoke-static {v5, v1}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->mapState(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->reads:Lec3/f2;

    .line 50
    new-instance v1, Lio/getstream/chat/android/client/api2/d;

    const/16 v8, 0xa

    invoke-direct {v1, v8}, Lio/getstream/chat/android/client/api2/d;-><init>(I)V

    invoke-static {v5, v3, v1}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->combineStates(Lec3/f2;Lec3/f2;Lc93/m;)Lec3/f2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->read:Lec3/f2;

    .line 51
    new-instance v3, Lio/getstream/chat/android/client/api/state/a;

    const/16 v5, 0x1b

    invoke-direct {v3, v5}, Lio/getstream/chat/android/client/api/state/a;-><init>(I)V

    invoke-static {v1, v3}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->mapState(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->unreadCount:Lec3/f2;

    .line 52
    invoke-static/range {v18 .. v18}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->membersCount:Lec3/f2;

    .line 53
    new-instance v1, Lio/getstream/chat/android/client/api2/d;

    const/16 v3, 0xb

    invoke-direct {v1, v3}, Lio/getstream/chat/android/client/api2/d;-><init>(I)V

    invoke-static {v10, v4, v1}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->combineStates(Lec3/f2;Lec3/f2;Lc93/m;)Lec3/f2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->members:Lec3/f2;

    .line 54
    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/b;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/b;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;I)V

    invoke-static {v2, v4, v1}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->combineStates(Lec3/f2;Lec3/f2;Lc93/m;)Lec3/f2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->channelData:Lec3/f2;

    .line 55
    invoke-static/range {p1 .. p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->hidden:Lec3/f2;

    .line 56
    invoke-static/range {v17 .. v17}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->muted:Lec3/f2;

    .line 57
    iput-object v7, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->loading:Lec3/f2;

    .line 58
    invoke-interface/range {p8 .. p8}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;->getState()Lec3/f2;

    move-result-object v1

    sget-object v3, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$loadingOlderMessages$1;->INSTANCE:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$loadingOlderMessages$1;

    invoke-static {v1, v3}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->mapState(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->loadingOlderMessages:Lec3/f2;

    .line 59
    invoke-interface/range {p8 .. p8}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;->getState()Lec3/f2;

    move-result-object v1

    sget-object v3, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$loadingNewerMessages$1;->INSTANCE:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$loadingNewerMessages$1;

    invoke-static {v1, v3}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->mapState(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->loadingNewerMessages:Lec3/f2;

    .line 60
    invoke-interface/range {p8 .. p8}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;->getState()Lec3/f2;

    move-result-object v1

    sget-object v3, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$endOfOlderMessages$1;->INSTANCE:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$endOfOlderMessages$1;

    invoke-static {v1, v3}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->mapState(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->endOfOlderMessages:Lec3/f2;

    .line 61
    invoke-interface/range {p8 .. p8}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;->getState()Lec3/f2;

    move-result-object v1

    sget-object v3, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$endOfNewerMessages$1;->INSTANCE:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$endOfNewerMessages$1;

    invoke-static {v1, v3}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->mapState(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->endOfNewerMessages:Lec3/f2;

    .line 62
    invoke-static/range {v16 .. v16}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->channelConfig:Lec3/f2;

    .line 63
    invoke-static/range {v19 .. v19}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v3

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->insideSearch:Lec3/f2;

    .line 64
    new-instance v3, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/b;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v4}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/b;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;I)V

    invoke-static {v1, v6, v3}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->combineStates(Lec3/f2;Lec3/f2;Lc93/m;)Lec3/f2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->lastSentMessageDate:Lec3/f2;

    .line 65
    new-instance v1, Lhb2/c;

    const/16 v3, 0x15

    invoke-direct {v1, v0, v3}, Lhb2/c;-><init>(Ljava/lang/Object;I)V

    move-object/from16 v6, p6

    invoke-static {v6, v1}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->mapState(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->activeLiveLocations:Lec3/f2;

    .line 66
    new-instance v1, Lio/getstream/chat/android/client/api/state/a;

    const/16 v3, 0x18

    invoke-direct {v1, v3}, Lio/getstream/chat/android/client/api/state/a;-><init>(I)V

    invoke-static {v2, v1}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->mapState(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->messageCount:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;Ljava/lang/Integer;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p10

    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_0

    .line 73
    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManagerImpl;

    invoke-direct {v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManagerImpl;-><init>()V

    move-object v10, v1

    goto :goto_0

    :cond_0
    move-object/from16 v10, p8

    :goto_0
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_1

    .line 74
    new-instance v0, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;-><init>(Lio/getstream/chat/android/client/helpers/AttachmentHelper;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v11, v0

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    goto :goto_2

    :cond_1
    move-object/from16 v11, p9

    goto :goto_1

    .line 75
    :goto_2
    invoke-direct/range {v2 .. v11}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;-><init>(Ljava/lang/String;Ljava/lang/String;Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;Ljava/lang/Integer;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;)V

    return-void
.end method

.method public static synthetic A(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertMessage$lambda$34$lambda$33(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Ljava/util/Date;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->deleteChannel$lambda$149(Ljava/util/Date;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p0

    return-object p0
.end method

.method private static final activeLiveLocations$lambda$19(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Ljava/util/List;)Ljava/util/List;
    .locals 4

    const-string v0, "locations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Location;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Location;->getCid()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->cid:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private static final addPinnedMessages$lambda$115$lambda$114(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 1

    const-string v0, "old"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->attachmentUrlValidator:Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;->updateValidAttachmentsUrl$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p0

    return-object p0
.end method

.method private final applyMessageLimitIfNeeded(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$TrimDirection;)V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->messageLimit:Ljava/lang/Integer;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_messages:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v2, v0, 0x1e

    if-gt v1, v2, :cond_0

    goto/16 :goto_0

    :cond_0
    sget-object v1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v1, :cond_3

    const/4 v1, 0x2

    if-ne p1, v1, :cond_2

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->cacheLatestMessages()V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_messages:Lec3/p1;

    :cond_1
    move-object v1, p1

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4, v0}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->paginationManager:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;

    invoke-interface {p1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;->setEndOfNewerMessages(Z)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->paginationManager:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_messages:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Message;

    invoke-interface {p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;->setNewestMessage(Lio/getstream/chat/android/models/Message;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_insideSearch:Lec3/p1;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_messages:Lec3/p1;

    :cond_4
    move-object v1, p1

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/util/List;

    invoke-static {v0, v4}, Lm83/s;->x1(ILjava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->paginationManager:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;

    invoke-interface {p1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;->setEndOfOlderMessages(Z)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->paginationManager:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_messages:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Message;

    invoke-interface {p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;->setOldestMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public static synthetic b(ZLjava/util/List;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->pendingMessagesInRange$lambda$3(ZLjava/util/List;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/ChannelData;Ljava/util/Map;)Lio/getstream/chat/android/models/ChannelData;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->channelData$lambda$15(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/ChannelData;Ljava/util/Map;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p0

    return-object p0
.end method

.method private static final channelData$lambda$15(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/ChannelData;Ljava/util/Map;)Lio/getstream/chat/android/models/ChannelData;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "users"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->channelType:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->channelId:Ljava/lang/String;

    new-instance v3, Lio/getstream/chat/android/models/ChannelData;

    const v24, 0xffffc

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

    invoke-direct/range {v3 .. v25}, Lio/getstream/chat/android/models/ChannelData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/ChannelData;->getCreatedBy()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/User;

    if-nez v0, :cond_1

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/ChannelData;->getCreatedBy()Lio/getstream/chat/android/models/User;

    move-result-object v0

    :cond_1
    move-object v6, v0

    const v22, 0xfffef

    const/16 v23, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

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

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v23}, Lio/getstream/chat/android/models/ChannelData;->copy$default(Lio/getstream/chat/android/models/ChannelData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateMessage$lambda$45(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p0

    return-object p0
.end method

.method private static final deleteChannel$lambda$149(Ljava/util/Date;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 24

    if-eqz p1, :cond_0

    const v22, 0xffdff

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

    move-object/from16 v11, p0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v23}, Lio/getstream/chat/android/models/ChannelData;->copy$default(Lio/getstream/chat/android/models/ChannelData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private final deleteMemberAndDecrementMemberCount(Ljava/lang/String;)V
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_members:Lec3/p1;

    :cond_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v1, v2, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_memberCount:Lec3/p1;

    :cond_3
    move-object p1, v1

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x0

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return-void
.end method

.method private static final deleteMembership$lambda$129(Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
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

.method public static synthetic e(Ljava/util/List;Ljava/util/Map;)Ljava/util/ArrayList;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->watchers$lambda$8(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic f(Lio/getstream/chat/android/client/events/HasChannel;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateChannelData$lambda$145(Lio/getstream/chat/android/client/events/HasChannel;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/util/Map;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/ChannelUserRead;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->read$lambda$11(Ljava/util/Map;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object p0

    return-object p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public static synthetic h(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertMessage$lambda$32$lambda$31(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertCachedMessage$lambda$44$lambda$43(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lc93/m;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateMessageFromEvent$lambda$52(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lc93/m;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->deleteMembership$lambda$129(Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->members$lambda$14(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final lastSentMessageDate$lambda$17(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Config;Ljava/util/List;)Ljava/util/Date;
    .locals 4

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messages"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->currentUser:Lec3/f2;

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/models/User;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Config;->getSkipLastMsgUpdateForSystemMsgs()Z

    move-result p0

    invoke-static {v0, p0}, Lio/getstream/chat/android/extensions/MessagesExtensionsKt;->lastMessageAt(Ljava/util/List;Z)Ljava/util/Date;

    move-result-object p0

    return-object p0
.end method

.method private static final localOnlyMessagesInRange$lambda$1(Ljava/util/List;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;)Ljava/util/List;
    .locals 3

    const-string v0, "localOnly"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pagination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0

    :cond_0
    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-virtual {p1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isInWindow(Lio/getstream/chat/android/models/Message;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static synthetic m(Ljava/util/Map;)Ljava/util/LinkedHashMap;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->quotedMessagesMap$lambda$5(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    check-cast p0, Ljava/util/LinkedHashMap;

    return-object p0
.end method

.method private static final members$lambda$14(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;
    .locals 1

    const-string v0, "members"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "users"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/util/Collection;

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/extensions/internal/MemberKt;->updateUsers(Ljava/util/Collection;Ljava/util/Map;)Ljava/util/Collection;

    move-result-object p0

    new-instance p1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$members$lambda$14$$inlined$sortedBy$1;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {p0, p1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p0

    return-object p0
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

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getLogger()Lb23/k;

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

.method private static final messageCount$lambda$20(Lio/getstream/chat/android/models/ChannelData;)Ljava/lang/Integer;
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelData;->getMessageCount()Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final messages$lambda$6(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 2

    const-string v0, "regular"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pending"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localOnly"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$messages$1$1;->INSTANCE:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$messages$1$1;

    sget-object v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->MESSAGE_COMPARATOR:Ljava/util/Comparator;

    invoke-static {p2, p0, p1, v0}, Lio/getstream/chat/android/client/internal/state/utils/internal/ListKt;->mergeSorted(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p2, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$messages$1$2;->INSTANCE:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$messages$1$2;

    sget-object v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->MESSAGE_COMPARATOR:Ljava/util/Comparator;

    invoke-static {p1, p0, p2, v0}, Lio/getstream/chat/android/client/internal/state/utils/internal/ListKt;->mergeSorted(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$messages$1$3;->INSTANCE:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$messages$1$3;

    sget-object v1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->MESSAGE_COMPARATOR:Ljava/util/Comparator;

    invoke-static {p1, p2, v0, v1}, Lio/getstream/chat/android/client/internal/state/utils/internal/ListKt;->mergeSorted(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    sget-object p2, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$messages$1$4;->INSTANCE:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$messages$1$4;

    invoke-static {p1, p0, p2, v1}, Lio/getstream/chat/android/client/internal/state/utils/internal/ListKt;->mergeSorted(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final messagesState$lambda$7(ZLjava/util/List;)Lio/getstream/chat/android/models/MessagesState;
    .locals 1

    const-string v0, "messages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lio/getstream/chat/android/models/MessagesState$Loading;->INSTANCE:Lio/getstream/chat/android/models/MessagesState$Loading;

    return-object p0

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lio/getstream/chat/android/models/MessagesState$OfflineNoResults;->INSTANCE:Lio/getstream/chat/android/models/MessagesState$OfflineNoResults;

    return-object p0

    :cond_1
    new-instance p0, Lio/getstream/chat/android/models/MessagesState$Result;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/models/MessagesState$Result;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method public static synthetic n(Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setMembership$lambda$128(Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Ljava/util/List;Z)Lio/getstream/chat/android/models/MessagesState;
    .locals 0

    invoke-static {p1, p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->messagesState$lambda$7(ZLjava/util/List;)Lio/getstream/chat/android/models/MessagesState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->messages$lambda$6(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final pendingMessagesInRange$lambda$3(ZLjava/util/List;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;)Ljava/util/List;
    .locals 2

    const-string v0, "pending"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pagination"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_3

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_1

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/models/Message;

    invoke-virtual {p2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isInWindow(Lio/getstream/chat/android/models/Message;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object p0

    :cond_3
    :goto_1
    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0
.end method

.method private final preserveAttachmentUrls(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->attachmentUrlValidator:Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;->updateValidAttachmentsUrl$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1
.end method

.method private final preserveAttachmentUrls(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation

    .line 2
    check-cast p2, Ljava/lang/Iterable;

    const/16 v0, 0xa

    .line 3
    invoke-static {p2, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lm83/g0;->W(I)I

    move-result v0

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    move v0, v1

    .line 4
    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 5
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 6
    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/models/Message;

    .line 7
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    .line 8
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 9
    :cond_1
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->attachmentUrlValidator:Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;

    invoke-virtual {p2, p1, v1}, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;->updateValidAttachmentsUrl$stream_chat_android_client_release(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic q(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->addPinnedMessages$lambda$115$lambda$114(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p0

    return-object p0
.end method

.method private static final quotedMessagesMap$lambda$5(Ljava/util/Map;)Ljava/util/Map;
    .locals 3

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static synthetic r(Lio/getstream/chat/android/models/ChannelData;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->messageCount$lambda$20(Lio/getstream/chat/android/models/ChannelData;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static final read$lambda$11(Ljava/util/Map;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/ChannelUserRead;
    .locals 1

    const-string v0, "reads"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/models/ChannelUserRead;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final reads$lambda$9(Ljava/util/Map;)Ljava/util/List;
    .locals 1

    const-string v0, "reads"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$reads$lambda$9$$inlined$sortedBy$1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p0, v0}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final registerPollForMessage(Lio/getstream/chat/android/models/Poll;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->polls:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->messagesWithPolls:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_0

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    :cond_0
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->messagesWithPolls:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v0}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p2

    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic removeMessagesBefore$default(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Ljava/util/Date;Lio/getstream/chat/android/models/Message;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->removeMessagesBefore(Ljava/util/Date;Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public static synthetic s(ILio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setMessageCount$lambda$147(ILio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p0

    return-object p0
.end method

.method private static final setMembership$lambda$128(Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
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

.method private static final setMessageCount$lambda$147(ILio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
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

.method private static final setPushPreference$lambda$146(Lio/getstream/chat/android/models/PushPreference;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
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

.method private final shouldIgnoreUpsertion(Lio/getstream/chat/android/models/Message;)Z
    .locals 3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->currentUser:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/User;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getShadowed()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v0, :cond_1

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    move v0, v2

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getShowInChannel()Z

    move-result p1

    if-eqz v0, :cond_3

    if-nez p1, :cond_3

    :goto_2
    return v2

    :cond_3
    return v1
.end method

.method public static synthetic t(Lio/getstream/chat/android/models/ChannelUserRead;)I
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->unreadCount$lambda$12(Lio/getstream/chat/android/models/ChannelUserRead;)I

    move-result p0

    return p0
.end method

.method public static synthetic u(Lio/getstream/chat/android/models/Message;ZLio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateLastMessageAt$lambda$148(Lio/getstream/chat/android/models/Message;ZLio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p0

    return-object p0
.end method

.method private static final unreadCount$lambda$12(Lio/getstream/chat/android/models/ChannelUserRead;)I
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelUserRead;->getUnreadMessages()I

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final updateChannelData$lambda$145(Lio/getstream/chat/android/client/events/HasChannel;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
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

.method private static final updateLastMessageAt$lambda$148(Lio/getstream/chat/android/models/Message;ZLio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
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

.method private static final updateMessage$lambda$45(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 1

    const-string v0, "old"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->attachmentUrlValidator:Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;->updateValidAttachmentsUrl$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p0

    return-object p0
.end method

.method private static final updateMessageFromEvent$lambda$52(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lc93/m;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 1

    const-string v0, "old"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->attachmentUrlValidator:Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;

    invoke-virtual {p0, p1, p3}, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;->updateValidAttachmentsUrl$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p0

    invoke-interface {p2, p3, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/models/Message;

    return-object p0
.end method

.method private static final updateQuotedMessageReferences$preservedReplyTo(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 0

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getReplyTo()Lio/getstream/chat/android/models/Message;

    move-result-object p2

    if-nez p2, :cond_0

    return-object p0

    :cond_0
    iget-object p1, p1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->attachmentUrlValidator:Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;

    invoke-virtual {p1, p0, p2}, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;->updateValidAttachmentsUrl$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic upsertCachedLatestMessages$default(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Ljava/util/List;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertCachedLatestMessages(Ljava/util/List;Z)V

    return-void
.end method

.method private static final upsertCachedMessage$lambda$44$lambda$43(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 1

    const-string v0, "old"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->attachmentUrlValidator:Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;->updateValidAttachmentsUrl$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p0

    return-object p0
.end method

.method private static final upsertMessage$lambda$32$lambda$31(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 1

    const-string v0, "old"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->attachmentUrlValidator:Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;->updateValidAttachmentsUrl$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p0

    return-object p0
.end method

.method private static final upsertMessage$lambda$34$lambda$33(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 1

    const-string v0, "old"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->attachmentUrlValidator:Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;->updateValidAttachmentsUrl$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic upsertMessages$default(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Ljava/util/List;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertMessages(Ljava/util/List;Z)V

    return-void
.end method

.method public static synthetic v(Ljava/util/List;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->localOnlyMessagesInRange$lambda$1(Ljava/util/List;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Ljava/util/Map;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->reads$lambda$9(Ljava/util/Map;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final watchers$lambda$8(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;
    .locals 1

    const-string v0, "watchers"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "users"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/util/Collection;

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/extensions/internal/UserKt;->updateUsers(Ljava/util/Collection;Ljava/util/Map;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Config;Ljava/util/List;)Ljava/util/Date;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->lastSentMessageDate$lambda$17(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Config;Ljava/util/List;)Ljava/util/Date;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lio/getstream/chat/android/models/PushPreference;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setPushPreference$lambda$146(Lio/getstream/chat/android/models/PushPreference;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->activeLiveLocations$lambda$19(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method


# virtual methods
.method public final addMember(Lio/getstream/chat/android/client/events/MemberAddedEvent;)V
    .locals 4

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/MemberAddedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_members:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_2
    :goto_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_members:Lec3/p1;

    :cond_3
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    check-cast v3, Ljava/util/Collection;

    invoke-static {p1, v3}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_memberCount:Lec3/p1;

    :cond_4
    move-object p1, v1

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :goto_1
    return-void
.end method

.method public final addPinnedMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "pinnedMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->addPinnedMessages(Ljava/util/List;)V

    return-void
.end method

.method public final addPinnedMessages(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pinnedMessages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->registerPollForMessage(Lio/getstream/chat/android/models/Poll;Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getReplyTo()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->addQuotedMessage(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getReplyMessageId()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->addQuotedMessage(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_pinnedMessages:Lec3/p1;

    :cond_5
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/models/Message;

    sget-object v6, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$addPinnedMessages$4$1;->INSTANCE:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$addPinnedMessages$4$1;

    new-instance v7, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$addPinnedMessages$lambda$115$$inlined$compareBy$1;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    new-instance v8, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;

    const/4 v9, 0x0

    invoke-direct {v8, p0, v5, v9}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;I)V

    invoke-static {v3, v5, v6, v7, v8}, Lio/getstream/chat/android/client/internal/state/utils/internal/ListKt;->upsertSorted(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object v3

    goto :goto_1

    :cond_6
    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    :goto_2
    return-void
.end method

.method public final addQuotedMessage(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const-string v0, "quotedMessageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "quotingMessageId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_quotedMessagesMap:Lec3/p1;

    :cond_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/Map;

    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Set;

    if-nez v4, :cond_1

    sget-object v4, Lm83/a0;->w:Lm83/a0;

    :cond_1
    invoke-static {p2, v4}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v4

    new-instance v5, Ll83/k;

    invoke-direct {v5, p1, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v5}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method public final addWatcher(Lio/getstream/chat/android/client/events/UserStartWatchingEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UserStartWatchingEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UserStartWatchingEvent;->getWatcherCount()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertWatchers(Ljava/util/List;I)V

    return-void
.end method

.method public final cacheLatestMessages()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_cachedLatestMessages:Lec3/p1;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_messages:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/16 v2, 0x19

    invoke-static {v2, v1}, Lm83/s;->x1(ILjava/util/List;)Ljava/util/List;

    move-result-object v1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final clearCachedLatestMessages()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_cachedLatestMessages:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-virtual {v0, v1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final deleteChannel(Ljava/util/Date;)V
    .locals 2

    const-string v0, "deletedAt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhb2/c;

    const/16 v1, 0x14

    invoke-direct {v0, p1, v1}, Lhb2/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateChannelData(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final deleteMembership()V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/client/api/state/a;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/api/state/a;-><init>(I)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateChannelData(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final deleteMessage(Ljava/lang/String;)V
    .locals 7

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_messages:Lec3/p1;

    :cond_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v1, v2, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_cachedLatestMessages:Lec3/p1;

    :cond_3
    move-object v0, v1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-virtual {v0, v2, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_pinnedMessages:Lec3/p1;

    :cond_6
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_7
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    invoke-virtual {v1, v2, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->localOnlyMessages:Lec3/p1;

    :cond_9
    move-object v0, v1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_a
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_b
    invoke-virtual {v0, v2, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    return-void
.end method

.method public final deleteMessagesFromUser(Ljava/lang/String;ZLjava/util/Date;)V
    .locals 62

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "userId"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "deletedAt"

    move-object/from16 v3, p3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_b

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_messages:Lec3/p1;

    :cond_0
    move-object v3, v2

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/util/List;

    move-object v6, v5

    check-cast v6, Ljava/lang/Iterable;

    instance-of v7, v6, Ljava/util/Collection;

    if-eqz v7, :cond_1

    move-object v7, v6

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v8}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v8

    invoke-virtual {v8}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_3
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v8}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v8

    invoke-virtual {v8}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    :goto_1
    invoke-virtual {v3, v4, v5}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_cachedLatestMessages:Lec3/p1;

    :cond_5
    move-object v2, v3

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/util/List;

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v8}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v8

    invoke-virtual {v8}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    invoke-virtual {v2, v4, v6}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_pinnedMessages:Lec3/p1;

    :cond_8
    move-object v3, v2

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/util/List;

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_9
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v8}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v8

    invoke-virtual {v8}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_a
    invoke-virtual {v3, v4, v6}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    goto/16 :goto_13

    :cond_b
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_messages:Lec3/p1;

    :goto_4
    move-object v4, v2

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/util/List;

    move-object v7, v6

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    const/16 v55, 0x0

    const/16 v56, 0x0

    move/from16 v8, v55

    move-object/from16 v9, v56

    :goto_5
    if-ge v8, v7, :cond_e

    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v10}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v11

    invoke-virtual {v11}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    if-nez v9, :cond_c

    move-object v9, v6

    check-cast v9, Ljava/util/Collection;

    invoke-static {v9}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v9

    :cond_c
    const v53, 0xffff

    const/16 v54, 0x0

    move-object v11, v4

    const/4 v4, 0x0

    move-object v12, v5

    const/4 v5, 0x0

    move-object v13, v6

    const/4 v6, 0x0

    move v14, v7

    const/4 v7, 0x0

    move v15, v8

    const/4 v8, 0x0

    move-object/from16 v16, v9

    const/4 v9, 0x0

    move-object v3, v10

    const/4 v10, 0x0

    move-object/from16 v17, v11

    const/4 v11, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    move-object/from16 v19, v13

    const/4 v13, 0x0

    move/from16 v20, v14

    const/4 v14, 0x0

    move/from16 v21, v15

    const/4 v15, 0x0

    move-object/from16 v22, v16

    const/16 v16, 0x0

    move-object/from16 v23, v17

    const/16 v17, 0x0

    move-object/from16 v24, v18

    const/16 v18, 0x0

    move-object/from16 v25, v19

    const/16 v19, 0x0

    move/from16 v26, v20

    const/16 v20, 0x0

    move/from16 v27, v21

    const/16 v21, 0x0

    move-object/from16 v28, v22

    const/16 v22, 0x0

    move-object/from16 v29, v23

    const/16 v23, 0x0

    move-object/from16 v30, v25

    const/16 v25, 0x0

    move/from16 v31, v26

    const/16 v26, 0x0

    move/from16 v32, v27

    const/16 v27, 0x0

    move-object/from16 v33, v28

    const/16 v28, 0x0

    move-object/from16 v34, v29

    const/16 v29, 0x0

    move-object/from16 v35, v30

    const/16 v30, 0x0

    move/from16 v36, v31

    const/16 v31, 0x0

    move/from16 v37, v32

    const/16 v32, 0x0

    move-object/from16 v38, v33

    const/16 v33, 0x0

    move-object/from16 v39, v34

    const/16 v34, 0x0

    move-object/from16 v40, v35

    const/16 v35, 0x0

    move/from16 v41, v36

    const/16 v36, 0x0

    move/from16 v42, v37

    const/16 v37, 0x0

    move-object/from16 v43, v38

    const/16 v38, 0x0

    move-object/from16 v44, v39

    const/16 v39, 0x0

    move-object/from16 v45, v40

    const/16 v40, 0x0

    move/from16 v46, v41

    const/16 v41, 0x0

    move/from16 v47, v42

    const/16 v42, 0x0

    move-object/from16 v48, v43

    const/16 v43, 0x0

    move-object/from16 v49, v44

    const/16 v44, 0x0

    move-object/from16 v50, v45

    const/16 v45, 0x0

    move/from16 v51, v46

    const/16 v46, 0x0

    move/from16 v52, v47

    const/16 v47, 0x0

    move-object/from16 v57, v48

    const/16 v48, 0x0

    move-object/from16 v58, v49

    const/16 v49, 0x0

    move-object/from16 v59, v50

    const/16 v50, 0x0

    move/from16 v60, v51

    const/16 v51, 0x0

    move/from16 v61, v52

    const v52, -0x100001

    move-object/from16 v1, v57

    move/from16 v0, v61

    move-object/from16 v57, v2

    move-object/from16 v2, v58

    move-object/from16 v58, v24

    move-object/from16 v24, p3

    invoke-static/range {v3 .. v54}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v3

    invoke-interface {v1, v0, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-object v9, v1

    goto :goto_6

    :cond_d
    move-object/from16 v57, v2

    move-object v2, v4

    move-object/from16 v58, v5

    move-object/from16 v59, v6

    move/from16 v60, v7

    move v0, v8

    :goto_6
    add-int/lit8 v8, v0, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p3

    move-object v4, v2

    move-object/from16 v2, v57

    move-object/from16 v5, v58

    move-object/from16 v6, v59

    move/from16 v7, v60

    goto/16 :goto_5

    :cond_e
    move-object/from16 v57, v2

    move-object v2, v4

    move-object/from16 v58, v5

    move-object/from16 v59, v6

    if-nez v9, :cond_f

    move-object/from16 v6, v59

    :goto_7
    move-object/from16 v12, v58

    goto :goto_8

    :cond_f
    move-object v6, v9

    goto :goto_7

    :goto_8
    invoke-virtual {v2, v12, v6}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_cachedLatestMessages:Lec3/p1;

    :goto_9
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/util/List;

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    move/from16 v6, v55

    move-object/from16 v7, v56

    :goto_a
    if-ge v6, v5, :cond_12

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v8}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v9

    invoke-virtual {v9}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v10, p1

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_11

    if-nez v7, :cond_10

    move-object v7, v4

    check-cast v7, Ljava/util/Collection;

    invoke-static {v7}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v7

    :cond_10
    const v53, 0xffff

    const/16 v54, 0x0

    move-object v9, v4

    const/4 v4, 0x0

    move v11, v5

    const/4 v5, 0x0

    move v12, v6

    const/4 v6, 0x0

    move-object v13, v7

    const/4 v7, 0x0

    move-object v14, v3

    move-object v3, v8

    const/4 v8, 0x0

    move-object v15, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v16, v11

    const/4 v11, 0x0

    move/from16 v17, v12

    const/4 v12, 0x0

    move-object/from16 v18, v13

    const/4 v13, 0x0

    move-object/from16 v19, v14

    const/4 v14, 0x0

    move-object/from16 v20, v15

    const/4 v15, 0x0

    move/from16 v21, v16

    const/16 v16, 0x0

    move/from16 v22, v17

    const/16 v17, 0x0

    move-object/from16 v23, v18

    const/16 v18, 0x0

    move-object/from16 v24, v19

    const/16 v19, 0x0

    move-object/from16 v25, v20

    const/16 v20, 0x0

    move/from16 v26, v21

    const/16 v21, 0x0

    move/from16 v27, v22

    const/16 v22, 0x0

    move-object/from16 v28, v23

    const/16 v23, 0x0

    move-object/from16 v29, v25

    const/16 v25, 0x0

    move/from16 v30, v26

    const/16 v26, 0x0

    move/from16 v31, v27

    const/16 v27, 0x0

    move-object/from16 v32, v28

    const/16 v28, 0x0

    move-object/from16 v33, v29

    const/16 v29, 0x0

    move/from16 v34, v30

    const/16 v30, 0x0

    move/from16 v35, v31

    const/16 v31, 0x0

    move-object/from16 v36, v32

    const/16 v32, 0x0

    move-object/from16 v37, v33

    const/16 v33, 0x0

    move/from16 v38, v34

    const/16 v34, 0x0

    move/from16 v39, v35

    const/16 v35, 0x0

    move-object/from16 v40, v36

    const/16 v36, 0x0

    move-object/from16 v41, v37

    const/16 v37, 0x0

    move/from16 v42, v38

    const/16 v38, 0x0

    move/from16 v43, v39

    const/16 v39, 0x0

    move-object/from16 v44, v40

    const/16 v40, 0x0

    move-object/from16 v45, v41

    const/16 v41, 0x0

    move/from16 v46, v42

    const/16 v42, 0x0

    move/from16 v47, v43

    const/16 v43, 0x0

    move-object/from16 v48, v44

    const/16 v44, 0x0

    move-object/from16 v49, v45

    const/16 v45, 0x0

    move/from16 v50, v46

    const/16 v46, 0x0

    move/from16 v51, v47

    const/16 v47, 0x0

    move-object/from16 v52, v48

    const/16 v48, 0x0

    move-object/from16 v57, v49

    const/16 v49, 0x0

    move/from16 v58, v50

    const/16 v50, 0x0

    move/from16 v59, v51

    const/16 v51, 0x0

    move-object/from16 v60, v52

    const v52, -0x100001

    move/from16 v0, v59

    move/from16 v59, v58

    move-object/from16 v58, v1

    move-object/from16 v1, v60

    move-object/from16 v60, v24

    move-object/from16 v24, p3

    invoke-static/range {v3 .. v54}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v3

    invoke-interface {v1, v0, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-object v7, v1

    goto :goto_b

    :cond_11
    move-object/from16 v58, v1

    move-object/from16 v60, v3

    move-object/from16 v57, v4

    move/from16 v59, v5

    move v0, v6

    :goto_b
    add-int/lit8 v6, v0, 0x1

    move-object/from16 v0, p0

    move-object/from16 v4, v57

    move-object/from16 v1, v58

    move/from16 v5, v59

    move-object/from16 v3, v60

    goto/16 :goto_a

    :cond_12
    move-object/from16 v58, v1

    move-object/from16 v60, v3

    move-object/from16 v57, v4

    if-nez v7, :cond_13

    move-object/from16 v4, v57

    :goto_c
    move-object/from16 v14, v60

    goto :goto_d

    :cond_13
    move-object v4, v7

    goto :goto_c

    :goto_d
    invoke-virtual {v2, v14, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_pinnedMessages:Lec3/p1;

    :goto_e
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/util/List;

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    move/from16 v6, v55

    move-object/from16 v7, v56

    :goto_f
    if-ge v6, v5, :cond_16

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v8}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v9

    invoke-virtual {v9}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v10, p1

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_15

    if-nez v7, :cond_14

    move-object v7, v4

    check-cast v7, Ljava/util/Collection;

    invoke-static {v7}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v7

    :cond_14
    const v53, 0xffff

    const/16 v54, 0x0

    move-object v9, v4

    const/4 v4, 0x0

    move v11, v5

    const/4 v5, 0x0

    move v12, v6

    const/4 v6, 0x0

    move-object v13, v7

    const/4 v7, 0x0

    move-object v14, v3

    move-object v3, v8

    const/4 v8, 0x0

    move-object v15, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v16, v11

    const/4 v11, 0x0

    move/from16 v17, v12

    const/4 v12, 0x0

    move-object/from16 v18, v13

    const/4 v13, 0x0

    move-object/from16 v19, v14

    const/4 v14, 0x0

    move-object/from16 v20, v15

    const/4 v15, 0x0

    move/from16 v21, v16

    const/16 v16, 0x0

    move/from16 v22, v17

    const/16 v17, 0x0

    move-object/from16 v23, v18

    const/16 v18, 0x0

    move-object/from16 v24, v19

    const/16 v19, 0x0

    move-object/from16 v25, v20

    const/16 v20, 0x0

    move/from16 v26, v21

    const/16 v21, 0x0

    move/from16 v27, v22

    const/16 v22, 0x0

    move-object/from16 v28, v23

    const/16 v23, 0x0

    move-object/from16 v29, v25

    const/16 v25, 0x0

    move/from16 v30, v26

    const/16 v26, 0x0

    move/from16 v31, v27

    const/16 v27, 0x0

    move-object/from16 v32, v28

    const/16 v28, 0x0

    move-object/from16 v33, v29

    const/16 v29, 0x0

    move/from16 v34, v30

    const/16 v30, 0x0

    move/from16 v35, v31

    const/16 v31, 0x0

    move-object/from16 v36, v32

    const/16 v32, 0x0

    move-object/from16 v37, v33

    const/16 v33, 0x0

    move/from16 v38, v34

    const/16 v34, 0x0

    move/from16 v39, v35

    const/16 v35, 0x0

    move-object/from16 v40, v36

    const/16 v36, 0x0

    move-object/from16 v41, v37

    const/16 v37, 0x0

    move/from16 v42, v38

    const/16 v38, 0x0

    move/from16 v43, v39

    const/16 v39, 0x0

    move-object/from16 v44, v40

    const/16 v40, 0x0

    move-object/from16 v45, v41

    const/16 v41, 0x0

    move/from16 v46, v42

    const/16 v42, 0x0

    move/from16 v47, v43

    const/16 v43, 0x0

    move-object/from16 v48, v44

    const/16 v44, 0x0

    move-object/from16 v49, v45

    const/16 v45, 0x0

    move/from16 v50, v46

    const/16 v46, 0x0

    move/from16 v51, v47

    const/16 v47, 0x0

    move-object/from16 v52, v48

    const/16 v48, 0x0

    move-object/from16 v57, v49

    const/16 v49, 0x0

    move/from16 v58, v50

    const/16 v50, 0x0

    move/from16 v59, v51

    const/16 v51, 0x0

    move-object/from16 v60, v52

    const v52, -0x100001

    move/from16 v0, v59

    move-object/from16 v59, v1

    move v1, v0

    move-object/from16 v0, v60

    move-object/from16 v60, v24

    move-object/from16 v24, p3

    invoke-static/range {v3 .. v54}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-object v7, v0

    goto :goto_10

    :cond_15
    move-object/from16 v59, v1

    move-object/from16 v60, v3

    move-object/from16 v57, v4

    move/from16 v58, v5

    move v1, v6

    :goto_10
    add-int/lit8 v6, v1, 0x1

    move-object/from16 v0, p0

    move-object/from16 v4, v57

    move/from16 v5, v58

    move-object/from16 v1, v59

    move-object/from16 v3, v60

    goto/16 :goto_f

    :cond_16
    move-object/from16 v59, v1

    move-object/from16 v60, v3

    move-object/from16 v57, v4

    if-nez v7, :cond_17

    move-object/from16 v4, v57

    :goto_11
    move-object/from16 v14, v60

    goto :goto_12

    :cond_17
    move-object v4, v7

    goto :goto_11

    :goto_12
    invoke-virtual {v2, v14, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    :goto_13
    return-void

    :cond_18
    move-object/from16 v0, p0

    move-object/from16 v1, v59

    goto/16 :goto_e

    :cond_19
    move-object/from16 v0, p0

    move-object/from16 v1, v58

    goto/16 :goto_9

    :cond_1a
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p3

    move-object/from16 v2, v57

    goto/16 :goto_4
.end method

.method public final deletePinnedMessage(Ljava/lang/String;)V
    .locals 7

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_pinnedMessages:Lec3/p1;

    :cond_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    move-object v4, v3

    check-cast v4, Ljava/lang/Iterable;

    instance-of v5, v4, Ljava/util/Collection;

    if-eqz v5, :cond_1

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    :goto_1
    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method public final deletePoll(Lio/getstream/chat/android/models/Poll;)V
    .locals 55

    move-object/from16 v0, p0

    const-string v1, "poll"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->polls:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->messagesWithPolls:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    if-nez v1, :cond_0

    sget-object v1, Lm83/a0;->w:Lm83/a0;

    :cond_0
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v3

    if-eqz v3, :cond_1

    const v53, 0xfbff

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

    const/16 v52, -0x1

    invoke-static/range {v3 .. v54}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateMessage(Lio/getstream/chat/android/models/Message;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final deleteQuotedMessageReferences(Ljava/lang/String;)V
    .locals 65

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "quotedMessageId"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_quotedMessagesMap:Lec3/p1;

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    if-eqz v3, :cond_11

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_6

    :cond_0
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_messages:Lec3/p1;

    :cond_1
    move-object v4, v3

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/util/List;

    move-object v7, v6

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v10, v8

    move-object v11, v9

    :goto_0
    if-ge v10, v7, :cond_4

    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v13}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v2, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    if-nez v11, :cond_2

    move-object v11, v6

    check-cast v11, Ljava/util/Collection;

    invoke-static {v11}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v11

    :cond_2
    const v63, 0xffff

    const/16 v64, 0x0

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

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const v62, -0x40000001    # -1.9999999f

    invoke-static/range {v13 .. v64}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v12

    invoke-interface {v11, v10, v12}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_3
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    :cond_4
    if-nez v11, :cond_5

    goto :goto_1

    :cond_5
    move-object v6, v11

    :goto_1
    invoke-virtual {v4, v5, v6}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_cachedLatestMessages:Lec3/p1;

    :cond_6
    move-object v3, v4

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/util/List;

    move-object v7, v6

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    move v10, v8

    move-object v11, v9

    :goto_2
    if-ge v10, v7, :cond_9

    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v13}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v2, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    if-nez v11, :cond_7

    move-object v11, v6

    check-cast v11, Ljava/util/Collection;

    invoke-static {v11}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v11

    :cond_7
    const v63, 0xffff

    const/16 v64, 0x0

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

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const v62, -0x40000001    # -1.9999999f

    invoke-static/range {v13 .. v64}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v12

    invoke-interface {v11, v10, v12}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_8
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_2

    :cond_9
    if-nez v11, :cond_a

    goto :goto_3

    :cond_a
    move-object v6, v11

    :goto_3
    invoke-virtual {v3, v5, v6}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_pinnedMessages:Lec3/p1;

    :cond_b
    move-object v4, v3

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/util/List;

    move-object v7, v6

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    move v10, v8

    move-object v11, v9

    :goto_4
    if-ge v10, v7, :cond_e

    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v13}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v2, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_d

    if-nez v11, :cond_c

    move-object v11, v6

    check-cast v11, Ljava/util/Collection;

    invoke-static {v11}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v11

    :cond_c
    const v63, 0xffff

    const/16 v64, 0x0

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

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const v62, -0x40000001    # -1.9999999f

    invoke-static/range {v13 .. v64}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v12

    invoke-interface {v11, v10, v12}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_d
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_4

    :cond_e
    if-nez v11, :cond_f

    goto :goto_5

    :cond_f
    move-object v6, v11

    :goto_5
    invoke-virtual {v4, v5, v6}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_quotedMessagesMap:Lec3/p1;

    :cond_10
    move-object v2, v4

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/util/Map;

    invoke-static {v1, v5}, Lm83/g0;->Z(Ljava/lang/Object;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v2, v3, v5}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_7

    :cond_11
    :goto_6
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_quotedMessagesMap:Lec3/p1;

    :cond_12
    move-object v3, v2

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/util/Map;

    invoke-static {v1, v5}, Lm83/g0;->Z(Ljava/lang/Object;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    :goto_7
    return-void
.end method

.method public final destroy()V
    .locals 36

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_repliedMessage:Lec3/p1;

    check-cast v1, Lec3/h2;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_quotedMessagesMap:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lm83/z;->w:Lm83/z;

    invoke-virtual {v1, v2, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_messages:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lm83/y;->w:Lm83/y;

    invoke-virtual {v1, v2, v4}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_pendingMessages:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v4}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_pendingEnabled:Lec3/p1;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v5}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_cachedLatestMessages:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v4}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_pinnedMessages:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v4}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_watcherCount:Lec3/p1;

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v7}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_watchers:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v4}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_typing:Lec3/p1;

    new-instance v8, Lio/getstream/chat/android/models/TypingEvent;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->channelId:Ljava/lang/String;

    invoke-direct {v8, v9, v4}, Lio/getstream/chat/android/models/TypingEvent;-><init>(Ljava/lang/String;Ljava/util/List;)V

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v8}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_reads:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_memberCount:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v7}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_members:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v4}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_channelData:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1, v2}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_hidden:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v5}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_muted:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v5}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_channelConfig:Lec3/p1;

    new-instance v7, Lio/getstream/chat/android/models/Config;

    const v34, 0x3ffffff

    const/16 v35, 0x0

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

    invoke-direct/range {v7 .. v35}, Lio/getstream/chat/android/models/Config;-><init>(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZZZZZZZZZZZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v7}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->paginationManager:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;

    invoke-interface {v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;->reset()V

    iput-boolean v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_recoveryNeeded:Z

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_insideSearch:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v5}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->lastStartTypingEvent:Ljava/util/Date;

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->keystrokeParentMessageId:Ljava/lang/String;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->messagesWithPolls:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->polls:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->processedMessageIds:La0/a0;

    const/4 v2, -0x1

    invoke-virtual {v1, v2}, La0/a0;->i(I)V

    return-void
.end method

.method public final getActiveLiveLocations()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->activeLiveLocations:Lec3/f2;

    return-object v0
.end method

.method public final getChannelConfig()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->channelConfig:Lec3/f2;

    return-object v0
.end method

.method public final getChannelData()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->channelData:Lec3/f2;

    return-object v0
.end method

.method public final getChannelId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->channelId:Ljava/lang/String;

    return-object v0
.end method

.method public final getChannelType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->channelType:Ljava/lang/String;

    return-object v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getEndOfNewerMessages()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->endOfNewerMessages:Lec3/f2;

    return-object v0
.end method

.method public final getEndOfOlderMessages()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->endOfOlderMessages:Lec3/f2;

    return-object v0
.end method

.method public final getHidden()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->hidden:Lec3/f2;

    return-object v0
.end method

.method public final getInsideSearch()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->insideSearch:Lec3/f2;

    return-object v0
.end method

.method public final getLastSentMessageDate()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->lastSentMessageDate:Lec3/f2;

    return-object v0
.end method

.method public final getLastStartTypingEvent()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->lastStartTypingEvent:Ljava/util/Date;

    return-object v0
.end method

.method public final getLoading()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->loading:Lec3/f2;

    return-object v0
.end method

.method public final getLoadingNewerMessages()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->loadingNewerMessages:Lec3/f2;

    return-object v0
.end method

.method public final getLoadingOlderMessages()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->loadingOlderMessages:Lec3/f2;

    return-object v0
.end method

.method public final getMembers()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->members:Lec3/f2;

    return-object v0
.end method

.method public final getMembersCount()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->membersCount:Lec3/f2;

    return-object v0
.end method

.method public final getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;
    .locals 4

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_messages:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Lio/getstream/chat/android/models/Message;

    if-nez v1, :cond_6

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_cachedLatestMessages:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_3
    move-object v1, v2

    :goto_1
    check-cast v1, Lio/getstream/chat/android/models/Message;

    if-nez v1, :cond_6

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_pinnedMessages:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    move-object v2, v1

    :cond_5
    check-cast v2, Lio/getstream/chat/android/models/Message;

    return-object v2

    :cond_6
    return-object v1
.end method

.method public final getMessageCount()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->messageCount:Lec3/f2;

    return-object v0
.end method

.method public final getMessages()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->messages:Lec3/f2;

    return-object v0
.end method

.method public final getMessagesState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->messagesState:Lec3/f2;

    return-object v0
.end method

.method public final getMuted()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->muted:Lec3/f2;

    return-object v0
.end method

.method public final getOldestMessage()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_messages:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final getPaginationManager()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->paginationManager:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;

    return-object v0
.end method

.method public final getPinnedMessages()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->pinnedMessages:Lec3/f2;

    return-object v0
.end method

.method public final getPoll(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->polls:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Poll;

    return-object p1
.end method

.method public final getQuotedMessagesMap()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->quotedMessagesMap:Lec3/f2;

    return-object v0
.end method

.method public final getRead()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->read:Lec3/f2;

    return-object v0
.end method

.method public final getReads()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->reads:Lec3/f2;

    return-object v0
.end method

.method public final getRecoveryNeeded()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_recoveryNeeded:Z

    return v0
.end method

.method public final getRepliedMessage()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->repliedMessage:Lec3/f2;

    return-object v0
.end method

.method public final getTyping()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->typing:Lec3/f2;

    return-object v0
.end method

.method public final getUnreadCount()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->unreadCount:Lec3/f2;

    return-object v0
.end method

.method public final getWatcherCount()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->watcherCount:Lec3/f2;

    return-object v0
.end method

.method public final getWatchers()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->watchers:Lec3/f2;

    return-object v0
.end method

.method public final hideMessagesBefore(Ljava/util/Date;)V
    .locals 1

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->removeMessagesBefore(Ljava/util/Date;Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public final markRead()Z
    .locals 12

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->channelConfig:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Config;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getReadEventsEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_messages:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Message;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->read:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/ChannelUserRead;

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastReadMessageId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-static {v0, v1}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v4

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-static {v0, v1}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v6

    const/16 v10, 0x71

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v11}, Lio/getstream/chat/android/models/ChannelUserRead;->copy$default(Lio/getstream/chat/android/models/ChannelUserRead;Lio/getstream/chat/android/models/User;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_reads:Lec3/p1;

    :cond_3
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/util/Map;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/ChannelUserRead;->getUserId()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ll83/k;

    invoke-direct {v6, v5, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v6}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_4
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public final removeMember(Lio/getstream/chat/android/client/events/MemberRemovedEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/MemberRemovedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->deleteMemberAndDecrementMemberCount(Ljava/lang/String;)V

    return-void
.end method

.method public final removeMember(Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->deleteMemberAndDecrementMemberCount(Ljava/lang/String;)V

    return-void
.end method

.method public final removeMessagesBefore(Ljava/util/Date;Lio/getstream/chat/android/models/Message;)V
    .locals 7

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_messages:Lec3/p1;

    :cond_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    move-object v4, v3

    check-cast v4, Ljava/lang/Iterable;

    instance-of v5, v4, Ljava/util/Collection;

    if-eqz v5, :cond_1

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/models/Message;

    invoke-static {v6, p1}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->wasCreatedAfter(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Z

    move-result v6

    if-nez v6, :cond_2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lio/getstream/chat/android/models/Message;

    invoke-static {v6, p1}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->wasCreatedAfter(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    :goto_1
    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_cachedLatestMessages:Lec3/p1;

    :cond_5
    move-object v0, v1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lio/getstream/chat/android/models/Message;

    invoke-static {v6, p1}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->wasCreatedAfter(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    invoke-virtual {v0, v2, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_pinnedMessages:Lec3/p1;

    :cond_8
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_9
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lio/getstream/chat/android/models/Message;

    invoke-static {v6, p1}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->wasCreatedAfter(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_a
    invoke-virtual {v1, v2, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    if-eqz p2, :cond_b

    invoke-virtual {p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_b
    return-void
.end method

.method public final removePendingMessage(Ljava/lang/String;)V
    .locals 7

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_pendingMessages:Lec3/p1;

    :cond_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    move-object v4, v3

    check-cast v4, Ljava/lang/Iterable;

    instance-of v5, v4, Ljava/util/Collection;

    if-eqz v5, :cond_1

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    :goto_1
    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method public final removeWatcher(Lio/getstream/chat/android/client/events/UserStopWatchingEvent;)V
    .locals 8

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_watchers:Lec3/p1;

    :cond_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lio/getstream/chat/android/models/User;

    invoke-virtual {v6}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UserStopWatchingEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v7

    invoke-virtual {v7}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v1, v2, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_watcherCount:Lec3/p1;

    const/4 v1, 0x0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UserStopWatchingEvent;->getWatcherCount()I

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final setChannelConfig(Lio/getstream/chat/android/models/Config;)V
    .locals 3

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_channelConfig:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Config;->getMarkMessagesPending()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_pendingMessages:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-virtual {v0, v1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_pendingEnabled:Lec3/p1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final setHidden(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_hidden:Lec3/p1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final setInsideSearch(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_insideSearch:Lec3/p1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final setKeystrokeParentMessageId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->keystrokeParentMessageId:Ljava/lang/String;

    return-void
.end method

.method public final setLastStartTypingEvent(Ljava/util/Date;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->lastStartTypingEvent:Ljava/util/Date;

    return-void
.end method

.method public final setLocalOnlyMessages(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)V"
        }
    .end annotation

    const-string v0, "messages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->localOnlyMessages:Lec3/p1;

    :cond_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    invoke-virtual {v1, v2, p1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method public final setMemberCount(I)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_memberCount:Lec3/p1;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final setMembers(Ljava/util/List;)V
    .locals 2
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_members:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final setMembership(Lio/getstream/chat/android/models/Member;)V
    .locals 2

    const-string v0, "membership"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/c;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/c;-><init>(Lio/getstream/chat/android/models/Member;I)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateChannelData(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final setMessageCount(I)V
    .locals 2

    new-instance v0, Lcom/whoop/data/local/room/dao/persistent/e;

    const/16 v1, 0x12

    invoke-direct {v0, p1, v1}, Lcom/whoop/data/local/room/dao/persistent/e;-><init>(II)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateChannelData(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final setMessages(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)V"
        }
    .end annotation

    const-string v0, "messages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-direct {p0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->shouldIgnoreUpsertion(Lio/getstream/chat/android/models/Message;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getReplyTo()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->addQuotedMessage(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getReplyMessageId()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->addQuotedMessage(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->registerPollForMessage(Lio/getstream/chat/android/models/Poll;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_messages:Lec3/p1;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final setMuted(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_muted:Lec3/p1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final setPendingMessages(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)V"
        }
    .end annotation

    const-string v0, "messages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_pendingMessages:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final setPushPreference(Lio/getstream/chat/android/models/PushPreference;)V
    .locals 2

    const-string v0, "preference"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/b;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/b;-><init>(Lio/getstream/chat/android/models/PushPreference;I)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateChannelData(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final setRecoveryNeeded(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_recoveryNeeded:Z

    return-void
.end method

.method public final setRepliedMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_repliedMessage:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void
.end method

.method public final setTyping(Lio/getstream/chat/android/models/TypingEvent;)V
    .locals 2

    const-string v0, "typingEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_typing:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final setWatchers(Ljava/util/List;I)V
    .locals 2
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_watchers:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_watcherCount:Lec3/p1;

    const/4 v0, 0x0

    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v1, p2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final toChannel()Lio/getstream/chat/android/models/Channel;
    .locals 49

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->channelData:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/ChannelData;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->messages:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/util/List;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_cachedLatestMessages:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/util/List;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->members:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ljava/util/List;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->reads:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljava/util/List;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->watchers:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ljava/util/List;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->watcherCount:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v8

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->insideSearch:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    invoke-virtual/range {v2 .. v9}, Lio/getstream/chat/android/models/ChannelData;->toChannel(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;IZ)Lio/getstream/chat/android/models/Channel;

    move-result-object v10

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->channelConfig:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v26, v1

    check-cast v26, Lio/getstream/chat/android/models/Config;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->hidden:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v30, v1

    check-cast v30, Ljava/lang/Boolean;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->pinnedMessages:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v34, v1

    check-cast v34, Ljava/util/List;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->activeLiveLocations:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v40, v1

    check-cast v40, Ljava/util/List;

    const/16 v47, 0x7

    const/16 v48, 0x0

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

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const v46, -0x20888001

    invoke-static/range {v10 .. v48}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    return-object v1
.end method

.method public final trimNewestMessages()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$TrimDirection;->FROM_NEWEST:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$TrimDirection;

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->applyMessageLimitIfNeeded(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$TrimDirection;)V

    return-void
.end method

.method public final trimOldestMessages()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$TrimDirection;->FROM_OLDEST:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$TrimDirection;

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->applyMessageLimitIfNeeded(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$TrimDirection;)V

    return-void
.end method

.method public final updateChannelData(Lio/getstream/chat/android/client/events/HasChannel;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/a;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/a;-><init>(Lio/getstream/chat/android/client/events/HasChannel;I)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateChannelData(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final updateChannelData(Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "update"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_channelData:Lec3/p1;

    .line 2
    :cond_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 3
    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/ChannelData;

    .line 4
    invoke-interface {p1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/models/ChannelData;

    .line 5
    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method public final updateCurrentUserRead(Ljava/util/Date;Lio/getstream/chat/android/models/Message;)V
    .locals 11

    const-string v0, "eventReceivedDate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->processedMessageIds:La0/a0;

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
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->muted:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->processedMessageIds:La0/a0;

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

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->processedMessageIds:La0/a0;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->currentUser:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

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

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->processedMessageIds:La0/a0;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_4
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->mutedUsers:Lec3/f2;

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

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->processedMessageIds:La0/a0;

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

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->processedMessageIds:La0/a0;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2, v0}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_9
    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getSilent()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->processedMessageIds:La0/a0;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2, v0}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_a
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->read:Lec3/f2;

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

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->processedMessageIds:La0/a0;

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

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateRead(Lio/getstream/chat/android/models/ChannelUserRead;)V

    :cond_c
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->processedMessageIds:La0/a0;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2, v0}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final updateDelivered(Lio/getstream/chat/android/models/ChannelUserRead;)V
    .locals 11

    const-string v0, "read"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_reads:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/models/ChannelUserRead;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastReceivedEventDate()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastDeliveredAt()Ljava/util/Date;

    move-result-object v7

    invoke-virtual {p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastDeliveredMessageId()Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0x1c

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v10}, Lio/getstream/chat/android/models/ChannelUserRead;->copy$default(Lio/getstream/chat/android/models/ChannelUserRead;Lio/getstream/chat/android/models/User;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_reads:Lec3/p1;

    :cond_2
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/Map;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ll83/k;

    invoke-direct {v5, v4, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v5}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-void
.end method

.method public final updateLastMessageAt(Lio/getstream/chat/android/models/Message;)V
    .locals 3

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_channelConfig:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Config;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getSkipLastMsgUpdateForSystemMsgs()Z

    move-result v0

    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/d;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/d;-><init>(Lio/getstream/chat/android/models/Message;ZI)V

    invoke-virtual {p0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateChannelData(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final updateMemberBan(Ljava/lang/String;ZLjava/util/Date;Z)V
    .locals 27

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_members:Lec3/p1;

    :cond_0
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/util/List;

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_3

    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v9}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v8

    invoke-virtual {v8}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v8

    move-object/from16 v10, p1

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    if-nez v6, :cond_1

    move-object v6, v4

    check-cast v6, Ljava/util/Collection;

    invoke-static {v6}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v6

    :cond_1
    const/16 v25, 0x773f

    const/16 v26, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move/from16 v17, p2

    move-object/from16 v21, p3

    move/from16 v16, p4

    invoke-static/range {v9 .. v26}, Lio/getstream/chat/android/models/Member;->copy$default(Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/User;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Member;

    move-result-object v8

    invoke-interface {v6, v7, v8}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_3
    if-nez v6, :cond_4

    goto :goto_1

    :cond_4
    move-object v4, v6

    :goto_1
    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void
.end method

.method public final updateMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 3

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;

    const/4 v2, 0x3

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;I)V

    invoke-virtual {p0, v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateMessageById(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final updateMessageById(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transform"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_messages:Lec3/p1;

    :cond_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v7, v5

    move-object v8, v6

    :goto_0
    if-ge v7, v4, :cond_3

    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v10}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    if-nez v8, :cond_1

    move-object v8, v3

    check-cast v8, Ljava/util/Collection;

    invoke-static {v8}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v8

    :cond_1
    invoke-interface {p2, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v8, v7, v9}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_3
    if-nez v8, :cond_4

    goto :goto_1

    :cond_4
    move-object v3, v8

    :goto_1
    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_cachedLatestMessages:Lec3/p1;

    :cond_5
    move-object v0, v1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    move v7, v5

    move-object v8, v6

    :goto_2
    if-ge v7, v4, :cond_8

    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v10}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    if-nez v8, :cond_6

    move-object v8, v3

    check-cast v8, Ljava/util/Collection;

    invoke-static {v8}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v8

    :cond_6
    invoke-interface {p2, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v8, v7, v9}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_7
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_8
    if-nez v8, :cond_9

    goto :goto_3

    :cond_9
    move-object v3, v8

    :goto_3
    invoke-virtual {v0, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_pinnedMessages:Lec3/p1;

    :cond_a
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    move v7, v5

    move-object v8, v6

    :goto_4
    if-ge v7, v4, :cond_d

    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v10}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    if-nez v8, :cond_b

    move-object v8, v3

    check-cast v8, Ljava/util/Collection;

    invoke-static {v8}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v8

    :cond_b
    invoke-interface {p2, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v8, v7, v9}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_c
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_d
    if-nez v8, :cond_e

    goto :goto_5

    :cond_e
    move-object v3, v8

    :goto_5
    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    return-void
.end method

.method public final updateMessageFromEvent(Lio/getstream/chat/android/models/Message;Lc93/m;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    const-string v0, "eventMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enrich"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lig0/h;

    const/16 v2, 0x10

    invoke-direct {v1, p0, p1, p2, v2}, Lig0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p0, v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateMessageById(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final updateQuotedMessageReferences(Lio/getstream/chat/android/models/Message;)V
    .locals 65

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "quotedMessage"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_quotedMessagesMap:Lec3/p1;

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    if-eqz v3, :cond_10

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_6

    :cond_0
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_messages:Lec3/p1;

    :cond_1
    move-object v4, v3

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/util/List;

    move-object v7, v6

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v10, v8

    move-object v11, v9

    :goto_0
    if-ge v10, v7, :cond_4

    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v13}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v2, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    if-nez v11, :cond_2

    move-object v11, v6

    check-cast v11, Ljava/util/Collection;

    invoke-static {v11}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v11

    :cond_2
    invoke-static {v1, v0, v13}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateQuotedMessageReferences$preservedReplyTo(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object v44

    const v63, 0xffff

    const/16 v64, 0x0

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

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const v62, -0x40000001    # -1.9999999f

    invoke-static/range {v13 .. v64}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v12

    invoke-interface {v11, v10, v12}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_3
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    :cond_4
    if-nez v11, :cond_5

    goto :goto_1

    :cond_5
    move-object v6, v11

    :goto_1
    invoke-virtual {v4, v5, v6}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_cachedLatestMessages:Lec3/p1;

    :cond_6
    move-object v3, v4

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/util/List;

    move-object v7, v6

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    move v10, v8

    move-object v11, v9

    :goto_2
    if-ge v10, v7, :cond_9

    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v13}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v2, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    if-nez v11, :cond_7

    move-object v11, v6

    check-cast v11, Ljava/util/Collection;

    invoke-static {v11}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v11

    :cond_7
    invoke-static {v1, v0, v13}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateQuotedMessageReferences$preservedReplyTo(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object v44

    const v63, 0xffff

    const/16 v64, 0x0

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

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const v62, -0x40000001    # -1.9999999f

    invoke-static/range {v13 .. v64}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v12

    invoke-interface {v11, v10, v12}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_8
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_2

    :cond_9
    if-nez v11, :cond_a

    goto :goto_3

    :cond_a
    move-object v6, v11

    :goto_3
    invoke-virtual {v3, v5, v6}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_pinnedMessages:Lec3/p1;

    :cond_b
    move-object v4, v3

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/util/List;

    move-object v7, v6

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    move v10, v8

    move-object v11, v9

    :goto_4
    if-ge v10, v7, :cond_e

    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v13}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v2, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_d

    if-nez v11, :cond_c

    move-object v11, v6

    check-cast v11, Ljava/util/Collection;

    invoke-static {v11}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v11

    :cond_c
    invoke-static {v1, v0, v13}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateQuotedMessageReferences$preservedReplyTo(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object v44

    const v63, 0xffff

    const/16 v64, 0x0

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

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const v62, -0x40000001    # -1.9999999f

    invoke-static/range {v13 .. v64}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v12

    invoke-interface {v11, v10, v12}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_d
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_4

    :cond_e
    if-nez v11, :cond_f

    goto :goto_5

    :cond_f
    move-object v6, v11

    :goto_5
    invoke-virtual {v4, v5, v6}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    :cond_10
    :goto_6
    return-void
.end method

.method public final updateRead(Lio/getstream/chat/android/models/ChannelUserRead;)V
    .locals 1

    const-string v0, "read"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateReads(Ljava/util/List;)V

    return-void
.end method

.method public final updateReads(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;)V"
        }
    .end annotation

    const-string v0, "reads"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->read:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/ChannelUserRead;

    const/16 v1, 0xa

    if-eqz v0, :cond_3

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/models/ChannelUserRead;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/ChannelUserRead;->getUserId()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->currentUser:Lec3/f2;

    invoke-interface {v5}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/models/User;

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-direct {p0, v0, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->mergeCurrentUserRead(Lio/getstream/chat/android/models/ChannelUserRead;Lio/getstream/chat/android/models/ChannelUserRead;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object v3

    :cond_1
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object p1, v2

    :cond_3
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_reads:Lec3/p1;

    :cond_4
    move-object v2, v0

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/util/Map;

    move-object v5, p1

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v5, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-static {v6}, Lm83/g0;->W(I)I

    move-result v6

    const/16 v7, 0x10

    if-ge v6, v7, :cond_5

    move v6, v7

    :cond_5
    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7, v6}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lio/getstream/chat/android/models/ChannelUserRead;

    invoke-virtual {v8}, Lio/getstream/chat/android/models/ChannelUserRead;->getUserId()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_6
    invoke-static {v4, v7}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    return-void
.end method

.method public final upsertCachedLatestMessages(Ljava/util/List;Z)V
    .locals 7
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

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-direct {p0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->shouldIgnoreUpsertion(Lio/getstream/chat/android/models/Message;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_cachedLatestMessages:Lec3/p1;

    :cond_4
    move-object v1, p1

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    if-eqz p2, :cond_5

    invoke-direct {p0, v0, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->preserveAttachmentUrls(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    goto :goto_1

    :cond_5
    move-object v4, v0

    :goto_1
    sget-object v5, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$upsertCachedLatestMessages$1$1;->INSTANCE:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$upsertCachedLatestMessages$1$1;

    sget-object v6, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->MESSAGE_COMPARATOR:Ljava/util/Comparator;

    invoke-static {v3, v4, v5, v6}, Lio/getstream/chat/android/client/internal/state/utils/internal/ListKt;->mergeSorted(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v3

    const/16 v4, 0x19

    invoke-static {v4, v3}, Lm83/s;->x1(ILjava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_2
    return-void
.end method

.method public final upsertCachedMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 9

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->shouldIgnoreUpsertion(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getReplyTo()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->addQuotedMessage(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getReplyMessageId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->addQuotedMessage(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->registerPollForMessage(Lio/getstream/chat/android/models/Poll;Ljava/lang/String;)V

    :cond_3
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_cachedLatestMessages:Lec3/p1;

    :goto_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    sget-object v6, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$upsertCachedMessage$4$1;->INSTANCE:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$upsertCachedMessage$4$1;

    sget-object v7, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->MESSAGE_COMPARATOR:Ljava/util/Comparator;

    new-instance v8, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;

    const/4 v4, 0x4

    invoke-direct {v8, p0, p1, v4}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;I)V

    const/16 v5, 0x19

    move-object v4, p1

    invoke-static/range {v3 .. v8}, Lio/getstream/chat/android/client/internal/state/utils/internal/ListKt;->upsertSortedBounded(Ljava/util/List;Ljava/lang/Object;ILkotlin/jvm/functions/Function1;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :goto_1
    return-void

    :cond_4
    move-object p1, v4

    goto :goto_0
.end method

.method public final upsertMember(Lio/getstream/chat/android/models/Member;)V
    .locals 1

    const-string v0, "member"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertMembers(Ljava/util/List;)V

    return-void
.end method

.method public final upsertMembers(Ljava/util/List;)V
    .locals 9
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_members:Lec3/p1;

    :cond_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-static {v5}, Lm83/g0;->W(I)I

    move-result v5

    const/16 v6, 0x10

    if-ge v5, v6, :cond_1

    move v5, v6

    :cond_1
    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v8}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v8, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-static {v7}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v3

    move-object v5, p1

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v5, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-static {v4}, Lm83/g0;->W(I)I

    move-result v4

    if-ge v4, v6, :cond_3

    goto :goto_1

    :cond_3
    move v6, v4

    :goto_1
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v6}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    invoke-interface {v3, v4}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method public final upsertMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 8

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->shouldIgnoreUpsertion(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getReplyTo()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->addQuotedMessage(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getReplyMessageId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->addQuotedMessage(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->registerPollForMessage(Lio/getstream/chat/android/models/Poll;Ljava/lang/String;)V

    :cond_3
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_messages:Lec3/p1;

    :cond_4
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    sget-object v4, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$upsertMessage$4$1;->INSTANCE:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$upsertMessage$4$1;

    sget-object v5, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->MESSAGE_COMPARATOR:Ljava/util/Comparator;

    new-instance v6, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;

    const/4 v7, 0x1

    invoke-direct {v6, p0, p1, v7}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;I)V

    invoke-static {v3, p1, v4, v5, v6}, Lio/getstream/chat/android/client/internal/state/utils/internal/ListKt;->upsertSorted(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isEphemeral(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->localOnlyMessages:Lec3/p1;

    :cond_5
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    sget-object v4, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$upsertMessage$5$1;->INSTANCE:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$upsertMessage$5$1;

    sget-object v5, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->MESSAGE_COMPARATOR:Ljava/util/Comparator;

    new-instance v6, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;

    const/4 v7, 0x2

    invoke-direct {v6, p0, p1, v7}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;I)V

    invoke-static {v3, p1, v4, v5, v6}, Lio/getstream/chat/android/client/internal/state/utils/internal/ListKt;->upsertSorted(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    :cond_6
    :goto_0
    return-void
.end method

.method public final upsertMessages(Ljava/util/List;Z)V
    .locals 7
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

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-direct {p0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->shouldIgnoreUpsertion(Lio/getstream/chat/android/models/Message;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_3

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getReplyTo()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->addQuotedMessage(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getReplyMessageId()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->addQuotedMessage(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->registerPollForMessage(Lio/getstream/chat/android/models/Poll;Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_messages:Lec3/p1;

    :cond_7
    move-object v1, p1

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    if-eqz p2, :cond_8

    invoke-direct {p0, v0, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->preserveAttachmentUrls(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    goto :goto_2

    :cond_8
    move-object v4, v0

    :goto_2
    sget-object v5, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$upsertMessages$4$1;->INSTANCE:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$upsertMessages$4$1;

    sget-object v6, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->MESSAGE_COMPARATOR:Ljava/util/Comparator;

    invoke-static {v3, v4, v5, v6}, Lio/getstream/chat/android/client/internal/state/utils/internal/ListKt;->mergeSorted(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_3
    return-void
.end method

.method public final upsertPoll(Lio/getstream/chat/android/models/Poll;)V
    .locals 54

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "poll"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->polls:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->messagesWithPolls:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    if-nez v2, :cond_0

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    :cond_0
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v53

    :goto_0
    invoke-interface/range {v53 .. v53}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface/range {v53 .. v53}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    if-eqz v2, :cond_1

    const v51, 0xfbff

    const/16 v52, 0x0

    move-object v1, v2

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

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, -0x1

    move-object/from16 v44, p1

    invoke-static/range {v1 .. v52}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_1
    move-object/from16 v1, p1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final upsertUserPresence(Lio/getstream/chat/android/models/User;)V
    .locals 67

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    const-string v1, "user"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_members:Lec3/p1;

    :goto_0
    move-object v3, v1

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/util/List;

    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    const/16 v53, 0x0

    const/16 v54, 0x0

    move/from16 v7, v53

    move-object/from16 v8, v54

    :goto_1
    if-ge v7, v6, :cond_2

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v9}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    if-nez v8, :cond_0

    move-object v8, v5

    check-cast v8, Ljava/util/Collection;

    invoke-static {v8}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v8

    :cond_0
    const/16 v17, 0x7ffe

    const/16 v18, 0x0

    move-object v10, v3

    const/4 v3, 0x0

    move-object v11, v4

    const/4 v4, 0x0

    move-object v12, v5

    const/4 v5, 0x0

    move v13, v6

    const/4 v6, 0x0

    move v14, v7

    const/4 v7, 0x0

    move-object v15, v8

    const/4 v8, 0x0

    move-object/from16 v16, v1

    move-object v1, v9

    const/4 v9, 0x0

    move-object/from16 v19, v10

    const/4 v10, 0x0

    move-object/from16 v20, v11

    const/4 v11, 0x0

    move-object/from16 v21, v12

    const/4 v12, 0x0

    move/from16 v22, v13

    const/4 v13, 0x0

    move/from16 v23, v14

    const/4 v14, 0x0

    move-object/from16 v24, v15

    const/4 v15, 0x0

    move-object/from16 v25, v16

    const/16 v16, 0x0

    move-object/from16 v55, v20

    move/from16 v0, v23

    move-object/from16 v56, v24

    invoke-static/range {v1 .. v18}, Lio/getstream/chat/android/models/Member;->copy$default(Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/User;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Member;

    move-result-object v1

    move-object/from16 v15, v56

    invoke-interface {v15, v0, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-object v8, v15

    goto :goto_2

    :cond_1
    move-object/from16 v25, v1

    move-object/from16 v19, v3

    move-object/from16 v55, v4

    move-object/from16 v21, v5

    move/from16 v22, v6

    move v0, v7

    :goto_2
    add-int/lit8 v7, v0, 0x1

    move-object/from16 v0, p0

    move-object/from16 v3, v19

    move-object/from16 v5, v21

    move/from16 v6, v22

    move-object/from16 v1, v25

    move-object/from16 v4, v55

    goto :goto_1

    :cond_2
    move-object/from16 v25, v1

    move-object/from16 v19, v3

    move-object/from16 v55, v4

    move-object/from16 v21, v5

    if-nez v8, :cond_3

    move-object/from16 v5, v21

    :goto_3
    move-object/from16 v10, v19

    move-object/from16 v11, v55

    goto :goto_4

    :cond_3
    move-object v5, v8

    goto :goto_3

    :goto_4
    invoke-virtual {v10, v11, v5}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_watchers:Lec3/p1;

    :goto_5
    move-object v3, v1

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/util/List;

    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    move/from16 v7, v53

    move-object/from16 v8, v54

    :goto_6
    if-ge v7, v6, :cond_6

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lio/getstream/chat/android/models/User;

    invoke-virtual {v9}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    if-nez v8, :cond_4

    move-object v8, v5

    check-cast v8, Ljava/util/Collection;

    invoke-static {v8}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v8

    :cond_4
    invoke-interface {v8, v7, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    :cond_6
    if-nez v8, :cond_7

    goto :goto_7

    :cond_7
    move-object v5, v8

    :goto_7
    invoke-virtual {v3, v4, v5}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_18

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_channelData:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/ChannelData;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lio/getstream/chat/android/models/ChannelData;->getCreatedBy()Lio/getstream/chat/android/models/User;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_channelData:Lec3/p1;

    const v22, 0xfffef

    const/16 v23, 0x0

    const/4 v2, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    move-object v6, v5

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

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v24, v6

    move-object/from16 v6, p1

    invoke-static/range {v1 .. v23}, Lio/getstream/chat/android/models/ChannelData;->copy$default(Lio/getstream/chat/android/models/ChannelData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object v1

    move-object/from16 v3, v24

    check-cast v3, Lec3/h2;

    invoke-virtual {v3, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_8
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_messages:Lec3/p1;

    :goto_8
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/util/List;

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    move/from16 v6, v53

    move-object/from16 v7, v54

    :goto_9
    if-ge v6, v5, :cond_b

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v8}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v9

    invoke-virtual {v9}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    if-nez v7, :cond_9

    move-object v7, v4

    check-cast v7, Ljava/util/Collection;

    invoke-static {v7}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v7

    :cond_9
    const v51, 0xffff

    const/16 v52, 0x0

    move-object v9, v2

    const/4 v2, 0x0

    move-object v10, v3

    const/4 v3, 0x0

    move-object v11, v4

    const/4 v4, 0x0

    move v12, v5

    const/4 v5, 0x0

    move v13, v6

    const/4 v6, 0x0

    move-object v14, v7

    const/4 v7, 0x0

    move-object v15, v1

    move-object v1, v8

    const/4 v8, 0x0

    move-object/from16 v16, v9

    const/4 v9, 0x0

    move-object/from16 v17, v10

    const/4 v10, 0x0

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move/from16 v19, v12

    const/4 v12, 0x0

    move/from16 v20, v13

    const/4 v13, 0x0

    move-object/from16 v21, v14

    const/4 v14, 0x0

    move-object/from16 v22, v15

    const/4 v15, 0x0

    move-object/from16 v23, v16

    const/16 v16, 0x0

    move-object/from16 v24, v17

    const/16 v17, 0x0

    move-object/from16 v25, v18

    const/16 v18, 0x0

    move/from16 v26, v19

    const/16 v19, 0x0

    move/from16 v27, v20

    const/16 v20, 0x0

    move-object/from16 v28, v21

    const/16 v21, 0x0

    move-object/from16 v29, v22

    const/16 v22, 0x0

    move-object/from16 v30, v23

    const/16 v23, 0x0

    move-object/from16 v31, v24

    const/16 v24, 0x0

    move/from16 v32, v26

    const/16 v26, 0x0

    move/from16 v33, v27

    const/16 v27, 0x0

    move-object/from16 v34, v28

    const/16 v28, 0x0

    move-object/from16 v35, v29

    const/16 v29, 0x0

    move-object/from16 v36, v30

    const/16 v30, 0x0

    move-object/from16 v37, v31

    const/16 v31, 0x0

    move/from16 v38, v32

    const/16 v32, 0x0

    move/from16 v39, v33

    const/16 v33, 0x0

    move-object/from16 v40, v34

    const/16 v34, 0x0

    move-object/from16 v41, v35

    const/16 v35, 0x0

    move-object/from16 v42, v36

    const/16 v36, 0x0

    move-object/from16 v43, v37

    const/16 v37, 0x0

    move/from16 v44, v38

    const/16 v38, 0x0

    move/from16 v45, v39

    const/16 v39, 0x0

    move-object/from16 v46, v40

    const/16 v40, 0x0

    move-object/from16 v47, v41

    const/16 v41, 0x0

    move-object/from16 v48, v42

    const/16 v42, 0x0

    move-object/from16 v49, v43

    const/16 v43, 0x0

    move/from16 v50, v44

    const/16 v44, 0x0

    move/from16 v55, v45

    const/16 v45, 0x0

    move-object/from16 v56, v46

    const/16 v46, 0x0

    move-object/from16 v57, v47

    const/16 v47, 0x0

    move-object/from16 v58, v48

    const/16 v48, 0x0

    move-object/from16 v59, v49

    const/16 v49, 0x0

    move/from16 v60, v50

    const v50, -0x800001

    move/from16 v0, v55

    move-object/from16 v62, v56

    move-object/from16 v61, v59

    move-object/from16 v55, v25

    move-object/from16 v25, p1

    invoke-static/range {v1 .. v52}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    move-object/from16 v14, v62

    invoke-interface {v14, v0, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-object v7, v14

    goto :goto_a

    :cond_a
    move-object/from16 v57, v1

    move-object/from16 v58, v2

    move-object/from16 v61, v3

    move-object/from16 v55, v4

    move/from16 v60, v5

    move v0, v6

    :goto_a
    add-int/lit8 v6, v0, 0x1

    move-object/from16 v0, p0

    move-object/from16 v4, v55

    move-object/from16 v1, v57

    move-object/from16 v2, v58

    move/from16 v5, v60

    move-object/from16 v3, v61

    goto/16 :goto_9

    :cond_b
    move-object/from16 v57, v1

    move-object/from16 v58, v2

    move-object/from16 v61, v3

    move-object/from16 v55, v4

    if-nez v7, :cond_c

    move-object/from16 v4, v55

    :goto_b
    move-object/from16 v9, v58

    move-object/from16 v10, v61

    goto :goto_c

    :cond_c
    move-object v4, v7

    goto :goto_b

    :goto_c
    invoke-virtual {v9, v10, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_cachedLatestMessages:Lec3/p1;

    :goto_d
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/util/List;

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    move/from16 v6, v53

    move-object/from16 v7, v54

    :goto_e
    if-ge v6, v5, :cond_f

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v8}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v9

    invoke-virtual {v9}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_e

    if-nez v7, :cond_d

    move-object v7, v4

    check-cast v7, Ljava/util/Collection;

    invoke-static {v7}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v7

    :cond_d
    const v51, 0xffff

    const/16 v52, 0x0

    move-object v9, v2

    const/4 v2, 0x0

    move-object v10, v3

    const/4 v3, 0x0

    move-object v11, v4

    const/4 v4, 0x0

    move v12, v5

    const/4 v5, 0x0

    move v13, v6

    const/4 v6, 0x0

    move-object v14, v7

    const/4 v7, 0x0

    move-object v15, v1

    move-object v1, v8

    const/4 v8, 0x0

    move-object/from16 v16, v9

    const/4 v9, 0x0

    move-object/from16 v17, v10

    const/4 v10, 0x0

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move/from16 v19, v12

    const/4 v12, 0x0

    move/from16 v20, v13

    const/4 v13, 0x0

    move-object/from16 v21, v14

    const/4 v14, 0x0

    move-object/from16 v22, v15

    const/4 v15, 0x0

    move-object/from16 v23, v16

    const/16 v16, 0x0

    move-object/from16 v24, v17

    const/16 v17, 0x0

    move-object/from16 v25, v18

    const/16 v18, 0x0

    move/from16 v26, v19

    const/16 v19, 0x0

    move/from16 v27, v20

    const/16 v20, 0x0

    move-object/from16 v28, v21

    const/16 v21, 0x0

    move-object/from16 v29, v22

    const/16 v22, 0x0

    move-object/from16 v30, v23

    const/16 v23, 0x0

    move-object/from16 v31, v24

    const/16 v24, 0x0

    move/from16 v32, v26

    const/16 v26, 0x0

    move/from16 v33, v27

    const/16 v27, 0x0

    move-object/from16 v34, v28

    const/16 v28, 0x0

    move-object/from16 v35, v29

    const/16 v29, 0x0

    move-object/from16 v36, v30

    const/16 v30, 0x0

    move-object/from16 v37, v31

    const/16 v31, 0x0

    move/from16 v38, v32

    const/16 v32, 0x0

    move/from16 v39, v33

    const/16 v33, 0x0

    move-object/from16 v40, v34

    const/16 v34, 0x0

    move-object/from16 v41, v35

    const/16 v35, 0x0

    move-object/from16 v42, v36

    const/16 v36, 0x0

    move-object/from16 v43, v37

    const/16 v37, 0x0

    move/from16 v44, v38

    const/16 v38, 0x0

    move/from16 v45, v39

    const/16 v39, 0x0

    move-object/from16 v46, v40

    const/16 v40, 0x0

    move-object/from16 v47, v41

    const/16 v41, 0x0

    move-object/from16 v48, v42

    const/16 v42, 0x0

    move-object/from16 v49, v43

    const/16 v43, 0x0

    move/from16 v50, v44

    const/16 v44, 0x0

    move/from16 v55, v45

    const/16 v45, 0x0

    move-object/from16 v56, v46

    const/16 v46, 0x0

    move-object/from16 v57, v47

    const/16 v47, 0x0

    move-object/from16 v58, v48

    const/16 v48, 0x0

    move-object/from16 v59, v49

    const/16 v49, 0x0

    move/from16 v60, v50

    const v50, -0x800001

    move/from16 v0, v55

    move-object/from16 v64, v56

    move-object/from16 v56, v57

    move-object/from16 v63, v59

    move-object/from16 v55, v25

    move-object/from16 v25, p1

    invoke-static/range {v1 .. v52}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    move-object/from16 v14, v64

    invoke-interface {v14, v0, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-object v7, v14

    goto :goto_f

    :cond_e
    move-object/from16 v56, v1

    move-object/from16 v58, v2

    move-object/from16 v63, v3

    move-object/from16 v55, v4

    move/from16 v60, v5

    move v0, v6

    :goto_f
    add-int/lit8 v6, v0, 0x1

    move-object/from16 v0, p0

    move-object/from16 v4, v55

    move-object/from16 v1, v56

    move-object/from16 v2, v58

    move/from16 v5, v60

    move-object/from16 v3, v63

    goto/16 :goto_e

    :cond_f
    move-object/from16 v56, v1

    move-object/from16 v58, v2

    move-object/from16 v63, v3

    move-object/from16 v55, v4

    if-nez v7, :cond_10

    move-object/from16 v4, v55

    :goto_10
    move-object/from16 v9, v58

    move-object/from16 v10, v63

    goto :goto_11

    :cond_10
    move-object v4, v7

    goto :goto_10

    :goto_11
    invoke-virtual {v9, v10, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_pinnedMessages:Lec3/p1;

    :goto_12
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/util/List;

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    move/from16 v6, v53

    move-object/from16 v7, v54

    :goto_13
    if-ge v6, v5, :cond_13

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v8}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v9

    invoke-virtual {v9}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_12

    if-nez v7, :cond_11

    move-object v7, v4

    check-cast v7, Ljava/util/Collection;

    invoke-static {v7}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v7

    :cond_11
    const v51, 0xffff

    const/16 v52, 0x0

    move-object v9, v2

    const/4 v2, 0x0

    move-object v10, v3

    const/4 v3, 0x0

    move-object v11, v4

    const/4 v4, 0x0

    move v12, v5

    const/4 v5, 0x0

    move v13, v6

    const/4 v6, 0x0

    move-object v14, v7

    const/4 v7, 0x0

    move-object v15, v1

    move-object v1, v8

    const/4 v8, 0x0

    move-object/from16 v16, v9

    const/4 v9, 0x0

    move-object/from16 v17, v10

    const/4 v10, 0x0

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move/from16 v19, v12

    const/4 v12, 0x0

    move/from16 v20, v13

    const/4 v13, 0x0

    move-object/from16 v21, v14

    const/4 v14, 0x0

    move-object/from16 v22, v15

    const/4 v15, 0x0

    move-object/from16 v23, v16

    const/16 v16, 0x0

    move-object/from16 v24, v17

    const/16 v17, 0x0

    move-object/from16 v25, v18

    const/16 v18, 0x0

    move/from16 v26, v19

    const/16 v19, 0x0

    move/from16 v27, v20

    const/16 v20, 0x0

    move-object/from16 v28, v21

    const/16 v21, 0x0

    move-object/from16 v29, v22

    const/16 v22, 0x0

    move-object/from16 v30, v23

    const/16 v23, 0x0

    move-object/from16 v31, v24

    const/16 v24, 0x0

    move/from16 v32, v26

    const/16 v26, 0x0

    move/from16 v33, v27

    const/16 v27, 0x0

    move-object/from16 v34, v28

    const/16 v28, 0x0

    move-object/from16 v35, v29

    const/16 v29, 0x0

    move-object/from16 v36, v30

    const/16 v30, 0x0

    move-object/from16 v37, v31

    const/16 v31, 0x0

    move/from16 v38, v32

    const/16 v32, 0x0

    move/from16 v39, v33

    const/16 v33, 0x0

    move-object/from16 v40, v34

    const/16 v34, 0x0

    move-object/from16 v41, v35

    const/16 v35, 0x0

    move-object/from16 v42, v36

    const/16 v36, 0x0

    move-object/from16 v43, v37

    const/16 v37, 0x0

    move/from16 v44, v38

    const/16 v38, 0x0

    move/from16 v45, v39

    const/16 v39, 0x0

    move-object/from16 v46, v40

    const/16 v40, 0x0

    move-object/from16 v47, v41

    const/16 v41, 0x0

    move-object/from16 v48, v42

    const/16 v42, 0x0

    move-object/from16 v49, v43

    const/16 v43, 0x0

    move/from16 v50, v44

    const/16 v44, 0x0

    move/from16 v55, v45

    const/16 v45, 0x0

    move-object/from16 v56, v46

    const/16 v46, 0x0

    move-object/from16 v57, v47

    const/16 v47, 0x0

    move-object/from16 v58, v48

    const/16 v48, 0x0

    move-object/from16 v59, v49

    const/16 v49, 0x0

    move/from16 v60, v50

    const v50, -0x800001

    move/from16 v0, v55

    move-object/from16 v66, v56

    move-object/from16 v65, v59

    move-object/from16 v55, v25

    move-object/from16 v25, p1

    invoke-static/range {v1 .. v52}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    move-object/from16 v14, v66

    invoke-interface {v14, v0, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-object v7, v14

    goto :goto_14

    :cond_12
    move-object/from16 v57, v1

    move-object/from16 v58, v2

    move-object/from16 v65, v3

    move-object/from16 v55, v4

    move/from16 v60, v5

    move v0, v6

    :goto_14
    add-int/lit8 v6, v0, 0x1

    move-object/from16 v0, p0

    move-object/from16 v4, v55

    move-object/from16 v1, v57

    move-object/from16 v2, v58

    move/from16 v5, v60

    move-object/from16 v3, v65

    goto/16 :goto_13

    :cond_13
    move-object/from16 v57, v1

    move-object/from16 v58, v2

    move-object/from16 v65, v3

    move-object/from16 v55, v4

    if-nez v7, :cond_14

    move-object/from16 v4, v55

    :goto_15
    move-object/from16 v9, v58

    move-object/from16 v10, v65

    goto :goto_16

    :cond_14
    move-object v4, v7

    goto :goto_15

    :goto_16
    invoke-virtual {v9, v10, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    return-void

    :cond_15
    move-object/from16 v0, p0

    move-object/from16 v1, v57

    goto/16 :goto_12

    :cond_16
    move-object/from16 v0, p0

    move-object/from16 v1, v56

    goto/16 :goto_d

    :cond_17
    move-object/from16 v0, p0

    move-object/from16 v1, v57

    goto/16 :goto_8

    :cond_18
    move-object/from16 v0, p0

    move-object/from16 v2, p1

    goto/16 :goto_5

    :cond_19
    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v1, v25

    goto/16 :goto_0
.end method

.method public final upsertWatchers(Ljava/util/List;I)V
    .locals 7
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_watchers:Lec3/p1;

    :cond_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-static {v4}, Lm83/g0;->W(I)I

    move-result v4

    const/16 v5, 0x10

    if-ge v4, v5, :cond_1

    move v4, v5

    :cond_1
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lio/getstream/chat/android/models/User;

    invoke-virtual {v6}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-static {v5}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/models/User;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$upsertWatchers$lambda$134$$inlined$sortedBy$1;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-static {v3, v4}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->_watcherCount:Lec3/p1;

    :cond_4
    move-object p1, v1

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    const/4 v2, 0x0

    invoke-static {v2, p2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    return-void
.end method
