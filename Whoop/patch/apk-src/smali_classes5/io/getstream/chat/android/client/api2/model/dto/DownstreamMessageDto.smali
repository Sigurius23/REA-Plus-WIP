.class public final Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/StreamHandsOff;
    reason = "Field names can\'t be changed because [CustomObjectDtoAdapter] class uses reflections to add/remove content of [extraData] map"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008l\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u00e7\u0003\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0008\u0012\u0014\u0008\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0008\u0012\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0003\u0012\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0003\u0012\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0003\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0019\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0000\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0008\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020 \u0018\u00010\u000f\u0012\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020 \u0018\u00010\u000f\u0012\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020#\u0018\u00010\u000f\u0012\u0006\u0010$\u001a\u00020 \u0012\u0006\u0010%\u001a\u00020 \u0012\u0008\u0008\u0002\u0010&\u001a\u00020\u0019\u0012\u0008\u0008\u0002\u0010\'\u001a\u00020\u0019\u0012\u0006\u0010(\u001a\u00020\u0019\u0012\u0006\u0010)\u001a\u00020\u0008\u0012\u000e\u0008\u0002\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0003\u0012\u0006\u0010+\u001a\u00020\u0008\u0012\u0006\u0010,\u001a\u00020\u000b\u0012\u0006\u0010-\u001a\u00020\u0014\u0012\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\u0008\u0002\u00100\u001a\u0004\u0018\u000101\u0012\n\u0008\u0002\u00102\u001a\u0004\u0018\u000103\u0012\n\u0008\u0002\u00104\u001a\u0004\u0018\u000105\u0012\n\u0008\u0002\u00106\u001a\u0004\u0018\u000107\u0012\n\u0008\u0002\u00108\u001a\u0004\u0018\u000109\u0012\u0008\u0010:\u001a\u0004\u0018\u00010\u0019\u0012\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020<0\u000f\u00a2\u0006\u0004\u0008=\u0010>J\u000f\u0010y\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010{\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\t\u0010}\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010\u007f\u001a\u00020\u0008H\u00c6\u0003J\u0016\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\u000fH\u00c6\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0008H\u00c6\u0003J\u0010\u0010\u0082\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0003H\u00c6\u0003J\u0010\u0010\u0083\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0003H\u00c6\u0003J\u0010\u0010\u0084\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0003H\u00c6\u0003J\u000c\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000c\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0019H\u00c6\u0003J\u000c\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000c\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000c\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u000c\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0000H\u00c6\u0003J\u000c\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u0018\u0010\u008d\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020 \u0018\u00010\u000fH\u00c6\u0003J\u0018\u0010\u008e\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020 \u0018\u00010\u000fH\u00c6\u0003J\u0018\u0010\u008f\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020#\u0018\u00010\u000fH\u00c6\u0003J\n\u0010\u0090\u0001\u001a\u00020 H\u00c6\u0003J\n\u0010\u0091\u0001\u001a\u00020 H\u00c6\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0008H\u00c6\u0003J\u0010\u0010\u0096\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0003H\u00c6\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0008H\u00c6\u0003J\n\u0010\u0098\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0014H\u00c6\u0003J\u000c\u0010\u009a\u0001\u001a\u0004\u0018\u00010/H\u00c6\u0003J\u000c\u0010\u009b\u0001\u001a\u0004\u0018\u000101H\u00c6\u0003J\u000c\u0010\u009c\u0001\u001a\u0004\u0018\u000103H\u00c6\u0003J\u000c\u0010\u009d\u0001\u001a\u0004\u0018\u000105H\u00c6\u0003J\u000c\u0010\u009e\u0001\u001a\u0004\u0018\u000107H\u00c6\u0003J\u000c\u0010\u009f\u0001\u001a\u0004\u0018\u000109H\u00c6\u0003J\u0011\u0010\u00a0\u0001\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0002\u0010vJ\u0016\u0010\u00a1\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020<0\u000fH\u00c6\u0003J\u00ac\u0004\u0010\u00a2\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u00082\u0014\u0008\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00082\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00032\u000e\u0008\u0002\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00032\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00032\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00142\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00002\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00082\u0016\u0008\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020 \u0018\u00010\u000f2\u0016\u0008\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020 \u0018\u00010\u000f2\u0016\u0008\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020#\u0018\u00010\u000f2\u0008\u0008\u0002\u0010$\u001a\u00020 2\u0008\u0008\u0002\u0010%\u001a\u00020 2\u0008\u0008\u0002\u0010&\u001a\u00020\u00192\u0008\u0008\u0002\u0010\'\u001a\u00020\u00192\u0008\u0008\u0002\u0010(\u001a\u00020\u00192\u0008\u0008\u0002\u0010)\u001a\u00020\u00082\u000e\u0008\u0002\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00032\u0008\u0008\u0002\u0010+\u001a\u00020\u00082\u0008\u0008\u0002\u0010,\u001a\u00020\u000b2\u0008\u0008\u0002\u0010-\u001a\u00020\u00142\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\u0008\u0002\u00100\u001a\u0004\u0018\u0001012\n\u0008\u0002\u00102\u001a\u0004\u0018\u0001032\n\u0008\u0002\u00104\u001a\u0004\u0018\u0001052\n\u0008\u0002\u00106\u001a\u0004\u0018\u0001072\n\u0008\u0002\u00108\u001a\u0004\u0018\u0001092\n\u0008\u0002\u0010:\u001a\u0004\u0018\u00010\u00192\u0014\u0008\u0002\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020<0\u000fH\u00c6\u0001\u00a2\u0006\u0003\u0010\u00a3\u0001J\u0015\u0010\u00a4\u0001\u001a\u00020\u00192\t\u0010\u00a5\u0001\u001a\u0004\u0018\u00010<H\u00d6\u0003J\n\u0010\u00a6\u0001\u001a\u00020 H\u00d6\u0001J\n\u0010\u00a7\u0001\u001a\u00020\u0008H\u00d6\u0001R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010@R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u0010BR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010DR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008E\u0010DR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008F\u0010GR\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008H\u0010GR\u0011\u0010\r\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008I\u0010DR\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008J\u0010KR\u0011\u0010\u0010\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008L\u0010DR\u0017\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008M\u0010@R\u0017\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008N\u0010@R\u0017\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008O\u0010@R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008P\u0010DR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Q\u0010GR\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008R\u0010SR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008T\u0010GR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008U\u0010GR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008V\u0010WR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008X\u0010YR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Z\u0010DR\u001f\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020 \u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008[\u0010KR\u001f\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020 \u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\\\u0010KR\u001f\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020#\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008]\u0010KR\u0011\u0010$\u001a\u00020 \u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008^\u0010_R\u0011\u0010%\u001a\u00020 \u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008`\u0010_R\u0011\u0010&\u001a\u00020\u0019\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008a\u0010SR\u0011\u0010\'\u001a\u00020\u0019\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008b\u0010SR\u0011\u0010(\u001a\u00020\u0019\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008c\u0010SR\u0011\u0010)\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008d\u0010DR\u0017\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008e\u0010@R\u0011\u0010+\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008f\u0010DR\u0011\u0010,\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008g\u0010GR\u0011\u0010-\u001a\u00020\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008h\u0010WR\u0013\u0010.\u001a\u0004\u0018\u00010/\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008i\u0010jR\u0013\u00100\u001a\u0004\u0018\u000101\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008k\u0010lR\u0013\u00102\u001a\u0004\u0018\u000103\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008m\u0010nR\u0013\u00104\u001a\u0004\u0018\u000105\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008o\u0010pR\u0013\u00106\u001a\u0004\u0018\u000107\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008q\u0010rR\u0013\u00108\u001a\u0004\u0018\u000109\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008s\u0010tR\u0015\u0010:\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\n\n\u0002\u0010w\u001a\u0004\u0008u\u0010vR\u001d\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020<0\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008x\u0010K\u00a8\u0006\u00a8\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
        "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;",
        "attachments",
        "",
        "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;",
        "channel",
        "Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;",
        "cid",
        "",
        "command",
        "created_at",
        "Ljava/util/Date;",
        "deleted_at",
        "html",
        "i18n",
        "",
        "id",
        "latest_reactions",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;",
        "mentioned_users",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "own_reactions",
        "parent_id",
        "pin_expires",
        "pinned",
        "",
        "pinned_at",
        "message_text_updated_at",
        "pinned_by",
        "quoted_message",
        "quoted_message_id",
        "reaction_counts",
        "",
        "reaction_scores",
        "reaction_groups",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;",
        "reply_count",
        "deleted_reply_count",
        "shadowed",
        "show_in_channel",
        "silent",
        "text",
        "thread_participants",
        "type",
        "updated_at",
        "user",
        "moderation_details",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;",
        "moderation",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;",
        "poll",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;",
        "reminder",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;",
        "shared_location",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;",
        "member",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;",
        "deleted_for_me",
        "extraData",
        "",
        "<init>",
        "(Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;IIZZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;Ljava/lang/Boolean;Ljava/util/Map;)V",
        "getAttachments",
        "()Ljava/util/List;",
        "getChannel",
        "()Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;",
        "getCid",
        "()Ljava/lang/String;",
        "getCommand",
        "getCreated_at",
        "()Ljava/util/Date;",
        "getDeleted_at",
        "getHtml",
        "getI18n",
        "()Ljava/util/Map;",
        "getId",
        "getLatest_reactions",
        "getMentioned_users",
        "getOwn_reactions",
        "getParent_id",
        "getPin_expires",
        "getPinned",
        "()Z",
        "getPinned_at",
        "getMessage_text_updated_at",
        "getPinned_by",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "getQuoted_message",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
        "getQuoted_message_id",
        "getReaction_counts",
        "getReaction_scores",
        "getReaction_groups",
        "getReply_count",
        "()I",
        "getDeleted_reply_count",
        "getShadowed",
        "getShow_in_channel",
        "getSilent",
        "getText",
        "getThread_participants",
        "getType",
        "getUpdated_at",
        "getUser",
        "getModeration_details",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;",
        "getModeration",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;",
        "getPoll",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;",
        "getReminder",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;",
        "getShared_location",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;",
        "getMember",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;",
        "getDeleted_for_me",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getExtraData",
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
        "copy",
        "(Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;IIZZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;Ljava/lang/Boolean;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
        "equals",
        "other",
        "hashCode",
        "toString",
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

.annotation runtime Lqx/t;
    generateAdapter = true
.end annotation


# instance fields
.field private final attachments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;",
            ">;"
        }
    .end annotation
.end field

.field private final channel:Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;

.field private final cid:Ljava/lang/String;

.field private final command:Ljava/lang/String;

.field private final created_at:Ljava/util/Date;

.field private final deleted_at:Ljava/util/Date;

.field private final deleted_for_me:Ljava/lang/Boolean;

.field private final deleted_reply_count:I

.field private final extraData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final html:Ljava/lang/String;

.field private final i18n:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final id:Ljava/lang/String;

.field private final latest_reactions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;",
            ">;"
        }
    .end annotation
.end field

.field private final member:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;

.field private final mentioned_users:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            ">;"
        }
    .end annotation
.end field

.field private final message_text_updated_at:Ljava/util/Date;

.field private final moderation:Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;

.field private final moderation_details:Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;

.field private final own_reactions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;",
            ">;"
        }
    .end annotation
.end field

.field private final parent_id:Ljava/lang/String;

.field private final pin_expires:Ljava/util/Date;

.field private final pinned:Z

.field private final pinned_at:Ljava/util/Date;

.field private final pinned_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

.field private final poll:Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;

.field private final quoted_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

.field private final quoted_message_id:Ljava/lang/String;

.field private final reaction_counts:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final reaction_groups:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;",
            ">;"
        }
    .end annotation
.end field

.field private final reaction_scores:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final reminder:Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;

.field private final reply_count:I

.field private final shadowed:Z

.field private final shared_location:Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;

.field private final show_in_channel:Z

.field private final silent:Z

.field private final text:Ljava/lang/String;

.field private final thread_participants:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            ">;"
        }
    .end annotation
.end field

.field private final type:Ljava/lang/String;

.field private final updated_at:Ljava/util/Date;

.field private final user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;


# direct methods
.method public constructor <init>(Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;IIZZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;Ljava/lang/Boolean;Ljava/util/Map;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;",
            ">;",
            "Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Z",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;",
            ">;IIZZZ",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;",
            "Ljava/lang/Boolean;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p5

    move-object/from16 v4, p7

    move-object/from16 v5, p8

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    move-object/from16 v10, p29

    move-object/from16 v11, p30

    move-object/from16 v12, p31

    move-object/from16 v13, p32

    move-object/from16 v14, p33

    move-object/from16 v15, p41

    const-string v0, "attachments"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "created_at"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "html"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "i18n"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latest_reactions"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentioned_users"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "own_reactions"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "thread_participants"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updated_at"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    .line 2
    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->attachments:Ljava/util/List;

    move-object/from16 v1, p2

    .line 3
    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;

    .line 4
    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->cid:Ljava/lang/String;

    move-object/from16 v1, p4

    .line 5
    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->command:Ljava/lang/String;

    .line 6
    iput-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->created_at:Ljava/util/Date;

    move-object/from16 v1, p6

    .line 7
    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_at:Ljava/util/Date;

    .line 8
    iput-object v4, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->html:Ljava/lang/String;

    .line 9
    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->i18n:Ljava/util/Map;

    .line 10
    iput-object v6, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->id:Ljava/lang/String;

    .line 11
    iput-object v7, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->latest_reactions:Ljava/util/List;

    .line 12
    iput-object v8, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->mentioned_users:Ljava/util/List;

    .line 13
    iput-object v9, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->own_reactions:Ljava/util/List;

    move-object/from16 v1, p13

    .line 14
    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->parent_id:Ljava/lang/String;

    move-object/from16 v1, p14

    .line 15
    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pin_expires:Ljava/util/Date;

    move/from16 v1, p15

    .line 16
    iput-boolean v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned:Z

    move-object/from16 v1, p16

    .line 17
    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned_at:Ljava/util/Date;

    move-object/from16 v1, p17

    .line 18
    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->message_text_updated_at:Ljava/util/Date;

    move-object/from16 v1, p18

    .line 19
    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    move-object/from16 v1, p19

    .line 20
    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->quoted_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    move-object/from16 v1, p20

    .line 21
    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->quoted_message_id:Ljava/lang/String;

    move-object/from16 v1, p21

    .line 22
    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_counts:Ljava/util/Map;

    move-object/from16 v1, p22

    .line 23
    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_scores:Ljava/util/Map;

    move-object/from16 v1, p23

    .line 24
    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_groups:Ljava/util/Map;

    move/from16 v1, p24

    .line 25
    iput v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reply_count:I

    move/from16 v1, p25

    .line 26
    iput v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_reply_count:I

    move/from16 v1, p26

    .line 27
    iput-boolean v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->shadowed:Z

    move/from16 v1, p27

    .line 28
    iput-boolean v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->show_in_channel:Z

    move/from16 v1, p28

    .line 29
    iput-boolean v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->silent:Z

    .line 30
    iput-object v10, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->text:Ljava/lang/String;

    .line 31
    iput-object v11, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->thread_participants:Ljava/util/List;

    .line 32
    iput-object v12, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->type:Ljava/lang/String;

    .line 33
    iput-object v13, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->updated_at:Ljava/util/Date;

    .line 34
    iput-object v14, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    move-object/from16 v1, p34

    .line 35
    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->moderation_details:Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;

    move-object/from16 v1, p35

    .line 36
    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->moderation:Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;

    move-object/from16 v1, p36

    .line 37
    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->poll:Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;

    move-object/from16 v1, p37

    .line 38
    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reminder:Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;

    move-object/from16 v1, p38

    .line 39
    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->shared_location:Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;

    move-object/from16 v1, p39

    .line 40
    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->member:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;

    move-object/from16 v1, p40

    .line 41
    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_for_me:Ljava/lang/Boolean;

    .line 42
    iput-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->extraData:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;IIZZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;Ljava/lang/Boolean;Ljava/util/Map;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 44

    move/from16 v0, p42

    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_0

    .line 43
    sget-object v1, Lm83/z;->w:Lm83/z;

    move-object v10, v1

    goto :goto_0

    :cond_0
    move-object/from16 v10, p8

    :goto_0
    and-int/lit16 v1, v0, 0x4000

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move/from16 v17, v2

    goto :goto_1

    :cond_1
    move/from16 v17, p15

    :goto_1
    const/high16 v1, 0x2000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_2

    move/from16 v28, v2

    goto :goto_2

    :cond_2
    move/from16 v28, p26

    :goto_2
    const/high16 v1, 0x4000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_3

    move/from16 v29, v2

    goto :goto_3

    :cond_3
    move/from16 v29, p27

    :goto_3
    const/high16 v1, 0x20000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_4

    .line 44
    sget-object v0, Lm83/y;->w:Lm83/y;

    move-object/from16 v32, v0

    goto :goto_4

    :cond_4
    move-object/from16 v32, p30

    :goto_4
    and-int/lit8 v0, p43, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    move-object/from16 v36, v1

    goto :goto_5

    :cond_5
    move-object/from16 v36, p34

    :goto_5
    and-int/lit8 v0, p43, 0x4

    if-eqz v0, :cond_6

    move-object/from16 v37, v1

    goto :goto_6

    :cond_6
    move-object/from16 v37, p35

    :goto_6
    and-int/lit8 v0, p43, 0x8

    if-eqz v0, :cond_7

    move-object/from16 v38, v1

    goto :goto_7

    :cond_7
    move-object/from16 v38, p36

    :goto_7
    and-int/lit8 v0, p43, 0x10

    if-eqz v0, :cond_8

    move-object/from16 v39, v1

    goto :goto_8

    :cond_8
    move-object/from16 v39, p37

    :goto_8
    and-int/lit8 v0, p43, 0x20

    if-eqz v0, :cond_9

    move-object/from16 v40, v1

    goto :goto_9

    :cond_9
    move-object/from16 v40, p38

    :goto_9
    and-int/lit8 v0, p43, 0x40

    if-eqz v0, :cond_a

    move-object/from16 v41, v1

    :goto_a
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    move-object/from16 v16, p14

    move-object/from16 v18, p16

    move-object/from16 v19, p17

    move-object/from16 v20, p18

    move-object/from16 v21, p19

    move-object/from16 v22, p20

    move-object/from16 v23, p21

    move-object/from16 v24, p22

    move-object/from16 v25, p23

    move/from16 v26, p24

    move/from16 v27, p25

    move/from16 v30, p28

    move-object/from16 v31, p29

    move-object/from16 v33, p31

    move-object/from16 v34, p32

    move-object/from16 v35, p33

    move-object/from16 v42, p40

    move-object/from16 v43, p41

    goto :goto_b

    :cond_a
    move-object/from16 v41, p39

    goto :goto_a

    .line 45
    :goto_b
    invoke-direct/range {v2 .. v43}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;-><init>(Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;IIZZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;Ljava/lang/Boolean;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;IIZZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;Ljava/lang/Boolean;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p42

    move/from16 v2, p43

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    iget-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->attachments:Ljava/util/List;

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-object v4, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;

    goto :goto_1

    :cond_1
    move-object/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->cid:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->command:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->created_at:Ljava/util/Date;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_at:Ljava/util/Date;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->html:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-object v10, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->i18n:Ljava/util/Map;

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-object v11, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->id:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-object v12, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->latest_reactions:Ljava/util/List;

    goto :goto_9

    :cond_9
    move-object/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-object v13, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->mentioned_users:Ljava/util/List;

    goto :goto_a

    :cond_a
    move-object/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-object v14, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->own_reactions:Ljava/util/List;

    goto :goto_b

    :cond_b
    move-object/from16 v14, p12

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->parent_id:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v15, p13

    :goto_c
    move-object/from16 p1, v3

    and-int/lit16 v3, v1, 0x2000

    if-eqz v3, :cond_d

    iget-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pin_expires:Ljava/util/Date;

    goto :goto_d

    :cond_d
    move-object/from16 v3, p14

    :goto_d
    move-object/from16 p2, v3

    and-int/lit16 v3, v1, 0x4000

    if-eqz v3, :cond_e

    iget-boolean v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned:Z

    goto :goto_e

    :cond_e
    move/from16 v3, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned_at:Ljava/util/Date;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p42, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->message_text_updated_at:Ljava/util/Date;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p42, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p42, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->quoted_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p42, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->quoted_message_id:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p42, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_counts:Ljava/util/Map;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p42, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_scores:Ljava/util/Map;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p42, v16

    move-object/from16 p9, v1

    if-eqz v16, :cond_16

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_groups:Ljava/util/Map;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p42, v16

    move-object/from16 p10, v1

    if-eqz v16, :cond_17

    iget v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reply_count:I

    goto :goto_17

    :cond_17
    move/from16 v1, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p42, v16

    move/from16 p11, v1

    if-eqz v16, :cond_18

    iget v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_reply_count:I

    goto :goto_18

    :cond_18
    move/from16 v1, p25

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p42, v16

    move/from16 p12, v1

    if-eqz v16, :cond_19

    iget-boolean v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->shadowed:Z

    goto :goto_19

    :cond_19
    move/from16 v1, p26

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, p42, v16

    move/from16 p13, v1

    if-eqz v16, :cond_1a

    iget-boolean v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->show_in_channel:Z

    goto :goto_1a

    :cond_1a
    move/from16 v1, p27

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v16, p42, v16

    move/from16 p14, v1

    if-eqz v16, :cond_1b

    iget-boolean v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->silent:Z

    goto :goto_1b

    :cond_1b
    move/from16 v1, p28

    :goto_1b
    const/high16 v16, 0x10000000

    and-int v16, p42, v16

    move/from16 p15, v1

    if-eqz v16, :cond_1c

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->text:Ljava/lang/String;

    goto :goto_1c

    :cond_1c
    move-object/from16 v1, p29

    :goto_1c
    const/high16 v16, 0x20000000

    and-int v16, p42, v16

    move-object/from16 p16, v1

    if-eqz v16, :cond_1d

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->thread_participants:Ljava/util/List;

    goto :goto_1d

    :cond_1d
    move-object/from16 v1, p30

    :goto_1d
    const/high16 v16, 0x40000000    # 2.0f

    and-int v16, p42, v16

    move-object/from16 p17, v1

    if-eqz v16, :cond_1e

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->type:Ljava/lang/String;

    goto :goto_1e

    :cond_1e
    move-object/from16 v1, p31

    :goto_1e
    const/high16 v16, -0x80000000

    and-int v16, p42, v16

    move-object/from16 p18, v1

    if-eqz v16, :cond_1f

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->updated_at:Ljava/util/Date;

    goto :goto_1f

    :cond_1f
    move-object/from16 v1, p32

    :goto_1f
    and-int/lit8 v16, v2, 0x1

    move-object/from16 p19, v1

    if-eqz v16, :cond_20

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    goto :goto_20

    :cond_20
    move-object/from16 v1, p33

    :goto_20
    and-int/lit8 v16, v2, 0x2

    move-object/from16 p20, v1

    if-eqz v16, :cond_21

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->moderation_details:Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;

    goto :goto_21

    :cond_21
    move-object/from16 v1, p34

    :goto_21
    and-int/lit8 v16, v2, 0x4

    move-object/from16 p21, v1

    if-eqz v16, :cond_22

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->moderation:Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;

    goto :goto_22

    :cond_22
    move-object/from16 v1, p35

    :goto_22
    and-int/lit8 v16, v2, 0x8

    move-object/from16 p22, v1

    if-eqz v16, :cond_23

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->poll:Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;

    goto :goto_23

    :cond_23
    move-object/from16 v1, p36

    :goto_23
    and-int/lit8 v16, v2, 0x10

    move-object/from16 p23, v1

    if-eqz v16, :cond_24

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reminder:Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;

    goto :goto_24

    :cond_24
    move-object/from16 v1, p37

    :goto_24
    and-int/lit8 v16, v2, 0x20

    move-object/from16 p24, v1

    if-eqz v16, :cond_25

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->shared_location:Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;

    goto :goto_25

    :cond_25
    move-object/from16 v1, p38

    :goto_25
    and-int/lit8 v16, v2, 0x40

    move-object/from16 p25, v1

    if-eqz v16, :cond_26

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->member:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;

    goto :goto_26

    :cond_26
    move-object/from16 v1, p39

    :goto_26
    move-object/from16 p26, v1

    and-int/lit16 v1, v2, 0x80

    if-eqz v1, :cond_27

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_for_me:Ljava/lang/Boolean;

    goto :goto_27

    :cond_27
    move-object/from16 v1, p40

    :goto_27
    and-int/lit16 v2, v2, 0x100

    if-eqz v2, :cond_28

    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->extraData:Ljava/util/Map;

    move-object/from16 p42, v2

    :goto_28
    move/from16 p27, p13

    move/from16 p28, p14

    move/from16 p29, p15

    move-object/from16 p30, p16

    move-object/from16 p31, p17

    move-object/from16 p32, p18

    move-object/from16 p33, p19

    move-object/from16 p34, p20

    move-object/from16 p35, p21

    move-object/from16 p36, p22

    move-object/from16 p37, p23

    move-object/from16 p38, p24

    move-object/from16 p39, p25

    move-object/from16 p40, p26

    move-object/from16 p41, v1

    move/from16 p16, v3

    move-object/from16 p13, v14

    move-object/from16 p14, v15

    move-object/from16 p15, p2

    move-object/from16 p17, p3

    move-object/from16 p18, p4

    move-object/from16 p19, p5

    move-object/from16 p20, p6

    move-object/from16 p21, p7

    move-object/from16 p22, p8

    move-object/from16 p23, p9

    move-object/from16 p24, p10

    move/from16 p25, p11

    move/from16 p26, p12

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_29

    :cond_28
    move-object/from16 p42, p41

    goto :goto_28

    :goto_29
    invoke-virtual/range {p1 .. p42}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->copy(Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;IIZZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;Ljava/lang/Boolean;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->attachments:Ljava/util/List;

    return-object v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->latest_reactions:Ljava/util/List;

    return-object v0
.end method

.method public final component11()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->mentioned_users:Ljava/util/List;

    return-object v0
.end method

.method public final component12()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->own_reactions:Ljava/util/List;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->parent_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pin_expires:Ljava/util/Date;

    return-object v0
.end method

.method public final component15()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned:Z

    return v0
.end method

.method public final component16()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component17()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->message_text_updated_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component18()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    return-object v0
.end method

.method public final component19()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->quoted_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;

    return-object v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->quoted_message_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component21()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_counts:Ljava/util/Map;

    return-object v0
.end method

.method public final component22()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_scores:Ljava/util/Map;

    return-object v0
.end method

.method public final component23()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_groups:Ljava/util/Map;

    return-object v0
.end method

.method public final component24()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reply_count:I

    return v0
.end method

.method public final component25()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_reply_count:I

    return v0
.end method

.method public final component26()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->shadowed:Z

    return v0
.end method

.method public final component27()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->show_in_channel:Z

    return v0
.end method

.method public final component28()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->silent:Z

    return v0
.end method

.method public final component29()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component30()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->thread_participants:Ljava/util/List;

    return-object v0
.end method

.method public final component31()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component32()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->updated_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component33()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    return-object v0
.end method

.method public final component34()Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->moderation_details:Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;

    return-object v0
.end method

.method public final component35()Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->moderation:Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;

    return-object v0
.end method

.method public final component36()Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->poll:Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;

    return-object v0
.end method

.method public final component37()Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reminder:Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;

    return-object v0
.end method

.method public final component38()Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->shared_location:Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;

    return-object v0
.end method

.method public final component39()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->member:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->command:Ljava/lang/String;

    return-object v0
.end method

.method public final component40()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_for_me:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component41()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final component5()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->created_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component6()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->html:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->i18n:Ljava/util/Map;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;IIZZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;Ljava/lang/Boolean;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;",
            ">;",
            "Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Z",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;",
            ">;IIZZZ",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;",
            "Ljava/lang/Boolean;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;"
        }
    .end annotation

    const-string v0, "attachments"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "created_at"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "html"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "i18n"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latest_reactions"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentioned_users"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "own_reactions"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    move-object/from16 v1, p29

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "thread_participants"

    move-object/from16 v3, p30

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v5, p31

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updated_at"

    move-object/from16 v7, p32

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    move-object/from16 v14, p33

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v15, p41

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    move/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    move/from16 v25, p24

    move/from16 v26, p25

    move/from16 v27, p26

    move/from16 v28, p27

    move/from16 v29, p28

    move-object/from16 v30, p29

    move-object/from16 v35, p34

    move-object/from16 v36, p35

    move-object/from16 v37, p36

    move-object/from16 v38, p37

    move-object/from16 v39, p38

    move-object/from16 v40, p39

    move-object/from16 v41, p40

    move-object/from16 v31, v3

    move-object/from16 v32, v5

    move-object/from16 v33, v7

    move-object/from16 v34, v14

    move-object/from16 v42, v15

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v7, p6

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    invoke-direct/range {v1 .. v42}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;-><init>(Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;IIZZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;Ljava/lang/Boolean;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->attachments:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->attachments:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->command:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->command:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->created_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->created_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->html:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->html:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->i18n:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->i18n:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->latest_reactions:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->latest_reactions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->mentioned_users:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->mentioned_users:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->own_reactions:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->own_reactions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->parent_id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->parent_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pin_expires:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pin_expires:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned:Z

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->message_text_updated_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->message_text_updated_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->quoted_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->quoted_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->quoted_message_id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->quoted_message_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_counts:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_counts:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_scores:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_scores:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_groups:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_groups:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reply_count:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reply_count:I

    if-eq v1, v3, :cond_19

    return v2

    :cond_19
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_reply_count:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_reply_count:I

    if-eq v1, v3, :cond_1a

    return v2

    :cond_1a
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->shadowed:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->shadowed:Z

    if-eq v1, v3, :cond_1b

    return v2

    :cond_1b
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->show_in_channel:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->show_in_channel:Z

    if-eq v1, v3, :cond_1c

    return v2

    :cond_1c
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->silent:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->silent:Z

    if-eq v1, v3, :cond_1d

    return v2

    :cond_1d
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->text:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->text:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->thread_participants:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->thread_participants:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    return v2

    :cond_1f
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->updated_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->updated_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    return v2

    :cond_21
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v2

    :cond_22
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->moderation_details:Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->moderation_details:Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    return v2

    :cond_23
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->moderation:Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->moderation:Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    return v2

    :cond_24
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->poll:Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->poll:Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    return v2

    :cond_25
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reminder:Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reminder:Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_26

    return v2

    :cond_26
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->shared_location:Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->shared_location:Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    return v2

    :cond_27
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->member:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->member:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    return v2

    :cond_28
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_for_me:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_for_me:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    return v2

    :cond_29
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->extraData:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->extraData:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2a

    return v2

    :cond_2a
    return v0
.end method

.method public final getAttachments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->attachments:Ljava/util/List;

    return-object v0
.end method

.method public final getChannel()Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;

    return-object v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCommand()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->command:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreated_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->created_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getDeleted_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getDeleted_for_me()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_for_me:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getDeleted_reply_count()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_reply_count:I

    return v0
.end method

.method public final getExtraData()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final getHtml()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->html:Ljava/lang/String;

    return-object v0
.end method

.method public final getI18n()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->i18n:Ljava/util/Map;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLatest_reactions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->latest_reactions:Ljava/util/List;

    return-object v0
.end method

.method public final getMember()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->member:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;

    return-object v0
.end method

.method public final getMentioned_users()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->mentioned_users:Ljava/util/List;

    return-object v0
.end method

.method public final getMessage_text_updated_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->message_text_updated_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getModeration()Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->moderation:Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;

    return-object v0
.end method

.method public final getModeration_details()Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->moderation_details:Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;

    return-object v0
.end method

.method public final getOwn_reactions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->own_reactions:Ljava/util/List;

    return-object v0
.end method

.method public final getParent_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->parent_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getPin_expires()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pin_expires:Ljava/util/Date;

    return-object v0
.end method

.method public final getPinned()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned:Z

    return v0
.end method

.method public final getPinned_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getPinned_by()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    return-object v0
.end method

.method public final getPoll()Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->poll:Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;

    return-object v0
.end method

.method public final getQuoted_message()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->quoted_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    return-object v0
.end method

.method public final getQuoted_message_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->quoted_message_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getReaction_counts()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_counts:Ljava/util/Map;

    return-object v0
.end method

.method public final getReaction_groups()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_groups:Ljava/util/Map;

    return-object v0
.end method

.method public final getReaction_scores()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_scores:Ljava/util/Map;

    return-object v0
.end method

.method public final getReminder()Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reminder:Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;

    return-object v0
.end method

.method public final getReply_count()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reply_count:I

    return v0
.end method

.method public final getShadowed()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->shadowed:Z

    return v0
.end method

.method public final getShared_location()Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->shared_location:Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;

    return-object v0
.end method

.method public final getShow_in_channel()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->show_in_channel:Z

    return v0
.end method

.method public final getSilent()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->silent:Z

    return v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final getThread_participants()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->thread_participants:Ljava/util/List;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdated_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->updated_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getUser()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->attachments:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->cid:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->command:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->created_at:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_at:Ljava/util/Date;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->html:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->i18n:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->latest_reactions:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->mentioned_users:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->own_reactions:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->parent_id:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pin_expires:Ljava/util/Date;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned_at:Ljava/util/Date;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->message_text_updated_at:Ljava/util/Date;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->quoted_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->quoted_message_id:Ljava/lang/String;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_counts:Ljava/util/Map;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_scores:Ljava/util/Map;

    if-nez v2, :cond_b

    move v2, v3

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_groups:Ljava/util/Map;

    if-nez v2, :cond_c

    move v2, v3

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reply_count:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_reply_count:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->shadowed:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->show_in_channel:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->silent:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->text:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->thread_participants:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->type:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->updated_at:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    invoke-static {v2, v0, v1}, Lc13/a;->c(Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->moderation_details:Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;

    if-nez v2, :cond_d

    move v2, v3

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->moderation:Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;

    if-nez v2, :cond_e

    move v2, v3

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;->hashCode()I

    move-result v2

    :goto_e
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->poll:Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;

    if-nez v2, :cond_f

    move v2, v3

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->hashCode()I

    move-result v2

    :goto_f
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reminder:Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;

    if-nez v2, :cond_10

    move v2, v3

    goto :goto_10

    :cond_10
    invoke-virtual {v2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;->hashCode()I

    move-result v2

    :goto_10
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->shared_location:Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;

    if-nez v2, :cond_11

    move v2, v3

    goto :goto_11

    :cond_11
    invoke-virtual {v2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->hashCode()I

    move-result v2

    :goto_11
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->member:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;

    if-nez v2, :cond_12

    move v2, v3

    goto :goto_12

    :cond_12
    invoke-virtual {v2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;->hashCode()I

    move-result v2

    :goto_12
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_for_me:Ljava/lang/Boolean;

    if-nez v2, :cond_13

    goto :goto_13

    :cond_13
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_13
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->extraData:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 43

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->attachments:Ljava/util/List;

    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;

    iget-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->cid:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->command:Ljava/lang/String;

    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->created_at:Ljava/util/Date;

    iget-object v6, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_at:Ljava/util/Date;

    iget-object v7, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->html:Ljava/lang/String;

    iget-object v8, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->i18n:Ljava/util/Map;

    iget-object v9, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->id:Ljava/lang/String;

    iget-object v10, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->latest_reactions:Ljava/util/List;

    iget-object v11, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->mentioned_users:Ljava/util/List;

    iget-object v12, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->own_reactions:Ljava/util/List;

    iget-object v13, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->parent_id:Ljava/lang/String;

    iget-object v14, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pin_expires:Ljava/util/Date;

    iget-boolean v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned:Z

    move/from16 v16, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned_at:Ljava/util/Date;

    move-object/from16 v17, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->message_text_updated_at:Ljava/util/Date;

    move-object/from16 v18, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->pinned_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    move-object/from16 v19, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->quoted_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    move-object/from16 v20, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->quoted_message_id:Ljava/lang/String;

    move-object/from16 v21, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_counts:Ljava/util/Map;

    move-object/from16 v22, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_scores:Ljava/util/Map;

    move-object/from16 v23, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reaction_groups:Ljava/util/Map;

    move-object/from16 v24, v15

    iget v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reply_count:I

    move/from16 v25, v15

    iget v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_reply_count:I

    move/from16 v26, v15

    iget-boolean v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->shadowed:Z

    move/from16 v27, v15

    iget-boolean v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->show_in_channel:Z

    move/from16 v28, v15

    iget-boolean v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->silent:Z

    move/from16 v29, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->text:Ljava/lang/String;

    move-object/from16 v30, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->thread_participants:Ljava/util/List;

    move-object/from16 v31, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->type:Ljava/lang/String;

    move-object/from16 v32, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->updated_at:Ljava/util/Date;

    move-object/from16 v33, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    move-object/from16 v34, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->moderation_details:Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;

    move-object/from16 v35, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->moderation:Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;

    move-object/from16 v36, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->poll:Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;

    move-object/from16 v37, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->reminder:Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;

    move-object/from16 v38, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->shared_location:Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;

    move-object/from16 v39, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->member:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;

    move-object/from16 v40, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->deleted_for_me:Ljava/lang/Boolean;

    move-object/from16 v41, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->extraData:Ljava/util/Map;

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v42, v15

    const-string v15, "DownstreamMessageDto(attachments="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", channel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", command="

    const-string v2, ", created_at="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", deleted_at="

    const-string v2, ", html="

    invoke-static {v0, v5, v1, v6, v2}, Lhc3/i;->n(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    const-string v1, ", i18n="

    const-string v2, ", id="

    invoke-static {v0, v7, v1, v8, v2}, Lvl/b;->w(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    const-string v1, ", latest_reactions="

    const-string v2, ", mentioned_users="

    invoke-static {v9, v1, v2, v0, v10}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", own_reactions="

    const-string v2, ", parent_id="

    invoke-static {v0, v11, v1, v12, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    const-string v1, ", pin_expires="

    const-string v2, ", pinned="

    invoke-static {v0, v13, v1, v14, v2}, Lev/n;->z(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", pinned_at="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", message_text_updated_at="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pinned_by="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", quoted_message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", quoted_message_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", reaction_counts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", reaction_scores="

    const-string v2, ", reaction_groups="

    move-object/from16 v3, v22

    move-object/from16 v4, v23

    invoke-static {v0, v3, v1, v4, v2}, Lc13/a;->x(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", reply_count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", deleted_reply_count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", shadowed="

    const-string v2, ", show_in_channel="

    move/from16 v3, v26

    move/from16 v4, v27

    invoke-static {v3, v1, v2, v0, v4}, Lev/n;->t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    const-string v1, ", silent="

    const-string v2, ", text="

    move/from16 v3, v28

    move/from16 v4, v29

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", thread_participants="

    const-string v2, ", type="

    move-object/from16 v3, v30

    move-object/from16 v4, v31

    invoke-static {v3, v1, v2, v0, v4}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", updated_at="

    const-string v2, ", user="

    move-object/from16 v3, v32

    move-object/from16 v4, v33

    invoke-static {v0, v3, v1, v4, v2}, Lev/n;->z(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    move-object/from16 v1, v34

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", moderation_details="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", moderation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", poll="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v37

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", reminder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v38

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shared_location="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v39

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", member="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deleted_for_me="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v41

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", extraData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    move-object/from16 v2, v42

    invoke-static {v0, v2, v1}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
