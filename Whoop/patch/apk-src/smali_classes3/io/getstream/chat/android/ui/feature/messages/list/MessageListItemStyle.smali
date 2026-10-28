.class public final Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/helper/ViewStyle;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;,
        Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0007\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u007f\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u0000 \u00b9\u00012\u00020\u0001:\u0004\u00b9\u0001\u00ba\u0001B\u00cb\u0003\u0012\n\u0008\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020\u001d\u0012\u0006\u0010\"\u001a\u00020\u000b\u0012\u0008\u0008\u0001\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u000b\u0012\u0008\u0008\u0001\u0010%\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010&\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\'\u001a\u00020(\u0012\u0008\u0008\u0001\u0010)\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010*\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020\u000b\u0012\u0006\u0010,\u001a\u00020\u000b\u0012\u0006\u0010-\u001a\u00020\u000b\u0012\u0006\u0010.\u001a\u00020\u001d\u0012\u0008\u0008\u0001\u0010/\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u00100\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u00101\u001a\u00020\u0003\u0012\u0006\u00102\u001a\u00020(\u0012\u0006\u00103\u001a\u00020(\u0012\u0006\u00104\u001a\u000205\u0012\u0006\u00106\u001a\u00020\u001d\u0012\u0006\u00107\u001a\u00020\u001d\u0012\u0006\u00108\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u00109\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010:\u001a\u00020\u0003\u0012\u0006\u0010;\u001a\u00020\u000b\u00a2\u0006\u0004\u0008<\u0010=J\u0017\u0010z\u001a\u0004\u0018\u00010\u00032\u0006\u0010{\u001a\u000205H\u0007\u00a2\u0006\u0002\u0010|J\u0017\u0010}\u001a\u0004\u0018\u00010\u00032\u0006\u0010{\u001a\u000205H\u0007\u00a2\u0006\u0002\u0010|J\u0010\u0010~\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\n\u0010\u0082\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0085\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u0086\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u0087\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u0088\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u0089\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u008a\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u008b\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u008c\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u008e\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u008f\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0091\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u0093\u0001\u001a\u00020\u001bH\u00c6\u0003J\n\u0010\u0094\u0001\u001a\u00020\u001dH\u00c6\u0003J\n\u0010\u0095\u0001\u001a\u00020\u001dH\u00c6\u0003J\n\u0010\u0096\u0001\u001a\u00020\u001dH\u00c6\u0003J\n\u0010\u0097\u0001\u001a\u00020\u001dH\u00c6\u0003J\n\u0010\u0098\u0001\u001a\u00020\u001dH\u00c6\u0003J\n\u0010\u0099\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009b\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009e\u0001\u001a\u00020(H\u00c6\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a0\u0001\u001a\u00020(H\u00c6\u0003J\n\u0010\u00a1\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u00a2\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u00a3\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u00a4\u0001\u001a\u00020\u001dH\u00c6\u0003J\n\u0010\u00a5\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a6\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a7\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a8\u0001\u001a\u00020(H\u00c6\u0003J\n\u0010\u00a9\u0001\u001a\u00020(H\u00c6\u0003J\n\u0010\u00aa\u0001\u001a\u000205H\u00c6\u0003J\n\u0010\u00ab\u0001\u001a\u00020\u001dH\u00c6\u0003J\n\u0010\u00ac\u0001\u001a\u00020\u001dH\u00c6\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ae\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00af\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b0\u0001\u001a\u00020\u000bH\u00c6\u0003J\u0096\u0004\u0010\u00b1\u0001\u001a\u00020\u00002\n\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u000b2\u0008\u0008\u0003\u0010\u0016\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u001b2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u001d2\u0008\u0008\u0002\u0010 \u001a\u00020\u001d2\u0008\u0008\u0002\u0010!\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\"\u001a\u00020\u000b2\u0008\u0008\u0003\u0010#\u001a\u00020\u00032\u0008\u0008\u0002\u0010$\u001a\u00020\u000b2\u0008\u0008\u0003\u0010%\u001a\u00020\u00032\u0008\u0008\u0003\u0010&\u001a\u00020\u00032\u0008\u0008\u0003\u0010\'\u001a\u00020(2\u0008\u0008\u0003\u0010)\u001a\u00020\u00032\u0008\u0008\u0003\u0010*\u001a\u00020(2\u0008\u0008\u0002\u0010+\u001a\u00020\u000b2\u0008\u0008\u0002\u0010,\u001a\u00020\u000b2\u0008\u0008\u0002\u0010-\u001a\u00020\u000b2\u0008\u0008\u0002\u0010.\u001a\u00020\u001d2\u0008\u0008\u0003\u0010/\u001a\u00020\u00032\u0008\u0008\u0003\u00100\u001a\u00020\u00032\u0008\u0008\u0003\u00101\u001a\u00020\u00032\u0008\u0008\u0002\u00102\u001a\u00020(2\u0008\u0008\u0002\u00103\u001a\u00020(2\u0008\u0008\u0002\u00104\u001a\u0002052\u0008\u0008\u0002\u00106\u001a\u00020\u001d2\u0008\u0008\u0002\u00107\u001a\u00020\u001d2\u0008\u0008\u0002\u00108\u001a\u00020\u00032\u0008\u0008\u0003\u00109\u001a\u00020\u00032\u0008\u0008\u0003\u0010:\u001a\u00020\u00032\u0008\u0008\u0002\u0010;\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0003\u0010\u00b2\u0001J\u0016\u0010\u00b3\u0001\u001a\u0002052\n\u0010\u00b4\u0001\u001a\u0005\u0018\u00010\u00b5\u0001H\u00d6\u0003J\n\u0010\u00b6\u0001\u001a\u00020\u0003H\u00d6\u0001J\u000b\u0010\u00b7\u0001\u001a\u00030\u00b8\u0001H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010@\u001a\u0004\u0008>\u0010?R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010@\u001a\u0004\u0008A\u0010?R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010@\u001a\u0004\u0008B\u0010?R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010@\u001a\u0004\u0008C\u0010?R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008D\u0010ER\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008F\u0010ER\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008G\u0010ER\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008H\u0010IR\u0011\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008J\u0010IR\u0011\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008K\u0010IR\u0011\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008L\u0010IR\u0011\u0010\u000f\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008M\u0010IR\u0011\u0010\u0010\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008N\u0010IR\u0011\u0010\u0011\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008O\u0010IR\u0011\u0010\u0012\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008P\u0010IR\u0011\u0010\u0013\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Q\u0010IR\u0011\u0010\u0014\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008R\u0010IR\u0011\u0010\u0015\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008S\u0010IR\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008T\u0010ER\u0011\u0010\u0017\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008U\u0010IR\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008V\u0010WR\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008X\u0010YR\u0011\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Z\u0010[R\u0011\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\\\u0010[R\u0011\u0010\u001f\u001a\u00020\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008]\u0010[R\u0011\u0010 \u001a\u00020\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008^\u0010[R\u0011\u0010!\u001a\u00020\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008_\u0010[R\u0011\u0010\"\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008`\u0010IR\u0011\u0010#\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008a\u0010ER\u0011\u0010$\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008b\u0010IR\u0011\u0010%\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008c\u0010ER\u0011\u0010&\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008d\u0010ER\u0011\u0010\'\u001a\u00020(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008e\u0010fR\u0011\u0010)\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008g\u0010ER\u0011\u0010*\u001a\u00020(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008h\u0010fR\u0011\u0010+\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008i\u0010IR\u0011\u0010,\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008j\u0010IR\u0011\u0010-\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008k\u0010IR\u0011\u0010.\u001a\u00020\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008l\u0010[R\u0011\u0010/\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008m\u0010ER\u0011\u00100\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008n\u0010ER\u0011\u00101\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008o\u0010ER\u0011\u00102\u001a\u00020(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008p\u0010fR\u0011\u00103\u001a\u00020(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008q\u0010fR\u0011\u00104\u001a\u000205\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008r\u0010sR\u0011\u00106\u001a\u00020\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008t\u0010[R\u0011\u00107\u001a\u00020\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008u\u0010[R\u0011\u00108\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008v\u0010ER\u0011\u00109\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008w\u0010ER\u0011\u0010:\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008x\u0010ER\u0011\u0010;\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008y\u0010I\u00a8\u0006\u00bb\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "Lio/getstream/chat/android/ui/helper/ViewStyle;",
        "messageBackgroundColorMine",
        "",
        "messageBackgroundColorTheirs",
        "messageLinkTextColorMine",
        "messageLinkTextColorTheirs",
        "messageLinkBackgroundColorMine",
        "messageLinkBackgroundColorTheirs",
        "linkDescriptionMaxLines",
        "textStyleMine",
        "Lio/getstream/chat/android/ui/font/TextStyle;",
        "textStyleTheirs",
        "textStyleUserName",
        "textStyleMessageDate",
        "textStyleMessageLanguage",
        "textStyleThreadCounter",
        "textStyleReadCounter",
        "threadSeparatorTextStyle",
        "textStyleLinkLabel",
        "textStyleLinkTitle",
        "textStyleLinkDescription",
        "dateSeparatorBackgroundColor",
        "textStyleDateSeparator",
        "reactionsViewStyle",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;",
        "editReactionsViewStyle",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;",
        "iconIndicatorSent",
        "Landroid/graphics/drawable/Drawable;",
        "iconIndicatorDelivered",
        "iconIndicatorRead",
        "iconIndicatorPendingSync",
        "iconOnlyVisibleToYou",
        "textStyleMessageDeletedMine",
        "messageDeletedBackgroundMine",
        "textStyleMessageDeletedTheirs",
        "messageDeletedBackgroundTheirs",
        "messageStrokeColorMine",
        "messageStrokeWidthMine",
        "",
        "messageStrokeColorTheirs",
        "messageStrokeWidthTheirs",
        "textStyleSystemMessage",
        "textStyleErrorMessage",
        "pinnedMessageIndicatorTextStyle",
        "pinnedMessageIndicatorIcon",
        "pinnedMessageBackgroundColor",
        "messageStartMargin",
        "messageEndMargin",
        "messageMaxWidthFactorMine",
        "messageMaxWidthFactorTheirs",
        "showMessageDeliveryStatusIndicator",
        "",
        "iconFailedMessage",
        "iconBannedMessage",
        "systemMessageAlignment",
        "loadingMoreView",
        "unreadSeparatorBackgroundColor",
        "unreadSeparatorTextStyle",
        "<init>",
        "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;ILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;ILio/getstream/chat/android/ui/font/TextStyle;IIFIFLio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;IIIFFZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IIILio/getstream/chat/android/ui/font/TextStyle;)V",
        "getMessageBackgroundColorMine",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getMessageBackgroundColorTheirs",
        "getMessageLinkTextColorMine",
        "getMessageLinkTextColorTheirs",
        "getMessageLinkBackgroundColorMine",
        "()I",
        "getMessageLinkBackgroundColorTheirs",
        "getLinkDescriptionMaxLines",
        "getTextStyleMine",
        "()Lio/getstream/chat/android/ui/font/TextStyle;",
        "getTextStyleTheirs",
        "getTextStyleUserName",
        "getTextStyleMessageDate",
        "getTextStyleMessageLanguage",
        "getTextStyleThreadCounter",
        "getTextStyleReadCounter",
        "getThreadSeparatorTextStyle",
        "getTextStyleLinkLabel",
        "getTextStyleLinkTitle",
        "getTextStyleLinkDescription",
        "getDateSeparatorBackgroundColor",
        "getTextStyleDateSeparator",
        "getReactionsViewStyle",
        "()Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;",
        "getEditReactionsViewStyle",
        "()Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;",
        "getIconIndicatorSent",
        "()Landroid/graphics/drawable/Drawable;",
        "getIconIndicatorDelivered",
        "getIconIndicatorRead",
        "getIconIndicatorPendingSync",
        "getIconOnlyVisibleToYou",
        "getTextStyleMessageDeletedMine",
        "getMessageDeletedBackgroundMine",
        "getTextStyleMessageDeletedTheirs",
        "getMessageDeletedBackgroundTheirs",
        "getMessageStrokeColorMine",
        "getMessageStrokeWidthMine",
        "()F",
        "getMessageStrokeColorTheirs",
        "getMessageStrokeWidthTheirs",
        "getTextStyleSystemMessage",
        "getTextStyleErrorMessage",
        "getPinnedMessageIndicatorTextStyle",
        "getPinnedMessageIndicatorIcon",
        "getPinnedMessageBackgroundColor",
        "getMessageStartMargin",
        "getMessageEndMargin",
        "getMessageMaxWidthFactorMine",
        "getMessageMaxWidthFactorTheirs",
        "getShowMessageDeliveryStatusIndicator",
        "()Z",
        "getIconFailedMessage",
        "getIconBannedMessage",
        "getSystemMessageAlignment",
        "getLoadingMoreView",
        "getUnreadSeparatorBackgroundColor",
        "getUnreadSeparatorTextStyle",
        "getStyleTextColor",
        "isMine",
        "(Z)Ljava/lang/Integer;",
        "getStyleLinkTextColor",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "component25",
        "component26",
        "component27",
        "component28",
        "component29",
        "component30",
        "component31",
        "component32",
        "component33",
        "component34",
        "component35",
        "component36",
        "component37",
        "component38",
        "component39",
        "component40",
        "component41",
        "component42",
        "component43",
        "component44",
        "component45",
        "component46",
        "component47",
        "component48",
        "component49",
        "component50",
        "component51",
        "copy",
        "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;ILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;ILio/getstream/chat/android/ui/font/TextStyle;IIFIFLio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;IIIFFZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IIILio/getstream/chat/android/ui/font/TextStyle;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "Companion",
        "Builder",
        "stream-chat-android-ui-components_release"
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
.field private static final BASE_MESSAGE_MAX_WIDTH_FACTOR:I = 0x1

.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Companion;

.field private static final DEFAULT_LINK_BACKGROUND_COLOR:I

.field private static final DEFAULT_MESSAGE_MAX_WIDTH_FACTOR:F = 0.75f

.field private static final DEFAULT_TEXT_COLOR:I

.field private static final DEFAULT_TEXT_COLOR_DATE:I

.field private static final DEFAULT_TEXT_COLOR_DATE_SEPARATOR:I

.field private static final DEFAULT_TEXT_COLOR_LINK_DESCRIPTION:I

.field private static final DEFAULT_TEXT_COLOR_READ_COUNTER:I

.field private static final DEFAULT_TEXT_COLOR_THREAD_COUNTER:I

.field private static final DEFAULT_TEXT_COLOR_USER_NAME:I

.field private static final DEFAULT_TEXT_SIZE:I

.field private static final DEFAULT_TEXT_SIZE_DATE:I

.field private static final DEFAULT_TEXT_SIZE_DATE_SEPARATOR:I

.field private static final DEFAULT_TEXT_SIZE_LINK_DESCRIPTION:I

.field private static final DEFAULT_TEXT_SIZE_READ_COUNTER:I

.field private static final DEFAULT_TEXT_SIZE_THREAD_COUNTER:I

.field private static final DEFAULT_TEXT_SIZE_USER_NAME:I

.field public static final DEFAULT_TEXT_STYLE:I = 0x0

.field private static final MESSAGE_STROKE_COLOR_MINE:I

.field private static final MESSAGE_STROKE_COLOR_THEIRS:I

.field public static final MESSAGE_STROKE_WIDTH_MINE:F = 0.0f

.field private static final MESSAGE_STROKE_WIDTH_THEIRS$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final VALUE_NOT_SET:I = 0x7fffffff


# instance fields
.field private final dateSeparatorBackgroundColor:I

.field private final editReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

.field private final iconBannedMessage:Landroid/graphics/drawable/Drawable;

.field private final iconFailedMessage:Landroid/graphics/drawable/Drawable;

.field private final iconIndicatorDelivered:Landroid/graphics/drawable/Drawable;

.field private final iconIndicatorPendingSync:Landroid/graphics/drawable/Drawable;

.field private final iconIndicatorRead:Landroid/graphics/drawable/Drawable;

.field private final iconIndicatorSent:Landroid/graphics/drawable/Drawable;

.field private final iconOnlyVisibleToYou:Landroid/graphics/drawable/Drawable;

.field private final linkDescriptionMaxLines:I

.field private final loadingMoreView:I

.field private final messageBackgroundColorMine:Ljava/lang/Integer;

.field private final messageBackgroundColorTheirs:Ljava/lang/Integer;

.field private final messageDeletedBackgroundMine:I

.field private final messageDeletedBackgroundTheirs:I

.field private final messageEndMargin:I

.field private final messageLinkBackgroundColorMine:I

.field private final messageLinkBackgroundColorTheirs:I

.field private final messageLinkTextColorMine:Ljava/lang/Integer;

.field private final messageLinkTextColorTheirs:Ljava/lang/Integer;

.field private final messageMaxWidthFactorMine:F

.field private final messageMaxWidthFactorTheirs:F

.field private final messageStartMargin:I

.field private final messageStrokeColorMine:I

.field private final messageStrokeColorTheirs:I

.field private final messageStrokeWidthMine:F

.field private final messageStrokeWidthTheirs:F

.field private final pinnedMessageBackgroundColor:I

.field private final pinnedMessageIndicatorIcon:Landroid/graphics/drawable/Drawable;

.field private final pinnedMessageIndicatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

.field private final showMessageDeliveryStatusIndicator:Z

.field private final systemMessageAlignment:I

.field private final textStyleDateSeparator:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final textStyleErrorMessage:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final textStyleLinkDescription:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final textStyleLinkLabel:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final textStyleLinkTitle:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final textStyleMessageDate:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final textStyleMessageDeletedMine:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final textStyleMessageDeletedTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final textStyleMessageLanguage:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final textStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final textStyleReadCounter:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final textStyleSystemMessage:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final textStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final textStyleThreadCounter:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final textStyleUserName:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final threadSeparatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final unreadSeparatorBackgroundColor:I

.field private final unreadSeparatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Companion;

    sget v0, Lio/getstream/chat/android/ui/R$color;->stream_ui_blue_alice:I

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_LINK_BACKGROUND_COLOR:I

    sget v0, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_COLOR:I

    sget v0, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_medium:I

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_SIZE:I

    sget v0, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_secondary:I

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_COLOR_USER_NAME:I

    sget v1, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_small:I

    sput v1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_SIZE_USER_NAME:I

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_COLOR_DATE:I

    sput v1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_SIZE_DATE:I

    sget v2, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_blue:I

    sput v2, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_COLOR_THREAD_COUNTER:I

    sput v1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_SIZE_THREAD_COUNTER:I

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_COLOR_READ_COUNTER:I

    sput v1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_SIZE_READ_COUNTER:I

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_COLOR_LINK_DESCRIPTION:I

    sput v1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_SIZE_LINK_DESCRIPTION:I

    sget v0, Lio/getstream/chat/android/ui/R$color;->stream_ui_white:I

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_COLOR_DATE_SEPARATOR:I

    sput v1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_SIZE_DATE_SEPARATOR:I

    sget v0, Lio/getstream/chat/android/ui/R$color;->stream_ui_literal_transparent:I

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->MESSAGE_STROKE_COLOR_MINE:I

    sget v0, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey_whisper:I

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->MESSAGE_STROKE_COLOR_THEIRS:I

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/a;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->MESSAGE_STROKE_WIDTH_THEIRS$delegate:Ll83/h;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;ILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;ILio/getstream/chat/android/ui/font/TextStyle;IIFIFLio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;IIIFFZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IIILio/getstream/chat/android/ui/font/TextStyle;)V
    .locals 16

    move-object/from16 v1, p8

    move-object/from16 v2, p9

    move-object/from16 v3, p10

    move-object/from16 v4, p11

    move-object/from16 v5, p12

    move-object/from16 v6, p13

    move-object/from16 v7, p14

    move-object/from16 v8, p15

    move-object/from16 v9, p16

    move-object/from16 v10, p17

    move-object/from16 v11, p18

    move-object/from16 v12, p20

    move-object/from16 v13, p21

    move-object/from16 v14, p22

    move-object/from16 v15, p23

    const-string v0, "textStyleMine"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleTheirs"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleUserName"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleMessageDate"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleMessageLanguage"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleThreadCounter"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleReadCounter"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadSeparatorTextStyle"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleLinkLabel"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleLinkTitle"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleLinkDescription"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleDateSeparator"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionsViewStyle"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editReactionsViewStyle"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconIndicatorSent"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconIndicatorDelivered"

    move-object/from16 v15, p24

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconIndicatorRead"

    move-object/from16 v15, p25

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconIndicatorPendingSync"

    move-object/from16 v15, p26

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconOnlyVisibleToYou"

    move-object/from16 v15, p27

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleMessageDeletedMine"

    move-object/from16 v15, p28

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleMessageDeletedTheirs"

    move-object/from16 v15, p30

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleSystemMessage"

    move-object/from16 v15, p36

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleErrorMessage"

    move-object/from16 v15, p37

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pinnedMessageIndicatorTextStyle"

    move-object/from16 v15, p38

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pinnedMessageIndicatorIcon"

    move-object/from16 v15, p39

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconFailedMessage"

    move-object/from16 v15, p46

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconBannedMessage"

    move-object/from16 v15, p47

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unreadSeparatorTextStyle"

    move-object/from16 v15, p51

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    iput-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageBackgroundColorMine:Ljava/lang/Integer;

    move-object/from16 v15, p2

    iput-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageBackgroundColorTheirs:Ljava/lang/Integer;

    move-object/from16 v15, p3

    iput-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkTextColorMine:Ljava/lang/Integer;

    move-object/from16 v15, p4

    iput-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkTextColorTheirs:Ljava/lang/Integer;

    move/from16 v15, p5

    iput v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkBackgroundColorMine:I

    move/from16 v15, p6

    iput v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkBackgroundColorTheirs:I

    move/from16 v15, p7

    iput v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->linkDescriptionMaxLines:I

    iput-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    iput-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    iput-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleUserName:Lio/getstream/chat/android/ui/font/TextStyle;

    iput-object v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDate:Lio/getstream/chat/android/ui/font/TextStyle;

    iput-object v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageLanguage:Lio/getstream/chat/android/ui/font/TextStyle;

    iput-object v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleThreadCounter:Lio/getstream/chat/android/ui/font/TextStyle;

    iput-object v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleReadCounter:Lio/getstream/chat/android/ui/font/TextStyle;

    iput-object v8, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->threadSeparatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iput-object v9, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkLabel:Lio/getstream/chat/android/ui/font/TextStyle;

    iput-object v10, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkTitle:Lio/getstream/chat/android/ui/font/TextStyle;

    iput-object v11, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkDescription:Lio/getstream/chat/android/ui/font/TextStyle;

    move/from16 v1, p19

    iput v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->dateSeparatorBackgroundColor:I

    iput-object v12, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleDateSeparator:Lio/getstream/chat/android/ui/font/TextStyle;

    iput-object v13, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    iput-object v14, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->editReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    move-object/from16 v15, p23

    iput-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorSent:Landroid/graphics/drawable/Drawable;

    move-object/from16 v15, p24

    iput-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorDelivered:Landroid/graphics/drawable/Drawable;

    move-object/from16 v15, p25

    iput-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorRead:Landroid/graphics/drawable/Drawable;

    move-object/from16 v15, p26

    iput-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorPendingSync:Landroid/graphics/drawable/Drawable;

    move-object/from16 v15, p27

    iput-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconOnlyVisibleToYou:Landroid/graphics/drawable/Drawable;

    move-object/from16 v15, p28

    iput-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDeletedMine:Lio/getstream/chat/android/ui/font/TextStyle;

    move/from16 v1, p29

    iput v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageDeletedBackgroundMine:I

    move-object/from16 v15, p30

    iput-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDeletedTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    move/from16 v1, p31

    iput v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageDeletedBackgroundTheirs:I

    move/from16 v1, p32

    iput v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeColorMine:I

    move/from16 v1, p33

    iput v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeWidthMine:F

    move/from16 v1, p34

    iput v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeColorTheirs:I

    move/from16 v1, p35

    iput v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeWidthTheirs:F

    move-object/from16 v15, p36

    iput-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleSystemMessage:Lio/getstream/chat/android/ui/font/TextStyle;

    move-object/from16 v15, p37

    iput-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleErrorMessage:Lio/getstream/chat/android/ui/font/TextStyle;

    move-object/from16 v15, p38

    iput-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageIndicatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    move-object/from16 v15, p39

    iput-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageIndicatorIcon:Landroid/graphics/drawable/Drawable;

    move/from16 v1, p40

    iput v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageBackgroundColor:I

    move/from16 v1, p41

    iput v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStartMargin:I

    move/from16 v1, p42

    iput v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageEndMargin:I

    move/from16 v1, p43

    iput v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageMaxWidthFactorMine:F

    move/from16 v1, p44

    iput v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageMaxWidthFactorTheirs:F

    move/from16 v1, p45

    iput-boolean v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->showMessageDeliveryStatusIndicator:Z

    move-object/from16 v15, p46

    iput-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconFailedMessage:Landroid/graphics/drawable/Drawable;

    move-object/from16 v15, p47

    iput-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconBannedMessage:Landroid/graphics/drawable/Drawable;

    move/from16 v1, p48

    iput v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->systemMessageAlignment:I

    move/from16 v1, p49

    iput v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->loadingMoreView:I

    move/from16 v1, p50

    iput v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->unreadSeparatorBackgroundColor:I

    move-object/from16 v15, p51

    iput-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->unreadSeparatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-void
.end method

.method private static final MESSAGE_STROKE_WIDTH_THEIRS_delegate$lambda$0()F
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPxPrecise(I)F

    move-result v0

    return v0
.end method

.method public static final synthetic access$getDEFAULT_LINK_BACKGROUND_COLOR$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_LINK_BACKGROUND_COLOR:I

    return v0
.end method

.method public static final synthetic access$getDEFAULT_TEXT_COLOR$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_COLOR:I

    return v0
.end method

.method public static final synthetic access$getDEFAULT_TEXT_COLOR_DATE$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_COLOR_DATE:I

    return v0
.end method

.method public static final synthetic access$getDEFAULT_TEXT_COLOR_DATE_SEPARATOR$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_COLOR_DATE_SEPARATOR:I

    return v0
.end method

.method public static final synthetic access$getDEFAULT_TEXT_COLOR_LINK_DESCRIPTION$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_COLOR_LINK_DESCRIPTION:I

    return v0
.end method

.method public static final synthetic access$getDEFAULT_TEXT_COLOR_READ_COUNTER$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_COLOR_READ_COUNTER:I

    return v0
.end method

.method public static final synthetic access$getDEFAULT_TEXT_COLOR_THREAD_COUNTER$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_COLOR_THREAD_COUNTER:I

    return v0
.end method

.method public static final synthetic access$getDEFAULT_TEXT_COLOR_USER_NAME$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_COLOR_USER_NAME:I

    return v0
.end method

.method public static final synthetic access$getDEFAULT_TEXT_SIZE$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_SIZE:I

    return v0
.end method

.method public static final synthetic access$getDEFAULT_TEXT_SIZE_DATE$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_SIZE_DATE:I

    return v0
.end method

.method public static final synthetic access$getDEFAULT_TEXT_SIZE_DATE_SEPARATOR$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_SIZE_DATE_SEPARATOR:I

    return v0
.end method

.method public static final synthetic access$getDEFAULT_TEXT_SIZE_LINK_DESCRIPTION$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_SIZE_LINK_DESCRIPTION:I

    return v0
.end method

.method public static final synthetic access$getDEFAULT_TEXT_SIZE_READ_COUNTER$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_SIZE_READ_COUNTER:I

    return v0
.end method

.method public static final synthetic access$getDEFAULT_TEXT_SIZE_THREAD_COUNTER$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_SIZE_THREAD_COUNTER:I

    return v0
.end method

.method public static final synthetic access$getDEFAULT_TEXT_SIZE_USER_NAME$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->DEFAULT_TEXT_SIZE_USER_NAME:I

    return v0
.end method

.method public static final synthetic access$getMESSAGE_STROKE_COLOR_MINE$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->MESSAGE_STROKE_COLOR_MINE:I

    return v0
.end method

.method public static final synthetic access$getMESSAGE_STROKE_COLOR_THEIRS$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->MESSAGE_STROKE_COLOR_THEIRS:I

    return v0
.end method

.method public static final synthetic access$getMESSAGE_STROKE_WIDTH_THEIRS$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->MESSAGE_STROKE_WIDTH_THEIRS$delegate:Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;ILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;ILio/getstream/chat/android/ui/font/TextStyle;IIFIFLio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;IIIFFZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IIILio/getstream/chat/android/ui/font/TextStyle;IILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p52

    move/from16 v2, p53

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageBackgroundColorMine:Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-object v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageBackgroundColorTheirs:Ljava/lang/Integer;

    goto :goto_1

    :cond_1
    move-object/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkTextColorMine:Ljava/lang/Integer;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkTextColorTheirs:Ljava/lang/Integer;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkBackgroundColorMine:I

    goto :goto_4

    :cond_4
    move/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget v8, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkBackgroundColorTheirs:I

    goto :goto_5

    :cond_5
    move/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget v9, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->linkDescriptionMaxLines:I

    goto :goto_6

    :cond_6
    move/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-object v10, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-object v11, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_8

    :cond_8
    move-object/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-object v12, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleUserName:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_9

    :cond_9
    move-object/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-object v13, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDate:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_a

    :cond_a
    move-object/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-object v14, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageLanguage:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_b

    :cond_b
    move-object/from16 v14, p12

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleThreadCounter:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_c

    :cond_c
    move-object/from16 v15, p13

    :goto_c
    move-object/from16 p1, v3

    and-int/lit16 v3, v1, 0x2000

    if-eqz v3, :cond_d

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleReadCounter:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_d

    :cond_d
    move-object/from16 v3, p14

    :goto_d
    move-object/from16 p2, v3

    and-int/lit16 v3, v1, 0x4000

    if-eqz v3, :cond_e

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->threadSeparatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_e

    :cond_e
    move-object/from16 v3, p15

    :goto_e
    const v16, 0x8000

    and-int v17, v1, v16

    if-eqz v17, :cond_f

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkLabel:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v18, p52, v17

    move-object/from16 p3, v1

    if-eqz v18, :cond_10

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkTitle:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v19, p52, v18

    move-object/from16 p4, v1

    if-eqz v19, :cond_11

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkDescription:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v20, p52, v19

    move-object/from16 p5, v1

    if-eqz v20, :cond_12

    iget v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->dateSeparatorBackgroundColor:I

    goto :goto_12

    :cond_12
    move/from16 v1, p19

    :goto_12
    const/high16 v20, 0x80000

    and-int v20, p52, v20

    move/from16 p6, v1

    if-eqz v20, :cond_13

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleDateSeparator:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v20, 0x100000

    and-int v20, p52, v20

    move-object/from16 p7, v1

    if-eqz v20, :cond_14

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v20, 0x200000

    and-int v20, p52, v20

    move-object/from16 p8, v1

    if-eqz v20, :cond_15

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->editReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v20, 0x400000

    and-int v20, p52, v20

    move-object/from16 p9, v1

    if-eqz v20, :cond_16

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorSent:Landroid/graphics/drawable/Drawable;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v20, 0x800000

    and-int v20, p52, v20

    move-object/from16 p10, v1

    if-eqz v20, :cond_17

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorDelivered:Landroid/graphics/drawable/Drawable;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p24

    :goto_17
    const/high16 v20, 0x1000000

    and-int v20, p52, v20

    move-object/from16 p11, v1

    if-eqz v20, :cond_18

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorRead:Landroid/graphics/drawable/Drawable;

    goto :goto_18

    :cond_18
    move-object/from16 v1, p25

    :goto_18
    const/high16 v20, 0x2000000

    and-int v20, p52, v20

    move-object/from16 p12, v1

    if-eqz v20, :cond_19

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorPendingSync:Landroid/graphics/drawable/Drawable;

    goto :goto_19

    :cond_19
    move-object/from16 v1, p26

    :goto_19
    const/high16 v20, 0x4000000

    and-int v20, p52, v20

    move-object/from16 p13, v1

    if-eqz v20, :cond_1a

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconOnlyVisibleToYou:Landroid/graphics/drawable/Drawable;

    goto :goto_1a

    :cond_1a
    move-object/from16 v1, p27

    :goto_1a
    const/high16 v20, 0x8000000

    and-int v20, p52, v20

    move-object/from16 p14, v1

    if-eqz v20, :cond_1b

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDeletedMine:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_1b

    :cond_1b
    move-object/from16 v1, p28

    :goto_1b
    const/high16 v20, 0x10000000

    and-int v20, p52, v20

    move-object/from16 p15, v1

    if-eqz v20, :cond_1c

    iget v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageDeletedBackgroundMine:I

    goto :goto_1c

    :cond_1c
    move/from16 v1, p29

    :goto_1c
    const/high16 v20, 0x20000000

    and-int v20, p52, v20

    move/from16 p16, v1

    if-eqz v20, :cond_1d

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDeletedTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_1d

    :cond_1d
    move-object/from16 v1, p30

    :goto_1d
    const/high16 v20, 0x40000000    # 2.0f

    and-int v20, p52, v20

    move-object/from16 p17, v1

    if-eqz v20, :cond_1e

    iget v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageDeletedBackgroundTheirs:I

    goto :goto_1e

    :cond_1e
    move/from16 v1, p31

    :goto_1e
    const/high16 v20, -0x80000000

    and-int v20, p52, v20

    move/from16 p18, v1

    if-eqz v20, :cond_1f

    iget v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeColorMine:I

    goto :goto_1f

    :cond_1f
    move/from16 v1, p32

    :goto_1f
    and-int/lit8 v20, v2, 0x1

    move/from16 p19, v1

    if-eqz v20, :cond_20

    iget v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeWidthMine:F

    goto :goto_20

    :cond_20
    move/from16 v1, p33

    :goto_20
    and-int/lit8 v20, v2, 0x2

    move/from16 p20, v1

    if-eqz v20, :cond_21

    iget v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeColorTheirs:I

    goto :goto_21

    :cond_21
    move/from16 v1, p34

    :goto_21
    and-int/lit8 v20, v2, 0x4

    move/from16 p21, v1

    if-eqz v20, :cond_22

    iget v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeWidthTheirs:F

    goto :goto_22

    :cond_22
    move/from16 v1, p35

    :goto_22
    and-int/lit8 v20, v2, 0x8

    move/from16 p22, v1

    if-eqz v20, :cond_23

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleSystemMessage:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_23

    :cond_23
    move-object/from16 v1, p36

    :goto_23
    and-int/lit8 v20, v2, 0x10

    move-object/from16 p23, v1

    if-eqz v20, :cond_24

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleErrorMessage:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_24

    :cond_24
    move-object/from16 v1, p37

    :goto_24
    and-int/lit8 v20, v2, 0x20

    move-object/from16 p24, v1

    if-eqz v20, :cond_25

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageIndicatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_25

    :cond_25
    move-object/from16 v1, p38

    :goto_25
    and-int/lit8 v20, v2, 0x40

    move-object/from16 p25, v1

    if-eqz v20, :cond_26

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageIndicatorIcon:Landroid/graphics/drawable/Drawable;

    goto :goto_26

    :cond_26
    move-object/from16 v1, p39

    :goto_26
    move-object/from16 p26, v1

    and-int/lit16 v1, v2, 0x80

    if-eqz v1, :cond_27

    iget v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageBackgroundColor:I

    goto :goto_27

    :cond_27
    move/from16 v1, p40

    :goto_27
    move/from16 p27, v1

    and-int/lit16 v1, v2, 0x100

    if-eqz v1, :cond_28

    iget v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStartMargin:I

    goto :goto_28

    :cond_28
    move/from16 v1, p41

    :goto_28
    move/from16 p28, v1

    and-int/lit16 v1, v2, 0x200

    if-eqz v1, :cond_29

    iget v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageEndMargin:I

    goto :goto_29

    :cond_29
    move/from16 v1, p42

    :goto_29
    move/from16 p29, v1

    and-int/lit16 v1, v2, 0x400

    if-eqz v1, :cond_2a

    iget v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageMaxWidthFactorMine:F

    goto :goto_2a

    :cond_2a
    move/from16 v1, p43

    :goto_2a
    move/from16 p30, v1

    and-int/lit16 v1, v2, 0x800

    if-eqz v1, :cond_2b

    iget v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageMaxWidthFactorTheirs:F

    goto :goto_2b

    :cond_2b
    move/from16 v1, p44

    :goto_2b
    move/from16 p31, v1

    and-int/lit16 v1, v2, 0x1000

    if-eqz v1, :cond_2c

    iget-boolean v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->showMessageDeliveryStatusIndicator:Z

    goto :goto_2c

    :cond_2c
    move/from16 v1, p45

    :goto_2c
    move/from16 p32, v1

    and-int/lit16 v1, v2, 0x2000

    if-eqz v1, :cond_2d

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconFailedMessage:Landroid/graphics/drawable/Drawable;

    goto :goto_2d

    :cond_2d
    move-object/from16 v1, p46

    :goto_2d
    move-object/from16 p33, v1

    and-int/lit16 v1, v2, 0x4000

    if-eqz v1, :cond_2e

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconBannedMessage:Landroid/graphics/drawable/Drawable;

    goto :goto_2e

    :cond_2e
    move-object/from16 v1, p47

    :goto_2e
    and-int v16, v2, v16

    move-object/from16 p34, v1

    if-eqz v16, :cond_2f

    iget v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->systemMessageAlignment:I

    goto :goto_2f

    :cond_2f
    move/from16 v1, p48

    :goto_2f
    and-int v16, v2, v17

    move/from16 p35, v1

    if-eqz v16, :cond_30

    iget v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->loadingMoreView:I

    goto :goto_30

    :cond_30
    move/from16 v1, p49

    :goto_30
    and-int v16, v2, v18

    move/from16 p36, v1

    if-eqz v16, :cond_31

    iget v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->unreadSeparatorBackgroundColor:I

    goto :goto_31

    :cond_31
    move/from16 v1, p50

    :goto_31
    and-int v2, v2, v19

    if-eqz v2, :cond_32

    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->unreadSeparatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    move-object/from16 p52, v2

    :goto_32
    move-object/from16 p37, p23

    move-object/from16 p38, p24

    move-object/from16 p39, p25

    move-object/from16 p40, p26

    move/from16 p41, p27

    move/from16 p42, p28

    move/from16 p43, p29

    move/from16 p44, p30

    move/from16 p45, p31

    move/from16 p46, p32

    move-object/from16 p47, p33

    move-object/from16 p48, p34

    move/from16 p49, p35

    move/from16 p50, p36

    move/from16 p51, v1

    move-object/from16 p23, p9

    move-object/from16 p24, p10

    move-object/from16 p25, p11

    move-object/from16 p26, p12

    move-object/from16 p27, p13

    move-object/from16 p28, p14

    move-object/from16 p29, p15

    move/from16 p30, p16

    move-object/from16 p31, p17

    move/from16 p32, p18

    move/from16 p33, p19

    move/from16 p34, p20

    move/from16 p35, p21

    move/from16 p36, p22

    move-object/from16 p16, v3

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p14, v15

    move-object/from16 p15, p2

    move-object/from16 p17, p3

    move-object/from16 p18, p4

    move-object/from16 p19, p5

    move/from16 p20, p6

    move-object/from16 p21, p7

    move-object/from16 p22, p8

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_33

    :cond_32
    move-object/from16 p52, p51

    goto :goto_32

    :goto_33
    invoke-virtual/range {p1 .. p52}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->copy(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;ILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;ILio/getstream/chat/android/ui/font/TextStyle;IIFIFLio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;IIIFFZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IIILio/getstream/chat/android/ui/font/TextStyle;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageBackgroundColorMine:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component10()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleUserName:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component11()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDate:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component12()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageLanguage:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component13()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleThreadCounter:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component14()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleReadCounter:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component15()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->threadSeparatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component16()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkLabel:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component17()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkTitle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component18()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkDescription:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component19()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->dateSeparatorBackgroundColor:I

    return v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageBackgroundColorTheirs:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component20()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleDateSeparator:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component21()Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    return-object v0
.end method

.method public final component22()Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->editReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    return-object v0
.end method

.method public final component23()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorSent:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final component24()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorDelivered:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final component25()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorRead:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final component26()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorPendingSync:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final component27()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconOnlyVisibleToYou:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final component28()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDeletedMine:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component29()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageDeletedBackgroundMine:I

    return v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkTextColorMine:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component30()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDeletedTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component31()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageDeletedBackgroundTheirs:I

    return v0
.end method

.method public final component32()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeColorMine:I

    return v0
.end method

.method public final component33()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeWidthMine:F

    return v0
.end method

.method public final component34()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeColorTheirs:I

    return v0
.end method

.method public final component35()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeWidthTheirs:F

    return v0
.end method

.method public final component36()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleSystemMessage:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component37()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleErrorMessage:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component38()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageIndicatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component39()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageIndicatorIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkTextColorTheirs:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component40()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageBackgroundColor:I

    return v0
.end method

.method public final component41()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStartMargin:I

    return v0
.end method

.method public final component42()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageEndMargin:I

    return v0
.end method

.method public final component43()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageMaxWidthFactorMine:F

    return v0
.end method

.method public final component44()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageMaxWidthFactorTheirs:F

    return v0
.end method

.method public final component45()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->showMessageDeliveryStatusIndicator:Z

    return v0
.end method

.method public final component46()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconFailedMessage:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final component47()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconBannedMessage:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final component48()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->systemMessageAlignment:I

    return v0
.end method

.method public final component49()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->loadingMoreView:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkBackgroundColorMine:I

    return v0
.end method

.method public final component50()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->unreadSeparatorBackgroundColor:I

    return v0
.end method

.method public final component51()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->unreadSeparatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkBackgroundColorTheirs:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->linkDescriptionMaxLines:I

    return v0
.end method

.method public final component8()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component9()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final copy(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;ILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;ILio/getstream/chat/android/ui/font/TextStyle;IIFIFLio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;IIIFFZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IIILio/getstream/chat/android/ui/font/TextStyle;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;
    .locals 53

    const-string v0, "textStyleMine"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleTheirs"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleUserName"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleMessageDate"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleMessageLanguage"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleThreadCounter"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleReadCounter"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadSeparatorTextStyle"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleLinkLabel"

    move-object/from16 v2, p16

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleLinkTitle"

    move-object/from16 v3, p17

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleLinkDescription"

    move-object/from16 v4, p18

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleDateSeparator"

    move-object/from16 v5, p20

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionsViewStyle"

    move-object/from16 v6, p21

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editReactionsViewStyle"

    move-object/from16 v7, p22

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconIndicatorSent"

    move-object/from16 v8, p23

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconIndicatorDelivered"

    move-object/from16 v1, p24

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconIndicatorRead"

    move-object/from16 v1, p25

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconIndicatorPendingSync"

    move-object/from16 v1, p26

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconOnlyVisibleToYou"

    move-object/from16 v1, p27

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleMessageDeletedMine"

    move-object/from16 v1, p28

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleMessageDeletedTheirs"

    move-object/from16 v1, p30

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleSystemMessage"

    move-object/from16 v1, p36

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleErrorMessage"

    move-object/from16 v1, p37

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pinnedMessageIndicatorTextStyle"

    move-object/from16 v1, p38

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pinnedMessageIndicatorIcon"

    move-object/from16 v1, p39

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconFailedMessage"

    move-object/from16 v1, p46

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconBannedMessage"

    move-object/from16 v1, p47

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unreadSeparatorTextStyle"

    move-object/from16 v1, p51

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    move-object/from16 v16, p15

    move/from16 v20, p19

    move-object/from16 v25, p24

    move-object/from16 v26, p25

    move-object/from16 v27, p26

    move-object/from16 v28, p27

    move-object/from16 v29, p28

    move/from16 v30, p29

    move-object/from16 v31, p30

    move/from16 v32, p31

    move/from16 v33, p32

    move/from16 v34, p33

    move/from16 v35, p34

    move/from16 v36, p35

    move-object/from16 v37, p36

    move-object/from16 v38, p37

    move-object/from16 v39, p38

    move-object/from16 v40, p39

    move/from16 v41, p40

    move/from16 v42, p41

    move/from16 v43, p42

    move/from16 v44, p43

    move/from16 v45, p44

    move/from16 v46, p45

    move-object/from16 v47, p46

    move-object/from16 v48, p47

    move/from16 v49, p48

    move/from16 v50, p49

    move/from16 v51, p50

    move-object/from16 v52, p51

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    move-object/from16 v19, v4

    move-object/from16 v21, v5

    move-object/from16 v22, v6

    move-object/from16 v23, v7

    move-object/from16 v24, v8

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v52}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;ILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;ILio/getstream/chat/android/ui/font/TextStyle;IIFIFLio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;IIIFFZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IIILio/getstream/chat/android/ui/font/TextStyle;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageBackgroundColorMine:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageBackgroundColorMine:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageBackgroundColorTheirs:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageBackgroundColorTheirs:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkTextColorMine:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkTextColorMine:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkTextColorTheirs:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkTextColorTheirs:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkBackgroundColorMine:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkBackgroundColorMine:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkBackgroundColorTheirs:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkBackgroundColorTheirs:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->linkDescriptionMaxLines:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->linkDescriptionMaxLines:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleUserName:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleUserName:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDate:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDate:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageLanguage:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageLanguage:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleThreadCounter:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleThreadCounter:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleReadCounter:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleReadCounter:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->threadSeparatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->threadSeparatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkLabel:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkLabel:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkTitle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkTitle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkDescription:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkDescription:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->dateSeparatorBackgroundColor:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->dateSeparatorBackgroundColor:I

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleDateSeparator:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleDateSeparator:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->editReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->editReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorSent:Landroid/graphics/drawable/Drawable;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorSent:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorDelivered:Landroid/graphics/drawable/Drawable;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorDelivered:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorRead:Landroid/graphics/drawable/Drawable;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorRead:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorPendingSync:Landroid/graphics/drawable/Drawable;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorPendingSync:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconOnlyVisibleToYou:Landroid/graphics/drawable/Drawable;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconOnlyVisibleToYou:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDeletedMine:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDeletedMine:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageDeletedBackgroundMine:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageDeletedBackgroundMine:I

    if-eq v1, v3, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDeletedTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDeletedTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    return v2

    :cond_1f
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageDeletedBackgroundTheirs:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageDeletedBackgroundTheirs:I

    if-eq v1, v3, :cond_20

    return v2

    :cond_20
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeColorMine:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeColorMine:I

    if-eq v1, v3, :cond_21

    return v2

    :cond_21
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeWidthMine:F

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeWidthMine:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_22

    return v2

    :cond_22
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeColorTheirs:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeColorTheirs:I

    if-eq v1, v3, :cond_23

    return v2

    :cond_23
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeWidthTheirs:F

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeWidthTheirs:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_24

    return v2

    :cond_24
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleSystemMessage:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleSystemMessage:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    return v2

    :cond_25
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleErrorMessage:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleErrorMessage:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_26

    return v2

    :cond_26
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageIndicatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageIndicatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    return v2

    :cond_27
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageIndicatorIcon:Landroid/graphics/drawable/Drawable;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageIndicatorIcon:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    return v2

    :cond_28
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageBackgroundColor:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageBackgroundColor:I

    if-eq v1, v3, :cond_29

    return v2

    :cond_29
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStartMargin:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStartMargin:I

    if-eq v1, v3, :cond_2a

    return v2

    :cond_2a
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageEndMargin:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageEndMargin:I

    if-eq v1, v3, :cond_2b

    return v2

    :cond_2b
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageMaxWidthFactorMine:F

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageMaxWidthFactorMine:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2c

    return v2

    :cond_2c
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageMaxWidthFactorTheirs:F

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageMaxWidthFactorTheirs:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2d

    return v2

    :cond_2d
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->showMessageDeliveryStatusIndicator:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->showMessageDeliveryStatusIndicator:Z

    if-eq v1, v3, :cond_2e

    return v2

    :cond_2e
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconFailedMessage:Landroid/graphics/drawable/Drawable;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconFailedMessage:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2f

    return v2

    :cond_2f
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconBannedMessage:Landroid/graphics/drawable/Drawable;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconBannedMessage:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    return v2

    :cond_30
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->systemMessageAlignment:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->systemMessageAlignment:I

    if-eq v1, v3, :cond_31

    return v2

    :cond_31
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->loadingMoreView:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->loadingMoreView:I

    if-eq v1, v3, :cond_32

    return v2

    :cond_32
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->unreadSeparatorBackgroundColor:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->unreadSeparatorBackgroundColor:I

    if-eq v1, v3, :cond_33

    return v2

    :cond_33
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->unreadSeparatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object p1, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->unreadSeparatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_34

    return v2

    :cond_34
    return v0
.end method

.method public final getDateSeparatorBackgroundColor()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->dateSeparatorBackgroundColor:I

    return v0
.end method

.method public final getEditReactionsViewStyle()Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->editReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    return-object v0
.end method

.method public final getIconBannedMessage()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconBannedMessage:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getIconFailedMessage()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconFailedMessage:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getIconIndicatorDelivered()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorDelivered:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getIconIndicatorPendingSync()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorPendingSync:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getIconIndicatorRead()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorRead:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getIconIndicatorSent()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorSent:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getIconOnlyVisibleToYou()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconOnlyVisibleToYou:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getLinkDescriptionMaxLines()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->linkDescriptionMaxLines:I

    return v0
.end method

.method public final getLoadingMoreView()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->loadingMoreView:I

    return v0
.end method

.method public final getMessageBackgroundColorMine()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageBackgroundColorMine:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMessageBackgroundColorTheirs()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageBackgroundColorTheirs:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMessageDeletedBackgroundMine()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageDeletedBackgroundMine:I

    return v0
.end method

.method public final getMessageDeletedBackgroundTheirs()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageDeletedBackgroundTheirs:I

    return v0
.end method

.method public final getMessageEndMargin()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageEndMargin:I

    return v0
.end method

.method public final getMessageLinkBackgroundColorMine()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkBackgroundColorMine:I

    return v0
.end method

.method public final getMessageLinkBackgroundColorTheirs()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkBackgroundColorTheirs:I

    return v0
.end method

.method public final getMessageLinkTextColorMine()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkTextColorMine:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMessageLinkTextColorTheirs()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkTextColorTheirs:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMessageMaxWidthFactorMine()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageMaxWidthFactorMine:F

    return v0
.end method

.method public final getMessageMaxWidthFactorTheirs()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageMaxWidthFactorTheirs:F

    return v0
.end method

.method public final getMessageStartMargin()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStartMargin:I

    return v0
.end method

.method public final getMessageStrokeColorMine()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeColorMine:I

    return v0
.end method

.method public final getMessageStrokeColorTheirs()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeColorTheirs:I

    return v0
.end method

.method public final getMessageStrokeWidthMine()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeWidthMine:F

    return v0
.end method

.method public final getMessageStrokeWidthTheirs()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeWidthTheirs:F

    return v0
.end method

.method public final getPinnedMessageBackgroundColor()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageBackgroundColor:I

    return v0
.end method

.method public final getPinnedMessageIndicatorIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageIndicatorIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getPinnedMessageIndicatorTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageIndicatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getReactionsViewStyle()Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    return-object v0
.end method

.method public final getShowMessageDeliveryStatusIndicator()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->showMessageDeliveryStatusIndicator:Z

    return v0
.end method

.method public final getStyleLinkTextColor(Z)Ljava/lang/Integer;
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkTextColorMine:Ljava/lang/Integer;

    return-object p1

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkTextColorTheirs:Ljava/lang/Integer;

    return-object p1
.end method

.method public final getStyleTextColor(Z)Ljava/lang/Integer;
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    :goto_0
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/font/TextStyle;->colorOrNull()Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_0
.end method

.method public final getSystemMessageAlignment()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->systemMessageAlignment:I

    return v0
.end method

.method public final getTextStyleDateSeparator()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleDateSeparator:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getTextStyleErrorMessage()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleErrorMessage:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getTextStyleLinkDescription()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkDescription:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getTextStyleLinkLabel()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkLabel:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getTextStyleLinkTitle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkTitle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getTextStyleMessageDate()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDate:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getTextStyleMessageDeletedMine()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDeletedMine:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getTextStyleMessageDeletedTheirs()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDeletedTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getTextStyleMessageLanguage()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageLanguage:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getTextStyleMine()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getTextStyleReadCounter()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleReadCounter:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getTextStyleSystemMessage()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleSystemMessage:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getTextStyleTheirs()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getTextStyleThreadCounter()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleThreadCounter:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getTextStyleUserName()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleUserName:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getThreadSeparatorTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->threadSeparatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getUnreadSeparatorBackgroundColor()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->unreadSeparatorBackgroundColor:I

    return v0
.end method

.method public final getUnreadSeparatorTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->unreadSeparatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageBackgroundColorMine:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageBackgroundColorTheirs:Ljava/lang/Integer;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkTextColorMine:Ljava/lang/Integer;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkTextColorTheirs:Ljava/lang/Integer;

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkBackgroundColorMine:I

    invoke-static {v1, v0, v2}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkBackgroundColorTheirs:I

    invoke-static {v1, v0, v2}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->linkDescriptionMaxLines:I

    invoke-static {v1, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v0, v2}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v0, v2}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleUserName:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v0, v2}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDate:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v0, v2}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageLanguage:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v0, v2}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleThreadCounter:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v0, v2}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleReadCounter:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v0, v2}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->threadSeparatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v0, v2}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkLabel:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v0, v2}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkTitle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v0, v2}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkDescription:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v0, v2}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->dateSeparatorBackgroundColor:I

    invoke-static {v1, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleDateSeparator:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v0, v2}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->editReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorSent:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0, v2}, Lnh3/a;->a(Landroid/graphics/drawable/Drawable;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorDelivered:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0, v2}, Lnh3/a;->a(Landroid/graphics/drawable/Drawable;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorRead:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0, v2}, Lnh3/a;->a(Landroid/graphics/drawable/Drawable;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorPendingSync:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0, v2}, Lnh3/a;->a(Landroid/graphics/drawable/Drawable;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconOnlyVisibleToYou:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0, v2}, Lnh3/a;->a(Landroid/graphics/drawable/Drawable;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDeletedMine:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v0, v2}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageDeletedBackgroundMine:I

    invoke-static {v1, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDeletedTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v0, v2}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageDeletedBackgroundTheirs:I

    invoke-static {v1, v0, v2}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeColorMine:I

    invoke-static {v1, v0, v2}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeWidthMine:F

    invoke-static {v1, v0, v2}, Ld;->a(FII)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeColorTheirs:I

    invoke-static {v1, v0, v2}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeWidthTheirs:F

    invoke-static {v1, v0, v2}, Ld;->a(FII)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleSystemMessage:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v0, v2}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleErrorMessage:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v0, v2}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageIndicatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v0, v2}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageIndicatorIcon:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0, v2}, Lnh3/a;->a(Landroid/graphics/drawable/Drawable;II)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageBackgroundColor:I

    invoke-static {v1, v0, v2}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStartMargin:I

    invoke-static {v1, v0, v2}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageEndMargin:I

    invoke-static {v1, v0, v2}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageMaxWidthFactorMine:F

    invoke-static {v1, v0, v2}, Ld;->a(FII)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageMaxWidthFactorTheirs:F

    invoke-static {v1, v0, v2}, Ld;->a(FII)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->showMessageDeliveryStatusIndicator:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconFailedMessage:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0, v2}, Lnh3/a;->a(Landroid/graphics/drawable/Drawable;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconBannedMessage:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0, v2}, Lnh3/a;->a(Landroid/graphics/drawable/Drawable;II)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->systemMessageAlignment:I

    invoke-static {v1, v0, v2}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->loadingMoreView:I

    invoke-static {v1, v0, v2}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->unreadSeparatorBackgroundColor:I

    invoke-static {v1, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->unreadSeparatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 54

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageBackgroundColorMine:Ljava/lang/Integer;

    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageBackgroundColorTheirs:Ljava/lang/Integer;

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkTextColorMine:Ljava/lang/Integer;

    iget-object v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkTextColorTheirs:Ljava/lang/Integer;

    iget v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkBackgroundColorMine:I

    iget v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageLinkBackgroundColorTheirs:I

    iget v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->linkDescriptionMaxLines:I

    iget-object v8, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v9, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v10, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleUserName:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v11, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDate:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v12, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageLanguage:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v13, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleThreadCounter:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v14, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleReadCounter:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->threadSeparatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    move-object/from16 v16, v15

    iget-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkLabel:Lio/getstream/chat/android/ui/font/TextStyle;

    move-object/from16 v17, v15

    iget-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkTitle:Lio/getstream/chat/android/ui/font/TextStyle;

    move-object/from16 v18, v15

    iget-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleLinkDescription:Lio/getstream/chat/android/ui/font/TextStyle;

    move-object/from16 v19, v15

    iget v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->dateSeparatorBackgroundColor:I

    move/from16 v20, v15

    iget-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleDateSeparator:Lio/getstream/chat/android/ui/font/TextStyle;

    move-object/from16 v21, v15

    iget-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    move-object/from16 v22, v15

    iget-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->editReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    move-object/from16 v23, v15

    iget-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorSent:Landroid/graphics/drawable/Drawable;

    move-object/from16 v24, v15

    iget-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorDelivered:Landroid/graphics/drawable/Drawable;

    move-object/from16 v25, v15

    iget-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorRead:Landroid/graphics/drawable/Drawable;

    move-object/from16 v26, v15

    iget-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconIndicatorPendingSync:Landroid/graphics/drawable/Drawable;

    move-object/from16 v27, v15

    iget-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconOnlyVisibleToYou:Landroid/graphics/drawable/Drawable;

    move-object/from16 v28, v15

    iget-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDeletedMine:Lio/getstream/chat/android/ui/font/TextStyle;

    move-object/from16 v29, v15

    iget v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageDeletedBackgroundMine:I

    move/from16 v30, v15

    iget-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleMessageDeletedTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    move-object/from16 v31, v15

    iget v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageDeletedBackgroundTheirs:I

    move/from16 v32, v15

    iget v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeColorMine:I

    move/from16 v33, v15

    iget v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeWidthMine:F

    move/from16 v34, v15

    iget v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeColorTheirs:I

    move/from16 v35, v15

    iget v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStrokeWidthTheirs:F

    move/from16 v36, v15

    iget-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleSystemMessage:Lio/getstream/chat/android/ui/font/TextStyle;

    move-object/from16 v37, v15

    iget-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->textStyleErrorMessage:Lio/getstream/chat/android/ui/font/TextStyle;

    move-object/from16 v38, v15

    iget-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageIndicatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    move-object/from16 v39, v15

    iget-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageIndicatorIcon:Landroid/graphics/drawable/Drawable;

    move-object/from16 v40, v15

    iget v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->pinnedMessageBackgroundColor:I

    move/from16 v41, v15

    iget v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageStartMargin:I

    move/from16 v42, v15

    iget v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageEndMargin:I

    move/from16 v43, v15

    iget v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageMaxWidthFactorMine:F

    move/from16 v44, v15

    iget v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->messageMaxWidthFactorTheirs:F

    move/from16 v45, v15

    iget-boolean v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->showMessageDeliveryStatusIndicator:Z

    move/from16 v46, v15

    iget-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconFailedMessage:Landroid/graphics/drawable/Drawable;

    move-object/from16 v47, v15

    iget-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->iconBannedMessage:Landroid/graphics/drawable/Drawable;

    move-object/from16 v48, v15

    iget v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->systemMessageAlignment:I

    move/from16 v49, v15

    iget v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->loadingMoreView:I

    move/from16 v50, v15

    iget v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->unreadSeparatorBackgroundColor:I

    move/from16 v51, v15

    iget-object v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->unreadSeparatorTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    const-string v0, ", messageBackgroundColorTheirs="

    move-object/from16 v52, v15

    const-string v15, ", messageLinkTextColorMine="

    move-object/from16 v53, v14

    const-string v14, "MessageListItemStyle(messageBackgroundColorMine="

    invoke-static {v14, v1, v0, v2, v15}, Lvl/b;->l(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", messageLinkTextColorTheirs="

    const-string v2, ", messageLinkBackgroundColorMine="

    invoke-static {v0, v3, v1, v4, v2}, Lr80/c;->A(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    const-string v1, ", messageLinkBackgroundColorTheirs="

    const-string v2, ", linkDescriptionMaxLines="

    invoke-static {v0, v5, v1, v6, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", textStyleMine="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textStyleTheirs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textStyleUserName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textStyleMessageDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textStyleMessageLanguage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textStyleThreadCounter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textStyleReadCounter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v53

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", threadSeparatorTextStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textStyleLinkLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textStyleLinkTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textStyleLinkDescription="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dateSeparatorBackgroundColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", textStyleDateSeparator="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", reactionsViewStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", editReactionsViewStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", iconIndicatorSent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", iconIndicatorDelivered="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", iconIndicatorRead="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", iconIndicatorPendingSync="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", iconOnlyVisibleToYou="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textStyleMessageDeletedMine="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", messageDeletedBackgroundMine="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", textStyleMessageDeletedTheirs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", messageDeletedBackgroundTheirs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", messageStrokeColorMine="

    const-string v2, ", messageStrokeWidthMine="

    move/from16 v3, v32

    move/from16 v4, v33

    invoke-static {v0, v3, v1, v4, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    move/from16 v1, v34

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", messageStrokeColorTheirs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", messageStrokeWidthTheirs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", textStyleSystemMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v37

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textStyleErrorMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v38

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pinnedMessageIndicatorTextStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v39

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pinnedMessageIndicatorIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pinnedMessageBackgroundColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v41

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", messageStartMargin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", messageEndMargin="

    const-string v2, ", messageMaxWidthFactorMine="

    move/from16 v3, v42

    move/from16 v4, v43

    invoke-static {v0, v3, v1, v4, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", messageMaxWidthFactorTheirs="

    const-string v2, ", showMessageDeliveryStatusIndicator="

    move/from16 v3, v44

    move/from16 v4, v45

    invoke-static {v0, v3, v1, v4, v2}, Lr;->u(Ljava/lang/StringBuilder;FLjava/lang/String;FLjava/lang/String;)V

    move/from16 v1, v46

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", iconFailedMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v47

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", iconBannedMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v48

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", systemMessageAlignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v49

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", loadingMoreView="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", unreadSeparatorBackgroundColor="

    const-string v2, ", unreadSeparatorTextStyle="

    move/from16 v3, v50

    move/from16 v4, v51

    invoke-static {v0, v3, v1, v4, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    move-object/from16 v1, v52

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
