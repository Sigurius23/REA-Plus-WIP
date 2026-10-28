.class final Lvk2/d$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvk2/d;->w(Lec3/l;ZJLjava/lang/String;Ljava/util/List;ZLec3/l;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.trackactivity.service.TrackSessionStateHolder$start$2"
    f = "TrackSessionStateHolder.kt"
    l = {
        0x6e,
        0xc2
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Z

.field final synthetic F:Lvk2/d;

.field final synthetic G:Z

.field final synthetic H:J

.field final synthetic I:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field final synthetic J:Ljava/lang/String;

.field final synthetic K:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/activitysession/PauseSegment;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic L:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:J

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ZLvk2/d;ZJLec3/l;Ljava/lang/String;Ljava/util/List;Lec3/l;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lvk2/d;",
            "ZJ",
            "Lec3/l;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/activitysession/PauseSegment;",
            ">;",
            "Lec3/l;",
            "Lq83/d<",
            "-",
            "Lvk2/d$c;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lvk2/d$c;->E:Z

    iput-object p2, p0, Lvk2/d$c;->F:Lvk2/d;

    iput-boolean p3, p0, Lvk2/d$c;->G:Z

    iput-wide p4, p0, Lvk2/d$c;->H:J

    iput-object p6, p0, Lvk2/d$c;->I:Lec3/l;

    iput-object p7, p0, Lvk2/d$c;->J:Ljava/lang/String;

    iput-object p8, p0, Lvk2/d$c;->K:Ljava/util/List;

    iput-object p9, p0, Lvk2/d$c;->L:Lec3/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p10}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lvk2/d$c;

    iget-boolean v1, p0, Lvk2/d$c;->E:Z

    iget-object v2, p0, Lvk2/d$c;->F:Lvk2/d;

    iget-boolean v3, p0, Lvk2/d$c;->G:Z

    iget-wide v4, p0, Lvk2/d$c;->H:J

    iget-object v6, p0, Lvk2/d$c;->I:Lec3/l;

    iget-object v7, p0, Lvk2/d$c;->J:Ljava/lang/String;

    iget-object v8, p0, Lvk2/d$c;->K:Ljava/util/List;

    iget-object v9, p0, Lvk2/d$c;->L:Lec3/l;

    move-object v10, p2

    invoke-direct/range {v0 .. v10}, Lvk2/d$c;-><init>(ZLvk2/d;ZJLec3/l;Ljava/lang/String;Ljava/util/List;Lec3/l;Lq83/d;)V

    iput-object p1, v0, Lvk2/d$c;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lvk2/d$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvk2/d$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvk2/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvk2/d$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v1, p0

    const-string v2, "Failed to read stored GPS route for session="

    iget-object v0, v1, Lvk2/d$c;->z:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v1, Lvk2/d$c;->y:I

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x1

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    const/4 v9, 0x0

    if-eqz v4, :cond_2

    if-eq v4, v7, :cond_1

    if-ne v4, v6, :cond_0

    iget-object v0, v1, Lvk2/d$c;->w:Ljava/lang/Object;

    check-cast v0, Lwk2/f;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_9

    :catchall_0
    move-exception v0

    goto/16 :goto_a

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v0, p1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v4, Lvk2/d$c$a;

    iget-object v10, v1, Lvk2/d$c;->L:Lec3/l;

    iget-object v11, v1, Lvk2/d$c;->F:Lvk2/d;

    invoke-direct {v4, v10, v11, v9}, Lvk2/d$c$a;-><init>(Lec3/l;Lvk2/d;Lq83/d;)V

    const/4 v10, 0x3

    invoke-static {v0, v9, v9, v4, v10}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-boolean v0, v1, Lvk2/d$c;->E:Z

    if-eqz v0, :cond_3

    iget-object v0, v1, Lvk2/d$c;->F:Lvk2/d;

    invoke-static {v0}, Lvk2/d;->h(Lvk2/d;)Lyg2/e;

    move-result-object v10

    sget-object v13, Lyg2/a;->TRACK_ACTIVITY:Lyg2/a;

    const/4 v14, 0x2

    const/4 v15, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-static/range {v10 .. v15}, Lyg2/e;->t(Lyg2/e;ZLjava/lang/String;Lyg2/a;ILjava/lang/Object;)V

    :cond_3
    :try_start_2
    iget-boolean v0, v1, Lvk2/d$c;->G:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_6

    :try_start_3
    iget-object v0, v1, Lvk2/d$c;->F:Lvk2/d;

    invoke-static {v0}, Lvk2/d;->e(Lvk2/d;)Lei1/a;

    move-result-object v0

    iget-wide v10, v1, Lvk2/d$c;->H:J

    iput-object v9, v1, Lvk2/d$c;->z:Ljava/lang/Object;

    iput v7, v1, Lvk2/d$c;->y:I

    invoke-interface {v0, v10, v11, v1}, Lei1/a;->a(JLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_4

    goto/16 :goto_8

    :cond_4
    :goto_0
    check-cast v0, Ljava/util/List;
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :goto_1
    :try_start_4
    iget-object v4, v1, Lvk2/d$c;->F:Lvk2/d;

    invoke-static {v4}, Lvk2/d;->i(Lvk2/d;)Ltr2/n;

    move-result-object v4

    iget-wide v10, v1, Lvk2/d$c;->H:J

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", starting with an empty route"

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v10, v5, [Lqr2/a$a;

    invoke-interface {v4, v2, v0, v10}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object v0, Lm83/y;->w:Lm83/y;

    :goto_2
    check-cast v0, Ljava/lang/Iterable;

    new-instance v10, Lwk2/f;

    const/16 v16, 0xf

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v10 .. v17}, Lwk2/f;-><init>(Ljava/util/List;Lw41/w;DLandroid/location/Location;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, v1, Lvk2/d$c;->F:Lvk2/d;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lfv1/b;

    invoke-static {v2}, Lvk2/d;->f(Lvk2/d;)Lwk2/g;

    move-result-object v11

    invoke-virtual {v11, v10, v4}, Lwk2/g;->a(Lwk2/f;Lfv1/b;)Lwk2/f;

    move-result-object v10

    goto :goto_3

    :cond_5
    :goto_4
    move-object/from16 v22, v10

    goto :goto_5

    :cond_6
    new-instance v10, Lwk2/f;

    const/16 v16, 0xf

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v10 .. v17}, Lwk2/f;-><init>(Ljava/util/List;Lw41/w;DLandroid/location/Location;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_4

    :goto_5
    iget-object v0, v1, Lvk2/d$c;->F:Lvk2/d;

    iget-wide v10, v1, Lvk2/d$c;->H:J

    invoke-static {v0, v10, v11}, Lvk2/d;->a(Lvk2/d;J)J

    move-result-wide v14

    iget-object v0, v1, Lvk2/d$c;->I:Lec3/l;

    iget-object v2, v1, Lvk2/d$c;->F:Lvk2/d;

    invoke-static {v2}, Lvk2/d;->j(Lvk2/d;)Lec3/o1;

    move-result-object v2

    new-array v4, v6, [Lec3/l;

    aput-object v0, v4, v5

    aput-object v2, v4, v7

    invoke-static {v4}, Lec3/v;->J([Lec3/l;)Lec3/h;

    move-result-object v0

    new-instance v11, Lvk2/b;

    iget-wide v12, v1, Lvk2/d$c;->H:J

    iget-object v2, v1, Lvk2/d$c;->J:Ljava/lang/String;

    iget-object v4, v1, Lvk2/d$c;->K:Ljava/util/List;

    iget-boolean v5, v1, Lvk2/d$c;->G:Z

    const/16 v24, 0xf0

    const/16 v25, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v16, v2

    move-object/from16 v17, v4

    move/from16 v23, v5

    invoke-direct/range {v11 .. v25}, Lvk2/b;-><init>(JJLjava/lang/String;Ljava/util/List;Lmk2/e;Lwk2/b;Lwk2/k;Lxk2/f;Lwk2/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lvk2/d$c$b;

    iget-object v4, v1, Lvk2/d$c;->F:Lvk2/d;

    iget-wide v12, v1, Lvk2/d$c;->H:J

    invoke-direct {v2, v4, v12, v13, v9}, Lvk2/d$c$b;-><init>(Lvk2/d;JLq83/d;)V

    new-instance v4, Lec3/l1;

    invoke-direct {v4, v11, v0, v2}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance v0, Lvk2/d$c$c;

    iget-object v2, v1, Lvk2/d$c;->F:Lvk2/d;

    invoke-direct {v0, v2, v9}, Lvk2/d$c$c;-><init>(Lvk2/d;Lq83/d;)V

    iput-object v9, v1, Lvk2/d$c;->z:Ljava/lang/Object;

    iput-object v9, v1, Lvk2/d$c;->w:Ljava/lang/Object;

    iput-wide v14, v1, Lvk2/d$c;->x:J

    iput v6, v1, Lvk2/d$c;->y:I

    sget-object v2, Lfc3/s;->w:Lfc3/s;

    new-instance v5, Lec3/e0;

    invoke-direct {v5, v6, v2, v0}, Lec3/e0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v5, v1}, Lec3/l1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lr83/a;->w:Lr83/a;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-ne v0, v2, :cond_7

    goto :goto_6

    :cond_7
    move-object v0, v8

    :goto_6
    if-ne v0, v2, :cond_8

    goto :goto_7

    :cond_8
    move-object v0, v8

    :goto_7
    if-ne v0, v3, :cond_9

    :goto_8
    return-object v3

    :cond_9
    :goto_9
    iget-object v0, v1, Lvk2/d$c;->F:Lvk2/d;

    invoke-static {v0}, Lvk2/d;->f(Lvk2/d;)Lwk2/g;

    move-result-object v0

    invoke-virtual {v0}, Lwk2/g;->b()V

    iget-boolean v0, v1, Lvk2/d$c;->E:Z

    if-eqz v0, :cond_a

    iget-object v0, v1, Lvk2/d$c;->F:Lvk2/d;

    invoke-static {v0}, Lvk2/d;->h(Lvk2/d;)Lyg2/e;

    move-result-object v2

    sget-object v5, Lyg2/a;->TRACK_ACTIVITY:Lyg2/a;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lyg2/e;->t(Lyg2/e;ZLjava/lang/String;Lyg2/a;ILjava/lang/Object;)V

    :cond_a
    return-object v8

    :goto_a
    iget-object v2, v1, Lvk2/d$c;->F:Lvk2/d;

    invoke-static {v2}, Lvk2/d;->f(Lvk2/d;)Lwk2/g;

    move-result-object v2

    invoke-virtual {v2}, Lwk2/g;->b()V

    iget-boolean v2, v1, Lvk2/d$c;->E:Z

    if-eqz v2, :cond_b

    iget-object v2, v1, Lvk2/d$c;->F:Lvk2/d;

    invoke-static {v2}, Lvk2/d;->h(Lvk2/d;)Lyg2/e;

    move-result-object v3

    sget-object v6, Lyg2/a;->TRACK_ACTIVITY:Lyg2/a;

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lyg2/e;->t(Lyg2/e;ZLjava/lang/String;Lyg2/a;ILjava/lang/Object;)V

    :cond_b
    throw v0
.end method
