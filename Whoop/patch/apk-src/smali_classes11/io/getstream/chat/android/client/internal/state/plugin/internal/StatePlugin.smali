.class public final Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/Plugin;
.implements Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/QueryChannelsListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/ChannelMarkReadListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/MarkAllReadListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/SendGiphyListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/TypingEventListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/BlockUserListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/UnblockUserListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/LiveLocationListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/QueryBlockedUsersListener;
.implements Lio/getstream/chat/android/client/plugin/listeners/PushPreferencesListener;


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008)\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\u00082\u00020\t2\u00020\n2\u00020\u000b2\u00020\u000c2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u00112\u00020\u00122\u00020\u00132\u00020\u00142\u00020\u00152\u00020\u00162\u00020\u00172\u00020\u00182\u00020\u00192\u00020\u001a2\u00020\u001bB_\u0008\u0000\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020-0,\u0012\u0006\u00100\u001a\u00020/\u00a2\u0006\u0004\u00081\u00102J\u000f\u00104\u001a\u000203H\u0016\u00a2\u0006\u0004\u00084\u00105J\u0017\u00109\u001a\u0002082\u0006\u00107\u001a\u000206H\u0016\u00a2\u0006\u0004\u00089\u0010:J\u000f\u0010;\u001a\u000208H\u0016\u00a2\u0006\u0004\u0008;\u0010<J)\u0010A\u001a\u0004\u0018\u00018\u0000\"\u0008\u0008\u0000\u0010>*\u00020=2\u000c\u0010@\u001a\u0008\u0012\u0004\u0012\u00028\u00000?H\u0017\u00a2\u0006\u0004\u0008A\u0010BJh\u0010R\u001a\u0002082\u0012\u0010F\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020E0D0C2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020J2\u0006\u0010N\u001a\u00020M2\u000c\u0010P\u001a\u0008\u0012\u0004\u0012\u00020E0O2\u000c\u0010Q\u001a\u0008\u0012\u0004\u0012\u00020E0DH\u0096A\u00a2\u0006\u0004\u0008R\u0010SJ2\u0010X\u001a\u0002082\u0008\u0010T\u001a\u0004\u0018\u00010G2\u0006\u0010U\u001a\u00020G2\u0006\u0010V\u001a\u00020G2\u0006\u0010W\u001a\u000206H\u0096A\u00a2\u0006\u0004\u0008X\u0010YJ@\u0010[\u001a\u0002082\u0008\u0010T\u001a\u0004\u0018\u00010G2\u0006\u0010U\u001a\u00020G2\u0006\u0010V\u001a\u00020G2\u0006\u0010W\u001a\u0002062\u000c\u0010F\u001a\u0008\u0012\u0004\u0012\u00020Z0CH\u0096A\u00a2\u0006\u0004\u0008[\u0010\\J \u0010]\u001a\u0008\u0012\u0004\u0012\u0002080C2\u0008\u0010W\u001a\u0004\u0018\u000106H\u0096\u0001\u00a2\u0006\u0004\u0008]\u0010^J2\u0010a\u001a\u0008\u0012\u0004\u0012\u0002080C2\u0008\u0010T\u001a\u0004\u0018\u00010G2\u0008\u0010W\u001a\u0004\u0018\u0001062\u0006\u0010`\u001a\u00020_H\u0096A\u00a2\u0006\u0004\u0008a\u0010bJ:\u0010e\u001a\u0002082\u0008\u0010T\u001a\u0004\u0018\u00010G2\u0006\u0010`\u001a\u00020_2\u0006\u0010c\u001a\u00020-2\u0006\u0010d\u001a\u00020-2\u0006\u0010W\u001a\u000206H\u0096A\u00a2\u0006\u0004\u0008e\u0010fJ@\u0010g\u001a\u0002082\u0008\u0010T\u001a\u0004\u0018\u00010G2\u0006\u0010`\u001a\u00020_2\u0006\u0010c\u001a\u00020-2\u0006\u0010W\u001a\u0002062\u000c\u0010F\u001a\u0008\u0012\u0004\u0012\u00020_0CH\u0096A\u00a2\u0006\u0004\u0008g\u0010hJ \u0010j\u001a\u0002082\u0006\u0010i\u001a\u00020G2\u0006\u0010L\u001a\u00020JH\u0096A\u00a2\u0006\u0004\u0008j\u0010kJ4\u0010l\u001a\u0002082\u0012\u0010F\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Z0D0C2\u0006\u0010i\u001a\u00020G2\u0006\u0010L\u001a\u00020JH\u0096A\u00a2\u0006\u0004\u0008l\u0010mJ*\u0010o\u001a\u0002082\u0006\u0010i\u001a\u00020G2\u0006\u0010L\u001a\u00020J2\u0008\u0010n\u001a\u0004\u0018\u00010GH\u0096A\u00a2\u0006\u0004\u0008o\u0010pJ(\u0010r\u001a\u0002082\u0006\u0010i\u001a\u00020G2\u0006\u0010q\u001a\u00020G2\u0006\u0010L\u001a\u00020JH\u0096A\u00a2\u0006\u0004\u0008r\u0010sJ<\u0010t\u001a\u0002082\u0012\u0010F\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Z0D0C2\u0006\u0010i\u001a\u00020G2\u0006\u0010q\u001a\u00020G2\u0006\u0010L\u001a\u00020JH\u0096A\u00a2\u0006\u0004\u0008t\u0010uJ>\u0010v\u001a\u0002082\u0012\u0010F\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Z0D0C2\u0006\u0010i\u001a\u00020G2\u0006\u0010L\u001a\u00020J2\u0008\u0010n\u001a\u0004\u0018\u00010GH\u0096A\u00a2\u0006\u0004\u0008v\u0010wJ&\u0010x\u001a\u0002082\u0006\u0010T\u001a\u00020G2\u000c\u0010F\u001a\u0008\u0012\u0004\u0012\u00020Z0CH\u0096\u0001\u00a2\u0006\u0004\u0008x\u0010yJ&\u0010z\u001a\u0002082\u0006\u0010T\u001a\u00020G2\u000c\u0010F\u001a\u0008\u0012\u0004\u0012\u00020Z0CH\u0096A\u00a2\u0006\u0004\u0008z\u0010{J\u001e\u0010|\u001a\u0008\u0012\u0004\u0012\u0002080C2\u0006\u0010U\u001a\u00020GH\u0096A\u00a2\u0006\u0004\u0008|\u0010}J\u0018\u0010~\u001a\u0002082\u0006\u0010U\u001a\u00020GH\u0096A\u00a2\u0006\u0004\u0008~\u0010}J(\u0010\u0080\u0001\u001a\u0002082\u0006\u0010\u007f\u001a\u00020G2\u000c\u0010F\u001a\u0008\u0012\u0004\u0012\u00020Z0CH\u0096A\u00a2\u0006\u0005\u0008\u0080\u0001\u0010{J:\u0010\u0082\u0001\u001a\u0002082\u000c\u0010F\u001a\u0008\u0012\u0004\u0012\u00020Z0C2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0007\u0010\u0081\u0001\u001a\u00020ZH\u0096A\u00a2\u0006\u0006\u0008\u0082\u0001\u0010\u0083\u0001J\u001c\u0010\u0084\u0001\u001a\u0002082\u0007\u0010\u0081\u0001\u001a\u00020ZH\u0096A\u00a2\u0006\u0006\u0008\u0084\u0001\u0010\u0085\u0001J*\u0010\u0087\u0001\u001a\u0002082\u0007\u0010\u0086\u0001\u001a\u00020Z2\u000c\u0010F\u001a\u0008\u0012\u0004\u0012\u00020Z0CH\u0096A\u00a2\u0006\u0006\u0008\u0087\u0001\u0010\u0088\u0001J3\u0010\u008b\u0001\u001a\u0008\u0012\u0004\u0012\u0002080C2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0008\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0096A\u00a2\u0006\u0006\u0008\u008b\u0001\u0010\u008c\u0001J-\u0010\u008d\u0001\u001a\u0002082\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0008\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0096A\u00a2\u0006\u0006\u0008\u008d\u0001\u0010\u008c\u0001J<\u0010\u008f\u0001\u001a\u0002082\r\u0010F\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010C2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0008\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0096A\u00a2\u0006\u0006\u0008\u008f\u0001\u0010\u0090\u0001JR\u0010\u0096\u0001\u001a\u0008\u0012\u0004\u0012\u0002080C2\u0007\u0010\u0091\u0001\u001a\u00020G2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0014\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020=0\u0092\u00012\u0008\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0096\u0001\u00a2\u0006\u0006\u0008\u0096\u0001\u0010\u0097\u0001JL\u0010\u0098\u0001\u001a\u0002082\u0007\u0010\u0091\u0001\u001a\u00020G2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0014\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020=0\u0092\u00012\u0008\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0096\u0001\u00a2\u0006\u0006\u0008\u0098\u0001\u0010\u0099\u0001J[\u0010\u009b\u0001\u001a\u0002082\r\u0010F\u001a\t\u0012\u0005\u0012\u00030\u009a\u00010C2\u0007\u0010\u0091\u0001\u001a\u00020G2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0014\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020=0\u0092\u00012\u0008\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0096\u0001\u00a2\u0006\u0006\u0008\u009b\u0001\u0010\u009c\u0001J2\u0010\u009e\u0001\u001a\u0008\u0012\u0004\u0012\u0002080C2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0007\u0010\u009d\u0001\u001a\u00020-H\u0096A\u00a2\u0006\u0006\u0008\u009e\u0001\u0010\u009f\u0001J,\u0010\u00a0\u0001\u001a\u0002082\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0007\u0010\u009d\u0001\u001a\u00020-H\u0096A\u00a2\u0006\u0006\u0008\u00a0\u0001\u0010\u009f\u0001J:\u0010\u00a1\u0001\u001a\u0002082\u000c\u0010F\u001a\u0008\u0012\u0004\u0012\u0002080C2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0007\u0010\u009d\u0001\u001a\u00020-H\u0096A\u00a2\u0006\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001J\u0013\u0010\u00a3\u0001\u001a\u000208H\u0096A\u00a2\u0006\u0006\u0008\u00a3\u0001\u0010\u00a4\u0001J)\u0010\u00a5\u0001\u001a\u0008\u0012\u0004\u0012\u0002080C2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020GH\u0096A\u00a2\u0006\u0006\u0008\u00a5\u0001\u0010\u00a6\u0001J-\u0010\u00a7\u0001\u001a\u0002082\u0008\u0010W\u001a\u0004\u0018\u0001062\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020GH\u0096A\u00a2\u0006\u0006\u0008\u00a7\u0001\u0010\u00a8\u0001J2\u0010\u00a9\u0001\u001a\u0002082\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\r\u0010F\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010CH\u0096A\u00a2\u0006\u0006\u0008\u00a9\u0001\u0010\u00aa\u0001J3\u0010\u00ab\u0001\u001a\u0008\u0012\u0004\u0012\u0002080C2\u0008\u0010W\u001a\u0004\u0018\u0001062\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020GH\u0096A\u00a2\u0006\u0006\u0008\u00ab\u0001\u0010\u00a8\u0001J,\u0010\u00ac\u0001\u001a\u0002082\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0007\u0010\u0081\u0001\u001a\u00020ZH\u0096A\u00a2\u0006\u0006\u0008\u00ac\u0001\u0010\u00ad\u0001J!\u0010\u00ae\u0001\u001a\u0002082\u000c\u0010F\u001a\u0008\u0012\u0004\u0012\u0002060CH\u0096A\u00a2\u0006\u0006\u0008\u00ae\u0001\u0010\u00af\u0001J#\u0010\u00b1\u0001\u001a\u0008\u0012\u0004\u0012\u0002080C2\u0008\u0010\u008a\u0001\u001a\u00030\u00b0\u0001H\u0096A\u00a2\u0006\u0006\u0008\u00b1\u0001\u0010\u00b2\u0001J\u001d\u0010\u00b3\u0001\u001a\u0002082\u0008\u0010\u008a\u0001\u001a\u00030\u00b0\u0001H\u0096A\u00a2\u0006\u0006\u0008\u00b3\u0001\u0010\u00b2\u0001J,\u0010\u00b5\u0001\u001a\u0002082\r\u0010F\u001a\t\u0012\u0005\u0012\u00030\u00b4\u00010C2\u0008\u0010\u008a\u0001\u001a\u00030\u00b0\u0001H\u0096A\u00a2\u0006\u0006\u0008\u00b5\u0001\u0010\u00b6\u0001J\"\u0010\u00b8\u0001\u001a\u0002082\r\u0010F\u001a\t\u0012\u0005\u0012\u00030\u00b7\u00010CH\u0096\u0001\u00a2\u0006\u0006\u0008\u00b8\u0001\u0010\u00b9\u0001J)\u0010\u00bb\u0001\u001a\u0002082\u0007\u0010\u00ba\u0001\u001a\u00020G2\u000c\u0010F\u001a\u0008\u0012\u0004\u0012\u0002080CH\u0096\u0001\u00a2\u0006\u0005\u0008\u00bb\u0001\u0010yJ(\u0010\u00bc\u0001\u001a\u0002082\u0013\u0010F\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00b7\u00010D0CH\u0096\u0001\u00a2\u0006\u0006\u0008\u00bc\u0001\u0010\u00b9\u0001J<\u0010\u00be\u0001\u001a\u0002082\r\u0010F\u001a\t\u0012\u0005\u0012\u00030\u00bd\u00010C2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0008\u0010\u0081\u0001\u001a\u00030\u00bd\u0001H\u0096A\u00a2\u0006\u0006\u0008\u00be\u0001\u0010\u00bf\u0001J;\u0010\u00c0\u0001\u001a\u0002082\u000c\u0010F\u001a\u0008\u0012\u0004\u0012\u0002080C2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0008\u0010\u0081\u0001\u001a\u00030\u00bd\u0001H\u0096A\u00a2\u0006\u0006\u0008\u00c0\u0001\u0010\u00bf\u0001JL\u0010\u00c4\u0001\u001a\u0002082\r\u0010F\u001a\t\u0012\u0005\u0012\u00030\u00c1\u00010C2\u0006\u0010N\u001a\u00020M2\u0006\u0010L\u001a\u00020J2\t\u0010\u00c2\u0001\u001a\u0004\u0018\u00010G2\r\u0010P\u001a\t\u0012\u0005\u0012\u00030\u00c3\u00010OH\u0096A\u00a2\u0006\u0006\u0008\u00c4\u0001\u0010\u00c5\u0001J#\u0010\u00c8\u0001\u001a\u0008\u0012\u0004\u0012\u0002080C2\u0008\u0010\u00c7\u0001\u001a\u00030\u00c6\u0001H\u0096A\u00a2\u0006\u0006\u0008\u00c8\u0001\u0010\u00c9\u0001J(\u0010\u00ca\u0001\u001a\u0002082\u0013\u0010F\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00c6\u00010D0CH\u0096A\u00a2\u0006\u0006\u0008\u00ca\u0001\u0010\u00af\u0001J,\u0010\u00cb\u0001\u001a\u0002082\u0008\u0010\u00c7\u0001\u001a\u00030\u00c6\u00012\r\u0010F\u001a\t\u0012\u0005\u0012\u00030\u00c6\u00010CH\u0096A\u00a2\u0006\u0006\u0008\u00cb\u0001\u0010\u00cc\u0001J,\u0010\u00cd\u0001\u001a\u0002082\u0008\u0010\u00c7\u0001\u001a\u00030\u00c6\u00012\r\u0010F\u001a\t\u0012\u0005\u0012\u00030\u00c6\u00010CH\u0096A\u00a2\u0006\u0006\u0008\u00cd\u0001\u0010\u00cc\u0001J,\u0010\u00ce\u0001\u001a\u0002082\u0008\u0010\u00c7\u0001\u001a\u00030\u00c6\u00012\r\u0010F\u001a\t\u0012\u0005\u0012\u00030\u00c6\u00010CH\u0096A\u00a2\u0006\u0006\u0008\u00ce\u0001\u0010\u00cc\u0001J4\u0010\u00d2\u0001\u001a\u0002082\u0006\u0010T\u001a\u00020G2\u0008\u0010\u00d0\u0001\u001a\u00030\u00cf\u00012\r\u0010F\u001a\t\u0012\u0005\u0012\u00030\u00d1\u00010CH\u0096A\u00a2\u0006\u0006\u0008\u00d2\u0001\u0010\u00d3\u0001J4\u0010\u00d5\u0001\u001a\u0002082\u0006\u0010T\u001a\u00020G2\u0008\u0010\u00d4\u0001\u001a\u00030\u0094\u00012\r\u0010F\u001a\t\u0012\u0005\u0012\u00030\u00d1\u00010CH\u0096A\u00a2\u0006\u0006\u0008\u00d5\u0001\u0010\u00d6\u0001J \u0010\u00d7\u0001\u001a\u0008\u0012\u0004\u0012\u0002080C2\u0006\u0010i\u001a\u00020GH\u0096A\u00a2\u0006\u0005\u0008\u00d7\u0001\u0010}J#\u0010\u00d9\u0001\u001a\u0008\u0012\u0004\u0012\u0002080C2\u0008\u0010\u008a\u0001\u001a\u00030\u00d8\u0001H\u0096A\u00a2\u0006\u0006\u0008\u00d9\u0001\u0010\u00da\u0001J\u001d\u0010\u00db\u0001\u001a\u0002082\u0008\u0010\u008a\u0001\u001a\u00030\u00d8\u0001H\u0096A\u00a2\u0006\u0006\u0008\u00db\u0001\u0010\u00da\u0001J,\u0010\u00dd\u0001\u001a\u0002082\r\u0010F\u001a\t\u0012\u0005\u0012\u00030\u00dc\u00010C2\u0008\u0010\u008a\u0001\u001a\u00030\u00d8\u0001H\u0096A\u00a2\u0006\u0006\u0008\u00dd\u0001\u0010\u00de\u0001J \u0010\u00df\u0001\u001a\u0008\u0012\u0004\u0012\u0002080C2\u0006\u0010U\u001a\u00020GH\u0096A\u00a2\u0006\u0005\u0008\u00df\u0001\u0010}J\u001a\u0010\u00e0\u0001\u001a\u0002082\u0006\u0010U\u001a\u00020GH\u0096A\u00a2\u0006\u0005\u0008\u00e0\u0001\u0010}J(\u0010\u00e1\u0001\u001a\u0002082\u0006\u0010U\u001a\u00020G2\u000c\u0010F\u001a\u0008\u0012\u0004\u0012\u00020Z0CH\u0096A\u00a2\u0006\u0005\u0008\u00e1\u0001\u0010{R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u001d\u0010\u00e2\u0001R\u0015\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u001f\u0010\u00e3\u0001R\u0015\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008!\u0010\u00e4\u0001R\u0015\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008#\u0010\u00e5\u0001R\u0015\u0010%\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008%\u0010\u00e6\u0001R\u0015\u0010\'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\'\u0010\u00e7\u0001R\u0015\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008)\u0010\u00e8\u0001R\u0015\u0010+\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008+\u0010\u00e9\u0001R\u001b\u0010.\u001a\u0008\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008.\u0010\u00ea\u0001R\u0015\u00100\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u00080\u0010\u00eb\u0001R\u001f\u0010\u00ef\u0001\u001a\u0002038BX\u0082\u0084\u0002\u00a2\u0006\u000f\n\u0006\u0008\u00ec\u0001\u0010\u00ed\u0001\u001a\u0005\u0008\u00ee\u0001\u00105\u00a8\u0006\u00f0\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;",
        "Lio/getstream/chat/android/client/plugin/Plugin;",
        "Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/QueryChannelsListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/ChannelMarkReadListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/MarkAllReadListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/SendGiphyListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/TypingEventListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/BlockUserListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/UnblockUserListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/LiveLocationListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/QueryBlockedUsersListener;",
        "Lio/getstream/chat/android/client/plugin/listeners/PushPreferencesListener;",
        "Lio/getstream/chat/android/client/errorhandler/factory/ErrorHandlerFactory;",
        "errorHandlerFactory",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "logic",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "repositoryFacade",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "Lio/getstream/chat/android/client/api/state/StateRegistry;",
        "stateRegistry",
        "Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;",
        "syncManager",
        "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;",
        "eventHandler",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "mutableGlobalState",
        "Lec3/p1;",
        "",
        "queryingChannelsFree",
        "Lio/getstream/chat/android/client/api/ChatClientConfig;",
        "chatClientConfig",
        "<init>",
        "(Lio/getstream/chat/android/client/errorhandler/factory/ErrorHandlerFactory;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/api/state/StateRegistry;Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lec3/p1;Lio/getstream/chat/android/client/api/ChatClientConfig;)V",
        "Lio/getstream/chat/android/client/errorhandler/ErrorHandler;",
        "getErrorHandler",
        "()Lio/getstream/chat/android/client/errorhandler/ErrorHandler;",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "Ll83/a0;",
        "onUserSet",
        "(Lio/getstream/chat/android/models/User;)V",
        "onUserDisconnected",
        "()V",
        "",
        "T",
        "Lj93/d;",
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
        "onDeleteChannelRequest",
        "(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "onDeleteChannelResult",
        "(Ljava/lang/String;Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "onDeleteChannelPrecondition",
        "onAttachmentSendRequest",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
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
        "onGetRepliesPrecondition",
        "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
        "onQueryChannelsPrecondition",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;",
        "onQueryChannelsRequest",
        "Lio/getstream/chat/android/client/api/models/QueryChannelsResult;",
        "onQueryChannelsResult",
        "(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;",
        "onDeleteMessageForMePrecondition",
        "onDeleteMessageForMeRequest",
        "onDeleteMessageForMeResult",
        "Lio/getstream/chat/android/client/errorhandler/factory/ErrorHandlerFactory;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "Lio/getstream/chat/android/client/api/state/StateRegistry;",
        "Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;",
        "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "Lec3/p1;",
        "Lio/getstream/chat/android/client/api/ChatClientConfig;",
        "lazyErrorHandler$delegate",
        "Ll83/h;",
        "getLazyErrorHandler",
        "lazyErrorHandler",
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
.field private final synthetic $$delegate_0:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryMembersListenerState;

.field private final synthetic $$delegate_1:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState;

.field private final synthetic $$delegate_10:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;

.field private final synthetic $$delegate_11:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;

.field private final synthetic $$delegate_12:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageForMeListenerState;

.field private final synthetic $$delegate_13:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendGiphyListenerState;

.field private final synthetic $$delegate_14:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ShuffleGiphyListenerState;

.field private final synthetic $$delegate_15:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendMessageListenerState;

.field private final synthetic $$delegate_16:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState;

.field private final synthetic $$delegate_17:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendAttachmentListenerState;

.field private final synthetic $$delegate_18:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/FetchCurrentUserListenerState;

.field private final synthetic $$delegate_19:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryThreadsListenerState;

.field private final synthetic $$delegate_2:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState;

.field private final synthetic $$delegate_20:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/BlockUserListenerState;

.field private final synthetic $$delegate_21:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DraftMessageListenerState;

.field private final synthetic $$delegate_22:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/UnblockUserListenerState;

.field private final synthetic $$delegate_23:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;

.field private final synthetic $$delegate_24:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryBlockedUsersListenerState;

.field private final synthetic $$delegate_25:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/PushPreferencesListenerState;

.field private final synthetic $$delegate_3:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;

.field private final synthetic $$delegate_4:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ChannelMarkReadListenerState;

.field private final synthetic $$delegate_5:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/EditMessageListenerState;

.field private final synthetic $$delegate_6:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/HideChannelListenerState;

.field private final synthetic $$delegate_7:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/MarkAllReadListenerState;

.field private final synthetic $$delegate_8:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteReactionListenerState;

.field private final synthetic $$delegate_9:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteChannelListenerState;

.field private final chatClientConfig:Lio/getstream/chat/android/client/api/ChatClientConfig;

.field private final clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

.field private final errorHandlerFactory:Lio/getstream/chat/android/client/errorhandler/factory/ErrorHandlerFactory;

.field private final eventHandler:Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;

.field private final lazyErrorHandler$delegate:Ll83/h;

.field private final logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

.field private final mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

.field private final queryingChannelsFree:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final repositoryFacade:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

.field private final stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

.field private final syncManager:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/errorhandler/factory/ErrorHandlerFactory;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/api/state/StateRegistry;Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lec3/p1;Lio/getstream/chat/android/client/api/ChatClientConfig;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/errorhandler/factory/ErrorHandlerFactory;",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
            "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
            "Lio/getstream/chat/android/client/setup/state/ClientState;",
            "Lio/getstream/chat/android/client/api/state/StateRegistry;",
            "Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;",
            "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;",
            "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
            "Lec3/p1;",
            "Lio/getstream/chat/android/client/api/ChatClientConfig;",
            ")V"
        }
    .end annotation

    const-string v0, "errorHandlerFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logic"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repositoryFacade"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateRegistry"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syncManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventHandler"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mutableGlobalState"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queryingChannelsFree"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClientConfig"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryMembersListenerState;

    invoke-direct {v0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryMembersListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_0:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryMembersListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState;

    invoke-direct {v0, p2, p9}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lec3/p1;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_1:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState;

    invoke-direct {v0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_2:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;

    invoke-direct {v0, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_3:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ChannelMarkReadListenerState;

    invoke-direct {v0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ChannelMarkReadListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_4:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ChannelMarkReadListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/EditMessageListenerState;

    invoke-direct {v0, p2, p4}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/EditMessageListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_5:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/EditMessageListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/HideChannelListenerState;

    invoke-direct {v0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/HideChannelListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_6:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/HideChannelListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/MarkAllReadListenerState;

    invoke-direct {v0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/MarkAllReadListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_7:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/MarkAllReadListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteReactionListenerState;

    invoke-direct {v0, p2, p4}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteReactionListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_8:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteReactionListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteChannelListenerState;

    invoke-direct {v0, p2, p4}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteChannelListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_9:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteChannelListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;

    invoke-direct {v0, p2, p4}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_10:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;

    invoke-direct {v0, p2, p4, p8}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/api/state/GlobalState;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_11:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageForMeListenerState;

    invoke-direct {v0, p2, p4}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageForMeListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_12:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageForMeListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendGiphyListenerState;

    invoke-direct {v0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendGiphyListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_13:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendGiphyListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ShuffleGiphyListenerState;

    invoke-direct {v0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ShuffleGiphyListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_14:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ShuffleGiphyListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendMessageListenerState;

    invoke-direct {v0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendMessageListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_15:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendMessageListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState;

    invoke-direct {v0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_16:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendAttachmentListenerState;

    invoke-direct {v0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendAttachmentListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_17:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendAttachmentListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/FetchCurrentUserListenerState;

    invoke-direct {v0, p4, p8}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/FetchCurrentUserListenerState;-><init>(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_18:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/FetchCurrentUserListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryThreadsListenerState;

    invoke-direct {v0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryThreadsListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_19:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryThreadsListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/BlockUserListenerState;

    invoke-direct {v0, p8}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/BlockUserListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_20:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/BlockUserListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DraftMessageListenerState;

    invoke-direct {v0, p8}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DraftMessageListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_21:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DraftMessageListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/UnblockUserListenerState;

    invoke-direct {v0, p8}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/UnblockUserListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_22:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/UnblockUserListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;

    invoke-direct {v0, p8}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_23:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryBlockedUsersListenerState;

    invoke-direct {v0, p8}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryBlockedUsersListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_24:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryBlockedUsersListenerState;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/PushPreferencesListenerState;

    invoke-direct {v0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/PushPreferencesListenerState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_25:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/PushPreferencesListenerState;

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->errorHandlerFactory:Lio/getstream/chat/android/client/errorhandler/factory/ErrorHandlerFactory;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->repositoryFacade:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object p4, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    iput-object p5, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

    iput-object p6, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->syncManager:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    iput-object p7, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->eventHandler:Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;

    iput-object p8, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    iput-object p9, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->queryingChannelsFree:Lec3/p1;

    iput-object p10, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->chatClientConfig:Lio/getstream/chat/android/client/api/ChatClientConfig;

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/16 p2, 0xc

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->lazyErrorHandler$delegate:Ll83/h;

    return-void
.end method

.method public static a(Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;)Lio/getstream/chat/android/client/errorhandler/ErrorHandler;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->errorHandlerFactory:Lio/getstream/chat/android/client/errorhandler/factory/ErrorHandlerFactory;

    invoke-interface {p0}, Lio/getstream/chat/android/client/errorhandler/factory/ErrorHandlerFactory;->create()Lio/getstream/chat/android/client/errorhandler/ErrorHandler;

    move-result-object p0

    return-object p0
.end method

.method private final getLazyErrorHandler()Lio/getstream/chat/android/client/errorhandler/ErrorHandler;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->lazyErrorHandler$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/errorhandler/ErrorHandler;

    return-object v0
.end method

.method private static final lazyErrorHandler_delegate$lambda$0(Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;)Lio/getstream/chat/android/client/errorhandler/ErrorHandler;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->errorHandlerFactory:Lio/getstream/chat/android/client/errorhandler/factory/ErrorHandlerFactory;

    invoke-interface {p0}, Lio/getstream/chat/android/client/errorhandler/factory/ErrorHandlerFactory;->create()Lio/getstream/chat/android/client/errorhandler/ErrorHandler;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getErrorHandler()Lio/getstream/chat/android/client/errorhandler/ErrorHandler;
    .locals 1

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->getLazyErrorHandler()Lio/getstream/chat/android/client/errorhandler/ErrorHandler;

    move-result-object v0

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_17:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendAttachmentListenerState;

    invoke-virtual {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendAttachmentListenerState;->onAttachmentSendRequest(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onBlockUserResult(Ln23/h;)V
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_20:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/BlockUserListenerState;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/BlockUserListenerState;->onBlockUserResult(Ln23/h;)V

    return-void
.end method

.method public final onChannelMarkReadPrecondition(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_4:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ChannelMarkReadListenerState;

    invoke-virtual {v0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ChannelMarkReadListenerState;->onChannelMarkReadPrecondition(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onChannelPushNotificationsSnoozed(Ljava/lang/String;Ljava/util/Date;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_25:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/PushPreferencesListenerState;

    invoke-virtual {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/PushPreferencesListenerState;->onChannelPushNotificationsSnoozed(Ljava/lang/String;Ljava/util/Date;Ln23/h;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onChannelPushPreferenceSet(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_25:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/PushPreferencesListenerState;

    invoke-virtual {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/PushPreferencesListenerState;->onChannelPushPreferenceSet(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;Ln23/h;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_21:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DraftMessageListenerState;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DraftMessageListenerState;->onCreateDraftMessageResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_9:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteChannelListenerState;

    invoke-virtual {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteChannelListenerState;->onDeleteChannelPrecondition(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onDeleteChannelRequest(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_9:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteChannelListenerState;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onDeleteChannelResult(Ljava/lang/String;Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;
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

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_9:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteChannelListenerState;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_21:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DraftMessageListenerState;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DraftMessageListenerState;->onDeleteDraftMessagesResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_12:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageForMeListenerState;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;->onDeleteMessageForMePrecondition$suspendImpl(Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_12:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageForMeListenerState;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageForMeListenerState;->onDeleteMessageForMeRequest(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_12:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageForMeListenerState;

    invoke-virtual {v0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageForMeListenerState;->onDeleteMessageForMeResult(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_8:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteReactionListenerState;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteReactionListenerState;->onDeleteReactionPrecondition(Lio/getstream/chat/android/models/User;)Ln23/h;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_8:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteReactionListenerState;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteReactionListenerState;->onDeleteReactionRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onDeleteReactionResult(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;
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

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_8:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteReactionListenerState;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_18:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/FetchCurrentUserListenerState;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/FetchCurrentUserListenerState;->onFetchCurrentUserResult(Ln23/h;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_3:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;

    invoke-virtual {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;->onGetNewerRepliesRequest(Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_3:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;->onGetNewerRepliesResult(Ln23/h;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_3:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;

    invoke-virtual {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;->onGetRepliesMoreRequest(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_3:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;->onGetRepliesMoreResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_3:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;->onGetRepliesPrecondition(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_3:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;

    invoke-virtual {v0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;->onGetRepliesRequest(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_3:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;

    invoke-virtual {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;->onGetRepliesResult(Ln23/h;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onGiphySendResult(Ljava/lang/String;Ln23/h;)V
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

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_13:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendGiphyListenerState;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendGiphyListenerState;->onGiphySendResult(Ljava/lang/String;Ln23/h;)V

    return-void
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_6:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/HideChannelListenerState;

    invoke-virtual {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/HideChannelListenerState;->onHideChannelPrecondition(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_6:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/HideChannelListenerState;

    invoke-virtual {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/HideChannelListenerState;->onHideChannelRequest(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_6:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/HideChannelListenerState;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/HideChannelListenerState;->onHideChannelResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onMarkAllReadRequest(Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_7:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/MarkAllReadListenerState;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/MarkAllReadListenerState;->onMarkAllReadRequest(Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_11:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;->onMessageDeletePrecondition(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_11:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;->onMessageDeleteRequest(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_11:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;

    invoke-virtual {v0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;->onMessageDeleteResult(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_5:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/EditMessageListenerState;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/EditMessageListenerState;->onMessageEditRequest(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_5:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/EditMessageListenerState;

    invoke-virtual {v0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/EditMessageListenerState;->onMessageEditResult(Lio/getstream/chat/android/models/Message;Ln23/h;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_15:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendMessageListenerState;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendMessageListenerState;->onMessageSendResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onQueryActiveLocationsResult(Ln23/h;Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_23:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;->onQueryActiveLocationsResult(Ln23/h;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onQueryBlockedUsersResult(Ln23/h;)V
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_24:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryBlockedUsersListenerState;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryBlockedUsersListenerState;->onQueryBlockedUsersResult(Ln23/h;)V

    return-void
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_2:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState;

    invoke-virtual {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState;->onQueryChannelPrecondition(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_2:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState;

    invoke-virtual {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState;->onQueryChannelRequest(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_2:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState;->onQueryChannelResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onQueryChannelsPrecondition(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_1:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState;->onQueryChannelsPrecondition(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onQueryChannelsRequest(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_1:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState;->onQueryChannelsRequest(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onQueryChannelsResult(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_1:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState;

    invoke-virtual {v0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState;->onQueryChannelsResult(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_21:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DraftMessageListenerState;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DraftMessageListenerState;->onQueryDraftMessagesResult(Ln23/h;Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_0:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryMembersListenerState;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    invoke-virtual/range {v0 .. v9}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryMembersListenerState;->onQueryMembersResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_19:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryThreadsListenerState;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryThreadsListenerState;->onQueryThreadsPrecondition(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_19:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryThreadsListenerState;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryThreadsListenerState;->onQueryThreadsRequest(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_19:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryThreadsListenerState;

    invoke-virtual {v0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryThreadsListenerState;->onQueryThreadsResult(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_10:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;

    invoke-virtual {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;->onSendReactionPrecondition(Ljava/lang/String;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_10:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;->onSendReactionRequest(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_10:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;->onSendReactionResult(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_14:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ShuffleGiphyListenerState;

    invoke-virtual {v0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ShuffleGiphyListenerState;->onShuffleGiphyResult(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onStartLiveLocationSharingResult(Lio/getstream/chat/android/models/Location;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_23:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;

    invoke-virtual {v0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;->onStartLiveLocationSharingResult(Lio/getstream/chat/android/models/Location;Ln23/h;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onStopLiveLocationSharingResult(Lio/getstream/chat/android/models/Location;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_23:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;

    invoke-virtual {v0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;->onStopLiveLocationSharingResult(Lio/getstream/chat/android/models/Location;Ln23/h;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onTypingEventPrecondition(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)Ln23/h;
    .locals 7
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

    const-string v0, "channelType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTime"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_16:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState;->onTypingEventPrecondition(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)Ln23/h;

    move-result-object p1

    return-object p1
.end method

.method public final onTypingEventRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)V
    .locals 7
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

    const-string v0, "channelType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTime"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_16:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState;->onTypingEventRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)V

    return-void
.end method

.method public final onTypingEventResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)V
    .locals 8
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

    const-string v0, "eventType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTime"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_16:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-virtual/range {v1 .. v7}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState;->onTypingEventResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)V

    return-void
.end method

.method public final onUnblockUserResult(Ljava/lang/String;Ln23/h;)V
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

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_22:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/UnblockUserListenerState;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/UnblockUserListenerState;->onUnblockUserResult(Ljava/lang/String;Ln23/h;)V

    return-void
.end method

.method public final onUpdateLiveLocationPrecondition(Lio/getstream/chat/android/models/Location;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_23:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;->onUpdateLiveLocationPrecondition(Lio/getstream/chat/android/models/Location;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onUpdateLiveLocationResult(Lio/getstream/chat/android/models/Location;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->$$delegate_23:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;

    invoke-virtual {v0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;->onUpdateLiveLocationResult(Lio/getstream/chat/android/models/Location;Ln23/h;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onUserDisconnected()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/api/state/StateRegistry;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->syncManager:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->stop()V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->eventHandler:Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;

    invoke-interface {v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;->stopListening()V

    return-void
.end method

.method public final onUserSet(Lio/getstream/chat/android/models/User;)V
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->syncManager:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->start()V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->eventHandler:Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;

    invoke-interface {p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;->startListening()V

    return-void
.end method

.method public final resolveDependency(Lj93/d;)Ljava/lang/Object;
    .locals 3
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

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncHistoryManager;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "null cannot be cast to non-null type T of io.getstream.chat.android.client.internal.state.plugin.internal.StatePlugin.resolveDependency"

    if-eqz v1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->syncManager:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    const-class v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->eventHandler:Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_1
    const-class v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_2
    const-class v1, Lio/getstream/chat/android/client/api/state/StateRegistry;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_3
    const-class v1, Lio/getstream/chat/android/client/api/state/GlobalState;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_4
    const-class v1, Lio/getstream/chat/android/client/api/ChatClientConfig;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->chatClientConfig:Lio/getstream/chat/android/client/api/ChatClientConfig;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_5
    const/4 p1, 0x0

    return-object p1
.end method
