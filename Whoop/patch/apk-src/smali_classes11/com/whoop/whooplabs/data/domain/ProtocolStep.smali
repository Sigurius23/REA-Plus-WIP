.class public final Lcom/whoop/whooplabs/data/domain/ProtocolStep;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\'\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008:\n\u0002\u0010\u0000\n\u0002\u00084\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00a5\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010,\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010/\u001a\u00020\u000b\u0012\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u00104\u001a\u0004\u0018\u000103\u00a2\u0006\u0004\u00085\u00106J\r\u00107\u001a\u00020\u0002\u00a2\u0006\u0004\u00087\u00108J\u001d\u0010=\u001a\u00020<2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\u0002\u00a2\u0006\u0004\u0008=\u0010>J\u0010\u0010?\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008?\u00108J\u0010\u0010@\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008@\u00108J\u0012\u0010A\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008A\u0010BJ\u0010\u0010C\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008C\u00108J\u0012\u0010D\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008D\u0010BJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008E\u0010BJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008F\u0010BJ\u0010\u0010G\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008G\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008I\u0010JJ\u0010\u0010K\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008K\u0010HJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008L\u0010BJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008M\u0010BJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008N\u0010BJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008O\u0010BJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008P\u0010BJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008Q\u0010BJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008R\u0010BJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008S\u0010BJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008T\u0010UJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008V\u0010UJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008W\u0010BJ\u0012\u0010X\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008X\u0010JJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008Y\u0010BJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008Z\u0010BJ\u0012\u0010[\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008[\u0010BJ\u0012\u0010\\\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\\\u0010BJ\u0012\u0010]\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008]\u0010UJ\u0012\u0010^\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008^\u0010UJ\u0012\u0010_\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008_\u0010BJ\u0012\u0010`\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008`\u0010JJ\u0012\u0010a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008a\u0010BJ\u0012\u0010b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008b\u0010BJ\u0012\u0010c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008c\u0010BJ\u0012\u0010d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008d\u0010BJ\u0012\u0010e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008e\u0010UJ\u0012\u0010f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008f\u0010UJ\u0012\u0010g\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008g\u0010BJ\u0012\u0010h\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008h\u0010JJ\u0012\u0010i\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008i\u0010BJ\u0010\u0010j\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008j\u0010HJ\u0012\u0010k\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008k\u0010BJ\u0012\u0010l\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008l\u0010BJ\u0010\u0010m\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008m\u0010HJ\u0012\u0010n\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008n\u0010UJ\u0012\u0010o\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008o\u0010BJ\u0012\u0010p\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008p\u0010BJ\u0012\u0010q\u001a\u0004\u0018\u000103H\u00c6\u0003\u00a2\u0006\u0004\u0008q\u0010rJ\u00b6\u0004\u0010s\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010,\u001a\u00020\u000b2\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010/\u001a\u00020\u000b2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u00104\u001a\u0004\u0018\u000103H\u00c6\u0001\u00a2\u0006\u0004\u0008s\u0010tJ\u0010\u0010u\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008u\u0010BJ\u0010\u0010v\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008v\u00108J\u001a\u0010y\u001a\u00020\u000b2\u0008\u0010x\u001a\u0004\u0018\u00010wH\u00d6\u0003\u00a2\u0006\u0004\u0008y\u0010zR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010{\u001a\u0004\u0008|\u00108R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010{\u001a\u0004\u0008}\u00108R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010~\u001a\u0004\u0008\u007f\u0010BR\u001b\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008\u0007\u0010{\u001a\u0005\u0008\u0080\u0001\u00108R\u001d\u0010\u0008\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008\u0008\u0010~\u001a\u0005\u0008\u0081\u0001\u0010BR\u001d\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008\t\u0010~\u001a\u0005\u0008\u0082\u0001\u0010BR\u001d\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008\n\u0010~\u001a\u0005\u0008\u0083\u0001\u0010BR\u001b\u0010\u000c\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\r\n\u0005\u0008\u000c\u0010\u0084\u0001\u001a\u0004\u0008\u000c\u0010HR\u001d\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\r\n\u0005\u0008\r\u0010\u0085\u0001\u001a\u0004\u0008\r\u0010JR\u001b\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\r\n\u0005\u0008\u000e\u0010\u0084\u0001\u001a\u0004\u0008\u000e\u0010HR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008\u000f\u0010~\u001a\u0005\u0008\u0086\u0001\u0010BR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008\u0010\u0010~\u001a\u0005\u0008\u0087\u0001\u0010BR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008\u0011\u0010~\u001a\u0005\u0008\u0088\u0001\u0010BR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008\u0012\u0010~\u001a\u0005\u0008\u0089\u0001\u0010BR\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008\u0013\u0010~\u001a\u0005\u0008\u008a\u0001\u0010BR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008\u0014\u0010~\u001a\u0005\u0008\u008b\u0001\u0010BR\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008\u0015\u0010~\u001a\u0005\u0008\u008c\u0001\u0010BR\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008\u0016\u0010~\u001a\u0005\u0008\u008d\u0001\u0010BR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u0017\u0010\u008e\u0001\u001a\u0005\u0008\u008f\u0001\u0010UR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u0018\u0010\u008e\u0001\u001a\u0005\u0008\u0090\u0001\u0010UR\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008\u0019\u0010~\u001a\u0005\u0008\u0091\u0001\u0010BR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u001a\u0010\u0085\u0001\u001a\u0005\u0008\u0092\u0001\u0010JR\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008\u001b\u0010~\u001a\u0005\u0008\u0093\u0001\u0010BR\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008\u001c\u0010~\u001a\u0005\u0008\u0094\u0001\u0010BR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008\u001d\u0010~\u001a\u0005\u0008\u0095\u0001\u0010BR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008\u001e\u0010~\u001a\u0005\u0008\u0096\u0001\u0010BR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u001f\u0010\u008e\u0001\u001a\u0005\u0008\u0097\u0001\u0010UR\u001e\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008 \u0010\u008e\u0001\u001a\u0005\u0008\u0098\u0001\u0010UR\u001d\u0010!\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008!\u0010~\u001a\u0005\u0008\u0099\u0001\u0010BR\u001e\u0010\"\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\"\u0010\u0085\u0001\u001a\u0005\u0008\u009a\u0001\u0010JR\u001d\u0010#\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008#\u0010~\u001a\u0005\u0008\u009b\u0001\u0010BR\u001d\u0010$\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008$\u0010~\u001a\u0005\u0008\u009c\u0001\u0010BR\u001d\u0010%\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008%\u0010~\u001a\u0005\u0008\u009d\u0001\u0010BR\u001d\u0010&\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008&\u0010~\u001a\u0005\u0008\u009e\u0001\u0010BR\u001e\u0010\'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\'\u0010\u008e\u0001\u001a\u0005\u0008\u009f\u0001\u0010UR\u001e\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008(\u0010\u008e\u0001\u001a\u0005\u0008\u00a0\u0001\u0010UR\u001d\u0010)\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008)\u0010~\u001a\u0005\u0008\u00a1\u0001\u0010BR\u001e\u0010*\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008*\u0010\u0085\u0001\u001a\u0005\u0008\u00a2\u0001\u0010JR\u001d\u0010+\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008+\u0010~\u001a\u0005\u0008\u00a3\u0001\u0010BR\u001c\u0010,\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008,\u0010\u0084\u0001\u001a\u0005\u0008\u00a4\u0001\u0010HR\u001d\u0010-\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008-\u0010~\u001a\u0005\u0008\u00a5\u0001\u0010BR\u001d\u0010.\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008.\u0010~\u001a\u0005\u0008\u00a6\u0001\u0010BR\u001b\u0010/\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\r\n\u0005\u0008/\u0010\u0084\u0001\u001a\u0004\u0008/\u0010HR\u001e\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u00080\u0010\u008e\u0001\u001a\u0005\u0008\u00a7\u0001\u0010UR\u001d\u00101\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u00081\u0010~\u001a\u0005\u0008\u00a8\u0001\u0010BR\u001d\u00102\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u00082\u0010~\u001a\u0005\u0008\u00a9\u0001\u0010BR\u001e\u00104\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u00084\u0010\u00aa\u0001\u001a\u0005\u0008\u00ab\u0001\u0010rR\u0015\u0010\u00af\u0001\u001a\u00030\u00ac\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u00ad\u0001\u0010\u00ae\u0001\u00a8\u0006\u00b0\u0001"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/domain/ProtocolStep;",
        "Landroid/os/Parcelable;",
        "",
        "campaignId",
        "id",
        "",
        "text",
        "order",
        "typeFormUrl",
        "imageUrl",
        "imageAlt",
        "",
        "isBpStep",
        "isTimerActive",
        "isBtHr",
        "title",
        "subtitle",
        "cta",
        "typeFormTitle",
        "systolicLabel",
        "systolicTooLowText",
        "systolicTooHighText",
        "systolicRequiredText",
        "systolicMax",
        "systolicMin",
        "systolicSuffix",
        "systolicRequired",
        "diastolicLabel",
        "diastolicTooLowText",
        "diastolicTooHighText",
        "diastolicRequiredText",
        "diastolicMax",
        "diastolicMin",
        "diastolicSuffix",
        "diastolicRequired",
        "hrLabel",
        "hrTooLowText",
        "hrTooHighText",
        "hrRequiredText",
        "hrMax",
        "hrMin",
        "hrSuffix",
        "hrRequired",
        "inputType",
        "inputRequired",
        "requiredRegex",
        "blockedRegex",
        "isCountDownTimerRequired",
        "countDownTimerSeconds",
        "surveyFormId",
        "surveyVendorMetadata",
        "Lcom/whoop/whooplabs/data/domain/SurveyProvider;",
        "surveyProvider",
        "<init>",
        "(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;)V",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "Ll83/a0;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "component1",
        "component2",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "()Z",
        "component9",
        "()Ljava/lang/Boolean;",
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
        "()Ljava/lang/Integer;",
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
        "()Lcom/whoop/whooplabs/data/domain/SurveyProvider;",
        "copy",
        "(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;)Lcom/whoop/whooplabs/data/domain/ProtocolStep;",
        "toString",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getCampaignId",
        "getId",
        "Ljava/lang/String;",
        "getText",
        "getOrder",
        "getTypeFormUrl",
        "getImageUrl",
        "getImageAlt",
        "Z",
        "Ljava/lang/Boolean;",
        "getTitle",
        "getSubtitle",
        "getCta",
        "getTypeFormTitle",
        "getSystolicLabel",
        "getSystolicTooLowText",
        "getSystolicTooHighText",
        "getSystolicRequiredText",
        "Ljava/lang/Integer;",
        "getSystolicMax",
        "getSystolicMin",
        "getSystolicSuffix",
        "getSystolicRequired",
        "getDiastolicLabel",
        "getDiastolicTooLowText",
        "getDiastolicTooHighText",
        "getDiastolicRequiredText",
        "getDiastolicMax",
        "getDiastolicMin",
        "getDiastolicSuffix",
        "getDiastolicRequired",
        "getHrLabel",
        "getHrTooLowText",
        "getHrTooHighText",
        "getHrRequiredText",
        "getHrMax",
        "getHrMin",
        "getHrSuffix",
        "getHrRequired",
        "getInputType",
        "getInputRequired",
        "getRequiredRegex",
        "getBlockedRegex",
        "getCountDownTimerSeconds",
        "getSurveyFormId",
        "getSurveyVendorMetadata",
        "Lcom/whoop/whooplabs/data/domain/SurveyProvider;",
        "getSurveyProvider",
        "Lcom/whoop/whooplabs/data/domain/ProtocolStepType;",
        "getStepType",
        "()Lcom/whoop/whooplabs/data/domain/ProtocolStepType;",
        "stepType",
        "whooplabs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/whoop/whooplabs/data/domain/ProtocolStep;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final blockedRegex:Ljava/lang/String;

.field private final campaignId:I

.field private final countDownTimerSeconds:Ljava/lang/Integer;

.field private final cta:Ljava/lang/String;

.field private final diastolicLabel:Ljava/lang/String;

.field private final diastolicMax:Ljava/lang/Integer;

.field private final diastolicMin:Ljava/lang/Integer;

.field private final diastolicRequired:Ljava/lang/Boolean;

.field private final diastolicRequiredText:Ljava/lang/String;

.field private final diastolicSuffix:Ljava/lang/String;

.field private final diastolicTooHighText:Ljava/lang/String;

.field private final diastolicTooLowText:Ljava/lang/String;

.field private final hrLabel:Ljava/lang/String;

.field private final hrMax:Ljava/lang/Integer;

.field private final hrMin:Ljava/lang/Integer;

.field private final hrRequired:Ljava/lang/Boolean;

.field private final hrRequiredText:Ljava/lang/String;

.field private final hrSuffix:Ljava/lang/String;

.field private final hrTooHighText:Ljava/lang/String;

.field private final hrTooLowText:Ljava/lang/String;

.field private final id:I

.field private final imageAlt:Ljava/lang/String;

.field private final imageUrl:Ljava/lang/String;

.field private final inputRequired:Z

.field private final inputType:Ljava/lang/String;

.field private final isBpStep:Z

.field private final isBtHr:Z

.field private final isCountDownTimerRequired:Z

.field private final isTimerActive:Ljava/lang/Boolean;

.field private final order:I

.field private final requiredRegex:Ljava/lang/String;

.field private final subtitle:Ljava/lang/String;

.field private final surveyFormId:Ljava/lang/String;

.field private final surveyProvider:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

.field private final surveyVendorMetadata:Ljava/lang/String;

.field private final systolicLabel:Ljava/lang/String;

.field private final systolicMax:Ljava/lang/Integer;

.field private final systolicMin:Ljava/lang/Integer;

.field private final systolicRequired:Ljava/lang/Boolean;

.field private final systolicRequiredText:Ljava/lang/String;

.field private final systolicSuffix:Ljava/lang/String;

.field private final systolicTooHighText:Ljava/lang/String;

.field private final systolicTooLowText:Ljava/lang/String;

.field private final text:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final typeFormTitle:Ljava/lang/String;

.field private final typeFormUrl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep$Creator;

    invoke-direct {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep$Creator;-><init>()V

    sput-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->campaignId:I

    .line 3
    iput p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->id:I

    .line 4
    iput-object p3, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->text:Ljava/lang/String;

    .line 5
    iput p4, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->order:I

    .line 6
    iput-object p5, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->typeFormUrl:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->imageUrl:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->imageAlt:Ljava/lang/String;

    .line 9
    iput-boolean p8, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isBpStep:Z

    .line 10
    iput-object p9, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isTimerActive:Ljava/lang/Boolean;

    .line 11
    iput-boolean p10, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isBtHr:Z

    .line 12
    iput-object p11, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->title:Ljava/lang/String;

    .line 13
    iput-object p12, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->subtitle:Ljava/lang/String;

    .line 14
    iput-object p13, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->cta:Ljava/lang/String;

    .line 15
    iput-object p14, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->typeFormTitle:Ljava/lang/String;

    .line 16
    iput-object p15, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicLabel:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicTooLowText:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 18
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicTooHighText:Ljava/lang/String;

    move-object/from16 p1, p18

    .line 19
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicRequiredText:Ljava/lang/String;

    move-object/from16 p1, p19

    .line 20
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicMax:Ljava/lang/Integer;

    move-object/from16 p1, p20

    .line 21
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicMin:Ljava/lang/Integer;

    move-object/from16 p1, p21

    .line 22
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicSuffix:Ljava/lang/String;

    move-object/from16 p1, p22

    .line 23
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicRequired:Ljava/lang/Boolean;

    move-object/from16 p1, p23

    .line 24
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicLabel:Ljava/lang/String;

    move-object/from16 p1, p24

    .line 25
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicTooLowText:Ljava/lang/String;

    move-object/from16 p1, p25

    .line 26
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicTooHighText:Ljava/lang/String;

    move-object/from16 p1, p26

    .line 27
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicRequiredText:Ljava/lang/String;

    move-object/from16 p1, p27

    .line 28
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicMax:Ljava/lang/Integer;

    move-object/from16 p1, p28

    .line 29
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicMin:Ljava/lang/Integer;

    move-object/from16 p1, p29

    .line 30
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicSuffix:Ljava/lang/String;

    move-object/from16 p1, p30

    .line 31
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicRequired:Ljava/lang/Boolean;

    move-object/from16 p1, p31

    .line 32
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrLabel:Ljava/lang/String;

    move-object/from16 p1, p32

    .line 33
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrTooLowText:Ljava/lang/String;

    move-object/from16 p1, p33

    .line 34
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrTooHighText:Ljava/lang/String;

    move-object/from16 p1, p34

    .line 35
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrRequiredText:Ljava/lang/String;

    move-object/from16 p1, p35

    .line 36
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrMax:Ljava/lang/Integer;

    move-object/from16 p1, p36

    .line 37
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrMin:Ljava/lang/Integer;

    move-object/from16 p1, p37

    .line 38
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrSuffix:Ljava/lang/String;

    move-object/from16 p1, p38

    .line 39
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrRequired:Ljava/lang/Boolean;

    move-object/from16 p1, p39

    .line 40
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->inputType:Ljava/lang/String;

    move/from16 p1, p40

    .line 41
    iput-boolean p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->inputRequired:Z

    move-object/from16 p1, p41

    .line 42
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->requiredRegex:Ljava/lang/String;

    move-object/from16 p1, p42

    .line 43
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->blockedRegex:Ljava/lang/String;

    move/from16 p1, p43

    .line 44
    iput-boolean p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isCountDownTimerRequired:Z

    move-object/from16 p1, p44

    .line 45
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->countDownTimerSeconds:Ljava/lang/Integer;

    move-object/from16 p1, p45

    .line 46
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyFormId:Ljava/lang/String;

    move-object/from16 p1, p46

    .line 47
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyVendorMetadata:Ljava/lang/String;

    move-object/from16 p1, p47

    .line 48
    iput-object p1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyProvider:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 52

    move/from16 v0, p48

    move/from16 v1, p49

    and-int/lit8 v2, v0, 0x4

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v7, v3

    goto :goto_0

    :cond_0
    move-object/from16 v7, p3

    :goto_0
    and-int/lit8 v2, v0, 0x10

    if-eqz v2, :cond_1

    move-object v9, v3

    goto :goto_1

    :cond_1
    move-object/from16 v9, p5

    :goto_1
    and-int/lit8 v2, v0, 0x20

    if-eqz v2, :cond_2

    move-object v10, v3

    goto :goto_2

    :cond_2
    move-object/from16 v10, p6

    :goto_2
    and-int/lit8 v2, v0, 0x40

    if-eqz v2, :cond_3

    move-object v11, v3

    goto :goto_3

    :cond_3
    move-object/from16 v11, p7

    :goto_3
    and-int/lit16 v2, v0, 0x100

    if-eqz v2, :cond_4

    .line 49
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object v13, v2

    goto :goto_4

    :cond_4
    move-object/from16 v13, p9

    :goto_4
    and-int/lit16 v2, v0, 0x200

    const/4 v4, 0x0

    if-eqz v2, :cond_5

    move v14, v4

    goto :goto_5

    :cond_5
    move/from16 v14, p10

    :goto_5
    and-int/lit16 v2, v0, 0x400

    if-eqz v2, :cond_6

    move-object v15, v3

    goto :goto_6

    :cond_6
    move-object/from16 v15, p11

    :goto_6
    and-int/lit16 v2, v0, 0x800

    if-eqz v2, :cond_7

    move-object/from16 v16, v3

    goto :goto_7

    :cond_7
    move-object/from16 v16, p12

    :goto_7
    and-int/lit16 v2, v0, 0x1000

    if-eqz v2, :cond_8

    move-object/from16 v17, v3

    goto :goto_8

    :cond_8
    move-object/from16 v17, p13

    :goto_8
    and-int/lit16 v2, v0, 0x2000

    if-eqz v2, :cond_9

    move-object/from16 v18, v3

    goto :goto_9

    :cond_9
    move-object/from16 v18, p14

    :goto_9
    and-int/lit16 v2, v0, 0x4000

    if-eqz v2, :cond_a

    move-object/from16 v19, v3

    goto :goto_a

    :cond_a
    move-object/from16 v19, p15

    :goto_a
    const v2, 0x8000

    and-int/2addr v2, v0

    if-eqz v2, :cond_b

    move-object/from16 v20, v3

    goto :goto_b

    :cond_b
    move-object/from16 v20, p16

    :goto_b
    const/high16 v2, 0x10000

    and-int/2addr v2, v0

    if-eqz v2, :cond_c

    move-object/from16 v21, v3

    goto :goto_c

    :cond_c
    move-object/from16 v21, p17

    :goto_c
    const/high16 v2, 0x20000

    and-int/2addr v2, v0

    if-eqz v2, :cond_d

    move-object/from16 v22, v3

    goto :goto_d

    :cond_d
    move-object/from16 v22, p18

    :goto_d
    const/high16 v2, 0x40000

    and-int/2addr v2, v0

    if-eqz v2, :cond_e

    move-object/from16 v23, v3

    goto :goto_e

    :cond_e
    move-object/from16 v23, p19

    :goto_e
    const/high16 v2, 0x80000

    and-int/2addr v2, v0

    if-eqz v2, :cond_f

    move-object/from16 v24, v3

    goto :goto_f

    :cond_f
    move-object/from16 v24, p20

    :goto_f
    const/high16 v2, 0x100000

    and-int/2addr v2, v0

    if-eqz v2, :cond_10

    move-object/from16 v25, v3

    goto :goto_10

    :cond_10
    move-object/from16 v25, p21

    :goto_10
    const/high16 v2, 0x200000

    and-int/2addr v2, v0

    if-eqz v2, :cond_11

    move-object/from16 v26, v3

    goto :goto_11

    :cond_11
    move-object/from16 v26, p22

    :goto_11
    const/high16 v2, 0x400000

    and-int/2addr v2, v0

    if-eqz v2, :cond_12

    move-object/from16 v27, v3

    goto :goto_12

    :cond_12
    move-object/from16 v27, p23

    :goto_12
    const/high16 v2, 0x800000

    and-int/2addr v2, v0

    if-eqz v2, :cond_13

    move-object/from16 v28, v3

    goto :goto_13

    :cond_13
    move-object/from16 v28, p24

    :goto_13
    const/high16 v2, 0x1000000

    and-int/2addr v2, v0

    if-eqz v2, :cond_14

    move-object/from16 v29, v3

    goto :goto_14

    :cond_14
    move-object/from16 v29, p25

    :goto_14
    const/high16 v2, 0x2000000

    and-int/2addr v2, v0

    if-eqz v2, :cond_15

    move-object/from16 v30, v3

    goto :goto_15

    :cond_15
    move-object/from16 v30, p26

    :goto_15
    const/high16 v2, 0x4000000

    and-int/2addr v2, v0

    if-eqz v2, :cond_16

    move-object/from16 v31, v3

    goto :goto_16

    :cond_16
    move-object/from16 v31, p27

    :goto_16
    const/high16 v2, 0x8000000

    and-int/2addr v2, v0

    if-eqz v2, :cond_17

    move-object/from16 v32, v3

    goto :goto_17

    :cond_17
    move-object/from16 v32, p28

    :goto_17
    const/high16 v2, 0x10000000

    and-int/2addr v2, v0

    if-eqz v2, :cond_18

    move-object/from16 v33, v3

    goto :goto_18

    :cond_18
    move-object/from16 v33, p29

    :goto_18
    const/high16 v2, 0x20000000

    and-int/2addr v2, v0

    if-eqz v2, :cond_19

    move-object/from16 v34, v3

    goto :goto_19

    :cond_19
    move-object/from16 v34, p30

    :goto_19
    const/high16 v2, 0x40000000    # 2.0f

    and-int/2addr v2, v0

    if-eqz v2, :cond_1a

    move-object/from16 v35, v3

    goto :goto_1a

    :cond_1a
    move-object/from16 v35, p31

    :goto_1a
    const/high16 v2, -0x80000000

    and-int/2addr v0, v2

    if-eqz v0, :cond_1b

    move-object/from16 v36, v3

    goto :goto_1b

    :cond_1b
    move-object/from16 v36, p32

    :goto_1b
    and-int/lit8 v0, v1, 0x1

    if-eqz v0, :cond_1c

    move-object/from16 v37, v3

    goto :goto_1c

    :cond_1c
    move-object/from16 v37, p33

    :goto_1c
    and-int/lit8 v0, v1, 0x2

    if-eqz v0, :cond_1d

    move-object/from16 v38, v3

    goto :goto_1d

    :cond_1d
    move-object/from16 v38, p34

    :goto_1d
    and-int/lit8 v0, v1, 0x4

    if-eqz v0, :cond_1e

    move-object/from16 v39, v3

    goto :goto_1e

    :cond_1e
    move-object/from16 v39, p35

    :goto_1e
    and-int/lit8 v0, v1, 0x8

    if-eqz v0, :cond_1f

    move-object/from16 v40, v3

    goto :goto_1f

    :cond_1f
    move-object/from16 v40, p36

    :goto_1f
    and-int/lit8 v0, v1, 0x10

    if-eqz v0, :cond_20

    move-object/from16 v41, v3

    goto :goto_20

    :cond_20
    move-object/from16 v41, p37

    :goto_20
    and-int/lit8 v0, v1, 0x20

    if-eqz v0, :cond_21

    move-object/from16 v42, v3

    goto :goto_21

    :cond_21
    move-object/from16 v42, p38

    :goto_21
    and-int/lit8 v0, v1, 0x40

    if-eqz v0, :cond_22

    move-object/from16 v43, v3

    goto :goto_22

    :cond_22
    move-object/from16 v43, p39

    :goto_22
    and-int/lit16 v0, v1, 0x80

    if-eqz v0, :cond_23

    move/from16 v44, v4

    goto :goto_23

    :cond_23
    move/from16 v44, p40

    :goto_23
    and-int/lit16 v0, v1, 0x100

    if-eqz v0, :cond_24

    move-object/from16 v45, v3

    goto :goto_24

    :cond_24
    move-object/from16 v45, p41

    :goto_24
    and-int/lit16 v0, v1, 0x200

    if-eqz v0, :cond_25

    move-object/from16 v46, v3

    goto :goto_25

    :cond_25
    move-object/from16 v46, p42

    :goto_25
    and-int/lit16 v0, v1, 0x400

    if-eqz v0, :cond_26

    move/from16 v47, v4

    goto :goto_26

    :cond_26
    move/from16 v47, p43

    :goto_26
    and-int/lit16 v0, v1, 0x800

    if-eqz v0, :cond_27

    move-object/from16 v48, v3

    goto :goto_27

    :cond_27
    move-object/from16 v48, p44

    :goto_27
    and-int/lit16 v0, v1, 0x1000

    if-eqz v0, :cond_28

    move-object/from16 v49, v3

    goto :goto_28

    :cond_28
    move-object/from16 v49, p45

    :goto_28
    and-int/lit16 v0, v1, 0x2000

    if-eqz v0, :cond_29

    move-object/from16 v50, v3

    goto :goto_29

    :cond_29
    move-object/from16 v50, p46

    :goto_29
    and-int/lit16 v0, v1, 0x4000

    if-eqz v0, :cond_2a

    move-object/from16 v51, v3

    :goto_2a
    move-object/from16 v4, p0

    move/from16 v5, p1

    move/from16 v6, p2

    move/from16 v8, p4

    move/from16 v12, p8

    goto :goto_2b

    :cond_2a
    move-object/from16 v51, p47

    goto :goto_2a

    .line 50
    :goto_2b
    invoke-direct/range {v4 .. v51}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;-><init>(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/whooplabs/data/domain/ProtocolStep;IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;IILjava/lang/Object;)Lcom/whoop/whooplabs/data/domain/ProtocolStep;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p48

    move/from16 v2, p49

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    iget v3, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->campaignId:I

    goto :goto_0

    :cond_0
    move/from16 v3, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget v4, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->id:I

    goto :goto_1

    :cond_1
    move/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->text:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget v6, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->order:I

    goto :goto_3

    :cond_3
    move/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->typeFormUrl:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->imageUrl:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->imageAlt:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-boolean v10, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isBpStep:Z

    goto :goto_7

    :cond_7
    move/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-object v11, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isTimerActive:Ljava/lang/Boolean;

    goto :goto_8

    :cond_8
    move-object/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-boolean v12, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isBtHr:Z

    goto :goto_9

    :cond_9
    move/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-object v13, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->title:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-object v14, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->subtitle:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v14, p12

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->cta:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v15, p13

    :goto_c
    move/from16 p1, v3

    and-int/lit16 v3, v1, 0x2000

    if-eqz v3, :cond_d

    iget-object v3, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->typeFormTitle:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v3, p14

    :goto_d
    move-object/from16 p2, v3

    and-int/lit16 v3, v1, 0x4000

    if-eqz v3, :cond_e

    iget-object v3, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicLabel:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v3, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicTooLowText:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p48, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicTooHighText:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p48, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicRequiredText:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p48, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicMax:Ljava/lang/Integer;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p48, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicMin:Ljava/lang/Integer;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p48, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicSuffix:Ljava/lang/String;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p48, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicRequired:Ljava/lang/Boolean;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p48, v16

    move-object/from16 p9, v1

    if-eqz v16, :cond_16

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicLabel:Ljava/lang/String;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p48, v16

    move-object/from16 p10, v1

    if-eqz v16, :cond_17

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicTooLowText:Ljava/lang/String;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p48, v16

    move-object/from16 p11, v1

    if-eqz v16, :cond_18

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicTooHighText:Ljava/lang/String;

    goto :goto_18

    :cond_18
    move-object/from16 v1, p25

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p48, v16

    move-object/from16 p12, v1

    if-eqz v16, :cond_19

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicRequiredText:Ljava/lang/String;

    goto :goto_19

    :cond_19
    move-object/from16 v1, p26

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, p48, v16

    move-object/from16 p13, v1

    if-eqz v16, :cond_1a

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicMax:Ljava/lang/Integer;

    goto :goto_1a

    :cond_1a
    move-object/from16 v1, p27

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v16, p48, v16

    move-object/from16 p14, v1

    if-eqz v16, :cond_1b

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicMin:Ljava/lang/Integer;

    goto :goto_1b

    :cond_1b
    move-object/from16 v1, p28

    :goto_1b
    const/high16 v16, 0x10000000

    and-int v16, p48, v16

    move-object/from16 p15, v1

    if-eqz v16, :cond_1c

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicSuffix:Ljava/lang/String;

    goto :goto_1c

    :cond_1c
    move-object/from16 v1, p29

    :goto_1c
    const/high16 v16, 0x20000000

    and-int v16, p48, v16

    move-object/from16 p16, v1

    if-eqz v16, :cond_1d

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicRequired:Ljava/lang/Boolean;

    goto :goto_1d

    :cond_1d
    move-object/from16 v1, p30

    :goto_1d
    const/high16 v16, 0x40000000    # 2.0f

    and-int v16, p48, v16

    move-object/from16 p17, v1

    if-eqz v16, :cond_1e

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrLabel:Ljava/lang/String;

    goto :goto_1e

    :cond_1e
    move-object/from16 v1, p31

    :goto_1e
    const/high16 v16, -0x80000000

    and-int v16, p48, v16

    move-object/from16 p18, v1

    if-eqz v16, :cond_1f

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrTooLowText:Ljava/lang/String;

    goto :goto_1f

    :cond_1f
    move-object/from16 v1, p32

    :goto_1f
    and-int/lit8 v16, v2, 0x1

    move-object/from16 p19, v1

    if-eqz v16, :cond_20

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrTooHighText:Ljava/lang/String;

    goto :goto_20

    :cond_20
    move-object/from16 v1, p33

    :goto_20
    and-int/lit8 v16, v2, 0x2

    move-object/from16 p20, v1

    if-eqz v16, :cond_21

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrRequiredText:Ljava/lang/String;

    goto :goto_21

    :cond_21
    move-object/from16 v1, p34

    :goto_21
    and-int/lit8 v16, v2, 0x4

    move-object/from16 p21, v1

    if-eqz v16, :cond_22

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrMax:Ljava/lang/Integer;

    goto :goto_22

    :cond_22
    move-object/from16 v1, p35

    :goto_22
    and-int/lit8 v16, v2, 0x8

    move-object/from16 p22, v1

    if-eqz v16, :cond_23

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrMin:Ljava/lang/Integer;

    goto :goto_23

    :cond_23
    move-object/from16 v1, p36

    :goto_23
    and-int/lit8 v16, v2, 0x10

    move-object/from16 p23, v1

    if-eqz v16, :cond_24

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrSuffix:Ljava/lang/String;

    goto :goto_24

    :cond_24
    move-object/from16 v1, p37

    :goto_24
    and-int/lit8 v16, v2, 0x20

    move-object/from16 p24, v1

    if-eqz v16, :cond_25

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrRequired:Ljava/lang/Boolean;

    goto :goto_25

    :cond_25
    move-object/from16 v1, p38

    :goto_25
    and-int/lit8 v16, v2, 0x40

    move-object/from16 p25, v1

    if-eqz v16, :cond_26

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->inputType:Ljava/lang/String;

    goto :goto_26

    :cond_26
    move-object/from16 v1, p39

    :goto_26
    move-object/from16 p26, v1

    and-int/lit16 v1, v2, 0x80

    if-eqz v1, :cond_27

    iget-boolean v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->inputRequired:Z

    goto :goto_27

    :cond_27
    move/from16 v1, p40

    :goto_27
    move/from16 p27, v1

    and-int/lit16 v1, v2, 0x100

    if-eqz v1, :cond_28

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->requiredRegex:Ljava/lang/String;

    goto :goto_28

    :cond_28
    move-object/from16 v1, p41

    :goto_28
    move-object/from16 p28, v1

    and-int/lit16 v1, v2, 0x200

    if-eqz v1, :cond_29

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->blockedRegex:Ljava/lang/String;

    goto :goto_29

    :cond_29
    move-object/from16 v1, p42

    :goto_29
    move-object/from16 p29, v1

    and-int/lit16 v1, v2, 0x400

    if-eqz v1, :cond_2a

    iget-boolean v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isCountDownTimerRequired:Z

    goto :goto_2a

    :cond_2a
    move/from16 v1, p43

    :goto_2a
    move/from16 p30, v1

    and-int/lit16 v1, v2, 0x800

    if-eqz v1, :cond_2b

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->countDownTimerSeconds:Ljava/lang/Integer;

    goto :goto_2b

    :cond_2b
    move-object/from16 v1, p44

    :goto_2b
    move-object/from16 p31, v1

    and-int/lit16 v1, v2, 0x1000

    if-eqz v1, :cond_2c

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyFormId:Ljava/lang/String;

    goto :goto_2c

    :cond_2c
    move-object/from16 v1, p45

    :goto_2c
    move-object/from16 p32, v1

    and-int/lit16 v1, v2, 0x2000

    if-eqz v1, :cond_2d

    iget-object v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyVendorMetadata:Ljava/lang/String;

    goto :goto_2d

    :cond_2d
    move-object/from16 v1, p46

    :goto_2d
    and-int/lit16 v2, v2, 0x4000

    if-eqz v2, :cond_2e

    iget-object v2, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyProvider:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    move-object/from16 p48, v2

    :goto_2e
    move-object/from16 p33, p19

    move-object/from16 p34, p20

    move-object/from16 p35, p21

    move-object/from16 p36, p22

    move-object/from16 p37, p23

    move-object/from16 p38, p24

    move-object/from16 p39, p25

    move-object/from16 p40, p26

    move/from16 p41, p27

    move-object/from16 p42, p28

    move-object/from16 p43, p29

    move/from16 p44, p30

    move-object/from16 p45, p31

    move-object/from16 p46, p32

    move-object/from16 p47, v1

    move-object/from16 p19, p5

    move-object/from16 p20, p6

    move-object/from16 p21, p7

    move-object/from16 p22, p8

    move-object/from16 p23, p9

    move-object/from16 p24, p10

    move-object/from16 p25, p11

    move-object/from16 p26, p12

    move-object/from16 p27, p13

    move-object/from16 p28, p14

    move-object/from16 p29, p15

    move-object/from16 p30, p16

    move-object/from16 p31, p17

    move-object/from16 p32, p18

    move-object/from16 p16, v3

    move/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move/from16 p9, v10

    move-object/from16 p10, v11

    move/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p14, v15

    move-object/from16 p15, p2

    move-object/from16 p17, p3

    move-object/from16 p18, p4

    move/from16 p3, v4

    move-object/from16 p4, v5

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_2f

    :cond_2e
    move-object/from16 p48, p47

    goto :goto_2e

    :goto_2f
    invoke-virtual/range {p1 .. p48}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->copy(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;)Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->campaignId:I

    return v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isBtHr:Z

    return v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->typeFormTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicTooLowText:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicTooHighText:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicRequiredText:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicMax:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->id:I

    return v0
.end method

.method public final component20()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicMin:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component21()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final component22()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicRequired:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component23()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component24()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicTooLowText:Ljava/lang/String;

    return-object v0
.end method

.method public final component25()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicTooHighText:Ljava/lang/String;

    return-object v0
.end method

.method public final component26()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicRequiredText:Ljava/lang/String;

    return-object v0
.end method

.method public final component27()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicMax:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component28()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicMin:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component29()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component30()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicRequired:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component31()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component32()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrTooLowText:Ljava/lang/String;

    return-object v0
.end method

.method public final component33()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrTooHighText:Ljava/lang/String;

    return-object v0
.end method

.method public final component34()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrRequiredText:Ljava/lang/String;

    return-object v0
.end method

.method public final component35()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrMax:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component36()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrMin:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component37()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final component38()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrRequired:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component39()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->inputType:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->order:I

    return v0
.end method

.method public final component40()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->inputRequired:Z

    return v0
.end method

.method public final component41()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->requiredRegex:Ljava/lang/String;

    return-object v0
.end method

.method public final component42()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->blockedRegex:Ljava/lang/String;

    return-object v0
.end method

.method public final component43()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isCountDownTimerRequired:Z

    return v0
.end method

.method public final component44()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->countDownTimerSeconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component45()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyFormId:Ljava/lang/String;

    return-object v0
.end method

.method public final component46()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyVendorMetadata:Ljava/lang/String;

    return-object v0
.end method

.method public final component47()Lcom/whoop/whooplabs/data/domain/SurveyProvider;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyProvider:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->typeFormUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->imageAlt:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isBpStep:Z

    return v0
.end method

.method public final component9()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isTimerActive:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;)Lcom/whoop/whooplabs/data/domain/ProtocolStep;
    .locals 48

    new-instance v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    move-object/from16 v9, p9

    move/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move-object/from16 v19, p19

    move-object/from16 v20, p20

    move-object/from16 v21, p21

    move-object/from16 v22, p22

    move-object/from16 v23, p23

    move-object/from16 v24, p24

    move-object/from16 v25, p25

    move-object/from16 v26, p26

    move-object/from16 v27, p27

    move-object/from16 v28, p28

    move-object/from16 v29, p29

    move-object/from16 v30, p30

    move-object/from16 v31, p31

    move-object/from16 v32, p32

    move-object/from16 v33, p33

    move-object/from16 v34, p34

    move-object/from16 v35, p35

    move-object/from16 v36, p36

    move-object/from16 v37, p37

    move-object/from16 v38, p38

    move-object/from16 v39, p39

    move/from16 v40, p40

    move-object/from16 v41, p41

    move-object/from16 v42, p42

    move/from16 v43, p43

    move-object/from16 v44, p44

    move-object/from16 v45, p45

    move-object/from16 v46, p46

    move-object/from16 v47, p47

    invoke-direct/range {v0 .. v47}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;-><init>(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    iget v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->campaignId:I

    iget v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->campaignId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->id:I

    iget v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->id:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->text:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->text:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->order:I

    iget v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->order:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->typeFormUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->typeFormUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->imageAlt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->imageAlt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isBpStep:Z

    iget-boolean v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isBpStep:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isTimerActive:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isTimerActive:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isBtHr:Z

    iget-boolean v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isBtHr:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->cta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->cta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->typeFormTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->typeFormTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicTooLowText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicTooLowText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicTooHighText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicTooHighText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicRequiredText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicRequiredText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicMax:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicMax:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicMin:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicMin:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicSuffix:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicSuffix:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicRequired:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicRequired:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicTooLowText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicTooLowText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicTooHighText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicTooHighText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicRequiredText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicRequiredText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicMax:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicMax:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicMin:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicMin:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicSuffix:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicSuffix:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicRequired:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicRequired:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    return v2

    :cond_1f
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrTooLowText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrTooLowText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    return v2

    :cond_21
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrTooHighText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrTooHighText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v2

    :cond_22
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrRequiredText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrRequiredText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    return v2

    :cond_23
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrMax:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrMax:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    return v2

    :cond_24
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrMin:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrMin:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    return v2

    :cond_25
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrSuffix:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrSuffix:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_26

    return v2

    :cond_26
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrRequired:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrRequired:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    return v2

    :cond_27
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->inputType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->inputType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    return v2

    :cond_28
    iget-boolean v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->inputRequired:Z

    iget-boolean v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->inputRequired:Z

    if-eq v1, v3, :cond_29

    return v2

    :cond_29
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->requiredRegex:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->requiredRegex:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    return v2

    :cond_2a
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->blockedRegex:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->blockedRegex:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    return v2

    :cond_2b
    iget-boolean v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isCountDownTimerRequired:Z

    iget-boolean v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isCountDownTimerRequired:Z

    if-eq v1, v3, :cond_2c

    return v2

    :cond_2c
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->countDownTimerSeconds:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->countDownTimerSeconds:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    return v2

    :cond_2d
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyFormId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyFormId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2e

    return v2

    :cond_2e
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyVendorMetadata:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyVendorMetadata:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2f

    return v2

    :cond_2f
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyProvider:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    iget-object p1, p1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyProvider:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    if-eq v1, p1, :cond_30

    return v2

    :cond_30
    return v0
.end method

.method public final getBlockedRegex()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->blockedRegex:Ljava/lang/String;

    return-object v0
.end method

.method public final getCampaignId()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->campaignId:I

    return v0
.end method

.method public final getCountDownTimerSeconds()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->countDownTimerSeconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public final getDiastolicLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getDiastolicMax()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicMax:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getDiastolicMin()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicMin:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getDiastolicRequired()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicRequired:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getDiastolicRequiredText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicRequiredText:Ljava/lang/String;

    return-object v0
.end method

.method public final getDiastolicSuffix()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final getDiastolicTooHighText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicTooHighText:Ljava/lang/String;

    return-object v0
.end method

.method public final getDiastolicTooLowText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicTooLowText:Ljava/lang/String;

    return-object v0
.end method

.method public final getHrLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getHrMax()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrMax:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getHrMin()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrMin:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getHrRequired()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrRequired:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getHrRequiredText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrRequiredText:Ljava/lang/String;

    return-object v0
.end method

.method public final getHrSuffix()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final getHrTooHighText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrTooHighText:Ljava/lang/String;

    return-object v0
.end method

.method public final getHrTooLowText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrTooLowText:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->id:I

    return v0
.end method

.method public final getImageAlt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->imageAlt:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getInputRequired()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->inputRequired:Z

    return v0
.end method

.method public final getInputType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->inputType:Ljava/lang/String;

    return-object v0
.end method

.method public final getOrder()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->order:I

    return v0
.end method

.method public final getRequiredRegex()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->requiredRegex:Ljava/lang/String;

    return-object v0
.end method

.method public final getStepType()Lcom/whoop/whooplabs/data/domain/ProtocolStepType;
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->typeFormUrl:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->TYPEFORM:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    return-object v0

    :cond_1
    :goto_0
    iget-boolean v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isBpStep:Z

    if-eqz v0, :cond_2

    sget-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->BP:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    return-object v0

    :cond_2
    iget-boolean v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isBtHr:Z

    if-eqz v0, :cond_3

    sget-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->BTHR:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    return-object v0

    :cond_3
    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->inputType:Ljava/lang/String;

    const-string v1, "TEXT_SELECTION"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->SELECTION:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    return-object v0

    :cond_4
    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->inputType:Ljava/lang/String;

    const-string v1, "NUMBER_INPUT"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->NUMBER_INPUT:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    return-object v0

    :cond_5
    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->inputType:Ljava/lang/String;

    const-string v1, "TEXT_INPUT"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->TEXT_INPUT:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    return-object v0

    :cond_6
    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->inputType:Ljava/lang/String;

    const-string v1, "TIME_PICKER"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->TIME_PICKER:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    return-object v0

    :cond_7
    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->inputType:Ljava/lang/String;

    const-string v1, "DATETIME_PICKER"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->DATETIME_PICKER:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    return-object v0

    :cond_8
    sget-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->INSTRUCTION:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSurveyFormId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyFormId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSurveyProvider()Lcom/whoop/whooplabs/data/domain/SurveyProvider;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyProvider:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    return-object v0
.end method

.method public final getSurveyVendorMetadata()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyVendorMetadata:Ljava/lang/String;

    return-object v0
.end method

.method public final getSystolicLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getSystolicMax()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicMax:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getSystolicMin()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicMin:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getSystolicRequired()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicRequired:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getSystolicRequiredText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicRequiredText:Ljava/lang/String;

    return-object v0
.end method

.method public final getSystolicSuffix()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final getSystolicTooHighText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicTooHighText:Ljava/lang/String;

    return-object v0
.end method

.method public final getSystolicTooLowText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicTooLowText:Ljava/lang/String;

    return-object v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTypeFormTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->typeFormTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTypeFormUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->typeFormUrl:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->campaignId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->id:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->text:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->order:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->typeFormUrl:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->imageUrl:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->imageAlt:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isBpStep:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isTimerActive:Ljava/lang/Boolean;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isBtHr:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->title:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->subtitle:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->cta:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->typeFormTitle:Ljava/lang/String;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicLabel:Ljava/lang/String;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicTooLowText:Ljava/lang/String;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicTooHighText:Ljava/lang/String;

    if-nez v2, :cond_b

    move v2, v3

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicRequiredText:Ljava/lang/String;

    if-nez v2, :cond_c

    move v2, v3

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicMax:Ljava/lang/Integer;

    if-nez v2, :cond_d

    move v2, v3

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicMin:Ljava/lang/Integer;

    if-nez v2, :cond_e

    move v2, v3

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_e
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicSuffix:Ljava/lang/String;

    if-nez v2, :cond_f

    move v2, v3

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_f
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicRequired:Ljava/lang/Boolean;

    if-nez v2, :cond_10

    move v2, v3

    goto :goto_10

    :cond_10
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_10
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicLabel:Ljava/lang/String;

    if-nez v2, :cond_11

    move v2, v3

    goto :goto_11

    :cond_11
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_11
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicTooLowText:Ljava/lang/String;

    if-nez v2, :cond_12

    move v2, v3

    goto :goto_12

    :cond_12
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_12
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicTooHighText:Ljava/lang/String;

    if-nez v2, :cond_13

    move v2, v3

    goto :goto_13

    :cond_13
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_13
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicRequiredText:Ljava/lang/String;

    if-nez v2, :cond_14

    move v2, v3

    goto :goto_14

    :cond_14
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_14
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicMax:Ljava/lang/Integer;

    if-nez v2, :cond_15

    move v2, v3

    goto :goto_15

    :cond_15
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_15
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicMin:Ljava/lang/Integer;

    if-nez v2, :cond_16

    move v2, v3

    goto :goto_16

    :cond_16
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_16
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicSuffix:Ljava/lang/String;

    if-nez v2, :cond_17

    move v2, v3

    goto :goto_17

    :cond_17
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_17
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicRequired:Ljava/lang/Boolean;

    if-nez v2, :cond_18

    move v2, v3

    goto :goto_18

    :cond_18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_18
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrLabel:Ljava/lang/String;

    if-nez v2, :cond_19

    move v2, v3

    goto :goto_19

    :cond_19
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_19
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrTooLowText:Ljava/lang/String;

    if-nez v2, :cond_1a

    move v2, v3

    goto :goto_1a

    :cond_1a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrTooHighText:Ljava/lang/String;

    if-nez v2, :cond_1b

    move v2, v3

    goto :goto_1b

    :cond_1b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1b
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrRequiredText:Ljava/lang/String;

    if-nez v2, :cond_1c

    move v2, v3

    goto :goto_1c

    :cond_1c
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1c
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrMax:Ljava/lang/Integer;

    if-nez v2, :cond_1d

    move v2, v3

    goto :goto_1d

    :cond_1d
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1d
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrMin:Ljava/lang/Integer;

    if-nez v2, :cond_1e

    move v2, v3

    goto :goto_1e

    :cond_1e
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1e
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrSuffix:Ljava/lang/String;

    if-nez v2, :cond_1f

    move v2, v3

    goto :goto_1f

    :cond_1f
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1f
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrRequired:Ljava/lang/Boolean;

    if-nez v2, :cond_20

    move v2, v3

    goto :goto_20

    :cond_20
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_20
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->inputType:Ljava/lang/String;

    if-nez v2, :cond_21

    move v2, v3

    goto :goto_21

    :cond_21
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_21
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->inputRequired:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->requiredRegex:Ljava/lang/String;

    if-nez v2, :cond_22

    move v2, v3

    goto :goto_22

    :cond_22
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_22
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->blockedRegex:Ljava/lang/String;

    if-nez v2, :cond_23

    move v2, v3

    goto :goto_23

    :cond_23
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_23
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isCountDownTimerRequired:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->countDownTimerSeconds:Ljava/lang/Integer;

    if-nez v2, :cond_24

    move v2, v3

    goto :goto_24

    :cond_24
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_24
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyFormId:Ljava/lang/String;

    if-nez v2, :cond_25

    move v2, v3

    goto :goto_25

    :cond_25
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_25
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyVendorMetadata:Ljava/lang/String;

    if-nez v2, :cond_26

    move v2, v3

    goto :goto_26

    :cond_26
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_26
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyProvider:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    if-nez v1, :cond_27

    goto :goto_27

    :cond_27
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_27
    add-int/2addr v0, v3

    return v0
.end method

.method public final isBpStep()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isBpStep:Z

    return v0
.end method

.method public final isBtHr()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isBtHr:Z

    return v0
.end method

.method public final isCountDownTimerRequired()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isCountDownTimerRequired:Z

    return v0
.end method

.method public final isTimerActive()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isTimerActive:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 50

    move-object/from16 v0, p0

    iget v1, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->campaignId:I

    iget v2, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->id:I

    iget-object v3, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->text:Ljava/lang/String;

    iget v4, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->order:I

    iget-object v5, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->typeFormUrl:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->imageUrl:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->imageAlt:Ljava/lang/String;

    iget-boolean v8, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isBpStep:Z

    iget-object v9, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isTimerActive:Ljava/lang/Boolean;

    iget-boolean v10, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isBtHr:Z

    iget-object v11, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->title:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->subtitle:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->cta:Ljava/lang/String;

    iget-object v14, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->typeFormTitle:Ljava/lang/String;

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicLabel:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicTooLowText:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicTooHighText:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicRequiredText:Ljava/lang/String;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicMax:Ljava/lang/Integer;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicMin:Ljava/lang/Integer;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicSuffix:Ljava/lang/String;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicRequired:Ljava/lang/Boolean;

    move-object/from16 v23, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicLabel:Ljava/lang/String;

    move-object/from16 v24, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicTooLowText:Ljava/lang/String;

    move-object/from16 v25, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicTooHighText:Ljava/lang/String;

    move-object/from16 v26, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicRequiredText:Ljava/lang/String;

    move-object/from16 v27, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicMax:Ljava/lang/Integer;

    move-object/from16 v28, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicMin:Ljava/lang/Integer;

    move-object/from16 v29, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicSuffix:Ljava/lang/String;

    move-object/from16 v30, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicRequired:Ljava/lang/Boolean;

    move-object/from16 v31, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrLabel:Ljava/lang/String;

    move-object/from16 v32, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrTooLowText:Ljava/lang/String;

    move-object/from16 v33, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrTooHighText:Ljava/lang/String;

    move-object/from16 v34, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrRequiredText:Ljava/lang/String;

    move-object/from16 v35, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrMax:Ljava/lang/Integer;

    move-object/from16 v36, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrMin:Ljava/lang/Integer;

    move-object/from16 v37, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrSuffix:Ljava/lang/String;

    move-object/from16 v38, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrRequired:Ljava/lang/Boolean;

    move-object/from16 v39, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->inputType:Ljava/lang/String;

    move-object/from16 v40, v15

    iget-boolean v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->inputRequired:Z

    move/from16 v41, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->requiredRegex:Ljava/lang/String;

    move-object/from16 v42, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->blockedRegex:Ljava/lang/String;

    move-object/from16 v43, v15

    iget-boolean v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isCountDownTimerRequired:Z

    move/from16 v44, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->countDownTimerSeconds:Ljava/lang/Integer;

    move-object/from16 v45, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyFormId:Ljava/lang/String;

    move-object/from16 v46, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyVendorMetadata:Ljava/lang/String;

    move-object/from16 v47, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyProvider:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    const-string v0, ", id="

    move-object/from16 v48, v15

    const-string v15, ", text="

    move-object/from16 v49, v13

    const-string v13, "ProtocolStep(campaignId="

    invoke-static {v1, v2, v13, v0, v15}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", order="

    const-string v2, ", typeFormUrl="

    invoke-static {v4, v3, v1, v2, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", imageUrl="

    const-string v2, ", imageAlt="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", isBpStep="

    const-string v2, ", isTimerActive="

    invoke-static {v0, v7, v1, v8, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isBtHr="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", subtitle="

    const-string v2, ", cta="

    invoke-static {v0, v11, v1, v12, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", typeFormTitle="

    const-string v2, ", systolicLabel="

    move-object/from16 v3, v49

    invoke-static {v0, v3, v1, v14, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", systolicTooLowText="

    const-string v2, ", systolicTooHighText="

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", systolicRequiredText="

    const-string v2, ", systolicMax="

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", systolicMin="

    const-string v2, ", systolicSuffix="

    move-object/from16 v3, v20

    move-object/from16 v4, v21

    invoke-static {v0, v3, v1, v4, v2}, Lr80/c;->A(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    const-string v1, ", systolicRequired="

    const-string v2, ", diastolicLabel="

    move-object/from16 v3, v22

    move-object/from16 v4, v23

    invoke-static {v4, v3, v1, v2, v0}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", diastolicTooLowText="

    const-string v2, ", diastolicTooHighText="

    move-object/from16 v3, v24

    move-object/from16 v4, v25

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", diastolicRequiredText="

    const-string v2, ", diastolicMax="

    move-object/from16 v3, v26

    move-object/from16 v4, v27

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", diastolicMin="

    const-string v2, ", diastolicSuffix="

    move-object/from16 v3, v28

    move-object/from16 v4, v29

    invoke-static {v0, v3, v1, v4, v2}, Lr80/c;->A(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    const-string v1, ", diastolicRequired="

    const-string v2, ", hrLabel="

    move-object/from16 v3, v30

    move-object/from16 v4, v31

    invoke-static {v4, v3, v1, v2, v0}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", hrTooLowText="

    const-string v2, ", hrTooHighText="

    move-object/from16 v3, v32

    move-object/from16 v4, v33

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", hrRequiredText="

    const-string v2, ", hrMax="

    move-object/from16 v3, v34

    move-object/from16 v4, v35

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", hrMin="

    const-string v2, ", hrSuffix="

    move-object/from16 v3, v36

    move-object/from16 v4, v37

    invoke-static {v0, v3, v1, v4, v2}, Lr80/c;->A(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    const-string v1, ", hrRequired="

    const-string v2, ", inputType="

    move-object/from16 v3, v38

    move-object/from16 v4, v39

    invoke-static {v4, v3, v1, v2, v0}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", inputRequired="

    const-string v2, ", requiredRegex="

    move-object/from16 v3, v40

    move/from16 v4, v41

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", blockedRegex="

    const-string v2, ", isCountDownTimerRequired="

    move-object/from16 v3, v42

    move-object/from16 v4, v43

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move/from16 v1, v44

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", countDownTimerSeconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v45

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", surveyFormId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", surveyVendorMetadata="

    const-string v2, ", surveyProvider="

    move-object/from16 v3, v46

    move-object/from16 v4, v47

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v48

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->campaignId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->id:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->text:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->order:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->typeFormUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->imageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->imageAlt:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isBpStep:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isTimerActive:Ljava/lang/Boolean;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p2, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v0, p2}, Lvl/b;->s(Landroid/os/Parcel;ILjava/lang/Boolean;)V

    :goto_0
    iget-boolean p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isBtHr:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->title:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->subtitle:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->cta:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->typeFormTitle:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicLabel:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicTooLowText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicTooHighText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicRequiredText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicMax:Ljava/lang/Integer;

    if-nez p2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-static {p1, v0, p2}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_1
    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicMin:Ljava/lang/Integer;

    if-nez p2, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-static {p1, v0, p2}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_2
    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicSuffix:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->systolicRequired:Ljava/lang/Boolean;

    if-nez p2, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-static {p1, v0, p2}, Lvl/b;->s(Landroid/os/Parcel;ILjava/lang/Boolean;)V

    :goto_3
    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicLabel:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicTooLowText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicTooHighText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicRequiredText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicMax:Ljava/lang/Integer;

    if-nez p2, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_4

    :cond_4
    invoke-static {p1, v0, p2}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_4
    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicMin:Ljava/lang/Integer;

    if-nez p2, :cond_5

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_5

    :cond_5
    invoke-static {p1, v0, p2}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_5
    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicSuffix:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->diastolicRequired:Ljava/lang/Boolean;

    if-nez p2, :cond_6

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_6

    :cond_6
    invoke-static {p1, v0, p2}, Lvl/b;->s(Landroid/os/Parcel;ILjava/lang/Boolean;)V

    :goto_6
    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrLabel:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrTooLowText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrTooHighText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrRequiredText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrMax:Ljava/lang/Integer;

    if-nez p2, :cond_7

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_7

    :cond_7
    invoke-static {p1, v0, p2}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_7
    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrMin:Ljava/lang/Integer;

    if-nez p2, :cond_8

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_8

    :cond_8
    invoke-static {p1, v0, p2}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_8
    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrSuffix:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->hrRequired:Ljava/lang/Boolean;

    if-nez p2, :cond_9

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_9

    :cond_9
    invoke-static {p1, v0, p2}, Lvl/b;->s(Landroid/os/Parcel;ILjava/lang/Boolean;)V

    :goto_9
    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->inputType:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->inputRequired:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->requiredRegex:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->blockedRegex:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->isCountDownTimerRequired:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->countDownTimerSeconds:Ljava/lang/Integer;

    if-nez p2, :cond_a

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_a

    :cond_a
    invoke-static {p1, v0, p2}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_a
    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyFormId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyVendorMetadata:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->surveyProvider:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    if-nez p2, :cond_b

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_b
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
