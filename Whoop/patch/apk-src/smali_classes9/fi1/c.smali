.class public final Lfi1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfi1/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J.\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lfi1/c;",
        "Lfi1/b;",
        "Lcom/whoop/gps/foreground/network/ForegroundGpsApi;",
        "foregroundGpsApi",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/gps/foreground/network/ForegroundGpsApi;Ltr2/n;)V",
        "",
        "startTimeMs",
        "endTimeMs",
        "",
        "Lfv1/b;",
        "route",
        "",
        "a",
        "(JJLjava/util/List;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/gps/foreground/network/ForegroundGpsApi;",
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
.field private final a:Lcom/whoop/gps/foreground/network/ForegroundGpsApi;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/gps/foreground/network/ForegroundGpsApi;Ltr2/n;)V
    .locals 1

    const-string v0, "foregroundGpsApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfi1/c;->a:Lcom/whoop/gps/foreground/network/ForegroundGpsApi;

    iput-object p2, p0, Lfi1/c;->b:Ltr2/n;

    return-void
.end method

.method public static final synthetic b(Lfi1/c;)Lcom/whoop/gps/foreground/network/ForegroundGpsApi;
    .locals 0

    iget-object p0, p0, Lfi1/c;->a:Lcom/whoop/gps/foreground/network/ForegroundGpsApi;

    return-object p0
.end method


# virtual methods
.method public a(JJLjava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Ljava/util/List<",
            "Lfv1/b;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    instance-of v3, v2, Lfi1/c$a;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lfi1/c$a;

    iget v4, v3, Lfi1/c$a;->H:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lfi1/c$a;->H:I

    :goto_0
    move-object v9, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lfi1/c$a;

    invoke-direct {v3, v0, v2}, Lfi1/c$a;-><init>(Lfi1/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v2, v9, Lfi1/c$a;->F:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v9, Lfi1/c$a;->H:I

    const/4 v12, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v12, :cond_1

    iget-object v1, v9, Lfi1/c$a;->E:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/gps/foreground/network/dto/ForegroundGpsRouteSummaryDto;

    iget-object v1, v9, Lfi1/c$a;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    iget-object v1, v9, Lfi1/c$a;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v1

    :cond_3
    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-static {v4}, Lm83/g0;->W(I)I

    move-result v4

    const/16 v5, 0x10

    if-ge v4, v5, :cond_4

    move v4, v5

    :cond_4
    new-instance v15, Ljava/util/LinkedHashMap;

    invoke-direct {v15, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lfv1/b;

    invoke-virtual {v4}, Lfv1/b;->e()J

    move-result-wide v5

    new-instance v7, Ljava/lang/Long;

    invoke-direct {v7, v5, v6}, Ljava/lang/Long;-><init>(J)V

    new-instance v16, Lcom/whoop/gps/foreground/network/dto/ForegroundGpsRoutePointDto;

    invoke-virtual {v4}, Lfv1/b;->c()D

    move-result-wide v17

    invoke-virtual {v4}, Lfv1/b;->d()D

    move-result-wide v19

    invoke-virtual {v4}, Lfv1/b;->a()D

    move-result-wide v21

    invoke-virtual {v4}, Lfv1/b;->b()D

    move-result-wide v23

    invoke-virtual {v4}, Lfv1/b;->f()D

    move-result-wide v25

    invoke-direct/range {v16 .. v26}, Lcom/whoop/gps/foreground/network/dto/ForegroundGpsRoutePointDto;-><init>(DDDDD)V

    move-object/from16 v4, v16

    invoke-interface {v15, v7, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    new-instance v13, Lcom/whoop/gps/foreground/network/dto/ForegroundGpsRouteSummaryDto;

    invoke-static/range {p1 .. p2}, Lfi1/d;->a(J)Ljava/lang/String;

    move-result-object v2

    invoke-static/range {p3 .. p4}, Lfi1/d;->a(J)Ljava/lang/String;

    move-result-object v4

    const-string v5, ","

    const-string v6, ")"

    const-string v7, "("

    invoke-static {v7, v2, v5, v4, v6}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v13 .. v18}, Lcom/whoop/gps/foreground/network/dto/ForegroundGpsRouteSummaryDto;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v4, Lu02/a;->a:Lu02/a$a;

    iget-object v5, v0, Lfi1/c;->b:Ltr2/n;

    new-instance v8, Lfi1/c$b;

    const/4 v2, 0x0

    invoke-direct {v8, v0, v13, v2}, Lfi1/c$b;-><init>(Lfi1/c;Lcom/whoop/gps/foreground/network/dto/ForegroundGpsRouteSummaryDto;Lq83/d;)V

    iput-object v1, v9, Lfi1/c$a;->y:Ljava/lang/Object;

    iput-object v2, v9, Lfi1/c$a;->z:Ljava/lang/Object;

    iput-object v2, v9, Lfi1/c$a;->E:Ljava/lang/Object;

    move-wide/from16 v6, p1

    iput-wide v6, v9, Lfi1/c$a;->w:J

    move-wide/from16 v6, p3

    iput-wide v6, v9, Lfi1/c$a;->x:J

    iput v12, v9, Lfi1/c$a;->H:I

    const/4 v6, 0x0

    const-string v7, "Failed to upload foreground GPS route"

    const/4 v10, 0x2

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_6

    return-object v3

    :cond_6
    :goto_3
    check-cast v2, Lu02/a;

    instance-of v3, v2, Lu02/a$c;

    const/4 v4, 0x0

    if-eqz v3, :cond_7

    iget-object v2, v0, Lfi1/c;->b:Ltr2/n;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const-string v3, "Successfully uploaded "

    const-string v5, " foreground GPS route points"

    invoke-static {v1, v3, v5}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v3, v4, [Lqr2/a$a;

    invoke-interface {v2, v1, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_4

    :cond_7
    instance-of v1, v2, Lu02/a$b;

    if-eqz v1, :cond_8

    iget-object v1, v0, Lfi1/c;->b:Ltr2/n;

    check-cast v2, Lu02/a$b;

    invoke-virtual {v2}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Failed to upload foreground GPS route: "

    invoke-static {v3, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v3, v4, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    move v12, v4

    :goto_4
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :cond_8
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
