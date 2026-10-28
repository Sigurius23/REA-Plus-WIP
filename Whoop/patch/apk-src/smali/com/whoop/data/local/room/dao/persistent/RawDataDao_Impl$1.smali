.class Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl$1;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;-><init>(Landroidx/room/z0;)V
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
.field final synthetic this$0:Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;


# direct methods
.method public constructor <init>(Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl$1;->this$0:Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bind(Ltb/c;Ldu0/a;)V
    .locals 3

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p2}, Ldu0/a;->j()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    .line 3
    invoke-virtual {p2}, Ldu0/a;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    .line 4
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p2}, Ldu0/a;->d()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 6
    :goto_0
    invoke-virtual {p2}, Ldu0/a;->f()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    .line 7
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    .line 8
    :cond_1
    invoke-virtual {p2}, Ldu0/a;->f()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 9
    :goto_1
    invoke-virtual {p2}, Ldu0/a;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_2

    .line 10
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    .line 11
    :cond_2
    invoke-virtual {p2}, Ldu0/a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 12
    :goto_2
    invoke-virtual {p2}, Ldu0/a;->i()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_3

    .line 13
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_3

    .line 14
    :cond_3
    invoke-virtual {p2}, Ldu0/a;->i()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 15
    :goto_3
    invoke-virtual {p2}, Ldu0/a;->b()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x6

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 16
    invoke-virtual {p2}, Ldu0/a;->a()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x7

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 17
    invoke-virtual {p2}, Ldu0/a;->h()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_4

    .line 18
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_4

    .line 19
    :cond_4
    invoke-virtual {p2}, Ldu0/a;->h()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 20
    :goto_4
    invoke-virtual {p2}, Ldu0/a;->g()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const/16 v1, 0x9

    invoke-interface {p1, v1, v0}, Ltb/c;->q(I[B)V

    const/16 v0, 0xa

    .line 21
    invoke-virtual {p2}, Ldu0/a;->e()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ldu0/a;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl$1;->bind(Ltb/c;Ldu0/a;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `table_raw_data` (`timestamp`,`hw_version`,`maxim_version`,`dsp_version`,`strap_id`,`binary_version`,`binary_flags`,`raw_data_version`,`payload`,`id`) VALUES (?,?,?,?,?,?,?,?,?,nullif(?, 0))"

    return-object v0
.end method
