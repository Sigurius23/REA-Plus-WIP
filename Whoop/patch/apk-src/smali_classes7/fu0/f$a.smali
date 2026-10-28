.class Lfu0/f$a;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfu0/f;-><init>(Landroidx/room/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/k;"
    }
.end annotation


# instance fields
.field final synthetic a:Lfu0/f;


# direct methods
.method public constructor <init>(Lfu0/f;)V
    .locals 0

    iput-object p1, p0, Lfu0/f$a;->a:Lfu0/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lgu0/c;)V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p2}, Lgu0/c;->a()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    const/4 v0, 0x2

    invoke-virtual {p2}, Lgu0/c;->c()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    const/4 v0, 0x3

    invoke-virtual {p2}, Lgu0/c;->e()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    iget-object v0, p0, Lfu0/f$a;->a:Lfu0/f;

    invoke-static {v0}, Lfu0/f;->g(Lfu0/f;)Lgu0/d;

    move-result-object v0

    invoke-virtual {p2}, Lgu0/c;->b()Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgu0/d;->d(Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lgu0/c;->d()Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    const/4 v0, 0x5

    invoke-interface {p1, v0, p2}, Ltb/c;->q(I[B)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lgu0/c;

    invoke-virtual {p0, p1, p2}, Lfu0/f$a;->a(Ltb/c;Lgu0/c;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR IGNORE INTO `table_rev2_raw_data` (`id`,`packet_time_stamp`,`sequence_no`,`metadata`,`received_packet_raw`) VALUES (nullif(?, 0),?,?,?,?)"

    return-object v0
.end method
