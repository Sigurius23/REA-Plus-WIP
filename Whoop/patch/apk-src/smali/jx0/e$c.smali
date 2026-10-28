.class Ljx0/e$c;
.super Landroidx/room/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljx0/e;-><init>(Landroidx/room/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/i;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljx0/e;


# direct methods
.method public constructor <init>(Ljx0/e;)V
    .locals 0

    iput-object p1, p0, Ljx0/e$c;->a:Ljx0/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Ljx0/a;)V
    .locals 3

    invoke-virtual {p2}, Ljx0/a;->h()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljx0/a;->h()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Ljx0/a;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Ljx0/a;->e()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1
    const/4 v0, 0x3

    invoke-virtual {p2}, Ljx0/a;->f()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    const/4 v0, 0x4

    invoke-virtual {p2}, Ljx0/a;->c()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Ljx0/a;->d()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x5

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Ljx0/a;->g()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x6

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Ljx0/a;->h()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    return-void

    :cond_2
    invoke-virtual {p2}, Ljx0/a;->h()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljx0/a;

    invoke-virtual {p0, p1, p2}, Ljx0/e$c;->a(Ltb/c;Ljx0/a;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE OR ABORT `data_sync_work_db` SET `workerId` = ?,`source` = ?,`trigger_timestamp` = ?,`result_timestamp` = ?,`total_packet_upload` = ?,`upload_retry_count` = ? WHERE `workerId` = ?"

    return-object v0
.end method
