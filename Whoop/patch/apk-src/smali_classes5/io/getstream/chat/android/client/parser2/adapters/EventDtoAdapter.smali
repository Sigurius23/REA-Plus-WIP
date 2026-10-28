.class public final Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c6\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n*\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0017R(\u0010\u0019\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00180\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR8\u0010\u001d\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001aR8\u0010\u001f\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010\u001e0\u001e \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010\u001e0\u001e\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u001aR8\u0010!\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010 0  \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010 0 \u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u001aR8\u0010#\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010\"0\" \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010\"0\"\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010\u001aR8\u0010%\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010$0$ \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010$0$\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010\u001aR8\u0010\'\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010&0& \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010&0&\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010\u001aR8\u0010)\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010(0( \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010(0(\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010\u001aR8\u0010+\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010*0* \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010*0*\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010\u001aR8\u0010-\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010,0, \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010,0,\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010\u001aR8\u0010/\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010.0. \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010.0.\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u0010\u001aR8\u00101\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010000 \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010000\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u0010\u001aR8\u00103\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010202 \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010202\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u0010\u001aR8\u00105\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010404 \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010404\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u0010\u001aR8\u00107\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010606 \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010606\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u0010\u001aR8\u00109\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010808 \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010808\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010\u001aR8\u0010;\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010:0: \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010:0:\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010\u001aR8\u0010=\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010<0< \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010<0<\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010\u001aR8\u0010?\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010>0> \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010>0>\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010\u001aR8\u0010A\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010@0@ \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010@0@\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010\u001aR8\u0010C\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010B0B \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010B0B\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010\u001aR8\u0010E\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010D0D \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010D0D\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010\u001aR8\u0010G\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010F0F \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010F0F\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008G\u0010\u001aR8\u0010I\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010H0H \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010H0H\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010\u001aR8\u0010K\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010J0J \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010J0J\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008K\u0010\u001aR8\u0010M\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010L0L \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010L0L\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010\u001aR8\u0010O\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010N0N \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010N0N\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010\u001aR8\u0010Q\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010P0P \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010P0P\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Q\u0010\u001aR8\u0010S\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010R0R \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010R0R\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010\u001aR8\u0010U\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010T0T \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010T0T\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010\u001aR8\u0010W\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010V0V \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010V0V\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008W\u0010\u001aR8\u0010Y\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010X0X \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010X0X\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Y\u0010\u001aR8\u0010[\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010Z0Z \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010Z0Z\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008[\u0010\u001aR8\u0010]\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010\\0\\ \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010\\0\\\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008]\u0010\u001aR8\u0010_\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010^0^ \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010^0^\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008_\u0010\u001aR8\u0010a\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010`0` \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010`0`\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008a\u0010\u001aR8\u0010c\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010b0b \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010b0b\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008c\u0010\u001aR8\u0010e\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010d0d \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010d0d\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008e\u0010\u001aR8\u0010g\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010f0f \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010f0f\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008g\u0010\u001aR8\u0010i\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010h0h \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010h0h\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008i\u0010\u001aR8\u0010k\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010j0j \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010j0j\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008k\u0010\u001aR8\u0010m\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010l0l \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010l0l\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008m\u0010\u001aR8\u0010o\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010n0n \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010n0n\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008o\u0010\u001aR8\u0010q\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010p0p \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010p0p\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008q\u0010\u001aR8\u0010s\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010r0r \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010r0r\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008s\u0010\u001aR8\u0010u\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010t0t \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010t0t\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008u\u0010\u001aR8\u0010w\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010v0v \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010v0v\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008w\u0010\u001aR8\u0010y\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010x0x \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010x0x\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008y\u0010\u001aR8\u0010{\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010z0z \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010z0z\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008{\u0010\u001aR8\u0010}\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010|0| \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010|0|\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008}\u0010\u001aR8\u0010\u007f\u001a&\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010~0~ \u001c*\u0012\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010~0~\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u007f\u0010\u001aR>\u0010\u0081\u0001\u001a*\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u0080\u00010\u0080\u0001 \u001c*\u0014\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u0080\u00010\u0080\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0081\u0001\u0010\u001aR>\u0010\u0083\u0001\u001a*\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u0082\u00010\u0082\u0001 \u001c*\u0014\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u0082\u00010\u0082\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0083\u0001\u0010\u001aR>\u0010\u0085\u0001\u001a*\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u0084\u00010\u0084\u0001 \u001c*\u0014\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u0084\u00010\u0084\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0085\u0001\u0010\u001aR>\u0010\u0087\u0001\u001a*\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u0086\u00010\u0086\u0001 \u001c*\u0014\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u0086\u00010\u0086\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0087\u0001\u0010\u001aR>\u0010\u0089\u0001\u001a*\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u0088\u00010\u0088\u0001 \u001c*\u0014\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u0088\u00010\u0088\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0089\u0001\u0010\u001aR>\u0010\u008b\u0001\u001a*\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u008a\u00010\u008a\u0001 \u001c*\u0014\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u008a\u00010\u008a\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u008b\u0001\u0010\u001aR>\u0010\u008d\u0001\u001a*\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u008c\u00010\u008c\u0001 \u001c*\u0014\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u008c\u00010\u008c\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u008d\u0001\u0010\u001aR>\u0010\u008f\u0001\u001a*\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u008e\u00010\u008e\u0001 \u001c*\u0014\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u008e\u00010\u008e\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u008f\u0001\u0010\u001aR>\u0010\u0091\u0001\u001a*\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u0090\u00010\u0090\u0001 \u001c*\u0014\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u0090\u00010\u0090\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0091\u0001\u0010\u001aR>\u0010\u0093\u0001\u001a*\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u0092\u00010\u0092\u0001 \u001c*\u0014\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u0092\u00010\u0092\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0093\u0001\u0010\u001aR>\u0010\u0095\u0001\u001a*\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u0094\u00010\u0094\u0001 \u001c*\u0014\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u0094\u00010\u0094\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0095\u0001\u0010\u001aR>\u0010\u0097\u0001\u001a*\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u0096\u00010\u0096\u0001 \u001c*\u0014\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u0096\u00010\u0096\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0097\u0001\u0010\u001aR>\u0010\u0099\u0001\u001a*\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u0098\u00010\u0098\u0001 \u001c*\u0014\u0012\u000e\u0012\u000c \u001c*\u0005\u0018\u00010\u0098\u00010\u0098\u0001\u0018\u00010\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0099\u0001\u0010\u001a\u00a8\u0006\u009a\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;",
        "Lqx/l0;",
        "moshi",
        "<init>",
        "(Lqx/l0;)V",
        "",
        "",
        "",
        "",
        "containsAnswer",
        "(Ljava/util/Map;)Z",
        "Lcom/squareup/moshi/JsonReader;",
        "reader",
        "fromJson",
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;",
        "Lqx/c0;",
        "writer",
        "value",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;)V",
        "Lqx/l0;",
        "",
        "mapAdapter",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/api2/model/dto/ConnectedEventDto;",
        "kotlin.jvm.PlatformType",
        "connectedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/ConnectionErrorEventDto;",
        "connectionErrorEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/HealthEventDto;",
        "healthEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DraftMessageUpdatedEventDto;",
        "draftMessageUpdatedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DraftMessageDeletedEventDto;",
        "draftMessageDeletedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/NewMessageEventDto;",
        "newMessageEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/MessageDeletedEventDto;",
        "messageDeletedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/MessageUpdatedEventDto;",
        "messageUpdatedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/MessageReadEventDto;",
        "messageReadEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/MessageDeliveredEventDto;",
        "messageDeliveredEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/TypingStartEventDto;",
        "typingStartEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/TypingStopEventDto;",
        "typingStopEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/ReactionNewEventDto;",
        "reactionNewEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/ReactionUpdateEventDto;",
        "reactionUpdateEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/ReactionDeletedEventDto;",
        "reactionDeletedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/MemberAddedEventDto;",
        "memberAddedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/MemberRemovedEventDto;",
        "memberRemovedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/MemberUpdatedEventDto;",
        "memberUpdatedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/ChannelUpdatedByUserEventDto;",
        "channelUpdatedByUserEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/ChannelUpdatedEventDto;",
        "channelUpdatedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/ChannelHiddenEventDto;",
        "channelHiddenEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;",
        "channelDeletedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/ChannelVisibleEventDto;",
        "channelVisibleEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/ChannelTruncatedEventDto;",
        "channelTruncatedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/UserStartWatchingEventDto;",
        "userStartWatchingEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/UserStopWatchingEventDto;",
        "userStopWatchingEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/NotificationAddedToChannelEventDto;",
        "notificationAddedToChannelEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkReadEventDto;",
        "notificationMarkReadEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;",
        "notificationMarkUnreadEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;",
        "markAllReadEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/NotificationMessageNewEventDto;",
        "notificationMessageNewEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;",
        "notificationThreadMessageNewEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/ThreadUpdatedEventDto;",
        "threadUpdatedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/NotificationInvitedEventDto;",
        "notificationInvitedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/NotificationInviteAcceptedEventDto;",
        "notificationInviteAcceptedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/NotificationInviteRejectedEventDto;",
        "notificationInviteRejectedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/NotificationRemovedFromChannelEventDto;",
        "notificationRemovedFromChannelEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/NotificationMutesUpdatedEventDto;",
        "notificationMutesUpdatedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/NotificationChannelMutesUpdatedEventDto;",
        "notificationChannelMutesUpdatedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/NotificationChannelDeletedEventDto;",
        "notificationChannelDeletedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/NotificationChannelTruncatedEventDto;",
        "notificationChannelTruncatedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/UserPresenceChangedEventDto;",
        "userPresenceChangedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/UserUpdatedEventDto;",
        "userUpdatedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/UserDeletedEventDto;",
        "userDeletedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/ChannelUserBannedEventDto;",
        "channelUserBannedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/GlobalUserBannedEventDto;",
        "globalUserBannedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/ChannelUserUnbannedEventDto;",
        "channelUserUnbannedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/GlobalUserUnbannedEventDto;",
        "globalUserUnbannedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/PollUpdatedEventDto;",
        "pollUpdatedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/PollDeletedEventDto;",
        "pollDeletedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/PollClosedEventDto;",
        "pollClosedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/VoteCastedEventDto;",
        "voteCastedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/VoteChangedEventDto;",
        "voteChangedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/AnswerCastedEventDto;",
        "answerCastedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/VoteRemovedEventDto;",
        "voteRemovedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/ReminderCreatedEventDto;",
        "reminderCreatedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/ReminderUpdatedEventDto;",
        "reminderUpdatedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/ReminderDeletedEventDto;",
        "reminderDeletedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/NotificationReminderDueEventDto;",
        "notificationReminderDueEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/UserMessagesDeletedEventDto;",
        "userMessagesDeletedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/AIIndicatorUpdatedEventDto;",
        "aiTypingIndicatorUpdatedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/AIIndicatorClearEventDto;",
        "aiTypingIndicatorClearEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/AIIndicatorStopEventDto;",
        "aiTypingIndicatorStopEventAdapter",
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
.field private final aiTypingIndicatorClearEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/AIIndicatorClearEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final aiTypingIndicatorStopEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/AIIndicatorStopEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final aiTypingIndicatorUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/AIIndicatorUpdatedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final answerCastedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/AnswerCastedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final channelDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final channelHiddenEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/ChannelHiddenEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final channelTruncatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/ChannelTruncatedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final channelUpdatedByUserEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/ChannelUpdatedByUserEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final channelUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/ChannelUpdatedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final channelUserBannedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/ChannelUserBannedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final channelUserUnbannedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/ChannelUserUnbannedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final channelVisibleEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/ChannelVisibleEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final connectedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/ConnectedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final connectionErrorEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/ConnectionErrorEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final draftMessageDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/DraftMessageDeletedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final draftMessageUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/DraftMessageUpdatedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final globalUserBannedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/GlobalUserBannedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final globalUserUnbannedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/GlobalUserUnbannedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final healthEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/HealthEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final mapAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private final markAllReadEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final memberAddedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/MemberAddedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final memberRemovedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/MemberRemovedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final memberUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/MemberUpdatedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final messageDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/MessageDeletedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final messageDeliveredEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/MessageDeliveredEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final messageReadEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/MessageReadEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final messageUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/MessageUpdatedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final moshi:Lqx/l0;

.field private final newMessageEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/NewMessageEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final notificationAddedToChannelEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/NotificationAddedToChannelEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final notificationChannelDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/NotificationChannelDeletedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final notificationChannelMutesUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/NotificationChannelMutesUpdatedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final notificationChannelTruncatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/NotificationChannelTruncatedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final notificationInviteAcceptedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/NotificationInviteAcceptedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final notificationInviteRejectedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/NotificationInviteRejectedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final notificationInvitedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/NotificationInvitedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final notificationMarkReadEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkReadEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final notificationMarkUnreadEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final notificationMessageNewEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/NotificationMessageNewEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final notificationMutesUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/NotificationMutesUpdatedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final notificationReminderDueEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/NotificationReminderDueEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final notificationRemovedFromChannelEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/NotificationRemovedFromChannelEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final notificationThreadMessageNewEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final pollClosedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/PollClosedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final pollDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/PollDeletedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final pollUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/PollUpdatedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final reactionDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/ReactionDeletedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final reactionNewEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/ReactionNewEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final reactionUpdateEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/ReactionUpdateEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final reminderCreatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/ReminderCreatedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final reminderDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/ReminderDeletedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final reminderUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/ReminderUpdatedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final threadUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/ThreadUpdatedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final typingStartEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/TypingStartEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final typingStopEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/TypingStopEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final userDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/UserDeletedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final userMessagesDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/UserMessagesDeletedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final userPresenceChangedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/UserPresenceChangedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final userStartWatchingEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/UserStartWatchingEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final userStopWatchingEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/UserStopWatchingEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final userUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/UserUpdatedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final voteCastedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/VoteCastedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final voteChangedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/VoteChangedEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final voteRemovedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/VoteRemovedEventDto;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lqx/l0;)V
    .locals 3

    const-string v0, "moshi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->moshi:Lqx/l0;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/reflect/Type;

    const-class v1, Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Ljava/lang/Object;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-class v1, Ljava/util/Map;

    invoke-static {v1, v0}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v0

    sget-object v1, Lrx/f;->a:Ljava/util/Set;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->mapAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/ConnectedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->connectedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/ConnectionErrorEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->connectionErrorEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/HealthEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->healthEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/DraftMessageUpdatedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->draftMessageUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/DraftMessageDeletedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->draftMessageDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/NewMessageEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->newMessageEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/MessageDeletedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->messageDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/MessageUpdatedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->messageUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/MessageReadEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->messageReadEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/MessageDeliveredEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->messageDeliveredEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/TypingStartEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->typingStartEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/TypingStopEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->typingStopEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/ReactionNewEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->reactionNewEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/ReactionUpdateEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->reactionUpdateEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/ReactionDeletedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->reactionDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/MemberAddedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->memberAddedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/MemberRemovedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->memberRemovedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/MemberUpdatedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->memberUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/ChannelUpdatedByUserEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->channelUpdatedByUserEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/ChannelUpdatedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->channelUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/ChannelHiddenEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->channelHiddenEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->channelDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/ChannelVisibleEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->channelVisibleEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/ChannelTruncatedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->channelTruncatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/UserStartWatchingEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->userStartWatchingEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/UserStopWatchingEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->userStopWatchingEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationAddedToChannelEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationAddedToChannelEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkReadEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationMarkReadEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationMarkUnreadEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->markAllReadEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMessageNewEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationMessageNewEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationThreadMessageNewEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/ThreadUpdatedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->threadUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationInvitedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationInvitedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationInviteAcceptedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationInviteAcceptedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationInviteRejectedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationInviteRejectedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationRemovedFromChannelEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationRemovedFromChannelEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMutesUpdatedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationMutesUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationChannelMutesUpdatedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationChannelMutesUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationChannelDeletedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationChannelDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationChannelTruncatedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationChannelTruncatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/UserPresenceChangedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->userPresenceChangedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/UserUpdatedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->userUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/UserDeletedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->userDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/ChannelUserBannedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->channelUserBannedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/GlobalUserBannedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->globalUserBannedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/ChannelUserUnbannedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->channelUserUnbannedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/GlobalUserUnbannedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->globalUserUnbannedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/PollUpdatedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->pollUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/PollDeletedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->pollDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/PollClosedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->pollClosedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/VoteCastedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->voteCastedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/VoteChangedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->voteChangedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/AnswerCastedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->answerCastedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/VoteRemovedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->voteRemovedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/ReminderCreatedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->reminderCreatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/ReminderUpdatedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->reminderUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/ReminderDeletedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->reminderDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationReminderDueEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationReminderDueEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/UserMessagesDeletedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->userMessagesDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/AIIndicatorUpdatedEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->aiTypingIndicatorUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/AIIndicatorClearEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->aiTypingIndicatorClearEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/AIIndicatorStopEventDto;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->aiTypingIndicatorStopEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method

.method private final containsAnswer(Ljava/util/Map;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "poll_vote"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/util/Map;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    const-string v0, "is_answer"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v1

    :goto_1
    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    move-object v1, p1

    check-cast v1, Ljava/lang/Boolean;

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;
    .locals 6

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    sget-object v1, Lqx/w;->I:Lqx/w;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->i()V

    return-object v2

    .line 4
    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->mapAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Ljava/util/Map;

    .line 5
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 6
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 7
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 8
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 9
    :cond_2
    const-string p1, "type"

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Ljava/lang/String;

    if-eqz v1, :cond_3

    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    :cond_3
    const-string p1, "user"

    if-eqz v2, :cond_45

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v3, 0x1

    const-string v4, "cid"

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string v1, "notification.invite_rejected"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto/16 :goto_2

    .line 10
    :cond_4
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationInviteRejectedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 11
    :sswitch_1
    const-string v1, "notification.message_new"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto/16 :goto_2

    .line 12
    :cond_5
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationMessageNewEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 13
    :sswitch_2
    const-string v1, "user.watching.start"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto/16 :goto_2

    .line 14
    :cond_6
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->userStartWatchingEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 15
    :sswitch_3
    const-string v1, "notification.mark_read"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto/16 :goto_2

    .line 16
    :cond_7
    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationMarkReadEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 17
    :cond_8
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->markAllReadEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 18
    :sswitch_4
    const-string v1, "user.updated"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto/16 :goto_2

    .line 19
    :cond_9
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->userUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 20
    :sswitch_5
    const-string v1, "reminder.updated"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto/16 :goto_2

    .line 21
    :cond_a
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->reminderUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 22
    :sswitch_6
    const-string v1, "notification.channel_mutes_updated"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    goto/16 :goto_2

    .line 23
    :cond_b
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationChannelMutesUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 24
    :sswitch_7
    const-string v1, "notification.added_to_channel"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    goto/16 :goto_2

    .line 25
    :cond_c
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationAddedToChannelEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 26
    :sswitch_8
    const-string v1, "poll.vote_removed"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    goto/16 :goto_2

    .line 27
    :cond_d
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->voteRemovedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 28
    :sswitch_9
    const-string v1, "message.delivered"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    goto/16 :goto_2

    .line 29
    :cond_e
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->messageDeliveredEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 30
    :sswitch_a
    const-string v1, "message.deleted"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    goto/16 :goto_2

    .line 31
    :cond_f
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->messageDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 32
    :sswitch_b
    const-string v1, "notification.mutes_updated"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    goto/16 :goto_2

    .line 33
    :cond_10
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationMutesUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 34
    :sswitch_c
    const-string v1, "poll.vote_changed"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    goto/16 :goto_2

    .line 35
    :cond_11
    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->containsAnswer(Ljava/util/Map;)Z

    move-result p1

    if-ne p1, v3, :cond_12

    .line 36
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->answerCastedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 37
    :cond_12
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->voteChangedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 38
    :sswitch_d
    const-string v1, "poll.updated"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    goto/16 :goto_2

    .line 39
    :cond_13
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->pollUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 40
    :sswitch_e
    const-string v1, "draft.updated"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    goto/16 :goto_2

    .line 41
    :cond_14
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->draftMessageUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 42
    :sswitch_f
    const-string v1, "notification.invite_accepted"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    goto/16 :goto_2

    .line 43
    :cond_15
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationInviteAcceptedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 44
    :sswitch_10
    const-string v1, "channel.deleted"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    goto/16 :goto_2

    .line 45
    :cond_16
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->channelDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 46
    :sswitch_11
    const-string v1, "ai_indicator.stop"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    goto/16 :goto_2

    .line 47
    :cond_17
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->aiTypingIndicatorStopEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 48
    :sswitch_12
    const-string v1, "poll.vote_casted"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    goto/16 :goto_2

    .line 49
    :cond_18
    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->containsAnswer(Ljava/util/Map;)Z

    move-result p1

    if-ne p1, v3, :cond_19

    .line 50
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->answerCastedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 51
    :cond_19
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->voteCastedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 52
    :sswitch_13
    const-string v1, "connection.error"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    goto/16 :goto_2

    .line 53
    :cond_1a
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->connectionErrorEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 54
    :sswitch_14
    const-string v1, "reaction.deleted"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    goto/16 :goto_2

    .line 55
    :cond_1b
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->reactionDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 56
    :sswitch_15
    const-string v1, "user.messages.deleted"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    goto/16 :goto_2

    .line 57
    :cond_1c
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->userMessagesDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 58
    :sswitch_16
    const-string v1, "notification.channel_truncated"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    goto/16 :goto_2

    .line 59
    :cond_1d
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationChannelTruncatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 60
    :sswitch_17
    const-string v1, "health.check"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    goto/16 :goto_2

    .line 61
    :cond_1e
    const-string p1, "me"

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1f

    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->connectedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 62
    :cond_1f
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->healthEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 63
    :sswitch_18
    const-string v1, "channel.visible"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    goto/16 :goto_2

    .line 64
    :cond_20
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->channelVisibleEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 65
    :sswitch_19
    const-string v1, "member.removed"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    goto/16 :goto_2

    .line 66
    :cond_21
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->memberRemovedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 67
    :sswitch_1a
    const-string v1, "notification.thread_message_new"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    goto/16 :goto_2

    .line 68
    :cond_22
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationThreadMessageNewEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 69
    :sswitch_1b
    const-string v1, "notification.reminder_due"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    goto/16 :goto_2

    .line 70
    :cond_23
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationReminderDueEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 71
    :sswitch_1c
    const-string v1, "user.deleted"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    goto/16 :goto_2

    .line 72
    :cond_24
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->userDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 73
    :sswitch_1d
    const-string v1, "typing.stop"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    goto/16 :goto_2

    .line 74
    :cond_25
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->typingStopEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 75
    :sswitch_1e
    const-string v1, "typing.start"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_26

    goto/16 :goto_2

    .line 76
    :cond_26
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->typingStartEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 77
    :sswitch_1f
    const-string v1, "message.new"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    goto/16 :goto_2

    .line 78
    :cond_27
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->newMessageEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 79
    :sswitch_20
    const-string v1, "reminder.deleted"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    goto/16 :goto_2

    .line 80
    :cond_28
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->reminderDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 81
    :sswitch_21
    const-string v1, "message.updated"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    goto/16 :goto_2

    .line 82
    :cond_29
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->messageUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 83
    :sswitch_22
    const-string v1, "notification.channel_deleted"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    goto/16 :goto_2

    .line 84
    :cond_2a
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationChannelDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 85
    :sswitch_23
    const-string v1, "ai_indicator.clear"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    goto/16 :goto_2

    .line 86
    :cond_2b
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->aiTypingIndicatorClearEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 87
    :sswitch_24
    const-string v1, "user.presence.changed"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    goto/16 :goto_2

    .line 88
    :cond_2c
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->userPresenceChangedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 89
    :sswitch_25
    const-string v1, "notification.removed_from_channel"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    goto/16 :goto_2

    .line 90
    :cond_2d
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationRemovedFromChannelEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 91
    :sswitch_26
    const-string v1, "user.banned"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2e

    goto/16 :goto_2

    .line 92
    :cond_2e
    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2f

    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->channelUserBannedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 93
    :cond_2f
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->globalUserBannedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 94
    :sswitch_27
    const-string v1, "channel.updated"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    goto/16 :goto_2

    .line 95
    :cond_30
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_31

    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->channelUpdatedByUserEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 96
    :cond_31
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->channelUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 97
    :sswitch_28
    const-string v1, "message.read"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_32

    goto/16 :goto_2

    .line 98
    :cond_32
    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_33

    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->messageReadEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 99
    :cond_33
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->markAllReadEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 100
    :sswitch_29
    const-string v1, "reminder.created"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_34

    goto/16 :goto_2

    .line 101
    :cond_34
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->reminderCreatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 102
    :sswitch_2a
    const-string v1, "user.watching.stop"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_35

    goto/16 :goto_2

    .line 103
    :cond_35
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->userStopWatchingEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 104
    :sswitch_2b
    const-string v1, "member.added"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_36

    goto/16 :goto_2

    .line 105
    :cond_36
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->memberAddedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 106
    :sswitch_2c
    const-string v1, "channel.hidden"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_37

    goto/16 :goto_2

    .line 107
    :cond_37
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->channelHiddenEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 108
    :sswitch_2d
    const-string v1, "poll.closed"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_38

    goto/16 :goto_2

    .line 109
    :cond_38
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->pollClosedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 110
    :sswitch_2e
    const-string v1, "notification.invited"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_39

    goto/16 :goto_2

    .line 111
    :cond_39
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationInvitedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 112
    :sswitch_2f
    const-string v1, "ai_indicator.update"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3a

    goto/16 :goto_2

    .line 113
    :cond_3a
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->aiTypingIndicatorUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 114
    :sswitch_30
    const-string v1, "reaction.new"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3b

    goto/16 :goto_2

    .line 115
    :cond_3b
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->reactionNewEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 116
    :sswitch_31
    const-string v1, "poll.deleted"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3c

    goto/16 :goto_2

    .line 117
    :cond_3c
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->pollDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto/16 :goto_1

    .line 118
    :sswitch_32
    const-string v1, "member.updated"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3d

    goto :goto_2

    .line 119
    :cond_3d
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->memberUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto :goto_1

    .line 120
    :sswitch_33
    const-string v1, "draft.deleted"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3e

    goto :goto_2

    .line 121
    :cond_3e
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->draftMessageDeletedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto :goto_1

    .line 122
    :sswitch_34
    const-string v1, "channel.truncated"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3f

    goto :goto_2

    .line 123
    :cond_3f
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->channelTruncatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto :goto_1

    .line 124
    :sswitch_35
    const-string v1, "reaction.updated"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_40

    goto :goto_2

    .line 125
    :cond_40
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->reactionUpdateEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto :goto_1

    .line 126
    :sswitch_36
    const-string v1, "user.unbanned"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_41

    goto :goto_2

    .line 127
    :cond_41
    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_42

    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->channelUserUnbannedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto :goto_1

    .line 128
    :cond_42
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->globalUserUnbannedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto :goto_1

    .line 129
    :sswitch_37
    const-string v1, "notification.mark_unread"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_43

    goto :goto_2

    .line 130
    :cond_43
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->notificationMarkUnreadEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    goto :goto_1

    .line 131
    :sswitch_38
    const-string v1, "thread.updated"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_44

    goto :goto_2

    .line 132
    :cond_44
    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->threadUpdatedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    .line 133
    :goto_1
    invoke-virtual {p1, v0}, Lcom/squareup/moshi/JsonAdapter;->fromJsonValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;

    return-object p1

    .line 134
    :cond_45
    :goto_2
    new-instance v1, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;

    if-nez v2, :cond_46

    .line 135
    const-string v2, "unknown_event"

    .line 136
    :cond_46
    iget-object v3, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->moshi:Lqx/l0;

    const-class v4, Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    invoke-virtual {v3, v4}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v3

    const-string v4, "created_at"

    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/squareup/moshi/JsonAdapter;->fromJsonValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v3, Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    .line 137
    iget-object v4, p0, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->moshi:Lqx/l0;

    const-class v5, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    invoke-virtual {v4, v5}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v4

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v4, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJsonValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    .line 138
    invoke-direct {v1, v2, v3, p1, v0}, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/util/Map;)V

    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fe3ab29 -> :sswitch_38
        -0x7db92f22 -> :sswitch_37
        -0x7c796e46 -> :sswitch_36
        -0x7bbc6e0a -> :sswitch_35
        -0x76b4f76d -> :sswitch_34
        -0x71e87734 -> :sswitch_33
        -0x70bfbe99 -> :sswitch_32
        -0x70635716 -> :sswitch_31
        -0x6659cfa5 -> :sswitch_30
        -0x6322d341 -> :sswitch_2f
        -0x6171cf88 -> :sswitch_2e
        -0x5fc77585 -> :sswitch_2d
        -0x5b11530b -> :sswitch_2c
        -0x57488354 -> :sswitch_2b
        -0x57120c86 -> :sswitch_2a
        -0x536b4294 -> :sswitch_29
        -0x4f5b80e3 -> :sswitch_28
        -0x4b774530 -> :sswitch_27
        -0x4712915f -> :sswitch_26
        -0x43833bf0 -> :sswitch_25
        -0x3e89737c -> :sswitch_24
        -0x3e009469 -> :sswitch_23
        -0x3d6b2e26 -> :sswitch_22
        -0x37b9062c -> :sswitch_21
        -0x344f9163 -> :sswitch_20
        -0x341bc8c7 -> :sswitch_1f
        -0x32c8bed5 -> :sswitch_1e
        -0x2aedb1e7 -> :sswitch_1d
        -0x2abfcf0a -> :sswitch_1c
        -0x29d05b36 -> :sswitch_1b
        -0x24e9036a -> :sswitch_1a
        -0x21b286f4 -> :sswitch_19
        -0x21ac3579 -> :sswitch_18
        -0x2134610a -> :sswitch_17
        -0x1a1f6ac1 -> :sswitch_16
        -0x159a22c6 -> :sswitch_15
        -0x11591eac -> :sswitch_14
        -0xc26e108 -> :sswitch_13
        -0x740349c -> :sswitch_12
        0xe8b8178 -> :sswitch_11
        0x1eec0a2e -> :sswitch_10
        0x202aad1a -> :sswitch_f
        0x23b4396e -> :sswitch_e
        0x2539598c -> :sswitch_d
        0x2a2b342e -> :sswitch_c
        0x2c9aab33 -> :sswitch_b
        0x32aa4932 -> :sswitch_a
        0x382c975d -> :sswitch_9
        0x3f33e9da -> :sswitch_8
        0x4c774a81 -> :sswitch_7
        0x4f69ebf7 -> :sswitch_6
        0x614d1f3f -> :sswitch_5
        0x6adce198 -> :sswitch_4
        0x6d153685 -> :sswitch_3
        0x74d047ea -> :sswitch_2
        0x781bb4e5 -> :sswitch_1
        0x7bd721f1 -> :sswitch_0
    .end sparse-switch
.end method

.method public final bridge synthetic fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;

    move-result-object p1

    return-object p1
.end method

.method public final toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;)V
    .locals 2

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Can\'t convert this event to Json "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final bridge synthetic toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;->toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;)V

    const/4 p1, 0x0

    throw p1
.end method
