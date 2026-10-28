.class public final Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Companion;,
        Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;,
        Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;,
        Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ae\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008\u0007\u0018\u0000 \u00f8\u00022\u00020\u0001:\u0008\u00f9\u0002\u00fa\u0002\u00fb\u0002\u00f8\u0002B\u00b5\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0017\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0017\u0012\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001a\u0012\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 \u00a2\u0006\u0004\u0008!\u0010\"J\r\u0010#\u001a\u00020 \u00a2\u0006\u0004\u0008#\u0010\"J\r\u0010$\u001a\u00020 \u00a2\u0006\u0004\u0008$\u0010\"J%\u0010&\u001a\u00020 2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u000c\u0010&\u001a\u0008\u0012\u0004\u0012\u00020 0%\u00a2\u0006\u0004\u0008&\u0010\'J\u001f\u0010)\u001a\u00020 2\u0006\u0010(\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008)\u0010*J\u0017\u0010+\u001a\u00020 2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008+\u0010,J\u0018\u0010/\u001a\u00020 2\u0006\u0010.\u001a\u00020-H\u0086@\u00a2\u0006\u0004\u0008/\u00100J\"\u00102\u001a\u00020 2\u0006\u00101\u001a\u00020-2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u00082\u00103J\u0015\u00104\u001a\u00020 2\u0006\u0010\u0008\u001a\u00020\u0002\u00a2\u0006\u0004\u00084\u00105J\r\u00106\u001a\u00020 \u00a2\u0006\u0004\u00086\u0010\"J1\u0010:\u001a\u00020 2\u0006\u0010\u0008\u001a\u00020\u00022\u001a\u0008\u0002\u00109\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020-08\u0012\u0004\u0012\u00020 07\u00a2\u0006\u0004\u0008:\u0010;J\u001f\u0010<\u001a\u00020 2\u0006\u0010\u0008\u001a\u00020\u00022\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008<\u0010=J\u0017\u0010>\u001a\u00020 2\u0008\u0010.\u001a\u0004\u0018\u00010-\u00a2\u0006\u0004\u0008>\u0010?J\u0017\u0010@\u001a\u00020 2\u0008\u0010.\u001a\u0004\u0018\u00010-\u00a2\u0006\u0004\u0008@\u0010?J\u0017\u0010A\u001a\u00020 2\u0008\u0010.\u001a\u0004\u0018\u00010-\u00a2\u0006\u0004\u0008A\u0010?J\u0017\u0010D\u001a\u00020 2\u0008\u0010C\u001a\u0004\u0018\u00010B\u00a2\u0006\u0004\u0008D\u0010EJ%\u0010J\u001a\u00020 2\u0006\u0010G\u001a\u00020F2\u0006\u0010.\u001a\u00020-2\u0006\u0010I\u001a\u00020H\u00a2\u0006\u0004\u0008J\u0010KJ\u0018\u0010N\u001a\u00020 2\u0006\u0010M\u001a\u00020LH\u0086@\u00a2\u0006\u0004\u0008N\u0010OJ\u0015\u0010P\u001a\u00020 2\u0006\u0010M\u001a\u00020L\u00a2\u0006\u0004\u0008P\u0010QJ\r\u0010R\u001a\u00020 \u00a2\u0006\u0004\u0008R\u0010\"J\r\u0010S\u001a\u00020 \u00a2\u0006\u0004\u0008S\u0010\"J\u001f\u0010U\u001a\u00020 2\u0006\u0010.\u001a\u00020-2\u0008\u0008\u0002\u0010T\u001a\u00020\u0006\u00a2\u0006\u0004\u0008U\u0010VJ\u0015\u0010W\u001a\u00020 2\u0006\u0010.\u001a\u00020-\u00a2\u0006\u0004\u0008W\u0010?J\r\u0010X\u001a\u00020 \u00a2\u0006\u0004\u0008X\u0010\"JO\u0010]\u001a\u00020 2\u0006\u0010.\u001a\u00020-2\u0008\u0010Y\u001a\u0004\u0018\u00010\u00022\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020Z2\u001a\u0008\u0002\u00109\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\\08\u0012\u0004\u0012\u00020 07\u00a2\u0006\u0004\u0008]\u0010^J1\u0010_\u001a\u00020 2\u0006\u0010.\u001a\u00020-2\u001a\u0008\u0002\u00109\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 08\u0012\u0004\u0012\u00020 07\u00a2\u0006\u0004\u0008_\u0010`J\u0015\u0010a\u001a\u00020 2\u0006\u0010.\u001a\u00020-\u00a2\u0006\u0004\u0008a\u0010?J#\u0010d\u001a\u00020 2\u0006\u0010.\u001a\u00020-2\n\u0008\u0002\u0010c\u001a\u0004\u0018\u00010bH\u0007\u00a2\u0006\u0004\u0008d\u0010eJ\u0015\u0010f\u001a\u00020 2\u0006\u0010.\u001a\u00020-\u00a2\u0006\u0004\u0008f\u0010?J\u0015\u0010g\u001a\u00020 2\u0006\u0010.\u001a\u00020-\u00a2\u0006\u0004\u0008g\u0010?J\u0015\u0010j\u001a\u00020 2\u0006\u0010i\u001a\u00020h\u00a2\u0006\u0004\u0008j\u0010kJ\u0015\u0010l\u001a\u00020 2\u0006\u0010i\u001a\u00020h\u00a2\u0006\u0004\u0008l\u0010kJ\u0015\u0010m\u001a\u00020 2\u0006\u0010i\u001a\u00020h\u00a2\u0006\u0004\u0008m\u0010kJ%\u0010q\u001a\u00020 2\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010n\u001a\u00020\u00022\u0006\u0010p\u001a\u00020o\u00a2\u0006\u0004\u0008q\u0010rJ%\u0010t\u001a\u00020 2\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010n\u001a\u00020\u00022\u0006\u0010s\u001a\u00020\u0002\u00a2\u0006\u0004\u0008t\u0010uJ%\u0010x\u001a\u00020 2\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010n\u001a\u00020\u00022\u0006\u0010w\u001a\u00020v\u00a2\u0006\u0004\u0008x\u0010yJ\u0015\u0010z\u001a\u00020 2\u0006\u0010n\u001a\u00020\u0002\u00a2\u0006\u0004\u0008z\u00105J\'\u0010~\u001a\u00020 2\u0006\u0010|\u001a\u00020{2\u0006\u0010.\u001a\u00020-2\u0008\u0008\u0002\u0010}\u001a\u00020\u0006\u00a2\u0006\u0004\u0008~\u0010\u007fJ\u001a\u0010\u0080\u0001\u001a\u0004\u0018\u00010-2\u0006\u0010\u0008\u001a\u00020\u0002\u00a2\u0006\u0006\u0008\u0080\u0001\u0010\u0081\u0001J\u000f\u0010\u0082\u0001\u001a\u00020 \u00a2\u0006\u0005\u0008\u0082\u0001\u0010\"J$\u0010l\u001a\u00020 2\u0007\u0010\u0083\u0001\u001a\u00020\u00022\u000b\u0008\u0002\u0010\u0084\u0001\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0005\u0008l\u0010\u0085\u0001J\u0016\u0010m\u001a\u00020 2\u0007\u0010\u0083\u0001\u001a\u00020\u0002\u00a2\u0006\u0004\u0008m\u00105J2\u0010\u0086\u0001\u001a\u00020 2\u0007\u0010\u0083\u0001\u001a\u00020\u00022\n\u0008\u0002\u0010Y\u001a\u0004\u0018\u00010\u00022\u000b\u0008\u0002\u0010\u0084\u0001\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0006\u0008\u0086\u0001\u0010\u0087\u0001J\u0018\u0010\u0088\u0001\u001a\u00020 2\u0007\u0010\u0083\u0001\u001a\u00020\u0002\u00a2\u0006\u0005\u0008\u0088\u0001\u00105J2\u0010\u0089\u0001\u001a\u00020 2\u0007\u0010\u0083\u0001\u001a\u00020\u00022\n\u0008\u0002\u0010Y\u001a\u0004\u0018\u00010\u00022\u000b\u0008\u0002\u0010\u0084\u0001\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0006\u0008\u0089\u0001\u0010\u0087\u0001J\u0018\u0010\u008a\u0001\u001a\u00020 2\u0007\u0010\u0083\u0001\u001a\u00020\u0002\u00a2\u0006\u0005\u0008\u008a\u0001\u00105J;\u0010\u008b\u0001\u001a\u00020 2\u0007\u0010\u0083\u0001\u001a\u00020\u00022\n\u0008\u0002\u0010Y\u001a\u0004\u0018\u00010\u00022\u0014\u0008\u0002\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020Z\u00a2\u0006\u0006\u0008\u008b\u0001\u0010\u008c\u0001J\u0018\u0010\u008d\u0001\u001a\u00020 2\u0007\u0010\u0083\u0001\u001a\u00020\u0002\u00a2\u0006\u0005\u0008\u008d\u0001\u00105J\u0018\u0010\u008e\u0001\u001a\u00020 2\u0007\u0010\u0083\u0001\u001a\u00020\u0002\u00a2\u0006\u0005\u0008\u008e\u0001\u00105J\u0018\u0010\u008f\u0001\u001a\u00020 2\u0007\u0010\u0083\u0001\u001a\u00020\u0002\u00a2\u0006\u0005\u0008\u008f\u0001\u00105J\u001a\u0010\u0092\u0001\u001a\u00020 2\u0008\u0010\u0091\u0001\u001a\u00030\u0090\u0001\u00a2\u0006\u0006\u0008\u0092\u0001\u0010\u0093\u0001J\"\u0010\u0096\u0001\u001a\u00020 2\u0006\u0010\u0008\u001a\u00020\u00022\u0008\u0010\u0095\u0001\u001a\u00030\u0094\u0001\u00a2\u0006\u0006\u0008\u0096\u0001\u0010\u0097\u0001J\u0018\u0010\u0098\u0001\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0006\u0008\u0098\u0001\u0010\u0099\u0001J\u001a\u0010\u009a\u0001\u001a\u00020 2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0006\u0008\u009a\u0001\u0010\u009b\u0001J\u001a\u0010\u009c\u0001\u001a\u00020 2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0006\u0008\u009c\u0001\u0010\u009b\u0001J\u0018\u0010\u009d\u0001\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0006\u0008\u009d\u0001\u0010\u009e\u0001J\u0019\u0010\u00a0\u0001\u001a\u00020 2\u0007\u0010\u009f\u0001\u001a\u00020\u0006\u00a2\u0006\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001J\u000f\u0010\u00a2\u0001\u001a\u00020 \u00a2\u0006\u0005\u0008\u00a2\u0001\u0010\"J(\u0010\u00a3\u0001\u001a\u00020 2\u0006\u0010.\u001a\u00020-2\u0006\u0010G\u001a\u00020F2\u0006\u0010p\u001a\u00020o\u00a2\u0006\u0006\u0008\u00a3\u0001\u0010\u00a4\u0001J\u0016\u0010z\u001a\u00020 2\u0006\u0010G\u001a\u00020F\u00a2\u0006\u0005\u0008z\u0010\u00a5\u0001J \u0010\u00a6\u0001\u001a\u00020 2\u0006\u0010G\u001a\u00020F2\u0006\u0010p\u001a\u00020\u0002\u00a2\u0006\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001J\u001f\u0010\u00a6\u0001\u001a\u00020 2\u0006\u0010n\u001a\u00020\u00022\u0006\u0010p\u001a\u00020\u0002\u00a2\u0006\u0005\u0008\u00a6\u0001\u0010=J\u000f\u0010\u00a8\u0001\u001a\u00020 \u00a2\u0006\u0005\u0008\u00a8\u0001\u0010\"J\u0011\u0010\u00a9\u0001\u001a\u00020 H\u0002\u00a2\u0006\u0005\u0008\u00a9\u0001\u0010\"J\u0011\u0010\u00aa\u0001\u001a\u00020 H\u0002\u00a2\u0006\u0005\u0008\u00aa\u0001\u0010\"J\u0013\u0010\u00ab\u0001\u001a\u00020 H\u0082@\u00a2\u0006\u0006\u0008\u00ab\u0001\u0010\u00ac\u0001J&\u0010\u00af\u0001\u001a\u00020 *\t\u0012\u0004\u0012\u00020-0\u00ad\u00012\u0007\u0010\u00ae\u0001\u001a\u00020\u0002H\u0002\u00a2\u0006\u0006\u0008\u00af\u0001\u0010\u00b0\u0001J\u001c\u0010\u00b3\u0001\u001a\u00020 2\u0008\u0010\u00b2\u0001\u001a\u00030\u00b1\u0001H\u0002\u00a2\u0006\u0006\u0008\u00b3\u0001\u0010\u00b4\u0001J\u001b\u0010\u00b6\u0001\u001a\u00020 2\u0007\u0010\u00b5\u0001\u001a\u00020\u0006H\u0002\u00a2\u0006\u0006\u0008\u00b6\u0001\u0010\u00a1\u0001J\u001c\u0010\u00b8\u0001\u001a\u00020 2\t\u0010\u00b7\u0001\u001a\u0004\u0018\u00010hH\u0002\u00a2\u0006\u0005\u0008\u00b8\u0001\u0010kJ\u001a\u0010\u00ba\u0001\u001a\u00020 2\u0007\u0010\u00b9\u0001\u001a\u00020\nH\u0002\u00a2\u0006\u0005\u0008\u00ba\u0001\u0010,J\u001e\u0010\u00bd\u0001\u001a\u00020 2\n\u0010\u00bc\u0001\u001a\u0005\u0018\u00010\u00bb\u0001H\u0002\u00a2\u0006\u0006\u0008\u00bd\u0001\u0010\u00be\u0001J\u001b\u0010\u00c0\u0001\u001a\u00020 2\u0007\u0010\u00bf\u0001\u001a\u00020\u0006H\u0002\u00a2\u0006\u0006\u0008\u00c0\u0001\u0010\u00a1\u0001J\u001b\u0010\u00c2\u0001\u001a\u00020 2\u0007\u0010\u00c1\u0001\u001a\u00020\u0006H\u0002\u00a2\u0006\u0006\u0008\u00c2\u0001\u0010\u00a1\u0001J\u001c\u0010\u00c3\u0001\u001a\u00020 2\u0008\u0010\u00b2\u0001\u001a\u00030\u00b1\u0001H\u0002\u00a2\u0006\u0006\u0008\u00c3\u0001\u0010\u00b4\u0001Jn\u0010\u00cb\u0001\u001a\u00020 2\u0007\u0010\u00c4\u0001\u001a\u00020\u00022\u0014\u0010\u00c5\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020-0\u00ad\u00010\u00102\r\u0010\u00c6\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00102\u0015\u0010\u00c8\u0001\u001a\u0010\u0012\u000c\u0012\n\u0012\u0005\u0012\u00030\u00c7\u00010\u00ad\u00010\u00102\u0015\u0010\u00ca\u0001\u001a\u0010\u0012\u000c\u0012\n\u0012\u0005\u0012\u00030\u00c9\u00010\u00ad\u00010\u0010H\u0002\u00a2\u0006\u0006\u0008\u00cb\u0001\u0010\u00cc\u0001J\u00c9\u0001\u0010\u00d6\u0001\u001a\n\u0012\u0005\u0012\u00030\u00d5\u00010\u00ad\u00012\u000e\u0010\u00c5\u0001\u001a\t\u0012\u0004\u0012\u00020-0\u00ad\u00012\u0007\u0010\u00cd\u0001\u001a\u00020\u00062\u000f\u0010\u00c8\u0001\u001a\n\u0012\u0005\u0012\u00030\u00c7\u00010\u00ad\u00012\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\u00ce\u0001\u001a\t\u0012\u0004\u0012\u00020h0\u00ad\u00012\t\u0010\u00cf\u0001\u001a\u0004\u0018\u00010-2\n\u0010\u00bc\u0001\u001a\u0005\u0018\u00010\u00bb\u00012\u000f\u0010\u00ca\u0001\u001a\n\u0012\u0005\u0012\u00030\u00c9\u00010\u00ad\u00012\u0007\u0010\u00c6\u0001\u001a\u00020\u00062\n\u0010\u00d1\u0001\u001a\u0005\u0018\u00010\u00d0\u00012\u000e\u0010\u00d3\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u00d2\u00012\u000e\u0010\u00d4\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u00d2\u0001H\u0002\u00a2\u0006\u0006\u0008\u00d6\u0001\u0010\u00d7\u0001J-\u0010\u00d9\u0001\u001a\u00020\u0006*\u00030\u00c7\u00012\u0014\u0010\u00d8\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030\u00c9\u00010ZH\u0002\u00a2\u0006\u0006\u0008\u00d9\u0001\u0010\u00da\u0001J1\u0010\u00db\u0001\u001a\t\u0012\u0004\u0012\u00020-0\u00ad\u00012\u000e\u0010\u00c5\u0001\u001a\t\u0012\u0004\u0012\u00020-0\u00ad\u00012\u0006\u0010\u0013\u001a\u00020\u0006H\u0002\u00a2\u0006\u0006\u0008\u00db\u0001\u0010\u00dc\u0001J7\u0010\u00e2\u0001\u001a\u0005\u0018\u00010\u00e1\u00012\t\u0010\u00dd\u0001\u001a\u0004\u0018\u00010-2\t\u0010\u00de\u0001\u001a\u0004\u0018\u00010-2\n\u0010\u00e0\u0001\u001a\u0005\u0018\u00010\u00df\u0001H\u0002\u00a2\u0006\u0006\u0008\u00e2\u0001\u0010\u00e3\u0001J\u001b\u0010\u00e4\u0001\u001a\u00030\u00e1\u00012\u0006\u0010.\u001a\u00020-H\u0002\u00a2\u0006\u0006\u0008\u00e4\u0001\u0010\u00e5\u0001J#\u0010\u00e6\u0001\u001a\u00020 2\u0006\u0010(\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0005\u0008\u00e6\u0001\u0010*J\u001c\u0010\u00e9\u0001\u001a\u00020 2\u0008\u0010\u00e8\u0001\u001a\u00030\u00e7\u0001H\u0002\u00a2\u0006\u0006\u0008\u00e9\u0001\u0010\u00ea\u0001J&\u0010\u00eb\u0001\u001a\u00020 2\u0008\u0010\u00e8\u0001\u001a\u00030\u00e7\u00012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0006\u0008\u00eb\u0001\u0010\u00ec\u0001J\u001a\u0010\u00ed\u0001\u001a\u00020 2\u0006\u00101\u001a\u00020-H\u0082@\u00a2\u0006\u0005\u0008\u00ed\u0001\u00100J\u001b\u0010\u00ed\u0001\u001a\u00020 2\u0006\u0010\t\u001a\u00020\u0002H\u0082@\u00a2\u0006\u0006\u0008\u00ed\u0001\u0010\u00ee\u0001J#\u0010\u00ef\u0001\u001a\u00020 2\u0006\u0010\u0008\u001a\u00020\u00022\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0005\u0008\u00ef\u0001\u0010=J\u0019\u0010\u00f0\u0001\u001a\u00020 2\u0006\u0010\u0008\u001a\u00020\u0002H\u0002\u00a2\u0006\u0005\u0008\u00f0\u0001\u00105J\"\u0010\u00f2\u0001\u001a\u00020 2\u0007\u0010\u00f1\u0001\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002\u00a2\u0006\u0005\u0008\u00f2\u0001\u0010=J\u0019\u0010\u00f3\u0001\u001a\u00020 2\u0006\u0010\u0008\u001a\u00020\u0002H\u0002\u00a2\u0006\u0005\u0008\u00f3\u0001\u00105J\u001e\u0010\u00f6\u0001\u001a\u00020 2\n\u0010\u00f5\u0001\u001a\u0005\u0018\u00010\u00f4\u0001H\u0002\u00a2\u0006\u0006\u0008\u00f6\u0001\u0010\u00f7\u0001J\u0019\u0010\u00f8\u0001\u001a\u00020 2\u0006\u0010.\u001a\u00020-H\u0002\u00a2\u0006\u0005\u0008\u00f8\u0001\u0010?J\u0011\u0010\u00f9\u0001\u001a\u00020 H\u0002\u00a2\u0006\u0005\u0008\u00f9\u0001\u0010\"J\u0011\u0010\u00fa\u0001\u001a\u00020 H\u0002\u00a2\u0006\u0005\u0008\u00fa\u0001\u0010\"J\u0011\u0010\u00fb\u0001\u001a\u00020 H\u0002\u00a2\u0006\u0005\u0008\u00fb\u0001\u0010\"J\u0011\u0010\u00fc\u0001\u001a\u00020 H\u0002\u00a2\u0006\u0005\u0008\u00fc\u0001\u0010\"J\u0019\u0010\u00fd\u0001\u001a\u00020 2\u0006\u0010.\u001a\u00020-H\u0002\u00a2\u0006\u0005\u0008\u00fd\u0001\u0010?J\u001c\u0010\u0080\u0002\u001a\u00020 2\u0008\u0010\u00ff\u0001\u001a\u00030\u00fe\u0001H\u0002\u00a2\u0006\u0006\u0008\u0080\u0002\u0010\u0081\u0002J3\u0010\u0086\u0002\u001a\u00020 2\u0008\u0010\u0083\u0002\u001a\u00030\u0082\u00022\u0015\u0010\u0085\u0002\u001a\u0010\u0012\u0005\u0012\u00030\u0082\u0002\u0012\u0005\u0012\u00030\u0084\u000207H\u0002\u00a2\u0006\u0006\u0008\u0086\u0002\u0010\u0087\u0002R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0003\u0010\u0088\u0002R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0005\u0010\u0089\u0002R\u001a\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000f\n\u0005\u0008\u0007\u0010\u008a\u0002\u001a\u0006\u0008\u008b\u0002\u0010\u008c\u0002R\u0017\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0008\u0010\u0088\u0002R\u0017\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\t\u0010\u0088\u0002R\u001a\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000f\n\u0005\u0008\u000b\u0010\u008d\u0002\u001a\u0006\u0008\u008e\u0002\u0010\u008f\u0002R\u0015\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\r\u0010\u0090\u0002R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u000f\u0010\u0091\u0002R\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0006\u00a2\u0006\u000f\n\u0005\u0008\u0012\u0010\u0092\u0002\u001a\u0006\u0008\u0093\u0002\u0010\u0094\u0002R\u0015\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0013\u0010\u008a\u0002R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0015\u0010\u0095\u0002R\u0015\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0016\u0010\u008a\u0002R\u0015\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0018\u0010\u0096\u0002R\u0015\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0019\u0010\u0096\u0002R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u001b\u0010\u0097\u0002R\u0015\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u001c\u0010\u008a\u0002R\u0015\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u001d\u0010\u008a\u0002R!\u0010\u009d\u0002\u001a\u00030\u0098\u00028BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u0099\u0002\u0010\u009a\u0002\u001a\u0006\u0008\u009b\u0002\u0010\u009c\u0002R\u0018\u0010\u009f\u0002\u001a\u00030\u009e\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u009f\u0002\u0010\u00a0\u0002R#\u0010\u00a2\u0002\u001a\t\u0012\u0005\u0012\u00030\u00a1\u00020\u00108\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00a2\u0002\u0010\u0092\u0002\u001a\u0006\u0008\u00a3\u0002\u0010\u0094\u0002R\"\u0010i\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010h0\u00108\u0006\u00a2\u0006\u000f\n\u0005\u0008i\u0010\u0092\u0002\u001a\u0006\u0008\u00a4\u0002\u0010\u0094\u0002R&\u0010\u00a6\u0002\u001a\u000c\u0012\u0007\u0012\u0005\u0018\u00010\u00bb\u00010\u00a5\u00028\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00a6\u0002\u0010\u00a7\u0002\u001a\u0006\u0008\u00a8\u0002\u0010\u00a9\u0002R\u001e\u0010\u00ab\u0002\u001a\t\u0012\u0004\u0012\u00020\u00060\u00aa\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ab\u0002\u0010\u00ac\u0002R\u001b\u0010\u00ad\u0002\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ad\u0002\u0010\u0088\u0002R!\u0010\u00b2\u0002\u001a\u00030\u00ae\u00028BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u00af\u0002\u0010\u009a\u0002\u001a\u0006\u0008\u00b0\u0002\u0010\u00b1\u0002R0\u0010\u00d3\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00020\u00d2\u00010\u00108\u0006\u00a2\u0006\u0017\n\u0006\u0008\u00d3\u0001\u0010\u0092\u0002\u0012\u0005\u0008\u00b4\u0002\u0010\"\u001a\u0006\u0008\u00b3\u0002\u0010\u0094\u0002R*\u0010\u00d1\u0001\u001a\t\u0012\u0005\u0012\u00030\u00d0\u00010\u00108\u0006\u00a2\u0006\u0017\n\u0006\u0008\u00d1\u0001\u0010\u0092\u0002\u0012\u0005\u0008\u00b6\u0002\u0010\"\u001a\u0006\u0008\u00b5\u0002\u0010\u0094\u0002R\u001f\u0010\u00b8\u0002\u001a\n\u0012\u0005\u0012\u00030\u00b7\u00020\u00a5\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00b8\u0002\u0010\u00a7\u0002R#\u0010\u00b9\u0002\u001a\t\u0012\u0005\u0012\u00030\u00b7\u00020\u00108\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00b9\u0002\u0010\u0092\u0002\u001a\u0006\u0008\u00ba\u0002\u0010\u0094\u0002R\u001c\u0010\u00bb\u0002\u001a\u00020\u00068\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00bb\u0002\u0010\u008a\u0002\u001a\u0006\u0008\u00bb\u0002\u0010\u008c\u0002R\u001f\u0010\u00bc\u0002\u001a\n\u0012\u0005\u0012\u00030\u00fe\u00010\u00aa\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00bc\u0002\u0010\u00ac\u0002R$\u0010\u00be\u0002\u001a\n\u0012\u0005\u0012\u00030\u00fe\u00010\u00bd\u00028\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00be\u0002\u0010\u00bf\u0002\u001a\u0006\u0008\u00c0\u0002\u0010\u00c1\u0002R%\u0010\u00c2\u0002\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0084\u00020\u00108\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00c2\u0002\u0010\u0092\u0002\u001a\u0006\u0008\u00c3\u0002\u0010\u0094\u0002R\"\u0010\u00b9\u0001\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00108\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00b9\u0001\u0010\u0092\u0002\u001a\u0006\u0008\u00c4\u0002\u0010\u0094\u0002R)\u0010\u00ce\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020h0\u00ad\u00010\u00108\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00ce\u0001\u0010\u0092\u0002\u001a\u0006\u0008\u00c5\u0002\u0010\u0094\u0002R\u001f\u0010\u00c6\u0002\u001a\n\u0012\u0005\u0012\u00030\u00b1\u00010\u00a5\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00c6\u0002\u0010\u00a7\u0002R#\u0010\u00c7\u0002\u001a\t\u0012\u0005\u0012\u00030\u00b1\u00010\u00108\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00c7\u0002\u0010\u0092\u0002\u001a\u0006\u0008\u00c8\u0002\u0010\u0094\u0002R\u001f\u0010\u00ca\u0002\u001a\n\u0012\u0005\u0012\u00030\u00c9\u00020\u00a5\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ca\u0002\u0010\u00a7\u0002R#\u0010\u00cb\u0002\u001a\t\u0012\u0005\u0012\u00030\u00c9\u00020\u00108\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00cb\u0002\u0010\u0092\u0002\u001a\u0006\u0008\u00cc\u0002\u0010\u0094\u0002R\u001f\u0010\u00cd\u0002\u001a\n\u0012\u0005\u0012\u00030\u00b1\u00010\u00a5\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00cd\u0002\u0010\u00a7\u0002R#\u0010\u00ce\u0002\u001a\t\u0012\u0005\u0012\u00030\u00b1\u00010\u00108\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00ce\u0002\u0010\u0092\u0002\u001a\u0006\u0008\u00cf\u0002\u0010\u0094\u0002R#\u0010\u00d0\u0002\u001a\t\u0012\u0005\u0012\u00030\u00b1\u00010\u00108\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00d0\u0002\u0010\u0092\u0002\u001a\u0006\u0008\u00d1\u0002\u0010\u0094\u0002R\u001b\u0010\u00de\u0001\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00de\u0001\u0010\u00d2\u0002R\u001b\u0010\u00d3\u0002\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00d3\u0002\u0010\u00d2\u0002R%\u0010\u00d4\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020L0\u00d2\u00010\u00a5\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d4\u0002\u0010\u00a7\u0002R)\u0010\u00d5\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020L0\u00d2\u00010\u00108\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00d5\u0002\u0010\u0092\u0002\u001a\u0006\u0008\u00d6\u0002\u0010\u0094\u0002R \u0010\u00d7\u0002\u001a\t\u0012\u0004\u0012\u00020\u001a0\u00a5\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00d7\u0002\u0010\u00a7\u0002R\u001e\u0010\u00d8\u0002\u001a\t\u0012\u0004\u0012\u00020\u00170\u00a5\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d8\u0002\u0010\u00a7\u0002R\u001e\u0010\u00d9\u0002\u001a\t\u0012\u0004\u0012\u00020\u00170\u00a5\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d9\u0002\u0010\u00a7\u0002R\u001e\u0010\u00da\u0002\u001a\t\u0012\u0004\u0012\u00020\u00060\u00a5\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00da\u0002\u0010\u00a7\u0002R\"\u0010\u00db\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00108\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00db\u0002\u0010\u0092\u0002\u001a\u0006\u0008\u00dc\u0002\u0010\u0094\u0002R\u001e\u0010\u00dd\u0002\u001a\t\u0012\u0004\u0012\u00020\u00140\u00a5\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00dd\u0002\u0010\u00a7\u0002R\"\u0010\u00de\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00108\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00de\u0002\u0010\u0092\u0002\u001a\u0006\u0008\u00df\u0002\u0010\u0094\u0002R\"\u0010\u00cf\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010-0\u00a5\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00cf\u0001\u0010\u00a7\u0002R)\u0010\u00e2\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030\u00e1\u0002\u0018\u00010\u00e0\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00e2\u0002\u0010\u00e3\u0002R\"\u0010\u00e4\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00108\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00e4\u0002\u0010\u0092\u0002\u001a\u0006\u0008\u00e4\u0002\u0010\u0094\u0002R\u001c\u0010\u00e5\u0002\u001a\u0005\u0018\u00010\u00e1\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00e5\u0002\u0010\u00e6\u0002R\u0018\u0010\u00e8\u0002\u001a\u00030\u00e7\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e8\u0002\u0010\u00e9\u0002R\u0018\u0010\u00eb\u0002\u001a\u00030\u00ea\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00eb\u0002\u0010\u00ec\u0002R\u001b\u0010\u00ed\u0002\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ed\u0002\u0010\u0088\u0002R\u001b\u0010\u00ee\u0002\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ee\u0002\u0010\u0088\u0002R\u0014\u0010\u00cd\u0001\u001a\u00020\u00068F\u00a2\u0006\u0008\u001a\u0006\u0008\u00cd\u0001\u0010\u008c\u0002R4\u0010\u00f4\u0002\u001a\u0004\u0018\u00010\u00022\t\u0010\u00ef\u0002\u001a\u0004\u0018\u00010\u00028@@@X\u0081\u000e\u00a2\u0006\u0016\u0012\u0005\u0008\u00f3\u0002\u0010\"\u001a\u0006\u0008\u00f0\u0002\u0010\u00f1\u0002\"\u0005\u0008\u00f2\u0002\u00105R\u0018\u0010\u00f7\u0002\u001a\u00030\u00b1\u00018BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00f5\u0002\u0010\u00f6\u0002\u00a8\u0006\u00fc\u0002"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;",
        "",
        "",
        "cid",
        "Lio/getstream/chat/android/ui/common/helper/ClipboardHandler;",
        "clipboardHandler",
        "",
        "threadLoadOrderOlderToNewer",
        "messageId",
        "parentMessageId",
        "",
        "messageLimit",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "Lec3/f2;",
        "Lio/getstream/chat/android/client/channel/state/ChannelState;",
        "channelState",
        "showSystemMessages",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;",
        "messageFooterVisibility",
        "enforceUniqueReactions",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
        "dateSeparatorHandler",
        "threadDateSeparatorHandler",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;",
        "messagePositionHandler",
        "showDateSeparatorInEmptyThread",
        "showThreadSeparatorInEmptyThread",
        "<init>",
        "(Ljava/lang/String;Lio/getstream/chat/android/ui/common/helper/ClipboardHandler;ZLjava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Lec3/f2;ZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;ZLio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZ)V",
        "Ll83/a0;",
        "disableUnreadLabelButton",
        "()V",
        "hideUnreadSeparator",
        "scrollToFirstUnreadMessage",
        "Lkotlin/Function0;",
        "scrollToBottom",
        "(ILc93/a;)V",
        "baseMessageId",
        "loadNewerMessages",
        "(Ljava/lang/String;I)V",
        "loadOlderMessages",
        "(I)V",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "openRelatedThread",
        "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
        "parentMessage",
        "enterThreadMode",
        "(Lio/getstream/chat/android/models/Message;ILq83/d;)Ljava/lang/Object;",
        "toggleOriginalText",
        "(Ljava/lang/String;)V",
        "enterNormalMode",
        "Lkotlin/Function1;",
        "Ln23/h;",
        "onResult",
        "loadMessageById",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V",
        "scrollToMessage",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "selectMessage",
        "(Lio/getstream/chat/android/models/Message;)V",
        "selectReactions",
        "selectExtendedReactions",
        "Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;",
        "selectedPoll",
        "displayPollMoreOptions",
        "(Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;)V",
        "Lio/getstream/chat/android/models/Poll;",
        "poll",
        "Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;",
        "pollSelectionType",
        "updatePollState",
        "(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;)V",
        "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
        "messageAction",
        "performMessageAction",
        "(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Lq83/d;)Ljava/lang/Object;",
        "dismissMessageAction",
        "(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V",
        "dismissAllMessageActions",
        "removeOverlay",
        "hard",
        "deleteMessage",
        "(Lio/getstream/chat/android/models/Message;Z)V",
        "updateLastSeenMessage",
        "markLastMessageRead",
        "reason",
        "",
        "customData",
        "Lio/getstream/chat/android/models/Flag;",
        "flagMessage",
        "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V",
        "markUnread",
        "(Lio/getstream/chat/android/models/Message;Lkotlin/jvm/functions/Function1;)V",
        "updateMessagePin",
        "Ljava/util/Date;",
        "expiresAt",
        "pinMessage",
        "(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)V",
        "unpinMessage",
        "resendMessage",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "updateUserMute",
        "(Lio/getstream/chat/android/models/User;)V",
        "muteUser",
        "unmuteUser",
        "pollId",
        "Lio/getstream/chat/android/models/Option;",
        "option",
        "castVote",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Option;)V",
        "answer",
        "castAnswer",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "Lio/getstream/chat/android/models/Vote;",
        "vote",
        "removeVote",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Vote;)V",
        "closePoll",
        "Lio/getstream/chat/android/models/Reaction;",
        "reaction",
        "skipPush",
        "reactToMessage",
        "(Lio/getstream/chat/android/models/Reaction;Lio/getstream/chat/android/models/Message;Z)V",
        "getMessageFromListStateById",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;",
        "clearNewMessageState",
        "userId",
        "timeout",
        "(Ljava/lang/String;Ljava/lang/Integer;)V",
        "banUser",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V",
        "unbanUser",
        "shadowBanUser",
        "removeShadowBanFromUser",
        "flagUser",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V",
        "unflagUser",
        "blockUser",
        "unblockUser",
        "Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;",
        "action",
        "performGiphyAction",
        "(Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;)V",
        "Lio/getstream/chat/android/models/Attachment;",
        "attachmentToBeDeleted",
        "removeAttachment",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;)V",
        "setMessagePositionHandler",
        "(Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;)V",
        "setDateSeparatorHandler",
        "(Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;)V",
        "setThreadDateSeparatorHandler",
        "setMessageFooterVisibility",
        "(Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;)V",
        "areSystemMessagesVisible",
        "setSystemMessageVisibility",
        "(Z)V",
        "onCleared",
        "updatePollOption",
        "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)V",
        "(Lio/getstream/chat/android/models/Poll;)V",
        "addPollOption",
        "(Lio/getstream/chat/android/models/Poll;Ljava/lang/String;)V",
        "pauseAudioRecordingAttachments",
        "observeMessagesListState",
        "observeUnreadLabelState",
        "initialFocusMessage",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "lastReadMessageId",
        "focusUnreadMessage",
        "(Ljava/util/List;Ljava/lang/String;)V",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;",
        "newState",
        "updateMessageList",
        "(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)V",
        "endOfOldMessagesReached",
        "updateEndOfOldMessagesReached",
        "currentUser",
        "updateCurrentUser",
        "unreadCount",
        "updateUnreadCount",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;",
        "unreadLabel",
        "updateUnreadLabel",
        "(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;)V",
        "isLoadingOlderMessages",
        "updateIsLoadingOlderMessages",
        "isLoadingNewerMessages",
        "updateIsLoadingNewerMessages",
        "setMessageListState",
        "threadId",
        "messages",
        "endOfOlderMessages",
        "Lio/getstream/chat/android/models/ChannelUserRead;",
        "reads",
        "Lio/getstream/chat/android/models/Member;",
        "members",
        "observeThreadMessagesState",
        "(Ljava/lang/String;Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;)V",
        "isInThread",
        "typingUsers",
        "focusedMessage",
        "Lio/getstream/chat/android/models/Channel;",
        "channel",
        "",
        "ownCapabilities",
        "messagesInOriginalLanguage",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;",
        "groupMessages",
        "(Ljava/util/List;ZLjava/util/List;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;Ljava/util/List;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;Ljava/util/List;ZLio/getstream/chat/android/models/Channel;Ljava/util/Set;Ljava/util/Set;)Ljava/util/List;",
        "membersMap",
        "belongsToFreshlyAddedMember",
        "(Lio/getstream/chat/android/models/ChannelUserRead;Ljava/util/Map;)Z",
        "filterMessagesToShow",
        "(Ljava/util/List;Z)Ljava/util/List;",
        "lastMessage",
        "lastLoadedMessage",
        "Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;",
        "typingItemState",
        "Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;",
        "getNewMessageState",
        "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;)Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;",
        "getNewMessageStateForMessage",
        "(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;",
        "loadNewerChannelMessages",
        "Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;",
        "threadMode",
        "loadNewerMessagesInThread",
        "(Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;)V",
        "threadLoadMore",
        "(Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;I)V",
        "enterThreadSequential",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "focusMessage",
        "focusChannelMessage",
        "threadMessageId",
        "focusThreadMessage",
        "removeMessageFocus",
        "Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;",
        "selectedMessageState",
        "changeSelectMessageState",
        "(Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;)V",
        "copyMessage",
        "markLastMessageReadInternal",
        "markChannelAsRead",
        "markThreadAsRead",
        "showEmptyState",
        "pauseRunningAudioRecordings",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;",
        "event",
        "emitEvent",
        "(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;)V",
        "Ln23/e;",
        "error",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;",
        "onError",
        "onActionResult",
        "(Ln23/e;Lkotlin/jvm/functions/Function1;)V",
        "Ljava/lang/String;",
        "Lio/getstream/chat/android/ui/common/helper/ClipboardHandler;",
        "Z",
        "getThreadLoadOrderOlderToNewer",
        "()Z",
        "I",
        "getMessageLimit",
        "()I",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "Lec3/f2;",
        "getChannelState",
        "()Lec3/f2;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lbc3/c0;",
        "scope",
        "Lbc3/c0;",
        "Lio/getstream/chat/android/models/ConnectionState;",
        "connectionState",
        "getConnectionState",
        "getUser",
        "Lec3/p1;",
        "unreadLabelState",
        "Lec3/p1;",
        "getUnreadLabelState",
        "()Lec3/p1;",
        "Lec3/o1;",
        "showUnreadButtonState",
        "Lec3/o1;",
        "lastProcessedReadMessageId",
        "Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;",
        "originalTranslationsStore$delegate",
        "getOriginalTranslationsStore",
        "()Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;",
        "originalTranslationsStore",
        "getOwnCapabilities",
        "getOwnCapabilities$annotations",
        "getChannel",
        "getChannel$annotations",
        "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;",
        "_mode",
        "mode",
        "getMode",
        "isStartedForThread",
        "_events",
        "Lec3/t1;",
        "events",
        "Lec3/t1;",
        "getEvents",
        "()Lec3/t1;",
        "errorEvents",
        "getErrorEvents",
        "getUnreadCount",
        "getTypingUsers",
        "_messageListState",
        "messageListState",
        "getMessageListState",
        "Lio/getstream/chat/android/ui/common/state/messages/poll/PollState;",
        "_pollState",
        "pollState",
        "getPollState",
        "_threadListState",
        "threadListState",
        "getThreadListState",
        "listState",
        "getListState",
        "Lio/getstream/chat/android/models/Message;",
        "lastLoadedThreadMessage",
        "_messageActions",
        "messageActions",
        "getMessageActions",
        "_messagePositionHandler",
        "_dateSeparatorHandler",
        "_threadDateSeparatorHandler",
        "_showSystemMessagesState",
        "showSystemMessagesState",
        "getShowSystemMessagesState",
        "_messageFooterVisibilityState",
        "messageFooterVisibilityState",
        "getMessageFooterVisibilityState",
        "Ll83/k;",
        "Lbc3/k1;",
        "removeFocusedMessageJob",
        "Ll83/k;",
        "isInsideSearch",
        "threadJob",
        "Lbc3/k1;",
        "Lio/getstream/chat/android/core/utils/Debouncer;",
        "debouncer",
        "Lio/getstream/chat/android/core/utils/Debouncer;",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/UnreadLabelCalculator;",
        "unreadLabelCalculator",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/UnreadLabelCalculator;",
        "lastSeenChannelMessageId",
        "lastSeenThreadMessageId",
        "value",
        "getLastSeenMessageId$stream_chat_android_ui_common_release",
        "()Ljava/lang/String;",
        "setLastSeenMessageId$stream_chat_android_ui_common_release",
        "getLastSeenMessageId$stream_chat_android_ui_common_release$annotations",
        "lastSeenMessageId",
        "getMessagesState",
        "()Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;",
        "messagesState",
        "Companion",
        "Event",
        "ErrorEvent",
        "UnreadLabel",
        "stream-chat-android-ui-common_release"
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
.field public static final $stable:I = 0x8

.field public static final Companion:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Companion;

.field public static final DEFAULT_MESSAGES_LIMIT:I = 0x1e

.field public static final MEMBERSHIP_AND_LAST_READ_THRESHOLD_MS:J = 0x64L

.field public static final REMOVE_MESSAGE_FOCUS_DELAY:J = 0x7d0L


# instance fields
.field private final _dateSeparatorHandler:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _events:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final _messageActions:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _messageFooterVisibilityState:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _messageListState:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _messagePositionHandler:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _mode:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _pollState:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _showSystemMessagesState:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _threadDateSeparatorHandler:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _threadListState:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final channel:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final channelState:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private final cid:Ljava/lang/String;

.field private final clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

.field private final clipboardHandler:Lio/getstream/chat/android/ui/common/helper/ClipboardHandler;

.field private final connectionState:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final dateSeparatorHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

.field private final debouncer:Lio/getstream/chat/android/core/utils/Debouncer;

.field private final enforceUniqueReactions:Z

.field private final errorEvents:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final events:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private focusedMessage:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final isInsideSearch:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final isStartedForThread:Z

.field private lastLoadedMessage:Lio/getstream/chat/android/models/Message;

.field private lastLoadedThreadMessage:Lio/getstream/chat/android/models/Message;

.field private lastProcessedReadMessageId:Ljava/lang/String;

.field private volatile lastSeenChannelMessageId:Ljava/lang/String;

.field private volatile lastSeenThreadMessageId:Ljava/lang/String;

.field private final listState:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;

.field private final messageActions:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final messageFooterVisibility:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;

.field private final messageFooterVisibilityState:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final messageId:Ljava/lang/String;

.field private final messageLimit:I

.field private final messageListState:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final messagePositionHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;

.field private final mode:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final originalTranslationsStore$delegate:Ll83/h;

.field private final ownCapabilities:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final parentMessageId:Ljava/lang/String;

.field private final pollState:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private removeFocusedMessageJob:Ll83/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/k;"
        }
    .end annotation
.end field

.field private final scope:Lbc3/c0;

.field private final showDateSeparatorInEmptyThread:Z

.field private final showSystemMessages:Z

.field private final showSystemMessagesState:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final showThreadSeparatorInEmptyThread:Z

.field private final showUnreadButtonState:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final threadDateSeparatorHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

.field private threadJob:Lbc3/k1;

.field private final threadListState:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final threadLoadOrderOlderToNewer:Z

.field private final typingUsers:Lec3/f2;
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

.field private final unreadLabelCalculator:Lio/getstream/chat/android/ui/common/feature/messages/list/UnreadLabelCalculator;

.field private final unreadLabelState:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final user:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->Companion:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/ui/common/helper/ClipboardHandler;ZLjava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Lec3/f2;ZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;ZLio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZ)V
    .locals 53
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/ui/common/helper/ClipboardHandler;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/client/setup/state/ClientState;",
            "Lec3/f2;",
            "Z",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;",
            "Z",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;",
            "ZZ)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p11

    move-object/from16 v10, p13

    move-object/from16 v11, p14

    move-object/from16 v12, p15

    const-string v13, "cid"

    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "clipboardHandler"

    invoke-static {v2, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "chatClient"

    invoke-static {v6, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "clientState"

    invoke-static {v7, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "channelState"

    invoke-static {v8, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "messageFooterVisibility"

    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "dateSeparatorHandler"

    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "threadDateSeparatorHandler"

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "messagePositionHandler"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->cid:Ljava/lang/String;

    .line 3
    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->clipboardHandler:Lio/getstream/chat/android/ui/common/helper/ClipboardHandler;

    move/from16 v2, p3

    .line 4
    iput-boolean v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->threadLoadOrderOlderToNewer:Z

    .line 5
    iput-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->messageId:Ljava/lang/String;

    .line 6
    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->parentMessageId:Ljava/lang/String;

    .line 7
    iput v5, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->messageLimit:I

    .line 8
    iput-object v6, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 9
    iput-object v7, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    .line 10
    iput-object v8, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->channelState:Lec3/f2;

    move/from16 v2, p10

    .line 11
    iput-boolean v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->showSystemMessages:Z

    .line 12
    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->messageFooterVisibility:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;

    move/from16 v6, p12

    .line 13
    iput-boolean v6, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->enforceUniqueReactions:Z

    .line 14
    iput-object v10, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->dateSeparatorHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

    .line 15
    iput-object v11, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->threadDateSeparatorHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

    .line 16
    iput-object v12, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->messagePositionHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;

    move/from16 v6, p16

    .line 17
    iput-boolean v6, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->showDateSeparatorInEmptyThread:Z

    move/from16 v6, p17

    .line 18
    iput-boolean v6, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->showThreadSeparatorInEmptyThread:Z

    .line 19
    const-string v6, "MessageListController"

    invoke-static {v0, v6}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v6

    iput-object v6, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->logger$delegate:Ll83/h;

    .line 20
    sget-object v6, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v6}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getImmediate()Lbc3/z;

    move-result-object v6

    invoke-static {v6}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v6

    iput-object v6, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scope:Lbc3/c0;

    .line 21
    invoke-interface {v7}, Lio/getstream/chat/android/client/setup/state/ClientState;->getConnectionState()Lec3/f2;

    move-result-object v13

    iput-object v13, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->connectionState:Lec3/f2;

    .line 22
    invoke-interface {v7}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object v7

    iput-object v7, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->user:Lec3/f2;

    const/4 v7, 0x0

    .line 23
    invoke-static {v7}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v13

    iput-object v13, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unreadLabelState:Lec3/p1;

    const/4 v13, 0x5

    const/4 v14, 0x0

    const/4 v15, 0x1

    .line 24
    invoke-static {v14, v15, v7, v13}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v13

    iput-object v13, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->showUnreadButtonState:Lec3/o1;

    .line 25
    new-instance v13, Lio/getstream/chat/android/ui/common/feature/messages/list/b;

    const/4 v15, 0x0

    invoke-direct {v13, v0, v15}, Lio/getstream/chat/android/ui/common/feature/messages/list/b;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-static {v13}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v13

    iput-object v13, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->originalTranslationsStore$delegate:Ll83/h;

    .line 26
    new-instance v13, Lch/i;

    const/4 v15, 0x2

    invoke-direct {v13, v8, v15}, Lch/i;-><init>(Lec3/l;I)V

    .line 27
    new-instance v15, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$special$$inlined$flatMapLatest$1;

    const/4 v14, 0x3

    .line 28
    invoke-direct {v15, v14, v7}, Ls83/i;-><init>(ILq83/d;)V

    .line 29
    invoke-static {v13, v15}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v13

    .line 30
    new-instance v15, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$special$$inlined$map$1;

    invoke-direct {v15, v13}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$special$$inlined$map$1;-><init>(Lec3/l;)V

    .line 31
    sget-object v13, Lec3/z1;->a:Lec3/b2;

    sget-object v7, Lm83/a0;->w:Lm83/a0;

    invoke-static {v15, v6, v13, v7}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v15

    iput-object v15, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->ownCapabilities:Lec3/f2;

    .line 32
    new-instance v15, Lch/i;

    const/4 v14, 0x2

    invoke-direct {v15, v8, v14}, Lch/i;-><init>(Lec3/l;I)V

    .line 33
    new-instance v14, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$special$$inlined$flatMapLatest$2;

    const/4 v2, 0x0

    const/4 v4, 0x3

    .line 34
    invoke-direct {v14, v4, v2}, Ls83/i;-><init>(ILq83/d;)V

    .line 35
    invoke-static {v15, v14}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v4

    .line 36
    new-instance v14, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$channel$2;

    invoke-direct {v14, v0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$channel$2;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lq83/d;)V

    .line 37
    new-instance v2, Lec3/j1;

    const/4 v15, 0x0

    invoke-direct {v2, v4, v14, v15}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    .line 38
    invoke-static {v2}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object v2

    .line 39
    new-instance v14, Lio/getstream/chat/android/models/Channel;

    const/16 v51, 0x7

    const/16 v52, 0x0

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

    const/16 v50, -0x1

    invoke-direct/range {v14 .. v52}, Lio/getstream/chat/android/models/Channel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2, v6, v13, v14}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->channel:Lec3/f2;

    .line 40
    sget-object v2, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$Normal;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/MessageMode$Normal;

    invoke-static {v2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_mode:Lec3/p1;

    .line 41
    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->mode:Lec3/f2;

    if-eqz p5, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 42
    :goto_0
    iput-boolean v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->isStartedForThread:Z

    const/4 v4, 0x7

    const/4 v14, 0x0

    const/4 v15, 0x0

    .line 43
    invoke-static {v15, v15, v14, v4}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v4

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_events:Lec3/o1;

    .line 44
    invoke-static {v4}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object v15

    iput-object v15, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->events:Lec3/t1;

    .line 45
    new-instance v15, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$special$$inlined$filterIsInstance$1;

    invoke-direct {v15, v4}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$special$$inlined$filterIsInstance$1;-><init>(Lec3/l;)V

    .line 46
    invoke-static {v15, v6, v13, v14}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v4

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->errorEvents:Lec3/f2;

    .line 47
    new-instance v4, Lch/i;

    const/4 v15, 0x2

    invoke-direct {v4, v8, v15}, Lch/i;-><init>(Lec3/l;I)V

    .line 48
    new-instance v15, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$special$$inlined$flatMapLatest$3;

    move-object/from16 p12, v7

    const/4 v7, 0x3

    .line 49
    invoke-direct {v15, v7, v14}, Ls83/i;-><init>(ILq83/d;)V

    .line 50
    invoke-static {v4, v15}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v4

    const/4 v15, 0x0

    .line 51
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v4, v6, v13, v15}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v4

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unreadCount:Lec3/f2;

    .line 52
    new-instance v4, Lch/i;

    const/4 v15, 0x2

    invoke-direct {v4, v8, v15}, Lch/i;-><init>(Lec3/l;I)V

    .line 53
    new-instance v15, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$special$$inlined$flatMapLatest$4;

    .line 54
    invoke-direct {v15, v7, v14}, Ls83/i;-><init>(ILq83/d;)V

    .line 55
    invoke-static {v4, v15}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v4

    .line 56
    new-instance v7, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$special$$inlined$map$2;

    invoke-direct {v7, v4}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$special$$inlined$map$2;-><init>(Lec3/l;)V

    .line 57
    sget-object v4, Lm83/y;->w:Lm83/y;

    invoke-static {v7, v6, v13, v4}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v4

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->typingUsers:Lec3/f2;

    .line 58
    new-instance v14, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    const/16 v27, 0xff7

    const/16 v28, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v14 .. v28}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;-><init>(Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v14}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageListState:Lec3/p1;

    .line 59
    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->messageListState:Lec3/f2;

    .line 60
    new-instance v4, Lio/getstream/chat/android/ui/common/state/messages/poll/PollState;

    const/4 v7, 0x1

    const/4 v14, 0x0

    invoke-direct {v4, v14, v7, v14}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollState;-><init>(Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v4}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_pollState:Lec3/p1;

    .line 61
    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->pollState:Lec3/f2;

    .line 62
    new-instance v14, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    invoke-direct/range {v14 .. v28}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;-><init>(Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v14}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_threadListState:Lec3/p1;

    .line 63
    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->threadListState:Lec3/f2;

    .line 64
    new-instance v4, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$special$$inlined$flatMapLatest$5;

    const/4 v14, 0x0

    invoke-direct {v4, v14, v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$special$$inlined$flatMapLatest$5;-><init>(Lq83/d;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)V

    invoke-static {v2, v4}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v2

    .line 65
    new-instance v14, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    invoke-direct/range {v14 .. v28}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;-><init>(Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2, v6, v13, v14}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->listState:Lec3/f2;

    .line 66
    invoke-static/range {p12 .. p12}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageActions:Lec3/p1;

    .line 67
    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->messageActions:Lec3/f2;

    .line 68
    invoke-static {v12}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messagePositionHandler:Lec3/p1;

    .line 69
    invoke-static {v10}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_dateSeparatorHandler:Lec3/p1;

    .line 70
    invoke-static {v11}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_threadDateSeparatorHandler:Lec3/p1;

    .line 71
    invoke-static/range {p10 .. p10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_showSystemMessagesState:Lec3/p1;

    .line 72
    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->showSystemMessagesState:Lec3/f2;

    .line 73
    invoke-static {v9}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageFooterVisibilityState:Lec3/p1;

    .line 74
    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->messageFooterVisibilityState:Lec3/f2;

    const/4 v14, 0x0

    .line 75
    invoke-static {v14}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->focusedMessage:Lec3/p1;

    .line 76
    new-instance v2, Lch/i;

    const/4 v4, 0x2

    invoke-direct {v2, v8, v4}, Lch/i;-><init>(Lec3/l;I)V

    .line 77
    new-instance v4, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$special$$inlined$flatMapLatest$6;

    const/4 v7, 0x3

    .line 78
    invoke-direct {v4, v7, v14}, Ls83/i;-><init>(ILq83/d;)V

    .line 79
    invoke-static {v2, v4}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v2

    .line 80
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2, v6, v13, v4}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->isInsideSearch:Lec3/f2;

    .line 81
    new-instance v2, Lio/getstream/chat/android/core/utils/Debouncer;

    const-wide/16 v7, 0xc8

    invoke-direct {v2, v7, v8, v6}, Lio/getstream/chat/android/core/utils/Debouncer;-><init>(JLbc3/c0;)V

    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->debouncer:Lio/getstream/chat/android/core/utils/Debouncer;

    .line 82
    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/list/UnreadLabelCalculator;

    .line 83
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 84
    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unreadLabelCalculator:Lio/getstream/chat/android/ui/common/feature/messages/list/UnreadLabelCalculator;

    .line 85
    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v2

    .line 86
    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    iget-object v7, v2, Lb23/k;->a:Ljava/lang/String;

    .line 87
    sget-object v8, Lb23/g;->z:Lb23/g;

    invoke-interface {v4, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 88
    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    .line 89
    const-string v4, ", messageId: "

    const-string v9, ", messageLimit: "

    .line 90
    const-string v10, "<init> cid: "

    invoke-static {v10, v1, v4, v3, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 91
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v14, 0x0

    .line 92
    invoke-interface {v2, v8, v7, v1, v14}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_1
    const/4 v14, 0x0

    .line 93
    :goto_1
    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$2;

    invoke-direct {v1, v0, v14}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$2;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lq83/d;)V

    const/4 v7, 0x3

    invoke-static {v6, v14, v14, v1, v7}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/ui/common/helper/ClipboardHandler;ZLjava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Lec3/f2;ZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;ZLio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 21

    move/from16 v0, p18

    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v7, v2

    goto :goto_0

    :cond_0
    move-object/from16 v7, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    move-object v8, v2

    goto :goto_1

    :cond_1
    move-object/from16 v8, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    const/16 v1, 0x1e

    move v9, v1

    goto :goto_2

    :cond_2
    move/from16 v9, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    .line 100
    sget-object v1, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v1

    move-object v10, v1

    goto :goto_3

    :cond_3
    move-object/from16 v10, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    .line 101
    invoke-virtual {v10}, Lio/getstream/chat/android/client/ChatClient;->getClientState()Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object v1

    move-object v11, v1

    goto :goto_4

    :cond_4
    move-object/from16 v11, p8

    :goto_4
    and-int/lit16 v1, v0, 0x200

    const/4 v3, 0x1

    if-eqz v1, :cond_5

    move v13, v3

    goto :goto_5

    :cond_5
    move/from16 v13, p10

    :goto_5
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_6

    .line 102
    sget-object v1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$LastInGroup;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$LastInGroup;

    move-object v14, v1

    goto :goto_6

    :cond_6
    move-object/from16 v14, p11

    :goto_6
    and-int/lit16 v1, v0, 0x800

    const/4 v4, 0x0

    if-eqz v1, :cond_7

    move v15, v4

    goto :goto_7

    :cond_7
    move/from16 v15, p12

    :goto_7
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_8

    .line 103
    sget-object v1, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;->Companion:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;->getDefaultDateSeparatorHandler()Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

    move-result-object v1

    move-object/from16 v16, v1

    goto :goto_8

    :cond_8
    move-object/from16 v16, p13

    :goto_8
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_9

    .line 104
    sget-object v1, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;->Companion:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/list/a;

    const/4 v5, 0x1

    invoke-direct {v1, v5}, Lio/getstream/chat/android/ui/common/feature/messages/list/a;-><init>(I)V

    move-object/from16 v17, v1

    goto :goto_9

    :cond_9
    move-object/from16 v17, p14

    :goto_9
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_a

    .line 106
    sget-object v1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;->Companion:Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;

    const-wide/16 v5, 0x0

    invoke-static {v1, v5, v6, v3, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;->defaultHandler$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;JILjava/lang/Object;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;

    move-result-object v1

    move-object/from16 v18, v1

    goto :goto_a

    :cond_a
    move-object/from16 v18, p15

    :goto_a
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_b

    move/from16 v19, v4

    goto :goto_b

    :cond_b
    move/from16 v19, p16

    :goto_b
    const/high16 v1, 0x10000

    and-int/2addr v0, v1

    if-eqz v0, :cond_c

    move/from16 v20, v4

    move-object/from16 v3, p0

    move-object/from16 v5, p2

    move/from16 v6, p3

    move-object/from16 v12, p9

    move-object/from16 v4, p1

    goto :goto_c

    :cond_c
    move/from16 v20, p17

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move/from16 v6, p3

    move-object/from16 v12, p9

    .line 107
    :goto_c
    invoke-direct/range {v3 .. v20}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;-><init>(Ljava/lang/String;Lio/getstream/chat/android/ui/common/helper/ClipboardHandler;ZLjava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Lec3/f2;ZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;ZLio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZ)V

    return-void
.end method

.method public static synthetic A(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Poll;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->closePoll$lambda$116(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Poll;)Ll83/a0;

    return-void
.end method

.method public static synthetic B(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->resendMessage$lambda$106(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;

    return-void
.end method

.method public static synthetic C(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Reaction;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->reactToMessage$lambda$120(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Reaction;Ln23/e;)Ll83/a0;

    return-void
.end method

.method public static synthetic D(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->removeAttachment$lambda$155$lambda$151(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;

    return-void
.end method

.method public static synthetic E(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unflagUser$lambda$141(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;

    return-void
.end method

.method public static synthetic F(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Ln23/h;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->loadMessageById$lambda$71(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Ln23/h;)V

    return-void
.end method

.method public static synthetic G(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->removeShadowBanFromUser$lambda$137(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;

    return-void
.end method

.method public static synthetic H(Ln23/h;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->loadMessageById$lambda$68(Ln23/h;)Ll83/a0;

    return-void
.end method

.method public static synthetic I(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->removeAttachment$lambda$155$lambda$153(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;

    return-void
.end method

.method public static synthetic J(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->markThreadAsRead$lambda$91(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Ln23/e;)Ll83/a0;

    return-void
.end method

.method public static synthetic K(Lc93/a;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/h;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scrollToBottom$lambda$55(Lc93/a;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/h;)V

    return-void
.end method

.method public static synthetic L(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->removeVote$lambda$115(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;

    return-void
.end method

.method public static synthetic M(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->muteUser$lambda$127(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;

    return-void
.end method

.method public static synthetic N(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->pinMessage$lambda$101(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;

    return-void
.end method

.method public static synthetic O(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/h;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->threadLoadMore$lambda$63(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/h;)V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unmuteUser$lambda$111(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;

    return-void
.end method

.method public static final synthetic access$enterThreadSequential(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->enterThreadSequential(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$enterThreadSequential(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->enterThreadSequential(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$filterMessagesToShow(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/util/List;Z)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->filterMessagesToShow(Ljava/util/List;Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$focusChannelMessage(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->focusChannelMessage(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$focusThreadMessage(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->focusThreadMessage(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$focusUnreadMessage(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/util/List;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->focusUnreadMessage(Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$getChatClient$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lio/getstream/chat/android/client/ChatClient;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    return-object p0
.end method

.method public static final synthetic access$getCid$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->cid:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getClientState$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lio/getstream/chat/android/client/setup/state/ClientState;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    return-object p0
.end method

.method public static final synthetic access$getFocusedMessage$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->focusedMessage:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic access$getLastLoadedThreadMessage$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lio/getstream/chat/android/models/Message;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->lastLoadedThreadMessage:Lio/getstream/chat/android/models/Message;

    return-object p0
.end method

.method public static final synthetic access$getLastProcessedReadMessageId$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->lastProcessedReadMessageId:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMessageId$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->messageId:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getMessagesState(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getMessagesState()Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getNewMessageState(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;)Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getNewMessageState(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;)Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getOriginalTranslationsStore(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getOriginalTranslationsStore()Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getParentMessageId$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->parentMessageId:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getUnreadLabelCalculator$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lio/getstream/chat/android/ui/common/feature/messages/list/UnreadLabelCalculator;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unreadLabelCalculator:Lio/getstream/chat/android/ui/common/feature/messages/list/UnreadLabelCalculator;

    return-object p0
.end method

.method public static final synthetic access$get_dateSeparatorHandler$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_dateSeparatorHandler:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic access$get_events$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_events:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic access$get_messageFooterVisibilityState$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageFooterVisibilityState:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic access$get_messageListState$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageListState:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic access$get_messagePositionHandler$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messagePositionHandler:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic access$get_mode$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_mode:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic access$get_showSystemMessagesState$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_showSystemMessagesState:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic access$get_threadDateSeparatorHandler$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_threadDateSeparatorHandler:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic access$get_threadListState$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_threadListState:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic access$groupMessages(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/util/List;ZLjava/util/List;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;Ljava/util/List;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;Ljava/util/List;ZLio/getstream/chat/android/models/Channel;Ljava/util/Set;Ljava/util/Set;)Ljava/util/List;
    .locals 0

    invoke-direct/range {p0 .. p14}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->groupMessages(Ljava/util/List;ZLjava/util/List;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;Ljava/util/List;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;Ljava/util/List;ZLio/getstream/chat/android/models/Channel;Ljava/util/Set;Ljava/util/Set;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$initialFocusMessage(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->initialFocusMessage(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$observeMessagesListState(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->observeMessagesListState()V

    return-void
.end method

.method public static final synthetic access$observeMessagesListState$updateUnreadLabel(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->observeMessagesListState$updateUnreadLabel(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;Lq83/d;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic access$setLastLoadedThreadMessage$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Message;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->lastLoadedThreadMessage:Lio/getstream/chat/android/models/Message;

    return-void
.end method

.method public static final synthetic access$setLastProcessedReadMessageId$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->lastProcessedReadMessageId:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setMessageListState(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->setMessageListState(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)V

    return-void
.end method

.method public static final synthetic access$setRemoveFocusedMessageJob$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ll83/k;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->removeFocusedMessageJob:Ll83/k;

    return-void
.end method

.method public static final synthetic access$showEmptyState(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->showEmptyState()V

    return-void
.end method

.method public static final synthetic access$updateCurrentUser(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/User;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->updateCurrentUser(Lio/getstream/chat/android/models/User;)V

    return-void
.end method

.method public static final synthetic access$updateEndOfOldMessagesReached(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->updateEndOfOldMessagesReached(Z)V

    return-void
.end method

.method public static final synthetic access$updateIsLoadingNewerMessages(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->updateIsLoadingNewerMessages(Z)V

    return-void
.end method

.method public static final synthetic access$updateIsLoadingOlderMessages(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->updateIsLoadingOlderMessages(Z)V

    return-void
.end method

.method public static final synthetic access$updateMessageList(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->updateMessageList(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)V

    return-void
.end method

.method public static final synthetic access$updateUnreadCount(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->updateUnreadCount(I)V

    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->banUser$lambda$131(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;

    return-void
.end method

.method public static synthetic banUser$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)V
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
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->banUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method

.method private static final banUser$lambda$131(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;
    .locals 5

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const/4 v2, 0x0

    invoke-interface {v1, v3, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->banUser$lambda$131$lambda$130(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$BlockUserError;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->emitEvent(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final banUser$lambda$131$lambda$130(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$BlockUserError;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$BlockUserError;-><init>(Ln23/e;)V

    return-object v0
.end method

.method private final belongsToFreshlyAddedMember(Lio/getstream/chat/android/models/ChannelUserRead;Ljava/util/Map;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Member;",
            ">;)Z"
        }
    .end annotation

    invoke-virtual {p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/models/Member;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Member;->getCreatedAt()Ljava/util/Date;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastRead()Ljava/util/Date;

    move-result-object p1

    invoke-static {p2, p1}, Lio/getstream/chat/android/core/utils/date/DateUtils;->diff(Ljava/util/Date;Ljava/util/Date;)Lio/getstream/chat/android/models/TimeDuration;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/TimeDuration;->getMillis()J

    move-result-wide p1

    goto :goto_0

    :cond_0
    const-wide p1, 0x7fffffffffffffffL

    :goto_0
    const-wide/16 v0, 0x64

    cmp-long p1, p1, v0

    if-gez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private static final blockUser$lambda$143(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;
    .locals 5

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const/4 v2, 0x0

    invoke-interface {v1, v3, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->blockUser$lambda$143$lambda$142(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$BlockUserError;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->emitEvent(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final blockUser$lambda$143$lambda$142(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$BlockUserError;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$BlockUserError;-><init>(Ln23/e;)V

    return-object v0
.end method

.method public static synthetic c(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;Ln23/h;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->removeAttachment$lambda$155(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;Ln23/h;)V

    return-void
.end method

.method private static final castVote$lambda$113(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;
    .locals 5

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const/4 v2, 0x0

    invoke-interface {v1, v3, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->castVote$lambda$113$lambda$112(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PollCastingVoteError;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->emitEvent(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final castVote$lambda$113$lambda$112(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PollCastingVoteError;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PollCastingVoteError;-><init>(Ln23/e;)V

    return-object v0
.end method

.method private final changeSelectMessageState(Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;)V
    .locals 19

    move-object/from16 v0, p0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->isInThread()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_threadListState:Lec3/p1;

    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    const/16 v16, 0xbff

    const/16 v17, 0x0

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

    move-object/from16 v14, p1

    invoke-static/range {v3 .. v17}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v2

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_0
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageListState:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    const/16 v17, 0xbff

    const/16 v18, 0x0

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

    move-object/from16 v15, p1

    invoke-static/range {v4 .. v18}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->setMessageListState(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)V

    return-void
.end method

.method private static final closePoll$lambda$116(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Poll;)Ll83/a0;
    .locals 1

    const-string v0, "poll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event$PollClosingSuccess;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event$PollClosingSuccess;-><init>(Lio/getstream/chat/android/models/Poll;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->emitEvent(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final closePoll$lambda$117(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$closePoll$2$1;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$closePoll$2$1;

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->onActionResult(Ln23/e;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final copyMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->clipboardHandler:Lio/getstream/chat/android/ui/common/helper/ClipboardHandler;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/common/helper/ClipboardHandler;->copyMessage(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public static synthetic d(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unpinMessage$lambda$104(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;

    return-void
.end method

.method public static synthetic deleteMessage$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Message;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->deleteMessage(Lio/getstream/chat/android/models/Message;Z)V

    return-void
.end method

.method private static final deleteMessage$lambda$79(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;ZLn23/e;)Ll83/a0;
    .locals 6

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object p0

    iget-object v0, p0, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->F:Lb23/g;

    iget-object v2, p0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p2}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->extractCause(Ln23/e;)Ljava/lang/Throwable;

    move-result-object p2

    const-string v3, ", Hard: "

    const-string v4, ". Cause: "

    const-string v5, "Could not delete message: "

    invoke-static {v5, v0, v3, v4, p1}, Lm4/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ". If you\'re using OfflinePlugin, the message should be deleted in the database and it will be deleted in the backend when the SDK sync its information."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p0, v1, v2, p1, p2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic e(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;Lio/getstream/chat/android/models/Message;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->performGiphyAction$lambda$147(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;Lio/getstream/chat/android/models/Message;Ln23/e;)Ll83/a0;

    return-void
.end method

.method private final emitEvent(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;)V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$emitEvent$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$emitEvent$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static synthetic enterThreadMode$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Message;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    iget p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->messageLimit:I

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->enterThreadMode(Lio/getstream/chat/android/models/Message;ILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final enterThreadSequential(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 11
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

    instance-of v0, p2, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$1;

    iget v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    .line 1
    iget v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    .line 2
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object p2

    .line 3
    iget-object v2, p2, Lb23/k;->c:Lb23/e;

    iget-object v5, p2, Lb23/k;->a:Ljava/lang/String;

    .line 4
    sget-object v6, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 5
    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    .line 6
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v7

    const-string v8, ", text: "

    const-string v9, ")"

    .line 7
    const-string v10, "[enterThreadSequential] parentMessage(id: "

    invoke-static {v10, v2, v8, v7, v9}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 8
    invoke-interface {p2, v6, v5, v2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9
    :cond_3
    iget-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 10
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    .line 11
    iget-boolean v5, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->threadLoadOrderOlderToNewer:Z

    .line 12
    iput-object p1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$1;->label:I

    const/16 v4, 0x1e

    invoke-static {p2, v2, v4, v5, v0}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->awaitRepliesAsState(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;IZLq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    .line 13
    :cond_4
    :goto_1
    check-cast p2, Lio/getstream/chat/android/client/api/state/ThreadState;

    .line 14
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->channelState:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/channel/state/ChannelState;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-nez v0, :cond_5

    return-object v1

    .line 15
    :cond_5
    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageActions:Lec3/p1;

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Set;

    new-instance v5, Lio/getstream/chat/android/ui/common/state/messages/Reply;

    invoke-direct {v5, p1}, Lio/getstream/chat/android/ui/common/state/messages/Reply;-><init>(Lio/getstream/chat/android/models/Message;)V

    invoke-static {v5, v4}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v4

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    invoke-virtual {v2, v3, v4}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_mode:Lec3/p1;

    new-instance v4, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    invoke-direct {v4, p1, p2}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/api/state/ThreadState;)V

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    invoke-virtual {v2, v3, v4}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    invoke-interface {p2}, Lio/getstream/chat/android/client/api/state/ThreadState;->getParentId()Ljava/lang/String;

    move-result-object v6

    .line 20
    invoke-interface {p2}, Lio/getstream/chat/android/client/api/state/ThreadState;->getMessages()Lec3/f2;

    move-result-object v7

    .line 21
    invoke-interface {p2}, Lio/getstream/chat/android/client/api/state/ThreadState;->getEndOfOlderMessages()Lec3/f2;

    move-result-object v8

    .line 22
    invoke-interface {v0}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getReads()Lec3/f2;

    move-result-object v9

    .line 23
    invoke-interface {v0}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getMembers()Lec3/f2;

    move-result-object v10

    move-object v5, p0

    .line 24
    invoke-direct/range {v5 .. v10}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->observeThreadMessagesState(Ljava/lang/String;Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;)V

    return-object v1
.end method

.method private final enterThreadSequential(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
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

    instance-of v0, p2, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$3;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$3;

    iget v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$3;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$3;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$3;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$3;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$3;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    .line 32
    iget v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$3;->label:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$3;->L$1:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$3;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$3;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    .line 33
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object p2

    .line 34
    iget-object v2, p2, Lb23/k;->c:Lb23/e;

    iget-object v7, p2, Lb23/k;->a:Ljava/lang/String;

    .line 35
    sget-object v8, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 36
    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    .line 37
    const-string v2, "[enterThreadSequential] parentMessageId: "

    .line 38
    invoke-static {v2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 39
    invoke-interface {p2, v8, v7, v2, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    :cond_4
    iget-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p2, p1}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->getMessageUsingCache(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    iput-object v6, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$3;->L$0:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$3;->label:I

    check-cast p1, Lo23/h;

    invoke-virtual {p1, v0}, Lo23/h;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_2

    .line 41
    :cond_5
    :goto_1
    check-cast p2, Ln23/h;

    .line 42
    instance-of p1, p2, Ln23/g;

    if-eqz p1, :cond_6

    .line 43
    check-cast p2, Ln23/g;

    .line 44
    iget-object p1, p2, Ln23/g;->a:Ljava/lang/Object;

    .line 45
    check-cast p1, Lio/getstream/chat/android/models/Message;

    iput-object v6, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$3;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$3;->L$1:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadSequential$3;->label:I

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->enterThreadSequential(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_2
    return-object v1

    .line 46
    :cond_6
    instance-of p1, p2, Ln23/f;

    if-eqz p1, :cond_8

    .line 47
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object p1

    .line 48
    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    .line 49
    sget-object v2, Lb23/g;->F:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 50
    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    .line 51
    check-cast p2, Ln23/f;

    .line 52
    iget-object p2, p2, Ln23/f;->a:Ln23/e;

    .line 53
    invoke-virtual {p2}, Ln23/e;->a()Ljava/lang/String;

    move-result-object p2

    const-string v0, "[enterThreadSequential] -> Could not get message: "

    const-string v4, "."

    .line 54
    invoke-static {v0, p2, v4}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 55
    invoke-interface {p1, v2, v1, p2, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    return-object v3

    .line 56
    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public static f(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->markLastMessageReadInternal()V

    return-void
.end method

.method private final filterMessagesToShow(Ljava/util/List;Z)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;Z)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-static {v2}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isSystem(Lio/getstream/chat/android/models/Message;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {v2}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isError(Lio/getstream/chat/android/models/Message;)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    if-eqz p2, :cond_0

    :cond_2
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static synthetic flagMessage$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    new-instance p4, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/16 p5, 0x15

    invoke-direct {p4, p5}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->flagMessage(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final flagMessage$lambda$92(Ln23/h;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final flagMessage$lambda$94(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/h;)V
    .locals 4

    const-string v0, "response"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of p0, p2, Ln23/f;

    if-eqz p0, :cond_1

    check-cast p2, Ln23/f;

    iget-object p0, p2, Ln23/f;->a:Ln23/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ln23/e;->a()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->F:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const/4 v1, 0x0

    invoke-interface {v0, v3, v2, p2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->flagMessage$lambda$94$lambda$93(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$FlagMessageError;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->emitEvent(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;)V

    :cond_1
    return-void
.end method

.method private static final flagMessage$lambda$94$lambda$93(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$FlagMessageError;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$FlagMessageError;-><init>(Ln23/e;)V

    return-object v0
.end method

.method public static synthetic flagUser$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    sget-object p3, Lm83/z;->w:Lm83/z;

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->flagUser(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private static final flagUser$lambda$139(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;
    .locals 5

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const/4 v2, 0x0

    invoke-interface {v1, v3, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->flagUser$lambda$139$lambda$138(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$FlagUserError;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->emitEvent(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final flagUser$lambda$139$lambda$138(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$FlagUserError;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$FlagUserError;-><init>(Ln23/e;)V

    return-object v0
.end method

.method private final focusChannelMessage(Ljava/lang/String;)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[focusChannelMessage] messageId: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getMessageFromListStateById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->focusedMessage:Lec3/p1;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v4, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_1
    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/g;

    const/16 v1, 0x11

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/g;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-virtual {p0, p1, v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->loadMessageById(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final focusChannelMessage$lambda$75(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/h;)Ll83/a0;
    .locals 6

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->focusedMessage:Lec3/p1;

    instance-of v1, p1, Ln23/g;

    if-eqz v1, :cond_0

    check-cast p1, Ln23/g;

    iget-object p0, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p0, Lio/getstream/chat/android/models/Message;

    goto :goto_0

    :cond_0
    instance-of v1, p1, Ln23/f;

    if-eqz v1, :cond_2

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object p0

    iget-object v1, p0, Lb23/k;->c:Lb23/e;

    iget-object v2, p0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->F:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    check-cast p1, Ln23/f;

    iget-object p1, p1, Ln23/f;->a:Ln23/e;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "[focusChannelMessage] -> Could not load message: "

    const-string v5, "."

    invoke-static {v1, p1, v5}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, v3, v2, p1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    move-object p0, v4

    :goto_0
    check-cast v0, Lec3/h2;

    invoke-virtual {v0, p0}, Lec3/h2;->j(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private final focusMessage(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[focusMessage] messageId: "

    const-string v4, ", parentMessageId: "

    invoke-static {v1, p1, v4, p2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    if-nez p2, :cond_1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->focusChannelMessage(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->focusThreadMessage(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final focusThreadMessage(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p2, p1, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final focusUnreadMessage(Ljava/util/List;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, -0x1

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v3

    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result v0

    const/4 v1, 0x0

    if-eq v0, v3, :cond_2

    goto :goto_2

    :cond_2
    move-object p2, v1

    :goto_2
    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-lt v0, v2, :cond_3

    goto :goto_3

    :cond_3
    move-object v1, p2

    :goto_3
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->focusChannelMessage(Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public static synthetic g(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unblockUser$lambda$145(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;

    return-void
.end method

.method public static synthetic getChannel$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getLastSeenMessageId$stream_chat_android_ui_common_release$annotations()V
    .locals 0

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final getMessagesState()Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;
    .locals 1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->isInThread()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_threadListState:Lec3/p1;

    :goto_0
    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageListState:Lec3/p1;

    goto :goto_0
.end method

.method private final getNewMessageState(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;)Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;
    .locals 2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-static {p2}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrNull(Lio/getstream/chat/android/models/Message;)Ljava/util/Date;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz p3, :cond_1

    sget-object p1, Lio/getstream/chat/android/ui/common/state/messages/list/Typing;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/Typing;

    return-object p1

    :cond_1
    if-nez p1, :cond_2

    return-object v0

    :cond_2
    if-nez p2, :cond_3

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getNewMessageStateForMessage(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {p1, v1}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->wasCreatedAfter(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isGiphy(Lio/getstream/chat/android/models/Message;)Z

    move-result p3

    if-nez p3, :cond_4

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    :cond_4
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getNewMessageStateForMessage(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getNewMessageStateForMessage(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;

    move-result-object p1

    return-object p1
.end method

.method private final getNewMessageStateForMessage(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->user:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/User;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/list/MyOwn;

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrNull(Lio/getstream/chat/android/models/Message;)Ljava/util/Date;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :cond_1
    invoke-direct {v0, v2}, Lio/getstream/chat/android/ui/common/state/messages/list/MyOwn;-><init>(Ljava/lang/Long;)V

    return-object v0

    :cond_2
    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/list/Other;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getCreatedAt()Ljava/util/Date;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :cond_3
    invoke-direct {v0, v2}, Lio/getstream/chat/android/ui/common/state/messages/list/Other;-><init>(Ljava/lang/Long;)V

    return-object v0
.end method

.method private final getOriginalTranslationsStore()Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->originalTranslationsStore$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;

    return-object v0
.end method

.method public static synthetic getOwnCapabilities$annotations()V
    .locals 0

    return-void
.end method

.method private final groupMessages(Ljava/util/List;ZLjava/util/List;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;Ljava/util/List;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;Ljava/util/List;ZLio/getstream/chat/android/models/Channel;Ljava/util/Set;Ljava/util/Set;)Ljava/util/List;
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;Z",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Lio/getstream/chat/android/models/Message;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;Z",
            "Lio/getstream/chat/android/models/Channel;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    move-object/from16 v3, p7

    move-object/from16 v4, p12

    iget-object v5, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_mode:Lec3/p1;

    check-cast v5, Lec3/h2;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    if-eqz v6, :cond_0

    check-cast v5, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v5

    move-object v10, v5

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    :goto_1
    iget-object v5, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->user:Lec3/f2;

    invoke-interface {v5}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v14, v5

    check-cast v14, Lio/getstream/chat/android/models/User;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v6, p10

    check-cast v6, Ljava/lang/Iterable;

    const/16 v8, 0xa

    invoke-static {v6, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-static {v9}, Lm83/g0;->W(I)I

    move-result v9

    const/16 v11, 0x10

    if-ge v9, v11, :cond_2

    move v9, v11

    :cond_2
    new-instance v12, Ljava/util/LinkedHashMap;

    invoke-direct {v12, v9}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v13, v9

    check-cast v13, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v13}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v13

    invoke-virtual {v13}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v12, v13, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    move-object/from16 v6, p3

    check-cast v6, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object v15, v13

    check-cast v15, Lio/getstream/chat/android/models/ChannelUserRead;

    invoke-virtual {v15}, Lio/getstream/chat/android/models/ChannelUserRead;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v16

    const/16 v25, 0x0

    invoke-virtual/range {v16 .. v16}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v7

    if-eqz v14, :cond_4

    invoke-virtual {v14}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v11, v16

    goto :goto_4

    :cond_4
    move-object/from16 v11, v25

    :goto_4
    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    invoke-direct {v0, v15, v12}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->belongsToFreshlyAddedMember(Lio/getstream/chat/android/models/ChannelUserRead;Ljava/util/Map;)Z

    move-result v7

    if-nez v7, :cond_5

    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    const/16 v11, 0x10

    goto :goto_3

    :cond_6
    const/16 v25, 0x0

    new-instance v6, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$groupMessages$$inlined$sortedBy$1;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    invoke-static {v9, v6}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/getstream/chat/android/models/ChannelUserRead;

    if-eqz v7, :cond_7

    invoke-virtual {v7}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastRead()Ljava/util/Date;

    move-result-object v7

    goto :goto_5

    :cond_7
    move-object/from16 v7, v25

    :goto_5
    move-object v9, v1

    check-cast v9, Ljava/lang/Iterable;

    invoke-static {v9}, Lm83/s;->J1(Ljava/lang/Iterable;)Lm83/q;

    move-result-object v11

    invoke-static {v11, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-static {v12}, Lm83/g0;->W(I)I

    move-result v12

    const/16 v13, 0x10

    if-ge v12, v13, :cond_8

    move v12, v13

    :cond_8
    new-instance v13, Ljava/util/LinkedHashMap;

    invoke-direct {v13, v12}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v11}, Lm83/q;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_6
    move-object v12, v11

    check-cast v12, Lm83/d0;

    iget-object v15, v12, Lm83/d0;->x:Ljava/util/Iterator;

    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_9

    invoke-virtual {v12}, Lm83/d0;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lm83/c0;

    iget v15, v12, Lm83/c0;->a:I

    iget-object v12, v12, Lm83/c0;->b:Ljava/lang/Object;

    check-cast v12, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v12}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v13, v12, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_9
    check-cast v6, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lio/getstream/chat/android/models/ChannelUserRead;

    invoke-virtual {v12}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastReadMessageId()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v13, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Integer;

    if-eqz v15, :cond_a

    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    new-instance v8, Ll83/k;

    invoke-direct {v8, v12, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_8

    :cond_a
    move-object/from16 v8, v25

    :goto_8
    if-eqz v8, :cond_b

    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    const/16 v8, 0xa

    goto :goto_7

    :cond_c
    const/4 v6, 0x1

    const/16 v26, 0x0

    if-eqz p2, :cond_d

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v8

    if-ne v8, v6, :cond_d

    move/from16 v27, v6

    goto :goto_9

    :cond_d
    move/from16 v27, v26

    :goto_9
    if-eqz p2, :cond_e

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v8

    if-le v8, v6, :cond_e

    move v8, v6

    goto :goto_a

    :cond_e
    move/from16 v8, v26

    :goto_a
    if-eqz v27, :cond_f

    iget-boolean v12, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->showDateSeparatorInEmptyThread:Z

    if-eqz v12, :cond_f

    move/from16 v28, v6

    goto :goto_b

    :cond_f
    move/from16 v28, v26

    :goto_b
    if-nez v8, :cond_11

    if-eqz v27, :cond_10

    iget-boolean v8, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->showThreadSeparatorInEmptyThread:Z

    if-eqz v8, :cond_10

    goto :goto_c

    :cond_10
    move/from16 v29, v26

    goto :goto_d

    :cond_11
    :goto_c
    move/from16 v29, v6

    :goto_d
    if-eqz p11, :cond_12

    if-eqz v4, :cond_12

    new-instance v8, Lio/getstream/chat/android/ui/common/state/messages/list/StartOfTheChannelItemState;

    invoke-direct {v8, v4}, Lio/getstream/chat/android/ui/common/state/messages/list/StartOfTheChannelItemState;-><init>(Lio/getstream/chat/android/models/Channel;)V

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_12
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v30

    move/from16 v8, v26

    move v9, v8

    move v12, v9

    :goto_e
    invoke-interface/range {v30 .. v30}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_2e

    invoke-interface/range {v30 .. v30}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    add-int/lit8 v15, v8, 0x1

    if-ltz v8, :cond_2d

    check-cast v13, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v13}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v23

    add-int/lit8 v6, v8, -0x1

    invoke-static {v6, v1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/models/Message;

    invoke-static {v15, v1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v1, v16

    check-cast v1, Lio/getstream/chat/android/models/Message;

    invoke-interface {v2, v6, v13}, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;->shouldAddDateSeparator(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z

    move-result v20

    if-eqz v1, :cond_13

    invoke-interface {v2, v13, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;->shouldAddDateSeparator(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z

    move-result v16

    move/from16 v21, v16

    move/from16 v22, p2

    move-object/from16 v19, v1

    move-object/from16 v17, v6

    move-object/from16 v18, v13

    move-object/from16 v16, p6

    goto :goto_f

    :cond_13
    move/from16 v21, v26

    move/from16 v22, p2

    move-object/from16 v16, p6

    move-object/from16 v19, v1

    move-object/from16 v17, v6

    move-object/from16 v18, v13

    :goto_f
    invoke-interface/range {v16 .. v22}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;->handleMessagePosition(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZ)Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    move-result-object v1

    move-object/from16 v13, v18

    move-object/from16 v6, v19

    sget-object v2, Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;->BOTTOM:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    if-eq v1, v2, :cond_15

    sget-object v2, Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;->NONE:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    if-ne v1, v2, :cond_14

    goto :goto_11

    :cond_14
    move-object/from16 p11, v1

    move/from16 v1, v26

    :goto_10
    move-object/from16 v2, p5

    goto :goto_12

    :cond_15
    :goto_11
    move-object/from16 p11, v1

    const/4 v1, 0x1

    goto :goto_10

    :goto_12
    invoke-static {v2, v13, v1, v6}, Lio/getstream/chat/android/ui/common/utils/extensions/MessageFooterVisibilityKt;->shouldShowMessageFooter(Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/models/Message;ZLio/getstream/chat/android/models/Message;)Z

    move-result v1

    if-eqz v20, :cond_16

    invoke-static {v13}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrNull(Lio/getstream/chat/android/models/Message;)Ljava/util/Date;

    move-result-object v6

    if-eqz v6, :cond_16

    move/from16 v16, v1

    new-instance v1, Lio/getstream/chat/android/ui/common/state/messages/list/DateSeparatorItemState;

    invoke-direct {v1, v6}, Lio/getstream/chat/android/ui/common/state/messages/list/DateSeparatorItemState;-><init>(Ljava/util/Date;)V

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_16
    move/from16 v16, v1

    :goto_13
    if-nez v9, :cond_1a

    if-eqz p9, :cond_17

    invoke-virtual/range {p9 .. p9}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;->getLastReadMessageId()Ljava/lang/String;

    move-result-object v1

    goto :goto_14

    :cond_17
    move-object/from16 v1, v25

    :goto_14
    if-eqz v17, :cond_18

    invoke-virtual/range {v17 .. v17}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v6

    goto :goto_15

    :cond_18
    move-object/from16 v6, v25

    :goto_15
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_19

    goto :goto_16

    :cond_19
    move/from16 v1, v26

    goto :goto_17

    :cond_1a
    :goto_16
    const/4 v1, 0x1

    :goto_17
    if-eqz p9, :cond_1e

    if-eqz v1, :cond_1b

    move-object/from16 v6, p9

    goto :goto_18

    :cond_1b
    move-object/from16 v6, v25

    :goto_18
    if-eqz v6, :cond_1e

    if-nez v12, :cond_1c

    goto :goto_19

    :cond_1c
    move-object/from16 v6, v25

    :goto_19
    if-eqz v6, :cond_1e

    invoke-static {v13}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v9

    if-nez v9, :cond_1d

    goto :goto_1a

    :cond_1d
    move-object/from16 v6, v25

    :goto_1a
    if-eqz v6, :cond_1e

    new-instance v9, Lio/getstream/chat/android/ui/common/state/messages/list/UnreadSeparatorItemState;

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;->getUnreadCount()I

    move-result v6

    invoke-direct {v9, v6}, Lio/getstream/chat/android/ui/common/state/messages/list/UnreadSeparatorItemState;-><init>(I)V

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-result v12

    :cond_1e
    move v6, v12

    invoke-static {v13}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isSystem(Lio/getstream/chat/android/models/Message;)Z

    move-result v9

    if-eqz v9, :cond_1f

    new-instance v9, Lio/getstream/chat/android/ui/common/state/messages/list/SystemMessageItemState;

    invoke-direct {v9, v13}, Lio/getstream/chat/android/ui/common/state/messages/list/SystemMessageItemState;-><init>(Lio/getstream/chat/android/models/Message;)V

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1b
    move-object/from16 v0, p14

    move/from16 v31, v1

    move/from16 p10, v6

    move v6, v8

    move-object v2, v11

    move-object v9, v13

    move v1, v15

    const/16 v32, 0xa

    goto/16 :goto_23

    :cond_1f
    invoke-static {v13}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isError(Lio/getstream/chat/android/models/Message;)Z

    move-result v9

    if-eqz v9, :cond_20

    invoke-static {v13}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isModerationBounce(Lio/getstream/chat/android/models/Message;)Z

    move-result v9

    if-nez v9, :cond_20

    new-instance v9, Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageItemState;

    invoke-direct {v9, v13}, Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageItemState;-><init>(Lio/getstream/chat/android/models/Message;)V

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1b

    :cond_20
    invoke-virtual {v13}, Lio/getstream/chat/android/models/Message;->getCreatedAt()Ljava/util/Date;

    move-result-object v9

    if-eqz v9, :cond_21

    if-eqz v7, :cond_21

    invoke-virtual {v9, v7}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result v9

    if-gtz v9, :cond_21

    const/4 v9, 0x1

    goto :goto_1c

    :cond_21
    move/from16 v9, v26

    :goto_1c
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_1d
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_23

    move/from16 v31, v1

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ll83/k;

    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-lt v2, v8, :cond_22

    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_22
    move-object/from16 v2, p5

    move/from16 v1, v31

    goto :goto_1d

    :cond_23
    move/from16 v31, v1

    new-instance v1, Ljava/util/ArrayList;

    move/from16 p10, v6

    const/16 v2, 0xa

    invoke-static {v12, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_24

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll83/k;

    iget-object v12, v12, Ll83/k;->w:Ljava/lang/Object;

    check-cast v12, Lio/getstream/chat/android/models/ChannelUserRead;

    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1e

    :cond_24
    if-eqz v4, :cond_25

    invoke-static {v4, v13}, Lio/getstream/chat/android/client/extensions/ChannelExtensionKt;->deliveredReadsOf(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_25

    const/16 v17, 0x1

    goto :goto_1f

    :cond_25
    move/from16 v17, v26

    :goto_1f
    invoke-virtual {v13}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v6

    if-eqz p8, :cond_26

    invoke-virtual/range {p8 .. p8}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v12

    goto :goto_20

    :cond_26
    move-object/from16 v12, v25

    :goto_20
    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_27

    invoke-virtual {v13}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v0, v12}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->removeMessageFocus(Ljava/lang/String;)V

    :cond_27
    invoke-virtual/range {v23 .. v23}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v12

    if-eqz v14, :cond_28

    invoke-virtual {v14}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v18

    move-object/from16 v2, v18

    goto :goto_21

    :cond_28
    move-object/from16 v2, v25

    :goto_21
    invoke-static {v12, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v6, :cond_29

    sget-object v6, Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocused;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocused;

    goto :goto_22

    :cond_29
    move-object/from16 v6, v25

    :goto_22
    invoke-virtual {v13}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v0, p14

    invoke-interface {v0, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v20

    move v12, v8

    new-instance v8, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    const/16 v23, 0x2000

    const/16 v24, 0x0

    const/16 v22, 0x0

    move-object/from16 v18, v11

    move v11, v2

    move-object/from16 v2, v18

    move/from16 v18, v16

    move/from16 v16, v9

    move-object v9, v13

    move/from16 v13, v18

    move-object/from16 v21, p13

    move-object/from16 v19, v1

    move-object/from16 v18, v6

    move v6, v12

    move v1, v15

    const/16 v32, 0xa

    move/from16 v12, p2

    move-object/from16 v15, p11

    invoke-direct/range {v8 .. v24}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;-><init>(Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZZZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZZLio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;Ljava/util/List;ZLjava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_23
    if-nez v6, :cond_2a

    if-eqz v29, :cond_2a

    new-instance v6, Lio/getstream/chat/android/ui/common/state/messages/list/ThreadDateSeparatorItemState;

    new-instance v8, Ljava/util/Date;

    invoke-direct {v8}, Ljava/util/Date;-><init>()V

    invoke-static {v9, v8}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v8

    invoke-virtual {v9}, Lio/getstream/chat/android/models/Message;->getReplyCount()I

    move-result v11

    invoke-direct {v6, v8, v11}, Lio/getstream/chat/android/ui/common/state/messages/list/ThreadDateSeparatorItemState;-><init>(Ljava/util/Date;I)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2a
    if-eqz v28, :cond_2b

    invoke-static {v9}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrNull(Lio/getstream/chat/android/models/Message;)Ljava/util/Date;

    move-result-object v6

    if-eqz v6, :cond_2b

    new-instance v8, Lio/getstream/chat/android/ui/common/state/messages/list/DateSeparatorItemState;

    invoke-direct {v8, v6}, Lio/getstream/chat/android/ui/common/state/messages/list/DateSeparatorItemState;-><init>(Ljava/util/Date;)V

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2b
    if-eqz v27, :cond_2c

    sget-object v6, Lio/getstream/chat/android/ui/common/state/messages/list/EmptyThreadPlaceholderItemState;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/EmptyThreadPlaceholderItemState;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2c
    const/4 v6, 0x1

    move-object/from16 v0, p0

    move/from16 v12, p10

    move v8, v1

    move-object v11, v2

    move/from16 v9, v31

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    goto/16 :goto_e

    :cond_2d
    invoke-static {}, Lwb3/f;->d0()V

    throw v25

    :cond_2e
    move-object v0, v3

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2f

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;

    invoke-direct {v0, v3}, Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;-><init>(Ljava/util/List;)V

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2f
    return-object v5
.end method

.method public static synthetic h(Ln23/h;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->markUnread$lambda$95(Ln23/h;)Ll83/a0;

    return-void
.end method

.method public static synthetic i(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;ZLn23/e;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->deleteMessage$lambda$79(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;ZLn23/e;)Ll83/a0;

    return-void
.end method

.method private final initialFocusMessage(Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->messageId:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->listState:Lec3/f2;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$initialFocusMessage$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$initialFocusMessage$2;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lq83/d;)V

    new-instance v3, Lec3/y;

    invoke-direct {v3, v0, v1}, Lec3/y;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$initialFocusMessage$3;

    const/4 v1, 0x2

    invoke-direct {v0, v1, v2}, Ls83/i;-><init>(ILq83/d;)V

    invoke-static {v3, v0, p1}, Lec3/v;->z(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public static synthetic j(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->castVote$lambda$113(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;

    return-void
.end method

.method public static synthetic k(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unmuteUser$lambda$129(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;

    return-void
.end method

.method public static synthetic l(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->muteUser$lambda$109(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;

    return-void
.end method

.method public static synthetic loadMessageById$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/16 p3, 0x16

    invoke-direct {p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->loadMessageById(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final loadMessageById$lambda$68(Ln23/h;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final loadMessageById$lambda$71(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Ln23/h;)V
    .locals 6

    const-string v0, "result"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of p0, p3, Ln23/f;

    if-eqz p0, :cond_0

    check-cast p3, Ln23/f;

    iget-object p0, p3, Ln23/f;->a:Ln23/e;

    invoke-direct {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object p3

    iget-object v0, p3, Lb23/k;->c:Lb23/e;

    iget-object v1, p3, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->F:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p3, p3, Lb23/k;->b:Lb23/j;

    iget-object p1, p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->cid:Ljava/lang/String;

    invoke-static {p0}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->extractCause(Ln23/e;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0}, Ln23/e;->a()Ljava/lang/String;

    move-result-object p0

    const-string v3, " inside channel: "

    const-string v4, ". Error: "

    const-string v5, "Could not load the message with id: "

    invoke-static {v5, p2, v3, p1, v4}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ". Message: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    invoke-interface {p3, v2, v1, p0, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method private final loadNewerChannelMessages(Ljava/lang/String;I)V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->channelState:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/channel/state/ChannelState;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getEndOfNewerMessages()Lec3/f2;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object v0, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v1, Lb23/g;->y:Lb23/g;

    invoke-interface {p2, v1, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    iget-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->channelState:Lec3/f2;

    invoke-interface {p2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/client/channel/state/ChannelState;

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    invoke-interface {p2}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getEndOfNewerMessages()Lec3/f2;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-interface {p2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    move-object p2, v2

    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[loadNewerChannelMessages] rejected; endOfNewerMessages: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, v0, p2, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void

    :cond_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->cid:Ljava/lang/String;

    invoke-static {v0, v1, p1, p2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->loadNewerMessages(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;I)Lo23/d;

    move-result-object p1

    check-cast p1, Lo23/h;

    invoke-virtual {p1}, Lo23/h;->enqueue()V

    return-void
.end method

.method public static synthetic loadNewerChannelMessages$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    iget p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->messageLimit:I

    :cond_0
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->loadNewerChannelMessages(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic loadNewerMessages$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    iget p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->messageLimit:I

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->loadNewerMessages(Ljava/lang/String;I)V

    return-void
.end method

.method private final loadNewerMessagesInThread(Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;)V
    .locals 10

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getThreadState()Lio/getstream/chat/android/client/api/state/ThreadState;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lio/getstream/chat/android/client/api/state/ThreadState;->getEndOfNewerMessages()Lec3/f2;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    move-object v1, v4

    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[loadNewerMessagesInThread] endOfNewerMessages: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getThreadState()Lio/getstream/chat/android/client/api/state/ThreadState;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lio/getstream/chat/android/client/api/state/ThreadState;->getEndOfNewerMessages()Lec3/f2;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-ne v0, v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getThreadState()Lio/getstream/chat/android/client/api/state/ThreadState;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lio/getstream/chat/android/client/api/state/ThreadState;->getLoading()Lec3/f2;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-ne v0, v1, :cond_3

    goto :goto_1

    :cond_3
    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->threadLoadOrderOlderToNewer:Z

    if-nez v0, :cond_7

    :goto_1
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getThreadState()Lio/getstream/chat/android/client/api/state/ThreadState;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-interface {v1}, Lio/getstream/chat/android/client/api/state/ThreadState;->getEndOfNewerMessages()Lec3/f2;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    goto :goto_2

    :cond_4
    move-object v1, v4

    :goto_2
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getThreadState()Lio/getstream/chat/android/client/api/state/ThreadState;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-interface {p1}, Lio/getstream/chat/android/client/api/state/ThreadState;->getLoading()Lec3/f2;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    goto :goto_3

    :cond_5
    move-object p1, v4

    :goto_3
    iget-boolean v5, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->threadLoadOrderOlderToNewer:Z

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "[loadNewerMessagesInThread] rejected; endOfNewerMessages: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", loading: "

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", threadLoadOrderOlderToNewer: "

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v2, v3, p1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    return-void

    :cond_7
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    iget v5, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->messageLimit:I

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getThreadState()Lio/getstream/chat/android/client/api/state/ThreadState;

    move-result-object v6

    if-eqz v6, :cond_8

    invoke-interface {v6}, Lio/getstream/chat/android/client/api/state/ThreadState;->getNewestInThread()Lec3/f2;

    move-result-object v6

    if-eqz v6, :cond_8

    invoke-interface {v6}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/models/Message;

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    :cond_8
    move-object v6, v4

    :goto_4
    const-string v7, ", messageLimit: "

    const-string v8, ", lastId = "

    const-string v9, "[loadNewerMessagesInThread] loading newer messages:parentId: "

    invoke-static {v5, v9, v1, v7, v8}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->messageLimit:I

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getThreadState()Lio/getstream/chat/android/client/api/state/ThreadState;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-interface {p1}, Lio/getstream/chat/android/client/api/state/ThreadState;->getNewestInThread()Lec3/f2;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Message;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v4

    :cond_a
    invoke-virtual {v0, v1, v2, v4}, Lio/getstream/chat/android/client/ChatClient;->getNewerReplies(Ljava/lang/String;ILjava/lang/String;)Lo23/d;

    move-result-object p1

    invoke-interface {p1}, Lo23/d;->enqueue()V

    return-void
.end method

.method public static synthetic loadOlderMessages$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->messageLimit:I

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->loadOlderMessages(I)V

    return-void
.end method

.method public static synthetic m(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->blockUser$lambda$143(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;

    return-void
.end method

.method private final markChannelAsRead()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->cid:Ljava/lang/String;

    invoke-static {v0}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object v0

    iget-object v1, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v2, v1, v0}, Lio/getstream/chat/android/client/ChatClient;->markRead(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/list/e;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v0, v3}, Lio/getstream/chat/android/ui/common/feature/messages/list/e;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;I)V

    invoke-static {v1, v2}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final markChannelAsRead$lambda$89(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Ln23/e;)Ll83/a0;
    .locals 6

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object p0

    iget-object v0, p0, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->F:Lb23/g;

    iget-object v2, p0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p2}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->extractCause(Ln23/e;)Ljava/lang/Throwable;

    move-result-object p2

    const-string v3, " as read. Error message: "

    const-string v4, ". Cause: "

    const-string v5, "Could not mark cid: "

    invoke-static {v5, p1, v3, v0, v4}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p0, v1, v2, p1, p2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final markLastMessageRead$lambda$83(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->markLastMessageReadInternal()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final markLastMessageReadInternal()V
    .locals 12

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getMessagesState()Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getMessageItems()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;

    instance-of v3, v3, Lio/getstream/chat/android/ui/common/state/messages/list/HasMessageListItemState;

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    instance-of v0, v1, Lio/getstream/chat/android/ui/common/state/messages/list/HasMessageListItemState;

    if-eqz v0, :cond_2

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/list/HasMessageListItemState;

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/list/HasMessageListItemState;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    goto :goto_2

    :cond_3
    move-object v0, v2

    :goto_2
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_4
    move-object v1, v2

    :goto_3
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v3

    goto :goto_4

    :cond_5
    move-object v3, v2

    :goto_4
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v4

    iget-object v5, v4, Lb23/k;->c:Lb23/e;

    iget-object v6, v4, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->y:Lb23/g;

    invoke-interface {v5, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    const-string v8, "[markLastMessageRead] cid: "

    if-eqz v5, :cond_6

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    iget-object v5, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->cid:Ljava/lang/String;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->isInThread()Z

    move-result v9

    const-string v10, ", msgId("

    const-string v11, "): "

    invoke-static {v8, v5, v10, v11, v9}, Lm4/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v9, ", msgText: \""

    const-string v10, "\""

    invoke-static {v5, v1, v9, v3, v10}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v7, v6, v3, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {v3}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object v3

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/models/User;

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    goto :goto_5

    :cond_7
    move-object v3, v2

    :goto_5
    const-string v4, "; rejected["

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v0

    sget-object v3, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

    if-eq v0, v3, :cond_8

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    iget-object v5, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->x:Lb23/g;

    invoke-interface {v3, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_9

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->cid:Ljava/lang/String;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->isInThread()Z

    move-result v7

    const-string v9, "] (own unsynced): "

    invoke-static {v8, v3, v4, v9, v7}, Lm4/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v6, v5, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_8
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLastSeenMessageId$stream_chat_android_ui_common_release()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    iget-object v5, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->x:Lb23/g;

    invoke-interface {v3, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_9

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->cid:Ljava/lang/String;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->isInThread()Z

    move-result v7

    const-string v9, "] (already seen msgId): "

    invoke-static {v8, v3, v4, v9, v7}, Lm4/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v6, v5, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    return-void

    :cond_a
    invoke-virtual {p0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->setLastSeenMessageId$stream_chat_android_ui_common_release(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->isInThread()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->markThreadAsRead()V

    return-void

    :cond_b
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->markChannelAsRead()V

    return-void
.end method

.method private final markThreadAsRead()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->cid:Ljava/lang/String;

    invoke-static {v0}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object v0

    iget-object v1, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_mode:Lec3/p1;

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    if-eqz v3, :cond_0

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v3, v1, v0, v2}, Lio/getstream/chat/android/client/ChatClient;->markThreadRead(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/list/e;

    const/4 v3, 0x0

    invoke-direct {v1, p0, v2, v3}, Lio/getstream/chat/android/ui/common/feature/messages/list/e;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;I)V

    invoke-static {v0, v1}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    :cond_2
    :goto_1
    return-void
.end method

.method private static final markThreadAsRead$lambda$91(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Ln23/e;)Ll83/a0;
    .locals 6

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object p0

    iget-object v0, p0, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->F:Lb23/g;

    iget-object v2, p0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p2}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->extractCause(Ln23/e;)Ljava/lang/Throwable;

    move-result-object p2

    const-string v3, " as read. Error message: "

    const-string v4, ". Cause: "

    const-string v5, "Could not mark thread with id: "

    invoke-static {v5, p1, v3, v0, v4}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p0, v1, v2, p1, p2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic markUnread$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Message;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/16 p3, 0x17

    invoke-direct {p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->markUnread(Lio/getstream/chat/android/models/Message;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final markUnread$lambda$95(Ln23/h;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final markUnread$lambda$98$lambda$97(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/h;)V
    .locals 4

    const-string v0, "response"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of p0, p2, Ln23/f;

    if-eqz p0, :cond_1

    check-cast p2, Ln23/f;

    iget-object p0, p2, Ln23/f;->a:Ln23/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ln23/e;->a()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->F:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const/4 v1, 0x0

    invoke-interface {v0, v3, v2, p2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->markUnread$lambda$98$lambda$97$lambda$96(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$MarkUnreadError;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->emitEvent(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;)V

    return-void

    :cond_1
    iget-object p0, p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->showUnreadButtonState:Lec3/o1;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method private static final markUnread$lambda$98$lambda$97$lambda$96(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$MarkUnreadError;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$MarkUnreadError;-><init>(Ln23/e;)V

    return-object v0
.end method

.method public static synthetic muteUser$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->muteUser(Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method

.method private static final muteUser$lambda$109(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;
    .locals 5

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const/4 v2, 0x0

    invoke-interface {v1, v3, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->muteUser$lambda$109$lambda$108(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$MuteUserError;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->emitEvent(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final muteUser$lambda$109$lambda$108(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$MuteUserError;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$MuteUserError;-><init>(Ln23/e;)V

    return-object v0
.end method

.method private static final muteUser$lambda$127(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;
    .locals 3

    const-string v0, "streamError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object p0

    iget-object v0, p0, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->F:Lb23/g;

    iget-object v2, p0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    const/4 v0, 0x0

    invoke-interface {p0, v1, v2, p1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic n(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Reaction;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->reactToMessage$lambda$122(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Reaction;Ln23/e;)Ll83/a0;

    return-void
.end method

.method public static synthetic o(Ln23/h;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->flagMessage$lambda$92(Ln23/h;)Ll83/a0;

    return-void
.end method

.method private final observeMessagesListState()V
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->channelState:Lec3/f2;

    new-instance v1, Lch/i;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lch/i;-><init>(Lec3/l;I)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;

    const/4 v2, 0x0

    invoke-direct {v0, v2, p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;-><init>(Lq83/d;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)V

    invoke-static {v1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$2;

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$2;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lq83/d;)V

    new-instance v3, Lec3/a0;

    invoke-direct {v3, v0, v1}, Lec3/a0;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$3;

    invoke-direct {v0, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$3;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lq83/d;)V

    new-instance v1, Lec3/j1;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v0, v4}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scope:Lbc3/c0;

    invoke-static {v1, v0}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->channelState:Lec3/f2;

    new-instance v1, Lch/i;

    const/4 v3, 0x2

    invoke-direct {v1, v0, v3}, Lch/i;-><init>(Lec3/l;I)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$2;

    const/4 v3, 0x3

    invoke-direct {v0, v3, v2}, Ls83/i;-><init>(ILq83/d;)V

    invoke-static {v1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$5;

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$5;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lq83/d;)V

    new-instance v4, Lec3/j1;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v1, v5}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scope:Lbc3/c0;

    invoke-static {v4, v0}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->user:Lec3/f2;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$6;

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$6;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lq83/d;)V

    new-instance v4, Lec3/j1;

    invoke-direct {v4, v0, v1, v5}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scope:Lbc3/c0;

    invoke-static {v4, v0}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unreadCount:Lec3/f2;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$7;

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$7;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lq83/d;)V

    new-instance v4, Lec3/j1;

    invoke-direct {v4, v0, v1, v5}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scope:Lbc3/c0;

    invoke-static {v4, v0}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->channelState:Lec3/f2;

    new-instance v1, Lch/i;

    const/4 v4, 0x2

    invoke-direct {v1, v0, v4}, Lch/i;-><init>(Lec3/l;I)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$3;

    invoke-direct {v0, v3, v2}, Ls83/i;-><init>(ILq83/d;)V

    invoke-static {v1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$9;

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$9;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lq83/d;)V

    new-instance v4, Lec3/j1;

    invoke-direct {v4, v0, v1, v5}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scope:Lbc3/c0;

    invoke-static {v4, v0}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->channelState:Lec3/f2;

    new-instance v1, Lch/i;

    const/4 v4, 0x2

    invoke-direct {v1, v0, v4}, Lch/i;-><init>(Lec3/l;I)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$4;

    invoke-direct {v0, v3, v2}, Ls83/i;-><init>(ILq83/d;)V

    invoke-static {v1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$11;

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$11;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lq83/d;)V

    new-instance v2, Lec3/j1;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scope:Lbc3/c0;

    invoke-static {v2, v0}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->observeUnreadLabelState()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unreadLabelState:Lec3/p1;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$12;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$12;-><init>(Ljava/lang/Object;)V

    new-instance v2, Lec3/j1;

    invoke-direct {v2, v0, v1, v3}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scope:Lbc3/c0;

    invoke-static {v2, v0}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    return-void
.end method

.method private static final synthetic observeMessagesListState$updateUnreadLabel(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->updateUnreadLabel(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final observeThreadMessagesState(Ljava/lang/String;Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lec3/f2;",
            "Lec3/f2;",
            "Lec3/f2;",
            "Lec3/f2;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;

    const/4 v8, 0x0

    move-object v2, p0

    move-object v7, p1

    move-object v4, p2

    move-object v3, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;Ljava/lang/String;Lq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {v0, p2, p2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, v2, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->threadJob:Lbc3/k1;

    return-void
.end method

.method private final observeUnreadLabelState()V
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->showUnreadButtonState:Lec3/o1;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeUnreadLabelState$1;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Ls83/i;-><init>(ILq83/d;)V

    new-instance v2, Lec3/a0;

    invoke-direct {v2, v1, v0}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->channelState:Lec3/f2;

    new-instance v1, Lch/i;

    const/4 v4, 0x2

    invoke-direct {v1, v0, v4}, Lch/i;-><init>(Lec3/l;I)V

    new-instance v4, Lch/i;

    const/4 v5, 0x2

    invoke-direct {v4, v0, v5}, Lch/i;-><init>(Lec3/l;I)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeUnreadLabelState$$inlined$flatMapLatest$1;

    const/4 v5, 0x3

    invoke-direct {v0, v5, v3}, Ls83/i;-><init>(ILq83/d;)V

    invoke-static {v4, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v4, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeUnreadLabelState$3;

    invoke-direct {v4, p0, v3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeUnreadLabelState$3;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lq83/d;)V

    invoke-static {v2, v1, v0, v4}, Lec3/v;->p(Lec3/l;Lec3/l;Lec3/l;Lc93/n;)Lec3/j1;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scope:Lbc3/c0;

    invoke-static {v0, v1}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    return-void
.end method

.method private final onActionResult(Ln23/e;Lkotlin/jvm/functions/Function1;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/e;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const/4 v2, 0x0

    invoke-interface {v1, v3, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->emitEvent(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;)V

    return-void
.end method

.method private static final originalTranslationsStore_delegate$lambda$0(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;->Companion:Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore$Companion;

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->cid:Ljava/lang/String;

    invoke-virtual {v0, p0}, Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore$Companion;->forChannel(Ljava/lang/String;)Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/h;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->focusChannelMessage$lambda$75(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/h;)Ll83/a0;

    return-void
.end method

.method private final pauseRunningAudioRecordings(Lio/getstream/chat/android/models/Message;)V
    .locals 3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object p1

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

    check-cast v2, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v2}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isAudioRecording(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v1}, Lio/getstream/chat/android/client/audio/AudioHashKt;->getAudioHash(Lio/getstream/chat/android/models/Attachment;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->getAudioPlayer()Lio/getstream/chat/android/client/audio/AudioPlayer;

    move-result-object v0

    invoke-interface {v0}, Lio/getstream/chat/android/client/audio/AudioPlayer;->getCurrentState()Lio/getstream/chat/android/client/audio/AudioState;

    move-result-object v1

    sget-object v2, Lio/getstream/chat/android/client/audio/AudioState;->PLAYING:Lio/getstream/chat/android/client/audio/AudioState;

    if-ne v1, v2, :cond_3

    invoke-interface {v0}, Lio/getstream/chat/android/client/audio/AudioPlayer;->getCurrentPlayingId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {v0}, Lio/getstream/chat/android/client/audio/AudioPlayer;->pause()V

    :cond_3
    return-void
.end method

.method private static final performGiphyAction$lambda$147(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;Lio/getstream/chat/android/models/Message;Ln23/e;)Ll83/a0;
    .locals 6

    const-string v0, "streamError"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object p0

    iget-object v0, p0, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->F:Lb23/g;

    iget-object v2, p0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->extractCause(Ln23/e;)Ljava/lang/Throwable;

    move-result-object p3

    const-string v3, " giphy for message id: "

    const-string v4, ". Error: "

    const-string v5, "Could not "

    invoke-static {v5, p1, v3, p2, v4}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ". Cause: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p0, v1, v2, p1, p2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic pinMessage$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Message;Ljava/util/Date;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->pinMessage(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)V

    return-void
.end method

.method private static final pinMessage$lambda$101(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;
    .locals 5

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const/4 v2, 0x0

    invoke-interface {v1, v3, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->pinMessage$lambda$101$lambda$100(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PinMessageError;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->emitEvent(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final pinMessage$lambda$101$lambda$100(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PinMessageError;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PinMessageError;-><init>(Ln23/e;)V

    return-object v0
.end method

.method public static synthetic q(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unbanUser$lambda$133(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;

    return-void
.end method

.method public static synthetic r(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/h;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->markUnread$lambda$98$lambda$97(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/h;)V

    return-void
.end method

.method public static synthetic reactToMessage$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Reaction;Lio/getstream/chat/android/models/Message;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->reactToMessage(Lio/getstream/chat/android/models/Reaction;Lio/getstream/chat/android/models/Message;Z)V

    return-void
.end method

.method private static final reactToMessage$lambda$120(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Reaction;Ln23/e;)Ll83/a0;
    .locals 6

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object p0

    iget-object v0, p0, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->F:Lb23/g;

    iget-object v2, p0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->extractCause(Ln23/e;)Ljava/lang/Throwable;

    move-result-object p2

    const-string v3, " Error: "

    const-string v4, ". Cause: "

    const-string v5, "Could not delete reaction for message with id: "

    invoke-static {v5, p1, v3, v0, v4}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p0, v1, v2, p1, p2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final reactToMessage$lambda$122(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Reaction;Ln23/e;)Ll83/a0;
    .locals 6

    const-string v0, "streamError"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object p0

    iget-object v0, p0, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->F:Lb23/g;

    iget-object v2, p0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->extractCause(Ln23/e;)Ljava/lang/Throwable;

    move-result-object p2

    const-string v3, " Error: "

    const-string v4, ". Cause: "

    const-string v5, "Could not send reaction for message with id: "

    invoke-static {v5, p1, v3, v0, v4}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p0, v1, v2, p1, p2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final removeAttachment$lambda$155(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;Ln23/h;)V
    .locals 56

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const-string v2, "result"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Ln23/g;

    const/4 v3, 0x0

    if-eqz v2, :cond_7

    check-cast v1, Ln23/g;

    iget-object v1, v1, Ln23/g;->a:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v5, 0x0

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/models/Attachment;->getAssetUrl()Ljava/lang/String;

    move-result-object v8

    const-string v9, "?"

    if-eqz v8, :cond_2

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Attachment;->getAssetUrl()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-static {v5, v9}, Lyb3/r;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_1
    move-object v5, v3

    :goto_1
    invoke-static {v8, v9}, Lyb3/r;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    goto :goto_3

    :cond_2
    if-eqz v7, :cond_4

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-static {v5, v9}, Lyb3/r;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_3
    move-object v5, v3

    :goto_2
    invoke-static {v7, v9}, Lyb3/r;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    :cond_4
    :goto_3
    if-nez v5, :cond_0

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    const v54, 0xffff

    const/16 v55, 0x0

    move v1, v5

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

    const/16 v53, -0x41

    invoke-static/range {v4 .. v55}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_6

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    const/4 v4, 0x2

    move-object/from16 v5, p1

    invoke-static {v2, v5, v1, v4, v3}, Lio/getstream/chat/android/client/ChatClient;->deleteMessage$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ZILjava/lang/Object;)Lo23/d;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/list/g;

    const/4 v3, 0x2

    invoke-direct {v2, v0, v3}, Lio/getstream/chat/android/ui/common/feature/messages/list/g;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-static {v1, v2}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_6
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/ChatClient;->updateMessage(Lio/getstream/chat/android/models/Message;)Lo23/d;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/list/g;

    const/4 v3, 0x3

    invoke-direct {v2, v0, v3}, Lio/getstream/chat/android/ui/common/feature/messages/list/g;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-static {v1, v2}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_7
    instance-of v2, v1, Ln23/f;

    if-eqz v2, :cond_9

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->F:Lb23/g;

    invoke-interface {v2, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    check-cast v1, Ln23/f;

    iget-object v1, v1, Ln23/f;->a:Ln23/e;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v6, "Could not load message: "

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v5, v4, v1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    return-void

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private static final removeAttachment$lambda$155$lambda$151(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;
    .locals 5

    const-string v0, "streamError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object p0

    iget-object v0, p0, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->F:Lb23/g;

    iget-object v2, p0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->extractCause(Ln23/e;)Ljava/lang/Throwable;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Could not remove the attachment and delete the remaining blank message: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". Cause: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p0, v1, v2, p1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final removeAttachment$lambda$155$lambda$153(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;
    .locals 5

    const-string v0, "streamError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object p0

    iget-object v0, p0, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->F:Lb23/g;

    iget-object v2, p0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->extractCause(Ln23/e;)Ljava/lang/Throwable;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Could not edit message to remove its attachments: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". Cause: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p0, v1, v2, p1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final removeMessageFocus(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->removeFocusedMessageJob:Ll83/k;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scope:Lbc3/c0;

    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$removeMessageFocus$1;

    invoke-direct {v2, p0, p1, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$removeMessageFocus$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v1, v1, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->removeFocusedMessageJob:Ll83/k;

    :cond_1
    return-void
.end method

.method private static final removeShadowBanFromUser$lambda$137(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;
    .locals 5

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const/4 v2, 0x0

    invoke-interface {v1, v3, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->removeShadowBanFromUser$lambda$137$lambda$136(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$BlockUserError;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->emitEvent(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final removeShadowBanFromUser$lambda$137$lambda$136(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$BlockUserError;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$BlockUserError;-><init>(Ln23/e;)V

    return-object v0
.end method

.method private static final removeVote$lambda$115(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;
    .locals 5

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const/4 v2, 0x0

    invoke-interface {v1, v3, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->removeVote$lambda$115$lambda$114(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PollRemovingVoteError;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->emitEvent(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final removeVote$lambda$115$lambda$114(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PollRemovingVoteError;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PollRemovingVoteError;-><init>(Ln23/e;)V

    return-object v0
.end method

.method private static final resendMessage$lambda$106(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;
    .locals 5

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object p0

    iget-object v0, p0, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->F:Lb23/g;

    iget-object v2, p0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->extractCause(Ln23/e;)Ljava/lang/Throwable;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "(Retry) Could not send message: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". Cause: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p0, v1, v2, p1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic s(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->flagUser$lambda$139(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;

    return-void
.end method

.method public static synthetic scrollToBottom$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;ILc93/a;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    iget p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->messageLimit:I

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scrollToBottom(ILc93/a;)V

    return-void
.end method

.method private static final scrollToBottom$lambda$55(Lc93/a;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/h;)V
    .locals 4

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Ln23/g;

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :cond_0
    instance-of p0, p2, Ln23/f;

    if-eqz p0, :cond_2

    invoke-direct {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object p0

    iget-object p1, p0, Lb23/k;->c:Lb23/e;

    iget-object v0, p0, Lb23/k;->a:Ljava/lang/String;

    sget-object v1, Lb23/g;->F:Lb23/g;

    invoke-interface {p1, v1, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    check-cast p2, Ln23/f;

    iget-object p1, p2, Ln23/f;->a:Ln23/e;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->extractCause(Ln23/e;)Ljava/lang/Throwable;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Could not load newest messages. Message: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ". Cause: "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p0, v1, v0, p1, p2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final setDateSeparatorHandler$lambda$156(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    const-string p0, "<unused var>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method private final setMessageListState(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListStateKt;->stringify(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "[setMessageListState] #messageList; newState: "

    invoke-static {v4, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageListState:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void
.end method

.method private static final setThreadDateSeparatorHandler$lambda$157(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    const-string p0, "<unused var>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic shadowBanUser$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)V
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
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->shadowBanUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method

.method private static final shadowBanUser$lambda$135(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;
    .locals 5

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const/4 v2, 0x0

    invoke-interface {v1, v3, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->shadowBanUser$lambda$135$lambda$134(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$BlockUserError;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->emitEvent(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final shadowBanUser$lambda$135$lambda$134(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$BlockUserError;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$BlockUserError;-><init>(Ln23/e;)V

    return-object v0
.end method

.method private final showEmptyState()V
    .locals 17

    move-object/from16 v0, p0

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[showEmptyState] no args"

    const/4 v5, 0x0

    invoke-interface {v1, v3, v4, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageListState:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    const/16 v15, 0xff6

    const/16 v16, 0x0

    sget-object v3, Lm83/y;->w:Lm83/y;

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

    invoke-static/range {v2 .. v16}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->setMessageListState(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)V

    return-void
.end method

.method public static synthetic t(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/h;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->flagMessage$lambda$94(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/h;)V

    return-void
.end method

.method private final threadLoadMore(Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;I)V
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_threadListState:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getEndOfOldMessagesReached()Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_threadListState:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoadingOlderMessages()Z

    move-result v1

    if-nez v1, :cond_4

    iget-boolean v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->threadLoadOrderOlderToNewer:Z

    if-nez v1, :cond_4

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getThreadState()Lio/getstream/chat/android/client/api/state/ThreadState;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lio/getstream/chat/android/client/api/state/ThreadState;->getOldestInThread()Lec3/f2;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Message;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-nez v1, :cond_1

    goto :goto_4

    :cond_1
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_threadListState:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    const/16 v17, 0xfdf

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v4 .. v18}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getThreadState()Lio/getstream/chat/android/client/api/state/ThreadState;

    move-result-object v3

    invoke-interface {v3}, Lio/getstream/chat/android/client/api/state/ThreadState;->getOldestInThread()Lec3/f2;

    move-result-object v3

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/models/Message;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    move/from16 v4, p2

    goto :goto_3

    :cond_3
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :goto_3
    invoke-virtual {v1, v2, v3, v4}, Lio/getstream/chat/android/client/ChatClient;->getRepliesMore(Ljava/lang/String;Ljava/lang/String;I)Lo23/d;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/list/c;

    invoke-direct {v2, v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/c;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)V

    invoke-interface {v1, v2}, Lo23/d;->enqueue(Lo23/a;)V

    :cond_4
    :goto_4
    return-void
.end method

.method public static synthetic threadLoadMore$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    iget p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->messageLimit:I

    :cond_0
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->threadLoadMore(Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;I)V

    return-void
.end method

.method private static final threadLoadMore$lambda$63(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/h;)V
    .locals 17

    const-string v0, "it"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v0, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_threadListState:Lec3/p1;

    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    const/16 v15, 0xfdf

    const/16 v16, 0x0

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

    invoke-static/range {v2 .. v16}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic u(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->closePoll$lambda$117(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;

    return-void
.end method

.method private static final unbanUser$lambda$133(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;
    .locals 5

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const/4 v2, 0x0

    invoke-interface {v1, v3, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unbanUser$lambda$133$lambda$132(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$BlockUserError;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->emitEvent(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final unbanUser$lambda$133$lambda$132(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$BlockUserError;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$BlockUserError;-><init>(Ln23/e;)V

    return-object v0
.end method

.method private static final unblockUser$lambda$145(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;
    .locals 5

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const/4 v2, 0x0

    invoke-interface {v1, v3, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unblockUser$lambda$145$lambda$144(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$BlockUserError;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->emitEvent(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final unblockUser$lambda$145$lambda$144(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$BlockUserError;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$BlockUserError;-><init>(Ln23/e;)V

    return-object v0
.end method

.method private static final unflagUser$lambda$141(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;
    .locals 5

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const/4 v2, 0x0

    invoke-interface {v1, v3, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unflagUser$lambda$141$lambda$140(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnflagUserError;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->emitEvent(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final unflagUser$lambda$141$lambda$140(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnflagUserError;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnflagUserError;-><init>(Ln23/e;)V

    return-object v0
.end method

.method private static final unmuteUser$lambda$111(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;
    .locals 5

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const/4 v2, 0x0

    invoke-interface {v1, v3, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unmuteUser$lambda$111$lambda$110(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->emitEvent(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final unmuteUser$lambda$111$lambda$110(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;-><init>(Ln23/e;)V

    return-object v0
.end method

.method private static final unmuteUser$lambda$129(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;
    .locals 3

    const-string v0, "streamError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object p0

    iget-object v0, p0, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->F:Lb23/g;

    iget-object v2, p0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    const/4 v0, 0x0

    invoke-interface {p0, v1, v2, p1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final unpinMessage$lambda$104(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;
    .locals 5

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const/4 v2, 0x0

    invoke-interface {v1, v3, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unpinMessage$lambda$104$lambda$103(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnpinMessageError;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->emitEvent(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final unpinMessage$lambda$104$lambda$103(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnpinMessageError;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnpinMessageError;-><init>(Ln23/e;)V

    return-object v0
.end method

.method private final updateCurrentUser(Lio/getstream/chat/android/models/User;)V
    .locals 17

    move-object/from16 v0, p0

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v2

    :goto_0
    const-string v6, "[updateCurrentUser] #messageList; currentUser.id: "

    invoke-static {v6, v5}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v3, v4, v5, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageListState:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    const/16 v15, 0xfbf

    const/16 v16, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v9, p1

    invoke-static/range {v2 .. v16}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->setMessageListState(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)V

    return-void
.end method

.method private final updateEndOfOldMessagesReached(Z)V
    .locals 20

    move-object/from16 v0, p0

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[updateEndOfOldMessagesReached] #messageList; endOfOldMessagesReached: "

    move/from16 v8, p1

    invoke-static {v2, v8}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    invoke-interface {v1, v3, v4, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    move/from16 v8, p1

    :goto_0
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageListState:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    const/16 v18, 0xffb

    const/16 v19, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v5 .. v19}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->setMessageListState(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)V

    return-void
.end method

.method private final updateIsLoadingNewerMessages(Z)V
    .locals 20

    move-object/from16 v0, p0

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[updateIsLoadingNewerMessages] #messageList; isLoadingNewerMessages: "

    move/from16 v10, p1

    invoke-static {v2, v10}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    invoke-interface {v1, v3, v4, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    move/from16 v10, p1

    :goto_0
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageListState:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    const/16 v18, 0xfef

    const/16 v19, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v5 .. v19}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->setMessageListState(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)V

    return-void
.end method

.method private final updateIsLoadingOlderMessages(Z)V
    .locals 20

    move-object/from16 v0, p0

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[updateIsLoadingOlderMessages] #messageList; isLoadingOlderMessages: "

    move/from16 v11, p1

    invoke-static {v2, v11}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    invoke-interface {v1, v3, v4, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    move/from16 v11, p1

    :goto_0
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageListState:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    const/16 v18, 0xfdf

    const/16 v19, 0x0

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

    invoke-static/range {v5 .. v19}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->setMessageListState(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)V

    return-void
.end method

.method private final updateMessageList(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)V
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageListState:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getMessageItems()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getEndOfNewMessagesReached()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->messageId:Ljava/lang/String;

    if-nez v1, :cond_0

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_13

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v3, "[updateMessageList] #messageList; rejected (N1)"

    invoke-interface {v1, v5, v4, v3, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getMessageItems()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Lio/getstream/chat/android/ui/common/state/messages/list/HasMessageListItemState;

    if-eqz v8, :cond_1

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v6}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/ui/common/state/messages/list/HasMessageListItemState;

    if-eqz v3, :cond_3

    invoke-static {v3}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemStateKt;->stringify(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_3
    move-object v3, v2

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getMessageItems()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_4
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Lio/getstream/chat/android/ui/common/state/messages/list/HasMessageListItemState;

    if-eqz v9, :cond_4

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-static {v7}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/ui/common/state/messages/list/HasMessageListItemState;

    if-eqz v6, :cond_6

    invoke-static {v6}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemStateKt;->stringify(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;)Ljava/lang/String;

    move-result-object v6

    goto :goto_3

    :cond_6
    move-object v6, v2

    :goto_3
    const-string v7, "[updateMessageList] #messageList; first: "

    const-string v8, ", last: "

    invoke-static {v7, v3, v8, v6}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v5, v4, v3, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageListState:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getMessageItems()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v1, v3}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    :cond_8
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;

    instance-of v4, v4, Lio/getstream/chat/android/ui/common/state/messages/list/HasMessageListItemState;

    if-eqz v4, :cond_8

    goto :goto_4

    :cond_9
    move-object v3, v2

    :goto_4
    check-cast v3, Lio/getstream/chat/android/ui/common/state/messages/list/HasMessageListItemState;

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/messages/list/HasMessageListItemState;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    goto :goto_5

    :cond_a
    move-object v1, v2

    :goto_5
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getMessageItems()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v3, v4}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v3

    :cond_b
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;

    instance-of v5, v5, Lio/getstream/chat/android/ui/common/state/messages/list/HasMessageListItemState;

    if-eqz v5, :cond_b

    goto :goto_6

    :cond_c
    move-object v4, v2

    :goto_6
    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/list/HasMessageListItemState;

    if-eqz v4, :cond_d

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/state/messages/list/HasMessageListItemState;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v3

    goto :goto_7

    :cond_d
    move-object v3, v2

    :goto_7
    iget-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->lastLoadedMessage:Lio/getstream/chat/android/models/Message;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getMessageItems()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    invoke-interface {v5, v6}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v5

    :cond_e
    invoke-interface {v5}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-interface {v5}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;

    instance-of v7, v7, Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;

    if-eqz v7, :cond_e

    goto :goto_8

    :cond_f
    move-object v6, v2

    :goto_8
    check-cast v6, Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;

    invoke-direct {v0, v3, v4, v6}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getNewMessageState(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;)Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;

    move-result-object v4

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v5

    iget-object v6, v5, Lb23/k;->c:Lb23/e;

    iget-object v7, v5, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->x:Lb23/g;

    invoke-interface {v6, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_12

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v1

    goto :goto_9

    :cond_10
    move-object v1, v2

    :goto_9
    if-eqz v3, :cond_11

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v6

    goto :goto_a

    :cond_11
    move-object v6, v2

    :goto_a
    const-string v9, ", newLastMessage: "

    const-string v10, ", newMessageState: "

    const-string v11, "[updateMessageList] #messageList; oldLastMessage: "

    invoke-static {v11, v1, v9, v6, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v8, v7, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_12
    const/16 v20, 0xdff

    const/16 v21, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v7, p1

    move-object/from16 v17, v4

    invoke-static/range {v7 .. v21}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->setMessageListState(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)V

    if-eqz v17, :cond_13

    iput-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->lastLoadedMessage:Lio/getstream/chat/android/models/Message;

    :cond_13
    return-void
.end method

.method private final updateUnreadCount(I)V
    .locals 20

    move-object/from16 v0, p0

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[updateUnreadCount] #messageList; unreadCount: "

    move/from16 v14, p1

    invoke-static {v14, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    invoke-interface {v1, v3, v4, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    move/from16 v14, p1

    :goto_0
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageListState:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    const/16 v18, 0xeff

    const/16 v19, 0x0

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

    invoke-static/range {v5 .. v19}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->setMessageListState(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)V

    return-void
.end method

.method private final updateUnreadLabel(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;)V
    .locals 21

    move-object/from16 v0, p0

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "[updateUnreadLabel] #messageList; unreadLabel: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v5, p1

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    invoke-interface {v1, v3, v4, v2, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    move-object/from16 v5, p1

    :goto_0
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageListState:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    const/16 v19, 0x7ff

    const/16 v20, 0x0

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

    move-object/from16 v18, v5

    invoke-static/range {v6 .. v20}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->setMessageListState(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)V

    return-void
.end method

.method public static synthetic v(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->originalTranslationsStore_delegate$lambda$0(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->setDateSeparatorHandler$lambda$156(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z

    return-void
.end method

.method public static synthetic x(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->markChannelAsRead$lambda$89(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Ln23/e;)Ll83/a0;

    return-void
.end method

.method public static synthetic y(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->setThreadDateSeparatorHandler$lambda$157(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z

    return-void
.end method

.method public static synthetic z(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->shadowBanUser$lambda$135(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/e;)Ll83/a0;

    return-void
.end method


# virtual methods
.method public final addPollOption(Lio/getstream/chat/android/models/Poll;Ljava/lang/String;)V
    .locals 1

    const-string v0, "poll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "option"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->addPollOption(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final addPollOption(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "pollId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "option"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$addPollOption$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$addPollOption$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final banUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 2

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->cid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/ChatClient;->channel(Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelClient;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lio/getstream/chat/android/client/channel/ChannelClient;->banUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;

    move-result-object p1

    new-instance p2, Lio/getstream/chat/android/ui/common/feature/messages/list/g;

    const/4 p3, 0x4

    invoke-direct {p2, p0, p3}, Lio/getstream/chat/android/ui/common/feature/messages/list/g;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-static {p1, p2}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final blockUser(Ljava/lang/String;)V
    .locals 2

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/ChatClient;->blockUser(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/g;

    const/16 v1, 0x9

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/g;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-static {p1, v0}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final castAnswer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "answer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0, p1, p2, p3}, Lio/getstream/chat/android/client/ChatClient;->castPollAnswer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    invoke-interface {p1}, Lo23/d;->enqueue()V

    return-void
.end method

.method public final castVote(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Option;)V
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "option"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Option;->getId()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Lio/getstream/chat/android/client/ChatClient;->castPollVote(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    new-instance p2, Lio/getstream/chat/android/ui/common/feature/messages/list/g;

    const/16 p3, 0xc

    invoke-direct {p2, p0, p3}, Lio/getstream/chat/android/ui/common/feature/messages/list/g;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-static {p1, p2}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final clearNewMessageState()V
    .locals 21

    move-object/from16 v0, p0

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const/4 v5, 0x0

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[clearNewMessageState] no args"

    invoke-interface {v1, v3, v4, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getMessagesState()Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getEndOfNewMessagesReached()Z

    move-result v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_threadListState:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    const/16 v19, 0xcff

    const/16 v20, 0x0

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

    invoke-static/range {v6 .. v20}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v5, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageListState:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    const/16 v15, 0xcff

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-static/range {v2 .. v16}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->setMessageListState(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)V

    return-void
.end method

.method public final closePoll(Lio/getstream/chat/android/models/Poll;)V
    .locals 3

    const-string v0, "poll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$closePoll$3;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$closePoll$3;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Poll;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final closePoll(Ljava/lang/String;)V
    .locals 4

    const-string v0, "pollId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/ChatClient;->closePoll(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    .line 2
    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/g;

    const/16 v1, 0xd

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/g;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/list/g;

    const/16 v2, 0xe

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/g;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    .line 3
    const-string v2, "<this>"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v2, Lc9/c;

    const/16 v3, 0x17

    invoke-direct {v2, v3, v0, v1}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1, v2}, Lo23/d;->enqueue(Lo23/a;)V

    return-void
.end method

.method public final deleteMessage(Lio/getstream/chat/android/models/Message;Z)V
    .locals 6

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageActions:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageActions:Lec3/p1;

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lio/getstream/chat/android/ui/common/state/messages/Delete;

    if-eqz v5, :cond_0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v3}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Ldt/b;->z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->removeOverlay()V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->pauseRunningAudioRecordings(Lio/getstream/chat/android/models/Message;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/ChatClient;->deleteMessage(Ljava/lang/String;Z)Lo23/d;

    move-result-object p1

    new-instance v0, Las1/f;

    const/4 v1, 0x6

    invoke-direct {v0, p0, p2, v1}, Las1/f;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p1, v0}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final disableUnreadLabelButton()V
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unreadLabelState:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->showUnreadButtonState:Lec3/o1;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v2}, Lec3/o1;->a(Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unreadLabelState:Lec3/p1;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;->copy$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/String;ZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    move-result-object v1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final dismissAllMessageActions()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageActions:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-virtual {v0, v1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final dismissMessageAction(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V
    .locals 2

    const-string v0, "messageAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageActions:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    invoke-static {p1, v1}, Ldt/b;->y(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final displayPollMoreOptions(Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_pollState:Lec3/p1;

    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollState;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollState;

    invoke-direct {v1, p1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollState;-><init>(Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;)V

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    invoke-virtual {v0, p1, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final enterNormalMode()V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_mode:Lec3/p1;

    sget-object v2, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$Normal;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/MessageMode$Normal;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1, v2}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_threadListState:Lec3/p1;

    new-instance v2, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    const/16 v15, 0xfff

    const/16 v16, 0x0

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

    invoke-direct/range {v2 .. v16}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;-><init>(Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v3, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iput-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->lastLoadedThreadMessage:Lio/getstream/chat/android/models/Message;

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->threadJob:Lbc3/k1;

    if-eqz v1, :cond_0

    invoke-interface {v1, v3}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method

.method public final enterThreadMode(Lio/getstream/chat/android/models/Message;ILq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadMode$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadMode$1;

    iget v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadMode$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadMode$1;->label:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadMode$1;

    invoke-direct {v0, p0, p3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadMode$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadMode$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadMode$1;->label:I

    const/4 v9, 0x0

    sget-object v10, Ll83/a0;->a:Ll83/a0;

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadMode$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/channel/state/ChannelState;

    iget-object p2, v6, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadMode$1;->L$0:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/models/Message;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, p3

    move-object p3, p1

    move-object p1, p2

    move-object p2, v11

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->channelState:Lec3/f2;

    invoke-interface {p3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lio/getstream/chat/android/client/channel/state/ChannelState;

    if-nez p3, :cond_3

    return-object v10

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageActions:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Set;

    new-instance v4, Lio/getstream/chat/android/ui/common/state/messages/Reply;

    invoke-direct {v4, p1}, Lio/getstream/chat/android/ui/common/state/messages/Reply;-><init>(Lio/getstream/chat/android/models/Message;)V

    invoke-static {v4, v3}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v9, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    move v3, v2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    iget-boolean v4, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->threadLoadOrderOlderToNewer:Z

    iput-object p1, v6, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadMode$1;->L$0:Ljava/lang/Object;

    iput-object p3, v6, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadMode$1;->L$1:Ljava/lang/Object;

    iput p2, v6, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadMode$1;->I$0:I

    iput v3, v6, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$enterThreadMode$1;->label:I

    const/4 v5, 0x0

    const/16 v7, 0x8

    const/4 v8, 0x0

    move v3, p2

    invoke-static/range {v1 .. v8}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->getRepliesAsState$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;IZLbc3/c0;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    check-cast p2, Lio/getstream/chat/android/client/api/state/ThreadState;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_mode:Lec3/p1;

    new-instance v1, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    invoke-direct {v1, p1, p2}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/api/state/ThreadState;)V

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v9, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-interface {p2}, Lio/getstream/chat/android/client/api/state/ThreadState;->getParentId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2}, Lio/getstream/chat/android/client/api/state/ThreadState;->getMessages()Lec3/f2;

    move-result-object v4

    invoke-interface {p2}, Lio/getstream/chat/android/client/api/state/ThreadState;->getEndOfOlderMessages()Lec3/f2;

    move-result-object v5

    invoke-interface {p3}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getReads()Lec3/f2;

    move-result-object v6

    invoke-interface {p3}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getMembers()Lec3/f2;

    move-result-object v7

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->observeThreadMessagesState(Ljava/lang/String;Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;)V

    return-object v10
.end method

.method public final flagMessage(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onResult"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageActions:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageActions:Lec3/p1;

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lio/getstream/chat/android/ui/common/state/messages/Flag;

    if-eqz v5, :cond_0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v3}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Ldt/b;->z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Lio/getstream/chat/android/client/ChatClient;->flagMessage(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;

    move-result-object p1

    new-instance p2, Lio/getstream/chat/android/ui/common/feature/messages/list/f;

    const/4 p3, 0x0

    invoke-direct {p2, p4, p0, p3}, Lio/getstream/chat/android/ui/common/feature/messages/list/f;-><init>(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-interface {p1, p2}, Lo23/d;->enqueue(Lo23/a;)V

    return-void
.end method

.method public final flagUser(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0, p1, p2, p3}, Lio/getstream/chat/android/client/ChatClient;->flagUser(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;

    move-result-object p1

    new-instance p2, Lio/getstream/chat/android/ui/common/feature/messages/list/g;

    const/4 p3, 0x6

    invoke-direct {p2, p0, p3}, Lio/getstream/chat/android/ui/common/feature/messages/list/g;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-static {p1, p2}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final getChannel()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->channel:Lec3/f2;

    return-object v0
.end method

.method public final getChannelState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->channelState:Lec3/f2;

    return-object v0
.end method

.method public final getConnectionState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->connectionState:Lec3/f2;

    return-object v0
.end method

.method public final getErrorEvents()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->errorEvents:Lec3/f2;

    return-object v0
.end method

.method public final getEvents()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->events:Lec3/t1;

    return-object v0
.end method

.method public final getLastSeenMessageId$stream_chat_android_ui_common_release()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->isInThread()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->lastSeenThreadMessageId:Ljava/lang/String;

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->lastSeenChannelMessageId:Ljava/lang/String;

    return-object v0
.end method

.method public final getListState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->listState:Lec3/f2;

    return-object v0
.end method

.method public final getMessageActions()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->messageActions:Lec3/f2;

    return-object v0
.end method

.method public final getMessageFooterVisibilityState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->messageFooterVisibilityState:Lec3/f2;

    return-object v0
.end method

.method public final getMessageFromListStateById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;
    .locals 5

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->listState:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getMessageItems()Ljava/util/List;

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

    check-cast v3, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;

    instance-of v4, v3, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    if-eqz v4, :cond_0

    check-cast v3, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    instance-of p1, v1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    if-eqz p1, :cond_2

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1

    :cond_3
    return-object v2
.end method

.method public final getMessageLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->messageLimit:I

    return v0
.end method

.method public final getMessageListState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->messageListState:Lec3/f2;

    return-object v0
.end method

.method public final getMode()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->mode:Lec3/f2;

    return-object v0
.end method

.method public final getOwnCapabilities()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->ownCapabilities:Lec3/f2;

    return-object v0
.end method

.method public final getPollState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->pollState:Lec3/f2;

    return-object v0
.end method

.method public final getShowSystemMessagesState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->showSystemMessagesState:Lec3/f2;

    return-object v0
.end method

.method public final getThreadListState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->threadListState:Lec3/f2;

    return-object v0
.end method

.method public final getThreadLoadOrderOlderToNewer()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->threadLoadOrderOlderToNewer:Z

    return v0
.end method

.method public final getTypingUsers()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->typingUsers:Lec3/f2;

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

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unreadCount:Lec3/f2;

    return-object v0
.end method

.method public final getUnreadLabelState()Lec3/p1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/p1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unreadLabelState:Lec3/p1;

    return-object v0
.end method

.method public final getUser()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->user:Lec3/f2;

    return-object v0
.end method

.method public final hideUnreadSeparator()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unreadLabelState:Lec3/p1;

    const/4 v1, 0x0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void
.end method

.method public final isInThread()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_mode:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    return v0
.end method

.method public final isInsideSearch()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->isInsideSearch:Lec3/f2;

    return-object v0
.end method

.method public final isStartedForThread()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->isStartedForThread:Z

    return v0
.end method

.method public final loadMessageById(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[loadMessageById] messageId: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->cid:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->loadMessageById(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object v0

    new-instance v1, Lbc/i;

    const/4 v2, 0x4

    invoke-direct {v1, p2, p0, p1, v2}, Lbc/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    check-cast v0, Lo23/h;

    invoke-virtual {v0, v1}, Lo23/h;->enqueue(Lo23/a;)V

    return-void
.end method

.method public final loadNewerMessages(Ljava/lang/String;I)V
    .locals 5

    const-string v0, "baseMessageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[loadNewerMessages] baseMessageId: "

    const-string v4, ", messageLimit: "

    invoke-static {p2, v1, p1, v4}, Lm4/a;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {v0}, Lio/getstream/chat/android/client/setup/state/ClientState;->isOffline()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_mode:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    instance-of v1, v0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$Normal;

    if-eqz v1, :cond_2

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->loadNewerChannelMessages(Ljava/lang/String;I)V

    return-void

    :cond_2
    instance-of p1, v0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    if-eqz p1, :cond_3

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->loadNewerMessagesInThread(Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;)V

    return-void

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final loadOlderMessages(I)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[loadOlderMessages] messageLimit: "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {v0}, Lio/getstream/chat/android/client/setup/state/ClientState;->isOffline()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_mode:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    instance-of v1, v0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$Normal;

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->channelState:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/channel/state/ChannelState;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getEndOfOlderMessages()Lec3/f2;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-ne v0, v1, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->channelState:Lec3/f2;

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/client/channel/state/ChannelState;

    if-eqz v3, :cond_3

    invoke-interface {v3}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getLoadingOlderMessages()Lec3/f2;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-ne v3, v1, :cond_3

    move v2, v1

    :cond_3
    if-nez v0, :cond_5

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->cid:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->loadOlderMessages(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;I)Lo23/d;

    move-result-object p1

    check-cast p1, Lo23/h;

    invoke-virtual {p1}, Lo23/h;->enqueue()V

    :cond_5
    :goto_1
    return-void

    :cond_6
    instance-of p1, v0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    if-eqz p1, :cond_7

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    const/4 p1, 0x2

    invoke-static {p0, v0, v2, p1, v4}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->threadLoadMore$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;IILjava/lang/Object;)V

    return-void

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final markLastMessageRead()V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->cid:Ljava/lang/String;

    const-string v4, "[markLastMessageRead] cid: "

    invoke-static {v4, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->debouncer:Lio/getstream/chat/android/core/utils/Debouncer;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/list/b;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/b;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/core/utils/Debouncer;->submit(Lc93/a;)V

    return-void
.end method

.method public final markUnread(Lio/getstream/chat/android/models/Message;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->cid:Ljava/lang/String;

    invoke-static {v0}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object v0

    iget-object v1, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->mode:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    instance-of v3, v2, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$Normal;

    if-eqz v3, :cond_0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, v1, v0, p1}, Lio/getstream/chat/android/client/ChatClient;->markUnread(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of p1, v2, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v0, v2}, Lio/getstream/chat/android/client/ChatClient;->markThreadUnread(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    :goto_0
    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/f;

    const/4 v1, 0x1

    invoke-direct {v0, p2, p0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/f;-><init>(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-interface {p1, v0}, Lo23/d;->enqueue(Lo23/a;)V

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final muteUser(Lio/getstream/chat/android/models/User;)V
    .locals 3

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lio/getstream/chat/android/client/ChatClient;->muteUser$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)Lo23/d;

    move-result-object p1

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/g;

    const/16 v1, 0x16

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/g;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-static {p1, v0}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final muteUser(Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/ChatClient;->muteUser(Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;

    move-result-object p1

    .line 3
    new-instance p2, Lio/getstream/chat/android/ui/common/feature/messages/list/g;

    const/16 v0, 0xa

    invoke-direct {p2, p0, v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/g;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-static {p1, p2}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final onCleared()V
    .locals 2

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getOriginalTranslationsStore()Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scope:Lbc3/c0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final openRelatedThread(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 9
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

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isThreadStart(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    const/4 v1, 0x1

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    if-ne v0, v1, :cond_1

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v3, p0

    move-object v4, p1

    move-object v6, p2

    invoke-static/range {v3 .. v8}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->enterThreadMode$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Message;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    return-object v2

    :cond_1
    move-object v3, p0

    move-object v4, p1

    move-object v6, p2

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-direct {p0, p1, v6}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->enterThreadSequential(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    return-object v2
.end method

.method public final pauseAudioRecordingAttachments()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->getAudioPlayer()Lio/getstream/chat/android/client/audio/AudioPlayer;

    move-result-object v0

    invoke-interface {v0}, Lio/getstream/chat/android/client/audio/AudioPlayer;->pause()V

    return-void
.end method

.method public final performGiphyAction(Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;)V
    .locals 4

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    instance-of v1, p1, Lio/getstream/chat/android/ui/common/state/messages/list/SendGiphy;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/ChatClient;->sendGiphy(Lio/getstream/chat/android/models/Message;)Lo23/d;

    move-result-object v1

    goto :goto_0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/state/messages/list/ShuffleGiphy;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/ChatClient;->shuffleGiphy(Lio/getstream/chat/android/models/Message;)Lo23/d;

    move-result-object v1

    goto :goto_0

    :cond_1
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/state/messages/list/CancelGiphy;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {v1, v0}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->cancelEphemeralMessage(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/Message;)Lo23/d;

    move-result-object v1

    :goto_0
    new-instance v2, Lig0/h;

    const/16 v3, 0x11

    invoke-direct {v2, p0, p1, v0, v3}, Lig0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v1, v2}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final performMessageAction(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->removeOverlay()V

    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/messages/Resend;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_0

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/Resend;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/Resend;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->resendMessage(Lio/getstream/chat/android/models/Message;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/messages/ThreadReply;

    if-eqz v0, :cond_1

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/ThreadReply;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/ThreadReply;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v3

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    move-object v5, p2

    invoke-static/range {v2 .. v7}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->enterThreadMode$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Message;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_a

    return-object p1

    :cond_1
    move-object v2, p0

    instance-of p2, p1, Lio/getstream/chat/android/ui/common/state/messages/Delete;

    const/4 v0, 0x0

    if-nez p2, :cond_b

    instance-of p2, p1, Lio/getstream/chat/android/ui/common/state/messages/Flag;

    if-eqz p2, :cond_2

    goto/16 :goto_0

    :cond_2
    instance-of p2, p1, Lio/getstream/chat/android/ui/common/state/messages/MuteUser;

    if-eqz p2, :cond_3

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/MuteUser;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/MuteUser;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->muteUser(Lio/getstream/chat/android/models/User;)V

    return-object v1

    :cond_3
    instance-of p2, p1, Lio/getstream/chat/android/ui/common/state/messages/UnmuteUser;

    if-eqz p2, :cond_4

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/UnmuteUser;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/UnmuteUser;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unmuteUser(Lio/getstream/chat/android/models/User;)V

    return-object v1

    :cond_4
    instance-of p2, p1, Lio/getstream/chat/android/ui/common/state/messages/BlockUser;

    if-eqz p2, :cond_5

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/BlockUser;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/BlockUser;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->blockUser(Ljava/lang/String;)V

    return-object v1

    :cond_5
    instance-of p2, p1, Lio/getstream/chat/android/ui/common/state/messages/UnblockUser;

    if-eqz p2, :cond_6

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/UnblockUser;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/UnblockUser;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unblockUser(Ljava/lang/String;)V

    return-object v1

    :cond_6
    instance-of p2, p1, Lio/getstream/chat/android/ui/common/state/messages/Copy;

    if-eqz p2, :cond_7

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/Copy;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/Copy;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->copyMessage(Lio/getstream/chat/android/models/Message;)V

    return-object v1

    :cond_7
    instance-of p2, p1, Lio/getstream/chat/android/ui/common/state/messages/React;

    if-eqz p2, :cond_8

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/React;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/React;->getReaction()Lio/getstream/chat/android/models/Reaction;

    move-result-object p2

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/React;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/React;->getSkipPush()Z

    move-result p1

    invoke-virtual {p0, p2, v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->reactToMessage(Lio/getstream/chat/android/models/Reaction;Lio/getstream/chat/android/models/Message;Z)V

    return-object v1

    :cond_8
    instance-of p2, p1, Lio/getstream/chat/android/ui/common/state/messages/Pin;

    if-eqz p2, :cond_9

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/Pin;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/Pin;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->updateMessagePin(Lio/getstream/chat/android/models/Message;)V

    return-object v1

    :cond_9
    instance-of p2, p1, Lio/getstream/chat/android/ui/common/state/messages/MarkAsUnread;

    if-eqz p2, :cond_a

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/MarkAsUnread;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/MarkAsUnread;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    const/4 p2, 0x2

    invoke-static {p0, p1, v0, p2, v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->markUnread$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Message;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    :cond_a
    return-object v1

    :cond_b
    :goto_0
    iget-object p2, v2, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageActions:Lec3/p1;

    check-cast p2, Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Set;

    invoke-static {p1, v3}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2, v0, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v1
.end method

.method public final pinMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->pinMessage(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)V

    return-void
.end method

.method public final pinMessage(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)V
    .locals 8

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v0

    .line 3
    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    .line 4
    sget-object v2, Lb23/g;->y:Lb23/g;

    .line 5
    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    .line 6
    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 7
    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    .line 8
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v4

    const-string v5, ", message.text: "

    const-string v6, ", expiresAt: "

    .line 9
    const-string v7, "[pinMessage] message.id: "

    invoke-static {v7, v1, v5, v4, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 10
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    .line 11
    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 12
    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/ChatClient;->pinMessage(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Lo23/d;

    move-result-object p1

    new-instance p2, Lio/getstream/chat/android/ui/common/feature/messages/list/g;

    const/16 v0, 0x12

    invoke-direct {p2, p0, v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/g;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-static {p1, p2}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final reactToMessage(Lio/getstream/chat/android/models/Reaction;Lio/getstream/chat/android/models/Message;Z)V
    .locals 3

    const-string v0, "reaction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getOwnReactions()Ljava/util/List;

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

    check-cast v1, Lio/getstream/chat/android/models/Reaction;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p3, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->cid:Ljava/lang/String;

    invoke-virtual {p3, p2, v0, v1}, Lio/getstream/chat/android/client/ChatClient;->deleteReaction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p2

    new-instance p3, Lio/getstream/chat/android/ui/common/feature/messages/list/d;

    const/4 v0, 0x0

    invoke-direct {p3, p0, p1, v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/d;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Reaction;I)V

    invoke-static {p2, p3}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_2
    :goto_0
    iget-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->enforceUniqueReactions:Z

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->cid:Ljava/lang/String;

    invoke-virtual {p2, p1, v0, v1, p3}, Lio/getstream/chat/android/client/ChatClient;->sendReaction(Lio/getstream/chat/android/models/Reaction;ZLjava/lang/String;Z)Lo23/d;

    move-result-object p2

    new-instance p3, Lio/getstream/chat/android/ui/common/feature/messages/list/d;

    const/4 v0, 0x1

    invoke-direct {p3, p0, p1, v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/d;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Reaction;I)V

    invoke-static {p2, p3}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final removeAttachment(Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;)V
    .locals 5

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachmentToBeDeleted"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[removeAttachment] messageId: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", attachmentToBeDeleted: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->cid:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->loadMessageById(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object v0

    new-instance v1, Lbc/i;

    const/4 v2, 0x3

    invoke-direct {v1, p0, p1, p2, v2}, Lbc/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    check-cast v0, Lo23/h;

    invoke-virtual {v0, v1}, Lo23/h;->enqueue(Lo23/a;)V

    return-void
.end method

.method public final removeOverlay()V
    .locals 21

    move-object/from16 v0, p0

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->x:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const/4 v5, 0x0

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[removeOverlay] no args"

    invoke-interface {v1, v3, v4, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_threadListState:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    const/16 v19, 0xbff

    const/16 v20, 0x0

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

    invoke-static/range {v6 .. v20}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v5, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageListState:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    const/16 v15, 0xbff

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-static/range {v2 .. v16}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->setMessageListState(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)V

    return-void
.end method

.method public final removeShadowBanFromUser(Ljava/lang/String;)V
    .locals 2

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->cid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/ChatClient;->channel(Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelClient;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/channel/ChannelClient;->removeShadowBan(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/g;

    const/16 v1, 0xb

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/g;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-static {p1, v0}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final removeVote(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Vote;)V
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vote"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Vote;->getId()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Lio/getstream/chat/android/client/ChatClient;->removePollVote(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    new-instance p2, Lio/getstream/chat/android/ui/common/feature/messages/list/g;

    const/16 p3, 0xf

    invoke-direct {p2, p0, p3}, Lio/getstream/chat/android/ui/common/feature/messages/list/g;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-static {p1, p2}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final resendMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 9

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object v0

    iget-object v1, v0, Ll83/k;->w:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v5, p1

    invoke-static/range {v2 .. v8}, Lio/getstream/chat/android/client/ChatClient;->sendMessage$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;ZILjava/lang/Object;)Lo23/d;

    move-result-object p1

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/g;

    const/16 v1, 0x8

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/g;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-static {p1, v0}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final scrollToBottom(ILc93/a;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "scrollToBottom"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->isInThread()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->channelState:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/channel/state/ChannelState;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getEndOfNewerMessages()Lec3/f2;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->cid:Ljava/lang/String;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move v4, p1

    invoke-static/range {v2 .. v7}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->loadNewestMessages$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;IZILjava/lang/Object;)Lo23/d;

    move-result-object p1

    new-instance v0, Lc9/c;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p2, p0}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    check-cast p1, Lo23/h;

    invoke-virtual {p1, v0}, Lo23/h;->enqueue(Lo23/a;)V

    return-void

    :cond_1
    :goto_0
    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final scrollToFirstUnreadMessage()V
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unreadLabelState:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    if-eqz v0, :cond_6

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getMessagesState()Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getMessageItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    if-eqz v4, :cond_0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;->getLastReadMessageId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_4
    move-object v3, v4

    :goto_2
    check-cast v3, Lio/getstream/chat/android/models/Message;

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->focusUnreadMessage(Ljava/util/List;Ljava/lang/String;)V

    goto :goto_3

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scope:Lbc3/c0;

    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$scrollToFirstUnreadMessage$1$3$1;

    invoke-direct {v2, p0, v0, v4}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$scrollToFirstUnreadMessage$1$3$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;Lq83/d;)V

    const/4 v0, 0x3

    invoke-static {v1, v4, v4, v2, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_6
    :goto_3
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->disableUnreadLabelButton()V

    return-void
.end method

.method public final scrollToMessage(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->focusMessage(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final selectExtendedReactions(Lio/getstream/chat/android/models/Message;)V
    .locals 2

    if-eqz p1, :cond_0

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageReactionsPickerState;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->channel:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Channel;

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageReactionsPickerState;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->changeSelectMessageState(Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;)V

    :cond_0
    return-void
.end method

.method public final selectMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/ChatClient;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-static {p1, v0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isModerationError(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageFailedModerationState;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->channel:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Channel;

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageFailedModerationState;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageOptionsState;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->channel:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Channel;

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageOptionsState;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;)V

    :cond_2
    :goto_0
    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->changeSelectMessageState(Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;)V

    return-void
.end method

.method public final selectReactions(Lio/getstream/chat/android/models/Message;)V
    .locals 2

    if-eqz p1, :cond_0

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageReactionsState;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->channel:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Channel;

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageReactionsState;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->changeSelectMessageState(Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;)V

    :cond_0
    return-void
.end method

.method public final setDateSeparatorHandler(Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_dateSeparatorHandler:Lec3/p1;

    if-nez p1, :cond_0

    new-instance p1, Lio/getstream/chat/android/ui/common/feature/messages/list/a;

    const/4 v1, 0x2

    invoke-direct {p1, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/a;-><init>(I)V

    :cond_0
    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final setLastSeenMessageId$stream_chat_android_ui_common_release(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->isInThread()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->lastSeenThreadMessageId:Ljava/lang/String;

    return-void

    :cond_0
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->lastSeenChannelMessageId:Ljava/lang/String;

    return-void
.end method

.method public final setMessageFooterVisibility(Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;)V
    .locals 2

    const-string v0, "messageFooterVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messageFooterVisibilityState:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final setMessagePositionHandler(Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;)V
    .locals 2

    const-string v0, "messagePositionHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_messagePositionHandler:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final setSystemMessageVisibility(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_showSystemMessagesState:Lec3/p1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final setThreadDateSeparatorHandler(Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_threadDateSeparatorHandler:Lec3/p1;

    if-nez p1, :cond_0

    new-instance p1, Lio/getstream/chat/android/ui/common/feature/messages/list/a;

    const/4 v1, 0x3

    invoke-direct {p1, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/a;-><init>(I)V

    :cond_0
    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final shadowBanUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 2

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->cid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/ChatClient;->channel(Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelClient;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lio/getstream/chat/android/client/channel/ChannelClient;->shadowBanUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;

    move-result-object p1

    new-instance p2, Lio/getstream/chat/android/ui/common/feature/messages/list/g;

    const/16 p3, 0x13

    invoke-direct {p2, p0, p3}, Lio/getstream/chat/android/ui/common/feature/messages/list/g;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-static {p1, p2}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final toggleOriginalText(Ljava/lang/String;)V
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getOriginalTranslationsStore()Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;->toggleOriginalText(Ljava/lang/String;)V

    return-void
.end method

.method public final unbanUser(Ljava/lang/String;)V
    .locals 2

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->cid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/ChatClient;->channel(Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelClient;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/channel/ChannelClient;->unbanUser(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/g;

    const/4 v1, 0x7

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/g;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-static {p1, v0}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final unblockUser(Ljava/lang/String;)V
    .locals 2

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/ChatClient;->unblockUser(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/g;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/g;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-static {p1, v0}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final unflagUser(Ljava/lang/String;)V
    .locals 2

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/ChatClient;->unflagUser(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/g;

    const/16 v1, 0x15

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/g;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-static {p1, v0}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final unmuteUser(Lio/getstream/chat/android/models/User;)V
    .locals 2

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/ChatClient;->unmuteUser(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/g;

    const/16 v1, 0x14

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/g;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-static {p1, v0}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final unmuteUser(Ljava/lang/String;)V
    .locals 2

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/ChatClient;->unmuteUser(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    .line 3
    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/g;

    const/16 v1, 0x10

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/g;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-static {p1, v0}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final unpinMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 7

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

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

    const-string v5, "[unpinMessage] message.id: "

    const-string v6, ", message.text: "

    invoke-static {v5, v1, v6, v4}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/ChatClient;->unpinMessage(Lio/getstream/chat/android/models/Message;)Lo23/d;

    move-result-object p1

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/g;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/g;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-static {p1, v0}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final updateLastSeenMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 13

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->isInThread()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->lastLoadedThreadMessage:Lio/getstream/chat/android/models/Message;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->lastLoadedMessage:Lio/getstream/chat/android/models/Message;

    :goto_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->isInThread()Z

    move-result v2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v7

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    :cond_1
    move-object v8, v5

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v9

    goto :goto_2

    :cond_2
    move-object v9, v5

    :goto_2
    const-string v10, "[updateLastSeenMessage] isInThread: "

    const-string v11, ", message: "

    const-string v12, "(\'"

    invoke-static {v10, v11, v6, v12, v2}, Lev/n;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v6, "\'), lastLoadedMessage: "

    invoke-static {v2, v7, v6, v8, v12}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "\')"

    invoke-static {v9, v6, v2}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v4, v3, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_4
    move-object v0, v5

    :goto_3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->x:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->isInThread()Z

    move-result v0

    const-string v3, "[updateLastSeenMessage] matched(isInThread: "

    const-string v4, ")"

    invoke-static {v3, v4, v0}, Lc13/a;->k(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v1, v0, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->markLastMessageRead()V

    :cond_6
    return-void
.end method

.method public final updateMessagePin(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unpinMessage(Lio/getstream/chat/android/models/Message;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->pinMessage(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)V

    return-void
.end method

.method public final updatePollOption(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)V
    .locals 7

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "poll"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "option"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;

    const/4 v6, 0x0

    move-object v3, p0

    move-object v4, p1

    move-object v2, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;-><init>(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Option;Lq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {v0, p2, p2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final updatePollState(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;)V
    .locals 3

    const-string v0, "poll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollSelectionType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->_pollState:Lec3/p1;

    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollState;

    new-instance v2, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;

    invoke-direct {v2, p1, p2, p3}, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;-><init>(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollState;

    invoke-direct {p1, v2}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollState;-><init>(Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;)V

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x0

    invoke-virtual {v0, p2, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final updateUserMute(Lio/getstream/chat/android/models/User;)V
    .locals 3

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {v0}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->getGlobalState(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/api/state/GlobalState;

    move-result-object v0

    invoke-interface {v0}, Lio/getstream/chat/android/client/api/state/GlobalState;->getMuted()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Mute;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Mute;->getTarget()Lio/getstream/chat/android/models/User;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unmuteUser(Lio/getstream/chat/android/models/User;)V

    return-void

    :cond_3
    :goto_1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->muteUser(Lio/getstream/chat/android/models/User;)V

    return-void
.end method
