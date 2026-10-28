.class public final Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/Plugin;
.implements Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/GetMessageListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00f2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008$\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001d\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\u00082\u00020\t2\u00020\n2\u00020\u000b2\u00020\u000c2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u00112\u00020\u00122\u00020\u0013B\u00bb\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0008\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\u0006\u0010\u001e\u001a\u00020\n\u0012\u0006\u0010\u001f\u001a\u00020\u000b\u0012\u0006\u0010 \u001a\u00020\u000f\u0012\u0006\u0010!\u001a\u00020\u000c\u0012\u0006\u0010\"\u001a\u00020\r\u0012\u0006\u0010#\u001a\u00020\u000e\u0012\u0006\u0010$\u001a\u00020\u0010\u0012\u0006\u0010%\u001a\u00020\u0011\u0012\u0006\u0010&\u001a\u00020\u0012\u0012\u0006\u0010\'\u001a\u00020\u0013\u0012\u001a\u0008\u0002\u0010+\u001a\u0014\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030)\u0012\u0006\u0012\u0004\u0018\u00010*0(\u00a2\u0006\u0004\u0008,\u0010-J\u0017\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u00080\u00101J\u000f\u00102\u001a\u00020/H\u0016\u00a2\u0006\u0004\u00082\u00103J)\u00106\u001a\u0004\u0018\u00018\u0000\"\u0008\u0008\u0000\u00104*\u00020*2\u000c\u00105\u001a\u0008\u0012\u0004\u0012\u00028\u00000)H\u0017\u00a2\u0006\u0004\u00086\u00107Jh\u0010G\u001a\u00020/2\u0012\u0010;\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020:09082\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020?2\u0006\u0010C\u001a\u00020B2\u000c\u0010E\u001a\u0008\u0012\u0004\u0012\u00020:0D2\u000c\u0010F\u001a\u0008\u0012\u0004\u0012\u00020:09H\u0096A\u00a2\u0006\u0004\u0008G\u0010HJ2\u0010M\u001a\u00020/2\u0008\u0010I\u001a\u0004\u0018\u00010<2\u0006\u0010J\u001a\u00020<2\u0006\u0010K\u001a\u00020<2\u0006\u0010L\u001a\u00020\u0014H\u0096A\u00a2\u0006\u0004\u0008M\u0010NJ@\u0010P\u001a\u00020/2\u0008\u0010I\u001a\u0004\u0018\u00010<2\u0006\u0010J\u001a\u00020<2\u0006\u0010K\u001a\u00020<2\u0006\u0010L\u001a\u00020\u00142\u000c\u0010;\u001a\u0008\u0012\u0004\u0012\u00020O08H\u0096A\u00a2\u0006\u0004\u0008P\u0010QJ \u0010R\u001a\u0008\u0012\u0004\u0012\u00020/082\u0008\u0010L\u001a\u0004\u0018\u00010\u0014H\u0096\u0001\u00a2\u0006\u0004\u0008R\u0010SJ2\u0010V\u001a\u0008\u0012\u0004\u0012\u00020/082\u0008\u0010I\u001a\u0004\u0018\u00010<2\u0008\u0010L\u001a\u0004\u0018\u00010\u00142\u0006\u0010U\u001a\u00020TH\u0096A\u00a2\u0006\u0004\u0008V\u0010WJ:\u0010[\u001a\u00020/2\u0008\u0010I\u001a\u0004\u0018\u00010<2\u0006\u0010U\u001a\u00020T2\u0006\u0010Y\u001a\u00020X2\u0006\u0010Z\u001a\u00020X2\u0006\u0010L\u001a\u00020\u0014H\u0096A\u00a2\u0006\u0004\u0008[\u0010\\J@\u0010]\u001a\u00020/2\u0008\u0010I\u001a\u0004\u0018\u00010<2\u0006\u0010U\u001a\u00020T2\u0006\u0010Y\u001a\u00020X2\u0006\u0010L\u001a\u00020\u00142\u000c\u0010;\u001a\u0008\u0012\u0004\u0012\u00020T08H\u0096A\u00a2\u0006\u0004\u0008]\u0010^J \u0010`\u001a\u00020/2\u0006\u0010_\u001a\u00020<2\u0006\u0010A\u001a\u00020?H\u0096A\u00a2\u0006\u0004\u0008`\u0010aJ4\u0010b\u001a\u00020/2\u0012\u0010;\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020O09082\u0006\u0010_\u001a\u00020<2\u0006\u0010A\u001a\u00020?H\u0096A\u00a2\u0006\u0004\u0008b\u0010cJ*\u0010e\u001a\u00020/2\u0006\u0010_\u001a\u00020<2\u0006\u0010A\u001a\u00020?2\u0008\u0010d\u001a\u0004\u0018\u00010<H\u0096A\u00a2\u0006\u0004\u0008e\u0010fJ(\u0010h\u001a\u00020/2\u0006\u0010_\u001a\u00020<2\u0006\u0010g\u001a\u00020<2\u0006\u0010A\u001a\u00020?H\u0096A\u00a2\u0006\u0004\u0008h\u0010iJ<\u0010j\u001a\u00020/2\u0012\u0010;\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020O09082\u0006\u0010_\u001a\u00020<2\u0006\u0010g\u001a\u00020<2\u0006\u0010A\u001a\u00020?H\u0096A\u00a2\u0006\u0004\u0008j\u0010kJ>\u0010l\u001a\u00020/2\u0012\u0010;\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020O09082\u0006\u0010_\u001a\u00020<2\u0006\u0010A\u001a\u00020?2\u0008\u0010d\u001a\u0004\u0018\u00010<H\u0096A\u00a2\u0006\u0004\u0008l\u0010mJ&\u0010n\u001a\u00020/2\u0006\u0010I\u001a\u00020<2\u000c\u0010;\u001a\u0008\u0012\u0004\u0012\u00020O08H\u0096A\u00a2\u0006\u0004\u0008n\u0010oJ\u001e\u0010p\u001a\u0008\u0012\u0004\u0012\u00020/082\u0006\u0010J\u001a\u00020<H\u0096A\u00a2\u0006\u0004\u0008p\u0010qJ\u0018\u0010r\u001a\u00020/2\u0006\u0010J\u001a\u00020<H\u0096A\u00a2\u0006\u0004\u0008r\u0010qJ&\u0010t\u001a\u00020/2\u0006\u0010s\u001a\u00020<2\u000c\u0010;\u001a\u0008\u0012\u0004\u0012\u00020O08H\u0096A\u00a2\u0006\u0004\u0008t\u0010oJ6\u0010v\u001a\u00020/2\u000c\u0010;\u001a\u0008\u0012\u0004\u0012\u00020O082\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0006\u0010u\u001a\u00020OH\u0096A\u00a2\u0006\u0004\u0008v\u0010wJ\u0018\u0010x\u001a\u00020/2\u0006\u0010u\u001a\u00020OH\u0096A\u00a2\u0006\u0004\u0008x\u0010yJ&\u0010{\u001a\u00020/2\u0006\u0010z\u001a\u00020O2\u000c\u0010;\u001a\u0008\u0012\u0004\u0012\u00020O08H\u0096A\u00a2\u0006\u0004\u0008{\u0010|J/\u0010\u007f\u001a\u0008\u0012\u0004\u0012\u00020/082\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0006\u0010~\u001a\u00020}H\u0096A\u00a2\u0006\u0005\u0008\u007f\u0010\u0080\u0001J+\u0010\u0081\u0001\u001a\u00020/2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0006\u0010~\u001a\u00020}H\u0096A\u00a2\u0006\u0006\u0008\u0081\u0001\u0010\u0080\u0001J:\u0010\u0083\u0001\u001a\u00020/2\r\u0010;\u001a\t\u0012\u0005\u0012\u00030\u0082\u0001082\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0006\u0010~\u001a\u00020}H\u0096A\u00a2\u0006\u0006\u0008\u0083\u0001\u0010\u0084\u0001J2\u0010\u0086\u0001\u001a\u0008\u0012\u0004\u0012\u00020/082\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0007\u0010\u0085\u0001\u001a\u00020XH\u0096A\u00a2\u0006\u0006\u0008\u0086\u0001\u0010\u0087\u0001J,\u0010\u0088\u0001\u001a\u00020/2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0007\u0010\u0085\u0001\u001a\u00020XH\u0096A\u00a2\u0006\u0006\u0008\u0088\u0001\u0010\u0087\u0001J:\u0010\u0089\u0001\u001a\u00020/2\u000c\u0010;\u001a\u0008\u0012\u0004\u0012\u00020/082\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0007\u0010\u0085\u0001\u001a\u00020XH\u0096A\u00a2\u0006\u0006\u0008\u0089\u0001\u0010\u008a\u0001J5\u0010\u008d\u0001\u001a\u00020/2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0008\u0010\u008c\u0001\u001a\u00030\u008b\u00012\u0006\u0010L\u001a\u00020\u0014H\u0096A\u00a2\u0006\u0006\u0008\u008d\u0001\u0010\u008e\u0001JA\u0010\u0090\u0001\u001a\u00020/2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\r\u0010\u008f\u0001\u001a\u0008\u0012\u0004\u0012\u00020<092\r\u0010;\u001a\t\u0012\u0005\u0012\u00030\u0082\u000108H\u0096A\u00a2\u0006\u0006\u0008\u0090\u0001\u0010\u0091\u0001J:\u0010\u0092\u0001\u001a\u0008\u0012\u0004\u0012\u00020/082\u0008\u0010L\u001a\u0004\u0018\u00010\u00142\u0006\u0010>\u001a\u00020<2\r\u0010\u008f\u0001\u001a\u0008\u0012\u0004\u0012\u00020<09H\u0096\u0001\u00a2\u0006\u0006\u0008\u0092\u0001\u0010\u0093\u0001J-\u0010\u0094\u0001\u001a\u00020/2\u0008\u0010L\u001a\u0004\u0018\u00010\u00142\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<H\u0096A\u00a2\u0006\u0006\u0008\u0094\u0001\u0010\u0095\u0001J2\u0010\u0096\u0001\u001a\u00020/2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\r\u0010;\u001a\t\u0012\u0005\u0012\u00030\u0082\u000108H\u0096A\u00a2\u0006\u0006\u0008\u0096\u0001\u0010\u0097\u0001J3\u0010\u0098\u0001\u001a\u0008\u0012\u0004\u0012\u00020/082\u0008\u0010L\u001a\u0004\u0018\u00010\u00142\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<H\u0096A\u00a2\u0006\u0006\u0008\u0098\u0001\u0010\u0095\u0001J+\u0010\u0099\u0001\u001a\u00020/2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0006\u0010u\u001a\u00020OH\u0096A\u00a2\u0006\u0006\u0008\u0099\u0001\u0010\u009a\u0001J(\u0010\u009b\u0001\u001a\u00020/2\u0006\u0010J\u001a\u00020<2\u000c\u0010;\u001a\u0008\u0012\u0004\u0012\u00020O08H\u0096A\u00a2\u0006\u0005\u0008\u009b\u0001\u0010oJ!\u0010\u009c\u0001\u001a\u00020/2\u000c\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\u001408H\u0096A\u00a2\u0006\u0006\u0008\u009c\u0001\u0010\u009d\u0001J\"\u0010\u009f\u0001\u001a\u0008\u0012\u0004\u0012\u00020/082\u0007\u0010~\u001a\u00030\u009e\u0001H\u0096A\u00a2\u0006\u0006\u0008\u009f\u0001\u0010\u00a0\u0001J\u001c\u0010\u00a1\u0001\u001a\u00020/2\u0007\u0010~\u001a\u00030\u009e\u0001H\u0096A\u00a2\u0006\u0006\u0008\u00a1\u0001\u0010\u00a0\u0001J+\u0010\u00a3\u0001\u001a\u00020/2\r\u0010;\u001a\t\u0012\u0005\u0012\u00030\u00a2\u0001082\u0007\u0010~\u001a\u00030\u009e\u0001H\u0096A\u00a2\u0006\u0006\u0008\u00a3\u0001\u0010\u00a4\u0001J;\u0010\u00a6\u0001\u001a\u00020/2\r\u0010;\u001a\t\u0012\u0005\u0012\u00030\u00a5\u0001082\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0007\u0010u\u001a\u00030\u00a5\u0001H\u0096A\u00a2\u0006\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001J:\u0010\u00a8\u0001\u001a\u00020/2\u000c\u0010;\u001a\u0008\u0012\u0004\u0012\u00020/082\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0007\u0010u\u001a\u00030\u00a5\u0001H\u0096A\u00a2\u0006\u0006\u0008\u00a8\u0001\u0010\u00a7\u0001JL\u0010\u00ac\u0001\u001a\u00020/2\r\u0010;\u001a\t\u0012\u0005\u0012\u00030\u00a9\u0001082\u0006\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020?2\t\u0010\u00aa\u0001\u001a\u0004\u0018\u00010<2\r\u0010E\u001a\t\u0012\u0005\u0012\u00030\u00ab\u00010DH\u0096A\u00a2\u0006\u0006\u0008\u00ac\u0001\u0010\u00ad\u0001J \u0010\u00ae\u0001\u001a\u0008\u0012\u0004\u0012\u00020/082\u0006\u0010_\u001a\u00020<H\u0096A\u00a2\u0006\u0005\u0008\u00ae\u0001\u0010qJ \u0010\u00af\u0001\u001a\u0008\u0012\u0004\u0012\u00020/082\u0006\u0010J\u001a\u00020<H\u0096A\u00a2\u0006\u0005\u0008\u00af\u0001\u0010qJ\u001a\u0010\u00b0\u0001\u001a\u00020/2\u0006\u0010J\u001a\u00020<H\u0096A\u00a2\u0006\u0005\u0008\u00b0\u0001\u0010qJ(\u0010\u00b1\u0001\u001a\u00020/2\u0006\u0010J\u001a\u00020<2\u000c\u0010;\u001a\u0008\u0012\u0004\u0012\u00020O08H\u0096A\u00a2\u0006\u0005\u0008\u00b1\u0001\u0010oR\u001d\u0010\u0015\u001a\u00020\u00148\u0000X\u0080\u0004\u00a2\u0006\u000f\n\u0005\u0008\u0015\u0010\u00b2\u0001\u001a\u0006\u0008\u00b3\u0001\u0010\u00b4\u0001R\u0015\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0016\u0010\u00b5\u0001R\u0015\u0010\u0017\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0017\u0010\u00b6\u0001R\u0015\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0018\u0010\u00b7\u0001R\u0015\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0019\u0010\u00b8\u0001R\u0015\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u001a\u0010\u00b9\u0001R\u0015\u0010\u001b\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u001b\u0010\u00ba\u0001R\u0015\u0010\u001c\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u001c\u0010\u00bb\u0001R\u0015\u0010\u001d\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u001d\u0010\u00bc\u0001R\u0015\u0010\u001e\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u001e\u0010\u00bd\u0001R\u0015\u0010\u001f\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u001f\u0010\u00be\u0001R\u0015\u0010 \u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008 \u0010\u00bf\u0001R\u0015\u0010!\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008!\u0010\u00c0\u0001R\u0015\u0010\"\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\"\u0010\u00c1\u0001R\u0015\u0010#\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008#\u0010\u00c2\u0001R\u0015\u0010$\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008$\u0010\u00c3\u0001R\u0015\u0010%\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008%\u0010\u00c4\u0001R\u0015\u0010&\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008&\u0010\u00c5\u0001R\u0015\u0010\'\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\'\u0010\u00c6\u0001R\'\u0010+\u001a\u0014\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030)\u0012\u0006\u0012\u0004\u0018\u00010*0(8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008+\u0010\u00c7\u0001\u00a8\u0006\u00c8\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;",
        "Lio/getstream/chat/android/client/plugin/Plugin;",
        "Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/GetMessageListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;",
        "Lio/getstream/chat/android/models/User;",
        "activeUser",
        "queryChannelListener",
        "threadQueryListener",
        "editMessageListener",
        "hideChannelListener",
        "deleteReactionListener",
        "sendReactionListener",
        "deleteMessageListener",
        "deleteMessageForMeListener",
        "shuffleGiphyListener",
        "sendMessageListener",
        "sendAttachmentListener",
        "queryMembersListener",
        "createChannelListener",
        "deleteChannelListener",
        "getMessageListener",
        "fetchCurrentUserListener",
        "queryThreadsListener",
        "draftMessageListener",
        "Lkotlin/Function1;",
        "Lj93/d;",
        "",
        "provideDependency",
        "<init>",
        "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;Lio/getstream/chat/android/client/plugin/listeners/GetMessageListener;Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;Lkotlin/jvm/functions/Function1;)V",
        "user",
        "Ll83/a0;",
        "onUserSet",
        "(Lio/getstream/chat/android/models/User;)V",
        "onUserDisconnected",
        "()V",
        "T",
        "klass",
        "resolveDependency",
        "(Lj93/d;)Ljava/lang/Object;",
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
        "onQueryMembersResult",
        "(Ln23/h;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "cid",
        "messageId",
        "reactionType",
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
        "clearHistory",
        "onHideChannelPrecondition",
        "(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "onHideChannelRequest",
        "onHideChannelResult",
        "(Ln23/h;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
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
        "Lio/getstream/chat/android/models/DraftMessage;",
        "onCreateDraftMessageResult",
        "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;",
        "onDeleteDraftMessagesResult",
        "Lio/getstream/chat/android/models/QueryDraftsResult;",
        "next",
        "Lio/getstream/chat/android/models/DraftsSort;",
        "onQueryDraftMessagesResult",
        "(Ln23/h;Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;",
        "onGetRepliesPrecondition",
        "onDeleteMessageForMePrecondition",
        "onDeleteMessageForMeRequest",
        "onDeleteMessageForMeResult",
        "Lio/getstream/chat/android/models/User;",
        "getActiveUser$stream_chat_android_client_release",
        "()Lio/getstream/chat/android/models/User;",
        "Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/GetMessageListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;",
        "Lkotlin/jvm/functions/Function1;",
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
.field private final activeUser:Lio/getstream/chat/android/models/User;

.field private final createChannelListener:Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;

.field private final deleteChannelListener:Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;

.field private final deleteMessageForMeListener:Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;

.field private final deleteMessageListener:Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;

.field private final deleteReactionListener:Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;

.field private final draftMessageListener:Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;

.field private final editMessageListener:Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;

.field private final fetchCurrentUserListener:Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;

.field private final getMessageListener:Lio/getstream/chat/android/client/plugin/listeners/GetMessageListener;

.field private final hideChannelListener:Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;

.field private final provideDependency:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final queryChannelListener:Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;

.field private final queryMembersListener:Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;

.field private final queryThreadsListener:Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;

.field private final sendAttachmentListener:Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;

.field private final sendMessageListener:Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;

.field private final sendReactionListener:Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;

.field private final shuffleGiphyListener:Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;

.field private final threadQueryListener:Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;Lio/getstream/chat/android/client/plugin/listeners/GetMessageListener;Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;Lkotlin/jvm/functions/Function1;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;",
            "Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;",
            "Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;",
            "Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;",
            "Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;",
            "Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;",
            "Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;",
            "Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;",
            "Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;",
            "Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;",
            "Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;",
            "Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;",
            "Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;",
            "Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;",
            "Lio/getstream/chat/android/client/plugin/listeners/GetMessageListener;",
            "Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;",
            "Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;",
            "Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;",
            "Lkotlin/jvm/functions/Function1;",
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

    const-string v0, "activeUser"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queryChannelListener"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadQueryListener"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editMessageListener"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hideChannelListener"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deleteReactionListener"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sendReactionListener"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deleteMessageListener"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deleteMessageForMeListener"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shuffleGiphyListener"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sendMessageListener"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sendAttachmentListener"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queryMembersListener"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createChannelListener"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deleteChannelListener"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getMessageListener"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fetchCurrentUserListener"

    move-object/from16 v15, p17

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queryThreadsListener"

    move-object/from16 v15, p18

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "draftMessageListener"

    move-object/from16 v15, p19

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "provideDependency"

    move-object/from16 v15, p20

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    .line 2
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->activeUser:Lio/getstream/chat/android/models/User;

    .line 3
    iput-object v2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->queryChannelListener:Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;

    .line 4
    iput-object v3, v0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->threadQueryListener:Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;

    .line 5
    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->editMessageListener:Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;

    .line 6
    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->hideChannelListener:Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;

    .line 7
    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->deleteReactionListener:Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;

    .line 8
    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->sendReactionListener:Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;

    .line 9
    iput-object v8, v0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->deleteMessageListener:Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;

    .line 10
    iput-object v9, v0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->deleteMessageForMeListener:Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;

    .line 11
    iput-object v10, v0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->shuffleGiphyListener:Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;

    .line 12
    iput-object v11, v0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->sendMessageListener:Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;

    .line 13
    iput-object v12, v0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->sendAttachmentListener:Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;

    .line 14
    iput-object v13, v0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->queryMembersListener:Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;

    .line 15
    iput-object v14, v0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->createChannelListener:Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;

    move-object/from16 v1, p15

    .line 16
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->deleteChannelListener:Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;

    move-object/from16 v1, p16

    .line 17
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->getMessageListener:Lio/getstream/chat/android/client/plugin/listeners/GetMessageListener;

    move-object/from16 v1, p17

    .line 18
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->fetchCurrentUserListener:Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;

    move-object/from16 v1, p18

    .line 19
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->queryThreadsListener:Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;

    move-object/from16 v1, p19

    .line 20
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->draftMessageListener:Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;

    .line 21
    iput-object v15, v0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->provideDependency:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;Lio/getstream/chat/android/client/plugin/listeners/GetMessageListener;Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 22

    const/high16 v0, 0x80000

    and-int v0, p21, v0

    if-eqz v0, :cond_0

    .line 22
    sget-object v0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin$1;->INSTANCE:Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin$1;

    move-object/from16 v21, v0

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

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

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    goto :goto_1

    :cond_0
    move-object/from16 v21, p20

    goto :goto_0

    .line 23
    :goto_1
    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;-><init>(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;Lio/getstream/chat/android/client/plugin/listeners/GetMessageListener;Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public final getActiveUser$stream_chat_android_client_release()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->activeUser:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final onAttachmentSendRequest(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->sendAttachmentListener:Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;->onAttachmentSendRequest(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateChannelPrecondition(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/List;)Ln23/h;
    .locals 1
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

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberIds"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->createChannelListener:Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;->onCreateChannelPrecondition(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/List;)Ln23/h;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateChannelRequest(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/query/CreateChannelParams;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 6
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->createChannelListener:Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;->onCreateChannelRequest(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/query/CreateChannelParams;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateChannelResult(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 6
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->createChannelListener:Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;->onCreateChannelResult(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ln23/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateDraftMessageResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;
    .locals 6
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->draftMessageListener:Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;->onCreateDraftMessageResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onDeleteChannelPrecondition(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->deleteChannelListener:Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;->onDeleteChannelPrecondition(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onDeleteChannelRequest(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->deleteChannelListener:Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;->onDeleteChannelRequest(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onDeleteChannelResult(Ljava/lang/String;Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->deleteChannelListener:Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;->onDeleteChannelResult(Ljava/lang/String;Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onDeleteDraftMessagesResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;
    .locals 6
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->draftMessageListener:Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;->onDeleteDraftMessagesResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onDeleteMessageForMePrecondition(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->deleteMessageForMeListener:Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;->onDeleteMessageForMePrecondition(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onDeleteMessageForMeRequest(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->deleteMessageForMeListener:Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;->onDeleteMessageForMeRequest(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onDeleteMessageForMeResult(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->deleteMessageForMeListener:Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;->onDeleteMessageForMeResult(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onDeleteReactionPrecondition(Lio/getstream/chat/android/models/User;)Ln23/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->deleteReactionListener:Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;->onDeleteReactionPrecondition(Lio/getstream/chat/android/models/User;)Ln23/h;

    move-result-object p1

    return-object p1
.end method

.method public final onDeleteReactionRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 6
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->deleteReactionListener:Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;->onDeleteReactionRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onDeleteReactionResult(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 7
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->deleteReactionListener:Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;->onDeleteReactionResult(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onFetchCurrentUserResult(Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->fetchCurrentUserListener:Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;->onFetchCurrentUserResult(Ln23/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onGetMessageResult(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->getMessageListener:Lio/getstream/chat/android/client/plugin/listeners/GetMessageListener;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/plugin/listeners/GetMessageListener;->onGetMessageResult(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onGetNewerRepliesRequest(Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->threadQueryListener:Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;->onGetNewerRepliesRequest(Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onGetNewerRepliesResult(Ln23/h;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 6
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->threadQueryListener:Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;->onGetNewerRepliesResult(Ln23/h;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onGetRepliesMoreRequest(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->threadQueryListener:Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;->onGetRepliesMoreRequest(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onGetRepliesMoreResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 6
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->threadQueryListener:Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;->onGetRepliesMoreResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onGetRepliesPrecondition(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->threadQueryListener:Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;->onGetRepliesPrecondition(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onGetRepliesRequest(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->threadQueryListener:Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;->onGetRepliesRequest(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onGetRepliesResult(Ln23/h;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->threadQueryListener:Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;->onGetRepliesResult(Ln23/h;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onHideChannelPrecondition(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->hideChannelListener:Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;->onHideChannelPrecondition(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onHideChannelRequest(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->hideChannelListener:Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;->onHideChannelRequest(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onHideChannelResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 6
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->hideChannelListener:Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;->onHideChannelResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onMessageDeletePrecondition(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->deleteMessageListener:Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;->onMessageDeletePrecondition(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onMessageDeleteRequest(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->deleteMessageListener:Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;->onMessageDeleteRequest(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onMessageDeleteResult(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->deleteMessageListener:Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;->onMessageDeleteResult(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onMessageEditRequest(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->editMessageListener:Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;->onMessageEditRequest(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onMessageEditResult(Lio/getstream/chat/android/models/Message;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->editMessageListener:Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;->onMessageEditResult(Lio/getstream/chat/android/models/Message;Ln23/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onMessageSendResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 6
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->sendMessageListener:Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;->onMessageSendResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onQueryChannelPrecondition(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->queryChannelListener:Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;->onQueryChannelPrecondition(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onQueryChannelRequest(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->queryChannelListener:Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;->onQueryChannelRequest(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onQueryChannelResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 6
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->queryChannelListener:Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;->onQueryChannelResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onQueryDraftMessagesResult(Ln23/h;Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;
    .locals 7
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->draftMessageListener:Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;->onQueryDraftMessagesResult(Ln23/h;Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onQueryMembersResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 10
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->queryMembersListener:Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    invoke-interface/range {v0 .. v9}, Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;->onQueryMembersResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onQueryThreadsPrecondition(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->queryThreadsListener:Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;->onQueryThreadsPrecondition(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onQueryThreadsRequest(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->queryThreadsListener:Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;->onQueryThreadsRequest(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onQueryThreadsResult(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->queryThreadsListener:Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;->onQueryThreadsResult(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onSendReactionPrecondition(Ljava/lang/String;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->sendReactionListener:Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;->onSendReactionPrecondition(Ljava/lang/String;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onSendReactionRequest(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 7
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->sendReactionListener:Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;->onSendReactionRequest(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onSendReactionResult(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 7
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->sendReactionListener:Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;->onSendReactionResult(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onShuffleGiphyResult(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->shuffleGiphyListener:Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;->onShuffleGiphyResult(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onUserDisconnected()V
    .locals 0

    return-void
.end method

.method public final onUserSet(Lio/getstream/chat/android/models/User;)V
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final resolveDependency(Lj93/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj93/d;",
            ")TT;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "klass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;->provideDependency:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    return-object p1
.end method
