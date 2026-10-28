.class public final Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse$$serializer;,
        Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008+\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u00087\u0008\u0087\u0008\u0018\u0000 \u0095\u00012\u00020\u0001:\u0004\u0096\u0001\u0095\u0001B\u00bb\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u000e\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010!\u001a\u0004\u0018\u00010 \u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000e\u0012\u0008\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010&\u001a\u0004\u0018\u00010%\u0012\u0008\u0010(\u001a\u0004\u0018\u00010\'\u00a2\u0006\u0004\u0008)\u0010*B\u00d7\u0002\u0008\u0010\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000e\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010!\u001a\u0004\u0018\u00010 \u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000e\u0012\u0008\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010&\u001a\u0004\u0018\u00010%\u0012\u0008\u0010(\u001a\u0004\u0018\u00010\'\u0012\u0008\u0010-\u001a\u0004\u0018\u00010,\u00a2\u0006\u0004\u0008)\u0010.J\u0010\u0010/\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00101\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00081\u00102J\u0010\u00103\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00083\u00102J\u0012\u00104\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00084\u00102J\u0012\u00105\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00102J\u0012\u00106\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00086\u00102J\u0012\u00107\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00087\u00102J\u0012\u00108\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00088\u00102J\u0012\u00109\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00089\u00102J\u0012\u0010:\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008:\u00102J\u0016\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008=\u00102J\u0012\u0010>\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008>\u00102J\u0012\u0010?\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008?\u00102J\u0012\u0010@\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008@\u00102J\u0012\u0010A\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008A\u00102J\u0012\u0010B\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008B\u00102J\u0016\u0010C\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008C\u0010<J\u0012\u0010D\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008D\u00102J\u0012\u0010E\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008E\u00102J\u0012\u0010F\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008F\u00102J\u0012\u0010G\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008G\u00102J\u0012\u0010H\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008H\u00102J\u0012\u0010I\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008I\u00102J\u0012\u0010J\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008J\u00102J\u0012\u0010K\u001a\u0004\u0018\u00010 H\u00c6\u0003\u00a2\u0006\u0004\u0008K\u0010LJ\u0018\u0010M\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008M\u0010<J\u0012\u0010N\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008N\u00102J\u0012\u0010O\u001a\u0004\u0018\u00010%H\u00c6\u0003\u00a2\u0006\u0004\u0008O\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010\'H\u00c6\u0003\u00a2\u0006\u0004\u0008Q\u0010RJ\u0080\u0003\u0010S\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u000e\u0008\u0002\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u000e2\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010 2\u0010\u0008\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000e2\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\'H\u00c6\u0001\u00a2\u0006\u0004\u0008S\u0010TJ\u0010\u0010U\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008U\u00102J\u0010\u0010V\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008V\u00100J\u001a\u0010Y\u001a\u00020X2\u0008\u0010W\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008Y\u0010ZJ\'\u0010c\u001a\u00020`2\u0006\u0010[\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\\2\u0006\u0010_\u001a\u00020^H\u0001\u00a2\u0006\u0004\u0008a\u0010bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010d\u001a\u0004\u0008e\u00100R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010f\u0012\u0004\u0008h\u0010i\u001a\u0004\u0008g\u00102R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010f\u0012\u0004\u0008k\u0010i\u001a\u0004\u0008j\u00102R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010f\u0012\u0004\u0008m\u0010i\u001a\u0004\u0008l\u00102R\"\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010f\u0012\u0004\u0008o\u0010i\u001a\u0004\u0008n\u00102R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010f\u001a\u0004\u0008p\u00102R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010f\u001a\u0004\u0008q\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010f\u001a\u0004\u0008r\u00102R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010f\u001a\u0004\u0008s\u00102R\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010f\u0012\u0004\u0008u\u0010i\u001a\u0004\u0008t\u00102R\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010v\u001a\u0004\u0008w\u0010<R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010f\u0012\u0004\u0008y\u0010i\u001a\u0004\u0008x\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010f\u001a\u0004\u0008z\u00102R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010f\u001a\u0004\u0008{\u00102R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010f\u0012\u0004\u0008}\u0010i\u001a\u0004\u0008|\u00102R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010f\u001a\u0004\u0008~\u00102R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010f\u001a\u0004\u0008\u007f\u00102R(\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008\u0018\u0010v\u0012\u0005\u0008\u0081\u0001\u0010i\u001a\u0005\u0008\u0080\u0001\u0010<R$\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008\u0019\u0010f\u0012\u0005\u0008\u0083\u0001\u0010i\u001a\u0005\u0008\u0082\u0001\u00102R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\r\n\u0004\u0008\u001a\u0010f\u001a\u0005\u0008\u0084\u0001\u00102R$\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008\u001b\u0010f\u0012\u0005\u0008\u0086\u0001\u0010i\u001a\u0005\u0008\u0085\u0001\u00102R$\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008\u001c\u0010f\u0012\u0005\u0008\u0088\u0001\u0010i\u001a\u0005\u0008\u0087\u0001\u00102R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\r\n\u0004\u0008\u001d\u0010f\u001a\u0005\u0008\u0089\u0001\u00102R$\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008\u001e\u0010f\u0012\u0005\u0008\u008b\u0001\u0010i\u001a\u0005\u0008\u008a\u0001\u00102R\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\r\n\u0004\u0008\u001f\u0010f\u001a\u0005\u0008\u008c\u0001\u00102R\u001b\u0010!\u001a\u0004\u0018\u00010 8\u0006\u00a2\u0006\u000e\n\u0005\u0008!\u0010\u008d\u0001\u001a\u0005\u0008\u008e\u0001\u0010LR \u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000e8\u0006\u00a2\u0006\r\n\u0004\u0008#\u0010v\u001a\u0005\u0008\u008f\u0001\u0010<R\u001a\u0010$\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\r\n\u0004\u0008$\u0010f\u001a\u0005\u0008\u0090\u0001\u00102R\u001b\u0010&\u001a\u0004\u0018\u00010%8\u0006\u00a2\u0006\u000e\n\u0005\u0008&\u0010\u0091\u0001\u001a\u0005\u0008\u0092\u0001\u0010PR\u001b\u0010(\u001a\u0004\u0018\u00010\'8\u0006\u00a2\u0006\u000e\n\u0005\u0008(\u0010\u0093\u0001\u001a\u0005\u0008\u0094\u0001\u0010R\u00a8\u0006\u0097\u0001"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;",
        "",
        "",
        "campaignId",
        "",
        "toolbarTitle",
        "title",
        "headerSubtitle",
        "headerIcon",
        "badge",
        "badgeText",
        "badgeType",
        "badgeTextSubtitle",
        "headerImage",
        "",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ContentBlockResponse;",
        "contentBlocks",
        "scheduleText",
        "scheduleCta",
        "statusBadgeType",
        "statusBadgeIcon",
        "statusTitle",
        "statusBody",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/TaskResponse;",
        "nextTasks",
        "description",
        "descriptionCta",
        "subDescription",
        "alertTitle",
        "alertDisplay",
        "fullDescription",
        "cta",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;",
        "optionsConfig",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;",
        "documents",
        "documentDisplay",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;",
        "connectedDeviceDisplay",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "dataSubmittedCallout",
        "<init>",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Ljava/util/List;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;Lcom/whoop/design/models/InfoCalloutTileModel;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Ljava/util/List;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;Lcom/whoop/design/models/InfoCalloutTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()I",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "()Ljava/util/List;",
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
        "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;",
        "component27",
        "component28",
        "component29",
        "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;",
        "component30",
        "()Lcom/whoop/design/models/InfoCalloutTileModel;",
        "copy",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Ljava/util/List;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$whooplabs_release",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "I",
        "getCampaignId",
        "Ljava/lang/String;",
        "getToolbarTitle",
        "getToolbarTitle$annotations",
        "()V",
        "getTitle",
        "getTitle$annotations",
        "getHeaderSubtitle",
        "getHeaderSubtitle$annotations",
        "getHeaderIcon",
        "getHeaderIcon$annotations",
        "getBadge",
        "getBadgeText",
        "getBadgeType",
        "getBadgeTextSubtitle",
        "getHeaderImage",
        "getHeaderImage$annotations",
        "Ljava/util/List;",
        "getContentBlocks",
        "getScheduleText",
        "getScheduleText$annotations",
        "getScheduleCta",
        "getStatusBadgeType",
        "getStatusBadgeIcon",
        "getStatusBadgeIcon$annotations",
        "getStatusTitle",
        "getStatusBody",
        "getNextTasks",
        "getNextTasks$annotations",
        "getDescription",
        "getDescription$annotations",
        "getDescriptionCta",
        "getSubDescription",
        "getSubDescription$annotations",
        "getAlertTitle",
        "getAlertTitle$annotations",
        "getAlertDisplay",
        "getFullDescription",
        "getFullDescription$annotations",
        "getCta",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;",
        "getOptionsConfig",
        "getDocuments",
        "getDocumentDisplay",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;",
        "getConnectedDeviceDisplay",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "getDataSubmittedCallout",
        "Companion",
        "$serializer",
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

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse$Companion;


# instance fields
.field private final alertDisplay:Ljava/lang/String;

.field private final alertTitle:Ljava/lang/String;

.field private final badge:Ljava/lang/String;

.field private final badgeText:Ljava/lang/String;

.field private final badgeTextSubtitle:Ljava/lang/String;

.field private final badgeType:Ljava/lang/String;

.field private final campaignId:I

.field private final connectedDeviceDisplay:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;

.field private final contentBlocks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ContentBlockResponse;",
            ">;"
        }
    .end annotation
.end field

.field private final cta:Ljava/lang/String;

.field private final dataSubmittedCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

.field private final description:Ljava/lang/String;

.field private final descriptionCta:Ljava/lang/String;

.field private final documentDisplay:Ljava/lang/String;

.field private final documents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;",
            ">;"
        }
    .end annotation
.end field

.field private final fullDescription:Ljava/lang/String;

.field private final headerIcon:Ljava/lang/String;

.field private final headerImage:Ljava/lang/String;

.field private final headerSubtitle:Ljava/lang/String;

.field private final nextTasks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/TaskResponse;",
            ">;"
        }
    .end annotation
.end field

.field private final optionsConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;

.field private final scheduleCta:Ljava/lang/String;

.field private final scheduleText:Ljava/lang/String;

.field private final statusBadgeIcon:Ljava/lang/String;

.field private final statusBadgeType:Ljava/lang/String;

.field private final statusBody:Ljava/lang/String;

.field private final statusTitle:Ljava/lang/String;

.field private final subDescription:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final toolbarTitle:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Ldq2/a;

    const/16 v4, 0xf

    invoke-direct {v3, v4}, Ldq2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Ldq2/a;

    const/16 v6, 0x10

    invoke-direct {v5, v6}, Ldq2/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Ldq2/a;

    const/16 v8, 0x11

    invoke-direct {v7, v8}, Ldq2/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v7, 0x1e

    new-array v7, v7, [Ll83/h;

    const/4 v9, 0x0

    aput-object v1, v7, v9

    const/4 v9, 0x1

    aput-object v1, v7, v9

    const/4 v9, 0x2

    aput-object v1, v7, v9

    const/4 v9, 0x3

    aput-object v1, v7, v9

    const/4 v9, 0x4

    aput-object v1, v7, v9

    const/4 v9, 0x5

    aput-object v1, v7, v9

    const/4 v9, 0x6

    aput-object v1, v7, v9

    const/4 v9, 0x7

    aput-object v1, v7, v9

    aput-object v1, v7, v0

    const/16 v0, 0x9

    aput-object v1, v7, v0

    const/16 v0, 0xa

    aput-object v3, v7, v0

    const/16 v0, 0xb

    aput-object v1, v7, v0

    const/16 v0, 0xc

    aput-object v1, v7, v0

    const/16 v0, 0xd

    aput-object v1, v7, v0

    const/16 v0, 0xe

    aput-object v1, v7, v0

    aput-object v1, v7, v4

    aput-object v1, v7, v6

    aput-object v5, v7, v8

    const/16 v0, 0x12

    aput-object v1, v7, v0

    const/16 v0, 0x13

    aput-object v1, v7, v0

    const/16 v0, 0x14

    aput-object v1, v7, v0

    const/16 v0, 0x15

    aput-object v1, v7, v0

    const/16 v0, 0x16

    aput-object v1, v7, v0

    const/16 v0, 0x17

    aput-object v1, v7, v0

    const/16 v0, 0x18

    aput-object v1, v7, v0

    const/16 v0, 0x19

    aput-object v1, v7, v0

    const/16 v0, 0x1a

    aput-object v2, v7, v0

    const/16 v0, 0x1b

    aput-object v1, v7, v0

    const/16 v0, 0x1c

    aput-object v1, v7, v0

    const/16 v0, 0x1d

    aput-object v1, v7, v0

    sput-object v7, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Ljava/util/List;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;Lcom/whoop/design/models/InfoCalloutTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0x3fffffff    # 1.9999999f

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse$$serializer;

    invoke-virtual {v1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->campaignId:I

    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->toolbarTitle:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->title:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerSubtitle:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerIcon:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badge:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeText:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeType:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeTextSubtitle:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerImage:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->contentBlocks:Ljava/util/List;

    iput-object p13, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->scheduleText:Ljava/lang/String;

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->scheduleCta:Ljava/lang/String;

    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBadgeType:Ljava/lang/String;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBadgeIcon:Ljava/lang/String;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusTitle:Ljava/lang/String;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBody:Ljava/lang/String;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->nextTasks:Ljava/util/List;

    move-object/from16 p1, p20

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->description:Ljava/lang/String;

    move-object/from16 p1, p21

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->descriptionCta:Ljava/lang/String;

    move-object/from16 p1, p22

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->subDescription:Ljava/lang/String;

    move-object/from16 p1, p23

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->alertTitle:Ljava/lang/String;

    move-object/from16 p1, p24

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->alertDisplay:Ljava/lang/String;

    move-object/from16 p1, p25

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->fullDescription:Ljava/lang/String;

    move-object/from16 p1, p26

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->cta:Ljava/lang/String;

    move-object/from16 p1, p27

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->optionsConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;

    move-object/from16 p1, p28

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->documents:Ljava/util/List;

    move-object/from16 p1, p29

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->documentDisplay:Ljava/lang/String;

    move-object/from16 p1, p30

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->connectedDeviceDisplay:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;

    move-object/from16 p1, p31

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->dataSubmittedCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Ljava/util/List;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;Lcom/whoop/design/models/InfoCalloutTileModel;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ContentBlockResponse;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/TaskResponse;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;",
            "Lcom/whoop/design/models/InfoCalloutTileModel;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p18

    const-string v1, "toolbarTitle"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "title"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "contentBlocks"

    invoke-static {p11, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "nextTasks"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->campaignId:I

    .line 4
    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->toolbarTitle:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->title:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerSubtitle:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerIcon:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badge:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeText:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeType:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeTextSubtitle:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerImage:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->contentBlocks:Ljava/util/List;

    .line 14
    iput-object p12, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->scheduleText:Ljava/lang/String;

    .line 15
    iput-object p13, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->scheduleCta:Ljava/lang/String;

    move-object/from16 p1, p14

    .line 16
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBadgeType:Ljava/lang/String;

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBadgeIcon:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusTitle:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBody:Ljava/lang/String;

    .line 20
    iput-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->nextTasks:Ljava/util/List;

    move-object/from16 p1, p19

    .line 21
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->description:Ljava/lang/String;

    move-object/from16 p1, p20

    .line 22
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->descriptionCta:Ljava/lang/String;

    move-object/from16 p1, p21

    .line 23
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->subDescription:Ljava/lang/String;

    move-object/from16 p1, p22

    .line 24
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->alertTitle:Ljava/lang/String;

    move-object/from16 p1, p23

    .line 25
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->alertDisplay:Ljava/lang/String;

    move-object/from16 p1, p24

    .line 26
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->fullDescription:Ljava/lang/String;

    move-object/from16 p1, p25

    .line 27
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->cta:Ljava/lang/String;

    move-object/from16 p1, p26

    .line 28
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->optionsConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;

    move-object/from16 p1, p27

    .line 29
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->documents:Ljava/util/List;

    move-object/from16 p1, p28

    .line 30
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->documentDisplay:Ljava/lang/String;

    move-object/from16 p1, p29

    .line 31
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->connectedDeviceDisplay:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;

    move-object/from16 p1, p30

    .line 32
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->dataSubmittedCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ContentBlockResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ContentBlockResponse$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/TaskResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/TaskResponse$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Ljava/util/List;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;Lcom/whoop/design/models/InfoCalloutTileModel;ILjava/lang/Object;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p31

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->campaignId:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->toolbarTitle:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->title:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerSubtitle:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerIcon:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badge:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeText:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeType:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeTextSubtitle:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerImage:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->contentBlocks:Ljava/util/List;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->scheduleText:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->scheduleCta:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBadgeType:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBadgeIcon:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusTitle:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p31, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBody:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p31, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->nextTasks:Ljava/util/List;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p31, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->description:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p31, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->descriptionCta:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p31, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->subDescription:Ljava/lang/String;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p31, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->alertTitle:Ljava/lang/String;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p31, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_16

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->alertDisplay:Ljava/lang/String;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p31, v16

    move-object/from16 p9, v1

    if-eqz v16, :cond_17

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->fullDescription:Ljava/lang/String;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p31, v16

    move-object/from16 p10, v1

    if-eqz v16, :cond_18

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->cta:Ljava/lang/String;

    goto :goto_18

    :cond_18
    move-object/from16 v1, p25

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p31, v16

    move-object/from16 p11, v1

    if-eqz v16, :cond_19

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->optionsConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;

    goto :goto_19

    :cond_19
    move-object/from16 v1, p26

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, p31, v16

    move-object/from16 p12, v1

    if-eqz v16, :cond_1a

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->documents:Ljava/util/List;

    goto :goto_1a

    :cond_1a
    move-object/from16 v1, p27

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v16, p31, v16

    move-object/from16 p13, v1

    if-eqz v16, :cond_1b

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->documentDisplay:Ljava/lang/String;

    goto :goto_1b

    :cond_1b
    move-object/from16 v1, p28

    :goto_1b
    const/high16 v16, 0x10000000

    and-int v16, p31, v16

    move-object/from16 p14, v1

    if-eqz v16, :cond_1c

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->connectedDeviceDisplay:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;

    goto :goto_1c

    :cond_1c
    move-object/from16 v1, p29

    :goto_1c
    const/high16 v16, 0x20000000

    and-int v16, p31, v16

    if-eqz v16, :cond_1d

    move-object/from16 p15, v1

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->dataSubmittedCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    move-object/from16 p30, p15

    move-object/from16 p31, v1

    :goto_1d
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p22, p7

    move-object/from16 p23, p8

    move-object/from16 p24, p9

    move-object/from16 p25, p10

    move-object/from16 p26, p11

    move-object/from16 p27, p12

    move-object/from16 p28, p13

    move-object/from16 p29, p14

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_1e

    :cond_1d
    move-object/from16 p31, p30

    move-object/from16 p30, v1

    goto :goto_1d

    :goto_1e
    invoke-virtual/range {p1 .. p31}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Ljava/util/List;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getAlertTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "alert_title_display"
    .end annotation

    return-void
.end method

.method public static synthetic getDescription$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "description_display"
    .end annotation

    return-void
.end method

.method public static synthetic getFullDescription$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "full_description_display"
    .end annotation

    return-void
.end method

.method public static synthetic getHeaderIcon$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "icon"
    .end annotation

    return-void
.end method

.method public static synthetic getHeaderImage$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "background_image"
    .end annotation

    return-void
.end method

.method public static synthetic getHeaderSubtitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "subtitle_display"
    .end annotation

    return-void
.end method

.method public static synthetic getNextTasks$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "tasks"
    .end annotation

    return-void
.end method

.method public static synthetic getScheduleText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "schedule_title_display"
    .end annotation

    return-void
.end method

.method public static synthetic getStatusBadgeIcon$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "status_badge"
    .end annotation

    return-void
.end method

.method public static synthetic getSubDescription$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "sub_description_display"
    .end annotation

    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "title_display"
    .end annotation

    return-void
.end method

.method public static synthetic getToolbarTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "page_title_display"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$whooplabs_release(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->campaignId:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->toolbarTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerSubtitle:Ljava/lang/String;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badge:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeText:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeType:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeTextSubtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerImage:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xa

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->contentBlocks:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xb

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->scheduleText:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xc

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->scheduleCta:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xd

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBadgeType:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xe

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBadgeIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xf

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x10

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBody:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x11

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->nextTasks:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x12

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->description:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x13

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->descriptionCta:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x14

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->subDescription:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x15

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->alertTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x16

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->alertDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x17

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->fullDescription:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x18

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->cta:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse$$serializer;

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->optionsConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;

    const/16 v4, 0x19

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x1a

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->documents:Ljava/util/List;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x1b

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->documentDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay$$serializer;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->connectedDeviceDisplay:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;

    const/16 v2, 0x1c

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;

    iget-object p0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->dataSubmittedCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    const/16 v1, 0x1d

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->campaignId:I

    return v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerImage:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ContentBlockResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->contentBlocks:Ljava/util/List;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->scheduleText:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->scheduleCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBadgeType:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBadgeIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBody:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/TaskResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->nextTasks:Ljava/util/List;

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->toolbarTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->descriptionCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component21()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->subDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final component22()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->alertTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component23()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->alertDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component24()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->fullDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final component25()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public final component26()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->optionsConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;

    return-object v0
.end method

.method public final component27()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->documents:Ljava/util/List;

    return-object v0
.end method

.method public final component28()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->documentDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component29()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->connectedDeviceDisplay:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component30()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->dataSubmittedCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badge:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeText:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeType:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeTextSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Ljava/util/List;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ContentBlockResponse;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/TaskResponse;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;",
            "Lcom/whoop/design/models/InfoCalloutTileModel;",
            ")",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;"
        }
    .end annotation

    const-string v0, "toolbarTitle"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentBlocks"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextTasks"

    move-object/from16 v1, p18

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;

    move/from16 v2, p1

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    move-object/from16 v25, p24

    move-object/from16 v26, p25

    move-object/from16 v27, p26

    move-object/from16 v28, p27

    move-object/from16 v29, p28

    move-object/from16 v30, p29

    move-object/from16 v31, p30

    invoke-direct/range {v1 .. v31}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Ljava/util/List;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;Lcom/whoop/design/models/InfoCalloutTileModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;

    iget v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->campaignId:I

    iget v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->campaignId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->toolbarTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->toolbarTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerSubtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerSubtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badge:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badge:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeTextSubtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeTextSubtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerImage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerImage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->contentBlocks:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->contentBlocks:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->scheduleText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->scheduleText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->scheduleCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->scheduleCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBadgeType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBadgeType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBadgeIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBadgeIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBody:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBody:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->nextTasks:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->nextTasks:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->descriptionCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->descriptionCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->subDescription:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->subDescription:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->alertTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->alertTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->alertDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->alertDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->fullDescription:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->fullDescription:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->cta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->cta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->optionsConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->optionsConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->documents:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->documents:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->documentDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->documentDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->connectedDeviceDisplay:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->connectedDeviceDisplay:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->dataSubmittedCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    iget-object p1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->dataSubmittedCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1f

    return v2

    :cond_1f
    return v0
.end method

.method public final getAlertDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->alertDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getAlertTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->alertTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getBadge()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badge:Ljava/lang/String;

    return-object v0
.end method

.method public final getBadgeText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeText:Ljava/lang/String;

    return-object v0
.end method

.method public final getBadgeTextSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeTextSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getBadgeType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeType:Ljava/lang/String;

    return-object v0
.end method

.method public final getCampaignId()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->campaignId:I

    return v0
.end method

.method public final getConnectedDeviceDisplay()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->connectedDeviceDisplay:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;

    return-object v0
.end method

.method public final getContentBlocks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ContentBlockResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->contentBlocks:Ljava/util/List;

    return-object v0
.end method

.method public final getCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public final getDataSubmittedCallout()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->dataSubmittedCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescriptionCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->descriptionCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getDocumentDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->documentDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getDocuments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->documents:Ljava/util/List;

    return-object v0
.end method

.method public final getFullDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->fullDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeaderIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeaderImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerImage:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeaderSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getNextTasks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/TaskResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->nextTasks:Ljava/util/List;

    return-object v0
.end method

.method public final getOptionsConfig()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->optionsConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;

    return-object v0
.end method

.method public final getScheduleCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->scheduleCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getScheduleText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->scheduleText:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatusBadgeIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBadgeIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatusBadgeType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBadgeType:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatusBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBody:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatusTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->subDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getToolbarTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->toolbarTitle:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->campaignId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->toolbarTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerSubtitle:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerIcon:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badge:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeText:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeType:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeTextSubtitle:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerImage:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->contentBlocks:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->scheduleText:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->scheduleCta:Ljava/lang/String;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBadgeType:Ljava/lang/String;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBadgeIcon:Ljava/lang/String;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusTitle:Ljava/lang/String;

    if-nez v2, :cond_b

    move v2, v3

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBody:Ljava/lang/String;

    if-nez v2, :cond_c

    move v2, v3

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->nextTasks:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->description:Ljava/lang/String;

    if-nez v2, :cond_d

    move v2, v3

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->descriptionCta:Ljava/lang/String;

    if-nez v2, :cond_e

    move v2, v3

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_e
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->subDescription:Ljava/lang/String;

    if-nez v2, :cond_f

    move v2, v3

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_f
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->alertTitle:Ljava/lang/String;

    if-nez v2, :cond_10

    move v2, v3

    goto :goto_10

    :cond_10
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_10
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->alertDisplay:Ljava/lang/String;

    if-nez v2, :cond_11

    move v2, v3

    goto :goto_11

    :cond_11
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_11
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->fullDescription:Ljava/lang/String;

    if-nez v2, :cond_12

    move v2, v3

    goto :goto_12

    :cond_12
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_12
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->cta:Ljava/lang/String;

    if-nez v2, :cond_13

    move v2, v3

    goto :goto_13

    :cond_13
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_13
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->optionsConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;

    if-nez v2, :cond_14

    move v2, v3

    goto :goto_14

    :cond_14
    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->hashCode()I

    move-result v2

    :goto_14
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->documents:Ljava/util/List;

    if-nez v2, :cond_15

    move v2, v3

    goto :goto_15

    :cond_15
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_15
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->documentDisplay:Ljava/lang/String;

    if-nez v2, :cond_16

    move v2, v3

    goto :goto_16

    :cond_16
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_16
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->connectedDeviceDisplay:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;

    if-nez v2, :cond_17

    move v2, v3

    goto :goto_17

    :cond_17
    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;->hashCode()I

    move-result v2

    :goto_17
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->dataSubmittedCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    if-nez v1, :cond_18

    goto :goto_18

    :cond_18
    invoke-virtual {v1}, Lcom/whoop/design/models/InfoCalloutTileModel;->hashCode()I

    move-result v3

    :goto_18
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 33

    move-object/from16 v0, p0

    iget v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->campaignId:I

    iget-object v2, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->toolbarTitle:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->title:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerSubtitle:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerIcon:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badge:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeText:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeType:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->badgeTextSubtitle:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->headerImage:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->contentBlocks:Ljava/util/List;

    iget-object v12, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->scheduleText:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->scheduleCta:Ljava/lang/String;

    iget-object v14, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBadgeType:Ljava/lang/String;

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBadgeIcon:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusTitle:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->statusBody:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->nextTasks:Ljava/util/List;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->description:Ljava/lang/String;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->descriptionCta:Ljava/lang/String;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->subDescription:Ljava/lang/String;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->alertTitle:Ljava/lang/String;

    move-object/from16 v23, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->alertDisplay:Ljava/lang/String;

    move-object/from16 v24, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->fullDescription:Ljava/lang/String;

    move-object/from16 v25, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->cta:Ljava/lang/String;

    move-object/from16 v26, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->optionsConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;

    move-object/from16 v27, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->documents:Ljava/util/List;

    move-object/from16 v28, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->documentDisplay:Ljava/lang/String;

    move-object/from16 v29, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->connectedDeviceDisplay:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;

    move-object/from16 v30, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->dataSubmittedCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    const-string v0, ", toolbarTitle="

    move-object/from16 v31, v15

    const-string v15, ", title="

    move-object/from16 v32, v13

    const-string v13, "CampaignDetailsScreenResponse(campaignId="

    invoke-static {v1, v13, v0, v2, v15}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", headerSubtitle="

    const-string v2, ", headerIcon="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", badge="

    const-string v2, ", badgeText="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", badgeType="

    const-string v2, ", badgeTextSubtitle="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", headerImage="

    const-string v2, ", contentBlocks="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", scheduleText="

    const-string v2, ", scheduleCta="

    invoke-static {v1, v12, v2, v0, v11}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", statusBadgeType="

    const-string v2, ", statusBadgeIcon="

    move-object/from16 v3, v32

    invoke-static {v0, v3, v1, v14, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", statusTitle="

    const-string v2, ", statusBody="

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", nextTasks="

    const-string v2, ", description="

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v3, v1, v2, v0, v4}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", descriptionCta="

    const-string v2, ", subDescription="

    move-object/from16 v3, v20

    move-object/from16 v4, v21

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", alertTitle="

    const-string v2, ", alertDisplay="

    move-object/from16 v3, v22

    move-object/from16 v4, v23

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", fullDescription="

    const-string v2, ", cta="

    move-object/from16 v3, v24

    move-object/from16 v4, v25

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", optionsConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", documents="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", documentDisplay="

    const-string v2, ", connectedDeviceDisplay="

    move-object/from16 v3, v28

    move-object/from16 v4, v29

    invoke-static {v1, v4, v2, v0, v3}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dataSubmittedCallout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
