.class public final Lji1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lji1/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001e\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lji1/b;",
        "Lji1/a;",
        "Lcom/whoop/gps/network/GpsTrackingApi;",
        "gpsTrackingApi",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/gps/network/GpsTrackingApi;Ltr2/n;)V",
        "",
        "Lyh1/a;",
        "locations",
        "",
        "a",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/gps/network/GpsTrackingApi;",
        "b",
        "Ltr2/n;",
        "gps-tracking_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/whoop/gps/network/GpsTrackingApi;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/gps/network/GpsTrackingApi;Ltr2/n;)V
    .locals 1

    const-string v0, "gpsTrackingApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lji1/b;->a:Lcom/whoop/gps/network/GpsTrackingApi;

    iput-object p2, p0, Lji1/b;->b:Ltr2/n;

    return-void
.end method

.method public static final synthetic b(Lji1/b;)Lcom/whoop/gps/network/GpsTrackingApi;
    .locals 0

    iget-object p0, p0, Lji1/b;->a:Lcom/whoop/gps/network/GpsTrackingApi;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lyh1/a;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lji1/b$a;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lji1/b$a;

    iget v4, v3, Lji1/b$a;->E:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lji1/b$a;->E:I

    :goto_0
    move-object v9, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lji1/b$a;

    invoke-direct {v3, v0, v2}, Lji1/b$a;-><init>(Lji1/b;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v2, v9, Lji1/b$a;->y:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v9, Lji1/b$a;->E:I

    const/4 v12, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v12, :cond_1

    iget-object v1, v9, Lji1/b$a;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v1, v9, Lji1/b$a;->w:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lyh1/a;

    invoke-virtual {v5}, Lyh1/a;->e()Lyh1/b;

    move-result-object v7

    if-eqz v7, :cond_3

    new-instance v13, Lcom/whoop/gps/upload/dto/SpeedDataModel;

    invoke-virtual {v7}, Lyh1/b;->c()D

    move-result-wide v14

    invoke-virtual {v7}, Lyh1/b;->b()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v7}, Lyh1/b;->a()D

    move-result-wide v17

    invoke-direct/range {v13 .. v18}, Lcom/whoop/gps/upload/dto/SpeedDataModel;-><init>(DLjava/lang/String;D)V

    move-object/from16 v27, v13

    goto :goto_3

    :cond_3
    move-object/from16 v27, v6

    :goto_3
    new-instance v14, Lcom/whoop/gps/upload/dto/GpsUploadModel;

    invoke-virtual {v5}, Lyh1/a;->f()J

    move-result-wide v15

    invoke-virtual {v5}, Lyh1/a;->c()D

    move-result-wide v17

    invoke-virtual {v5}, Lyh1/a;->d()D

    move-result-wide v19

    invoke-virtual {v5}, Lyh1/a;->a()D

    move-result-wide v21

    invoke-virtual {v5}, Lyh1/a;->b()D

    move-result-wide v23

    invoke-virtual {v5}, Lyh1/a;->h()D

    move-result-wide v25

    invoke-virtual {v5}, Lyh1/a;->g()Ljava/lang/String;

    move-result-object v28

    invoke-direct/range {v14 .. v28}, Lcom/whoop/gps/upload/dto/GpsUploadModel;-><init>(JDDDDDLcom/whoop/gps/upload/dto/SpeedDataModel;Ljava/lang/String;)V

    invoke-interface {v4, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    sget-object v2, Lu02/a;->a:Lu02/a$a;

    iget-object v5, v0, Lji1/b;->b:Ltr2/n;

    new-instance v8, Lji1/b$b;

    invoke-direct {v8, v0, v4, v6}, Lji1/b$b;-><init>(Lji1/b;Ljava/util/List;Lq83/d;)V

    iput-object v1, v9, Lji1/b$a;->w:Ljava/lang/Object;

    iput-object v6, v9, Lji1/b$a;->x:Ljava/lang/Object;

    iput v12, v9, Lji1/b$a;->E:I

    const/4 v6, 0x0

    const-string v7, "Failed to upload GPS locations"

    const/4 v10, 0x2

    const/4 v11, 0x0

    move-object v4, v2

    invoke-static/range {v4 .. v11}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_5

    return-object v3

    :cond_5
    :goto_4
    check-cast v2, Lu02/a;

    instance-of v3, v2, Lu02/a$c;

    const/4 v4, 0x0

    if-eqz v3, :cond_6

    iget-object v2, v0, Lji1/b;->b:Ltr2/n;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const-string v3, "Successfully uploaded "

    const-string v5, " GPS locations"

    invoke-static {v1, v3, v5}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v3, v4, [Lqr2/a$a;

    invoke-interface {v2, v1, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_5

    :cond_6
    instance-of v1, v2, Lu02/a$b;

    if-eqz v1, :cond_7

    iget-object v1, v0, Lji1/b;->b:Ltr2/n;

    check-cast v2, Lu02/a$b;

    invoke-virtual {v2}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Failed to upload GPS locations: "

    invoke-static {v3, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v3, v4, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    move v12, v4

    :goto_5
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :cond_7
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
