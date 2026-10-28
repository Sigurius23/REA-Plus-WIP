.class Lyt0/f$a;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyt0/f;-><init>(Landroidx/room/z0;)V
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
.field final synthetic a:Lyt0/f;


# direct methods
.method public constructor <init>(Lyt0/f;)V
    .locals 0

    iput-object p1, p0, Lyt0/f$a;->a:Lyt0/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lzt0/b;)V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p2}, Lzt0/b;->b()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lzt0/b;->e()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x2

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    const/4 v0, 0x3

    invoke-virtual {p2}, Lzt0/b;->c()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    iget-object v0, p0, Lyt0/f$a;->a:Lyt0/f;

    invoke-static {v0}, Lyt0/f;->n(Lyt0/f;)Lzt0/c;

    move-result-object v0

    invoke-virtual {p2}, Lzt0/b;->a()Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;

    move-result-object v1

    invoke-virtual {v0, v1}, Lzt0/c;->a(Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lzt0/b;->d()Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    const/4 v0, 0x5

    invoke-interface {p1, v0, p2}, Ltb/c;->q(I[B)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lzt0/b;

    invoke-virtual {p0, p1, p2}, Lyt0/f$a;->a(Ltb/c;Lzt0/b;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR IGNORE INTO `console_packets` (`id`,`sequence_no`,`packet_time_stamp`,`console_packets_metadata`,`received_packet_raw`) VALUES (nullif(?, 0),?,?,?,?)"

    return-object v0
.end method
