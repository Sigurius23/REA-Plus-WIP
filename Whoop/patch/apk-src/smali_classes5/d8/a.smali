.class public final Ld8/a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Ld8/a;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Ld8/a;->w:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ld8/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, [B

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/health/platform/client/proto/r;->t([B)Landroidx/health/platform/client/proto/r;

    move-result-object p1

    new-instance v0, Landroidx/health/platform/client/exerciseroute/ExerciseRoute;

    invoke-direct {v0, p1}, Landroidx/health/platform/client/exerciseroute/ExerciseRoute;-><init>(Landroidx/health/platform/client/proto/r;)V

    return-object v0

    :pswitch_0
    check-cast p1, Lu2/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_1
    check-cast p1, Lcom/squareup/wire/j;

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/squareup/wire/g;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/squareup/wire/g;->b(Lcom/squareup/wire/a0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, [B

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/health/platform/client/proto/j0;->v([B)Landroidx/health/platform/client/proto/j0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/health/platform/client/proto/j0;->r()I

    move-result v0

    invoke-virtual {p1}, Landroidx/health/platform/client/proto/j0;->t()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroidx/health/platform/client/proto/j0;->s()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {v0, p1}, Lrv/n;->i(ILjava/lang/String;)Lt7/c;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, [B

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/health/platform/client/proto/t2;->q([B)Landroidx/health/platform/client/proto/t2;

    move-result-object p1

    new-instance v0, Lf8/d;

    invoke-direct {v0, p1}, Lf8/d;-><init>(Landroidx/health/platform/client/proto/t2;)V

    return-object v0

    :pswitch_4
    check-cast p1, [B

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/health/platform/client/proto/s2;->s([B)Landroidx/health/platform/client/proto/s2;

    move-result-object p1

    new-instance v0, Lf8/c;

    invoke-virtual {p1}, Landroidx/health/platform/client/proto/s2;->q()Landroidx/health/platform/client/proto/w0;

    move-result-object p1

    const-string v1, "proto.dataPointUidList"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Lf8/c;-><init>(Landroidx/health/platform/client/proto/w0;)V

    return-object v0

    :pswitch_5
    check-cast p1, [B

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/health/platform/client/proto/q2;->q([B)Landroidx/health/platform/client/proto/q2;

    move-result-object p1

    new-instance v0, Lf8/b;

    invoke-direct {v0, p1}, Lf8/b;-><init>(Landroidx/health/platform/client/proto/q2;)V

    return-object v0

    :pswitch_6
    check-cast p1, [B

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/health/platform/client/proto/p2;->t([B)Landroidx/health/platform/client/proto/p2;

    move-result-object p1

    new-instance v0, Lf8/a;

    invoke-direct {v0, p1}, Lf8/a;-><init>(Landroidx/health/platform/client/proto/p2;)V

    return-object v0

    :pswitch_7
    check-cast p1, [B

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/health/platform/client/proto/o2;->s([B)Landroidx/health/platform/client/proto/o2;

    move-result-object p1

    new-instance v0, Le8/f;

    invoke-virtual {p1}, Landroidx/health/platform/client/proto/o2;->q()Landroidx/health/platform/client/proto/w0;

    move-result-object p1

    const-string v1, "proto.dataPointList"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Le8/f;-><init>(Ljava/util/List;)V

    return-object v0

    :pswitch_8
    check-cast p1, [B

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/health/platform/client/proto/m2;->y([B)Landroidx/health/platform/client/proto/m2;

    move-result-object p1

    new-instance v0, Le8/e;

    invoke-virtual {p1}, Landroidx/health/platform/client/proto/m2;->t()Ljava/lang/String;

    move-result-object v1

    const-string v2, "callingPackage"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/health/platform/client/proto/m2;->w()I

    move-result v2

    invoke-virtual {p1}, Landroidx/health/platform/client/proto/m2;->v()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroidx/health/platform/client/proto/m2;->u()Z

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Le8/e;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    return-object v0

    :pswitch_9
    check-cast p1, [B

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/health/platform/client/proto/k2;->v([B)Landroidx/health/platform/client/proto/k2;

    move-result-object p1

    new-instance v0, Le8/d;

    invoke-direct {v0, p1}, Le8/d;-><init>(Landroidx/health/platform/client/proto/k2;)V

    return-object v0

    :pswitch_a
    check-cast p1, [B

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/health/platform/client/proto/i2;->s([B)Landroidx/health/platform/client/proto/i2;

    move-result-object p1

    new-instance v0, Le8/c;

    invoke-direct {v0, p1}, Le8/c;-><init>(Landroidx/health/platform/client/proto/i2;)V

    return-object v0

    :pswitch_b
    check-cast p1, [B

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/health/platform/client/proto/g2;->r([B)Landroidx/health/platform/client/proto/g2;

    move-result-object p1

    new-instance v0, Le8/b;

    invoke-direct {v0, p1}, Le8/b;-><init>(Landroidx/health/platform/client/proto/g2;)V

    return-object v0

    :pswitch_c
    check-cast p1, [B

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/health/platform/client/proto/e2;->u([B)Landroidx/health/platform/client/proto/e2;

    move-result-object p1

    new-instance v0, Le8/a;

    invoke-virtual {p1}, Landroidx/health/platform/client/proto/e2;->s()Landroidx/health/platform/client/proto/w0;

    move-result-object v1

    const-string v2, "proto.uidsList"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/health/platform/client/proto/e2;->r()Landroidx/health/platform/client/proto/w0;

    move-result-object p1

    const-string v2, "proto.clientIdsList"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, p1}, Le8/a;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v0

    :pswitch_d
    check-cast p1, [B

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/health/platform/client/proto/w1;->s([B)Landroidx/health/platform/client/proto/w1;

    move-result-object p1

    new-instance v0, Landroidx/health/platform/client/permission/Permission;

    invoke-direct {v0, p1}, Landroidx/health/platform/client/permission/Permission;-><init>(Landroidx/health/platform/client/proto/w1;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
