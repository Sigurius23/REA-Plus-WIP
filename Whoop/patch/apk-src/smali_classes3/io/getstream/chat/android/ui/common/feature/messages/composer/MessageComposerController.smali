.class public final Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;,
        Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Companion;,
        Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0088\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\"\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010!\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u0007\u0018\u0000 \u0093\u00022\u00020\u0001:\u0006\u0094\u0002\u0093\u0002\u0095\u0002Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\r\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0015\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!\u00a2\u0006\u0004\u0008#\u0010$J\u0015\u0010\'\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020%\u00a2\u0006\u0004\u0008\'\u0010(J\r\u0010)\u001a\u00020\u001a\u00a2\u0006\u0004\u0008)\u0010*J\u001b\u0010.\u001a\u00020\u001a2\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020,0+\u00a2\u0006\u0004\u0008.\u0010/J\u0015\u00101\u001a\u00020\u001a2\u0006\u00100\u001a\u00020,\u00a2\u0006\u0004\u00081\u00102J\u001b\u00105\u001a\u00020\u001a2\u000c\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u000203\u00a2\u0006\u0004\u00085\u00106J\r\u00107\u001a\u00020\u001a\u00a2\u0006\u0004\u00087\u0010*J1\u0010=\u001a\u00020\u001a2\u0006\u00109\u001a\u0002082\u001a\u0008\u0002\u0010<\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020;0:\u0012\u0004\u0012\u00020\u001a0\r\u00a2\u0006\u0004\u0008=\u0010>J\r\u0010?\u001a\u00020\u001a\u00a2\u0006\u0004\u0008?\u0010*JW\u0010F\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020;2\u000c\u0010B\u001a\u0008\u0012\u0004\u0012\u00020;0A22\u0008\u0002\u0010E\u001a,\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020,0+\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020,0+0D\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010C\u00a2\u0006\u0004\u0008F\u0010GJ%\u0010H\u001a\u00020;2\u0006\u0010@\u001a\u00020\u00022\u000e\u0008\u0002\u0010-\u001a\u0008\u0012\u0004\u0012\u00020,0+\u00a2\u0006\u0004\u0008H\u0010IJ\r\u0010J\u001a\u00020\u001a\u00a2\u0006\u0004\u0008J\u0010*J\r\u0010K\u001a\u00020\u001a\u00a2\u0006\u0004\u0008K\u0010*J\u0015\u0010N\u001a\u00020\u001a2\u0006\u0010M\u001a\u00020L\u00a2\u0006\u0004\u0008N\u0010OJ\u0015\u0010N\u001a\u00020\u001a2\u0006\u0010Q\u001a\u00020P\u00a2\u0006\u0004\u0008N\u0010RJ\u0015\u0010U\u001a\u00020\u001a2\u0006\u0010T\u001a\u00020S\u00a2\u0006\u0004\u0008U\u0010VJ\r\u0010W\u001a\u00020\u001a\u00a2\u0006\u0004\u0008W\u0010*J\r\u0010X\u001a\u00020\u001a\u00a2\u0006\u0004\u0008X\u0010*J\r\u0010Y\u001a\u00020\u001a\u00a2\u0006\u0004\u0008Y\u0010*J\r\u0010Z\u001a\u00020\u001a\u00a2\u0006\u0004\u0008Z\u0010*J%\u0010^\u001a\u00020\u001a2\u0016\u0008\u0002\u0010]\u001a\u0010\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\\\u0018\u00010[\u00a2\u0006\u0004\u0008^\u0010_J\r\u0010`\u001a\u00020\u001a\u00a2\u0006\u0004\u0008`\u0010*J\r\u0010a\u001a\u00020\u001a\u00a2\u0006\u0004\u0008a\u0010*J\r\u0010b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008b\u0010*J\r\u0010c\u001a\u00020\u001a\u00a2\u0006\u0004\u0008c\u0010*J+\u0010e\u001a\u00020\u001a2\u001c\u0008\u0002\u0010d\u001a\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020,0:\u0012\u0004\u0012\u00020\u001a\u0018\u00010\r\u00a2\u0006\u0004\u0008e\u0010fJ\r\u0010g\u001a\u00020\u001a\u00a2\u0006\u0004\u0008g\u0010*J\u0015\u0010i\u001a\u00020\u001a2\u0006\u0010h\u001a\u00020\\\u00a2\u0006\u0004\u0008i\u0010jJ\r\u0010k\u001a\u00020\u001a\u00a2\u0006\u0004\u0008k\u0010*J\r\u0010l\u001a\u00020\u001a\u00a2\u0006\u0004\u0008l\u0010*J\u000f\u0010m\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008m\u0010*J\u000f\u0010n\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008n\u0010*J\u000f\u0010o\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008o\u0010*J%\u0010p\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020;2\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020,0+H\u0002\u00a2\u0006\u0004\u0008p\u0010qJ\u001f\u0010t\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010s\u001a\u00020rH\u0002\u00a2\u0006\u0004\u0008t\u0010uJ\u0018\u0010v\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@\u00a2\u0006\u0004\u0008v\u0010wJ\u0017\u0010x\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008x\u0010 J\u001b\u0010z\u001a\u0004\u0018\u00010S2\u0008\u0010y\u001a\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0004\u0008z\u0010{J\u001f\u0010~\u001a\u00020!2\u0006\u0010|\u001a\u00020\u001d2\u0006\u0010}\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008~\u0010\u007fJ\u001a\u0010\u0080\u0001\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@\u00a2\u0006\u0005\u0008\u0080\u0001\u0010wJY\u0010\u0081\u0001\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020;2\u000c\u0010B\u001a\u0008\u0012\u0004\u0012\u00020;0A20\u0010E\u001a,\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020,0+\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020,0+0D\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010CH\u0002\u00a2\u0006\u0005\u0008\u0081\u0001\u0010GJ(\u0010\u0082\u0001\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020;2\u000c\u0010B\u001a\u0008\u0012\u0004\u0012\u00020;0AH\u0002\u00a2\u0006\u0006\u0008\u0082\u0001\u0010\u0083\u0001J0\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0085\u00012\r\u0010\u0084\u0001\u001a\u0008\u0012\u0004\u0012\u00020P032\u0006\u0010@\u001a\u00020\u0002H\u0002\u00a2\u0006\u0006\u0008\u0086\u0001\u0010\u0087\u0001J\u0011\u0010\u0088\u0001\u001a\u00020\u001aH\u0002\u00a2\u0006\u0005\u0008\u0088\u0001\u0010*J\u0011\u0010\u0089\u0001\u001a\u00020\u001aH\u0002\u00a2\u0006\u0005\u0008\u0089\u0001\u0010*J\u0011\u0010\u008a\u0001\u001a\u00020\u001aH\u0002\u00a2\u0006\u0005\u0008\u008a\u0001\u0010*J\u0012\u0010\u008b\u0001\u001a\u00020!H\u0002\u00a2\u0006\u0006\u0008\u008b\u0001\u0010\u008c\u0001J\u0011\u0010\u008d\u0001\u001a\u00020\u001aH\u0002\u00a2\u0006\u0005\u0008\u008d\u0001\u0010*J\"\u0010\u008e\u0001\u001a\u0008\u0012\u0004\u0012\u00020S0+*\u0008\u0012\u0004\u0012\u00020S0+H\u0002\u00a2\u0006\u0006\u0008\u008e\u0001\u0010\u008f\u0001J\u0011\u0010\u0090\u0001\u001a\u00020\u001aH\u0002\u00a2\u0006\u0005\u0008\u0090\u0001\u0010*J\u0011\u0010\u0091\u0001\u001a\u00020\u001aH\u0002\u00a2\u0006\u0005\u0008\u0091\u0001\u0010*J\u0012\u0010\u0092\u0001\u001a\u00020!H\u0002\u00a2\u0006\u0006\u0008\u0092\u0001\u0010\u008c\u0001J!\u0010\u0094\u0001\u001a\u0008\u0012\u0004\u0012\u00020S0+2\u0007\u0010\u0093\u0001\u001a\u00020\u0002H\u0002\u00a2\u0006\u0006\u0008\u0094\u0001\u0010\u0095\u0001J\u001b\u0010\u0096\u0001\u001a\u00020!2\u0007\u0010\u0093\u0001\u001a\u00020\u0002H\u0002\u00a2\u0006\u0006\u0008\u0096\u0001\u0010\u0097\u0001J)\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0099\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u00022\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010%H\u0002\u00a2\u0006\u0006\u0008\u009a\u0001\u0010\u009b\u0001J(\u0010\u00a0\u0001\u001a\u00020\u001a2\u0008\u0010\u009d\u0001\u001a\u00030\u009c\u00012\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009e\u0001H\u0002\u00a2\u0006\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001J\u0013\u0010\u00a2\u0001\u001a\u00020\u001aH\u0082@\u00a2\u0006\u0006\u0008\u00a2\u0001\u0010\u00a3\u0001J\u0011\u0010\u00a4\u0001\u001a\u00020\u001aH\u0002\u00a2\u0006\u0005\u0008\u00a4\u0001\u0010*J\u0011\u0010\u00a5\u0001\u001a\u00020\u001aH\u0002\u00a2\u0006\u0005\u0008\u00a5\u0001\u0010*J\u0011\u0010\u00a6\u0001\u001a\u00020\u001aH\u0002\u00a2\u0006\u0005\u0008\u00a6\u0001\u0010*J\'\u0010\u00aa\u0001\u001a\n\u0012\u0005\u0012\u00030\u00a9\u00010\u00a8\u0001*\u00020\u00042\u0007\u0010\u00a7\u0001\u001a\u00020\u0002H\u0002\u00a2\u0006\u0006\u0008\u00aa\u0001\u0010\u00ab\u0001J\u001b\u0010\u00ad\u0001\u001a\u00030\u00ac\u00012\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0006\u0008\u00ad\u0001\u0010\u00ae\u0001J\u001d\u0010\u00af\u0001\u001a\u0005\u0018\u00010\u00ac\u00012\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0006\u0008\u00af\u0001\u0010\u00ae\u0001J\u0017\u0010\u00b0\u0001\u001a\u00030\u00ac\u0001*\u00020\u001dH\u0002\u00a2\u0006\u0006\u0008\u00b0\u0001\u0010\u00ae\u0001J\u001a\u0010\u00b1\u0001\u001a\u00020!2\u0006\u0010@\u001a\u00020;H\u0002\u00a2\u0006\u0006\u0008\u00b1\u0001\u0010\u00b2\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0003\u0010\u00b3\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0005\u0010\u00b4\u0001R\"\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006\u00a2\u0006\u000f\n\u0005\u0008\u0008\u0010\u00b5\u0001\u001a\u0006\u0008\u00b6\u0001\u0010\u00b7\u0001R\u0015\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u000c\u0010\u00b8\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0011\u0010\u00b9\u0001R\u001b\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0014\u0010\u00ba\u0001R\u0017\u0010\u00bb\u0001\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00bb\u0001\u0010\u00b3\u0001R\u0017\u0010\u00bc\u0001\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00bc\u0001\u0010\u00b3\u0001R\u0018\u0010\u00be\u0001\u001a\u00030\u00bd\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00be\u0001\u0010\u00bf\u0001R\u001b\u0010\u00c0\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00c0\u0001\u0010\u00b3\u0001R\u0018\u0010\u00c2\u0001\u001a\u00030\u00c1\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00c2\u0001\u0010\u00c3\u0001R\u0018\u0010\u00c5\u0001\u001a\u00030\u00c4\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00c5\u0001\u0010\u00c6\u0001R\u0018\u0010\u00c8\u0001\u001a\u00030\u00c7\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00c8\u0001\u0010\u00c9\u0001R*\u0010\u00cb\u0001\u001a\u00030\u00ca\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00cb\u0001\u0010\u00cc\u0001\u001a\u0006\u0008\u00cd\u0001\u0010\u00ce\u0001\"\u0006\u0008\u00cf\u0001\u0010\u00d0\u0001R#\u0010\u00d1\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u0002030\u00068\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d1\u0001\u0010\u00b5\u0001R\u001d\u0010\u00d2\u0001\u001a\u0008\u0012\u0004\u0012\u00020!0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d2\u0001\u0010\u00b5\u0001R\u001d\u0010\u00d3\u0001\u001a\u0008\u0012\u0004\u0012\u00020!0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d3\u0001\u0010\u00b5\u0001R\u001d\u0010\u00d4\u0001\u001a\u0008\u0012\u0004\u0012\u00020!0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d4\u0001\u0010\u00b5\u0001R+\u0010\u00d6\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030\u00ac\u00010\u00d5\u00010\u00068\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d6\u0001\u0010\u00b5\u0001R+\u0010\u00d7\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030\u00ac\u00010\u00d5\u00010\u00068\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d7\u0001\u0010\u00b5\u0001R\u001e\u0010\u00d9\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u00d8\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d9\u0001\u0010\u00da\u0001R#\u0010\u00dc\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u00db\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00dc\u0001\u0010\u00dd\u0001\u001a\u0006\u0008\u00de\u0001\u0010\u00df\u0001R\u001f\u0010\u00e0\u0001\u001a\n\u0012\u0005\u0012\u00030\u0099\u00010\u00d8\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e0\u0001\u0010\u00da\u0001R$\u0010\u00e1\u0001\u001a\n\u0012\u0005\u0012\u00030\u0099\u00010\u00db\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00e1\u0001\u0010\u00dd\u0001\u001a\u0006\u0008\u00e2\u0001\u0010\u00df\u0001R<\u0010\u00e6\u0001\u001a\'\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020,0\u00e4\u0001j\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020,`\u00e5\u00010\u00e3\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e6\u0001\u0010\u00e7\u0001R$\u0010\u00e8\u0001\u001a\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020,0+0\u00e3\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e8\u0001\u0010\u00e7\u0001R \u0010\u00e9\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010;0\u00e3\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e9\u0001\u0010\u00e7\u0001R \u0010\u00ea\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010,0\u00e3\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ea\u0001\u0010\u00e7\u0001R\u0018\u0010\u00ec\u0001\u001a\u00030\u00eb\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ec\u0001\u0010\u00ed\u0001R\u001f\u0010\u00ef\u0001\u001a\n\u0012\u0005\u0012\u00030\u00ee\u00010\u00e3\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ef\u0001\u0010\u00e7\u0001R#\u0010\u00f0\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ee\u00010\u00068\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00f0\u0001\u0010\u00b5\u0001\u001a\u0006\u0008\u00f1\u0001\u0010\u00b7\u0001R\u001f\u0010\u00f3\u0001\u001a\n\u0012\u0005\u0012\u00030\u00f2\u00010\u00e3\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00f3\u0001\u0010\u00e7\u0001R#\u0010\u00f4\u0001\u001a\t\u0012\u0005\u0012\u00030\u00f2\u00010\u00068\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00f4\u0001\u0010\u00b5\u0001\u001a\u0006\u0008\u00f5\u0001\u0010\u00b7\u0001R\u001f\u0010\u00f6\u0001\u001a\u0008\u0012\u0004\u0012\u00020L0+8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00f6\u0001\u0010\u00f7\u0001R\u001f\u0010\u00f8\u0001\u001a\u0008\u0012\u0004\u0012\u00020S0+8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00f8\u0001\u0010\u00f7\u0001R\u001c\u0010\u00fa\u0001\u001a\u0005\u0018\u00010\u00f9\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00fa\u0001\u0010\u00fb\u0001R\u001c\u0010\u00fc\u0001\u001a\u0005\u0018\u00010\u00f9\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00fc\u0001\u0010\u00fb\u0001R\u001b\u0010\u00fd\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00fd\u0001\u0010\u00b3\u0001R$\u0010\u00fe\u0001\u001a\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020%030\u00e3\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00fe\u0001\u0010\u00e7\u0001R(\u0010\u00ff\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020%030\u00068\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00ff\u0001\u0010\u00b5\u0001\u001a\u0006\u0008\u0080\u0002\u0010\u00b7\u0001R\u001e\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00020P0\u0081\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0084\u0001\u0010\u0082\u0002R\u001c\u0010\u0084\u0002\u001a\u0005\u0018\u00010\u0083\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0084\u0002\u0010\u0085\u0002R\u0018\u0010\u0087\u0002\u001a\u00030\u0086\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0087\u0002\u0010\u0088\u0002R\u0019\u0010\u008b\u0002\u001a\u0004\u0018\u00010%8BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0089\u0002\u0010\u008a\u0002R\u0017\u0010\u008c\u0002\u001a\u00020!8BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u008c\u0002\u0010\u008c\u0001R\u0019\u0010\u008f\u0002\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u008d\u0002\u0010\u008e\u0002R\u0017\u0010\u0091\u0002\u001a\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0090\u0002\u0010\u008e\u0002R\u0017\u0010\u0092\u0002\u001a\u00020!8BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0092\u0002\u0010\u008c\u0001\u00a8\u0006\u0096\u0002"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;",
        "",
        "",
        "channelCid",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "Lec3/f2;",
        "Lio/getstream/chat/android/client/channel/state/ChannelState;",
        "channelState",
        "Ls23/g;",
        "mediaRecorder",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
        "userLookupHandler",
        "Lkotlin/Function1;",
        "Ljava/io/File;",
        "fileToUri",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;",
        "config",
        "Lec3/l;",
        "Lio/getstream/chat/android/client/api/state/GlobalState;",
        "globalState",
        "Landroidx/lifecycle/k1;",
        "savedStateHandle",
        "<init>",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lec3/f2;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;Lec3/l;Landroidx/lifecycle/k1;)V",
        "value",
        "Ll83/a0;",
        "setMessageInput",
        "(Ljava/lang/String;)V",
        "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;",
        "messageMode",
        "setMessageMode",
        "(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)V",
        "",
        "alsoSendToChannel",
        "setAlsoSendToChannel",
        "(Z)V",
        "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
        "messageAction",
        "performMessageAction",
        "(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V",
        "dismissMessageActions",
        "()V",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "attachments",
        "addAttachments",
        "(Ljava/util/List;)V",
        "attachment",
        "removeAttachment",
        "(Lio/getstream/chat/android/models/Attachment;)V",
        "",
        "uris",
        "removeAttachmentsByUris",
        "(Ljava/util/Set;)V",
        "clearAttachments",
        "Lio/getstream/chat/android/models/CreatePollParams;",
        "createPollParams",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Message;",
        "onResult",
        "createPoll",
        "(Lio/getstream/chat/android/models/CreatePollParams;Lkotlin/jvm/functions/Function1;)V",
        "clearData",
        "message",
        "Lo23/a;",
        "callback",
        "Lkotlin/Function2;",
        "Lq83/d;",
        "resolveAttachments",
        "sendMessage",
        "(Lio/getstream/chat/android/models/Message;Lo23/a;Lc93/m;)V",
        "buildNewMessage",
        "(Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/models/Message;",
        "leaveThread",
        "onCleared",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "selectMention",
        "(Lio/getstream/chat/android/models/User;)V",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;",
        "mention",
        "(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;)V",
        "Lio/getstream/chat/android/models/Command;",
        "command",
        "selectCommand",
        "(Lio/getstream/chat/android/models/Command;)V",
        "clearActiveCommand",
        "toggleCommandsVisibility",
        "dismissSuggestionsPopup",
        "startRecording",
        "Ll83/k;",
        "",
        "offset",
        "holdRecording",
        "(Ll83/k;)V",
        "lockRecording",
        "cancelRecording",
        "toggleRecordingPlayback",
        "stopRecording",
        "onComplete",
        "completeRecording",
        "(Lkotlin/jvm/functions/Function1;)V",
        "pauseRecording",
        "progress",
        "seekRecordingTo",
        "(F)V",
        "sendRecording",
        "cancelLinkPreview",
        "setupComposerState",
        "restoreSession",
        "observeSessionChanges",
        "restoreEditMode",
        "(Lio/getstream/chat/android/models/Message;Ljava/util/List;)V",
        "Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;",
        "source",
        "setMessageInputInternal",
        "(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;)V",
        "saveDraftMessage",
        "(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;Lq83/d;)Ljava/lang/Object;",
        "fetchDraftMessage",
        "commandName",
        "restoreDraftCommandIfAvailable",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/Command;",
        "old",
        "new",
        "isSameMessageMode",
        "(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)Z",
        "clearDraftMessage",
        "enqueueEditMessage",
        "enqueueSendMessage",
        "(Lio/getstream/chat/android/models/Message;Lo23/a;)V",
        "selectedMentions",
        "",
        "filterMentions",
        "(Ljava/util/Set;Ljava/lang/String;)Ljava/util/List;",
        "syncAttachments",
        "handleValidationErrors",
        "stashPreCommandState",
        "restorePreCommandStateIfAny",
        "()Z",
        "discardCommandStash",
        "orderedForComposer",
        "(Ljava/util/List;)Ljava/util/List;",
        "handleMentionSuggestions",
        "handleCommandSuggestions",
        "suppressSuggestionsInEditMode",
        "text",
        "filteredSuggestionsFor",
        "(Ljava/lang/String;)Ljava/util/List;",
        "tryAutoSelectCommand",
        "(Ljava/lang/String;)Z",
        "action",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerViewEvent;",
        "detectBlockingCommand",
        "(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerViewEvent;",
        "",
        "cooldownInterval",
        "Ljava/util/Date;",
        "lastSentMessageDate",
        "handleLastSentMessageDate",
        "(ILjava/util/Date;)V",
        "handleLinkPreview",
        "(Lq83/d;)Ljava/lang/Object;",
        "loadLatestMessagesIfNeeded",
        "sendKeystrokeEvent",
        "sendStopTypingEvent",
        "url",
        "Lo23/d;",
        "Lio/getstream/chat/android/models/LinkPreview;",
        "enrichPreview",
        "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;)Lo23/d;",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "getDraftMessageOrEmpty",
        "(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)Lio/getstream/chat/android/models/DraftMessage;",
        "getDraftMessage",
        "emptyDraftMessage",
        "shouldSkipEnrichUrl",
        "(Lio/getstream/chat/android/models/Message;)Z",
        "Ljava/lang/String;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lec3/f2;",
        "getChannelState",
        "()Lec3/f2;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;",
        "Lec3/l;",
        "channelType",
        "channelId",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;",
        "messageValidator",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;",
        "currentDraftId",
        "Lb23/k;",
        "logger",
        "Lb23/k;",
        "Lbc3/c0;",
        "scope",
        "Lbc3/c0;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;",
        "audioRecordingController",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;",
        "Lio/getstream/chat/android/ui/common/utils/typing/TypingUpdatesBuffer;",
        "typingUpdatesBuffer",
        "Lio/getstream/chat/android/ui/common/utils/typing/TypingUpdatesBuffer;",
        "getTypingUpdatesBuffer",
        "()Lio/getstream/chat/android/ui/common/utils/typing/TypingUpdatesBuffer;",
        "setTypingUpdatesBuffer",
        "(Lio/getstream/chat/android/ui/common/utils/typing/TypingUpdatesBuffer;)V",
        "ownCapabilities",
        "canSendTypingUpdates",
        "isSlowModeActive",
        "isSlowModeDisabled",
        "",
        "channelDraftMessages",
        "threadDraftMessages",
        "Lec3/o1;",
        "_inputFocusEvents",
        "Lec3/o1;",
        "Lec3/t1;",
        "inputFocusEvents",
        "Lec3/t1;",
        "getInputFocusEvents",
        "()Lec3/t1;",
        "_events",
        "events",
        "getEvents",
        "Lec3/p1;",
        "Ljava/util/LinkedHashMap;",
        "Lkotlin/collections/LinkedHashMap;",
        "_selectedAttachments",
        "Lec3/p1;",
        "_editModeAttachments",
        "_editModeMessage",
        "_recordingAttachment",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;",
        "sessionRepository",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;",
        "_state",
        "state",
        "getState",
        "Lio/getstream/chat/android/ui/common/state/messages/MessageInput;",
        "_messageInput",
        "messageInput",
        "getMessageInput",
        "users",
        "Ljava/util/List;",
        "commands",
        "Lbc3/k1;",
        "cooldownTimerJob",
        "Lbc3/k1;",
        "linkPreviewJob",
        "dismissedLinkPreviewUrl",
        "_messageActions",
        "messageActions",
        "getMessageActions",
        "",
        "Ljava/util/Set;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;",
        "commandStash",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggester;",
        "mentionSuggester",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggester;",
        "getActiveAction",
        "()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
        "activeAction",
        "isInEditMode",
        "getParentMessageId",
        "()Ljava/lang/String;",
        "parentMessageId",
        "getMessageText",
        "messageText",
        "isInThread",
        "Companion",
        "CommandStash",
        "Config",
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

.field public static final Companion:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Companion;

.field private static final LinkPattern:Lyb3/p;

.field private static final MENTION_START_SYMBOL:Ljava/lang/String; = "@"

.field private static final ONE_SECOND:J = 0x3e8L

.field private static final TEXT_INPUT_DEBOUNCE_TIME:J = 0x12cL


# instance fields
.field private final _editModeAttachments:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _editModeMessage:Lec3/p1;
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

.field private final _inputFocusEvents:Lec3/o1;
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

.field private final _messageInput:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _recordingAttachment:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _selectedAttachments:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _state:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final audioRecordingController:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

.field private final canSendTypingUpdates:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final channelCid:Ljava/lang/String;

.field private final channelDraftMessages:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final channelId:Ljava/lang/String;

.field private final channelState:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final channelType:Ljava/lang/String;

.field private final chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private commandStash:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;

.field private commands:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;"
        }
    .end annotation
.end field

.field private final config:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

.field private cooldownTimerJob:Lbc3/k1;

.field private currentDraftId:Ljava/lang/String;

.field private dismissedLinkPreviewUrl:Ljava/lang/String;

.field private final events:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private final globalState:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final inputFocusEvents:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private final isSlowModeActive:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final isSlowModeDisabled:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private linkPreviewJob:Lbc3/k1;

.field private final logger:Lb23/k;

.field private final mentionSuggester:Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggester;

.field private final messageActions:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final messageInput:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final messageValidator:Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;

.field private final ownCapabilities:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final scope:Lbc3/c0;

.field private final selectedMentions:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;",
            ">;"
        }
    .end annotation
.end field

.field private final sessionRepository:Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;

.field private final state:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final threadDraftMessages:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private typingUpdatesBuffer:Lio/getstream/chat/android/ui/common/utils/typing/TypingUpdatesBuffer;

.field private final userLookupHandler:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;

.field private users:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->Companion:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Companion;

    new-instance v0, Lyb3/p;

    const-string v1, "(http://|https://)?([a-zA-Z0-9]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}))(/[\\w-./?%&=]*)?"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->LinkPattern:Lyb3/p;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lec3/f2;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;Lec3/l;Landroidx/lifecycle/k1;)V
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lec3/f2;",
            "Ls23/g;",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
            "Lkotlin/jvm/functions/Function1;",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;",
            "Lec3/l;",
            "Landroidx/lifecycle/k1;",
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

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    const-string v10, "channelCid"

    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "chatClient"

    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "channelState"

    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "mediaRecorder"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "userLookupHandler"

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "fileToUri"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "config"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "globalState"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "savedStateHandle"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelCid:Ljava/lang/String;

    .line 3
    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 4
    iput-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelState:Lec3/f2;

    .line 5
    iput-object v5, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->userLookupHandler:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;

    .line 6
    iput-object v7, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->config:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

    .line 7
    iput-object v8, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->globalState:Lec3/l;

    .line 8
    invoke-static {v1}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object v5

    .line 9
    iget-object v5, v5, Ll83/k;->w:Ljava/lang/Object;

    .line 10
    check-cast v5, Ljava/lang/String;

    iput-object v5, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelType:Ljava/lang/String;

    .line 11
    invoke-static {v1}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object v1

    .line 12
    iget-object v1, v1, Ll83/k;->x:Ljava/lang/Object;

    .line 13
    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelId:Ljava/lang/String;

    .line 14
    new-instance v10, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;

    .line 15
    invoke-virtual {v2}, Lio/getstream/chat/android/client/ChatClient;->getAppSettings()Lio/getstream/chat/android/models/AppSettings;

    move-result-object v11

    .line 16
    invoke-virtual {v7}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->getMaxAttachmentCount()I

    move-result v12

    const/16 v15, 0xc

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 17
    invoke-direct/range {v10 .. v16}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;-><init>(Lio/getstream/chat/android/models/AppSettings;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v10, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->messageValidator:Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;

    .line 18
    new-instance v1, Lb23/k;

    sget-object v5, Lb23/i;->c:Lb23/j;

    sget-object v7, Lb23/i;->d:Lb23/e;

    const-string v10, "Chat:MessageComposerController"

    invoke-direct {v1, v10, v5, v7}, Lb23/k;-><init>(Ljava/lang/String;Lb23/j;Lb23/e;)V

    .line 19
    iput-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->logger:Lb23/k;

    .line 20
    sget-object v1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v1}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getImmediate()Lbc3/z;

    move-result-object v1

    invoke-static {v1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->scope:Lbc3/c0;

    .line 21
    new-instance v5, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    .line 22
    invoke-virtual {v2}, Lio/getstream/chat/android/client/ChatClient;->getAudioPlayer()Lio/getstream/chat/android/client/audio/AudioPlayer;

    move-result-object v2

    .line 23
    invoke-direct {v5, v2, v4, v6, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;-><init>(Lio/getstream/chat/android/client/audio/AudioPlayer;Ls23/g;Lkotlin/jvm/functions/Function1;Lbc3/c0;)V

    iput-object v5, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->audioRecordingController:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    .line 24
    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$typingUpdatesBuffer$1;

    invoke-direct {v2, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$typingUpdatesBuffer$1;-><init>(Ljava/lang/Object;)V

    .line 25
    new-instance v4, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$typingUpdatesBuffer$2;

    invoke-direct {v4, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$typingUpdatesBuffer$2;-><init>(Ljava/lang/Object;)V

    .line 26
    new-instance v5, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;

    invoke-direct {v5, v1, v2, v4}, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;-><init>(Lbc3/c0;Lc93/a;Lc93/a;)V

    iput-object v5, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->typingUpdatesBuffer:Lio/getstream/chat/android/ui/common/utils/typing/TypingUpdatesBuffer;

    .line 27
    new-instance v2, Lch/i;

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lch/i;-><init>(Lec3/l;I)V

    .line 28
    new-instance v4, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$special$$inlined$flatMapLatest$1;

    const/4 v5, 0x3

    const/4 v6, 0x0

    .line 29
    invoke-direct {v4, v5, v6}, Ls83/i;-><init>(ILq83/d;)V

    .line 30
    invoke-static {v2, v4}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v2

    .line 31
    new-instance v4, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$special$$inlined$map$1;

    invoke-direct {v4, v2, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$special$$inlined$map$1;-><init>(Lec3/l;Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)V

    .line 32
    sget-object v2, Lec3/z1;->a:Lec3/b2;

    .line 33
    sget-object v7, Lm83/a0;->w:Lm83/a0;

    .line 34
    invoke-static {v4, v1, v2, v7}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v4

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->ownCapabilities:Lec3/f2;

    .line 35
    new-instance v7, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$special$$inlined$map$2;

    invoke-direct {v7, v4}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$special$$inlined$map$2;-><init>(Lec3/l;)V

    .line 36
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 37
    invoke-static {v7, v1, v2, v10}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v7

    iput-object v7, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->canSendTypingUpdates:Lec3/f2;

    .line 38
    new-instance v7, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$special$$inlined$map$3;

    invoke-direct {v7, v4}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$special$$inlined$map$3;-><init>(Lec3/l;)V

    .line 39
    invoke-static {v7, v1, v2, v10}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v7

    iput-object v7, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->isSlowModeActive:Lec3/f2;

    .line 40
    new-instance v7, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$special$$inlined$map$4;

    invoke-direct {v7, v4}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$special$$inlined$map$4;-><init>(Lec3/l;)V

    .line 41
    invoke-static {v7, v1, v2, v10}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v4

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->isSlowModeDisabled:Lec3/f2;

    .line 42
    new-instance v4, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$special$$inlined$flatMapLatest$2;

    .line 43
    invoke-direct {v4, v5, v6}, Ls83/i;-><init>(ILq83/d;)V

    .line 44
    invoke-static {v8, v4}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v4

    .line 45
    sget-object v7, Lm83/z;->w:Lm83/z;

    invoke-static {v4, v1, v2, v7}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v4

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelDraftMessages:Lec3/f2;

    .line 46
    new-instance v4, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$special$$inlined$flatMapLatest$3;

    .line 47
    invoke-direct {v4, v5, v6}, Ls83/i;-><init>(ILq83/d;)V

    .line 48
    invoke-static {v8, v4}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v4

    .line 49
    invoke-static {v4, v1, v2, v7}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->threadDraftMessages:Lec3/f2;

    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v7, 0x5

    .line 50
    invoke-static {v2, v4, v6, v7}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v8

    iput-object v8, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_inputFocusEvents:Lec3/o1;

    .line 51
    invoke-static {v8}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object v8

    iput-object v8, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->inputFocusEvents:Lec3/t1;

    .line 52
    invoke-static {v2, v4, v6, v7}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_events:Lec3/o1;

    .line 53
    invoke-static {v2}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->events:Lec3/t1;

    .line 54
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {v2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_selectedAttachments:Lec3/p1;

    .line 55
    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-static {v2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_editModeAttachments:Lec3/p1;

    .line 56
    invoke-static {v6}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_editModeMessage:Lec3/p1;

    .line 57
    invoke-static {v6}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_recordingAttachment:Lec3/p1;

    .line 58
    new-instance v4, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;

    invoke-direct {v4, v9}, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;-><init>(Landroidx/lifecycle/k1;)V

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->sessionRepository:Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;

    .line 59
    new-instance v7, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    const v26, 0x3ffff

    const/16 v27, 0x0

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

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v7 .. v27}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;-><init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v7}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    .line 60
    invoke-static {v4}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v4

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->state:Lec3/f2;

    .line 61
    new-instance v4, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;

    invoke-direct {v4, v6, v6, v5, v6}, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;-><init>(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v4}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_messageInput:Lec3/p1;

    .line 62
    invoke-static {v4}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v4

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->messageInput:Lec3/f2;

    .line 63
    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->users:Ljava/util/List;

    .line 64
    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->commands:Ljava/util/List;

    .line 65
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {v2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_messageActions:Lec3/p1;

    .line 66
    invoke-static {v2}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->messageActions:Lec3/f2;

    .line 67
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->selectedMentions:Ljava/util/Set;

    .line 68
    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggester;

    .line 69
    new-instance v4, Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestionOptions;

    const/4 v7, 0x6

    const-string v9, "@"

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 p4, v4

    move/from16 p8, v7

    move-object/from16 p9, v8

    move-object/from16 p5, v9

    move/from16 p6, v10

    move/from16 p7, v11

    invoke-direct/range {p4 .. p9}, Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestionOptions;-><init>(Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 70
    invoke-direct {v2, v4}, Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggester;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestionOptions;)V

    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->mentionSuggester:Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggester;

    .line 71
    new-instance v2, Lch/i;

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lch/i;-><init>(Lec3/l;I)V

    .line 72
    new-instance v4, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$special$$inlined$flatMapLatest$4;

    .line 73
    invoke-direct {v4, v5, v6}, Ls83/i;-><init>(ILq83/d;)V

    .line 74
    invoke-static {v2, v4}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v2

    .line 75
    new-instance v4, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$2;

    invoke-direct {v4, v0, v6}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$2;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V

    .line 76
    new-instance v7, Lec3/j1;

    const/4 v8, 0x0

    invoke-direct {v7, v2, v4, v8}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    .line 77
    invoke-static {v7, v1}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    .line 78
    new-instance v2, Lch/i;

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lch/i;-><init>(Lec3/l;I)V

    .line 79
    new-instance v4, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$special$$inlined$flatMapLatest$5;

    .line 80
    invoke-direct {v4, v5, v6}, Ls83/i;-><init>(ILq83/d;)V

    .line 81
    invoke-static {v2, v4}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v2

    .line 82
    new-instance v4, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$4;

    invoke-direct {v4, v0, v6}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$4;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V

    .line 83
    new-instance v7, Lec3/j1;

    invoke-direct {v7, v2, v4, v8}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    .line 84
    invoke-static {v7, v1}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    .line 85
    new-instance v2, Lch/i;

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lch/i;-><init>(Lec3/l;I)V

    .line 86
    new-instance v3, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$special$$inlined$flatMapLatest$6;

    .line 87
    invoke-direct {v3, v5, v6}, Ls83/i;-><init>(ILq83/d;)V

    .line 88
    invoke-static {v2, v3}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v2

    new-instance v3, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/16 v4, 0x13

    invoke-direct {v3, v4}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    .line 89
    sget-object v4, Lec3/v;->b:Lds2/a;

    invoke-static {v2, v3, v4}, Lec3/v;->u(Lec3/l;Lkotlin/jvm/functions/Function1;Lc93/m;)Lec3/j;

    move-result-object v2

    .line 90
    new-instance v3, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$7;

    invoke-direct {v3, v0, v6}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$7;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V

    .line 91
    new-instance v4, Lec3/j1;

    const/4 v5, 0x0

    invoke-direct {v4, v2, v3, v5}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    .line 92
    invoke-static {v4, v1}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    .line 93
    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->setupComposerState()V

    .line 94
    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->restoreSession()V

    .line 95
    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->observeSessionChanges()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lec3/f2;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;Lec3/l;Landroidx/lifecycle/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    .line 96
    sget-object p2, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p2

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, v0, 0x40

    if-eqz p2, :cond_1

    .line 97
    new-instance v3, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;-><init>(IZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v3

    goto :goto_0

    :cond_1
    move-object/from16 v7, p7

    :goto_0
    and-int/lit16 p2, v0, 0x80

    if-eqz p2, :cond_2

    .line 98
    invoke-static {v2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->getGlobalStateFlow(Lio/getstream/chat/android/client/ChatClient;)Lec3/l;

    move-result-object p2

    move-object v8, p2

    goto :goto_1

    :cond_2
    move-object/from16 v8, p8

    :goto_1
    and-int/lit16 p2, v0, 0x100

    if-eqz p2, :cond_3

    .line 99
    new-instance p2, Landroidx/lifecycle/k1;

    invoke-direct {p2}, Landroidx/lifecycle/k1;-><init>()V

    move-object v9, p2

    :goto_2
    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    goto :goto_3

    :cond_3
    move-object/from16 v9, p9

    goto :goto_2

    .line 100
    :goto_3
    invoke-direct/range {v0 .. v9}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lec3/f2;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;Lec3/l;Landroidx/lifecycle/k1;)V

    return-void
.end method

.method private static final _init_$lambda$12(Ll83/k;)Ljava/util/Date;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Ll83/k;->x:Ljava/lang/Object;

    check-cast p0, Ljava/util/Date;

    return-object p0
.end method

.method public static synthetic a(Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;)Lio/getstream/chat/android/models/LinkPreview;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->enrichPreview$lambda$73(Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;)Lio/getstream/chat/android/models/LinkPreview;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$clearDraftMessage(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lio/getstream/chat/android/ui/common/state/messages/MessageMode;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->clearDraftMessage(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$enqueueSendMessage(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lio/getstream/chat/android/models/Message;Lo23/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->enqueueSendMessage(Lio/getstream/chat/android/models/Message;Lo23/a;)V

    return-void
.end method

.method public static final synthetic access$fetchDraftMessage(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->fetchDraftMessage(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)V

    return-void
.end method

.method public static final synthetic access$getAudioRecordingController$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->audioRecordingController:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    return-object p0
.end method

.method public static final synthetic access$getCanSendTypingUpdates$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Lec3/f2;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->canSendTypingUpdates:Lec3/f2;

    return-object p0
.end method

.method public static final synthetic access$getChannelCid$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelCid:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getChannelId$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelId:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getChannelType$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelType:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getChatClient$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Lio/getstream/chat/android/client/ChatClient;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    return-object p0
.end method

.method public static final synthetic access$getCommands$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->commands:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getCurrentDraftId$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->currentDraftId:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getLinkPattern$cp()Lyb3/p;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->LinkPattern:Lyb3/p;

    return-object v0
.end method

.method public static final synthetic access$getLinkPreviewJob$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Lbc3/k1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->linkPreviewJob:Lbc3/k1;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Lb23/k;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->logger:Lb23/k;

    return-object p0
.end method

.method public static final synthetic access$getMentionSuggester$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggester;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->mentionSuggester:Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggester;

    return-object p0
.end method

.method public static final synthetic access$getMessageValidator$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->messageValidator:Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;

    return-object p0
.end method

.method public static final synthetic access$getParentMessageId(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getParentMessageId()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getScope$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Lbc3/c0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->scope:Lbc3/c0;

    return-object p0
.end method

.method public static final synthetic access$getSessionRepository$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->sessionRepository:Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;

    return-object p0
.end method

.method public static final synthetic access$getUserLookupHandler$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->userLookupHandler:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;

    return-object p0
.end method

.method public static final synthetic access$get_messageInput$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_messageInput:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic access$get_recordingAttachment$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_recordingAttachment:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic access$get_state$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic access$handleCommandSuggestions(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->handleCommandSuggestions()V

    return-void
.end method

.method public static final synthetic access$handleLastSentMessageDate(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;ILjava/util/Date;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->handleLastSentMessageDate(ILjava/util/Date;)V

    return-void
.end method

.method public static final synthetic access$handleLastSentMessageDate$updateCooldownTime(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;I)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->handleLastSentMessageDate$updateCooldownTime(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;I)V

    return-void
.end method

.method public static final synthetic access$handleLinkPreview(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->handleLinkPreview(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handleMentionSuggestions(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->handleMentionSuggestions()V

    return-void
.end method

.method public static final synthetic access$handleValidationErrors(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->handleValidationErrors()V

    return-void
.end method

.method public static final synthetic access$lambda$11$lambda$10(Lio/getstream/chat/android/models/ChannelData;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 0

    new-instance p2, Ll83/k;

    invoke-direct {p2, p0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method

.method public static final synthetic access$loadLatestMessagesIfNeeded(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->loadLatestMessagesIfNeeded()V

    return-void
.end method

.method public static final synthetic access$saveDraftMessage(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lio/getstream/chat/android/ui/common/state/messages/MessageMode;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->saveDraftMessage(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$sendKeystrokeEvent(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->sendKeystrokeEvent()V

    return-void
.end method

.method public static final synthetic access$sendStopTypingEvent(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->sendStopTypingEvent()V

    return-void
.end method

.method public static final synthetic access$setCommands$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->commands:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$setLinkPreviewJob$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lbc3/k1;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->linkPreviewJob:Lbc3/k1;

    return-void
.end method

.method public static final synthetic access$setUsers$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->users:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$syncAttachments(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->syncAttachments()V

    return-void
.end method

.method public static synthetic b(Ln23/h;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->createPoll$lambda$37(Ln23/h;)Ll83/a0;

    return-void
.end method

.method public static synthetic buildNewMessage$default(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/models/Message;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->buildNewMessage(Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/models/Message;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ll83/k;)Ljava/util/Date;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_init_$lambda$12(Ll83/k;)Ljava/util/Date;

    move-result-object p0

    return-object p0
.end method

.method private final clearDraftMessage(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->config:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->getDraftMessageEnabled()Z

    move-result v0

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getDraftMessage(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)Lio/getstream/chat/android/models/DraftMessage;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v2, v3, p1}, Lio/getstream/chat/android/client/ChatClient;->deleteDraftMessages(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;)Lo23/d;

    move-result-object p1

    check-cast p1, Lo23/k;

    invoke-virtual {p1, p2}, Lo23/k;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    check-cast p1, Ln23/h;

    :cond_2
    return-object v1
.end method

.method public static synthetic completeRecording$default(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->completeRecording(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic createPoll$default(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lio/getstream/chat/android/models/CreatePollParams;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/16 p3, 0x14

    invoke-direct {p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->createPoll(Lio/getstream/chat/android/models/CreatePollParams;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final createPoll$lambda$37(Ln23/h;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final createPoll$lambda$38(Lkotlin/jvm/functions/Function1;Ln23/h;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ln23/h;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->createPoll$lambda$38(Lkotlin/jvm/functions/Function1;Ln23/h;)V

    return-void
.end method

.method private final detectBlockingCommand(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerViewEvent;
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->config:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->getActiveCommandEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    if-nez p2, :cond_1

    return-object v1

    :cond_1
    sget-object v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Companion$CommandText;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Companion$CommandText;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Companion$CommandText;->inlineCommandName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    return-object v1

    :cond_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->commands:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/Command;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Command;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_4
    move-object v2, v1

    :goto_0
    check-cast v2, Lio/getstream/chat/android/models/Command;

    if-nez v2, :cond_5

    return-object v1

    :cond_5
    invoke-static {v2, p2}, Lio/getstream/chat/android/ui/common/state/messages/composer/CommandAvailabilityKt;->isAvailableFor(Lio/getstream/chat/android/models/Command;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)Z

    move-result p1

    if-eqz p1, :cond_6

    return-object v1

    :cond_6
    new-instance p1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerViewEvent$CommandUnavailable;

    invoke-direct {p1, p2}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerViewEvent$CommandUnavailable;-><init>(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V

    return-object p1
.end method

.method private final discardCommandStash()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->commandStash:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;

    return-void
.end method

.method private final emptyDraftMessage(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)Lio/getstream/chat/android/models/DraftMessage;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    if-eqz v2, :cond_0

    new-instance v3, Lio/getstream/chat/android/models/DraftMessage;

    iget-object v5, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelCid:Ljava/lang/String;

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v7

    const/16 v16, 0xff5

    const/16 v17, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v3 .. v17}, Lio/getstream/chat/android/models/DraftMessage;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZLio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_0
    new-instance v4, Lio/getstream/chat/android/models/DraftMessage;

    iget-object v6, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelCid:Ljava/lang/String;

    const/16 v17, 0xffd

    const/16 v18, 0x0

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

    invoke-direct/range {v4 .. v18}, Lio/getstream/chat/android/models/DraftMessage;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZLio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method

.method private final enqueueEditMessage(Lio/getstream/chat/android/models/Message;Lo23/a;Lc93/m;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lo23/a;",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueEditMessage$1;

    const/4 v6, 0x0

    move-object v4, p0

    move-object v3, p1

    move-object v5, p2

    move-object v2, p3

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueEditMessage$1;-><init>(Lc93/m;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lo23/a;Lq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {v0, p2, p2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final enqueueSendMessage(Lio/getstream/chat/android/models/Message;Lo23/a;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lo23/a;",
            ")V"
        }
    .end annotation

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

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v5, p1

    invoke-static/range {v2 .. v8}, Lio/getstream/chat/android/client/ChatClient;->sendMessage$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;ZILjava/lang/Object;)Lo23/d;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V

    invoke-static {p1, v0, v1}, Lo23/f;->b(Lo23/d;Lbc3/c0;Lkotlin/jvm/functions/Function1;)Lo23/k;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;

    invoke-direct {v1, p0, v3, v4, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$enqueueSendMessage$2;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    invoke-static {p1, v0, v1}, Lo23/f;->a(Lo23/d;Lbc3/c0;Lc93/m;)Lo23/k;

    move-result-object p1

    invoke-virtual {p1, p2}, Lo23/k;->enqueue(Lo23/a;)V

    return-void
.end method

.method private final enrichPreview(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;)Lo23/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    invoke-static {p2}, Lio/getstream/chat/android/ui/common/utils/extensions/StringKt;->addSchemeToUrlIfNeeded(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/ChatClient;->enrichUrl(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    new-instance v0, Lht2/d;

    const/16 v1, 0x9

    invoke-direct {v0, p2, v1}, Lht2/d;-><init>(Ljava/lang/String;I)V

    invoke-static {p1, v0}, Lo23/f;->g(Lo23/d;Lkotlin/jvm/functions/Function1;)Lo23/o;

    move-result-object p1

    return-object p1
.end method

.method private static final enrichPreview$lambda$73(Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;)Lio/getstream/chat/android/models/LinkPreview;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/LinkPreview;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/models/LinkPreview;-><init>(Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;)V

    return-object v0
.end method

.method private final fetchDraftMessage(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)V
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->config:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->getDraftMessageEnabled()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    :cond_1
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    const v23, 0x1ffff

    const/16 v24, 0x0

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

    invoke-static/range {v4 .. v24}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v1, 0x0

    iput-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->commandStash:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;

    invoke-direct/range {p0 .. p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getDraftMessageOrEmpty(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)Lio/getstream/chat/android/models/DraftMessage;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/DraftMessage;->getId()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->currentDraftId:Ljava/lang/String;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/DraftMessage;->getReplyMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v3

    if-eqz v3, :cond_2

    new-instance v1, Lio/getstream/chat/android/ui/common/state/messages/Reply;

    invoke-direct {v1, v3}, Lio/getstream/chat/android/ui/common/state/messages/Reply;-><init>(Lio/getstream/chat/android/models/Message;)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->performMessageAction(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V

    goto :goto_1

    :cond_2
    iget-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_messageActions:Lec3/p1;

    move-object v4, v3

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    instance-of v7, v7, Lio/getstream/chat/android/ui/common/state/messages/Reply;

    if-nez v7, :cond_3

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-static {v5}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v4

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3, v1, v4}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :goto_1
    invoke-virtual {v2}, Lio/getstream/chat/android/models/DraftMessage;->getCommand()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->restoreDraftCommandIfAvailable(Ljava/lang/String;)Lio/getstream/chat/android/models/Command;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v2}, Lio/getstream/chat/android/models/DraftMessage;->getArgs()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    :cond_5
    invoke-virtual {v2}, Lio/getstream/chat/android/models/DraftMessage;->getText()Ljava/lang/String;

    move-result-object v1

    :cond_6
    sget-object v3, Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$DraftMessage;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$DraftMessage;

    invoke-direct {v0, v1, v3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->setMessageInputInternal(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;)V

    invoke-virtual {v2}, Lio/getstream/chat/android/models/DraftMessage;->getShowInChannel()Z

    move-result v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->setAlsoSendToChannel(Z)V

    return-void
.end method

.method private final filterMentions(Ljava/util/Set;Ljava/lang/String;)Ljava/util/List;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

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

    instance-of v4, v3, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention$User;

    if-eqz v4, :cond_0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    move-object/from16 v3, p2

    invoke-virtual {v3, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "toLowerCase(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention$User;

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention$User;->getDisplay()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "@"

    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v1, v6, v7}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v4, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention$User;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention$User;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->selectedMentions:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->clear()V

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    :cond_5
    move-object v3, v2

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    const v24, 0x2ffff

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

    sget-object v22, Lm83/a0;->w:Lm83/a0;

    const/16 v23, 0x0

    invoke-static/range {v5 .. v25}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {v1}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    return-object v1
.end method

.method private final filteredSuggestionsFor(Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Companion$CommandText;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Companion$CommandText;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Companion$CommandText;->isTrigger(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_0
    const-string v0, "/"

    invoke-static {p1, v0}, Lyb3/r;->q0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->commands:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/Command;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Command;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, p1, v4}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-direct {p0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->orderedForComposer(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final getActiveAction()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_messageActions:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    instance-of v4, v3, Lio/getstream/chat/android/ui/common/state/messages/Edit;

    if-nez v4, :cond_1

    instance-of v3, v3, Lio/getstream/chat/android/ui/common/state/messages/Reply;

    if-eqz v3, :cond_0

    :cond_1
    move-object v1, v2

    goto :goto_0

    :cond_2
    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    return-object v1
.end method

.method private final getDraftMessage(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)Lio/getstream/chat/android/models/DraftMessage;
    .locals 1

    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->threadDraftMessages:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/DraftMessage;

    return-object p1

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelDraftMessages:Lec3/f2;

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelCid:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/DraftMessage;

    return-object p1
.end method

.method private final getDraftMessageOrEmpty(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)Lio/getstream/chat/android/models/DraftMessage;
    .locals 1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getDraftMessage(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)Lio/getstream/chat/android/models/DraftMessage;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->emptyDraftMessage(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)Lio/getstream/chat/android/models/DraftMessage;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method private final getMessageText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_messageInput:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;->getText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final getParentMessageId()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getMessageMode()Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    move-result-object v0

    instance-of v1, v0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v2
.end method

.method private final handleCommandSuggestions()V
    .locals 25

    move-object/from16 v0, p0

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getMessageText()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->tryAutoSelectCommand(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->suppressSuggestionsInEditMode()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    :cond_2
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getMessageText()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->filteredSuggestionsFor(Ljava/lang/String;)Ljava/util/List;

    move-result-object v10

    const v23, 0x3ffdf

    const/16 v24, 0x0

    const/4 v5, 0x0

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

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v4 .. v24}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    :goto_0
    return-void
.end method

.method private final handleLastSentMessageDate(ILjava/util/Date;)V
    .locals 10

    if-lez p1, :cond_3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->isSlowModeActive:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->isSlowModeDisabled:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_3

    if-eqz p2, :cond_3

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getActiveAction()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    move-result-object v0

    instance-of v0, v0, Lio/getstream/chat/android/ui/common/state/messages/Edit;

    if-nez v0, :cond_3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-gez p2, :cond_0

    move-wide v6, v2

    goto :goto_0

    :cond_0
    move-wide v6, v0

    :goto_0
    int-to-long v0, p1

    cmp-long p2, v6, v0

    if-gez p2, :cond_2

    iget-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->cooldownTimerJob:Lbc3/k1;

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    invoke-interface {p2, v0}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    iget-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->scope:Lbc3/c0;

    new-instance v4, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$handleLastSentMessageDate$1;

    const/4 v9, 0x0

    move-object v8, p0

    move v5, p1

    invoke-direct/range {v4 .. v9}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$handleLastSentMessageDate$1;-><init>(IJLio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p2, v0, v0, v4, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, v8, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->cooldownTimerJob:Lbc3/k1;

    return-void

    :cond_2
    move-object v8, p0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->handleLastSentMessageDate$updateCooldownTime(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;I)V

    return-void

    :cond_3
    move-object v8, p0

    return-void
.end method

.method private static final handleLastSentMessageDate$updateCooldownTime(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;I)V
    .locals 24

    move-object/from16 v0, p0

    iget-object v0, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    :cond_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    const v22, 0x3ff7f

    const/16 v23, 0x0

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

    move/from16 v11, p1

    invoke-static/range {v3 .. v23}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method private final handleLinkPreview(Lq83/d;)Ljava/lang/Object;
    .locals 28
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

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$handleLinkPreview$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$handleLinkPreview$1;

    iget v3, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$handleLinkPreview$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$handleLinkPreview$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$handleLinkPreview$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$handleLinkPreview$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$handleLinkPreview$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$handleLinkPreview$1;->label:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$handleLinkPreview$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v2, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$handleLinkPreview$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->LinkPattern:Lyb3/p;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getMessageText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lyb3/p;->a(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lyb3/n;->c()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_3
    move-object v1, v6

    :goto_1
    iget-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->logger:Lb23/k;

    iget-object v7, v4, Lb23/k;->c:Lb23/e;

    iget-object v8, v4, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->x:Lb23/g;

    invoke-interface {v7, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_4

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    const-string v7, "[handleLinkPreview] url: "

    invoke-static {v7, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4, v9, v8, v7, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    if-eqz v1, :cond_7

    iget-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->config:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->getLinkPreviewEnabled()Z

    move-result v4

    if-eqz v4, :cond_5

    iget-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->dismissedLinkPreviewUrl:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_2

    :cond_5
    move-object v1, v6

    :goto_2
    if-eqz v1, :cond_7

    iget-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-direct {v0, v4, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->enrichPreview(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;)Lo23/d;

    move-result-object v1

    iput-object v6, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$handleLinkPreview$1;->L$0:Ljava/lang/Object;

    iput-object v6, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$handleLinkPreview$1;->L$1:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$handleLinkPreview$1;->I$0:I

    iput v5, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$handleLinkPreview$1;->label:I

    check-cast v1, Lo23/o;

    invoke-virtual {v1, v2}, Lo23/o;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_6

    return-object v3

    :cond_6
    :goto_3
    check-cast v1, Ln23/h;

    invoke-virtual {v1}, Ln23/h;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/LinkPreview;

    move-object v14, v1

    goto :goto_4

    :cond_7
    move-object v14, v6

    :goto_4
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->logger:Lb23/k;

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    if-eqz v14, :cond_8

    invoke-virtual {v14}, Lio/getstream/chat/android/models/LinkPreview;->getOriginUrl()Ljava/lang/String;

    move-result-object v2

    goto :goto_5

    :cond_8
    move-object v2, v6

    :goto_5
    const-string v5, "[handleLinkPreview] preview: "

    invoke-static {v5, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v4, v3, v2, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    :cond_a
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    const v26, 0x3ffbf

    const/16 v27, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

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

    invoke-static/range {v7 .. v27}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method private final handleMentionSuggestions()V
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_messageInput:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;->getSource()Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;

    move-result-object v2

    sget-object v3, Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$MentionSelected;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$MentionSelected;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->logger:Lb23/k;

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[handleMentionSuggestions] rejected (messageInput came from mention selection)"

    invoke-interface {v1, v5, v4, v2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    :cond_1
    move-object v1, v2

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    const v23, 0x3ffef

    const/16 v24, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    sget-object v9, Lm83/y;->w:Lm83/y;

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

    invoke-static/range {v4 .. v24}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_2
    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;->getText()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->scope:Lbc3/c0;

    sget-object v4, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v4}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object v4

    new-instance v5, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$handleMentionSuggestions$3;

    invoke-direct {v5, v0, v1, v3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$handleMentionSuggestions$3;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Ljava/lang/String;Lq83/d;)V

    const/4 v1, 0x2

    invoke-static {v2, v4, v3, v5, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final handleValidationErrors()V
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    :cond_0
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    iget-object v5, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->messageValidator:Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;

    iget-object v6, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_messageInput:Lec3/p1;

    check-cast v6, Lec3/h2;

    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;->getText()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getAttachments()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;->validateMessage(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    const v23, 0x3fff7

    const/16 v24, 0x0

    const/4 v5, 0x0

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

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v4 .. v24}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void
.end method

.method public static synthetic holdRecording$default(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Ll83/k;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->holdRecording(Ll83/k;)V

    return-void
.end method

.method private final isInEditMode()Z
    .locals 1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getActiveAction()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    move-result-object v0

    instance-of v0, v0, Lio/getstream/chat/android/ui/common/state/messages/Edit;

    return v0
.end method

.method private final isInThread()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getMessageMode()Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    move-result-object v0

    instance-of v0, v0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    return v0
.end method

.method private final isSameMessageMode(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)Z
    .locals 1

    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$Normal;

    if-eqz v0, :cond_0

    instance-of v0, p2, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$Normal;

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    if-eqz v0, :cond_1

    instance-of v0, p2, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    if-eqz v0, :cond_1

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    check-cast p2, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p2

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private static final synthetic lambda$11$lambda$10(Lio/getstream/chat/android/models/ChannelData;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 0

    new-instance p2, Ll83/k;

    invoke-direct {p2, p0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method

.method private final loadLatestMessagesIfNeeded()V
    .locals 11

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->isInThread()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelState:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/channel/state/ChannelState;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getEndOfNewerMessages()Lec3/f2;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_2

    :goto_1
    return-void

    :cond_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->logger:Lb23/k;

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[loadLatestMessagesIfNeeded] loading latest messages"

    const/4 v4, 0x0

    invoke-interface {v0, v3, v2, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object v5, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v6, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelCid:Ljava/lang/String;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/16 v7, 0x1e

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->loadNewestMessages$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;IZILjava/lang/Object;)Lo23/d;

    move-result-object v0

    check-cast v0, Lo23/h;

    invoke-virtual {v0}, Lo23/h;->enqueue()V

    return-void
.end method

.method private final observeSessionChanges()V
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_selectedAttachments:Lec3/p1;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_editModeMessage:Lec3/p1;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_editModeAttachments:Lec3/p1;

    new-instance v3, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$observeSessionChanges$1;

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Ls83/i;-><init>(ILq83/d;)V

    invoke-static {v0, v1, v2, v3}, Lec3/v;->p(Lec3/l;Lec3/l;Lec3/l;Lc93/n;)Lec3/j1;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$observeSessionChanges$2;

    invoke-direct {v1, p0, v5}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$observeSessionChanges$2;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V

    new-instance v2, Lec3/j1;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->scope:Lbc3/c0;

    invoke-static {v2, v0}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    return-void
.end method

.method private final orderedForComposer(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->config:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->getActiveCommandEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getActiveAction()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    move-result-object v0

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/CommandAvailabilityKt;->sortedByAvailability(Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)Ljava/util/List;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private final restoreDraftCommandIfAvailable(Ljava/lang/String;)Lio/getstream/chat/android/models/Command;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->config:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->getActiveCommandEnabled()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return-object v3

    :cond_0
    if-nez v1, :cond_1

    return-object v3

    :cond_1
    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->commands:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/models/Command;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Command;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_0

    :cond_3
    move-object v4, v3

    :goto_0
    check-cast v4, Lio/getstream/chat/android/models/Command;

    if-nez v4, :cond_4

    return-object v3

    :cond_4
    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getActiveAction()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    move-result-object v1

    invoke-static {v4, v1}, Lio/getstream/chat/android/ui/common/state/messages/composer/CommandAvailabilityKt;->isAvailableFor(Lio/getstream/chat/android/models/Command;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)Z

    move-result v1

    if-nez v1, :cond_5

    return-object v3

    :cond_5
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    :goto_1
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    const v24, 0x1ffff

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

    move-object/from16 v23, v4

    invoke-static/range {v5 .. v25}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    return-object v23

    :cond_6
    move-object/from16 v4, v23

    goto :goto_1
.end method

.method private final restoreEditMode(Lio/getstream/chat/android/models/Message;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelState:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/channel/state/ChannelState;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, p1

    :cond_1
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$Edit;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$Edit;

    invoke-direct {p0, p1, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->setMessageInputInternal(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_editModeMessage:Lec3/p1;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_editModeAttachments:Lec3/p1;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, p2}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_messageActions:Lec3/p1;

    :cond_2
    move-object p2, p1

    check-cast p2, Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/util/Set;

    new-instance v3, Lio/getstream/chat/android/ui/common/state/messages/Edit;

    invoke-direct {v3, v0}, Lio/getstream/chat/android/ui/common/state/messages/Edit;-><init>(Lio/getstream/chat/android/models/Message;)V

    invoke-static {v3, v2}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->syncAttachments()V

    return-void
.end method

.method private final restorePreCommandStateIfAny()Z
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->commandStash:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    return v1

    :cond_0
    const/4 v2, 0x0

    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->commandStash:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->getInput()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$Default;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$Default;

    invoke-direct {v0, v3, v4}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->setMessageInputInternal(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;)V

    iget-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_selectedAttachments:Lec3/p1;

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->getAttachments()Ljava/util/Map;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3, v2, v4}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_recordingAttachment:Lec3/p1;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->getRecordingAttachment()Lio/getstream/chat/android/models/Attachment;

    move-result-object v3

    check-cast v2, Lec3/h2;

    invoke-virtual {v2, v3}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->selectedMentions:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->clear()V

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->selectedMentions:Ljava/util/Set;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->getMentions()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v2, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    :cond_1
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    iget-object v5, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->selectedMentions:Ljava/util/Set;

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v5}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v21

    const v23, 0x2ffff

    const/16 v24, 0x0

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

    const/16 v22, 0x0

    invoke-static/range {v4 .. v24}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->syncAttachments()V

    const/4 v1, 0x1

    return v1
.end method

.method private final restoreSession()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->sessionRepository:Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;->restoreSelectedAttachments()Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->addAttachments(Ljava/util/List;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->sessionRepository:Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;->restoreEditMode()Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository$EditMode;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository$EditMode;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository$EditMode;->getAttachments()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->restoreEditMode(Lio/getstream/chat/android/models/Message;Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method private final saveDraftMessage(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;Lq83/d;)Ljava/lang/Object;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->config:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->getDraftMessageEnabled()Z

    move-result v1

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    const/4 v1, 0x0

    iput-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->currentDraftId:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_messageInput:Lec3/p1;

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;->getText()Ljava/lang/String;

    move-result-object v7

    iget-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getActiveCommand()Lio/getstream/chat/android/models/Command;

    move-result-object v3

    iget-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->config:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->getActiveCommandEnabled()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    move-object v3, v1

    :goto_0
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_3

    if-nez v3, :cond_3

    invoke-direct/range {p0 .. p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->clearDraftMessage(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lr83/a;->w:Lr83/a;

    if-ne v1, v3, :cond_2

    return-object v1

    :cond_2
    return-object v2

    :cond_3
    invoke-direct/range {p0 .. p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getDraftMessageOrEmpty(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)Lio/getstream/chat/android/models/DraftMessage;

    move-result-object v4

    iget-object v5, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v6, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelType:Ljava/lang/String;

    iget-object v8, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelId:Ljava/lang/String;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Command;->getName()Ljava/lang/String;

    move-result-object v9

    move-object v15, v9

    goto :goto_1

    :cond_4
    move-object v15, v1

    :goto_1
    if-eqz v3, :cond_5

    move-object/from16 v16, v7

    goto :goto_2

    :cond_5
    move-object/from16 v16, v1

    :goto_2
    iget-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getAlsoSendToChannel()Z

    move-result v13

    iget-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_messageActions:Lec3/p1;

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    instance-of v10, v10, Lio/getstream/chat/android/ui/common/state/messages/Reply;

    if-eqz v10, :cond_6

    goto :goto_3

    :cond_7
    move-object v9, v1

    :goto_3
    instance-of v3, v9, Lio/getstream/chat/android/ui/common/state/messages/Reply;

    if-eqz v3, :cond_8

    check-cast v9, Lio/getstream/chat/android/ui/common/state/messages/Reply;

    goto :goto_4

    :cond_8
    move-object v9, v1

    :goto_4
    if-eqz v9, :cond_9

    invoke-virtual {v9}, Lio/getstream/chat/android/ui/common/state/messages/Reply;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    :cond_9
    move-object v14, v1

    const/16 v17, 0xfb

    const/16 v18, 0x0

    move-object v1, v5

    const/4 v5, 0x0

    move-object v3, v6

    const/4 v6, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object/from16 v19, v12

    const/4 v12, 0x0

    move-object/from16 v0, v19

    invoke-static/range {v4 .. v18}, Lio/getstream/chat/android/models/DraftMessage;->copy$default(Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZLio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/DraftMessage;

    move-result-object v4

    invoke-virtual {v1, v3, v0, v4}, Lio/getstream/chat/android/client/ChatClient;->createDraftMessage(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;)Lo23/d;

    move-result-object v0

    check-cast v0, Lo23/k;

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lo23/k;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lr83/a;->w:Lr83/a;

    if-ne v0, v1, :cond_a

    return-object v0

    :cond_a
    check-cast v0, Ln23/h;

    return-object v2
.end method

.method private final sendKeystrokeEvent()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelId:Ljava/lang/String;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getParentMessageId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lio/getstream/chat/android/client/ChatClient;->keystroke(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object v0

    invoke-interface {v0}, Lo23/d;->enqueue()V

    return-void
.end method

.method public static synthetic sendMessage$default(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lio/getstream/chat/android/models/Message;Lo23/a;Lc93/m;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->sendMessage(Lio/getstream/chat/android/models/Message;Lo23/a;Lc93/m;)V

    return-void
.end method

.method private final sendStopTypingEvent()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelId:Ljava/lang/String;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getParentMessageId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lio/getstream/chat/android/client/ChatClient;->stopTyping(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object v0

    invoke-interface {v0}, Lo23/d;->enqueue()V

    return-void
.end method

.method private final setMessageInputInternal(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;)V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_messageInput:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->dismissedLinkPreviewUrl:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->LinkPattern:Lyb3/p;

    invoke-virtual {v0, p1}, Lyb3/p;->a(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lyb3/n;->c()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->dismissedLinkPreviewUrl:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-static {v0, v2, v3}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    iput-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->dismissedLinkPreviewUrl:Ljava/lang/String;

    :cond_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_messageInput:Lec3/p1;

    new-instance v2, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;

    invoke-direct {v2, p1, p2}, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;-><init>(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;)V

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method private final setupComposerState()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getMessageMode()Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->fetchDraftMessage(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_messageInput:Lec3/p1;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V

    new-instance v3, Lec3/j1;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v4}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    const-wide/16 v0, 0x12c

    invoke-static {v3, v0, v1}, Lec3/v;->r(Lec3/l;J)Lec3/l;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$2;

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$2;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V

    new-instance v3, Lec3/j1;

    invoke-direct {v3, v0, v1, v4}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->scope:Lbc3/c0;

    invoke-static {v3, v0}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_messageActions:Lec3/p1;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$3;

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$3;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V

    new-instance v3, Lec3/j1;

    invoke-direct {v3, v0, v1, v4}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->scope:Lbc3/c0;

    invoke-static {v3, v0}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->ownCapabilities:Lec3/f2;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$4;

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$4;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V

    new-instance v3, Lec3/j1;

    invoke-direct {v3, v0, v1, v4}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->scope:Lbc3/c0;

    invoke-static {v3, v0}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->getClientState()Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object v0

    invoke-interface {v0}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$5;

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$5;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V

    new-instance v3, Lec3/j1;

    invoke-direct {v3, v0, v1, v4}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->scope:Lbc3/c0;

    invoke-static {v3, v0}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->audioRecordingController:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->getRecordingState()Lec3/p1;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$6;

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$6;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V

    new-instance v3, Lec3/j1;

    invoke-direct {v3, v0, v1, v4}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->scope:Lbc3/c0;

    invoke-static {v3, v0}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->config:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->getDraftMessageEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelDraftMessages:Lec3/f2;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$7;

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$7;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V

    new-instance v3, Lec3/j1;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v4}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->scope:Lbc3/c0;

    invoke-static {v3, v0}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->threadDraftMessages:Lec3/f2;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$8;

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$8;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V

    new-instance v2, Lec3/j1;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->scope:Lbc3/c0;

    invoke-static {v2, v0}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    :cond_0
    return-void
.end method

.method private final shouldSkipEnrichUrl(Lio/getstream/chat/android/models/Message;)Z
    .locals 2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getSkipEnrichUrl()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->dismissedLinkPreviewUrl:Ljava/lang/String;

    if-nez v0, :cond_1

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->LinkPattern:Lyb3/p;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "input"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lyb3/p;->w:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private final stashPreCommandState()V
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_messageInput:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;->getText()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Companion$CommandText;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Companion$CommandText;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Companion$CommandText;->isTrigger(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Companion$CommandText;->isAutoSelectTrigger(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    const-string v1, ""

    :cond_1
    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;

    new-instance v3, Ljava/util/LinkedHashMap;

    iget-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_selectedAttachments:Lec3/p1;

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    invoke-direct {v3, v4}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    iget-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_recordingAttachment:Lec3/p1;

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/models/Attachment;

    iget-object v5, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->selectedMentions:Ljava/util/Set;

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v5}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v5

    invoke-direct {v2, v1, v3, v4, v5}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;-><init>(Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/Attachment;Ljava/util/Set;)V

    iput-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->commandStash:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_selectedAttachments:Lec3/p1;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_recordingAttachment:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1, v3}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->selectedMentions:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    :cond_2
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    const v23, 0x2ffff

    const/16 v24, 0x0

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

    sget-object v21, Lm83/a0;->w:Lm83/a0;

    const/16 v22, 0x0

    invoke-static/range {v4 .. v24}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->syncAttachments()V

    return-void
.end method

.method private final suppressSuggestionsInEditMode()Z
    .locals 27

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->config:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->getActiveCommandEnabled()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getActiveAction()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    move-result-object v1

    instance-of v3, v1, Lio/getstream/chat/android/ui/common/state/messages/Edit;

    if-eqz v3, :cond_1

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/Edit;

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_2

    goto/16 :goto_1

    :cond_2
    sget-object v3, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Companion$CommandText;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Companion$CommandText;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getMessageText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Companion$CommandText;->isTrigger(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_1

    :cond_3
    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getMessageText()Ljava/lang/String;

    move-result-object v3

    const-string v4, "/"

    invoke-static {v3, v4}, Lyb3/r;->q0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->commands:Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    instance-of v5, v4, Ljava/util/Collection;

    if-eqz v5, :cond_4

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/models/Command;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Command;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_5

    iget-object v5, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    :cond_6
    move-object v2, v5

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    const v25, 0x3ffdf

    const/16 v26, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    sget-object v12, Lm83/y;->w:Lm83/y;

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

    invoke-static/range {v6 .. v26}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_events:Lec3/o1;

    new-instance v3, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerViewEvent$CommandUnavailable;

    invoke-direct {v3, v1}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerViewEvent$CommandUnavailable;-><init>(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V

    invoke-interface {v2, v3}, Lec3/o1;->a(Ljava/lang/Object;)Z

    const/4 v1, 0x1

    return v1

    :cond_7
    :goto_1
    return v2
.end method

.method private final syncAttachments()V
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    :cond_0
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    iget-object v5, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_editModeAttachments:Lec3/p1;

    check-cast v5, Lec3/h2;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    iget-object v6, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_selectedAttachments:Lec3/p1;

    check-cast v6, Lec3/h2;

    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/LinkedHashMap;

    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v6

    const-string v7, "<get-values>(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v6}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v5, v6}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v5

    iget-object v6, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_recordingAttachment:Lec3/p1;

    check-cast v6, Lec3/h2;

    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->L(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v5, v6}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v6

    const v23, 0x3fffd

    const/16 v24, 0x0

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

    const/16 v22, 0x0

    invoke-static/range {v4 .. v24}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->handleValidationErrors()V

    return-void
.end method

.method private final tryAutoSelectCommand(Ljava/lang/String;)Z
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->config:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->getActiveCommandEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    sget-object v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Companion$CommandText;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Companion$CommandText;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Companion$CommandText;->autoSelectName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->commands:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/Command;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Command;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    check-cast v2, Lio/getstream/chat/android/models/Command;

    if-nez v2, :cond_4

    return v1

    :cond_4
    invoke-virtual {p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->selectCommand(Lio/getstream/chat/android/models/Command;)V

    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final addAttachments(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;)V"
        }
    .end annotation

    const-string v0, "attachments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_selectedAttachments:Lec3/p1;

    :cond_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/LinkedHashMap;

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    move-object v3, p1

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v5}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerControllerKt;->access$attachmentKey(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v2, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->syncAttachments()V

    return-void
.end method

.method public final buildNewMessage(Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/models/Message;
    .locals 62
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;)",
            "Lio/getstream/chat/android/models/Message;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "message"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "attachments"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getActiveAction()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    move-result-object v3

    iget-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v4}, Lio/getstream/chat/android/client/ChatClient;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v5

    :goto_0
    iget-object v6, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->config:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->getActiveCommandEnabled()Z

    move-result v6

    if-eqz v6, :cond_2

    iget-object v6, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    check-cast v6, Lec3/h2;

    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getActiveCommand()Lio/getstream/chat/android/models/Command;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Command;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "/"

    const-string v8, " "

    invoke-static {v7, v6, v8, v1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v6

    :cond_2
    :goto_1
    invoke-static {v1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/messages/MessageAction;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    move-object v6, v1

    goto :goto_3

    :cond_4
    :goto_2
    new-instance v10, Lio/getstream/chat/android/models/Message;

    const v60, 0xffff

    const/16 v61, 0x0

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

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, -0x1

    invoke-direct/range {v10 .. v61}, Lio/getstream/chat/android/models/Message;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v10

    :goto_3
    instance-of v1, v3, Lio/getstream/chat/android/ui/common/state/messages/Reply;

    if-eqz v1, :cond_5

    check-cast v3, Lio/getstream/chat/android/ui/common/state/messages/Reply;

    goto :goto_4

    :cond_5
    move-object v3, v5

    :goto_4
    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/messages/Reply;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    move-object/from16 v37, v1

    goto :goto_5

    :cond_6
    move-object/from16 v37, v5

    :goto_5
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->selectedMentions:Ljava/util/Set;

    invoke-direct {v0, v1, v9}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->filterMentions(Ljava/util/Set;Ljava/lang/String;)Ljava/util/List;

    move-result-object v14

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getActiveAction()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    move-result-object v1

    instance-of v1, v1, Lio/getstream/chat/android/ui/common/state/messages/Edit;

    if-eqz v1, :cond_7

    invoke-static {v6, v4}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isModerationError(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_7

    move-object v1, v2

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v13

    const v56, 0xffff

    const/16 v57, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

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

    const/16 v55, -0xc5

    invoke-static/range {v6 .. v57}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    return-object v1

    :cond_7
    iget-object v8, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelCid:Ljava/lang/String;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getParentMessageId()Ljava/lang/String;

    move-result-object v11

    if-eqz v37, :cond_8

    invoke-virtual/range {v37 .. v37}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v5

    :cond_8
    move-object/from16 v38, v5

    move-object v1, v2

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v13

    new-instance v6, Lio/getstream/chat/android/models/Message;

    const v56, 0xffff

    const/16 v57, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

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

    const v55, 0x3fffff29    # 1.9999744f

    invoke-direct/range {v6 .. v57}, Lio/getstream/chat/android/models/Message;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public final cancelLinkPreview()V
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->logger:Lb23/k;

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    sget-object v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->LinkPattern:Lyb3/p;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getMessageText()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Lyb3/p;->a(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lyb3/n;->c()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v5

    :goto_0
    const-string v6, "[cancelLinkPreview] url: "

    invoke-static {v6, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v3, v4, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    sget-object v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->LinkPattern:Lyb3/p;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getMessageText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lyb3/p;->a(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lyb3/n;->c()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_2
    move-object v1, v5

    :goto_1
    iput-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->dismissedLinkPreviewUrl:Ljava/lang/String;

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->linkPreviewJob:Lbc3/k1;

    if-eqz v1, :cond_3

    invoke-interface {v1, v5}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_3
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    :cond_4
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    const v23, 0x3ffbf

    const/16 v24, 0x0

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

    invoke-static/range {v4 .. v24}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    return-void
.end method

.method public final cancelRecording()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->audioRecordingController:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->cancelRecording()V

    return-void
.end method

.method public final clearActiveCommand()V
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    :cond_0
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    const v23, 0x1ffff

    const/16 v24, 0x0

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

    invoke-static/range {v4 .. v24}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->restorePreCommandStateIfAny()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, ""

    sget-object v2, Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$Default;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$Default;

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->setMessageInputInternal(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;)V

    :cond_1
    return-void
.end method

.method public final clearAttachments()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_editModeAttachments:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-virtual {v0, v1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_selectedAttachments:Lec3/p1;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_recordingAttachment:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->syncAttachments()V

    return-void
.end method

.method public final clearData()V
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->logger:Lb23/k;

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->z:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const/4 v5, 0x0

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[clearData]"

    invoke-interface {v1, v3, v4, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->dismissMessageActions()V

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->scope:Lbc3/c0;

    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$clearData$2;

    invoke-direct {v2, v0, v5}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$clearData$2;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v1, v5, v5, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_messageInput:Lec3/p1;

    new-instance v2, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;

    invoke-direct {v2, v5, v5, v3, v5}, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;-><init>(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v5, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->clearAttachments()V

    iput-object v5, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->commandStash:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->clearActiveCommand()V

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->linkPreviewJob:Lbc3/k1;

    if-eqz v1, :cond_1

    invoke-interface {v1, v5}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    iput-object v5, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->dismissedLinkPreviewUrl:Ljava/lang/String;

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    :cond_2
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    const v23, 0x3fff7

    const/16 v24, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    sget-object v8, Lm83/y;->w:Lm83/y;

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

    invoke-static/range {v4 .. v24}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->isInThread()Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    :cond_3
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    const v23, 0x3fdff

    const/16 v24, 0x0

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

    invoke-static/range {v4 .. v24}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_4
    return-void
.end method

.method public final completeRecording(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$completeRecording$1;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$completeRecording$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final createPoll(Lio/getstream/chat/android/models/CreatePollParams;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/CreatePollParams;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "createPollParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/client/ChatClient;->sendPoll(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/CreatePollParams;)Lo23/d;

    move-result-object p1

    new-instance v0, Lcom/mapbox/common/location/a;

    const/4 v1, 0x6

    invoke-direct {v0, p2, v1}, Lcom/mapbox/common/location/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    check-cast p1, Lo23/h;

    invoke-virtual {p1, v0}, Lo23/h;->enqueue(Lo23/a;)V

    return-void
.end method

.method public final dismissMessageActions()V
    .locals 3

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getActiveAction()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    move-result-object v0

    instance-of v0, v0, Lio/getstream/chat/android/ui/common/state/messages/Edit;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, ""

    sget-object v2, Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$Default;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$Default;

    invoke-direct {p0, v0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->setMessageInputInternal(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_editModeMessage:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_editModeAttachments:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-virtual {v0, v1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->syncAttachments()V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_messageActions:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-virtual {v0, v1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final dismissSuggestionsPopup()V
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    :cond_0
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    const v23, 0x3ffcf

    const/16 v24, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    sget-object v9, Lm83/y;->w:Lm83/y;

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

    move-object v10, v9

    invoke-static/range {v4 .. v24}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void
.end method

.method public final getChannelState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->channelState:Lec3/f2;

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

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->events:Lec3/t1;

    return-object v0
.end method

.method public final getInputFocusEvents()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->inputFocusEvents:Lec3/t1;

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

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->messageActions:Lec3/f2;

    return-object v0
.end method

.method public final getMessageInput()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->messageInput:Lec3/f2;

    return-object v0
.end method

.method public final getState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->state:Lec3/f2;

    return-object v0
.end method

.method public final getTypingUpdatesBuffer()Lio/getstream/chat/android/ui/common/utils/typing/TypingUpdatesBuffer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->typingUpdatesBuffer:Lio/getstream/chat/android/ui/common/utils/typing/TypingUpdatesBuffer;

    return-object v0
.end method

.method public final holdRecording(Ll83/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/k;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->audioRecordingController:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->holdRecording(Ll83/k;)V

    return-void
.end method

.method public final leaveThread()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$Normal;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/MessageMode$Normal;

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->setMessageMode(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->dismissMessageActions()V

    return-void
.end method

.method public final lockRecording()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->audioRecordingController:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->lockRecording()V

    return-void
.end method

.method public final onCleared()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->typingUpdatesBuffer:Lio/getstream/chat/android/ui/common/utils/typing/TypingUpdatesBuffer;

    invoke-interface {v0}, Lio/getstream/chat/android/ui/common/utils/typing/TypingUpdatesBuffer;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->audioRecordingController:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->onCleared()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$onCleared$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$onCleared$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final pauseRecording()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->audioRecordingController:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->pauseRecording()V

    return-void
.end method

.method public final performMessageAction(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V
    .locals 6

    const-string v0, "messageAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getActiveCommand()Lio/getstream/chat/android/models/Command;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->config:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->getActiveCommandEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/CommandAvailabilityKt;->isAvailableFor(Lio/getstream/chat/android/models/Command;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_events:Lec3/o1;

    new-instance v1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerViewEvent$CancelCommandRequired;

    invoke-direct {v1, p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerViewEvent$CancelCommandRequired;-><init>(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V

    invoke-interface {v0, v1}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/messages/ThreadReply;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/ThreadReply;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/ThreadReply;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    const/4 v2, 0x2

    invoke-direct {v0, p1, v1, v2, v1}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/api/state/ThreadState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->setMessageMode(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)V

    return-void

    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/messages/Reply;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_messageActions:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    instance-of v5, v5, Lio/getstream/chat/android/ui/common/state/messages/Reply;

    if-nez v5, :cond_2

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {p1, v3}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_4
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/messages/Edit;

    if-eqz v0, :cond_6

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/Edit;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/Edit;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$Edit;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$Edit;

    invoke-direct {p0, v1, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->setMessageInputInternal(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_editModeMessage:Lec3/p1;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/Edit;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    check-cast v1, Lec3/h2;

    invoke-virtual {v1, v2}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_editModeAttachments:Lec3/p1;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/Edit;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_messageActions:Lec3/p1;

    :cond_5
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/Set;

    invoke-static {p1, v3}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->syncAttachments()V

    :cond_6
    return-void
.end method

.method public final removeAttachment(Lio/getstream/chat/android/models/Attachment;)V
    .locals 7

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerControllerKt;->access$attachmentKey(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_selectedAttachments:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v0}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_selectedAttachments:Lec3/p1;

    :cond_0
    move-object p1, v1

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/LinkedHashMap;

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v4, v0}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v2, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto/16 :goto_2

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_editModeAttachments:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/models/Attachment;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_editModeAttachments:Lec3/p1;

    :cond_4
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

    :cond_5
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {p1, v5}, Lio/getstream/chat/android/models/Attachment;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    invoke-virtual {v0, v2, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_7
    :goto_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_recordingAttachment:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_recordingAttachment:Lec3/p1;

    const/4 v0, 0x0

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_8
    :goto_2
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->syncAttachments()V

    return-void
.end method

.method public final removeAttachmentsByUris(Ljava/util/Set;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "uris"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_selectedAttachments:Lec3/p1;

    :cond_1
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/LinkedHashMap;

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    move-object v5, p1

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v3, v5}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    invoke-virtual {v1, v2, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->syncAttachments()V

    return-void
.end method

.method public final seekRecordingTo(F)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->audioRecordingController:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->seekRecordingTo(F)V

    return-void
.end method

.method public final selectCommand(Lio/getstream/chat/android/models/Command;)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "command"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getActiveAction()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    move-result-object v2

    iget-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->config:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->getActiveCommandEnabled()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/common/state/messages/composer/CommandAvailabilityKt;->isAvailableFor(Lio/getstream/chat/android/models/Command;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)Z

    move-result v3

    if-nez v3, :cond_1

    if-eqz v2, :cond_0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_events:Lec3/o1;

    new-instance v3, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerViewEvent$CommandUnavailable;

    invoke-direct {v3, v2}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerViewEvent$CommandUnavailable;-><init>(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V

    invoke-interface {v1, v3}, Lec3/o1;->a(Ljava/lang/Object;)Z

    :cond_0
    return-void

    :cond_1
    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->config:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->getActiveCommandEnabled()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->commandStash:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;

    if-nez v2, :cond_2

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->stashPreCommandState()V

    :cond_2
    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    :goto_0
    move-object v3, v2

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v1, v4

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    const v20, 0x1ffff

    const/16 v21, 0x0

    move-object v5, v2

    const/4 v2, 0x0

    move-object v6, v3

    const/4 v3, 0x0

    move-object v7, v4

    const/4 v4, 0x0

    move-object v8, v5

    const/4 v5, 0x0

    move-object v9, v6

    const/4 v6, 0x0

    move-object v10, v7

    const/4 v7, 0x0

    move-object v11, v8

    const/4 v8, 0x0

    move-object v12, v9

    const/4 v9, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    move-object v14, v11

    const/4 v11, 0x0

    move-object v15, v12

    const/4 v12, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v17, v14

    const/4 v14, 0x0

    move-object/from16 v18, v15

    const/4 v15, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v22, v17

    const/16 v17, 0x0

    move-object/from16 v23, v18

    const/16 v18, 0x0

    move-object/from16 v24, v19

    move-object/from16 v0, v23

    move-object/from16 v19, p1

    invoke-static/range {v1 .. v21}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v1

    move-object/from16 v7, v24

    invoke-virtual {v0, v7, v1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->config:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->getActiveCommandEnabled()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, ""

    goto :goto_1

    :cond_3
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Command;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "/"

    const-string v3, " "

    invoke-static {v2, v1, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_1
    sget-object v2, Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$CommandSelected;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$CommandSelected;

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->setMessageInputInternal(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_inputFocusEvents:Lec3/o1;

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v1, v2}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_4
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v22

    goto :goto_0
.end method

.method public final selectMention(Lio/getstream/chat/android/models/User;)V
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention$User;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention$User;-><init>(Lio/getstream/chat/android/models/User;)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->selectMention(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;)V

    return-void
.end method

.method public final selectMention(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "mention"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-interface {v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;->getDisplay()Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getMessageText()Ljava/lang/String;

    move-result-object v3

    .line 4
    const-string v4, "@"

    invoke-static {v3, v4, v3}, Lyb3/r;->K0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 5
    const-string v5, " "

    .line 6
    invoke-static {v3, v4, v2, v5}, Ldc/b;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 7
    sget-object v3, Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$MentionSelected;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$MentionSelected;

    invoke-direct {v0, v2, v3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->setMessageInputInternal(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;)V

    .line 8
    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->selectedMentions:Ljava/util/Set;

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 9
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    .line 10
    :cond_0
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 11
    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    .line 12
    iget-object v5, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->selectedMentions:Ljava/util/Set;

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v5}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v21

    const v23, 0x2ffff

    const/16 v24, 0x0

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

    const/16 v22, 0x0

    invoke-static/range {v4 .. v24}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v4

    .line 13
    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void
.end method

.method public final sendMessage(Lio/getstream/chat/android/models/Message;Lo23/a;Lc93/m;)V
    .locals 57
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lo23/a;",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    move-object/from16 v3, p0

    move-object/from16 v4, p2

    move-object/from16 v1, p3

    const-string v0, "message"

    move-object/from16 v5, p1

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v3, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->logger:Lb23/k;

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    sget-object v6, Lb23/g;->z:Lb23/g;

    iget-object v7, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v6, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const/4 v8, 0x0

    if-eqz v2, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const-string v9, "[sendMessage] message.attachments.size: "

    invoke-static {v2, v9}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v6, v7, v2, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {v5}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getActiveAction()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    move-result-object v2

    invoke-direct {v3, v0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->detectBlockingCommand(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerViewEvent;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, v3, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_events:Lec3/o1;

    invoke-interface {v1, v0}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_1
    invoke-direct {v3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getActiveAction()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/MessageAction;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    if-nez v0, :cond_3

    :cond_2
    move-object v0, v5

    :cond_3
    iget-object v2, v3, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/ChatClient;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_4
    move-object v2, v8

    :goto_0
    invoke-direct {v3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getActiveAction()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    move-result-object v7

    instance-of v7, v7, Lio/getstream/chat/android/ui/common/state/messages/Edit;

    if-eqz v7, :cond_7

    invoke-static {v0, v2}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isModerationError(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_7

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, v3, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->logger:Lb23/k;

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v6, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[sendMessage] No changes in the message, skipping edit."

    invoke-interface {v0, v6, v2, v1, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->clearData()V

    return-void

    :cond_6
    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->clearData()V

    invoke-direct/range {p0 .. p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->shouldSkipEnrichUrl(Lio/getstream/chat/android/models/Message;)Z

    move-result v44

    const v55, 0xffbf

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

    move-result-object v0

    invoke-direct {v3, v0, v4, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->enqueueEditMessage(Lio/getstream/chat/android/models/Message;Lo23/a;Lc93/m;)V

    return-void

    :cond_7
    invoke-static {v0, v2}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isModerationError(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Z

    move-result v2

    const/4 v5, 0x1

    if-eqz v2, :cond_8

    iget-object v2, v3, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0, v5}, Lio/getstream/chat/android/client/ChatClient;->deleteMessage(Ljava/lang/String;Z)Lo23/d;

    move-result-object v0

    invoke-interface {v0}, Lo23/d;->enqueue()V

    :cond_8
    invoke-direct {v3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->isInThread()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, v3, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getAlsoSendToChannel()Z

    move-result v0

    if-eqz v0, :cond_9

    :goto_1
    move/from16 v34, v5

    goto :goto_2

    :cond_9
    const/4 v5, 0x0

    goto :goto_1

    :goto_2
    invoke-direct/range {p0 .. p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->shouldSkipEnrichUrl(Lio/getstream/chat/android/models/Message;)Z

    move-result v44

    const v55, 0xffbf

    const/16 v56, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, v8

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

    const v54, -0x10000001

    move-object/from16 v5, p1

    invoke-static/range {v5 .. v56}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->clearData()V

    if-eqz v1, :cond_a

    iget-object v6, v3, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->scope:Lbc3/c0;

    move-object v5, v0

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;

    move-object v7, v5

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;-><init>(Lc93/m;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lo23/a;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {v6, v7, v7, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_a
    invoke-direct {v3, v2, v4}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->enqueueSendMessage(Lio/getstream/chat/android/models/Message;Lo23/a;)V

    return-void
.end method

.method public final sendRecording()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendRecording$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendRecording$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final setAlsoSendToChannel(Z)V
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    :cond_0
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    const v23, 0x3fdff

    const/16 v24, 0x0

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

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move/from16 v14, p1

    invoke-static/range {v4 .. v24}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void
.end method

.method public final setMessageInput(Ljava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$External;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$External;

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->setMessageInputInternal(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;)V

    return-void
.end method

.method public final setMessageMode(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)V
    .locals 5

    const-string v0, "messageMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getMessageMode()Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->isSameMessageMode(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->scope:Lbc3/c0;

    sget-object v2, Lbc3/d0;->z:Lbc3/d0;

    new-instance v3, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v0, p1, v4}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lio/getstream/chat/android/ui/common/state/messages/MessageMode;Lio/getstream/chat/android/ui/common/state/messages/MessageMode;Lq83/d;)V

    const/4 p1, 0x1

    invoke-static {v1, v4, v2, v3, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final setTypingUpdatesBuffer(Lio/getstream/chat/android/ui/common/utils/typing/TypingUpdatesBuffer;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->typingUpdatesBuffer:Lio/getstream/chat/android/ui/common/utils/typing/TypingUpdatesBuffer;

    return-void
.end method

.method public final startRecording()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$startRecording$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$startRecording$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final stopRecording()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$stopRecording$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$stopRecording$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final toggleCommandsVisibility()V
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->_state:Lec3/p1;

    :cond_0
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getCommandSuggestions()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v5, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->commands:Ljava/util/List;

    invoke-direct {v0, v5}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->orderedForComposer(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    :goto_0
    move-object v10, v5

    goto :goto_1

    :cond_1
    sget-object v5, Lm83/y;->w:Lm83/y;

    goto :goto_0

    :goto_1
    const v23, 0x3ffdf

    const/16 v24, 0x0

    const/4 v5, 0x0

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

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v4 .. v24}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void
.end method

.method public final toggleRecordingPlayback()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->audioRecordingController:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->toggleRecordingPlayback()V

    return-void
.end method
