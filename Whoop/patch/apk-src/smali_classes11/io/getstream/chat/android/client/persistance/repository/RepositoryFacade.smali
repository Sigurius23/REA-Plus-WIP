.class public final Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/persistance/repository/UserRepository;
.implements Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;
.implements Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;
.implements Lio/getstream/chat/android/client/persistance/repository/MessageRepository;
.implements Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;
.implements Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;
.implements Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;
.implements Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion;
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00e4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u00c9\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\u0008:\u0002\u00c9\u0001BY\u0008\u0002\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0008\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J$\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00172\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u0096@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ.\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00172\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00172\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0086@\u00a2\u0006\u0004\u0008\u001b\u0010 J5\u0010$\u001a\u00020\u001a*\u00020\u001a2\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\"0\u00170!2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007\u00a2\u0006\u0004\u0008$\u0010%J\u0018\u0010(\u001a\u00020\'2\u0006\u0010&\u001a\u00020\u001aH\u0096@\u00a2\u0006\u0004\u0008(\u0010)J\u001e\u0010,\u001a\u00020\'2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u001a0*H\u0096@\u00a2\u0006\u0004\u0008,\u0010-J\u0018\u0010/\u001a\u00020\'2\u0006\u0010.\u001a\u00020\"H\u0096@\u00a2\u0006\u0004\u0008/\u00100J\u001e\u00102\u001a\u00020\'2\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u00020\"0\u0017H\u0096@\u00a2\u0006\u0004\u00082\u0010\u001cJ \u00106\u001a\u00020\'2\u0006\u00103\u001a\u00020\u00182\u0006\u00105\u001a\u000204H\u0096@\u00a2\u0006\u0004\u00086\u00107J\u0018\u00108\u001a\u00020\'2\u0006\u0010.\u001a\u00020\"H\u0096@\u00a2\u0006\u0004\u00088\u00100J\u0018\u00109\u001a\u00020\'2\u0006\u0010.\u001a\u00020\"H\u0087@\u00a2\u0006\u0004\u00089\u00100J\u0018\u0010<\u001a\u00020\'2\u0006\u0010;\u001a\u00020:H\u0096@\u00a2\u0006\u0004\u0008<\u0010=J&\u0010@\u001a\u00020\'2\u0006\u00103\u001a\u00020\u00182\u000c\u0010?\u001a\u0008\u0012\u0004\u0012\u00020>0\u0017H\u0096@\u00a2\u0006\u0004\u0008@\u0010AJ\u001e\u0010B\u001a\u00020\'2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u001a0*H\u0086@\u00a2\u0006\u0004\u0008B\u0010-J\u0018\u0010C\u001a\u00020\'2\u0006\u00103\u001a\u00020\u0018H\u0096@\u00a2\u0006\u0004\u0008C\u0010DJ(\u0010G\u001a\u00020\'2\u0006\u00103\u001a\u00020\u00182\u0006\u0010F\u001a\u00020E2\u0006\u00105\u001a\u000204H\u0096@\u00a2\u0006\u0004\u0008G\u0010HJ \u0010G\u001a\u00020\'2\u0006\u00103\u001a\u00020\u00182\u0006\u0010F\u001a\u00020EH\u0096@\u00a2\u0006\u0004\u0008G\u0010IJ\u001e\u0010L\u001a\u00020\'2\u000c\u0010K\u001a\u0008\u0012\u0004\u0012\u00020J0\u0017H\u0096@\u00a2\u0006\u0004\u0008L\u0010\u001cJ\u0018\u0010M\u001a\u00020\'2\u0006\u0010&\u001a\u00020\u001aH\u0086@\u00a2\u0006\u0004\u0008M\u0010)J\u0010\u0010N\u001a\u00020\'H\u0096@\u00a2\u0006\u0004\u0008N\u0010OJ\u001e\u0010R\u001a\u00020\'2\u000c\u0010Q\u001a\u0008\u0012\u0004\u0012\u00020P0*H\u0096A\u00a2\u0006\u0004\u0008R\u0010-J\u0018\u0010T\u001a\u00020\'2\u0006\u0010S\u001a\u00020PH\u0096A\u00a2\u0006\u0004\u0008T\u0010UJ\u0018\u0010V\u001a\u00020\'2\u0006\u0010S\u001a\u00020PH\u0096A\u00a2\u0006\u0004\u0008V\u0010UJ\u001a\u0010X\u001a\u0004\u0018\u00010P2\u0006\u0010W\u001a\u00020\u0018H\u0096A\u00a2\u0006\u0004\u0008X\u0010DJ$\u0010Z\u001a\u0008\u0012\u0004\u0012\u00020P0\u00172\u000c\u0010Y\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u0096A\u00a2\u0006\u0004\u0008Z\u0010\u001cJ\"\u0010\\\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020P0!0[H\u0096\u0001\u00a2\u0006\u0004\u0008\\\u0010]J\"\u0010^\u001a\u00020\'2\u0008\u00103\u001a\u0004\u0018\u00010\u00182\u0006\u0010W\u001a\u00020\u0018H\u0096A\u00a2\u0006\u0004\u0008^\u0010_J\u0018\u0010`\u001a\u00020\'2\u0006\u0010.\u001a\u00020\"H\u0096A\u00a2\u0006\u0004\u0008`\u00100J\u0016\u0010a\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u0096A\u00a2\u0006\u0004\u0008a\u0010OJ\u001a\u0010b\u001a\u0004\u0018\u00010\u001a2\u0006\u00103\u001a\u00020\u0018H\u0096A\u00a2\u0006\u0004\u0008b\u0010DJ\u001e\u0010e\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010d\u001a\u00020cH\u0096A\u00a2\u0006\u0004\u0008e\u0010fJ\u001e\u0010g\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00172\u0006\u0010d\u001a\u00020cH\u0096A\u00a2\u0006\u0004\u0008g\u0010fJ \u0010i\u001a\u00020\'2\u0006\u00103\u001a\u00020\u00182\u0006\u0010h\u001a\u000204H\u0096A\u00a2\u0006\u0004\u0008i\u00107J\u001e\u0010j\u001a\u0008\u0012\u0004\u0012\u00020>0\u00172\u0006\u00103\u001a\u00020\u0018H\u0096A\u00a2\u0006\u0004\u0008j\u0010DJ \u0010l\u001a\u00020\'2\u0006\u00103\u001a\u00020\u00182\u0006\u0010k\u001a\u00020\"H\u0096A\u00a2\u0006\u0004\u0008l\u0010mJ\u0018\u0010n\u001a\u00020\'2\u0006\u00103\u001a\u00020\u0018H\u0096A\u00a2\u0006\u0004\u0008n\u0010DJ(\u0010p\u001a\u00020\'2\u0006\u0010W\u001a\u00020\u00182\u0006\u0010o\u001a\u00020\u00182\u0006\u0010h\u001a\u000204H\u0096A\u00a2\u0006\u0004\u0008p\u0010qJ\u001a\u0010s\u001a\u0004\u0018\u00010:2\u0006\u0010r\u001a\u00020cH\u0096A\u00a2\u0006\u0004\u0008s\u0010fJ$\u0010t\u001a\u0008\u0012\u0004\u0012\u00020:0\u00172\u000c\u0010Y\u001a\u0008\u0012\u0004\u0012\u00020c0\u0017H\u0096A\u00a2\u0006\u0004\u0008t\u0010\u001cJ\u001e\u0010w\u001a\u0008\u0012\u0004\u0012\u00020c0\u00172\u0006\u0010v\u001a\u00020uH\u0096A\u00a2\u0006\u0004\u0008w\u0010xJ\u001e\u0010y\u001a\u0008\u0012\u0004\u0012\u00020:0\u00172\u0006\u0010v\u001a\u00020uH\u0096A\u00a2\u0006\u0004\u0008y\u0010xJ*\u0010{\u001a\u0004\u0018\u00010:2\u0006\u0010z\u001a\u00020\u00182\u0006\u0010o\u001a\u00020\u00182\u0006\u0010W\u001a\u00020\u0018H\u0096A\u00a2\u0006\u0004\u0008{\u0010|J&\u0010}\u001a\u0008\u0012\u0004\u0012\u00020:0\u00172\u0006\u0010o\u001a\u00020\u00182\u0006\u0010W\u001a\u00020\u0018H\u0096A\u00a2\u0006\u0004\u0008}\u0010_J\u0018\u0010~\u001a\u00020\'2\u0006\u0010;\u001a\u00020:H\u0096A\u00a2\u0006\u0004\u0008~\u0010=J)\u0010\u007f\u001a\u0008\u0012\u0004\u0012\u00020\"0\u00172\u0006\u00103\u001a\u00020\u00182\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096A\u00a2\u0006\u0005\u0008\u007f\u0010\u0080\u0001J)\u0010\u0081\u0001\u001a\u0008\u0012\u0004\u0012\u00020\"0\u00172\u0006\u0010o\u001a\u00020\u00182\u0006\u0010d\u001a\u00020cH\u0096A\u00a2\u0006\u0006\u0008\u0081\u0001\u0010\u0082\u0001J \u0010\u0083\u0001\u001a\u0008\u0012\u0004\u0012\u00020\"0\u00172\u0006\u0010W\u001a\u00020\u0018H\u0096A\u00a2\u0006\u0005\u0008\u0083\u0001\u0010DJ(\u0010\u0084\u0001\u001a\u0008\u0012\u0004\u0012\u00020\"0\u00172\u0006\u00103\u001a\u00020\u00182\u0006\u0010W\u001a\u00020\u0018H\u0096A\u00a2\u0006\u0005\u0008\u0084\u0001\u0010_J\'\u0010\u0086\u0001\u001a\u0008\u0012\u0004\u0012\u00020\"0\u00172\r\u0010\u0085\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u0096A\u00a2\u0006\u0005\u0008\u0086\u0001\u0010\u001cJ\u001c\u0010\u0087\u0001\u001a\u0004\u0018\u00010\"2\u0006\u0010o\u001a\u00020\u0018H\u0096A\u00a2\u0006\u0005\u0008\u0087\u0001\u0010DJ!\u0010\u0089\u0001\u001a\u0008\u0012\u0004\u0012\u00020\"0\u00172\u0007\u0010\u0088\u0001\u001a\u00020\u0018H\u0096A\u00a2\u0006\u0005\u0008\u0089\u0001\u0010DJ\u001a\u0010\u008a\u0001\u001a\u00020\'2\u0006\u00103\u001a\u00020\u0018H\u0096A\u00a2\u0006\u0005\u0008\u008a\u0001\u0010DJ \u0010\u008b\u0001\u001a\u00020\'2\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u00020\"0\u0017H\u0096A\u00a2\u0006\u0005\u0008\u008b\u0001\u0010\u001cJ \u0010\u008c\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010v\u001a\u00020uH\u0096A\u00a2\u0006\u0005\u0008\u008c\u0001\u0010xJ \u0010\u008d\u0001\u001a\u0008\u0012\u0004\u0012\u00020\"0\u00172\u0006\u0010v\u001a\u00020uH\u0096A\u00a2\u0006\u0005\u0008\u008d\u0001\u0010xJ\u001c\u0010\u008f\u0001\u001a\u00020\'2\u0007\u0010.\u001a\u00030\u008e\u0001H\u0096A\u00a2\u0006\u0006\u0008\u008f\u0001\u0010\u0090\u0001J\u0019\u0010\u0091\u0001\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010\u0017H\u0096A\u00a2\u0006\u0005\u0008\u0091\u0001\u0010OJ\u001d\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008e\u00012\u0006\u00103\u001a\u00020\u0018H\u0096A\u00a2\u0006\u0005\u0008\u0092\u0001\u0010DJ\u001e\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u008e\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u0018H\u0096A\u00a2\u0006\u0005\u0008\u0094\u0001\u0010DJ\u001c\u0010\u0095\u0001\u001a\u00020\'2\u0007\u0010.\u001a\u00030\u008e\u0001H\u0096A\u00a2\u0006\u0006\u0008\u0095\u0001\u0010\u0090\u0001J\u0012\u0010\u0096\u0001\u001a\u00020\'H\u0096A\u00a2\u0006\u0005\u0008\u0096\u0001\u0010OJ\u001a\u0010\u0097\u0001\u001a\u00020\'2\u0006\u0010o\u001a\u00020\u0018H\u0096A\u00a2\u0006\u0005\u0008\u0097\u0001\u0010DJ\u001b\u0010\u0098\u0001\u001a\u00020\'2\u0007\u0010\u0088\u0001\u001a\u00020\u0018H\u0096A\u00a2\u0006\u0005\u0008\u0098\u0001\u0010DJ \u0010\u0099\u0001\u001a\u0008\u0012\u0004\u0012\u00020\"0\u00172\u0006\u00103\u001a\u00020\u0018H\u0096A\u00a2\u0006\u0005\u0008\u0099\u0001\u0010DJ\u0012\u0010\u009a\u0001\u001a\u00020\'H\u0096A\u00a2\u0006\u0005\u0008\u009a\u0001\u0010OJ\u001f\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009c\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u0018H\u0096\u0001\u00a2\u0006\u0006\u0008\u009d\u0001\u0010\u009e\u0001J\"\u0010\u00a0\u0001\u001a\u00020\'2\u000e\u0010\u009f\u0001\u001a\t\u0012\u0005\u0012\u00030\u009c\u00010*H\u0096A\u00a2\u0006\u0005\u0008\u00a0\u0001\u0010-J\u001d\u0010\u00a2\u0001\u001a\u00020\'2\u0008\u0010\u00a1\u0001\u001a\u00030\u009c\u0001H\u0096A\u00a2\u0006\u0006\u0008\u00a2\u0001\u0010\u00a3\u0001J\u001d\u0010\u00a6\u0001\u001a\u00020\'2\u0008\u0010\u00a5\u0001\u001a\u00030\u00a4\u0001H\u0096A\u00a2\u0006\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001J \u0010\u00aa\u0001\u001a\u0005\u0018\u00010\u00a4\u00012\u0008\u0010\u00a9\u0001\u001a\u00030\u00a8\u0001H\u0096A\u00a2\u0006\u0006\u0008\u00aa\u0001\u0010\u00ab\u0001J)\u0010\u00ad\u0001\u001a\u00020\'2\u0006\u0010r\u001a\u00020\u00182\r\u0010\u00ac\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u0096A\u00a2\u0006\u0005\u0008\u00ad\u0001\u0010AJ \u0010\u00ae\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010r\u001a\u00020\u0018H\u0096A\u00a2\u0006\u0005\u0008\u00ae\u0001\u0010DJ\u001a\u0010\u00af\u0001\u001a\u00020\'2\u0006\u0010.\u001a\u00020\"H\u0096A\u00a2\u0006\u0005\u0008\u00af\u0001\u00100J \u0010\u00b0\u0001\u001a\u00020\'2\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u00020\"0\u0017H\u0096A\u00a2\u0006\u0005\u0008\u00b0\u0001\u0010\u001cJ\u001c\u0010\u00b1\u0001\u001a\u0004\u0018\u00010J2\u0006\u0010r\u001a\u00020\u0018H\u0096A\u00a2\u0006\u0005\u0008\u00b1\u0001\u0010DJ&\u0010\u00b2\u0001\u001a\u0008\u0012\u0004\u0012\u00020J0\u00172\u000c\u0010Y\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u0096A\u00a2\u0006\u0005\u0008\u00b2\u0001\u0010\u001cJ\u001a\u0010\u00b3\u0001\u001a\u00020\'2\u0006\u00103\u001a\u00020\u0018H\u0096A\u00a2\u0006\u0005\u0008\u00b3\u0001\u0010DJ\u001d\u0010\u00b6\u0001\u001a\u00020\'2\u0008\u0010\u00b5\u0001\u001a\u00030\u00b4\u0001H\u0096A\u00a2\u0006\u0006\u0008\u00b6\u0001\u0010\u00b7\u0001J\u001d\u0010\u00b8\u0001\u001a\u0005\u0018\u00010\u00b4\u00012\u0006\u0010W\u001a\u00020\u0018H\u0096A\u00a2\u0006\u0005\u0008\u00b8\u0001\u0010DR\u0015\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\t\u0010\u00b9\u0001R\u0015\u0010\n\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\n\u0010\u00ba\u0001R\u0015\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u000b\u0010\u00bb\u0001R\u0015\u0010\u000c\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u000c\u0010\u00bc\u0001R\u0015\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\r\u0010\u00bd\u0001R\u0015\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u000e\u0010\u00be\u0001R\u0015\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u000f\u0010\u00bf\u0001R\u0015\u0010\u0010\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0010\u0010\u00c0\u0001R\u0015\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0012\u0010\u00c1\u0001R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0014\u0010\u00c2\u0001R!\u0010\u00c8\u0001\u001a\u00030\u00c3\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u00c4\u0001\u0010\u00c5\u0001\u001a\u0006\u0008\u00c6\u0001\u0010\u00c7\u0001\u00a8\u0006\u00ca\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;",
        "userRepository",
        "configsRepository",
        "channelsRepository",
        "queryChannelsRepository",
        "threadsRepository",
        "messageRepository",
        "reactionsRepository",
        "syncStateRepository",
        "Lbc3/c0;",
        "scope",
        "Lio/getstream/chat/android/models/Config;",
        "defaultConfig",
        "<init>",
        "(Lio/getstream/chat/android/client/persistance/repository/UserRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;Lbc3/c0;Lio/getstream/chat/android/models/Config;)V",
        "",
        "",
        "channelCIDs",
        "Lio/getstream/chat/android/models/Channel;",
        "selectChannels",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "channelIds",
        "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;",
        "pagination",
        "(Ljava/util/List;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;",
        "",
        "Lio/getstream/chat/android/models/Message;",
        "messageMap",
        "enrichChannel",
        "(Lio/getstream/chat/android/models/Channel;Ljava/util/Map;Lio/getstream/chat/android/models/Config;)Lio/getstream/chat/android/models/Channel;",
        "channel",
        "Ll83/a0;",
        "insertChannel",
        "(Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;",
        "",
        "channels",
        "insertChannels",
        "(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;",
        "message",
        "insertMessage",
        "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
        "messages",
        "insertMessages",
        "cid",
        "Ljava/util/Date;",
        "hideMessagesBefore",
        "deleteChannelMessagesBefore",
        "(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;",
        "deleteChannelMessage",
        "markMessageAsDeleted",
        "Lio/getstream/chat/android/models/Reaction;",
        "reaction",
        "insertReaction",
        "(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/Member;",
        "members",
        "updateMembersForChannel",
        "(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "storeStateForChannels",
        "deleteChannel",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "",
        "hidden",
        "setHiddenForChannel",
        "(Ljava/lang/String;ZLjava/util/Date;Lq83/d;)Ljava/lang/Object;",
        "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/Thread;",
        "threads",
        "insertThreads",
        "storeStateForChannel",
        "clear",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/User;",
        "users",
        "insertUsers",
        "user",
        "insertUser",
        "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;",
        "insertCurrentUser",
        "userId",
        "selectUser",
        "ids",
        "selectUsers",
        "Lec3/f2;",
        "observeLatestUsers",
        "()Lec3/f2;",
        "deleteAllChannelUserMessages",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "updateChannelMessage",
        "selectAllCids",
        "selectChannel",
        "",
        "limit",
        "selectChannelCidsBySyncNeeded",
        "(ILq83/d;)Ljava/lang/Object;",
        "selectChannelsSyncNeeded",
        "deletedAt",
        "setChannelDeletedAt",
        "selectMembersForChannel",
        "lastMessage",
        "updateLastMessageForChannel",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
        "evictChannel",
        "messageId",
        "updateReactionsForMessageByDeletedDate",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;",
        "id",
        "selectReactionById",
        "selectReactionsByIds",
        "Lio/getstream/chat/android/models/SyncStatus;",
        "syncStatus",
        "selectReactionIdsBySyncStatus",
        "(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;",
        "selectReactionsBySyncStatus",
        "reactionType",
        "selectUserReactionToMessage",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "selectUserReactionsToMessage",
        "deleteReaction",
        "selectMessagesForChannel",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;",
        "selectMessagesForThread",
        "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "selectAllUserMessages",
        "selectAllChannelUserMessages",
        "messageIds",
        "selectMessages",
        "selectMessage",
        "pollId",
        "selectMessagesWithPoll",
        "deleteChannelMessages",
        "deleteMessages",
        "selectMessageIdsBySyncState",
        "selectMessageBySyncState",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "insertDraftMessage",
        "(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;",
        "selectDraftMessages",
        "selectDraftMessagesByCid",
        "parentId",
        "selectDraftMessageByParentId",
        "deleteDraftMessage",
        "evictMessages",
        "evictMessage",
        "deletePoll",
        "selectLocalOnlyMessagesForChannel",
        "cacheChannelConfigs",
        "channelType",
        "Lio/getstream/chat/android/models/ChannelConfig;",
        "selectChannelConfig",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/ChannelConfig;",
        "configs",
        "insertChannelConfigs",
        "config",
        "insertChannelConfig",
        "(Lio/getstream/chat/android/models/ChannelConfig;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/query/QueryChannelsSpec;",
        "queryChannelsSpec",
        "insertQueryChannels",
        "(Lio/getstream/chat/android/client/query/QueryChannelsSpec;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;",
        "identifier",
        "selectBy",
        "(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lq83/d;)Ljava/lang/Object;",
        "order",
        "insertThreadOrder",
        "selectThreadOrder",
        "upsertMessageInThread",
        "upsertMessagesInThread",
        "selectThread",
        "selectThreads",
        "deleteChannelThreads",
        "Lio/getstream/chat/android/client/sync/SyncState;",
        "syncState",
        "insertSyncState",
        "(Lio/getstream/chat/android/client/sync/SyncState;Lq83/d;)Ljava/lang/Object;",
        "selectSyncState",
        "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;",
        "Lbc3/c0;",
        "Lio/getstream/chat/android/models/Config;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
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
.field public static final Companion:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion;


# instance fields
.field private final channelsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

.field private final configsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;

.field private final defaultConfig:Lio/getstream/chat/android/models/Config;

.field private final logger$delegate:Ll83/h;

.field private final messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

.field private final queryChannelsRepository:Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;

.field private final reactionsRepository:Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

.field private final scope:Lbc3/c0;

.field private final syncStateRepository:Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;

.field private final threadsRepository:Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

.field private final userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->Companion:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion;

    return-void
.end method

.method private constructor <init>(Lio/getstream/chat/android/client/persistance/repository/UserRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;Lbc3/c0;Lio/getstream/chat/android/models/Config;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    .line 4
    iput-object p2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->configsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->channelsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    .line 6
    iput-object p4, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->queryChannelsRepository:Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;

    .line 7
    iput-object p5, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->threadsRepository:Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

    .line 8
    iput-object p6, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    .line 9
    iput-object p7, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->reactionsRepository:Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

    .line 10
    iput-object p8, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->syncStateRepository:Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;

    .line 11
    iput-object p9, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->scope:Lbc3/c0;

    .line 12
    iput-object p10, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->defaultConfig:Lio/getstream/chat/android/models/Config;

    .line 13
    const-string p1, "Chat:RepositoryFacade"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->logger$delegate:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/persistance/repository/UserRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;Lbc3/c0;Lio/getstream/chat/android/models/Config;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p10}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;-><init>(Lio/getstream/chat/android/client/persistance/repository/UserRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;Lbc3/c0;Lio/getstream/chat/android/models/Config;)V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public final cacheChannelConfigs(Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->configsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;->cacheChannelConfigs(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final clear(Lq83/d;)Ljava/lang/Object;
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

    instance-of v0, p1, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$clear$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$clear$1;

    iget v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$clear$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$clear$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$clear$1;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$clear$1;-><init>(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$clear$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$clear$1;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_6

    :pswitch_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :pswitch_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_8
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    const/4 v2, 0x1

    iput v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$clear$1;->label:I

    invoke-interface {p1, v0}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->clear(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto :goto_8

    :cond_1
    :goto_1
    iget-object p1, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->channelsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    const/4 v2, 0x2

    iput v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$clear$1;->label:I

    invoke-interface {p1, v0}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->clear(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto :goto_8

    :cond_2
    :goto_2
    iget-object p1, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->reactionsRepository:Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

    const/4 v2, 0x3

    iput v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$clear$1;->label:I

    invoke-interface {p1, v0}, Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;->clear(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_8

    :cond_3
    :goto_3
    iget-object p1, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    const/4 v2, 0x4

    iput v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$clear$1;->label:I

    invoke-interface {p1, v0}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->clear(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_8

    :cond_4
    :goto_4
    iget-object p1, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->threadsRepository:Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

    const/4 v2, 0x5

    iput v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$clear$1;->label:I

    invoke-interface {p1, v0}, Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;->clear(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_8

    :cond_5
    :goto_5
    iget-object p1, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->configsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;

    const/4 v2, 0x6

    iput v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$clear$1;->label:I

    invoke-interface {p1, v0}, Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;->clear(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_8

    :cond_6
    :goto_6
    iget-object p1, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->queryChannelsRepository:Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;

    const/4 v2, 0x7

    iput v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$clear$1;->label:I

    invoke-interface {p1, v0}, Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;->clear(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_8

    :cond_7
    :goto_7
    iget-object p1, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->syncStateRepository:Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;

    const/16 v2, 0x8

    iput v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$clear$1;->label:I

    invoke-interface {p1, v0}, Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;->clear(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_8
    return-object v1

    :cond_8
    :goto_9
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final deleteAllChannelUserMessages(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->channelsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->deleteAllChannelUserMessages(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final deleteChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 6
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

    instance-of v0, p2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannel$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannel$1;

    iget v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannel$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannel$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannel$1;-><init>(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannel$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannel$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannel$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannel$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannel$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->threadsRepository:Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

    iput-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannel$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannel$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;->deleteChannelThreads(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    iget-object p2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->channelsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    iput-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannel$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannel$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->deleteChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    iget-object p2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    const/4 v2, 0x0

    iput-object v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannel$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannel$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->deleteChannelMessages(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteChannelMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannelMessage$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannelMessage$1;

    iget v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannelMessage$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannelMessage$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannelMessage$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannelMessage$1;-><init>(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannelMessage$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannelMessage$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannelMessage$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannelMessage$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannelMessage$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannelMessage$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->deleteChannelMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->channelsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    const/4 v2, 0x0

    iput-object v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannelMessage$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$deleteChannelMessage$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->deleteChannelMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteChannelMessages(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->deleteChannelMessages(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final deleteChannelMessagesBefore(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->deleteChannelMessagesBefore(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteChannelThreads(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->threadsRepository:Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;->deleteChannelThreads(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final deleteDraftMessage(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/DraftMessage;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->deleteDraftMessage(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final deleteMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->deleteMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final deletePoll(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->deletePoll(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final deleteReaction(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Reaction;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->reactionsRepository:Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;->deleteReaction(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final enrichChannel(Lio/getstream/chat/android/models/Channel;Ljava/util/Map;Lio/getstream/chat/android/models/Config;)Lio/getstream/chat/android/models/Channel;
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Channel;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;>;",
            "Lio/getstream/chat/android/models/Config;",
            ")",
            "Lio/getstream/chat/android/models/Channel;"
        }
    .end annotation

    move-object/from16 v0, p2

    const-string v1, "<this>"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "messageMap"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "defaultConfig"

    move-object/from16 v3, p3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getType()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v4, p0

    invoke-virtual {v4, v1}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectChannelConfig(Ljava/lang/String;)Lio/getstream/chat/android/models/ChannelConfig;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/ChannelConfig;->getConfig()Lio/getstream/chat/android/models/Config;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object/from16 v18, v1

    goto :goto_1

    :cond_1
    :goto_0
    move-object/from16 v18, v3

    :goto_1
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_4

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    :goto_3
    move-object v14, v3

    goto :goto_4

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Messages must be in the map"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v3

    goto :goto_3

    :goto_4
    const/16 v39, 0x7

    const/16 v40, 0x0

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

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

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

    const v38, -0x8801

    invoke-static/range {v2 .. v40}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    return-object v0
.end method

.method public final evictChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->channelsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->evictChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final evictMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->evictMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final evictMessages(Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->evictMessages(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final insertChannel(Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Channel;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannel$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannel$1;

    iget v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannel$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannel$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannel$1;-><init>(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannel$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannel$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannel$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Channel;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannel$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/DraftMessage;

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannel$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Channel;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannel$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Channel;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->users(Lio/getstream/chat/android/models/Channel;)Ljava/util/List;

    move-result-object p2

    iput-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannel$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannel$1;->label:I

    iget-object v2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    invoke-interface {v2, p2, v0}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->insertUsers(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getDraftMessage()Lio/getstream/chat/android/models/DraftMessage;

    move-result-object p2

    if-eqz p2, :cond_6

    iput-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannel$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannel$1;->L$1:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannel$1;->I$0:I

    iput v4, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannel$1;->label:I

    iget-object v2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v2, p2, v0}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertDraftMessage(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    iget-object p2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->channelsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    iput-object v6, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannel$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannel$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannel$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->insertChannel(Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertChannelConfig(Lio/getstream/chat/android/models/ChannelConfig;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/ChannelConfig;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->configsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;->insertChannelConfig(Lio/getstream/chat/android/models/ChannelConfig;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final insertChannelConfigs(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lio/getstream/chat/android/models/ChannelConfig;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->configsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;->insertChannelConfigs(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final insertChannels(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;

    iget v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;-><init>(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/Collection;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->I$0:I

    iget-object v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->L$5:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/DraftMessage;

    iget-object v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->L$4:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/Channel;

    iget-object v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v5, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->L$1:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Iterable;

    iget-object v5, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->L$0:Ljava/lang/Object;

    check-cast v5, Ljava/util/Collection;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/Collection;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    check-cast p2, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/getstream/chat/android/models/Channel;

    invoke-static {v7}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->users(Lio/getstream/chat/android/models/Channel;)Ljava/util/List;

    move-result-object v7

    invoke-static {v2, v7}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_1

    :cond_5
    iput-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->label:I

    iget-object p2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    invoke-interface {p2, v2, v0}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->insertUsers(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_2
    move-object p2, p1

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v5, p1

    move-object v2, p2

    move p1, v6

    :cond_7
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    const/4 v7, 0x0

    if-eqz p2, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getDraftMessage()Lio/getstream/chat/android/models/DraftMessage;

    move-result-object p2

    if-eqz p2, :cond_7

    iput-object v5, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->L$1:Ljava/lang/Object;

    iput-object v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->L$2:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->L$3:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->L$4:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->L$5:Ljava/lang/Object;

    iput p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->I$0:I

    iput v6, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->I$1:I

    iput v6, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->I$2:I

    iput v4, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->label:I

    iget-object v7, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v7, p2, v0}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertDraftMessage(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    goto :goto_4

    :cond_8
    iget-object p1, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->channelsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    iput-object v7, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->L$1:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->L$2:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->L$3:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->L$4:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->L$5:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertChannels$1;->label:I

    invoke-interface {p1, v5, v0}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->insertChannels(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_4
    return-object v1

    :cond_9
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertCurrentUser(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->insertCurrentUser(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final insertDraftMessage(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/DraftMessage;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertDraftMessage(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final insertMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessage$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessage$1;

    iget v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessage$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessage$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessage$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessage$1;-><init>(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessage$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessage$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessage$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessage$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessage$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->users(Lio/getstream/chat/android/models/Message;)Ljava/util/List;

    move-result-object p2

    iput-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessage$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessage$1;->label:I

    iget-object v2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    invoke-interface {v2, p2, v0}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->insertUsers(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    iget-object p2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessage$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessage$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    iget-object p2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->threadsRepository:Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

    const/4 v2, 0x0

    iput-object v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessage$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessage$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;->upsertMessageInThread(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessages$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessages$1;

    iget v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessages$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessages$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessages$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessages$1;-><init>(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessages$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessages$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessages$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessages$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessages$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    check-cast p2, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/models/Message;

    invoke-static {v6}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->users(Lio/getstream/chat/android/models/Message;)Ljava/util/List;

    move-result-object v6

    invoke-static {v2, v6}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_1

    :cond_5
    iput-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessages$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessages$1;->label:I

    iget-object p2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    invoke-interface {p2, v2, v0}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->insertUsers(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_2
    iget-object p2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessages$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessages$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    goto :goto_4

    :cond_7
    :goto_3
    iget-object p2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->threadsRepository:Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

    const/4 v2, 0x0

    iput-object v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessages$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertMessages$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;->upsertMessagesInThread(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_4
    return-object v1

    :cond_8
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertQueryChannels(Lio/getstream/chat/android/client/query/QueryChannelsSpec;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/query/QueryChannelsSpec;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->queryChannelsRepository:Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;->insertQueryChannels(Lio/getstream/chat/android/client/query/QueryChannelsSpec;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final insertReaction(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Reaction;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;

    iget v3, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;-><init>(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->label:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    const/4 v9, 0x0

    if-eqz v4, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/User;

    iget-object v3, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v2, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/Reaction;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v8

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->L$2:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/models/User;

    iget-object v4, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/models/Reaction;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    iget-object v4, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->L$2:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/models/User;

    iget-object v7, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->L$1:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v10, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->L$0:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/models/Reaction;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_5

    invoke-direct {v0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[insertReaction] rejected (message id cannot be empty)"

    invoke-interface {v1, v4, v3, v2, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v8

    :cond_5
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Reaction;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v4

    if-nez v4, :cond_6

    invoke-direct {v0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[insertReaction] rejected (user cannot be null)"

    invoke-interface {v1, v4, v3, v2, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v8

    :cond_6
    iget-object v10, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    move-object/from16 v11, p1

    iput-object v11, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->L$0:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->L$1:Ljava/lang/Object;

    iput-object v4, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->L$2:Ljava/lang/Object;

    iput v7, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->label:I

    invoke-interface {v10, v1, v2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->selectMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_7

    goto :goto_3

    :cond_7
    move-object v10, v7

    move-object v7, v1

    move-object v1, v10

    move-object v10, v11

    :goto_1
    if-nez v1, :cond_8

    invoke-direct {v0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[insertReaction] rejected (message cannot be found in local DB)"

    invoke-interface {v1, v4, v3, v2, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v8

    :cond_8
    invoke-direct {v0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v11, v1, Lb23/k;->c:Lb23/e;

    iget-object v12, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v13, Lb23/g;->y:Lb23/g;

    invoke-interface {v11, v13, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_9

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v10}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v11

    const-string v14, "[insertReaction] reaction: "

    const-string v15, ", messageId: "

    invoke-static {v14, v11, v15, v7}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v1, v13, v12, v7, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    iput-object v10, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->L$0:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->L$1:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->L$2:Ljava/lang/Object;

    iput v6, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->label:I

    iget-object v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    invoke-interface {v1, v4, v2}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->insertUser(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_a

    goto :goto_3

    :cond_a
    move-object v4, v10

    :goto_2
    iget-object v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->reactionsRepository:Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

    iput-object v9, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->L$0:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->L$1:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->L$2:Ljava/lang/Object;

    iput v5, v2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertReaction$1;->label:I

    invoke-interface {v1, v4, v2}, Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;->insertReaction(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_b

    :goto_3
    return-object v3

    :cond_b
    return-object v8
.end method

.method public final insertSyncState(Lio/getstream/chat/android/client/sync/SyncState;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/sync/SyncState;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->syncStateRepository:Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;->insertSyncState(Lio/getstream/chat/android/client/sync/SyncState;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final insertThreadOrder(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->threadsRepository:Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;->insertThreadOrder(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final insertThreads(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;

    iget v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;-><init>(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->label:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$5:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$4:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$5:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$4:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_3
    iget p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->I$0:I

    iget-object v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$10:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/DraftMessage;

    iget-object v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$9:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/Thread;

    iget-object v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$7:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v6, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$6:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    iget-object v6, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$5:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v6, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$4:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v6, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$3:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v9, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$2:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    iget-object v9, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$1:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    iget-object v9, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$0:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_4
    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$5:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$4:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, v2

    move-object v2, p1

    move-object p1, v12

    goto/16 :goto_5

    :cond_5
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    check-cast p2, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {p2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lio/getstream/chat/android/models/Thread;

    invoke-virtual {v10}, Lio/getstream/chat/android/models/Thread;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v10

    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_7

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lio/getstream/chat/android/models/Thread;

    invoke-virtual {v11}, Lio/getstream/chat/android/models/Thread;->getLatestReplies()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    invoke-static {v9, v11}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_2

    :cond_7
    invoke-static {v2, v9}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v2

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_8
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lio/getstream/chat/android/models/Thread;

    invoke-virtual {v10}, Lio/getstream/chat/android/models/Thread;->getCreatedBy()Lio/getstream/chat/android/models/User;

    move-result-object v10

    if-eqz v10, :cond_8

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_9
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_a

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lio/getstream/chat/android/models/Message;

    invoke-static {v11}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->users(Lio/getstream/chat/android/models/Message;)Ljava/util/List;

    move-result-object v11

    invoke-static {p2, v11}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_4

    :cond_a
    invoke-static {v9, p2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p2

    iput-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$1:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$2:Ljava/lang/Object;

    iput-object v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$3:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$4:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$5:Ljava/lang/Object;

    iput v6, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->label:I

    iget-object v6, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    invoke-interface {v6, p2, v0}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->insertUsers(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_b

    goto/16 :goto_9

    :cond_b
    :goto_5
    move-object p2, p1

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v6, v2

    move-object v2, p2

    move p2, v7

    :cond_c
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lio/getstream/chat/android/models/Thread;

    invoke-virtual {v9}, Lio/getstream/chat/android/models/Thread;->getDraft()Lio/getstream/chat/android/models/DraftMessage;

    move-result-object v9

    if-eqz v9, :cond_c

    iput-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$1:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$2:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$3:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$4:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$5:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$6:Ljava/lang/Object;

    iput-object v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$7:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$8:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$9:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$10:Ljava/lang/Object;

    iput p2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->I$0:I

    iput v7, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->I$1:I

    iput v7, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->I$2:I

    iput v5, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->label:I

    iget-object v10, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v10, v9, v0}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertDraftMessage(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v1, :cond_d

    goto :goto_9

    :cond_d
    move-object v9, p1

    move p1, p2

    :goto_7
    move p2, p1

    move-object p1, v9

    goto :goto_6

    :cond_e
    iget-object p2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$1:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$2:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$3:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$4:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$5:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$6:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$7:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$8:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$9:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$10:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->label:I

    invoke-interface {p2, v6, v0}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_f

    goto :goto_9

    :cond_f
    :goto_8
    iget-object p2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->threadsRepository:Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$1:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$2:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$3:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$4:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->L$5:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$insertThreads$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;->insertThreads(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_10

    :goto_9
    return-object v1

    :cond_10
    :goto_a
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertUser(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->insertUser(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final insertUsers(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->insertUsers(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final markMessageAsDeleted(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$markMessageAsDeleted$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$markMessageAsDeleted$1;

    iget v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$markMessageAsDeleted$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$markMessageAsDeleted$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$markMessageAsDeleted$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$markMessageAsDeleted$1;-><init>(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$markMessageAsDeleted$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$markMessageAsDeleted$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$markMessageAsDeleted$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$markMessageAsDeleted$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$markMessageAsDeleted$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$markMessageAsDeleted$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$markMessageAsDeleted$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    iget-object p2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    iput-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$markMessageAsDeleted$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$markMessageAsDeleted$1;->label:I

    invoke-interface {p2, v2, v0}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->evictMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    iget-object p2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->channelsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    const/4 v2, 0x0

    iput-object v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$markMessageAsDeleted$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$markMessageAsDeleted$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->updateChannelMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final observeLatestUsers()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    invoke-interface {v0}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->observeLatestUsers()Lec3/f2;

    move-result-object v0

    return-object v0
.end method

.method public final selectAllChannelUserMessages(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->selectAllChannelUserMessages(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectAllCids(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->channelsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->selectAllCids(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectAllUserMessages(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->selectAllUserMessages(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectBy(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/query/QueryChannelsSpec;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->queryChannelsRepository:Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;->selectBy(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Channel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->channelsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->selectChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectChannelCidsBySyncNeeded(ILq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->channelsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->selectChannelCidsBySyncNeeded(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectChannelConfig(Ljava/lang/String;)Lio/getstream/chat/android/models/ChannelConfig;
    .locals 1

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->configsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;->selectChannelConfig(Ljava/lang/String;)Lio/getstream/chat/android/models/ChannelConfig;

    move-result-object p1

    return-object p1
.end method

.method public final selectChannels(Ljava/util/List;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$2;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$2;

    iget v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$2;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$2;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$2;

    invoke-direct {v0, p0, p3}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$2;-><init>(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$2;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    .line 2
    iget v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$2;->label:I

    const/16 v3, 0xa

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$2;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$2;->L$1:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;

    iget-object p2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$2;->L$0:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$2;->L$1:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$2;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    .line 3
    iget-object p3, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->channelsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    iput-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$2;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$2;->L$1:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$2;->label:I

    invoke-interface {p3, p1, v0}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->selectChannels(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_3

    .line 4
    :cond_4
    :goto_1
    check-cast p3, Ljava/util/List;

    if-eqz p2, :cond_5

    .line 5
    invoke-static {p2}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequestKt;->isRequestingMoreThanLastMessage(Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 6
    sget-object p1, Lm83/z;->w:Lm83/z;

    goto :goto_5

    .line 7
    :cond_5
    check-cast p1, Ljava/lang/Iterable;

    .line 8
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 10
    check-cast v5, Ljava/lang/String;

    .line 11
    iget-object v7, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->scope:Lbc3/c0;

    new-instance v8, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$messagesMap$1$1;

    invoke-direct {v8, v5, p0, p2, v6}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$messagesMap$1$1;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)V

    const/4 v5, 0x3

    invoke-static {v7, v6, v8, v5}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v5

    .line 12
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 13
    :cond_6
    iput-object v6, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$2;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$2;->L$1:Ljava/lang/Object;

    iput-object p3, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$2;->L$2:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$2;->label:I

    invoke-static {v2, v0}, Lbc3/f0;->f(Ljava/util/ArrayList;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    move-object v9, p3

    move-object p3, p1

    move-object p1, v9

    :goto_4
    check-cast p3, Ljava/lang/Iterable;

    invoke-static {p3}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p2

    move-object p3, p1

    move-object p1, p2

    .line 14
    :goto_5
    check-cast p3, Ljava/lang/Iterable;

    .line 15
    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p3, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_6
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 17
    check-cast v0, Lio/getstream/chat/android/models/Channel;

    .line 18
    iget-object v1, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->defaultConfig:Lio/getstream/chat/android/models/Config;

    invoke-virtual {p0, v0, p1, v1}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->enrichChannel(Lio/getstream/chat/android/models/Channel;Ljava/util/Map;Lio/getstream/chat/android/models/Config;)Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    .line 19
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_8
    return-object p2
.end method

.method public final selectChannels(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, p2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectChannels(Ljava/util/List;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectChannelsSyncNeeded(ILq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->channelsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->selectChannelsSyncNeeded(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectDraftMessageByParentId(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/DraftMessage;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->selectDraftMessageByParentId(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectDraftMessages(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/DraftMessage;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->selectDraftMessages(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectDraftMessagesByCid(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/DraftMessage;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->selectDraftMessagesByCid(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectLocalOnlyMessagesForChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->selectLocalOnlyMessagesForChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectMembersForChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->channelsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->selectMembersForChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Message;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->selectMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectMessageBySyncState(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->selectMessageBySyncState(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectMessageIdsBySyncState(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->selectMessageIdsBySyncState(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->selectMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectMessagesForChannel(Ljava/lang/String;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->selectMessagesForChannel(Ljava/lang/String;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectMessagesForThread(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->selectMessagesForThread(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectMessagesWithPoll(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->selectMessagesWithPoll(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectReactionById(ILq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->reactionsRepository:Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;->selectReactionById(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectReactionIdsBySyncStatus(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->reactionsRepository:Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;->selectReactionIdsBySyncStatus(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectReactionsByIds(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->reactionsRepository:Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;->selectReactionsByIds(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectReactionsBySyncStatus(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->reactionsRepository:Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;->selectReactionsBySyncStatus(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectSyncState(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/sync/SyncState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->syncStateRepository:Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;->selectSyncState(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectThread(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Thread;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->threadsRepository:Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;->selectThread(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectThreadOrder(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->threadsRepository:Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;->selectThreadOrder(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectThreads(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->threadsRepository:Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;->selectThreads(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectUser(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/User;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->selectUser(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectUserReactionToMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->reactionsRepository:Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;->selectUserReactionToMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectUserReactionsToMessage(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->reactionsRepository:Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;->selectUserReactionsToMessage(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectUsers(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->selectUsers(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final setChannelDeletedAt(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->channelsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->setChannelDeletedAt(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final setHiddenForChannel(Ljava/lang/String;ZLjava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$1;

    iget v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$1;

    invoke-direct {v0, p0, p4}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$1;-><init>(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    .line 1
    iget v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/util/Date;

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$1;->Z$0:Z

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/util/Date;

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    .line 2
    iget-object p4, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->channelsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    iput-object v5, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$1;->L$1:Ljava/lang/Object;

    iput-boolean p2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$1;->Z$0:Z

    iput v4, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$1;->label:I

    invoke-interface {p4, p1, p2, p3, v0}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->setHiddenForChannel(Ljava/lang/String;ZLjava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    .line 3
    :cond_4
    :goto_1
    iget-object p1, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object v5, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$1;->L$1:Ljava/lang/Object;

    iput-boolean p2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$1;->Z$0:Z

    iput v3, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$1;->label:I

    invoke-interface {p1, v0}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->evictMessages(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    .line 4
    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final setHiddenForChannel(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$2;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$2;

    iget v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$2;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$2;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$2;

    invoke-direct {v0, p0, p3}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$2;-><init>(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$2;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    .line 5
    iget v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$2;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$2;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$2;->Z$0:Z

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$2;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    .line 6
    iget-object p3, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->channelsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    iput-object v3, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$2;->L$0:Ljava/lang/Object;

    iput-boolean p2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$2;->Z$0:Z

    iput v5, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$2;->label:I

    invoke-interface {p3, p1, p2, v0}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->setHiddenForChannel(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    .line 7
    :cond_4
    :goto_1
    iget-object p1, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object v3, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$2;->L$0:Ljava/lang/Object;

    iput-boolean p2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$2;->Z$0:Z

    iput v4, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$setHiddenForChannel$2;->label:I

    invoke-interface {p1, v0}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->evictMessages(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    .line 8
    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final storeStateForChannel(Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Channel;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->storeStateForChannels(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final storeStateForChannels(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$storeStateForChannels$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$storeStateForChannels$1;

    iget v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$storeStateForChannels$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$storeStateForChannels$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$storeStateForChannels$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$storeStateForChannels$1;-><init>(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$storeStateForChannels$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$storeStateForChannels$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/16 v6, 0xa

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$storeStateForChannels$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/Collection;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$storeStateForChannels$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/Collection;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$storeStateForChannels$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/Collection;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    check-cast p2, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p2, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/getstream/chat/android/models/Channel;

    new-instance v8, Lio/getstream/chat/android/models/ChannelConfig;

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Channel;->getType()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Channel;->getConfig()Lio/getstream/chat/android/models/Config;

    move-result-object v7

    invoke-direct {v8, v9, v7}, Lio/getstream/chat/android/models/ChannelConfig;-><init>(Ljava/lang/String;Lio/getstream/chat/android/models/Config;)V

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    iput-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$storeStateForChannels$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$storeStateForChannels$1;->label:I

    iget-object p2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->configsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;

    invoke-interface {p2, v2, v0}, Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;->insertChannelConfigs(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto/16 :goto_7

    :cond_6
    :goto_2
    iput-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$storeStateForChannels$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$storeStateForChannels$1;->label:I

    invoke-virtual {p0, p1, v0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->insertChannels(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    goto/16 :goto_7

    :cond_7
    :goto_3
    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v4, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->enrichWithCid(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_8
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getPendingMessages()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v4, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/getstream/chat/android/models/PendingMessage;

    invoke-virtual {v8}, Lio/getstream/chat/android/models/PendingMessage;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v8

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->enrichWithCid(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_9
    invoke-static {v5, v7}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {p2, v2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_4

    :cond_a
    const/4 p1, 0x0

    iput-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$storeStateForChannels$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$storeStateForChannels$1;->label:I

    invoke-virtual {p0, p2, v0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->insertMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    :goto_7
    return-object v1

    :cond_b
    :goto_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final updateChannelMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->channelsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->updateChannelMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final updateLastMessageForChannel(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->channelsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->updateLastMessageForChannel(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final updateMembersForChannel(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$updateMembersForChannel$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$updateMembersForChannel$1;

    iget v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$updateMembersForChannel$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$updateMembersForChannel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$updateMembersForChannel$1;

    invoke-direct {v0, p0, p3}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$updateMembersForChannel$1;-><init>(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$updateMembersForChannel$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$updateMembersForChannel$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$updateMembersForChannel$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$updateMembersForChannel$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$updateMembersForChannel$1;->L$1:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Ljava/util/List;

    iget-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$updateMembersForChannel$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p3, p2

    check-cast p3, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {p3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    iput-object p1, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$updateMembersForChannel$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$updateMembersForChannel$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$updateMembersForChannel$1;->label:I

    iget-object p3, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    invoke-interface {p3, v2, v0}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->insertUsers(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    iget-object p3, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->channelsRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    const/4 v2, 0x0

    iput-object v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$updateMembersForChannel$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$updateMembersForChannel$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$updateMembersForChannel$1;->label:I

    invoke-interface {p3, p1, p2, v0}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->updateMembersForChannel(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_3
    return-object v1

    :cond_6
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final updateReactionsForMessageByDeletedDate(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->reactionsRepository:Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;->updateReactionsForMessageByDeletedDate(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final upsertMessageInThread(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->threadsRepository:Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;->upsertMessageInThread(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final upsertMessagesInThread(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->threadsRepository:Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;->upsertMessagesInThread(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
