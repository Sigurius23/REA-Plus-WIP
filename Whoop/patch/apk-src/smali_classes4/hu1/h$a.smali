.class Lhu1/h$a;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhu1/h;-><init>(Landroidx/room/z0;)V
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
.field final synthetic a:Lhu1/h;


# direct methods
.method public constructor <init>(Lhu1/h;)V
    .locals 0

    iput-object p1, p0, Lhu1/h$a;->a:Lhu1/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lhu1/b;)V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p2}, Lhu1/b;->getTimestamp()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lhu1/b;->c()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x2

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lhu1/b;->a()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const/4 v1, 0x3

    invoke-interface {p1, v1, v0}, Ltb/c;->q(I[B)V

    invoke-virtual {p2}, Lhu1/b;->b()I

    move-result p2

    int-to-long v0, p2

    const/4 p2, 0x4

    invoke-interface {p1, p2, v0, v1}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lhu1/b;

    invoke-virtual {p0, p1, p2}, Lhu1/h$a;->a(Ltb/c;Lhu1/b;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `ecg_packets` (`timestamp`,`packet_revision`,`packet_data`,`version_id`) VALUES (?,?,?,?)"

    return-object v0
.end method
