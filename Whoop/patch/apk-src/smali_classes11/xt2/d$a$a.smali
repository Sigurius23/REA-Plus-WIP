.class public final Lxt2/d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxt2/d$a;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lec3/m;

.field final synthetic x:Lxt2/d;


# direct methods
.method public constructor <init>(Lec3/m;Lxt2/d;)V
    .locals 0

    iput-object p1, p0, Lxt2/d$a$a;->w:Lec3/m;

    iput-object p2, p0, Lxt2/d$a$a;->x:Lxt2/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lxt2/d$a$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lxt2/d$a$a$a;

    iget v3, v2, Lxt2/d$a$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lxt2/d$a$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lxt2/d$a$a$a;

    invoke-direct {v2, v0, v1}, Lxt2/d$a$a$a;-><init>(Lxt2/d$a$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lxt2/d$a$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lxt2/d$a$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lxt2/d$a$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lxt2/d$a$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lxt2/d$a$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lxt2/d$a$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Ltt2/g;

    invoke-virtual {v4}, Ltt2/g;->a()Ltt2/j;

    move-result-object v6

    invoke-virtual {v4}, Ltt2/g;->b()Ltt2/b;

    move-result-object v11

    instance-of v4, v6, Ltt2/j$c;

    const/4 v13, 0x0

    if-eqz v4, :cond_3

    sget-object v4, Lwt2/q$b;->a:Lwt2/q$b;

    goto :goto_1

    :cond_3
    instance-of v4, v6, Ltt2/j$d;

    if-eqz v4, :cond_4

    iget-object v7, v0, Lxt2/d$a$a;->x:Lxt2/d;

    check-cast v6, Ltt2/j$d;

    invoke-virtual {v6}, Ltt2/j$d;->c()Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;

    move-result-object v8

    invoke-virtual {v6}, Ltt2/j$d;->b()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual {v6}, Ltt2/j$d;->a()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object v12

    invoke-static/range {v7 .. v12}, Lxt2/d;->b(Lxt2/d;Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;Ljava/lang/String;ZLtt2/b;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lwt2/q;

    move-result-object v4

    goto :goto_1

    :cond_4
    instance-of v4, v6, Ltt2/j$e;

    if-eqz v4, :cond_5

    iget-object v7, v0, Lxt2/d$a$a;->x:Lxt2/d;

    check-cast v6, Ltt2/j$e;

    invoke-virtual {v6}, Ltt2/j$e;->c()Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;

    move-result-object v8

    invoke-virtual {v6}, Ltt2/j$e;->b()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x1

    invoke-virtual {v6}, Ltt2/j$e;->a()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object v12

    invoke-static/range {v7 .. v12}, Lxt2/d;->b(Lxt2/d;Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;Ljava/lang/String;ZLtt2/b;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lwt2/q;

    move-result-object v4

    goto :goto_1

    :cond_5
    instance-of v4, v6, Ltt2/j$b;

    if-eqz v4, :cond_6

    new-instance v4, Lwt2/q$a;

    check-cast v6, Ltt2/j$b;

    invoke-virtual {v6}, Ltt2/j$b;->a()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v6}, Lwt2/q$a;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    instance-of v4, v6, Ltt2/j$a;

    if-eqz v4, :cond_8

    new-instance v14, Lwt2/q$c;

    iget-object v4, v0, Lxt2/d$a$a;->x:Lxt2/d;

    const-string v6, "Active Plan"

    invoke-static {v4, v11, v13, v6}, Lxt2/d;->a(Lxt2/d;Ltt2/b;Ljava/lang/String;Ljava/lang/String;)Lwt2/f;

    move-result-object v17

    const/16 v21, 0x30

    const/16 v22, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-string v18, "Active Plan"

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v14 .. v22}, Lwt2/q$c;-><init>(Lwt2/n;Lwt2/l;Lwt2/f;Ljava/lang/String;ZLep0/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v14

    :goto_1
    iput-object v13, v2, Lxt2/d$a$a$a;->y:Ljava/lang/Object;

    iput-object v13, v2, Lxt2/d$a$a$a;->E:Ljava/lang/Object;

    iput-object v13, v2, Lxt2/d$a$a$a;->F:Ljava/lang/Object;

    iput-object v13, v2, Lxt2/d$a$a$a;->G:Ljava/lang/Object;

    const/4 v6, 0x0

    iput v6, v2, Lxt2/d$a$a$a;->H:I

    iput v5, v2, Lxt2/d$a$a$a;->x:I

    invoke-interface {v1, v4, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    return-object v3

    :cond_7
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_8
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
