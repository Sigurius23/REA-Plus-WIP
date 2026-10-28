.class public final Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/channel/state/ChannelState;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u001e\n\u0002\u0008+\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010%\n\u0002\u0008&\n\u0002\u0018\u0002\n\u0002\u0008/\n\u0002\u0010\"\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \u0088\u00022\u00020\u0001:\u0002\u0088\u0002Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00080\u0005\u0012\u0012\u0010\u000c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0\u0005\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u001f\u0010\u001bJ\u0015\u0010 \u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008 \u0010\u001bJ\u0015\u0010\"\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\"\u0010\u001bJ\u0015\u0010$\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0017\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u0015\u0010\'\u001a\u00020\u00192\u0006\u0010&\u001a\u00020%\u00a2\u0006\u0004\u0008\'\u0010(J%\u0010+\u001a\u00020\u00192\u0016\u0010*\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0006\u0012\u0004\u0018\u00010%0)\u00a2\u0006\u0004\u0008+\u0010,J\u0017\u0010/\u001a\u00020\u00192\u0008\u0010.\u001a\u0004\u0018\u00010-\u00a2\u0006\u0004\u0008/\u00100J\u0015\u00102\u001a\u00020\u00192\u0006\u00101\u001a\u00020\r\u00a2\u0006\u0004\u00082\u00103J\u0015\u00105\u001a\u00020\u00192\u0006\u00104\u001a\u00020\u0017\u00a2\u0006\u0004\u00085\u0010\u001bJ\u0015\u00108\u001a\u00020\u00192\u0006\u00107\u001a\u000206\u00a2\u0006\u0004\u00088\u00109J\u001d\u0010<\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u0002\u00a2\u0006\u0004\u0008<\u0010=J\u0015\u0010@\u001a\u00020\u00192\u0006\u0010?\u001a\u00020>\u00a2\u0006\u0004\u0008@\u0010AJ\u001b\u0010D\u001a\u00020\u00192\u000c\u0010C\u001a\u0008\u0012\u0004\u0012\u00020B0\n\u00a2\u0006\u0004\u0008D\u0010EJ#\u0010G\u001a\u00020\u00192\u000c\u0010C\u001a\u0008\u0012\u0004\u0012\u00020B0\n2\u0006\u0010F\u001a\u00020\r\u00a2\u0006\u0004\u0008G\u0010HJ\u0015\u0010J\u001a\u00020\u00192\u0006\u0010I\u001a\u00020B\u00a2\u0006\u0004\u0008J\u0010KJ\u0015\u0010L\u001a\u00020\u00192\u0006\u0010I\u001a\u00020B\u00a2\u0006\u0004\u0008L\u0010KJ\u001f\u0010Q\u001a\u00020\u00192\u0006\u0010M\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\rH\u0000\u00a2\u0006\u0004\u0008O\u0010PJ\u0015\u0010S\u001a\u00020\u00192\u0006\u0010R\u001a\u00020-\u00a2\u0006\u0004\u0008S\u00100J\u001b\u0010U\u001a\u00020\u00192\u000c\u0010T\u001a\u0008\u0012\u0004\u0012\u00020-0\n\u00a2\u0006\u0004\u0008U\u0010EJ\u0015\u0010V\u001a\u00020\u00192\u0006\u0010R\u001a\u00020-\u00a2\u0006\u0004\u0008V\u00100J#\u0010X\u001a\u00020\u00192\u000c\u0010W\u001a\u0008\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010N\u001a\u00020\r\u00a2\u0006\u0004\u0008X\u0010HJ#\u0010Y\u001a\u00020\u00192\u000c\u0010W\u001a\u0008\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010N\u001a\u00020\r\u00a2\u0006\u0004\u0008Y\u0010HJ\u0015\u0010Z\u001a\u00020\u00192\u0006\u0010R\u001a\u00020-\u00a2\u0006\u0004\u0008Z\u00100J\u0015\u0010[\u001a\u00020\u00192\u0006\u0010M\u001a\u00020\u0006\u00a2\u0006\u0004\u0008[\u0010\\J\u001b\u0010_\u001a\u00020\u00192\u000c\u0010^\u001a\u0008\u0012\u0004\u0012\u00020]0\n\u00a2\u0006\u0004\u0008_\u0010EJ\u0015\u0010a\u001a\u00020\u00192\u0006\u0010`\u001a\u00020]\u00a2\u0006\u0004\u0008a\u0010bJ\r\u0010c\u001a\u00020\u0017\u00a2\u0006\u0004\u0008c\u0010dJ\u0015\u0010g\u001a\u00020\u00192\u0006\u0010f\u001a\u00020e\u00a2\u0006\u0004\u0008g\u0010hJ\u001b\u0010k\u001a\u00020\u00192\u000c\u0010j\u001a\u0008\u0012\u0004\u0012\u00020-0i\u00a2\u0006\u0004\u0008k\u0010lJ\u001b\u0010m\u001a\u00020\u00192\u000c\u0010T\u001a\u0008\u0012\u0004\u0012\u00020-0\n\u00a2\u0006\u0004\u0008m\u0010EJ\u001b\u0010n\u001a\u00020\u00192\u000c\u0010T\u001a\u0008\u0012\u0004\u0012\u00020-0\n\u00a2\u0006\u0004\u0008n\u0010EJ\u001b\u0010o\u001a\u00020\u00192\u000c\u0010T\u001a\u0008\u0012\u0004\u0012\u00020-0i\u00a2\u0006\u0004\u0008o\u0010lJ!\u0010p\u001a\u00020\u00192\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-0\u0008\u00a2\u0006\u0004\u0008p\u0010qJ\u000f\u0010t\u001a\u00020\u0019H\u0000\u00a2\u0006\u0004\u0008r\u0010sJ\u001b\u0010v\u001a\u0008\u0012\u0004\u0012\u00020-0\n2\u0006\u0010u\u001a\u00020\u0002\u00a2\u0006\u0004\u0008v\u0010wJ\u0019\u0010y\u001a\u0004\u0018\u00010-2\u0006\u0010x\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008y\u0010zJ\u000f\u0010|\u001a\u00020\u0019H\u0000\u00a2\u0006\u0004\u0008{\u0010sJE\u0010~\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020-0\n0\u00052\u0012\u0010T\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020-0i0\u00052\u0014\u0008\u0002\u0010}\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00170)H\u0002\u00a2\u0006\u0004\u0008~\u0010\u007fJ\u001f\u0010\u0080\u0001\u001a\u00020\u00192\u000c\u0010T\u001a\u0008\u0012\u0004\u0012\u00020-0\nH\u0002\u00a2\u0006\u0005\u0008\u0080\u0001\u0010EJ?\u0010\u0082\u0001\u001a\u00020\u00192+\u0010\u0081\u0001\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-0\u0008\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-0\u00080)H\u0082\u0008\u00a2\u0006\u0005\u0008\u0082\u0001\u0010,J\u001a\u0010\u0083\u0001\u001a\u00020\u00172\u0006\u0010R\u001a\u00020-H\u0002\u00a2\u0006\u0006\u0008\u0083\u0001\u0010\u0084\u0001J\u0011\u0010\u0085\u0001\u001a\u00020\u0019H\u0002\u00a2\u0006\u0005\u0008\u0085\u0001\u0010sJ&\u0010\u0086\u0001\u001a\u0008\u0012\u0004\u0012\u00020-0i2\u000c\u0010T\u001a\u0008\u0012\u0004\u0012\u00020-0iH\u0002\u00a2\u0006\u0006\u0008\u0086\u0001\u0010\u0087\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008\u0003\u0010\u0088\u0001\u001a\u0006\u0008\u0089\u0001\u0010\u008a\u0001R\u001d\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008\u0004\u0010\u0088\u0001\u001a\u0006\u0008\u008b\u0001\u0010\u008a\u0001R\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0007\u0010\u008c\u0001R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000f\n\u0005\u0008\u000e\u0010\u008d\u0001\u001a\u0006\u0008\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0011\u0010\u0090\u0001R\u001f\u0010\u0091\u0001\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0091\u0001\u0010\u0088\u0001\u001a\u0006\u0008\u0092\u0001\u0010\u008a\u0001R\u0017\u0010\u0093\u0001\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0093\u0001\u0010\u0094\u0001R!\u0010\u009a\u0001\u001a\u00030\u0095\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u0096\u0001\u0010\u0097\u0001\u001a\u0006\u0008\u0098\u0001\u0010\u0099\u0001R\u001b\u0010\u009b\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u009b\u0001\u0010\u008d\u0001R.\u0010\u009d\u0001\u001a\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-0\u0008\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u009d\u0001\u0010\u009e\u0001R.\u0010\u009f\u0001\u001a\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-0\u0008\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u009f\u0001\u0010\u009e\u0001R\"\u0010\u00a0\u0001\u001a\u000b\u0012\u0004\u0012\u00020>\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a0\u0001\u0010\u009e\u0001R.\u0010\u00a1\u0001\u001a\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020]0\u0008\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a1\u0001\u0010\u009e\u0001R+\u0010\u00a2\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020]0\u00080\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a2\u0001\u0010\u008c\u0001R.\u0010\u00a3\u0001\u001a\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020B0\u0008\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a3\u0001\u0010\u009e\u0001R.\u0010\u00a4\u0001\u001a\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0008\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a4\u0001\u0010\u009e\u0001R\"\u0010\u00a5\u0001\u001a\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a5\u0001\u0010\u009e\u0001R\"\u0010\u00a6\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a6\u0001\u0010\u009e\u0001R\"\u0010\u00a7\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a7\u0001\u0010\u009e\u0001R\"\u0010\u00a8\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a8\u0001\u0010\u009e\u0001R\"\u0010\u00a9\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a9\u0001\u0010\u009e\u0001R\"\u0010\u00aa\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00aa\u0001\u0010\u009e\u0001R$\u0010\u00ab\u0001\u001a\r\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ab\u0001\u0010\u009e\u0001R$\u0010\u00ac\u0001\u001a\r\u0012\u0006\u0012\u0004\u0018\u00010-\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ac\u0001\u0010\u009e\u0001R5\u0010\u00ae\u0001\u001a\u001e\u0012\u0017\u0012\u0015\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\n0\u00ad\u0001\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ae\u0001\u0010\u009e\u0001R\"\u0010\u00af\u0001\u001a\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00af\u0001\u0010\u009e\u0001R\"\u0010\u00b0\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00b0\u0001\u0010\u009e\u0001R\"\u0010\u00b1\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00b1\u0001\u0010\u009e\u0001R\"\u0010\u00b2\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00b2\u0001\u0010\u009e\u0001R\"\u0010\u00b3\u0001\u001a\u000b\u0012\u0004\u0012\u000206\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00b3\u0001\u0010\u009e\u0001R%\u0010\u00b4\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00b4\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u00b5\u0001\u0010\u00b6\u0001R%\u0010\u00b7\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00b7\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u00b8\u0001\u0010\u00b6\u0001R%\u0010\u00b9\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00b9\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u00ba\u0001\u0010\u00b6\u0001R%\u0010\u00bb\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00bb\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u00bc\u0001\u0010\u00b6\u0001R%\u0010\u00bd\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00bd\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u00be\u0001\u0010\u00b6\u0001R%\u0010\u00bf\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00bf\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u00c0\u0001\u0010\u00b6\u0001R%\u0010\u00c1\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00c1\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u00c2\u0001\u0010\u00b6\u0001R\'\u0010\u00c3\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00c3\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u00c4\u0001\u0010\u00b6\u0001R)\u0010\u000c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0\u00058\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008\u000c\u0010\u008c\u0001\u001a\u0006\u0008\u00c5\u0001\u0010\u00b6\u0001R*\u0010\u00c6\u0001\u001a\u0004\u0018\u00010e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0006\u0008\u00c6\u0001\u0010\u00c7\u0001\u001a\u0006\u0008\u00c8\u0001\u0010\u00c9\u0001\"\u0005\u0008\u00ca\u0001\u0010hR2\u0010\u00cb\u0001\u001a\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-0\u00080\u009c\u00018\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00cb\u0001\u0010\u009e\u0001\u001a\u0006\u0008\u00cc\u0001\u0010\u00cd\u0001R(\u0010\u00ce\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020-0\n0\u00058\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00ce\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u00cf\u0001\u0010\u00b6\u0001R(\u0010\u00d0\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020-0\n0\u00058\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00d0\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u00d1\u0001\u0010\u00b6\u0001R#\u0010\u00d2\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020-0\n0\u00058\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d2\u0001\u0010\u008c\u0001R#\u0010\u00d3\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020-0\n0\u00058\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d3\u0001\u0010\u008c\u0001R&\u0010\u00d5\u0001\u001a\t\u0012\u0005\u0012\u00030\u00d4\u00010\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00d5\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u00d6\u0001\u0010\u00b6\u0001R*\u0010\u00d7\u0001\u001a\u0004\u0018\u00010e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0006\u0008\u00d7\u0001\u0010\u00c7\u0001\u001a\u0006\u0008\u00d8\u0001\u0010\u00c9\u0001\"\u0005\u0008\u00d9\u0001\u0010hR+\u0010\u00da\u0001\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00da\u0001\u0010\u0088\u0001\u001a\u0006\u0008\u00db\u0001\u0010\u008a\u0001\"\u0006\u0008\u00dc\u0001\u0010\u00dd\u0001R1\u0010\u00de\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-0\u00080\u00058\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00de\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u00df\u0001\u0010\u00b6\u0001R1\u0010\u00e0\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-0\u00080\u00058\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00e0\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u00e1\u0001\u0010\u00b6\u0001R(\u0010\u00e2\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020-0\n0\u00058\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00e2\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u00e3\u0001\u0010\u00b6\u0001R(\u0010\u00e4\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020-0\n0\u00058\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00e4\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u00e5\u0001\u0010\u00b6\u0001R%\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u00058\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008.\u0010\u008c\u0001\u001a\u0006\u0008\u00e6\u0001\u0010\u00b6\u0001R7\u0010\u00e7\u0001\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\n0\u00080\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00e7\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u00e8\u0001\u0010\u00b6\u0001R#\u00107\u001a\u0008\u0012\u0004\u0012\u0002060\u00058\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u00087\u0010\u008c\u0001\u001a\u0006\u0008\u00e9\u0001\u0010\u00b6\u0001R)\u0010T\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020-0\n0\u00058\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008T\u0010\u008c\u0001\u001a\u0006\u0008\u00ea\u0001\u0010\u00b6\u0001R+\u0010\u00eb\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020-0\n0\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00eb\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u00ec\u0001\u0010\u00b6\u0001R%\u0010\u00ed\u0001\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00ed\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u00ee\u0001\u0010\u00b6\u0001R)\u0010W\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\n0\u00058\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008W\u0010\u008c\u0001\u001a\u0006\u0008\u00ef\u0001\u0010\u00b6\u0001R%\u0010\u00f0\u0001\u001a\u0008\u0012\u0004\u0012\u00020>0\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00f0\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u00f1\u0001\u0010\u00b6\u0001R)\u0010^\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020]0\n0\u00058\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008^\u0010\u008c\u0001\u001a\u0006\u0008\u00f2\u0001\u0010\u00b6\u0001R%\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0\u00058\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008`\u0010\u008c\u0001\u001a\u0006\u0008\u00f3\u0001\u0010\u00b6\u0001R%\u0010\u00f4\u0001\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00f4\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u00f5\u0001\u0010\u00b6\u0001R)\u0010C\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020B0\n0\u00058\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008C\u0010\u008c\u0001\u001a\u0006\u0008\u00f6\u0001\u0010\u00b6\u0001R#\u0010F\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00058\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008F\u0010\u008c\u0001\u001a\u0006\u0008\u00f7\u0001\u0010\u00b6\u0001R#\u0010&\u001a\u0008\u0012\u0004\u0012\u00020%0\u00058\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008&\u0010\u008c\u0001\u001a\u0006\u0008\u00f8\u0001\u0010\u00b6\u0001R\'\u0010\u00f9\u0001\u001a\u00020\u00178\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0016\n\u0006\u0008\u00f9\u0001\u0010\u00fa\u0001\u001a\u0005\u0008\u00fb\u0001\u0010d\"\u0005\u0008\u00fc\u0001\u0010\u001bR%\u0010\u00fd\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00fd\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u00fe\u0001\u0010\u00b6\u0001R\'\u0010\u00ff\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010e0\u00058\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00ff\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u0080\u0002\u0010\u00b6\u0001R \u0010\u0083\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-0\u00088F\u00a2\u0006\u0008\u001a\u0006\u0008\u0081\u0002\u0010\u0082\u0002R\u001e\u0010\u0087\u0002\u001a\t\u0012\u0004\u0012\u00020\u00020\u0084\u00028BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0085\u0002\u0010\u0086\u0002\u00a8\u0006\u0089\u0002"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;",
        "Lio/getstream/chat/android/client/channel/state/ChannelState;",
        "",
        "channelType",
        "channelId",
        "Lec3/f2;",
        "Lio/getstream/chat/android/models/User;",
        "userFlow",
        "",
        "latestUsers",
        "",
        "Lio/getstream/chat/android/models/Location;",
        "activeLiveLocations",
        "",
        "baseMessageLimit",
        "Lkotlin/Function0;",
        "",
        "now",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lec3/f2;Lec3/f2;Lec3/f2;Ljava/lang/Integer;Lc93/a;)V",
        "Lio/getstream/chat/android/models/Channel;",
        "toChannel",
        "()Lio/getstream/chat/android/models/Channel;",
        "",
        "isLoading",
        "Ll83/a0;",
        "setLoadingOlderMessages",
        "(Z)V",
        "setLoadingNewerMessages",
        "isEnd",
        "setEndOfNewerMessages",
        "setEndOfOlderMessages",
        "setLoading",
        "isHidden",
        "setHidden",
        "isMuted",
        "setMuted",
        "Lio/getstream/chat/android/models/ChannelData;",
        "channelData",
        "setChannelData",
        "(Lio/getstream/chat/android/models/ChannelData;)V",
        "Lkotlin/Function1;",
        "update",
        "updateChannelData",
        "(Lkotlin/jvm/functions/Function1;)V",
        "Lio/getstream/chat/android/models/Message;",
        "repliedMessage",
        "setRepliedMessage",
        "(Lio/getstream/chat/android/models/Message;)V",
        "count",
        "setMembersCount",
        "(I)V",
        "isInsideSearch",
        "setInsideSearch",
        "Lio/getstream/chat/android/models/Config;",
        "channelConfig",
        "setChannelConfig",
        "(Lio/getstream/chat/android/models/Config;)V",
        "quotedMessageId",
        "quotingMessageId",
        "addQuotedMessage",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "Lio/getstream/chat/android/models/TypingEvent;",
        "typingEvent",
        "updateTypingEvent",
        "(Lio/getstream/chat/android/models/TypingEvent;)V",
        "Lio/getstream/chat/android/models/Member;",
        "members",
        "upsertMembers",
        "(Ljava/util/List;)V",
        "membersCount",
        "setMembers",
        "(Ljava/util/List;I)V",
        "member",
        "addMember",
        "(Lio/getstream/chat/android/models/Member;)V",
        "deleteMember",
        "user",
        "watchersCount",
        "deleteWatcher$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/models/User;I)V",
        "deleteWatcher",
        "message",
        "deleteMessage",
        "messages",
        "deleteMessages",
        "deletePinnedMessage",
        "watchers",
        "upsertWatchers",
        "setWatchers",
        "upsertMessage",
        "upsertUserPresence",
        "(Lio/getstream/chat/android/models/User;)V",
        "Lio/getstream/chat/android/models/ChannelUserRead;",
        "reads",
        "upsertReads",
        "read",
        "upsertDelivered",
        "(Lio/getstream/chat/android/models/ChannelUserRead;)V",
        "markChannelAsRead",
        "()Z",
        "Ljava/util/Date;",
        "date",
        "removeMessagesBefore",
        "(Ljava/util/Date;)V",
        "",
        "updatedMessages",
        "upsertMessages",
        "(Ljava/util/Collection;)V",
        "setMessages",
        "setPinnedMessages",
        "upsertPinnedMessages",
        "updateCachedLatestMessages",
        "(Ljava/util/Map;)V",
        "resetMessageLimit$stream_chat_android_client_release",
        "()V",
        "resetMessageLimit",
        "userId",
        "getMessagesFromUser",
        "(Ljava/lang/String;)Ljava/util/List;",
        "id",
        "getMessageById",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;",
        "destroy$stream_chat_android_client_release",
        "destroy",
        "extraPredicate",
        "messagesTransformation",
        "(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;",
        "deletePinnedMessages",
        "producer",
        "setPinned",
        "isMessageVisible",
        "(Lio/getstream/chat/android/models/Message;)Z",
        "cacheLatestMessages",
        "applyMessageLimitIfNeeded",
        "(Ljava/util/Collection;)Ljava/util/Collection;",
        "Ljava/lang/String;",
        "getChannelType",
        "()Ljava/lang/String;",
        "getChannelId",
        "Lec3/f2;",
        "Ljava/lang/Integer;",
        "getBaseMessageLimit",
        "()Ljava/lang/Integer;",
        "Lc93/a;",
        "cid",
        "getCid",
        "seq",
        "I",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "messageLimit",
        "Lec3/p1;",
        "_messages",
        "Lec3/p1;",
        "_pinnedMessages",
        "_typing",
        "_rawReads",
        "rawReads",
        "_members",
        "_watchers",
        "_watcherCount",
        "_endOfNewerMessages",
        "_endOfOlderMessages",
        "_loading",
        "_hidden",
        "_muted",
        "_channelData",
        "_repliedMessage",
        "",
        "_quotedMessagesMap",
        "_membersCount",
        "_insideSearch",
        "_loadingOlderMessages",
        "_loadingNewerMessages",
        "_channelConfig",
        "hidden",
        "getHidden",
        "()Lec3/f2;",
        "muted",
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
        "messageCount",
        "getMessageCount",
        "getActiveLiveLocations",
        "hideMessagesBefore",
        "Ljava/util/Date;",
        "getHideMessagesBefore",
        "()Ljava/util/Date;",
        "setHideMessagesBefore",
        "cachedLatestMessages",
        "getCachedLatestMessages$stream_chat_android_client_release",
        "()Lec3/p1;",
        "messageList",
        "getMessageList",
        "pinnedMessagesList",
        "getPinnedMessagesList",
        "sortedVisibleMessages",
        "sortedVisiblePinnedMessages",
        "Lio/getstream/chat/android/models/MessagesState;",
        "messagesState",
        "getMessagesState",
        "lastStartTypingEvent",
        "getLastStartTypingEvent",
        "setLastStartTypingEvent",
        "keystrokeParentMessageId",
        "getKeystrokeParentMessageId$stream_chat_android_client_release",
        "setKeystrokeParentMessageId$stream_chat_android_client_release",
        "(Ljava/lang/String;)V",
        "visibleMessages",
        "getVisibleMessages$stream_chat_android_client_release",
        "visiblePinnedMessages",
        "getVisiblePinnedMessages$stream_chat_android_client_release",
        "sortedMessages",
        "getSortedMessages",
        "sortedPinnedMessages",
        "getSortedPinnedMessages",
        "getRepliedMessage",
        "quotedMessagesMap",
        "getQuotedMessagesMap",
        "getChannelConfig",
        "getMessages",
        "pinnedMessages",
        "getPinnedMessages",
        "watcherCount",
        "getWatcherCount",
        "getWatchers",
        "typing",
        "getTyping",
        "getReads",
        "getRead",
        "unreadCount",
        "getUnreadCount",
        "getMembers",
        "getMembersCount",
        "getChannelData",
        "recoveryNeeded",
        "Z",
        "getRecoveryNeeded",
        "setRecoveryNeeded",
        "insideSearch",
        "getInsideSearch",
        "lastSentMessageDate",
        "getLastSentMessageDate",
        "getRawPinnedMessages",
        "()Ljava/util/Map;",
        "rawPinnedMessages",
        "",
        "getDeletedMessagesIds",
        "()Ljava/util/Set;",
        "deletedMessagesIds",
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
.field private static final Companion:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl$Companion;

.field private static final LIMIT_MULTIPLIER:D = 1.5

.field private static final NEUTRAL_MULTIPLIER:D = 1.0

.field private static final TRIM_BUFFER:I = 0x1e

.field private static final seqGenerator:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private _channelConfig:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _channelData:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _endOfNewerMessages:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _endOfOlderMessages:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _hidden:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _insideSearch:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _loading:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _loadingNewerMessages:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _loadingOlderMessages:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _members:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _membersCount:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _messages:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _muted:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _pinnedMessages:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _quotedMessagesMap:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _rawReads:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _repliedMessage:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _typing:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _watcherCount:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _watchers:Lec3/p1;
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

.field private final baseMessageLimit:Ljava/lang/Integer;

.field private final cachedLatestMessages:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

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

.field private hideMessagesBefore:Ljava/util/Date;

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

.field private messageLimit:Ljava/lang/Integer;

.field private final messageList:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

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

.field private final muted:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final now:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
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

.field private final pinnedMessagesList:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
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

.field private rawReads:Lec3/f2;
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

.field private recoveryNeeded:Z

.field private final repliedMessage:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final seq:I

.field private final sortedMessages:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final sortedPinnedMessages:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final sortedVisibleMessages:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final sortedVisiblePinnedMessages:Lec3/f2;
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

.field private final userFlow:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final visibleMessages:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final visiblePinnedMessages:Lec3/f2;
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

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->Companion:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl$Companion;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->seqGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lec3/f2;Lec3/f2;Lec3/f2;Ljava/lang/Integer;Lc93/a;)V
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lec3/f2;",
            "Lec3/f2;",
            "Lec3/f2;",
            "Ljava/lang/Integer;",
            "Lc93/a;",
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

    const-string v8, "channelType"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "channelId"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "userFlow"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "latestUsers"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "activeLiveLocations"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "now"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->channelType:Ljava/lang/String;

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->channelId:Ljava/lang/String;

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->userFlow:Lec3/f2;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->baseMessageLimit:Ljava/lang/Integer;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->now:Lc93/a;

    filled-new-array/range {p1 .. p2}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v7, 0x2

    invoke-static {v1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v8, "%s:%s"

    invoke-static {v8, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->cid:Ljava/lang/String;

    sget-object v1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->seqGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v1

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->seq:I

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Chat:ChannelState-"

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->logger$delegate:Ll83/h;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messageLimit:Ljava/lang/Integer;

    sget-object v1, Lm83/z;->w:Lm83/z;

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v6

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_messages:Lec3/p1;

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v6

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_pinnedMessages:Lec3/p1;

    new-instance v6, Lio/getstream/chat/android/models/TypingEvent;

    sget-object v8, Lm83/y;->w:Lm83/y;

    invoke-direct {v6, v2, v8}, Lio/getstream/chat/android/models/TypingEvent;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-static {v6}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_typing:Lec3/p1;

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_rawReads:Lec3/p1;

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->rawReads:Lec3/f2;

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_members:Lec3/p1;

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_watchers:Lec3/p1;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v6

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_watcherCount:Lec3/p1;

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v6

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_endOfNewerMessages:Lec3/p1;

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v6}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v8

    iput-object v8, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_endOfOlderMessages:Lec3/p1;

    invoke-static {v6}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v8

    iput-object v8, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_loading:Lec3/p1;

    invoke-static {v6}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v8

    iput-object v8, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_hidden:Lec3/p1;

    invoke-static {v6}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v8

    iput-object v8, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_muted:Lec3/p1;

    const/4 v8, 0x0

    invoke-static {v8}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v9

    iput-object v9, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_channelData:Lec3/p1;

    invoke-static {v8}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v9

    iput-object v9, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_repliedMessage:Lec3/p1;

    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {v9}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v9

    iput-object v9, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_quotedMessagesMap:Lec3/p1;

    invoke-static {v2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_membersCount:Lec3/p1;

    invoke-static {v6}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_insideSearch:Lec3/p1;

    invoke-static {v6}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_loadingOlderMessages:Lec3/p1;

    invoke-static {v6}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_loadingNewerMessages:Lec3/p1;

    new-instance v9, Lio/getstream/chat/android/models/Config;

    const v36, 0x3ffffff

    const/16 v37, 0x0

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

    invoke-direct/range {v9 .. v37}, Lio/getstream/chat/android/models/Config;-><init>(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZZZZZZZZZZZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v9}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_channelConfig:Lec3/p1;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_hidden:Lec3/p1;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->hidden:Lec3/f2;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_muted:Lec3/p1;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->muted:Lec3/f2;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_loading:Lec3/p1;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->loading:Lec3/f2;

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_loadingOlderMessages:Lec3/p1;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->loadingOlderMessages:Lec3/f2;

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_loadingNewerMessages:Lec3/p1;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->loadingNewerMessages:Lec3/f2;

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_endOfOlderMessages:Lec3/p1;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->endOfOlderMessages:Lec3/f2;

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_endOfNewerMessages:Lec3/p1;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->endOfNewerMessages:Lec3/f2;

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_channelData:Lec3/p1;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v9, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/4 v10, 0x4

    invoke-direct {v9, v10}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    invoke-static {v6, v9}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->mapState(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object v6

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messageCount:Lec3/f2;

    new-instance v6, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/e;

    const/4 v9, 0x0

    invoke-direct {v6, v0, v9}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/e;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;I)V

    invoke-static {v5, v6}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->mapState(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->activeLiveLocations:Lec3/f2;

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->cachedLatestMessages:Lec3/p1;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_messages:Lec3/p1;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v5, Lio/getstream/chat/android/client/api2/d;

    const/16 v6, 0xe

    invoke-direct {v5, v6}, Lio/getstream/chat/android/client/api2/d;-><init>(I)V

    invoke-static {v1, v4, v5}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->combineStates(Lec3/f2;Lec3/f2;Lc93/m;)Lec3/f2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messageList:Lec3/f2;

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_pinnedMessages:Lec3/p1;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v6, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/d;

    const/4 v9, 0x1

    invoke-direct {v6, v0, v9}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/d;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;I)V

    invoke-static {v5, v4, v6}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->combineStates(Lec3/f2;Lec3/f2;Lc93/m;)Lec3/f2;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->pinnedMessagesList:Lec3/f2;

    invoke-static {v0, v1, v8, v7, v8}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messagesTransformation$default(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Lec3/f2;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lec3/f2;

    move-result-object v6

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->sortedVisibleMessages:Lec3/f2;

    new-instance v7, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/e;

    const/4 v8, 0x1

    invoke-direct {v7, v0, v8}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/e;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;I)V

    invoke-direct {v0, v5, v7}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messagesTransformation(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object v7

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->sortedVisiblePinnedMessages:Lec3/f2;

    new-instance v8, Lio/getstream/chat/android/client/api2/d;

    const/16 v9, 0xf

    invoke-direct {v8, v9}, Lio/getstream/chat/android/client/api2/d;-><init>(I)V

    invoke-static {v2, v6, v8}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->combineStates(Lec3/f2;Lec3/f2;Lc93/m;)Lec3/f2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messagesState:Lec3/f2;

    new-instance v2, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/e;

    const/4 v8, 0x2

    invoke-direct {v2, v0, v8}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/e;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;I)V

    invoke-static {v1, v2}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->mapState(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->visibleMessages:Lec3/f2;

    new-instance v2, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/e;

    const/4 v8, 0x3

    invoke-direct {v2, v0, v8}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/e;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;I)V

    invoke-static {v5, v2}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->mapState(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->visiblePinnedMessages:Lec3/f2;

    new-instance v5, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/4 v8, 0x2

    invoke-direct {v5, v8}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    invoke-static {v1, v5}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->mapState(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->sortedMessages:Lec3/f2;

    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/4 v5, 0x3

    invoke-direct {v1, v5}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    invoke-static {v2, v1}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->mapState(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->sortedPinnedMessages:Lec3/f2;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_repliedMessage:Lec3/p1;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->repliedMessage:Lec3/f2;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_quotedMessagesMap:Lec3/p1;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->quotedMessagesMap:Lec3/f2;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_channelConfig:Lec3/p1;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->channelConfig:Lec3/f2;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messages:Lec3/f2;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->pinnedMessages:Lec3/f2;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_watcherCount:Lec3/p1;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->watcherCount:Lec3/f2;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_watchers:Lec3/p1;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v5, Lio/getstream/chat/android/client/api2/d;

    const/16 v7, 0x10

    invoke-direct {v5, v7}, Lio/getstream/chat/android/client/api2/d;-><init>(I)V

    invoke-static {v2, v4, v5}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->combineStates(Lec3/f2;Lec3/f2;Lc93/m;)Lec3/f2;

    move-result-object v2

    new-instance v5, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/4 v7, 0x5

    invoke-direct {v5, v7}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    invoke-static {v2, v5}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->mapState(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->watchers:Lec3/f2;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_typing:Lec3/p1;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->typing:Lec3/f2;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->rawReads:Lec3/f2;

    new-instance v5, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/4 v7, 0x6

    invoke-direct {v5, v7}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    invoke-static {v2, v5}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->mapState(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->reads:Lec3/f2;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->rawReads:Lec3/f2;

    new-instance v5, Lio/getstream/chat/android/client/api2/d;

    const/16 v7, 0x11

    invoke-direct {v5, v7}, Lio/getstream/chat/android/client/api2/d;-><init>(I)V

    invoke-static {v2, v3, v5}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->combineStates(Lec3/f2;Lec3/f2;Lc93/m;)Lec3/f2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->read:Lec3/f2;

    new-instance v5, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/4 v7, 0x7

    invoke-direct {v5, v7}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    invoke-static {v2, v5}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->mapState(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->unreadCount:Lec3/f2;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_members:Lec3/p1;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v5, Lio/getstream/chat/android/client/api2/d;

    const/16 v7, 0xd

    invoke-direct {v5, v7}, Lio/getstream/chat/android/client/api2/d;-><init>(I)V

    invoke-static {v2, v4, v5}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->combineStates(Lec3/f2;Lec3/f2;Lc93/m;)Lec3/f2;

    move-result-object v2

    new-instance v5, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/4 v7, 0x0

    invoke-direct {v5, v7}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    invoke-static {v2, v5}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->mapState(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->members:Lec3/f2;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_membersCount:Lec3/p1;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->membersCount:Lec3/f2;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_channelData:Lec3/p1;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v5, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/d;

    invoke-direct {v5, v0, v7}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/d;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;I)V

    invoke-static {v2, v4, v5}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->combineStates(Lec3/f2;Lec3/f2;Lc93/m;)Lec3/f2;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->channelData:Lec3/f2;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_insideSearch:Lec3/p1;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->insideSearch:Lec3/f2;

    new-instance v2, Lgf1/e;

    const/16 v4, 0xd

    invoke-direct {v2, v4}, Lgf1/e;-><init>(I)V

    invoke-static {v3, v1, v6, v2}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->combineStates(Lec3/f2;Lec3/f2;Lec3/f2;Lkotlin/jvm/functions/Function3;)Lec3/f2;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->lastSentMessageDate:Lec3/f2;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->sortedVisiblePinnedMessages$lambda$9(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$isMessageVisible(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->isMessageVisible(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method private static final activeLiveLocations$lambda$4(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Ljava/util/List;)Ljava/util/List;
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

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->cid:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private final applyMessageLimitIfNeeded(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)",
            "Ljava/util/Collection<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messageLimit:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->loadingOlderMessages:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messageLimit:Ljava/lang/Integer;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/lit8 v1, v1, 0x1e

    if-le v0, v1, :cond_1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl$applyMessageLimitIfNeeded$$inlined$sortedBy$1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, v0}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messageLimit:Ljava/lang/Integer;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0, p1}, Lm83/s;->x1(ILjava/util/List;)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setEndOfOlderMessages(Z)V

    check-cast p1, Ljava/util/Collection;

    :cond_1
    :goto_0
    return-object p1
.end method

.method public static synthetic b(Ljava/util/Map;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->reads$lambda$29(Ljava/util/Map;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Ljava/util/List;)Ljava/util/LinkedHashMap;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->visiblePinnedMessages$lambda$20(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Ljava/util/List;)Ljava/util/Map;

    move-result-object p0

    check-cast p0, Ljava/util/LinkedHashMap;

    return-object p0
.end method

.method private final cacheLatestMessages()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->cachedLatestMessages:Lec3/p1;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->sortedMessages:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    const/16 v3, 0x10

    if-ge v2, v3, :cond_0

    move v2, v3

    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method private static final channelData$lambda$36(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Lio/getstream/chat/android/models/ChannelData;Ljava/util/Map;)Lio/getstream/chat/android/models/ChannelData;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "users"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->channelType:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->channelId:Ljava/lang/String;

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

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

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

    :cond_2
    return-object p1
.end method

.method public static synthetic d(Ljava/util/Map;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->sortedMessages$lambda$22(Ljava/util/Map;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final deletePinnedMessages(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)V"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

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

    check-cast v1, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->x:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "[deletePinnedMessages] messages.ids: "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v2, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_pinnedMessages:Lec3/p1;

    if-eqz v0, :cond_2

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    goto :goto_1

    :cond_2
    move-object v0, v4

    :goto_1
    if-nez v0, :cond_3

    goto/16 :goto_3

    :cond_3
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v0, p1}, Lm83/g0;->a0(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->now:Lc93/a;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {v3}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v6

    if-nez v6, :cond_4

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getPinExpires()Ljava/util/Date;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    invoke-interface {v5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    cmp-long v3, v6, v8

    if-gez v3, :cond_5

    goto :goto_2

    :cond_5
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_6
    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v2, p1, Lb23/k;->c:Lb23/e;

    iget-object v3, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v5, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v2

    const-string v6, "[setPinned] pinned.size: "

    const-string v7, " => "

    invoke-static {v0, v2, v6, v7}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v5, v3, v0, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_pinnedMessages:Lec3/p1;

    if-eqz p1, :cond_8

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v4, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_8
    :goto_3
    return-void
.end method

.method public static synthetic e(Lio/getstream/chat/android/models/ChannelUserRead;)I
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->unreadCount$lambda$32(Lio/getstream/chat/android/models/ChannelUserRead;)I

    move-result p0

    return p0
.end method

.method public static synthetic f(Ljava/util/Collection;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->members$lambda$35(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messagesTransformation$lambda$15$lambda$13(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method private final getDeletedMessagesIds()Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_messages:Lec3/p1;

    if-eqz v0, :cond_4

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_4

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-static {v2}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, v4

    :goto_1
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v4

    :cond_2
    if-eqz v4, :cond_0

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0

    :cond_4
    sget-object v0, Lm83/a0;->w:Lm83/a0;

    return-object v0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public static synthetic h(Ljava/util/Map;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/ChannelUserRead;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->read$lambda$31(Ljava/util/Map;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/util/List;Z)Lio/getstream/chat/android/models/MessagesState;
    .locals 0

    invoke-static {p1, p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messagesState$lambda$10(ZLjava/util/List;)Lio/getstream/chat/android/models/MessagesState;

    move-result-object p0

    return-object p0
.end method

.method private final isMessageVisible(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->hideMessagesBefore:Ljava/util/Date;

    if-eqz v0, :cond_1

    invoke-static {p1, v0}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->wasCreatedAfter(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public static synthetic j(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Config;Ljava/util/List;)Ljava/util/Date;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->lastSentMessageDate$lambda$39(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Config;Ljava/util/List;)Ljava/util/Date;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ljava/util/Map;Ljava/util/Map;)Ljava/util/ArrayList;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->members$lambda$33(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic l(Ljava/util/Map;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->sortedPinnedMessages$lambda$24(Ljava/util/Map;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final lastSentMessageDate$lambda$39(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Config;Ljava/util/List;)Ljava/util/Date;
    .locals 3

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messages"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Config;->getSkipLastMsgUpdateForSystemMsgs()Z

    move-result p0

    invoke-static {v0, p0}, Lio/getstream/chat/android/extensions/MessagesExtensionsKt;->lastMessageAt(Ljava/util/List;Z)Ljava/util/Date;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic m(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->activeLiveLocations$lambda$4(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method private static final members$lambda$33(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Collection;
    .locals 1

    const-string v0, "membersMap"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usersMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/extensions/internal/MemberKt;->updateUsers(Ljava/util/Collection;Ljava/util/Map;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private static final members$lambda$35(Ljava/util/Collection;)Ljava/util/List;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl$members$lambda$35$$inlined$sortedBy$1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p0, v0}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final messageCount$lambda$2(Lio/getstream/chat/android/models/ChannelData;)Ljava/lang/Integer;
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelData;->getMessageCount()Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final messageList$lambda$5(Ljava/util/Map;Ljava/util/Map;)Ljava/util/List;
    .locals 1

    const-string v0, "messageMap"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->updateUsers(Ljava/util/Collection;Ljava/util/Map;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final messagesState$lambda$10(ZLjava/util/List;)Lio/getstream/chat/android/models/MessagesState;
    .locals 1

    const-string v0, "messages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

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

.method private final messagesTransformation(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/f2;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->userFlow:Lec3/f2;

    new-instance v1, Lf01/f;

    const/16 v2, 0x1c

    invoke-direct {v1, v2, p0, p2}, Lf01/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v0, v1}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->combineStates(Lec3/f2;Lec3/f2;Lc93/m;)Lec3/f2;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic messagesTransformation$default(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Lec3/f2;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lec3/f2;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Lio/getstream/chat/android/client/api/state/a;

    const/16 p3, 0x1d

    invoke-direct {p2, p3}, Lio/getstream/chat/android/client/api/state/a;-><init>(I)V

    :cond_0
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messagesTransformation(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object p0

    return-object p0
.end method

.method private static final messagesTransformation$lambda$11(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final messagesTransformation$lambda$15(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Lkotlin/jvm/functions/Function1;Ljava/util/Collection;Lio/getstream/chat/android/models/User;)Ljava/util/List;
    .locals 2

    const-string v0, "messageCollection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object p2

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    invoke-static {p2, v0}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object p2

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/f;

    const/4 v1, 0x0

    invoke-direct {v0, p3, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/f;-><init>(Lio/getstream/chat/android/models/User;I)V

    invoke-static {p2, v0}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object p2

    new-instance p3, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl$messagesTransformation$2$3;

    invoke-direct {p3, p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl$messagesTransformation$2$3;-><init>(Ljava/lang/Object;)V

    invoke-static {p2, p3}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object p0

    invoke-static {p0, p1}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object p0

    new-instance p1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl$messagesTransformation$lambda$15$$inlined$sortedBy$1;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {p0, p1}, Lxb3/k;->C(Lxb3/i;Ljava/util/Comparator;)Lxb3/o;

    move-result-object p0

    invoke-static {p0}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final messagesTransformation$lambda$15$lambda$12(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getShowInChannel()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final messagesTransformation$lambda$15$lambda$13(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {v0, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getShadowed()Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_1
    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic n(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Ljava/util/List;)Ljava/util/LinkedHashMap;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->visibleMessages$lambda$17(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Ljava/util/List;)Ljava/util/Map;

    move-result-object p0

    check-cast p0, Ljava/util/LinkedHashMap;

    return-object p0
.end method

.method public static synthetic o(Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messagesTransformation$lambda$15$lambda$12(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method public static synthetic p(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Lio/getstream/chat/android/models/ChannelData;Ljava/util/Map;)Lio/getstream/chat/android/models/ChannelData;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->channelData$lambda$36(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Lio/getstream/chat/android/models/ChannelData;Ljava/util/Map;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p0

    return-object p0
.end method

.method private static final pinnedMessagesList$lambda$7(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Ljava/util/Map;Ljava/util/Map;)Ljava/util/List;
    .locals 6

    const-string v0, "pinnedMessagesMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userMap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

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

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Message;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->now:Lc93/a;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {v2}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getPinExpires()Ljava/util/Date;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    cmp-long v2, v4, v2

    if-gez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v0, p2}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->updateUsers(Ljava/util/Collection;Ljava/util/Map;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Ljava/util/Map;Ljava/util/Map;)Ljava/util/ArrayList;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->pinnedMessagesList$lambda$7(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Ljava/util/Map;Ljava/util/Map;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic r(Ljava/util/Map;Ljava/util/Map;)Ljava/util/ArrayList;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->watchers$lambda$25(Ljava/util/Map;Ljava/util/Map;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method private static final read$lambda$31(Ljava/util/Map;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/ChannelUserRead;
    .locals 1

    const-string v0, "readsMap"

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

.method private static final reads$lambda$29(Ljava/util/Map;)Ljava/util/List;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl$reads$lambda$29$$inlined$sortedBy$1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p0, v0}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Lkotlin/jvm/functions/Function1;Ljava/util/Collection;Lio/getstream/chat/android/models/User;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messagesTransformation$lambda$15(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Lkotlin/jvm/functions/Function1;Ljava/util/Collection;Lio/getstream/chat/android/models/User;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final setPinned(Lkotlin/jvm/functions/Function1;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_pinnedMessages:Lec3/p1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/models/Message;

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->now:Lc93/a;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v4}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v6

    if-nez v6, :cond_2

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Message;->getPinExpires()Ljava/util/Date;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    invoke-interface {v5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    cmp-long v4, v6, v4

    if-gez v4, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v3, p1, Lb23/k;->c:Lb23/e;

    iget-object v4, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v3

    const-string v6, "[setPinned] pinned.size: "

    const-string v7, " => "

    invoke-static {v0, v3, v6, v7}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v5, v4, v0, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_pinnedMessages:Lec3/p1;

    if-eqz p1, :cond_6

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_6
    :goto_2
    return-void
.end method

.method private static final sortedMessages$lambda$22(Ljava/util/Map;)Ljava/util/List;
    .locals 1

    const-string v0, "messagesMap"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl$sortedMessages$lambda$22$$inlined$sortedBy$1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p0, v0}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final sortedPinnedMessages$lambda$24(Ljava/util/Map;)Ljava/util/List;
    .locals 1

    const-string v0, "messagesMap"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl$sortedPinnedMessages$lambda$24$$inlined$sortedBy$1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p0, v0}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final sortedVisiblePinnedMessages$lambda$9(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Lio/getstream/chat/android/models/Message;)Z
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->now:Lc93/a;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getPinExpires()Ljava/util/Date;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide p0

    cmp-long p0, v0, p0

    if-gez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic t(Lio/getstream/chat/android/models/ChannelData;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messageCount$lambda$2(Lio/getstream/chat/android/models/ChannelData;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Ljava/util/Map;Ljava/util/Map;)Ljava/util/ArrayList;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messageList$lambda$5(Ljava/util/Map;Ljava/util/Map;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method private static final unreadCount$lambda$32(Lio/getstream/chat/android/models/ChannelUserRead;)I
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelUserRead;->getUnreadMessages()I

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic v(Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messagesTransformation$lambda$11(Lio/getstream/chat/android/models/Message;)Z

    return-void
.end method

.method private static final visibleMessages$lambda$17(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Ljava/util/List;)Ljava/util/Map;
    .locals 3

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

    invoke-direct {p0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->isMessageVisible(Lio/getstream/chat/android/models/Message;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/16 p0, 0xa

    invoke-static {v0, p0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p0

    invoke-static {p0}, Lm83/g0;->W(I)I

    move-result p0

    const/16 p1, 0x10

    if-ge p0, p1, :cond_2

    move p0, p1

    :cond_2
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1, p0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    return-object p1
.end method

.method private static final visiblePinnedMessages$lambda$20(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Ljava/util/List;)Ljava/util/Map;
    .locals 3

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

    invoke-direct {p0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->isMessageVisible(Lio/getstream/chat/android/models/Message;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/16 p0, 0xa

    invoke-static {v0, p0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p0

    invoke-static {p0}, Lm83/g0;->W(I)I

    move-result p0

    const/16 p1, 0x10

    if-ge p0, p1, :cond_2

    move p0, p1

    :cond_2
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1, p0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    return-object p1
.end method

.method public static synthetic w(Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->watchers$lambda$27(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final watchers$lambda$25(Ljava/util/Map;Ljava/util/Map;)Ljava/util/List;
    .locals 1

    const-string v0, "watcherMap"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/extensions/internal/UserKt;->updateUsers(Ljava/util/Collection;Ljava/util/Map;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final watchers$lambda$27(Ljava/util/List;)Ljava/util/List;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl$watchers$lambda$27$$inlined$sortedBy$1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p0, v0}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final addMember(Lio/getstream/chat/android/models/Member;)V
    .locals 7

    const-string v0, "member"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v1

    const-string v5, "[addMember] member.id: "

    invoke-static {v5, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_membersCount:Lec3/p1;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->membersCount:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_members:Lec3/p1;

    if-eqz v5, :cond_1

    check-cast v5, Lec3/h2;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    if-eqz v5, :cond_1

    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-ne v5, v2, :cond_1

    move-object v3, v4

    :cond_1
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, v4, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_3
    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->upsertMembers(Ljava/util/List;)V

    return-void
.end method

.method public final addQuotedMessage(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "quotedMessageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "quotingMessageId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_quotedMessagesMap:Lec3/p1;

    if-eqz v0, :cond_1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_0

    check-cast v2, Ljava/util/Collection;

    invoke-static {p2, v2}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    :goto_0
    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-virtual {v0, p1, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public final deleteMember(Lio/getstream/chat/android/models/Member;)V
    .locals 9

    const-string v0, "member"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v1

    const-string v5, "[deleteMember] member.id: "

    invoke-static {v5, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_members:Lec3/p1;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_membersCount:Lec3/p1;

    if-eqz v2, :cond_4

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->membersCount:Lec3/f2;

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    move-object v5, v0

    check-cast v5, Lec3/h2;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v1

    goto :goto_1

    :cond_1
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v6, v1

    :cond_2
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    sub-int/2addr v3, v6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    check-cast v2, Lec3/h2;

    invoke-virtual {v2, v4, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_4
    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lm83/g0;->Z(Ljava/lang/Object;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v4, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_5
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_watchers:Lec3/p1;

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->watcherCount:Lec3/f2;

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_3

    :cond_6
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_8
    :goto_3
    sub-int/2addr v3, v1

    invoke-virtual {p0, v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->deleteWatcher$stream_chat_android_client_release(Lio/getstream/chat/android/models/User;I)V

    :cond_9
    return-void
.end method

.method public final deleteMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 5

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    const-string v4, "[deleteMessage] message.id: "

    invoke-static {v4, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->deleteMessages(Ljava/util/List;)V

    return-void
.end method

.method public final deleteMessages(Ljava/util/List;)V
    .locals 7
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

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

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

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v6, "[deleteMessages] messages.ids: "

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v4, v3, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_messages:Lec3/p1;

    if-eqz v1, :cond_2

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Lm83/g0;->a0(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v1, v5, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_2
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->deletePinnedMessages(Ljava/util/List;)V

    return-void
.end method

.method public final deletePinnedMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 7

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v4

    const-string v5, "[deletePinnedMessage] message.id="

    const-string v6, ", message.text="

    invoke-static {v5, v1, v6, v4}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->deletePinnedMessages(Ljava/util/List;)V

    return-void
.end method

.method public final deleteWatcher$stream_chat_android_client_release(Lio/getstream/chat/android/models/User;I)V
    .locals 7

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    const-string v5, "[deleteWatcher] user.id: "

    const-string v6, ", watchersCount: "

    invoke-static {p2, v5, v1, v6}, Lm4/a;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_watchers:Lec3/p1;

    if-eqz v0, :cond_3

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lm83/g0;->Z(Ljava/lang/Object;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, v4, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_watcherCount:Lec3/p1;

    if-eqz p1, :cond_3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    if-gez p2, :cond_1

    move-object v1, v4

    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result p2

    :goto_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v4, p2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_3
    return-void
.end method

.method public final destroy$stream_chat_android_client_release()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_messages:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_pinnedMessages:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_typing:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_rawReads:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_members:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_watchers:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_watcherCount:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_endOfNewerMessages:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_endOfOlderMessages:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_loading:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_hidden:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_muted:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_channelData:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_repliedMessage:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_quotedMessagesMap:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_membersCount:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_insideSearch:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_loadingOlderMessages:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_loadingNewerMessages:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_channelConfig:Lec3/p1;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->activeLiveLocations:Lec3/f2;

    return-object v0
.end method

.method public final getBaseMessageLimit()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->baseMessageLimit:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getCachedLatestMessages$stream_chat_android_client_release()Lec3/p1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/p1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->cachedLatestMessages:Lec3/p1;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->channelConfig:Lec3/f2;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->channelData:Lec3/f2;

    return-object v0
.end method

.method public final getChannelId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->channelId:Ljava/lang/String;

    return-object v0
.end method

.method public final getChannelType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->channelType:Ljava/lang/String;

    return-object v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->cid:Ljava/lang/String;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->endOfNewerMessages:Lec3/f2;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->endOfOlderMessages:Lec3/f2;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->hidden:Lec3/f2;

    return-object v0
.end method

.method public final getHideMessagesBefore()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->hideMessagesBefore:Ljava/util/Date;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->insideSearch:Lec3/f2;

    return-object v0
.end method

.method public final getKeystrokeParentMessageId$stream_chat_android_client_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->keystrokeParentMessageId:Ljava/lang/String;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->lastSentMessageDate:Lec3/f2;

    return-object v0
.end method

.method public final getLastStartTypingEvent()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->lastStartTypingEvent:Ljava/util/Date;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->loading:Lec3/f2;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->loadingNewerMessages:Lec3/f2;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->loadingOlderMessages:Lec3/f2;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->members:Lec3/f2;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->membersCount:Lec3/f2;

    return-object v0
.end method

.method public final getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_messages:Lec3/p1;

    if-eqz v0, :cond_1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Message;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_pinnedMessages:Lec3/p1;

    if-eqz v0, :cond_2

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Message;

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getMessageCount()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messageCount:Lec3/f2;

    return-object v0
.end method

.method public final getMessageList()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messageList:Lec3/f2;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messages:Lec3/f2;

    return-object v0
.end method

.method public final getMessagesFromUser(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_messages:Lec3/p1;

    if-eqz v0, :cond_2

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1

    :cond_2
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final getMessagesState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messagesState:Lec3/f2;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->muted:Lec3/f2;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->pinnedMessages:Lec3/f2;

    return-object v0
.end method

.method public final getPinnedMessagesList()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->pinnedMessagesList:Lec3/f2;

    return-object v0
.end method

.method public final getQuotedMessagesMap()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->quotedMessagesMap:Lec3/f2;

    return-object v0
.end method

.method public final getRawPinnedMessages()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_pinnedMessages:Lec3/p1;

    if-eqz v0, :cond_2

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_2

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v4, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->now:Lc93/a;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {v3}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getPinExpires()Ljava/util/Date;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    invoke-interface {v4}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    cmp-long v3, v5, v3

    if-gez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :cond_3
    if-nez v1, :cond_4

    sget-object v0, Lm83/z;->w:Lm83/z;

    return-object v0

    :cond_4
    return-object v1
.end method

.method public final getRead()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->read:Lec3/f2;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->reads:Lec3/f2;

    return-object v0
.end method

.method public final getRecoveryNeeded()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->recoveryNeeded:Z

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->repliedMessage:Lec3/f2;

    return-object v0
.end method

.method public final getSortedMessages()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->sortedMessages:Lec3/f2;

    return-object v0
.end method

.method public final getSortedPinnedMessages()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->sortedPinnedMessages:Lec3/f2;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->typing:Lec3/f2;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->unreadCount:Lec3/f2;

    return-object v0
.end method

.method public final getVisibleMessages$stream_chat_android_client_release()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->visibleMessages:Lec3/f2;

    return-object v0
.end method

.method public final getVisiblePinnedMessages$stream_chat_android_client_release()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->visiblePinnedMessages:Lec3/f2;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->watcherCount:Lec3/f2;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->watchers:Lec3/f2;

    return-object v0
.end method

.method public final markChannelAsRead()Z
    .locals 14

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messages:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->channelConfig:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Config;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Config;->getReadEventsEnabled()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_5

    invoke-static {v0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Message;

    if-eqz v0, :cond_5

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->read:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/ChannelUserRead;

    if-nez v1, :cond_1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_3

    :cond_1
    invoke-virtual {v1}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastReadMessageId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v1}, Lio/getstream/chat/android/models/ChannelUserRead;->getUnreadMessages()I

    move-result v3

    if-lez v3, :cond_2

    goto :goto_1

    :cond_2
    move-object v4, v2

    goto :goto_2

    :cond_3
    :goto_1
    move-object v4, v1

    :goto_2
    if-eqz v4, :cond_4

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-static {v0, v1}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v6

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-static {v0, v1}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v8

    const/16 v12, 0x71

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v4 .. v13}, Lio/getstream/chat/android/models/ChannelUserRead;->copy$default(Lio/getstream/chat/android/models/ChannelUserRead;Lio/getstream/chat/android/models/User;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->upsertReads(Ljava/util/List;)V

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :cond_4
    :goto_3
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method public final removeMessagesBefore(Ljava/util/Date;)V
    .locals 10

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "[removeMessagesBefore] date: "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_messages:Lec3/p1;

    if-eqz v0, :cond_3

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/models/Message;

    invoke-static {v5, p1}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->wasCreatedAfter(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v4, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_3
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_pinnedMessages:Lec3/p1;

    if-eqz v0, :cond_4

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    goto :goto_1

    :cond_4
    move-object v0, v4

    :goto_1
    if-nez v0, :cond_5

    goto/16 :goto_4

    :cond_5
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/models/Message;

    invoke-static {v5, p1}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->wasCreatedAfter(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_7
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->now:Lc93/a;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-static {v3}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v6

    if-nez v6, :cond_8

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getPinExpires()Ljava/util/Date;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    invoke-interface {v5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    cmp-long v3, v6, v8

    if-gez v3, :cond_9

    goto :goto_3

    :cond_9
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_a
    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v5, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v2

    const-string v6, "[setPinned] pinned.size: "

    const-string v7, " => "

    invoke-static {v0, v2, v6, v7}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v5, v3, v0, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_b
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_pinnedMessages:Lec3/p1;

    if-eqz v0, :cond_c

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, v4, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_c
    :goto_4
    return-void
.end method

.method public final resetMessageLimit$stream_chat_android_client_release()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->baseMessageLimit:Ljava/lang/Integer;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messageLimit:Ljava/lang/Integer;

    return-void
.end method

.method public final setChannelConfig(Lio/getstream/chat/android/models/Config;)V
    .locals 2

    const-string v0, "channelConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_channelConfig:Lec3/p1;

    if-eqz v0, :cond_0

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setChannelData(Lio/getstream/chat/android/models/ChannelData;)V
    .locals 2

    const-string v0, "channelData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_channelData:Lec3/p1;

    if-eqz v0, :cond_0

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setEndOfNewerMessages(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_endOfNewerMessages:Lec3/p1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setEndOfOlderMessages(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_endOfOlderMessages:Lec3/p1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setHidden(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_hidden:Lec3/p1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setHideMessagesBefore(Ljava/util/Date;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->hideMessagesBefore:Ljava/util/Date;

    return-void
.end method

.method public final setInsideSearch(Z)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->insideSearch:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->cacheLatestMessages()V

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->insideSearch:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->cachedLatestMessages:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lm83/z;->w:Lm83/z;

    invoke-virtual {v1, v0, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_insideSearch:Lec3/p1;

    if-eqz v1, :cond_2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v1, Lec3/h2;

    invoke-virtual {v1, v0, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method public final setKeystrokeParentMessageId$stream_chat_android_client_release(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->keystrokeParentMessageId:Ljava/lang/String;

    return-void
.end method

.method public final setLastStartTypingEvent(Ljava/util/Date;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->lastStartTypingEvent:Ljava/util/Date;

    return-void
.end method

.method public final setLoading(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_loading:Lec3/p1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setLoadingNewerMessages(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_loadingNewerMessages:Lec3/p1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setLoadingOlderMessages(Z)V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_loadingOlderMessages:Lec3/p1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, v1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_messages:Lec3/p1;

    if-eqz v0, :cond_4

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-eqz p1, :cond_4

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messageLimit:Ljava/lang/Integer;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    add-int/lit8 v0, v0, 0x1e

    if-lt v0, p1, :cond_1

    move-object v1, v2

    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    goto :goto_0

    :cond_2
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    :goto_0
    int-to-double v2, p1

    mul-double/2addr v2, v0

    double-to-int p1, v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_3
    iput-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->messageLimit:Ljava/lang/Integer;

    :cond_4
    return-void
.end method

.method public final setMembers(Ljava/util/List;I)V
    .locals 8
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

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    const/16 v5, 0xa

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v1, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v7, "[setMembers] member.ids: "

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_members:Lec3/p1;

    if-eqz v0, :cond_4

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    const/16 v2, 0x10

    if-ge v1, v2, :cond_2

    move v1, v2

    :cond_2
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    check-cast v0, Lec3/h2;

    invoke-virtual {v0, v4, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_4
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_membersCount:Lec3/p1;

    if-eqz p1, :cond_5

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v4, p2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_5
    return-void
.end method

.method public final setMembersCount(I)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_membersCount:Lec3/p1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_messages:Lec3/p1;

    if-eqz v0, :cond_2

    check-cast p1, Ljava/util/Collection;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->applyMessageLimitIfNeeded(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    const/16 v2, 0x10

    if-ge v1, v2, :cond_0

    move v1, v2

    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    check-cast v0, Lec3/h2;

    const/4 p1, 0x0

    invoke-virtual {v0, p1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method public final setMuted(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_muted:Lec3/p1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setPinnedMessages(Ljava/util/List;)V
    .locals 10
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

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const-string v5, "[setPinnedMessages] messages.size: "

    invoke-static {v1, v5}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_pinnedMessages:Lec3/p1;

    if-eqz v0, :cond_1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    goto :goto_0

    :cond_1
    move-object v0, v4

    :goto_0
    if-nez v0, :cond_2

    goto/16 :goto_3

    :cond_2
    check-cast p1, Ljava/lang/Iterable;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    const/16 v2, 0x10

    if-ge v1, v2, :cond_3

    move v1, v2

    :cond_3
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->now:Lc93/a;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-static {v3}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v6

    if-nez v6, :cond_5

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getPinExpires()Ljava/util/Date;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    invoke-interface {v5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    cmp-long v3, v6, v8

    if-gez v3, :cond_6

    goto :goto_2

    :cond_6
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_7
    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v5, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v2

    const-string v6, "[setPinned] pinned.size: "

    const-string v7, " => "

    invoke-static {v0, v2, v6, v7}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v5, v3, v0, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_pinnedMessages:Lec3/p1;

    if-eqz v0, :cond_9

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, v4, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_9
    :goto_3
    return-void
.end method

.method public final setRecoveryNeeded(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->recoveryNeeded:Z

    return-void
.end method

.method public final setRepliedMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_repliedMessage:Lec3/p1;

    if-eqz v0, :cond_0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final setWatchers(Ljava/util/List;I)V
    .locals 8
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

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    const/16 v5, 0xa

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v1, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/getstream/chat/android/models/User;

    invoke-virtual {v7}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v7, "[setWatchers] watchers.ids: "

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ", watchersCount: "

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_watchers:Lec3/p1;

    if-eqz v0, :cond_4

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    const/16 v2, 0x10

    if-ge v1, v2, :cond_2

    move v1, v2

    :cond_2
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lio/getstream/chat/android/models/User;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    check-cast v0, Lec3/h2;

    invoke-virtual {v0, v4, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_4
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_watcherCount:Lec3/p1;

    if-eqz p1, :cond_5

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v4, p2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_5
    return-void
.end method

.method public final toChannel()Lio/getstream/chat/android/models/Channel;
    .locals 49

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->channelData:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/ChannelData;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->sortedMessages:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/util/List;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->cachedLatestMessages:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->members:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ljava/util/List;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->rawReads:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v6

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->watchers:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ljava/util/List;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->watcherCount:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v8

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->insideSearch:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    invoke-virtual/range {v2 .. v9}, Lio/getstream/chat/android/models/ChannelData;->toChannel(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;IZ)Lio/getstream/chat/android/models/Channel;

    move-result-object v10

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->channelConfig:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v26, v1

    check-cast v26, Lio/getstream/chat/android/models/Config;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->hidden:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v30, v1

    check-cast v30, Ljava/lang/Boolean;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->sortedPinnedMessages:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v34, v1

    check-cast v34, Ljava/util/List;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->activeLiveLocations:Lec3/f2;

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

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v1, v2, v3, v2}, Lio/getstream/chat/android/client/extensions/ChannelExtensionKt;->syncUnreadCountWithReads$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    return-object v1
.end method

.method public final updateCachedLatestMessages(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            ">;)V"
        }
    .end annotation

    const-string v0, "messages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->cachedLatestMessages:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final updateChannelData(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "update"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_channelData:Lec3/p1;

    if-eqz v0, :cond_1

    if-eqz v0, :cond_0

    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/ChannelData;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final updateTypingEvent(Lio/getstream/chat/android/models/TypingEvent;)V
    .locals 2

    const-string v0, "typingEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_typing:Lec3/p1;

    if-eqz v0, :cond_0

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final upsertDelivered(Lio/getstream/chat/android/models/ChannelUserRead;)V
    .locals 11

    const-string v0, "read"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->rawReads:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

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

    if-eqz v1, :cond_0

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

    if-nez v0, :cond_1

    :cond_0
    move-object v0, p1

    :cond_1
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_rawReads:Lec3/p1;

    if-eqz v1, :cond_2

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ll83/k;

    invoke-direct {v3, p1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    invoke-static {v2, p1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {v1, v0, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method public final upsertMembers(Ljava/util/List;)V
    .locals 8
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

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    const/16 v5, 0xa

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v1, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v7, "[upsertMembers] member.ids: "

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lm83/g0;->W(I)I

    move-result v0

    const/16 v1, 0x10

    if-ge v0, v1, :cond_2

    move v0, v1

    :cond_2
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_members:Lec3/p1;

    if-eqz p1, :cond_4

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {v0, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {p1, v4, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_4
    return-void
.end method

.method public final upsertMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->upsertMessages(Ljava/util/Collection;)V

    return-void
.end method

.method public final upsertMessages(Ljava/util/Collection;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)V"
        }
    .end annotation

    const-string v0, "updatedMessages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_messages:Lec3/p1;

    if-eqz v0, :cond_4

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-static {v4}, Lm83/g0;->W(I)I

    move-result v4

    const/16 v5, 0x10

    if-ge v4, v5, :cond_0

    move v4, v5

    :cond_0
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v7, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getDeletedMessagesIds()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v6, v2}, Lm83/g0;->a0(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v1, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {p0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->applyMessageLimitIfNeeded(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    if-ge v2, v5, :cond_2

    goto :goto_1

    :cond_2
    move v5, v2

    :goto_1
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_4
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_pinnedMessages:Lec3/p1;

    if-eqz v0, :cond_7

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    invoke-virtual {p0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->upsertPinnedMessages(Ljava/util/Collection;)V

    :cond_7
    return-void
.end method

.method public final upsertPinnedMessages(Ljava/util/Collection;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)V"
        }
    .end annotation

    const-string v0, "messages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    const-string v5, "[upsertPinnedMessages] messages.size: "

    invoke-static {v1, v5}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_pinnedMessages:Lec3/p1;

    if-eqz v0, :cond_1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    goto :goto_0

    :cond_1
    move-object v0, v4

    :goto_0
    if-nez v0, :cond_2

    goto/16 :goto_3

    :cond_2
    check-cast p1, Ljava/lang/Iterable;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    const/16 v2, 0x10

    if-ge v1, v2, :cond_3

    move v1, v2

    :cond_3
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getDeletedMessagesIds()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v2, p1}, Lm83/g0;->a0(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    invoke-static {v0, p1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->now:Lc93/a;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-static {v3}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v6

    if-nez v6, :cond_5

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getPinExpires()Ljava/util/Date;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    invoke-interface {v5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    cmp-long v3, v6, v8

    if-gez v3, :cond_6

    goto :goto_2

    :cond_6
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_7
    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v2, p1, Lb23/k;->c:Lb23/e;

    iget-object v3, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v5, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v2

    const-string v6, "[setPinned] pinned.size: "

    const-string v7, " => "

    invoke-static {v0, v2, v6, v7}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v5, v3, v0, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_pinnedMessages:Lec3/p1;

    if-eqz p1, :cond_9

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v4, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_9
    :goto_3
    return-void
.end method

.method public final upsertReads(Ljava/util/List;)V
    .locals 5
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_rawReads:Lec3/p1;

    if-eqz v0, :cond_2

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    check-cast p1, Ljava/lang/Iterable;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    const/16 v3, 0x10

    if-ge v2, v3, :cond_0

    move v2, v3

    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lio/getstream/chat/android/models/ChannelUserRead;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/ChannelUserRead;->getUserId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-static {v1, v3}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method public final upsertUserPresence(Lio/getstream/chat/android/models/User;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    const-string v1, "user"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->y:Lb23/g;

    iget-object v5, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    const/4 v6, 0x0

    if-eqz v3, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    const-string v7, "[upsertUserPresence] user.id: "

    invoke-static {v7, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v4, v5, v3, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_members:Lec3/p1;

    if-eqz v1, :cond_1

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-eqz v1, :cond_1

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Member;

    if-eqz v1, :cond_1

    const/16 v17, 0x7ffe

    const/16 v18, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

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

    move-object/from16 v19, v16

    const/16 v16, 0x0

    invoke-static/range {v1 .. v18}, Lio/getstream/chat/android/models/Member;->copy$default(Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/User;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Member;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->upsertMembers(Ljava/util/List;)V

    :cond_1
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_watchers:Lec3/p1;

    if-eqz v1, :cond_4

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-eqz v1, :cond_4

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    move-object/from16 v2, p1

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_5

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->watcherCount:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->upsertWatchers(Ljava/util/List;I)V

    :cond_5
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_channelData:Lec3/p1;

    if-eqz v1, :cond_7

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lio/getstream/chat/android/models/ChannelData;

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Lio/getstream/chat/android/models/ChannelData;->getCreatedBy()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    move-object v1, v6

    goto :goto_2

    :cond_6
    const/4 v1, 0x0

    :goto_2
    if-eqz v1, :cond_7

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

    move-object/from16 v6, p1

    invoke-static/range {v1 .. v23}, Lio/getstream/chat/android/models/ChannelData;->copy$default(Lio/getstream/chat/android/models/ChannelData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object v1

    move-object v2, v6

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setChannelData(Lio/getstream/chat/android/models/ChannelData;)V

    goto :goto_3

    :cond_7
    move-object/from16 v2, p1

    :goto_3
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_messages:Lec3/p1;

    if-eqz v1, :cond_a

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ll83/k;

    invoke-direct {v5, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v4

    invoke-static {v3, v4}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->updateUsers(Ljava/util/Collection;Ljava/util/Map;)Ljava/util/List;

    move-result-object v3

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-static {v4}, Lm83/g0;->W(I)I

    move-result v4

    const/16 v5, 0x10

    if-ge v4, v5, :cond_8

    move v4, v5

    :cond_8
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_9
    const/4 v14, 0x0

    invoke-virtual {v1, v14, v5}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    const/4 v14, 0x0

    :goto_5
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_pinnedMessages:Lec3/p1;

    if-eqz v1, :cond_b

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ll83/k;

    invoke-direct {v5, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v3, v2}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->updateUsers(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v14, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_b
    return-void
.end method

.method public final upsertWatchers(Ljava/util/List;I)V
    .locals 8
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

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/16 v4, 0xa

    const/4 v5, 0x0

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/getstream/chat/android/models/User;

    invoke-virtual {v7}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v7, "[upsertWatchers] watchers.ids: "

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ", watchersCount: "

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_watchers:Lec3/p1;

    if-eqz v0, :cond_6

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    const/16 v3, 0x10

    if-ge v2, v3, :cond_2

    move v2, v3

    :cond_2
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lio/getstream/chat/android/models/User;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-static {v1, v3}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-virtual {v0, v5, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->_watcherCount:Lec3/p1;

    if-eqz p1, :cond_6

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    if-gez p2, :cond_4

    move-object v1, v5

    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result p2

    :goto_2
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v5, p2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_6
    return-void
.end method
