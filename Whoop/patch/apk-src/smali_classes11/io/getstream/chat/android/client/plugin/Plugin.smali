.class public interface abstract Lio/getstream/chat/android/client/plugin/Plugin;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/DependencyResolver;
.implements Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/SendGiphyListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/QueryChannelsListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/TypingEventListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/MarkAllReadListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/ChannelMarkReadListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/GetMessageListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/BlockUserListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/UnblockUserListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/QueryBlockedUsersListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/LiveLocationListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/PushPreferencesListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ca\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008&\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008g\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\u00082\u00020\t2\u00020\n2\u00020\u000b2\u00020\u000c2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u00112\u00020\u00122\u00020\u00132\u00020\u00142\u00020\u00152\u00020\u00162\u00020\u00172\u00020\u00182\u00020\u00192\u00020\u001a2\u00020\u001b2\u00020\u001c2\u00020\u001dJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 Jh\u00101\u001a\u0002002\u0012\u0010$\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020#0\"0!2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0006\u0010,\u001a\u00020+2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020#0-2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020#0\"H\u0096@\u00a2\u0006\u0004\u00081\u00102J2\u00108\u001a\u0002002\u0008\u00103\u001a\u0004\u0018\u00010%2\u0006\u00104\u001a\u00020%2\u0006\u00105\u001a\u00020%2\u0006\u00107\u001a\u000206H\u0096@\u00a2\u0006\u0004\u00088\u00109J@\u0010;\u001a\u0002002\u0008\u00103\u001a\u0004\u0018\u00010%2\u0006\u00104\u001a\u00020%2\u0006\u00105\u001a\u00020%2\u0006\u00107\u001a\u0002062\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020:0!H\u0096@\u00a2\u0006\u0004\u0008;\u0010<J\u001f\u0010=\u001a\u0008\u0012\u0004\u0012\u0002000!2\u0008\u00107\u001a\u0004\u0018\u000106H\u0016\u00a2\u0006\u0004\u0008=\u0010>J2\u0010A\u001a\u0008\u0012\u0004\u0012\u0002000!2\u0008\u00103\u001a\u0004\u0018\u00010%2\u0008\u00107\u001a\u0004\u0018\u0001062\u0006\u0010@\u001a\u00020?H\u0096@\u00a2\u0006\u0004\u0008A\u0010BJ:\u0010F\u001a\u0002002\u0008\u00103\u001a\u0004\u0018\u00010%2\u0006\u0010@\u001a\u00020?2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020C2\u0006\u00107\u001a\u000206H\u0096@\u00a2\u0006\u0004\u0008F\u0010GJ@\u0010H\u001a\u0002002\u0008\u00103\u001a\u0004\u0018\u00010%2\u0006\u0010@\u001a\u00020?2\u0006\u0010D\u001a\u00020C2\u0006\u00107\u001a\u0002062\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020?0!H\u0096@\u00a2\u0006\u0004\u0008H\u0010IJ \u0010K\u001a\u0002002\u0006\u0010J\u001a\u00020%2\u0006\u0010*\u001a\u00020(H\u0096@\u00a2\u0006\u0004\u0008K\u0010LJ4\u0010M\u001a\u0002002\u0012\u0010$\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020:0\"0!2\u0006\u0010J\u001a\u00020%2\u0006\u0010*\u001a\u00020(H\u0096@\u00a2\u0006\u0004\u0008M\u0010NJ*\u0010P\u001a\u0002002\u0006\u0010J\u001a\u00020%2\u0006\u0010*\u001a\u00020(2\u0008\u0010O\u001a\u0004\u0018\u00010%H\u0096@\u00a2\u0006\u0004\u0008P\u0010QJ(\u0010S\u001a\u0002002\u0006\u0010J\u001a\u00020%2\u0006\u0010R\u001a\u00020%2\u0006\u0010*\u001a\u00020(H\u0096@\u00a2\u0006\u0004\u0008S\u0010TJ<\u0010U\u001a\u0002002\u0012\u0010$\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020:0\"0!2\u0006\u0010J\u001a\u00020%2\u0006\u0010R\u001a\u00020%2\u0006\u0010*\u001a\u00020(H\u0096@\u00a2\u0006\u0004\u0008U\u0010VJ>\u0010W\u001a\u0002002\u0012\u0010$\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020:0\"0!2\u0006\u0010J\u001a\u00020%2\u0006\u0010*\u001a\u00020(2\u0008\u0010O\u001a\u0004\u0018\u00010%H\u0096@\u00a2\u0006\u0004\u0008W\u0010XJ%\u0010Y\u001a\u0002002\u0006\u00103\u001a\u00020%2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020:0!H\u0016\u00a2\u0006\u0004\u0008Y\u0010ZJ&\u0010[\u001a\u0002002\u0006\u00103\u001a\u00020%2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020:0!H\u0096@\u00a2\u0006\u0004\u0008[\u0010\\J\u001e\u0010]\u001a\u0008\u0012\u0004\u0012\u0002000!2\u0006\u00104\u001a\u00020%H\u0096@\u00a2\u0006\u0004\u0008]\u0010^J\u0018\u0010_\u001a\u0002002\u0006\u00104\u001a\u00020%H\u0096@\u00a2\u0006\u0004\u0008_\u0010^J&\u0010a\u001a\u0002002\u0006\u0010`\u001a\u00020%2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020:0!H\u0096@\u00a2\u0006\u0004\u0008a\u0010\\J6\u0010c\u001a\u0002002\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020:0!2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u0006\u0010b\u001a\u00020:H\u0096@\u00a2\u0006\u0004\u0008c\u0010dJ\u0018\u0010e\u001a\u0002002\u0006\u0010b\u001a\u00020:H\u0096@\u00a2\u0006\u0004\u0008e\u0010fJ&\u0010h\u001a\u0002002\u0006\u0010g\u001a\u00020:2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020:0!H\u0096@\u00a2\u0006\u0004\u0008h\u0010iJ.\u0010l\u001a\u0008\u0012\u0004\u0012\u0002000!2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u0006\u0010k\u001a\u00020jH\u0096@\u00a2\u0006\u0004\u0008l\u0010mJ(\u0010n\u001a\u0002002\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u0006\u0010k\u001a\u00020jH\u0096@\u00a2\u0006\u0004\u0008n\u0010mJ6\u0010p\u001a\u0002002\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020o0!2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u0006\u0010k\u001a\u00020jH\u0096@\u00a2\u0006\u0004\u0008p\u0010qJI\u0010x\u001a\u0008\u0012\u0004\u0012\u0002000!2\u0006\u0010r\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u0012\u0010u\u001a\u000e\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020t0s2\u0006\u0010w\u001a\u00020vH\u0016\u00a2\u0006\u0004\u0008x\u0010yJC\u0010z\u001a\u0002002\u0006\u0010r\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u0012\u0010u\u001a\u000e\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020t0s2\u0006\u0010w\u001a\u00020vH\u0016\u00a2\u0006\u0004\u0008z\u0010{JQ\u0010}\u001a\u0002002\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020|0!2\u0006\u0010r\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u0012\u0010u\u001a\u000e\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020t0s2\u0006\u0010w\u001a\u00020vH\u0016\u00a2\u0006\u0004\u0008}\u0010~J1\u0010\u0080\u0001\u001a\u0008\u0012\u0004\u0012\u0002000!2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u0006\u0010\u007f\u001a\u00020CH\u0096@\u00a2\u0006\u0006\u0008\u0080\u0001\u0010\u0081\u0001J+\u0010\u0082\u0001\u001a\u0002002\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u0006\u0010\u007f\u001a\u00020CH\u0096@\u00a2\u0006\u0006\u0008\u0082\u0001\u0010\u0081\u0001J9\u0010\u0083\u0001\u001a\u0002002\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u0002000!2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u0006\u0010\u007f\u001a\u00020CH\u0096@\u00a2\u0006\u0006\u0008\u0083\u0001\u0010\u0084\u0001J\u0013\u0010\u0085\u0001\u001a\u000200H\u0096@\u00a2\u0006\u0006\u0008\u0085\u0001\u0010\u0086\u0001J)\u0010\u0087\u0001\u001a\u0008\u0012\u0004\u0012\u0002000!2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%H\u0096@\u00a2\u0006\u0006\u0008\u0087\u0001\u0010\u0088\u0001J5\u0010\u008b\u0001\u001a\u0002002\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u0008\u0010\u008a\u0001\u001a\u00030\u0089\u00012\u0006\u00107\u001a\u000206H\u0096@\u00a2\u0006\u0006\u0008\u008b\u0001\u0010\u008c\u0001J@\u0010\u008e\u0001\u001a\u0002002\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\r\u0010\u008d\u0001\u001a\u0008\u0012\u0004\u0012\u00020%0\"2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020o0!H\u0096@\u00a2\u0006\u0006\u0008\u008e\u0001\u0010\u008f\u0001J9\u0010\u0090\u0001\u001a\u0008\u0012\u0004\u0012\u0002000!2\u0008\u00107\u001a\u0004\u0018\u0001062\u0006\u0010\'\u001a\u00020%2\r\u0010\u008d\u0001\u001a\u0008\u0012\u0004\u0012\u00020%0\"H\u0016\u00a2\u0006\u0006\u0008\u0090\u0001\u0010\u0091\u0001J-\u0010\u0092\u0001\u001a\u0002002\u0008\u00107\u001a\u0004\u0018\u0001062\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%H\u0096@\u00a2\u0006\u0006\u0008\u0092\u0001\u0010\u0093\u0001J1\u0010\u0094\u0001\u001a\u0002002\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020o0!H\u0096@\u00a2\u0006\u0006\u0008\u0094\u0001\u0010\u0095\u0001J3\u0010\u0096\u0001\u001a\u0008\u0012\u0004\u0012\u0002000!2\u0008\u00107\u001a\u0004\u0018\u0001062\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%H\u0096@\u00a2\u0006\u0006\u0008\u0096\u0001\u0010\u0093\u0001J+\u0010\u0097\u0001\u001a\u0002002\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u0006\u0010b\u001a\u00020:H\u0096@\u00a2\u0006\u0006\u0008\u0097\u0001\u0010\u0098\u0001J\u001b\u0010\u009a\u0001\u001a\u0002002\u0007\u0010\u0099\u0001\u001a\u000206H\u0016\u00a2\u0006\u0006\u0008\u009a\u0001\u0010\u009b\u0001J\u0012\u0010\u009c\u0001\u001a\u000200H\u0016\u00a2\u0006\u0006\u0008\u009c\u0001\u0010\u009d\u0001J(\u0010\u009e\u0001\u001a\u0002002\u0006\u00104\u001a\u00020%2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020:0!H\u0096@\u00a2\u0006\u0005\u0008\u009e\u0001\u0010\\J!\u0010\u009f\u0001\u001a\u0002002\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u0002060!H\u0096@\u00a2\u0006\u0006\u0008\u009f\u0001\u0010\u00a0\u0001J\"\u0010\u00a2\u0001\u001a\u0008\u0012\u0004\u0012\u0002000!2\u0007\u0010k\u001a\u00030\u00a1\u0001H\u0096@\u00a2\u0006\u0006\u0008\u00a2\u0001\u0010\u00a3\u0001J\u001c\u0010\u00a4\u0001\u001a\u0002002\u0007\u0010k\u001a\u00030\u00a1\u0001H\u0096@\u00a2\u0006\u0006\u0008\u00a4\u0001\u0010\u00a3\u0001J+\u0010\u00a6\u0001\u001a\u0002002\r\u0010$\u001a\t\u0012\u0005\u0012\u00030\u00a5\u00010!2\u0007\u0010k\u001a\u00030\u00a1\u0001H\u0096@\u00a2\u0006\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001J!\u0010\u00a9\u0001\u001a\u0002002\r\u0010$\u001a\t\u0012\u0005\u0012\u00030\u00a8\u00010!H\u0016\u00a2\u0006\u0006\u0008\u00a9\u0001\u0010\u00aa\u0001J(\u0010\u00ac\u0001\u001a\u0002002\u0007\u0010\u00ab\u0001\u001a\u00020%2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u0002000!H\u0016\u00a2\u0006\u0005\u0008\u00ac\u0001\u0010ZJ\'\u0010\u00ad\u0001\u001a\u0002002\u0013\u0010$\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00a8\u00010\"0!H\u0016\u00a2\u0006\u0006\u0008\u00ad\u0001\u0010\u00aa\u0001J;\u0010\u00af\u0001\u001a\u0002002\r\u0010$\u001a\t\u0012\u0005\u0012\u00030\u00ae\u00010!2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u0007\u0010b\u001a\u00030\u00ae\u0001H\u0096@\u00a2\u0006\u0006\u0008\u00af\u0001\u0010\u00b0\u0001J:\u0010\u00b1\u0001\u001a\u0002002\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u0002000!2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u0007\u0010b\u001a\u00030\u00ae\u0001H\u0096@\u00a2\u0006\u0006\u0008\u00b1\u0001\u0010\u00b0\u0001JL\u0010\u00b5\u0001\u001a\u0002002\r\u0010$\u001a\t\u0012\u0005\u0012\u00030\u00b2\u00010!2\u0006\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020(2\t\u0010\u00b3\u0001\u001a\u0004\u0018\u00010%2\r\u0010.\u001a\t\u0012\u0005\u0012\u00030\u00b4\u00010-H\u0096@\u00a2\u0006\u0006\u0008\u00b5\u0001\u0010\u00b6\u0001J#\u0010\u00b9\u0001\u001a\u0008\u0012\u0004\u0012\u0002000!2\u0008\u0010\u00b8\u0001\u001a\u00030\u00b7\u0001H\u0096@\u00a2\u0006\u0006\u0008\u00b9\u0001\u0010\u00ba\u0001J(\u0010\u00bb\u0001\u001a\u0002002\u0013\u0010$\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00b7\u00010\"0!H\u0096@\u00a2\u0006\u0006\u0008\u00bb\u0001\u0010\u00a0\u0001J,\u0010\u00bc\u0001\u001a\u0002002\u0008\u0010\u00b8\u0001\u001a\u00030\u00b7\u00012\r\u0010$\u001a\t\u0012\u0005\u0012\u00030\u00b7\u00010!H\u0096@\u00a2\u0006\u0006\u0008\u00bc\u0001\u0010\u00bd\u0001J,\u0010\u00be\u0001\u001a\u0002002\u0008\u0010\u00b8\u0001\u001a\u00030\u00b7\u00012\r\u0010$\u001a\t\u0012\u0005\u0012\u00030\u00b7\u00010!H\u0096@\u00a2\u0006\u0006\u0008\u00be\u0001\u0010\u00bd\u0001J,\u0010\u00bf\u0001\u001a\u0002002\u0008\u0010\u00b8\u0001\u001a\u00030\u00b7\u00012\r\u0010$\u001a\t\u0012\u0005\u0012\u00030\u00b7\u00010!H\u0096@\u00a2\u0006\u0006\u0008\u00bf\u0001\u0010\u00bd\u0001J4\u0010\u00c3\u0001\u001a\u0002002\u0006\u00103\u001a\u00020%2\u0008\u0010\u00c1\u0001\u001a\u00030\u00c0\u00012\r\u0010$\u001a\t\u0012\u0005\u0012\u00030\u00c2\u00010!H\u0096@\u00a2\u0006\u0006\u0008\u00c3\u0001\u0010\u00c4\u0001J3\u0010\u00c6\u0001\u001a\u0002002\u0006\u00103\u001a\u00020%2\u0007\u0010\u00c5\u0001\u001a\u00020v2\r\u0010$\u001a\t\u0012\u0005\u0012\u00030\u00c2\u00010!H\u0096@\u00a2\u0006\u0006\u0008\u00c6\u0001\u0010\u00c7\u0001\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u00c8\u0001\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/plugin/Plugin;",
        "Lio/getstream/chat/android/client/plugin/DependencyResolver;",
        "Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/SendGiphyListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/QueryChannelsListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/TypingEventListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/MarkAllReadListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/ChannelMarkReadListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/GetMessageListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/BlockUserListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/UnblockUserListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/QueryBlockedUsersListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/LiveLocationListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/PushPreferencesListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;",
        "Lio/getstream/chat/android/client/errorhandler/ErrorHandler;",
        "getErrorHandler",
        "()Lio/getstream/chat/android/client/errorhandler/ErrorHandler;",
        "Ln23/h;",
        "",
        "Lio/getstream/chat/android/models/Member;",
        "result",
        "",
        "channelType",
        "channelId",
        "",
        "offset",
        "limit",
        "Lio/getstream/chat/android/models/FilterObject;",
        "filter",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "sort",
        "members",
        "Ll83/a0;",
        "onQueryMembersResult",
        "(Ln23/h;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "cid",
        "messageId",
        "reactionType",
        "Lio/getstream/chat/android/models/User;",
        "currentUser",
        "onDeleteReactionRequest",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/Message;",
        "onDeleteReactionResult",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "onDeleteReactionPrecondition",
        "(Lio/getstream/chat/android/models/User;)Ln23/h;",
        "Lio/getstream/chat/android/models/Reaction;",
        "reaction",
        "onSendReactionPrecondition",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;",
        "",
        "enforceUnique",
        "skipPush",
        "onSendReactionRequest",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;",
        "onSendReactionResult",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "parentId",
        "onGetRepliesRequest",
        "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "onGetRepliesResult",
        "(Ln23/h;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "lastId",
        "onGetNewerRepliesRequest",
        "(Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "firstId",
        "onGetRepliesMoreRequest",
        "(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "onGetRepliesMoreResult",
        "(Ln23/h;Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "onGetNewerRepliesResult",
        "(Ln23/h;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "onGiphySendResult",
        "(Ljava/lang/String;Ln23/h;)V",
        "onShuffleGiphyResult",
        "(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "onMessageDeletePrecondition",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "onMessageDeleteRequest",
        "originalMessageId",
        "onMessageDeleteResult",
        "message",
        "onMessageSendResult",
        "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
        "onMessageEditRequest",
        "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
        "originalMessage",
        "onMessageEditResult",
        "(Lio/getstream/chat/android/models/Message;Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
        "request",
        "onQueryChannelPrecondition",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;",
        "onQueryChannelRequest",
        "Lio/getstream/chat/android/models/Channel;",
        "onQueryChannelResult",
        "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;",
        "eventType",
        "",
        "",
        "extraData",
        "Ljava/util/Date;",
        "eventTime",
        "onTypingEventPrecondition",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)Ln23/h;",
        "onTypingEventRequest",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)V",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "onTypingEventResult",
        "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)V",
        "clearHistory",
        "onHideChannelPrecondition",
        "(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "onHideChannelRequest",
        "onHideChannelResult",
        "(Ln23/h;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "onMarkAllReadRequest",
        "(Lq83/d;)Ljava/lang/Object;",
        "onChannelMarkReadPrecondition",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/query/CreateChannelParams;",
        "params",
        "onCreateChannelRequest",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/query/CreateChannelParams;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;",
        "memberIds",
        "onCreateChannelResult",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "onCreateChannelPrecondition",
        "(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/List;)Ln23/h;",
        "onDeleteChannelRequest",
        "(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "onDeleteChannelResult",
        "(Ljava/lang/String;Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "onDeleteChannelPrecondition",
        "onAttachmentSendRequest",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
        "user",
        "onUserSet",
        "(Lio/getstream/chat/android/models/User;)V",
        "onUserDisconnected",
        "()V",
        "onGetMessageResult",
        "onFetchCurrentUserResult",
        "(Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
        "onQueryThreadsPrecondition",
        "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;",
        "onQueryThreadsRequest",
        "Lio/getstream/chat/android/models/QueryThreadsResult;",
        "onQueryThreadsResult",
        "(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/UserBlock;",
        "onBlockUserResult",
        "(Ln23/h;)V",
        "userId",
        "onUnblockUserResult",
        "onQueryBlockedUsersResult",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "onCreateDraftMessageResult",
        "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;",
        "onDeleteDraftMessagesResult",
        "Lio/getstream/chat/android/models/QueryDraftsResult;",
        "next",
        "Lio/getstream/chat/android/models/DraftsSort;",
        "onQueryDraftMessagesResult",
        "(Ln23/h;Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/Location;",
        "location",
        "onUpdateLiveLocationPrecondition",
        "(Lio/getstream/chat/android/models/Location;Lq83/d;)Ljava/lang/Object;",
        "onQueryActiveLocationsResult",
        "onUpdateLiveLocationResult",
        "(Lio/getstream/chat/android/models/Location;Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "onStopLiveLocationSharingResult",
        "onStartLiveLocationSharingResult",
        "Lio/getstream/chat/android/models/PushPreferenceLevel;",
        "level",
        "Lio/getstream/chat/android/models/PushPreference;",
        "onChannelPushPreferenceSet",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "until",
        "onChannelPushNotificationsSnoozed",
        "(Ljava/lang/String;Ljava/util/Date;Ln23/h;Lq83/d;)Ljava/lang/Object;",
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


# direct methods
.method public static synthetic onAttachmentSendRequest$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onChannelMarkReadPrecondition$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p0, Ln23/g;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p0, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static synthetic onChannelPushNotificationsSnoozed$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Ljava/util/Date;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onChannelPushPreferenceSet$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/PushPreferenceLevel;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onCreateChannelRequest$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/query/CreateChannelParams;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/query/CreateChannelParams;",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onCreateChannelResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onCreateDraftMessageResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/DraftMessage;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onDeleteChannelPrecondition$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Lio/getstream/chat/android/models/User;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p0, Ln23/g;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p0, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static synthetic onDeleteChannelRequest$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Lio/getstream/chat/android/models/User;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onDeleteChannelResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onDeleteDraftMessagesResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/DraftMessage;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onDeleteReactionRequest$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onDeleteReactionResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/User;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onFetchCurrentUserResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onGetMessageResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ljava/lang/String;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onGetNewerRepliesRequest$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onGetNewerRepliesResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ln23/h;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ln23/h;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onGetRepliesMoreRequest$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onGetRepliesMoreResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ln23/h;Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onGetRepliesRequest$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onGetRepliesResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ln23/h;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ln23/h;",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onHideChannelPrecondition$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p0, Ln23/g;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p0, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static synthetic onHideChannelRequest$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
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

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onHideChannelResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ln23/h;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ln23/h;",
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

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onMarkAllReadRequest$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onMessageDeletePrecondition$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p0, Ln23/g;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p0, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static synthetic onMessageDeleteRequest$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onMessageDeleteResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ljava/lang/String;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onMessageEditRequest$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onMessageEditResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Lio/getstream/chat/android/models/Message;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Lio/getstream/chat/android/models/Message;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onMessageSendResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onQueryActiveLocationsResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onQueryChannelPrecondition$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p0, Ln23/g;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p0, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static synthetic onQueryChannelRequest$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onQueryChannelResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onQueryDraftMessagesResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ln23/h;Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ln23/h;",
            "Lio/getstream/chat/android/models/FilterObject;",
            "I",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/DraftsSort;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onQueryMembersResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ln23/h;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Member;",
            ">;",
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

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onQueryThreadsPrecondition$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p0, Ln23/g;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p0, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static synthetic onQueryThreadsRequest$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onQueryThreadsResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ln23/h;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ln23/h;",
            "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onSendReactionPrecondition$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/models/Reaction;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p0, Ln23/g;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p0, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static synthetic onSendReactionRequest$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Reaction;",
            "ZZ",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onSendReactionResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Reaction;",
            "Z",
            "Lio/getstream/chat/android/models/User;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onShuffleGiphyResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Ljava/lang/String;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onStartLiveLocationSharingResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Lio/getstream/chat/android/models/Location;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Lio/getstream/chat/android/models/Location;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onStopLiveLocationSharingResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Lio/getstream/chat/android/models/Location;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Lio/getstream/chat/android/models/Location;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic onUpdateLiveLocationPrecondition$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Lio/getstream/chat/android/models/Location;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Lio/getstream/chat/android/models/Location;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p0, Ln23/g;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p0, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static synthetic onUpdateLiveLocationResult$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Lio/getstream/chat/android/models/Location;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Lio/getstream/chat/android/models/Location;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public getErrorHandler()Lio/getstream/chat/android/client/errorhandler/ErrorHandler;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public onAttachmentSendRequest(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onBlockUserResult(Ln23/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            ")V"
        }
    .end annotation

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onChannelMarkReadPrecondition(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/client/plugin/Plugin;->onChannelMarkReadPrecondition$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public onChannelPushNotificationsSnoozed(Ljava/lang/String;Ljava/util/Date;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onChannelPushPreferenceSet(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/PushPreferenceLevel;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onCreateChannelPrecondition(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/List;)Ln23/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ln23/h;"
        }
    .end annotation

    const-string p1, "channelId"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "memberIds"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ln23/g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, p2}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public onCreateChannelRequest(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/query/CreateChannelParams;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/query/CreateChannelParams;",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onCreateChannelResult(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onCreateDraftMessageResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/DraftMessage;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onDeleteChannelPrecondition(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/plugin/Plugin;->onDeleteChannelPrecondition$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public onDeleteChannelRequest(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onDeleteChannelResult(Ljava/lang/String;Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onDeleteDraftMessagesResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/DraftMessage;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onDeleteReactionPrecondition(Lio/getstream/chat/android/models/User;)Ln23/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    new-instance p1, Ln23/g;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public onDeleteReactionRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onDeleteReactionResult(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/User;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onFetchCurrentUserResult(Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onGetMessageResult(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onGetNewerRepliesRequest(Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onGetNewerRepliesResult(Ln23/h;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onGetRepliesMoreRequest(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onGetRepliesMoreResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onGetRepliesRequest(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onGetRepliesResult(Ln23/h;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onGiphySendResult(Ljava/lang/String;Ln23/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln23/h;",
            ")V"
        }
    .end annotation

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "result"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onHideChannelPrecondition(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/plugin/Plugin;->onHideChannelPrecondition$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public onHideChannelRequest(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onHideChannelResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
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

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onMarkAllReadRequest(Lq83/d;)Ljava/lang/Object;
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

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onMessageDeletePrecondition(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/plugin/Plugin;->onMessageDeletePrecondition$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public onMessageDeleteRequest(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onMessageDeleteResult(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onMessageEditRequest(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onMessageEditResult(Lio/getstream/chat/android/models/Message;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onMessageSendResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onQueryActiveLocationsResult(Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onQueryBlockedUsersResult(Ln23/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            ")V"
        }
    .end annotation

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onQueryChannelPrecondition(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/plugin/Plugin;->onQueryChannelPrecondition$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public onQueryChannelRequest(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onQueryChannelResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onQueryDraftMessagesResult(Ln23/h;Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Lio/getstream/chat/android/models/FilterObject;",
            "I",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/DraftsSort;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onQueryMembersResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Member;",
            ">;",
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

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onQueryThreadsPrecondition(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/plugin/Plugin;->onQueryThreadsPrecondition$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public onQueryThreadsRequest(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onQueryThreadsResult(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onSendReactionPrecondition(Ljava/lang/String;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/models/Reaction;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/plugin/Plugin;->onSendReactionPrecondition$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Ljava/lang/String;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public onSendReactionRequest(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Reaction;",
            "ZZ",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onSendReactionResult(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Reaction;",
            "Z",
            "Lio/getstream/chat/android/models/User;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onShuffleGiphyResult(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onStartLiveLocationSharingResult(Lio/getstream/chat/android/models/Location;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Location;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onStopLiveLocationSharingResult(Lio/getstream/chat/android/models/Location;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Location;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onTypingEventPrecondition(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)Ln23/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Date;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "eventType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "channelType"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "channelId"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "extraData"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "eventTime"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ln23/g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, p2}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public onTypingEventRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Date;",
            ")V"
        }
    .end annotation

    const-string v0, "eventType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "channelType"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "channelId"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "extraData"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "eventTime"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTypingEventResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Date;",
            ")V"
        }
    .end annotation

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "eventType"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "channelType"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "channelId"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "extraData"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "eventTime"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onUnblockUserResult(Ljava/lang/String;Ln23/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln23/h;",
            ")V"
        }
    .end annotation

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "result"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onUpdateLiveLocationPrecondition(Lio/getstream/chat/android/models/Location;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Location;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/plugin/Plugin;->onUpdateLiveLocationPrecondition$suspendImpl(Lio/getstream/chat/android/client/plugin/Plugin;Lio/getstream/chat/android/models/Location;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public onUpdateLiveLocationResult(Lio/getstream/chat/android/models/Location;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Location;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onUserDisconnected()V
    .locals 0

    return-void
.end method

.method public onUserSet(Lio/getstream/chat/android/models/User;)V
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
