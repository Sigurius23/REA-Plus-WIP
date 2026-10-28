.class public interface abstract Lcom/whoop/service/network/CommunityApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001Jz\u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0001\u0010\t\u001a\u00020\u00072\n\u0008\u0001\u0010\n\u001a\u0004\u0018\u00010\u00072\n\u0008\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000fH\u00a7@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J \u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u000f2\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J.\u0010\u001c\u001a\u00020\u00102\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJH\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u000f2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u001f\u0010 J]\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001e0\u000f0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010!\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008#\u0010$J]\u0010\'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001e0\u000f0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010%\u001a\u00020\u00072\u0008\u0008\u0001\u0010&\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\'\u0010(J\u0082\u0001\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000e2\n\u0008\u0001\u0010*\u001a\u0004\u0018\u00010)2\n\u0008\u0001\u0010+\u001a\u0004\u0018\u00010)2\n\u0008\u0001\u0010-\u001a\u0004\u0018\u00010,2\n\u0008\u0001\u0010.\u001a\u0004\u0018\u00010,2\u0008\u0008\u0001\u0010%\u001a\u00020,2\u0008\u0008\u0001\u0010/\u001a\u00020,2\u0008\u0008\u0001\u00100\u001a\u00020\u00042\u0008\u0008\u0001\u00101\u001a\u00020\u00042\u0008\u0008\u0001\u00102\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u00083\u00104J4\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000e2\u0008\u0008\u0001\u00105\u001a\u00020)2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u00086\u00107J4\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000e2\u0008\u0008\u0001\u00105\u001a\u00020)2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u00088\u00107J4\u0010:\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000e2\u0008\u0008\u0001\u00109\u001a\u00020\u00102\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008:\u0010;J4\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000e2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010<\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008=\u0010>J4\u0010A\u001a\u0008\u0012\u0004\u0012\u00020@0\u000e2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010?\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008A\u0010>J*\u0010B\u001a\u0008\u0012\u0004\u0012\u00020@0\u000e2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008B\u0010CJ \u0010E\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u000e2\u0008\u0008\u0001\u0010D\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008E\u0010FJ \u0010G\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000e2\u0008\u0008\u0001\u0010D\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008G\u0010FJI\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001e0\u000f0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010%\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008H\u0010IJ&\u0010J\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00170\u000f0\u000e2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008J\u0010\u0019J*\u0010L\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u000e2\u0008\u0008\u0001\u0010K\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008L\u0010CJ*\u0010N\u001a\u0008\u0012\u0004\u0012\u00020@0\u000e2\u0008\u0008\u0001\u0010M\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008N\u0010CJ*\u0010O\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u000e2\u0008\u0008\u0001\u0010K\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008O\u0010CJ/\u0010P\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00170\u000e0\"2\u0008\u0008\u0001\u0010K\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008P\u0010QJ*\u0010R\u001a\u0008\u0012\u0004\u0012\u00020@0\u000e2\u0008\u0008\u0001\u0010M\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008R\u0010CJ4\u0010U\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u000e2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010S\u001a\u00020\u00022\u0008\u0008\u0001\u0010T\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008U\u0010>J*\u0010V\u001a\u0008\u0012\u0004\u0012\u00020@0\u000e2\u0008\u0008\u0001\u0010K\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008V\u0010CJ \u0010X\u001a\u0008\u0012\u0004\u0012\u00020W0\u000e2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008X\u0010\u0019JM\u0010[\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Z0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010Y\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008[\u0010\\JM\u0010]\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Z0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010Y\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008]\u0010\\JM\u0010^\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Z0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010Y\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008^\u0010\\JM\u0010_\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Z0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010Y\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008_\u0010\\JM\u0010`\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Z0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010Y\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008`\u0010\\JM\u0010a\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Z0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010Y\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008a\u0010\\JM\u0010b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Z0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010Y\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008b\u0010\\JM\u0010c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Z0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010Y\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008c\u0010\\J9\u0010e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020d0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010Y\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008e\u0010fJ9\u0010g\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020d0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010Y\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008g\u0010fJ9\u0010h\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020d0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010Y\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008h\u0010fJ9\u0010i\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020d0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010Y\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008i\u0010fJ9\u0010j\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020d0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010Y\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008j\u0010fJ9\u0010k\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020d0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010Y\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008k\u0010fJ9\u0010l\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020d0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010Y\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008l\u0010fJ9\u0010m\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020d0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010Y\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008m\u0010fJu\u0010p\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Z0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u00022\u0008\u0008\u0001\u0010\t\u001a\u00020\u00072\u0008\u0008\u0001\u0010\n\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u00072\u0008\u0008\u0001\u0010n\u001a\u00020\u00042\u0008\u0008\u0001\u0010o\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008p\u0010qJu\u0010r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Z0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u00022\u0008\u0008\u0001\u0010\t\u001a\u00020\u00072\u0008\u0008\u0001\u0010\n\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u00072\u0008\u0008\u0001\u0010n\u001a\u00020\u00042\u0008\u0008\u0001\u0010o\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008r\u0010qJu\u0010s\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Z0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u00022\u0008\u0008\u0001\u0010\t\u001a\u00020\u00072\u0008\u0008\u0001\u0010\n\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u00072\u0008\u0008\u0001\u0010n\u001a\u00020\u00042\u0008\u0008\u0001\u0010o\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008s\u0010qJu\u0010t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Z0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u00022\u0008\u0008\u0001\u0010\t\u001a\u00020\u00072\u0008\u0008\u0001\u0010\n\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u00072\u0008\u0008\u0001\u0010n\u001a\u00020\u00042\u0008\u0008\u0001\u0010o\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008t\u0010qJu\u0010u\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Z0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u00022\u0008\u0008\u0001\u0010\t\u001a\u00020\u00072\u0008\u0008\u0001\u0010\n\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u00072\u0008\u0008\u0001\u0010n\u001a\u00020\u00042\u0008\u0008\u0001\u0010o\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008u\u0010qJu\u0010v\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Z0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u00022\u0008\u0008\u0001\u0010\t\u001a\u00020\u00072\u0008\u0008\u0001\u0010\n\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u00072\u0008\u0008\u0001\u0010n\u001a\u00020\u00042\u0008\u0008\u0001\u0010o\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008v\u0010qJu\u0010w\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Z0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u00022\u0008\u0008\u0001\u0010\t\u001a\u00020\u00072\u0008\u0008\u0001\u0010\n\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u00072\u0008\u0008\u0001\u0010n\u001a\u00020\u00042\u0008\u0008\u0001\u0010o\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008w\u0010qJu\u0010x\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Z0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u00022\u0008\u0008\u0001\u0010\t\u001a\u00020\u00072\u0008\u0008\u0001\u0010\n\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u00072\u0008\u0008\u0001\u0010n\u001a\u00020\u00042\u0008\u0008\u0001\u0010o\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008x\u0010qJa\u0010y\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020d0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0001\u0010\t\u001a\u00020\u00072\u0008\u0008\u0001\u0010\n\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u00072\u0008\u0008\u0001\u0010n\u001a\u00020\u00042\u0008\u0008\u0001\u0010o\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008y\u0010zJa\u0010{\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020d0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0001\u0010\t\u001a\u00020\u00072\u0008\u0008\u0001\u0010\n\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u00072\u0008\u0008\u0001\u0010n\u001a\u00020\u00042\u0008\u0008\u0001\u0010o\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008{\u0010zJa\u0010|\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020d0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0001\u0010\t\u001a\u00020\u00072\u0008\u0008\u0001\u0010\n\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u00072\u0008\u0008\u0001\u0010n\u001a\u00020\u00042\u0008\u0008\u0001\u0010o\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008|\u0010zJa\u0010}\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020d0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0001\u0010\t\u001a\u00020\u00072\u0008\u0008\u0001\u0010\n\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u00072\u0008\u0008\u0001\u0010n\u001a\u00020\u00042\u0008\u0008\u0001\u0010o\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008}\u0010zJa\u0010~\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020d0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0001\u0010\t\u001a\u00020\u00072\u0008\u0008\u0001\u0010\n\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u00072\u0008\u0008\u0001\u0010n\u001a\u00020\u00042\u0008\u0008\u0001\u0010o\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008~\u0010zJa\u0010\u007f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020d0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0001\u0010\t\u001a\u00020\u00072\u0008\u0008\u0001\u0010\n\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u00072\u0008\u0008\u0001\u0010n\u001a\u00020\u00042\u0008\u0008\u0001\u0010o\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\u007f\u0010zJc\u0010\u0080\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020d0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0001\u0010\t\u001a\u00020\u00072\u0008\u0008\u0001\u0010\n\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u00072\u0008\u0008\u0001\u0010n\u001a\u00020\u00042\u0008\u0008\u0001\u0010o\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u0080\u0001\u0010zJc\u0010\u0081\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020d0\u000e0\"2\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0001\u0010\t\u001a\u00020\u00072\u0008\u0008\u0001\u0010\n\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u00072\u0008\u0008\u0001\u0010n\u001a\u00020\u00042\u0008\u0008\u0001\u0010o\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u0081\u0001\u0010zJ\u0013\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u00a7@\u00a2\u0006\u0005\u0008\u0083\u0001\u0010\u0015\u00a8\u0006\u0084\u0001\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/service/network/CommunityApi;",
        "",
        "",
        "userId",
        "",
        "includeOwnerDetails",
        "includeUserRank",
        "",
        "leaderboardType",
        "startDate",
        "endDate",
        "period",
        "offset",
        "limit",
        "Lpg3/v0;",
        "Lcom/whoop/domain/model/RecordsDto;",
        "Lcom/whoop/domain/model/teams/CommunityDto;",
        "getTeamsWithRankForUser",
        "(IZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/domain/model/teams/FeatureCommunityDto;",
        "getFeatureTeamsForUser",
        "(Lq83/d;)Ljava/lang/Object;",
        "forUserId",
        "Lcom/whoop/domain/model/teams/TeamInviteDto;",
        "getInvitesForUser",
        "(ILq83/d;)Ljava/lang/Object;",
        "communityId",
        "teamType",
        "getCommunity",
        "(IILjava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/domain/model/teams/CommunityMemberDto;",
        "getCommunityMembers",
        "(IIIILjava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "ownerFirst",
        "Lxg3/g;",
        "observeCommunityMembers",
        "(IIIIZLjava/lang/String;)Lxg3/g;",
        "name",
        "excludeUser",
        "searchCommunityMembers",
        "(IIIILjava/lang/String;I)Lxg3/g;",
        "Lud3/i0;",
        "banner",
        "avatar",
        "Lud3/v0;",
        "bannerUrl",
        "avatarUrl",
        "description",
        "shareStrain",
        "shareRecovery",
        "shareSleep",
        "createCommunity",
        "(Lud3/i0;Lud3/i0;Lud3/v0;Lud3/v0;Lud3/v0;Lud3/v0;ZZZILq83/d;)Ljava/lang/Object;",
        "file",
        "updateBanner",
        "(Lud3/i0;IILq83/d;)Ljava/lang/Object;",
        "updateLogo",
        "community",
        "updateCommunity",
        "(Lcom/whoop/domain/model/teams/CommunityDto;IILq83/d;)Ljava/lang/Object;",
        "newOwnerId",
        "transferCommunityOwnership",
        "(IIILq83/d;)Ljava/lang/Object;",
        "removeUserId",
        "Ll83/a0;",
        "removeCommunityMember",
        "leaveCommunity",
        "(IILq83/d;)Ljava/lang/Object;",
        "code",
        "joinCommunityUsingCode",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "getCommunityByInviteCode",
        "searchCommunityUsers",
        "(ILjava/lang/String;II)Lxg3/g;",
        "getPendingInvites",
        "inviteId",
        "acceptInvite",
        "recipientId",
        "acceptAllInvites",
        "declineInvite",
        "declineInviteObservable",
        "(II)Lxg3/g;",
        "declineAllInvites",
        "toUserId",
        "fromUserId",
        "createInvite",
        "withdrawInvite",
        "Lcom/whoop/domain/model/teams/TeamShareCodeDto;",
        "getTeamShareCode",
        "date",
        "Lcom/whoop/domain/model/LeadersDto;",
        "getLeadersStrainDaystrain",
        "(ILjava/lang/String;IILjava/lang/String;)Lxg3/g;",
        "getLeadersStrainCalories",
        "getLeadersStrainActivity",
        "getLeadersRecoveryScore",
        "getLeadersRecoveryHRV",
        "getLeadersRecoveryRHR",
        "getLeadersSleepHours",
        "getLeadersSleepPerformance",
        "Lcom/whoop/ui/teams/LeadersEntryDto;",
        "getUserRankStrainDaystrain",
        "(ILjava/lang/String;Ljava/lang/String;)Lxg3/g;",
        "getUserRankStrainCalories",
        "getUserRankStrainActivity",
        "getUserRankRecoveryScore",
        "getUserRankRecoveryHRV",
        "getUserRankRecoveryRHR",
        "getUserRankSleepHours",
        "getUserRankSleepPerformance",
        "includeCompliance",
        "complianceCutoff",
        "getLeadersStrainDaystrainAggregate",
        "(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lxg3/g;",
        "getLeadersStrainCaloriesAggregate",
        "getLeadersStrainActivityAggregate",
        "getLeadersRecoveryScoreAggregate",
        "getLeadersRecoveryHrvAggregate",
        "getLeadersRecoveryRhrAggregate",
        "getLeadersSleepDurationAggregate",
        "getLeadersSleepPerformanceAggregate",
        "getUserRankStrainDaystrainAggregate",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lxg3/g;",
        "getUserRankStrainCaloriesAggregate",
        "getUserRankStrainActivityAggregate",
        "getUserRankRecoveryScoreAggregate",
        "getUserRankRecoveryHrvAggregate",
        "getUserRankRecoveryRhrAggregate",
        "getUserRankSleepPerformanceAggregate",
        "getUserRankSleepHoursAggregate",
        "Lcom/whoop/service/network/model/DefaultImages;",
        "getDefaultImages",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract acceptAllInvites(IILq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "recipientId"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/t;
            value = "forUserId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "community-service/v1/communities/invites/recipient/{recipientId}/acceptAll"
    .end annotation
.end method

.method public abstract acceptInvite(IILq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "inviteId"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/t;
            value = "userId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/teams/TeamInviteDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "community-service/v1/communities/invites/{inviteId}/accept"
    .end annotation
.end method

.method public abstract createCommunity(Lud3/i0;Lud3/i0;Lud3/v0;Lud3/v0;Lud3/v0;Lud3/v0;ZZZILq83/d;)Ljava/lang/Object;
    .param p1    # Lud3/i0;
        .annotation runtime Lwg3/q;
        .end annotation
    .end param
    .param p2    # Lud3/i0;
        .annotation runtime Lwg3/q;
        .end annotation
    .end param
    .param p3    # Lud3/v0;
        .annotation runtime Lwg3/q;
            value = "bannerUrl"
        .end annotation
    .end param
    .param p4    # Lud3/v0;
        .annotation runtime Lwg3/q;
            value = "avatarUrl"
        .end annotation
    .end param
    .param p5    # Lud3/v0;
        .annotation runtime Lwg3/q;
            value = "name"
        .end annotation
    .end param
    .param p6    # Lud3/v0;
        .annotation runtime Lwg3/q;
            value = "about"
        .end annotation
    .end param
    .param p7    # Z
        .annotation runtime Lwg3/q;
            value = "shareStrain"
        .end annotation
    .end param
    .param p8    # Z
        .annotation runtime Lwg3/q;
            value = "shareRecovery"
        .end annotation
    .end param
    .param p9    # Z
        .annotation runtime Lwg3/q;
            value = "shareSleep"
        .end annotation
    .end param
    .param p10    # I
        .annotation runtime Lwg3/t;
            value = "userId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lud3/i0;",
            "Lud3/i0;",
            "Lud3/v0;",
            "Lud3/v0;",
            "Lud3/v0;",
            "Lud3/v0;",
            "ZZZI",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/teams/CommunityDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/l;
    .end annotation

    .annotation runtime Lwg3/o;
        value = "community-service/v1/communities"
    .end annotation
.end method

.method public abstract createInvite(IIILq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/s;
            value = "toUserId"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "userId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/teams/TeamInviteDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "community-service/v1/communities/{communityId}/invites/{toUserId}"
    .end annotation
.end method

.method public abstract declineAllInvites(IILq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "recipientId"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/t;
            value = "forUserId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "community-service/v1/communities/invites/recipient/{recipientId}/declineAll"
    .end annotation
.end method

.method public abstract declineInvite(IILq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "inviteId"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/t;
            value = "userId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/teams/TeamInviteDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "community-service/v1/communities/invites/{inviteId}/decline"
    .end annotation
.end method

.method public abstract declineInviteObservable(II)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "inviteId"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/t;
            value = "userId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/teams/TeamInviteDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "community-service/v1/communities/invites/{inviteId}/decline"
    .end annotation
.end method

.method public abstract getCommunity(IILjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/t;
            value = "userId"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/domain/model/teams/CommunityDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/communities/{communityId}?includeOwnerDetails=false"
    .end annotation
.end method

.method public abstract getCommunityByInviteCode(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "code"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/teams/CommunityDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/communities/inviteCodes/{code}"
    .end annotation
.end method

.method public abstract getCommunityMembers(IIIILjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lwg3/t;
            value = "userId"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIII",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/domain/model/RecordsDto<",
            "Lcom/whoop/domain/model/teams/CommunityMemberDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/communities/{communityId}/members/details"
    .end annotation
.end method

.method public abstract getDefaultImages(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/service/network/model/DefaultImages;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/communities/defaultImages"
    .end annotation
.end method

.method public abstract getFeatureTeamsForUser(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/domain/model/RecordsDto<",
            "Lcom/whoop/domain/model/teams/FeatureCommunityDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/communities/featured?offset=0&limit=10"
    .end annotation
.end method

.method public abstract getInvitesForUser(ILq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/t;
            value = "recipientId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lcom/whoop/domain/model/RecordsDto<",
            "Lcom/whoop/domain/model/teams/TeamInviteDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/communities/invites/pending?includeDetails=true"
    .end annotation
.end method

.method public abstract getLeadersRecoveryHRV(ILjava/lang/String;IILjava/lang/String;)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "date"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/LeadersDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/{date}/recovery/hrv"
    .end annotation
.end method

.method public abstract getLeadersRecoveryHrvAggregate(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "period"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "startDate"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "endDate"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .param p8    # Z
        .annotation runtime Lwg3/t;
            value = "includeCompliance"
        .end annotation
    .end param
    .param p9    # I
        .annotation runtime Lwg3/t;
            value = "complianceCutoff"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZI)",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/LeadersDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/average/{period}/recovery/hrv"
    .end annotation
.end method

.method public abstract getLeadersRecoveryRHR(ILjava/lang/String;IILjava/lang/String;)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "date"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/LeadersDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/{date}/recovery/rhr"
    .end annotation
.end method

.method public abstract getLeadersRecoveryRhrAggregate(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "period"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "startDate"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "endDate"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .param p8    # Z
        .annotation runtime Lwg3/t;
            value = "includeCompliance"
        .end annotation
    .end param
    .param p9    # I
        .annotation runtime Lwg3/t;
            value = "complianceCutoff"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZI)",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/LeadersDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/average/{period}/recovery/rhr"
    .end annotation
.end method

.method public abstract getLeadersRecoveryScore(ILjava/lang/String;IILjava/lang/String;)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "date"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/LeadersDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/{date}/recovery/score"
    .end annotation
.end method

.method public abstract getLeadersRecoveryScoreAggregate(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "period"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "startDate"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "endDate"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .param p8    # Z
        .annotation runtime Lwg3/t;
            value = "includeCompliance"
        .end annotation
    .end param
    .param p9    # I
        .annotation runtime Lwg3/t;
            value = "complianceCutoff"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZI)",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/LeadersDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/average/{period}/recovery/score"
    .end annotation
.end method

.method public abstract getLeadersSleepDurationAggregate(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "period"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "startDate"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "endDate"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .param p8    # Z
        .annotation runtime Lwg3/t;
            value = "includeCompliance"
        .end annotation
    .end param
    .param p9    # I
        .annotation runtime Lwg3/t;
            value = "complianceCutoff"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZI)",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/LeadersDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/average/{period}/sleep/duration"
    .end annotation
.end method

.method public abstract getLeadersSleepHours(ILjava/lang/String;IILjava/lang/String;)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "date"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/LeadersDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/{date}/sleep/duration"
    .end annotation
.end method

.method public abstract getLeadersSleepPerformance(ILjava/lang/String;IILjava/lang/String;)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "date"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/LeadersDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/{date}/sleep/performance"
    .end annotation
.end method

.method public abstract getLeadersSleepPerformanceAggregate(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "period"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "startDate"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "endDate"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .param p8    # Z
        .annotation runtime Lwg3/t;
            value = "includeCompliance"
        .end annotation
    .end param
    .param p9    # I
        .annotation runtime Lwg3/t;
            value = "complianceCutoff"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZI)",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/LeadersDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/average/{period}/sleep/performance"
    .end annotation
.end method

.method public abstract getLeadersStrainActivity(ILjava/lang/String;IILjava/lang/String;)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "date"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/LeadersDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/{date}/strain/activity_strain"
    .end annotation
.end method

.method public abstract getLeadersStrainActivityAggregate(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "period"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "startDate"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "endDate"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .param p8    # Z
        .annotation runtime Lwg3/t;
            value = "includeCompliance"
        .end annotation
    .end param
    .param p9    # I
        .annotation runtime Lwg3/t;
            value = "complianceCutoff"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZI)",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/LeadersDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/average/{period}/strain/activity_strain"
    .end annotation
.end method

.method public abstract getLeadersStrainCalories(ILjava/lang/String;IILjava/lang/String;)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "date"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/LeadersDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/{date}/strain/calories"
    .end annotation
.end method

.method public abstract getLeadersStrainCaloriesAggregate(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "period"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "startDate"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "endDate"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .param p8    # Z
        .annotation runtime Lwg3/t;
            value = "includeCompliance"
        .end annotation
    .end param
    .param p9    # I
        .annotation runtime Lwg3/t;
            value = "complianceCutoff"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZI)",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/LeadersDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/average/{period}/strain/calories"
    .end annotation
.end method

.method public abstract getLeadersStrainDaystrain(ILjava/lang/String;IILjava/lang/String;)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "date"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/LeadersDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/{date}/strain/day_strain"
    .end annotation
.end method

.method public abstract getLeadersStrainDaystrainAggregate(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "period"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "startDate"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "endDate"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .param p8    # Z
        .annotation runtime Lwg3/t;
            value = "includeCompliance"
        .end annotation
    .end param
    .param p9    # I
        .annotation runtime Lwg3/t;
            value = "complianceCutoff"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZI)",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/LeadersDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/average/{period}/strain/day_strain"
    .end annotation
.end method

.method public abstract getPendingInvites(ILq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/t;
            value = "communityId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/RecordsDto<",
            "Lcom/whoop/domain/model/teams/TeamInviteDto;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/communities/invites/pending"
    .end annotation
.end method

.method public abstract getTeamShareCode(ILq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/teams/TeamShareCodeDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/communities/{communityId}/code"
    .end annotation
.end method

.method public abstract getTeamsWithRankForUser(IZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/t;
            value = "userId"
        .end annotation
    .end param
    .param p2    # Z
        .annotation runtime Lwg3/t;
            value = "includeOwnerDetails"
        .end annotation
    .end param
    .param p3    # Z
        .annotation runtime Lwg3/t;
            value = "includeUserRank"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "leaderboardType"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "startDate"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "endDate"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "period"
        .end annotation
    .end param
    .param p8    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p9    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/RecordsDto<",
            "Lcom/whoop/domain/model/teams/CommunityDto;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/communities/memberships?teamType=ALL"
    .end annotation
.end method

.method public abstract getUserRankRecoveryHRV(ILjava/lang/String;Ljava/lang/String;)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "date"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/ui/teams/LeadersEntryDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/{date}/recovery/hrv/user/{userId}"
    .end annotation
.end method

.method public abstract getUserRankRecoveryHrvAggregate(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "period"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "startDate"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "endDate"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .param p6    # Z
        .annotation runtime Lwg3/t;
            value = "includeCompliance"
        .end annotation
    .end param
    .param p7    # I
        .annotation runtime Lwg3/t;
            value = "complianceCutoff"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZI)",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/ui/teams/LeadersEntryDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/average/{period}/recovery/hrv/user/{userId}"
    .end annotation
.end method

.method public abstract getUserRankRecoveryRHR(ILjava/lang/String;Ljava/lang/String;)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "date"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/ui/teams/LeadersEntryDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/{date}/recovery/rhr/user/{userId}"
    .end annotation
.end method

.method public abstract getUserRankRecoveryRhrAggregate(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "period"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "startDate"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "endDate"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .param p6    # Z
        .annotation runtime Lwg3/t;
            value = "includeCompliance"
        .end annotation
    .end param
    .param p7    # I
        .annotation runtime Lwg3/t;
            value = "complianceCutoff"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZI)",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/ui/teams/LeadersEntryDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/average/{period}/recovery/rhr/user/{userId}"
    .end annotation
.end method

.method public abstract getUserRankRecoveryScore(ILjava/lang/String;Ljava/lang/String;)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "date"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/ui/teams/LeadersEntryDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/{date}/recovery/score/user/{userId}"
    .end annotation
.end method

.method public abstract getUserRankRecoveryScoreAggregate(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "period"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "startDate"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "endDate"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .param p6    # Z
        .annotation runtime Lwg3/t;
            value = "includeCompliance"
        .end annotation
    .end param
    .param p7    # I
        .annotation runtime Lwg3/t;
            value = "complianceCutoff"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZI)",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/ui/teams/LeadersEntryDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/average/{period}/recovery/score/user/{userId}"
    .end annotation
.end method

.method public abstract getUserRankSleepHours(ILjava/lang/String;Ljava/lang/String;)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "date"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/ui/teams/LeadersEntryDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/{date}/sleep/duration/user/{userId}"
    .end annotation
.end method

.method public abstract getUserRankSleepHoursAggregate(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "period"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "startDate"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "endDate"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .param p6    # Z
        .annotation runtime Lwg3/t;
            value = "includeCompliance"
        .end annotation
    .end param
    .param p7    # I
        .annotation runtime Lwg3/t;
            value = "complianceCutoff"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZI)",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/ui/teams/LeadersEntryDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/average/{period}/sleep/duration/user/{userId}"
    .end annotation
.end method

.method public abstract getUserRankSleepPerformance(ILjava/lang/String;Ljava/lang/String;)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "date"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/ui/teams/LeadersEntryDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/{date}/sleep/performance/user/{userId}"
    .end annotation
.end method

.method public abstract getUserRankSleepPerformanceAggregate(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "period"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "startDate"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "endDate"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .param p6    # Z
        .annotation runtime Lwg3/t;
            value = "includeCompliance"
        .end annotation
    .end param
    .param p7    # I
        .annotation runtime Lwg3/t;
            value = "complianceCutoff"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZI)",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/ui/teams/LeadersEntryDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/average/{period}/sleep/performance/user/{userId}"
    .end annotation
.end method

.method public abstract getUserRankStrainActivity(ILjava/lang/String;Ljava/lang/String;)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "date"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/ui/teams/LeadersEntryDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/{date}/strain/workouts/user/{userId}"
    .end annotation
.end method

.method public abstract getUserRankStrainActivityAggregate(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "period"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "startDate"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "endDate"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .param p6    # Z
        .annotation runtime Lwg3/t;
            value = "includeCompliance"
        .end annotation
    .end param
    .param p7    # I
        .annotation runtime Lwg3/t;
            value = "complianceCutoff"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZI)",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/ui/teams/LeadersEntryDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/average/{period}/strain/activity_strain/user/{userId}"
    .end annotation
.end method

.method public abstract getUserRankStrainCalories(ILjava/lang/String;Ljava/lang/String;)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "date"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/ui/teams/LeadersEntryDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/{date}/strain/calories/user/{userId}"
    .end annotation
.end method

.method public abstract getUserRankStrainCaloriesAggregate(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "period"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "startDate"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "endDate"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .param p6    # Z
        .annotation runtime Lwg3/t;
            value = "includeCompliance"
        .end annotation
    .end param
    .param p7    # I
        .annotation runtime Lwg3/t;
            value = "complianceCutoff"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZI)",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/ui/teams/LeadersEntryDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/average/{period}/strain/calories/user/{userId}"
    .end annotation
.end method

.method public abstract getUserRankStrainDaystrain(ILjava/lang/String;Ljava/lang/String;)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "date"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/ui/teams/LeadersEntryDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/{date}/strain/day_strain/user/{userId}"
    .end annotation
.end method

.method public abstract getUserRankStrainDaystrainAggregate(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "period"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "startDate"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "endDate"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .param p6    # Z
        .annotation runtime Lwg3/t;
            value = "includeCompliance"
        .end annotation
    .end param
    .param p7    # I
        .annotation runtime Lwg3/t;
            value = "complianceCutoff"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZI)",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/ui/teams/LeadersEntryDto;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/leaderboards/communities/{communityId}/average/{period}/strain/day_strain/user/{userId}"
    .end annotation
.end method

.method public abstract joinCommunityUsingCode(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "code"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/teams/CommunityMemberDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "community-service/v1/communities/join/{code}"
    .end annotation
.end method

.method public abstract leaveCommunity(IILq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/t;
            value = "userId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "community-service/v1/communities/{communityId}/leave"
    .end annotation
.end method

.method public abstract observeCommunityMembers(IIIIZLjava/lang/String;)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lwg3/t;
            value = "userId"
        .end annotation
    .end param
    .param p5    # Z
        .annotation runtime Lwg3/t;
            value = "ownerFirst"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "teamType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIIZ",
            "Ljava/lang/String;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/RecordsDto<",
            "Lcom/whoop/domain/model/teams/CommunityMemberDto;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/communities/{communityId}/members/details"
    .end annotation
.end method

.method public abstract removeCommunityMember(IIILq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/s;
            value = "removeId"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "userId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "community-service/v1/communities/{communityId}/members/{removeId}"
    .end annotation
.end method

.method public abstract searchCommunityMembers(IIIILjava/lang/String;I)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lwg3/t;
            value = "userId"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "name"
        .end annotation
    .end param
    .param p6    # I
        .annotation runtime Lwg3/t;
            value = "excludeUser"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIII",
            "Ljava/lang/String;",
            "I)",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/RecordsDto<",
            "Lcom/whoop/domain/model/teams/CommunityMemberDto;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/communities/{communityId}/members/details"
    .end annotation
.end method

.method public abstract searchCommunityUsers(ILjava/lang/String;II)Lxg3/g;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "name"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "II)",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/RecordsDto<",
            "Lcom/whoop/domain/model/teams/CommunityMemberDto;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/communities/{communityId}/users"
    .end annotation
.end method

.method public abstract transferCommunityOwnership(IIILq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/s;
            value = "ownerId"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "userId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/teams/CommunityDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "community-service/v1/communities/{communityId}/owner/{ownerId}"
    .end annotation
.end method

.method public abstract updateBanner(Lud3/i0;IILq83/d;)Ljava/lang/Object;
    .param p1    # Lud3/i0;
        .annotation runtime Lwg3/q;
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "userId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lud3/i0;",
            "II",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/teams/CommunityDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/l;
    .end annotation

    .annotation runtime Lwg3/o;
        value = "community-service/v1/communities/{communityId}/banner"
    .end annotation
.end method

.method public abstract updateCommunity(Lcom/whoop/domain/model/teams/CommunityDto;IILq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/domain/model/teams/CommunityDto;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "userId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/domain/model/teams/CommunityDto;",
            "II",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/teams/CommunityDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "community-service/v1/communities/{communityId}"
    .end annotation
.end method

.method public abstract updateLogo(Lud3/i0;IILq83/d;)Ljava/lang/Object;
    .param p1    # Lud3/i0;
        .annotation runtime Lwg3/q;
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "userId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lud3/i0;",
            "II",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/teams/CommunityDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/l;
    .end annotation

    .annotation runtime Lwg3/o;
        value = "community-service/v1/communities/{communityId}/avatar"
    .end annotation
.end method

.method public abstract withdrawInvite(IILq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "inviteId"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/t;
            value = "userId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "community-service/v1/communities/invites/{inviteId}"
    .end annotation
.end method
