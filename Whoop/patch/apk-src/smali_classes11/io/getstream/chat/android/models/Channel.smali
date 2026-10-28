.class public final Lio/getstream/chat/android/models/Channel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/models/CustomObject;
.implements Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/models/Channel$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008?\n\u0002\u0010\u000f\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008+\u0008\u0087\u0008\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u00a4\u0001B\u00c1\u0003\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\t\u0012\u000e\u0008\u0002\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u000e\u0008\u0002\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0014\u0012\u000e\u0008\u0002\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0014\u0012\u000e\u0008\u0002\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u0014\u0012\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d\u0012\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u0019\u0012\u0008\u0008\u0002\u0010\u001f\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010 \u001a\u00020\u0004\u0012\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\r\u0012\u0008\u0008\u0002\u0010#\u001a\u00020\t\u0012\u000e\u0008\u0002\u0010$\u001a\u0008\u0012\u0004\u0012\u00020%0\u0014\u0012\u000e\u0008\u0002\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u000e\u0008\u0002\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00040(\u0012\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0008\u0002\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0008\u0008\u0002\u0010+\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\u000e\u0008\u0002\u0010.\u001a\u0008\u0012\u0004\u0012\u00020/0\u0014\u0012\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u00101\u001a\u0004\u0018\u000102\u0012\u000e\u0008\u0002\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0014\u0012\n\u0008\u0002\u00104\u001a\u0004\u0018\u00010\r\u0012\u0014\u0008\u0002\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020706\u00a2\u0006\u0004\u00088\u00109J\u0016\u0010v\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010w2\u0006\u0010x\u001a\u00020\u0004H\u0016J\u0008\u0010y\u001a\u00020zH\u0007J\t\u0010{\u001a\u00020\u0004H\u00c6\u0003J\t\u0010|\u001a\u00020\u0004H\u00c6\u0003J\t\u0010}\u001a\u00020\u0004H\u00c6\u0003J\t\u0010~\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u007f\u001a\u00020\tH\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u000bH\u00c6\u0003J\u000c\u0010\u0081\u0001\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000c\u0010\u0082\u0001\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000c\u0010\u0083\u0001\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0011H\u00c6\u0003J\n\u0010\u0085\u0001\u001a\u00020\tH\u00c6\u0003J\u0010\u0010\u0086\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014H\u00c6\u0003J\u0010\u0010\u0087\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0014H\u00c6\u0003J\u0010\u0010\u0088\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0014H\u00c6\u0003J\u0010\u0010\u0089\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u0014H\u00c6\u0003J\n\u0010\u008a\u0001\u001a\u00020\u001dH\u00c6\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u008c\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0004H\u00c6\u0003J\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010XJ\u000c\u0010\u008f\u0001\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\n\u0010\u0090\u0001\u001a\u00020\tH\u00c6\u0003J\u0010\u0010\u0091\u0001\u001a\u0008\u0012\u0004\u0012\u00020%0\u0014H\u00c6\u0003J\u0010\u0010\u0092\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014H\u00c6\u0003J\u0010\u0010\u0093\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00040(H\u00c6\u0003J\u000c\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u0010\u0010\u0095\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014H\u00c6\u0003J\n\u0010\u0096\u0001\u001a\u00020\u000bH\u00c6\u0003J\u000c\u0010\u0097\u0001\u001a\u0004\u0018\u00010-H\u00c6\u0003J\u0010\u0010\u0098\u0001\u001a\u0008\u0012\u0004\u0012\u00020/0\u0014H\u00c6\u0003J\u0011\u0010\u0099\u0001\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010gJ\u000c\u0010\u009a\u0001\u001a\u0004\u0018\u000102H\u00c6\u0003J\u0010\u0010\u009b\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0014H\u00c6\u0003J\u000c\u0010\u009c\u0001\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u0016\u0010\u009d\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020706H\u00c6\u0003J\u00ca\u0003\u0010\u009e\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\t2\u000e\u0008\u0002\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u000e\u0008\u0002\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00142\u000e\u0008\u0002\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00142\u000e\u0008\u0002\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u00142\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u001f\u001a\u00020\t2\u0008\u0008\u0002\u0010 \u001a\u00020\u00042\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010#\u001a\u00020\t2\u000e\u0008\u0002\u0010$\u001a\u0008\u0012\u0004\u0012\u00020%0\u00142\u000e\u0008\u0002\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u000e\u0008\u0002\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00040(2\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u00172\u000e\u0008\u0002\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0008\u0008\u0002\u0010+\u001a\u00020\u000b2\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010-2\u000e\u0008\u0002\u0010.\u001a\u0008\u0012\u0004\u0012\u00020/0\u00142\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u00101\u001a\u0004\u0018\u0001022\u000e\u0008\u0002\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00142\n\u0008\u0002\u00104\u001a\u0004\u0018\u00010\r2\u0014\u0008\u0002\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020706H\u00c6\u0001\u00a2\u0006\u0003\u0010\u009f\u0001J\u0015\u0010\u00a0\u0001\u001a\u00020\u000b2\t\u0010\u00a1\u0001\u001a\u0004\u0018\u000107H\u00d6\u0003J\n\u0010\u00a2\u0001\u001a\u00020\tH\u00d6\u0001J\n\u0010\u00a3\u0001\u001a\u00020\u0004H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u0010;R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u0010;R\u0011\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u0010;R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010;R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010@R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u0010BR\u0013\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010DR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008E\u0010DR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008F\u0010DR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008G\u0010HR\u0011\u0010\u0012\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008I\u0010@R\u0017\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008J\u0010KR\u0017\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008L\u0010KR\u0017\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008M\u0010KR\u0017\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008N\u0010KR\u0011\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008O\u0010PR\u0011\u0010\u001e\u001a\u00020\u0019\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Q\u0010RR\u001c\u0010\u001f\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008S\u0010T\u001a\u0004\u0008U\u0010@R\u0011\u0010 \u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008V\u0010;R\u0015\u0010!\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010Y\u001a\u0004\u0008W\u0010XR\u0013\u0010\"\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Z\u0010DR\u0011\u0010#\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008[\u0010@R\u0017\u0010$\u001a\u0008\u0012\u0004\u0012\u00020%0\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\\\u0010KR\u0017\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008]\u0010KR\u0017\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00040(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008^\u0010_R\u0013\u0010)\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008`\u0010aR\u0017\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008b\u0010KR\u0011\u0010+\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010BR\u0013\u0010,\u001a\u0004\u0018\u00010-\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008c\u0010dR\u0017\u0010.\u001a\u0008\u0012\u0004\u0012\u00020/0\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008e\u0010KR\u0015\u00100\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010h\u001a\u0004\u0008f\u0010gR\u0013\u00101\u001a\u0004\u0018\u000102\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008i\u0010jR\u0017\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008k\u0010KR\u0013\u00104\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008l\u0010DR \u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020706X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008m\u0010nR\u0011\u0010o\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008p\u0010;R\u0013\u0010q\u001a\u0004\u0018\u00010\r8F\u00a2\u0006\u0006\u001a\u0004\u0008r\u0010DR\u001a\u0010s\u001a\u00020\u000b8FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008t\u0010T\u001a\u0004\u0008u\u0010B\u00a8\u0006\u00a5\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/models/Channel;",
        "Lio/getstream/chat/android/models/CustomObject;",
        "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;",
        "id",
        "",
        "type",
        "name",
        "image",
        "watcherCount",
        "",
        "frozen",
        "",
        "createdAt",
        "Ljava/util/Date;",
        "deletedAt",
        "updatedAt",
        "syncStatus",
        "Lio/getstream/chat/android/models/SyncStatus;",
        "memberCount",
        "messages",
        "",
        "Lio/getstream/chat/android/models/Message;",
        "members",
        "Lio/getstream/chat/android/models/Member;",
        "watchers",
        "Lio/getstream/chat/android/models/User;",
        "read",
        "Lio/getstream/chat/android/models/ChannelUserRead;",
        "config",
        "Lio/getstream/chat/android/models/Config;",
        "createdBy",
        "unreadCount",
        "team",
        "hidden",
        "hiddenMessagesBefore",
        "cooldown",
        "pendingMessages",
        "Lio/getstream/chat/android/models/PendingMessage;",
        "pinnedMessages",
        "ownCapabilities",
        "",
        "membership",
        "cachedLatestMessages",
        "isInsideSearch",
        "draftMessage",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "activeLiveLocations",
        "Lio/getstream/chat/android/models/Location;",
        "messageCount",
        "pushPreference",
        "Lio/getstream/chat/android/models/PushPreference;",
        "filterTags",
        "lastMessageAt",
        "extraData",
        "",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;)V",
        "getId",
        "()Ljava/lang/String;",
        "getType",
        "getName",
        "getImage",
        "getWatcherCount",
        "()I",
        "getFrozen",
        "()Z",
        "getCreatedAt",
        "()Ljava/util/Date;",
        "getDeletedAt",
        "getUpdatedAt",
        "getSyncStatus",
        "()Lio/getstream/chat/android/models/SyncStatus;",
        "getMemberCount",
        "getMessages",
        "()Ljava/util/List;",
        "getMembers",
        "getWatchers",
        "getRead",
        "getConfig",
        "()Lio/getstream/chat/android/models/Config;",
        "getCreatedBy",
        "()Lio/getstream/chat/android/models/User;",
        "getUnreadCount$annotations",
        "()V",
        "getUnreadCount",
        "getTeam",
        "getHidden",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getHiddenMessagesBefore",
        "getCooldown",
        "getPendingMessages",
        "getPinnedMessages",
        "getOwnCapabilities",
        "()Ljava/util/Set;",
        "getMembership",
        "()Lio/getstream/chat/android/models/Member;",
        "getCachedLatestMessages",
        "getDraftMessage",
        "()Lio/getstream/chat/android/models/DraftMessage;",
        "getActiveLiveLocations",
        "getMessageCount",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getPushPreference",
        "()Lio/getstream/chat/android/models/PushPreference;",
        "getFilterTags",
        "getLastMessageAt",
        "getExtraData",
        "()Ljava/util/Map;",
        "cid",
        "getCid",
        "lastUpdated",
        "getLastUpdated",
        "hasUnread",
        "getHasUnread$annotations",
        "getHasUnread",
        "getComparableField",
        "",
        "fieldName",
        "newBuilder",
        "Lio/getstream/chat/android/models/Channel$Builder;",
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
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;)Lio/getstream/chat/android/models/Channel;",
        "equals",
        "other",
        "hashCode",
        "toString",
        "Builder",
        "stream-chat-android-core"
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
.field private final activeLiveLocations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Location;",
            ">;"
        }
    .end annotation
.end field

.field private final cachedLatestMessages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation
.end field

.field private final config:Lio/getstream/chat/android/models/Config;

.field private final cooldown:I

.field private final createdAt:Ljava/util/Date;

.field private final createdBy:Lio/getstream/chat/android/models/User;

.field private final deletedAt:Ljava/util/Date;

.field private final draftMessage:Lio/getstream/chat/android/models/DraftMessage;

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

.field private final filterTags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final frozen:Z

.field private final hidden:Ljava/lang/Boolean;

.field private final hiddenMessagesBefore:Ljava/util/Date;

.field private final id:Ljava/lang/String;

.field private final image:Ljava/lang/String;

.field private final isInsideSearch:Z

.field private final lastMessageAt:Ljava/util/Date;

.field private final memberCount:I

.field private final members:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;"
        }
    .end annotation
.end field

.field private final membership:Lio/getstream/chat/android/models/Member;

.field private final messageCount:Ljava/lang/Integer;

.field private final messages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation
.end field

.field private final name:Ljava/lang/String;

.field private final ownCapabilities:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final pendingMessages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/PendingMessage;",
            ">;"
        }
    .end annotation
.end field

.field private final pinnedMessages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation
.end field

.field private final pushPreference:Lio/getstream/chat/android/models/PushPreference;

.field private final read:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;"
        }
    .end annotation
.end field

.field private final syncStatus:Lio/getstream/chat/android/models/SyncStatus;

.field private final team:Ljava/lang/String;

.field private final type:Ljava/lang/String;

.field private final unreadCount:I

.field private final updatedAt:Ljava/util/Date;

.field private final watcherCount:I

.field private final watchers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 39

    .line 1
    const/16 v37, 0x7

    const/16 v38, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

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

    const/16 v36, -0x1

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v38}, Lio/getstream/chat/android/models/Channel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "IZ",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "I",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;",
            "Lio/getstream/chat/android/models/Config;",
            "Lio/getstream/chat/android/models/User;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/util/Date;",
            "I",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/PendingMessage;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/models/Member;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;Z",
            "Lio/getstream/chat/android/models/DraftMessage;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Location;",
            ">;",
            "Ljava/lang/Integer;",
            "Lio/getstream/chat/android/models/PushPreference;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Date;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p10

    move-object/from16 v6, p12

    move-object/from16 v7, p13

    move-object/from16 v8, p14

    move-object/from16 v9, p15

    move-object/from16 v10, p16

    move-object/from16 v11, p17

    move-object/from16 v12, p19

    move-object/from16 v13, p23

    move-object/from16 v14, p24

    move-object/from16 v15, p25

    const-string v0, "id"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syncStatus"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messages"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "members"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "watchers"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "read"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdBy"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "team"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pendingMessages"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pinnedMessages"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cachedLatestMessages"

    move-object/from16 v15, p27

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activeLiveLocations"

    move-object/from16 v15, p30

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filterTags"

    move-object/from16 v15, p33

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v15, p35

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    .line 3
    iput-object v1, v0, Lio/getstream/chat/android/models/Channel;->id:Ljava/lang/String;

    .line 4
    iput-object v2, v0, Lio/getstream/chat/android/models/Channel;->type:Ljava/lang/String;

    .line 5
    iput-object v3, v0, Lio/getstream/chat/android/models/Channel;->name:Ljava/lang/String;

    .line 6
    iput-object v4, v0, Lio/getstream/chat/android/models/Channel;->image:Ljava/lang/String;

    move/from16 v1, p5

    .line 7
    iput v1, v0, Lio/getstream/chat/android/models/Channel;->watcherCount:I

    move/from16 v1, p6

    .line 8
    iput-boolean v1, v0, Lio/getstream/chat/android/models/Channel;->frozen:Z

    move-object/from16 v1, p7

    .line 9
    iput-object v1, v0, Lio/getstream/chat/android/models/Channel;->createdAt:Ljava/util/Date;

    move-object/from16 v1, p8

    .line 10
    iput-object v1, v0, Lio/getstream/chat/android/models/Channel;->deletedAt:Ljava/util/Date;

    move-object/from16 v1, p9

    .line 11
    iput-object v1, v0, Lio/getstream/chat/android/models/Channel;->updatedAt:Ljava/util/Date;

    .line 12
    iput-object v5, v0, Lio/getstream/chat/android/models/Channel;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    move/from16 v1, p11

    .line 13
    iput v1, v0, Lio/getstream/chat/android/models/Channel;->memberCount:I

    .line 14
    iput-object v6, v0, Lio/getstream/chat/android/models/Channel;->messages:Ljava/util/List;

    .line 15
    iput-object v7, v0, Lio/getstream/chat/android/models/Channel;->members:Ljava/util/List;

    .line 16
    iput-object v8, v0, Lio/getstream/chat/android/models/Channel;->watchers:Ljava/util/List;

    .line 17
    iput-object v9, v0, Lio/getstream/chat/android/models/Channel;->read:Ljava/util/List;

    .line 18
    iput-object v10, v0, Lio/getstream/chat/android/models/Channel;->config:Lio/getstream/chat/android/models/Config;

    .line 19
    iput-object v11, v0, Lio/getstream/chat/android/models/Channel;->createdBy:Lio/getstream/chat/android/models/User;

    move/from16 v1, p18

    .line 20
    iput v1, v0, Lio/getstream/chat/android/models/Channel;->unreadCount:I

    .line 21
    iput-object v12, v0, Lio/getstream/chat/android/models/Channel;->team:Ljava/lang/String;

    move-object/from16 v1, p20

    .line 22
    iput-object v1, v0, Lio/getstream/chat/android/models/Channel;->hidden:Ljava/lang/Boolean;

    move-object/from16 v1, p21

    .line 23
    iput-object v1, v0, Lio/getstream/chat/android/models/Channel;->hiddenMessagesBefore:Ljava/util/Date;

    move/from16 v1, p22

    .line 24
    iput v1, v0, Lio/getstream/chat/android/models/Channel;->cooldown:I

    .line 25
    iput-object v13, v0, Lio/getstream/chat/android/models/Channel;->pendingMessages:Ljava/util/List;

    .line 26
    iput-object v14, v0, Lio/getstream/chat/android/models/Channel;->pinnedMessages:Ljava/util/List;

    move-object/from16 v1, p25

    .line 27
    iput-object v1, v0, Lio/getstream/chat/android/models/Channel;->ownCapabilities:Ljava/util/Set;

    move-object/from16 v1, p26

    .line 28
    iput-object v1, v0, Lio/getstream/chat/android/models/Channel;->membership:Lio/getstream/chat/android/models/Member;

    move-object/from16 v1, p27

    .line 29
    iput-object v1, v0, Lio/getstream/chat/android/models/Channel;->cachedLatestMessages:Ljava/util/List;

    move/from16 v1, p28

    .line 30
    iput-boolean v1, v0, Lio/getstream/chat/android/models/Channel;->isInsideSearch:Z

    move-object/from16 v1, p29

    .line 31
    iput-object v1, v0, Lio/getstream/chat/android/models/Channel;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    move-object/from16 v1, p30

    .line 32
    iput-object v1, v0, Lio/getstream/chat/android/models/Channel;->activeLiveLocations:Ljava/util/List;

    move-object/from16 v1, p31

    .line 33
    iput-object v1, v0, Lio/getstream/chat/android/models/Channel;->messageCount:Ljava/lang/Integer;

    move-object/from16 v1, p32

    .line 34
    iput-object v1, v0, Lio/getstream/chat/android/models/Channel;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    move-object/from16 v1, p33

    .line 35
    iput-object v1, v0, Lio/getstream/chat/android/models/Channel;->filterTags:Ljava/util/List;

    move-object/from16 v1, p34

    .line 36
    iput-object v1, v0, Lio/getstream/chat/android/models/Channel;->lastMessageAt:Ljava/util/Date;

    .line 37
    iput-object v15, v0, Lio/getstream/chat/android/models/Channel;->extraData:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 47

    move/from16 v0, p36

    and-int/lit8 v1, v0, 0x1

    .line 38
    const-string v2, ""

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    move-object v4, v2

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    move-object v5, v2

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    const/4 v6, 0x0

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    const/4 v8, 0x0

    goto :goto_5

    :cond_5
    move/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    const/4 v9, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v11, v0, 0x80

    if-eqz v11, :cond_7

    const/4 v11, 0x0

    goto :goto_7

    :cond_7
    move-object/from16 v11, p8

    :goto_7
    and-int/lit16 v12, v0, 0x100

    if-eqz v12, :cond_8

    const/4 v12, 0x0

    goto :goto_8

    :cond_8
    move-object/from16 v12, p9

    :goto_8
    and-int/lit16 v13, v0, 0x200

    if-eqz v13, :cond_9

    .line 39
    sget-object v13, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

    goto :goto_9

    :cond_9
    move-object/from16 v13, p10

    :goto_9
    and-int/lit16 v14, v0, 0x400

    if-eqz v14, :cond_a

    const/4 v14, 0x0

    goto :goto_a

    :cond_a
    move/from16 v14, p11

    :goto_a
    and-int/lit16 v15, v0, 0x800

    .line 40
    sget-object v16, Lm83/y;->w:Lm83/y;

    if-eqz v15, :cond_b

    move-object/from16 v15, v16

    goto :goto_b

    :cond_b
    move-object/from16 v15, p12

    :goto_b
    and-int/lit16 v7, v0, 0x1000

    if-eqz v7, :cond_c

    move-object/from16 v7, v16

    goto :goto_c

    :cond_c
    move-object/from16 v7, p13

    :goto_c
    and-int/lit16 v10, v0, 0x2000

    if-eqz v10, :cond_d

    move-object/from16 v10, v16

    goto :goto_d

    :cond_d
    move-object/from16 v10, p14

    :goto_d
    move-object/from16 p38, v1

    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_e

    move-object/from16 v1, v16

    goto :goto_e

    :cond_e
    move-object/from16 v1, p15

    :goto_e
    const v17, 0x8000

    and-int v17, v0, v17

    if-eqz v17, :cond_f

    .line 41
    new-instance v18, Lio/getstream/chat/android/models/Config;

    const v45, 0x3ffffff

    const/16 v46, 0x0

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

    invoke-direct/range {v18 .. v46}, Lio/getstream/chat/android/models/Config;-><init>(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZZZZZZZZZZZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_f

    :cond_f
    move-object/from16 v18, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    .line 42
    new-instance v19, Lio/getstream/chat/android/models/User;

    const v45, 0x1ffffff

    const/16 v46, 0x0

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

    invoke-direct/range {v19 .. v46}, Lio/getstream/chat/android/models/User;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_10

    :cond_10
    move-object/from16 v19, p17

    :goto_10
    const/high16 v17, 0x20000

    and-int v17, v0, v17

    if-eqz v17, :cond_11

    const/16 v17, 0x0

    goto :goto_11

    :cond_11
    move/from16 v17, p18

    :goto_11
    const/high16 v20, 0x40000

    and-int v20, v0, v20

    if-eqz v20, :cond_12

    goto :goto_12

    :cond_12
    move-object/from16 v2, p19

    :goto_12
    const/high16 v20, 0x80000

    and-int v20, v0, v20

    if-eqz v20, :cond_13

    const/16 v20, 0x0

    goto :goto_13

    :cond_13
    move-object/from16 v20, p20

    :goto_13
    const/high16 v21, 0x100000

    and-int v21, v0, v21

    if-eqz v21, :cond_14

    const/16 v21, 0x0

    goto :goto_14

    :cond_14
    move-object/from16 v21, p21

    :goto_14
    const/high16 v22, 0x200000

    and-int v22, v0, v22

    if-eqz v22, :cond_15

    const/16 v22, 0x0

    goto :goto_15

    :cond_15
    move/from16 v22, p22

    :goto_15
    const/high16 v23, 0x400000

    and-int v23, v0, v23

    if-eqz v23, :cond_16

    move-object/from16 v23, v16

    goto :goto_16

    :cond_16
    move-object/from16 v23, p23

    :goto_16
    const/high16 v24, 0x800000

    and-int v24, v0, v24

    if-eqz v24, :cond_17

    move-object/from16 v24, v16

    goto :goto_17

    :cond_17
    move-object/from16 v24, p24

    :goto_17
    const/high16 v25, 0x1000000

    and-int v25, v0, v25

    if-eqz v25, :cond_18

    .line 43
    sget-object v25, Lm83/a0;->w:Lm83/a0;

    goto :goto_18

    :cond_18
    move-object/from16 v25, p25

    :goto_18
    const/high16 v26, 0x2000000

    and-int v26, v0, v26

    if-eqz v26, :cond_19

    const/16 v26, 0x0

    goto :goto_19

    :cond_19
    move-object/from16 v26, p26

    :goto_19
    const/high16 v27, 0x4000000

    and-int v27, v0, v27

    if-eqz v27, :cond_1a

    move-object/from16 v27, v16

    goto :goto_1a

    :cond_1a
    move-object/from16 v27, p27

    :goto_1a
    const/high16 v28, 0x8000000

    and-int v28, v0, v28

    if-eqz v28, :cond_1b

    const/16 v28, 0x0

    goto :goto_1b

    :cond_1b
    move/from16 v28, p28

    :goto_1b
    const/high16 v29, 0x10000000

    and-int v29, v0, v29

    if-eqz v29, :cond_1c

    const/16 v29, 0x0

    goto :goto_1c

    :cond_1c
    move-object/from16 v29, p29

    :goto_1c
    const/high16 v30, 0x20000000

    and-int v30, v0, v30

    if-eqz v30, :cond_1d

    move-object/from16 v30, v16

    goto :goto_1d

    :cond_1d
    move-object/from16 v30, p30

    :goto_1d
    const/high16 v31, 0x40000000    # 2.0f

    and-int v31, v0, v31

    if-eqz v31, :cond_1e

    const/16 v31, 0x0

    goto :goto_1e

    :cond_1e
    move-object/from16 v31, p31

    :goto_1e
    const/high16 v32, -0x80000000

    and-int v0, v0, v32

    if-eqz v0, :cond_1f

    const/4 v0, 0x0

    goto :goto_1f

    :cond_1f
    move-object/from16 v0, p32

    :goto_1f
    and-int/lit8 v32, p37, 0x1

    if-eqz v32, :cond_20

    goto :goto_20

    :cond_20
    move-object/from16 v16, p33

    :goto_20
    and-int/lit8 v32, p37, 0x2

    if-eqz v32, :cond_21

    const/16 v32, 0x0

    goto :goto_21

    :cond_21
    move-object/from16 v32, p34

    :goto_21
    and-int/lit8 v33, p37, 0x4

    if-eqz v33, :cond_22

    .line 44
    sget-object v33, Lm83/z;->w:Lm83/z;

    move-object/from16 p36, v33

    :goto_22
    move-object/from16 p1, p0

    move-object/from16 p2, p38

    move-object/from16 p33, v0

    move-object/from16 p16, v1

    move-object/from16 p20, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move/from16 p6, v6

    move-object/from16 p14, v7

    move/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p15, v10

    move-object/from16 p9, v11

    move-object/from16 p10, v12

    move-object/from16 p11, v13

    move/from16 p12, v14

    move-object/from16 p13, v15

    move-object/from16 p34, v16

    move/from16 p19, v17

    move-object/from16 p17, v18

    move-object/from16 p18, v19

    move-object/from16 p21, v20

    move-object/from16 p22, v21

    move/from16 p23, v22

    move-object/from16 p24, v23

    move-object/from16 p25, v24

    move-object/from16 p26, v25

    move-object/from16 p27, v26

    move-object/from16 p28, v27

    move/from16 p29, v28

    move-object/from16 p30, v29

    move-object/from16 p31, v30

    move-object/from16 p32, v31

    move-object/from16 p35, v32

    goto :goto_23

    :cond_22
    move-object/from16 p36, p35

    goto :goto_22

    .line 45
    :goto_23
    invoke-direct/range {p1 .. p36}, Lio/getstream/chat/android/models/Channel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p36

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lio/getstream/chat/android/models/Channel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/getstream/chat/android/models/Channel;->type:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/getstream/chat/android/models/Channel;->name:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/getstream/chat/android/models/Channel;->image:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lio/getstream/chat/android/models/Channel;->watcherCount:I

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lio/getstream/chat/android/models/Channel;->frozen:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lio/getstream/chat/android/models/Channel;->createdAt:Ljava/util/Date;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lio/getstream/chat/android/models/Channel;->deletedAt:Ljava/util/Date;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lio/getstream/chat/android/models/Channel;->updatedAt:Ljava/util/Date;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lio/getstream/chat/android/models/Channel;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lio/getstream/chat/android/models/Channel;->memberCount:I

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lio/getstream/chat/android/models/Channel;->messages:Ljava/util/List;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lio/getstream/chat/android/models/Channel;->members:Ljava/util/List;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lio/getstream/chat/android/models/Channel;->watchers:Ljava/util/List;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lio/getstream/chat/android/models/Channel;->read:Ljava/util/List;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel;->config:Lio/getstream/chat/android/models/Config;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p36, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel;->createdBy:Lio/getstream/chat/android/models/User;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p36, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget v1, v0, Lio/getstream/chat/android/models/Channel;->unreadCount:I

    goto :goto_11

    :cond_11
    move/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p36, v16

    move/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel;->team:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p36, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel;->hidden:Ljava/lang/Boolean;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p36, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel;->hiddenMessagesBefore:Ljava/util/Date;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p36, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_15

    iget v1, v0, Lio/getstream/chat/android/models/Channel;->cooldown:I

    goto :goto_15

    :cond_15
    move/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p36, v16

    move/from16 p8, v1

    if-eqz v16, :cond_16

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel;->pendingMessages:Ljava/util/List;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p36, v16

    move-object/from16 p9, v1

    if-eqz v16, :cond_17

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel;->pinnedMessages:Ljava/util/List;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p36, v16

    move-object/from16 p10, v1

    if-eqz v16, :cond_18

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel;->ownCapabilities:Ljava/util/Set;

    goto :goto_18

    :cond_18
    move-object/from16 v1, p25

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p36, v16

    move-object/from16 p11, v1

    if-eqz v16, :cond_19

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel;->membership:Lio/getstream/chat/android/models/Member;

    goto :goto_19

    :cond_19
    move-object/from16 v1, p26

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, p36, v16

    move-object/from16 p12, v1

    if-eqz v16, :cond_1a

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel;->cachedLatestMessages:Ljava/util/List;

    goto :goto_1a

    :cond_1a
    move-object/from16 v1, p27

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v16, p36, v16

    move-object/from16 p13, v1

    if-eqz v16, :cond_1b

    iget-boolean v1, v0, Lio/getstream/chat/android/models/Channel;->isInsideSearch:Z

    goto :goto_1b

    :cond_1b
    move/from16 v1, p28

    :goto_1b
    const/high16 v16, 0x10000000

    and-int v16, p36, v16

    move/from16 p14, v1

    if-eqz v16, :cond_1c

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    goto :goto_1c

    :cond_1c
    move-object/from16 v1, p29

    :goto_1c
    const/high16 v16, 0x20000000

    and-int v16, p36, v16

    move-object/from16 p15, v1

    if-eqz v16, :cond_1d

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel;->activeLiveLocations:Ljava/util/List;

    goto :goto_1d

    :cond_1d
    move-object/from16 v1, p30

    :goto_1d
    const/high16 v16, 0x40000000    # 2.0f

    and-int v16, p36, v16

    move-object/from16 p16, v1

    if-eqz v16, :cond_1e

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel;->messageCount:Ljava/lang/Integer;

    goto :goto_1e

    :cond_1e
    move-object/from16 v1, p31

    :goto_1e
    const/high16 v16, -0x80000000

    and-int v16, p36, v16

    move-object/from16 p17, v1

    if-eqz v16, :cond_1f

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    goto :goto_1f

    :cond_1f
    move-object/from16 v1, p32

    :goto_1f
    and-int/lit8 v16, p37, 0x1

    move-object/from16 p18, v1

    if-eqz v16, :cond_20

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel;->filterTags:Ljava/util/List;

    goto :goto_20

    :cond_20
    move-object/from16 v1, p33

    :goto_20
    and-int/lit8 v16, p37, 0x2

    move-object/from16 p19, v1

    if-eqz v16, :cond_21

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel;->lastMessageAt:Ljava/util/Date;

    goto :goto_21

    :cond_21
    move-object/from16 v1, p34

    :goto_21
    and-int/lit8 v16, p37, 0x4

    if-eqz v16, :cond_22

    move-object/from16 p20, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel;->extraData:Ljava/util/Map;

    move-object/from16 p35, p20

    move-object/from16 p36, v1

    move-object/from16 p21, p6

    move-object/from16 p22, p7

    move/from16 p23, p8

    move-object/from16 p24, p9

    move-object/from16 p25, p10

    move-object/from16 p26, p11

    move-object/from16 p27, p12

    move-object/from16 p28, p13

    move/from16 p29, p14

    move-object/from16 p30, p15

    move-object/from16 p31, p16

    move-object/from16 p32, p17

    move-object/from16 p33, p18

    move-object/from16 p34, p19

    move-object/from16 p16, v2

    move/from16 p6, v6

    move/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    :goto_22
    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_23

    :cond_22
    move-object/from16 p36, p35

    move-object/from16 p35, v1

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p22, p7

    move/from16 p23, p8

    move-object/from16 p24, p9

    move-object/from16 p25, p10

    move-object/from16 p26, p11

    move-object/from16 p27, p12

    move-object/from16 p28, p13

    move/from16 p29, p14

    move-object/from16 p30, p15

    move-object/from16 p31, p16

    move-object/from16 p32, p17

    move-object/from16 p33, p18

    move-object/from16 p34, p19

    move-object/from16 p16, v2

    move-object/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move/from16 p19, p4

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    goto :goto_22

    :goto_23
    invoke-virtual/range {p1 .. p36}, Lio/getstream/chat/android/models/Channel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;)Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getHasUnread$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method public static synthetic getUnreadCount$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lio/getstream/chat/android/models/SyncStatus;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    return-object v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/Channel;->memberCount:I

    return v0
.end method

.method public final component12()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->messages:Ljava/util/List;

    return-object v0
.end method

.method public final component13()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->members:Ljava/util/List;

    return-object v0
.end method

.method public final component14()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->watchers:Ljava/util/List;

    return-object v0
.end method

.method public final component15()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->read:Ljava/util/List;

    return-object v0
.end method

.method public final component16()Lio/getstream/chat/android/models/Config;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->config:Lio/getstream/chat/android/models/Config;

    return-object v0
.end method

.method public final component17()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->createdBy:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final component18()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/Channel;->unreadCount:I

    return v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->team:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->hidden:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component21()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->hiddenMessagesBefore:Ljava/util/Date;

    return-object v0
.end method

.method public final component22()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/Channel;->cooldown:I

    return v0
.end method

.method public final component23()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/PendingMessage;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->pendingMessages:Ljava/util/List;

    return-object v0
.end method

.method public final component24()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->pinnedMessages:Ljava/util/List;

    return-object v0
.end method

.method public final component25()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->ownCapabilities:Ljava/util/Set;

    return-object v0
.end method

.method public final component26()Lio/getstream/chat/android/models/Member;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->membership:Lio/getstream/chat/android/models/Member;

    return-object v0
.end method

.method public final component27()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->cachedLatestMessages:Ljava/util/List;

    return-object v0
.end method

.method public final component28()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Channel;->isInsideSearch:Z

    return v0
.end method

.method public final component29()Lio/getstream/chat/android/models/DraftMessage;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component30()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Location;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->activeLiveLocations:Ljava/util/List;

    return-object v0
.end method

.method public final component31()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->messageCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component32()Lio/getstream/chat/android/models/PushPreference;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    return-object v0
.end method

.method public final component33()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->filterTags:Ljava/util/List;

    return-object v0
.end method

.method public final component34()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->lastMessageAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component35()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/Channel;->watcherCount:I

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Channel;->frozen:Z

    return v0
.end method

.method public final component7()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component8()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->deletedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component9()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;)Lio/getstream/chat/android/models/Channel;
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "IZ",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "I",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;",
            "Lio/getstream/chat/android/models/Config;",
            "Lio/getstream/chat/android/models/User;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/util/Date;",
            "I",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/PendingMessage;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/models/Member;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;Z",
            "Lio/getstream/chat/android/models/DraftMessage;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Location;",
            ">;",
            "Ljava/lang/Integer;",
            "Lio/getstream/chat/android/models/PushPreference;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Date;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/models/Channel;"
        }
    .end annotation

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syncStatus"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messages"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "members"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "watchers"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "read"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    move-object/from16 v6, p16

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdBy"

    move-object/from16 v7, p17

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "team"

    move-object/from16 v8, p19

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pendingMessages"

    move-object/from16 v9, p23

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pinnedMessages"

    move-object/from16 v10, p24

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    move-object/from16 v12, p25

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cachedLatestMessages"

    move-object/from16 v1, p27

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activeLiveLocations"

    move-object/from16 v1, p30

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filterTags"

    move-object/from16 v1, p33

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v1, p35

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/models/Channel;

    move-object/from16 v16, p15

    move/from16 v19, p18

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move/from16 v23, p22

    move-object/from16 v27, p26

    move-object/from16 v28, p27

    move/from16 v29, p28

    move-object/from16 v30, p29

    move-object/from16 v31, p30

    move-object/from16 v32, p31

    move-object/from16 v33, p32

    move-object/from16 v34, p33

    move-object/from16 v35, p34

    move-object/from16 v36, p35

    move-object/from16 v17, v6

    move-object/from16 v18, v7

    move-object/from16 v20, v8

    move-object/from16 v24, v9

    move-object/from16 v25, v10

    move-object/from16 v26, v12

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v12, p11

    invoke-direct/range {v1 .. v36}, Lio/getstream/chat/android/models/Channel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/models/Channel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/models/Channel;

    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->image:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->image:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lio/getstream/chat/android/models/Channel;->watcherCount:I

    iget v3, p1, Lio/getstream/chat/android/models/Channel;->watcherCount:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lio/getstream/chat/android/models/Channel;->frozen:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/models/Channel;->frozen:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->createdAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->createdAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->deletedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->deletedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->updatedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->updatedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lio/getstream/chat/android/models/Channel;->memberCount:I

    iget v3, p1, Lio/getstream/chat/android/models/Channel;->memberCount:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->messages:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->messages:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->members:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->members:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->watchers:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->watchers:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->read:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->read:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->config:Lio/getstream/chat/android/models/Config;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->config:Lio/getstream/chat/android/models/Config;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->createdBy:Lio/getstream/chat/android/models/User;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->createdBy:Lio/getstream/chat/android/models/User;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget v1, p0, Lio/getstream/chat/android/models/Channel;->unreadCount:I

    iget v3, p1, Lio/getstream/chat/android/models/Channel;->unreadCount:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->team:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->team:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->hidden:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->hidden:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->hiddenMessagesBefore:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->hiddenMessagesBefore:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget v1, p0, Lio/getstream/chat/android/models/Channel;->cooldown:I

    iget v3, p1, Lio/getstream/chat/android/models/Channel;->cooldown:I

    if-eq v1, v3, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->pendingMessages:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->pendingMessages:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->pinnedMessages:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->pinnedMessages:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->ownCapabilities:Ljava/util/Set;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->ownCapabilities:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->membership:Lio/getstream/chat/android/models/Member;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->membership:Lio/getstream/chat/android/models/Member;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->cachedLatestMessages:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->cachedLatestMessages:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    iget-boolean v1, p0, Lio/getstream/chat/android/models/Channel;->isInsideSearch:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/models/Channel;->isInsideSearch:Z

    if-eq v1, v3, :cond_1d

    return v2

    :cond_1d
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->activeLiveLocations:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->activeLiveLocations:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    return v2

    :cond_1f
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->messageCount:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->messageCount:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    return v2

    :cond_21
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->filterTags:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->filterTags:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v2

    :cond_22
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->lastMessageAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/Channel;->lastMessageAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    return v2

    :cond_23
    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->extraData:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/chat/android/models/Channel;->extraData:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_24

    return v2

    :cond_24
    return v0
.end method

.method public final getActiveLiveLocations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Location;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->activeLiveLocations:Ljava/util/List;

    return-object v0
.end method

.method public final getCachedLatestMessages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->cachedLatestMessages:Ljava/util/List;

    return-object v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->id:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->type:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    const-string v0, ""

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->type:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->id:Ljava/lang/String;

    const-string v2, ":"

    invoke-static {v0, v2, v1}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getComparableField(Ljava/lang/String;)Ljava/lang/Comparable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Comparable<",
            "*>;"
        }
    .end annotation

    const-string v0, "fieldName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "unread_count"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "deleted_at"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "lastUpdated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "created_at"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "memberCount"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :sswitch_5
    const-string v0, "lastMessageAt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :sswitch_6
    const-string v0, "archived_at"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "watcher_count"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_0

    :sswitch_8
    const-string v0, "createdAt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/models/Channel;->createdAt:Ljava/util/Date;

    return-object p1

    :sswitch_9
    const-string v0, "last_updated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getLastUpdated()Ljava/util/Date;

    move-result-object p1

    return-object p1

    :sswitch_a
    const-string v0, "image"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/models/Channel;->image:Ljava/lang/String;

    return-object p1

    :sswitch_b
    const-string v0, "type"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/models/Channel;->type:Ljava/lang/String;

    return-object p1

    :sswitch_c
    const-string v0, "team"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    iget-object p1, p0, Lio/getstream/chat/android/models/Channel;->team:Ljava/lang/String;

    return-object p1

    :sswitch_d
    const-string v0, "name"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    iget-object p1, p0, Lio/getstream/chat/android/models/Channel;->name:Ljava/lang/String;

    return-object p1

    :sswitch_e
    const-string v0, "cid"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :sswitch_f
    const-string v0, "id"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    iget-object p1, p0, Lio/getstream/chat/android/models/Channel;->id:Ljava/lang/String;

    return-object p1

    :sswitch_10
    const-string v0, "member_count"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    iget p1, p0, Lio/getstream/chat/android/models/Channel;->memberCount:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :sswitch_11
    const-string v0, "last_message_at"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    iget-object p1, p0, Lio/getstream/chat/android/models/Channel;->lastMessageAt:Ljava/util/Date;

    return-object p1

    :sswitch_12
    const-string v0, "archivedAt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    iget-object p1, p0, Lio/getstream/chat/android/models/Channel;->membership:Lio/getstream/chat/android/models/Member;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Member;->getArchivedAt()Ljava/util/Date;

    move-result-object p1

    return-object p1

    :cond_a
    return-object v1

    :sswitch_13
    const-string v0, "pinned_at"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_0

    :sswitch_14
    const-string v0, "hasUnread"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto/16 :goto_0

    :sswitch_15
    const-string v0, "updated_at"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_0

    :sswitch_16
    const-string v0, "deletedAt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :cond_b
    iget-object p1, p0, Lio/getstream/chat/android/models/Channel;->deletedAt:Ljava/util/Date;

    return-object p1

    :sswitch_17
    const-string v0, "pinnedAt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_0

    :cond_c
    iget-object p1, p0, Lio/getstream/chat/android/models/Channel;->membership:Lio/getstream/chat/android/models/Member;

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Member;->getPinnedAt()Ljava/util/Date;

    move-result-object p1

    return-object p1

    :cond_d
    return-object v1

    :sswitch_18
    const-string v0, "cooldown"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_0

    :cond_e
    iget p1, p0, Lio/getstream/chat/android/models/Channel;->cooldown:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :sswitch_19
    const-string v0, "watcherCount"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_0

    :cond_f
    iget p1, p0, Lio/getstream/chat/android/models/Channel;->watcherCount:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :sswitch_1a
    const-string v0, "unreadCount"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_0

    :cond_10
    iget p1, p0, Lio/getstream/chat/android/models/Channel;->unreadCount:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :sswitch_1b
    const-string v0, "hidden"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_0

    :cond_11
    iget-object p1, p0, Lio/getstream/chat/android/models/Channel;->hidden:Ljava/lang/Boolean;

    return-object p1

    :sswitch_1c
    const-string v0, "frozen"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto :goto_0

    :cond_12
    iget-boolean p1, p0, Lio/getstream/chat/android/models/Channel;->frozen:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :sswitch_1d
    const-string v0, "updatedAt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto :goto_0

    :cond_13
    iget-object p1, p0, Lio/getstream/chat/android/models/Channel;->updatedAt:Ljava/util/Date;

    return-object p1

    :sswitch_1e
    const-string v0, "has_unread"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    :cond_14
    :goto_0
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getExtraData()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/Comparable;

    if-eqz v0, :cond_15

    check-cast p1, Ljava/lang/Comparable;

    return-object p1

    :cond_15
    return-object v1

    :cond_16
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getHasUnread()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7aba630c -> :sswitch_1e
        -0x742e59b2 -> :sswitch_1d
        -0x4b76ed60 -> :sswitch_1c
        -0x48916256 -> :sswitch_1b
        -0x3fd61d60 -> :sswitch_1a
        -0x2149c34d -> :sswitch_19
        -0x208cf895 -> :sswitch_18
        -0x191b79d5 -> :sswitch_17
        -0x156169d4 -> :sswitch_16
        -0x119c6dc9 -> :sswitch_15
        -0xd24e917 -> :sswitch_14
        -0xa535206 -> :sswitch_13
        -0x63b304b -> :sswitch_12
        -0x4f2f74c -> :sswitch_11
        -0x3899cd6 -> :sswitch_10
        0xd1b -> :sswitch_f
        0x180be -> :sswitch_e
        0x337a8b -> :sswitch_d
        0x36425d -> :sswitch_c
        0x368f3a -> :sswitch_b
        0x5faa95b -> :sswitch_a
        0x14302412 -> :sswitch_9
        0x23aa6d3b -> :sswitch_8
        0x272d50cc -> :sswitch_7
        0x3ed595b0 -> :sswitch_6
        0x3f3738a4 -> :sswitch_5
        0x50f26695 -> :sswitch_4
        0x51a3a8ea -> :sswitch_3
        0x6254f145 -> :sswitch_2
        0x69349e19 -> :sswitch_1
        0x742e687f -> :sswitch_0
    .end sparse-switch
.end method

.method public final getConfig()Lio/getstream/chat/android/models/Config;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->config:Lio/getstream/chat/android/models/Config;

    return-object v0
.end method

.method public final getCooldown()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/Channel;->cooldown:I

    return v0
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getCreatedBy()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->createdBy:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final getDeletedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->deletedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getDraftMessage()Lio/getstream/chat/android/models/DraftMessage;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    return-object v0
.end method

.method public getExtraData()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public getExtraValue(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;)TT;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lio/getstream/chat/android/models/CustomObject;->getExtraValue(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getFilterTags()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->filterTags:Ljava/util/List;

    return-object v0
.end method

.method public final getFrozen()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Channel;->frozen:Z

    return v0
.end method

.method public final getHasUnread()Z
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/Channel;->unreadCount:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getHidden()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->hidden:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getHiddenMessagesBefore()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->hiddenMessagesBefore:Ljava/util/Date;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastMessageAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->lastMessageAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getLastUpdated()Ljava/util/Date;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->lastMessageAt:Ljava/util/Date;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->createdAt:Ljava/util/Date;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    return-object v0

    :cond_3
    :goto_1
    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getMemberCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/Channel;->memberCount:I

    return v0
.end method

.method public final getMembers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->members:Ljava/util/List;

    return-object v0
.end method

.method public final getMembership()Lio/getstream/chat/android/models/Member;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->membership:Lio/getstream/chat/android/models/Member;

    return-object v0
.end method

.method public final getMessageCount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->messageCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMessages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->messages:Ljava/util/List;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getOwnCapabilities()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->ownCapabilities:Ljava/util/Set;

    return-object v0
.end method

.method public final getPendingMessages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/PendingMessage;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->pendingMessages:Ljava/util/List;

    return-object v0
.end method

.method public final getPinnedMessages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->pinnedMessages:Ljava/util/List;

    return-object v0
.end method

.method public final getPushPreference()Lio/getstream/chat/android/models/PushPreference;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    return-object v0
.end method

.method public final getRead()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->read:Ljava/util/List;

    return-object v0
.end method

.method public final getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    return-object v0
.end method

.method public final getTeam()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->team:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnreadCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/Channel;->unreadCount:I

    return v0
.end method

.method public final getUpdatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getWatcherCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/Channel;->watcherCount:I

    return v0
.end method

.method public final getWatchers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->watchers:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->type:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->image:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/models/Channel;->watcherCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/models/Channel;->frozen:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->createdAt:Ljava/util/Date;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->deletedAt:Ljava/util/Date;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->updatedAt:Ljava/util/Date;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lio/getstream/chat/android/models/Channel;->memberCount:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->messages:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->members:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->watchers:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->read:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->config:Lio/getstream/chat/android/models/Config;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Config;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/models/Channel;->createdBy:Lio/getstream/chat/android/models/User;

    invoke-static {v0, v2, v1}, Ld13/a;->b(Lio/getstream/chat/android/models/User;II)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/models/Channel;->unreadCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->team:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->hidden:Ljava/lang/Boolean;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->hiddenMessagesBefore:Ljava/util/Date;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/models/Channel;->cooldown:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->pendingMessages:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->pinnedMessages:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->ownCapabilities:Ljava/util/Set;

    invoke-static {v2, v0, v1}, Lm4/a;->a(Ljava/util/Set;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->membership:Lio/getstream/chat/android/models/Member;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Member;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->cachedLatestMessages:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/models/Channel;->isInsideSearch:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lio/getstream/chat/android/models/DraftMessage;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->activeLiveLocations:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->messageCount:Ljava/lang/Integer;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Lio/getstream/chat/android/models/PushPreference;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->filterTags:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Channel;->lastMessageAt:Ljava/util/Date;

    if-nez v2, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/models/Channel;->extraData:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isInsideSearch()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Channel;->isInsideSearch:Z

    return v0
.end method

.method public final newBuilder()Lio/getstream/chat/android/models/Channel$Builder;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/models/Channel$Builder;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/models/Channel$Builder;-><init>(Lio/getstream/chat/android/models/Channel;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 38

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel;->id:Ljava/lang/String;

    iget-object v2, v0, Lio/getstream/chat/android/models/Channel;->type:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/chat/android/models/Channel;->name:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/chat/android/models/Channel;->image:Ljava/lang/String;

    iget v5, v0, Lio/getstream/chat/android/models/Channel;->watcherCount:I

    iget-boolean v6, v0, Lio/getstream/chat/android/models/Channel;->frozen:Z

    iget-object v7, v0, Lio/getstream/chat/android/models/Channel;->createdAt:Ljava/util/Date;

    iget-object v8, v0, Lio/getstream/chat/android/models/Channel;->deletedAt:Ljava/util/Date;

    iget-object v9, v0, Lio/getstream/chat/android/models/Channel;->updatedAt:Ljava/util/Date;

    iget-object v10, v0, Lio/getstream/chat/android/models/Channel;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    iget v11, v0, Lio/getstream/chat/android/models/Channel;->memberCount:I

    iget-object v12, v0, Lio/getstream/chat/android/models/Channel;->messages:Ljava/util/List;

    iget-object v13, v0, Lio/getstream/chat/android/models/Channel;->members:Ljava/util/List;

    iget-object v14, v0, Lio/getstream/chat/android/models/Channel;->watchers:Ljava/util/List;

    iget-object v15, v0, Lio/getstream/chat/android/models/Channel;->read:Ljava/util/List;

    move-object/from16 v16, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/Channel;->config:Lio/getstream/chat/android/models/Config;

    move-object/from16 v17, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/Channel;->createdBy:Lio/getstream/chat/android/models/User;

    move-object/from16 v18, v15

    iget v15, v0, Lio/getstream/chat/android/models/Channel;->unreadCount:I

    move/from16 v19, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/Channel;->team:Ljava/lang/String;

    move-object/from16 v20, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/Channel;->hidden:Ljava/lang/Boolean;

    move-object/from16 v21, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/Channel;->hiddenMessagesBefore:Ljava/util/Date;

    move-object/from16 v22, v15

    iget v15, v0, Lio/getstream/chat/android/models/Channel;->cooldown:I

    move/from16 v23, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/Channel;->pendingMessages:Ljava/util/List;

    move-object/from16 v24, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/Channel;->pinnedMessages:Ljava/util/List;

    move-object/from16 v25, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/Channel;->ownCapabilities:Ljava/util/Set;

    move-object/from16 v26, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/Channel;->membership:Lio/getstream/chat/android/models/Member;

    move-object/from16 v27, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/Channel;->cachedLatestMessages:Ljava/util/List;

    move-object/from16 v28, v15

    iget-boolean v15, v0, Lio/getstream/chat/android/models/Channel;->isInsideSearch:Z

    move/from16 v29, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/Channel;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    move-object/from16 v30, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/Channel;->activeLiveLocations:Ljava/util/List;

    move-object/from16 v31, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/Channel;->messageCount:Ljava/lang/Integer;

    move-object/from16 v32, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/Channel;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    move-object/from16 v33, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/Channel;->filterTags:Ljava/util/List;

    move-object/from16 v34, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/Channel;->lastMessageAt:Ljava/util/Date;

    move-object/from16 v35, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/Channel;->extraData:Ljava/util/Map;

    const-string v0, ", type="

    move-object/from16 v36, v15

    const-string v15, ", name="

    move-object/from16 v37, v13

    const-string v13, "Channel(id="

    invoke-static {v13, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", image="

    const-string v2, ", watcherCount="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", frozen="

    const-string v2, ", createdAt="

    invoke-static {v5, v1, v2, v0, v6}, Lev/n;->t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    const-string v1, ", deletedAt="

    const-string v2, ", updatedAt="

    invoke-static {v0, v7, v1, v8, v2}, Lhc3/i;->n(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", syncStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", memberCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", messages="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", members="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", watchers="

    const-string v2, ", read="

    move-object/from16 v3, v37

    invoke-static {v0, v3, v1, v14, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", config="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", createdBy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", unreadCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", team="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", hidden="

    const-string v2, ", hiddenMessagesBefore="

    move-object/from16 v3, v20

    move-object/from16 v4, v21

    invoke-static {v4, v3, v1, v2, v0}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cooldown="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", pendingMessages="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", pinnedMessages="

    const-string v2, ", ownCapabilities="

    move-object/from16 v3, v24

    move-object/from16 v4, v25

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", membership="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cachedLatestMessages="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isInsideSearch="

    const-string v2, ", draftMessage="

    move-object/from16 v3, v28

    move/from16 v4, v29

    invoke-static {v1, v2, v0, v3, v4}, Lnh3/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", activeLiveLocations="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", messageCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pushPreference="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", filterTags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v34

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastMessageAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", extraData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    move-object/from16 v2, v36

    invoke-static {v0, v2, v1}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
