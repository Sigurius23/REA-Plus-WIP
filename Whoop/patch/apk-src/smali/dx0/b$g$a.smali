.class public final Ldx0/b$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldx0/b$g;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Ldx0/b;


# direct methods
.method public constructor <init>(Lec3/m;Ldx0/b;)V
    .locals 0

    iput-object p1, p0, Ldx0/b$g$a;->w:Lec3/m;

    iput-object p2, p0, Ldx0/b$g$a;->x:Ldx0/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Ldx0/b$g$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ldx0/b$g$a$a;

    iget v3, v2, Ldx0/b$g$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Ldx0/b$g$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Ldx0/b$g$a$a;

    invoke-direct {v2, v0, v1}, Ldx0/b$g$a$a;-><init>(Ldx0/b$g$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Ldx0/b$g$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Ldx0/b$g$a$a;->x:I

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    sget-object v11, Ll83/a0;->a:Ll83/a0;

    if-eqz v4, :cond_5

    if-eq v4, v8, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Ldx0/b$g$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Ldx0/b$g$a$a;->E:Ljava/lang/Object;

    check-cast v2, Ldx0/b$g$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v4, v2, Ldx0/b$g$a$a;->K:I

    iget-object v6, v2, Ldx0/b$g$a$a;->J:Ljava/lang/Object;

    check-cast v6, Ldt0/b;

    iget-object v7, v2, Ldx0/b$g$a$a;->I:Ljava/lang/Object;

    check-cast v7, Lq83/d;

    iget-object v7, v2, Ldx0/b$g$a$a;->H:Ljava/lang/Object;

    check-cast v7, Lec3/m;

    iget-object v8, v2, Ldx0/b$g$a$a;->G:Ljava/lang/Object;

    check-cast v8, Lec3/m;

    iget-object v8, v2, Ldx0/b$g$a$a;->E:Ljava/lang/Object;

    check-cast v8, Ldx0/b$g$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    iget v4, v2, Ldx0/b$g$a$a;->K:I

    iget-object v6, v2, Ldx0/b$g$a$a;->J:Ljava/lang/Object;

    check-cast v6, Ldt0/b;

    iget-object v6, v2, Ldx0/b$g$a$a;->I:Ljava/lang/Object;

    check-cast v6, Lq83/d;

    iget-object v6, v2, Ldx0/b$g$a$a;->H:Ljava/lang/Object;

    check-cast v6, Lec3/m;

    iget-object v7, v2, Ldx0/b$g$a$a;->G:Ljava/lang/Object;

    check-cast v7, Lec3/m;

    iget-object v7, v2, Ldx0/b$g$a$a;->E:Ljava/lang/Object;

    check-cast v7, Ldx0/b$g$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_4
    iget v4, v2, Ldx0/b$g$a$a;->L:I

    iget v8, v2, Ldx0/b$g$a$a;->K:I

    iget-object v12, v2, Ldx0/b$g$a$a;->J:Ljava/lang/Object;

    check-cast v12, Ldt0/b;

    iget-object v13, v2, Ldx0/b$g$a$a;->I:Ljava/lang/Object;

    check-cast v13, Lq83/d;

    iget-object v13, v2, Ldx0/b$g$a$a;->H:Ljava/lang/Object;

    check-cast v13, Lec3/m;

    iget-object v14, v2, Ldx0/b$g$a$a;->G:Ljava/lang/Object;

    check-cast v14, Lec3/m;

    iget-object v14, v2, Ldx0/b$g$a$a;->E:Ljava/lang/Object;

    check-cast v14, Ldx0/b$g$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move/from16 v22, v8

    move v8, v4

    move/from16 v4, v22

    goto :goto_1

    :cond_5
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Ldx0/b$g$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Ldt0/b;

    iget-object v12, v0, Ldx0/b$g$a;->x:Ldx0/b;

    invoke-static {v12}, Ldx0/b;->c(Ldx0/b;)Lmx0/b;

    move-result-object v12

    invoke-virtual {v4}, Ldt0/b;->a()Ldt0/c;

    move-result-object v13

    invoke-virtual {v13}, Ldt0/c;->e()Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    move-result-object v13

    iput-object v10, v2, Ldx0/b$g$a$a;->y:Ljava/lang/Object;

    iput-object v10, v2, Ldx0/b$g$a$a;->E:Ljava/lang/Object;

    iput-object v10, v2, Ldx0/b$g$a$a;->F:Ljava/lang/Object;

    iput-object v10, v2, Ldx0/b$g$a$a;->G:Ljava/lang/Object;

    iput-object v1, v2, Ldx0/b$g$a$a;->H:Ljava/lang/Object;

    iput-object v10, v2, Ldx0/b$g$a$a;->I:Ljava/lang/Object;

    iput-object v4, v2, Ldx0/b$g$a$a;->J:Ljava/lang/Object;

    iput v9, v2, Ldx0/b$g$a$a;->K:I

    iput v9, v2, Ldx0/b$g$a$a;->L:I

    iput v8, v2, Ldx0/b$g$a$a;->x:I

    invoke-virtual {v12, v13, v2}, Lmx0/b;->d(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;Lq83/d;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v3, :cond_6

    goto/16 :goto_4

    :cond_6
    move-object v13, v1

    move-object v12, v4

    move-object v1, v8

    move v4, v9

    move v8, v4

    :goto_1
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_8

    iget-object v1, v0, Ldx0/b$g$a;->x:Ldx0/b;

    invoke-static {v1}, Ldx0/b;->e(Ldx0/b;)Ltr2/n;

    move-result-object v1

    invoke-virtual {v12}, Ldt0/b;->a()Ldt0/c;

    move-result-object v6

    invoke-virtual {v6}, Ldt0/c;->e()Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    const-string v14, "Scheduling data sync job from "

    invoke-static {v14, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-array v9, v9, [Lqr2/a$a;

    invoke-interface {v1, v6, v9}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, v0, Ldx0/b$g$a;->x:Ldx0/b;

    invoke-static {v1}, Ldx0/b;->c(Ldx0/b;)Lmx0/b;

    move-result-object v1

    iput-object v10, v2, Ldx0/b$g$a$a;->y:Ljava/lang/Object;

    iput-object v10, v2, Ldx0/b$g$a$a;->E:Ljava/lang/Object;

    iput-object v10, v2, Ldx0/b$g$a$a;->F:Ljava/lang/Object;

    iput-object v10, v2, Ldx0/b$g$a$a;->G:Ljava/lang/Object;

    iput-object v13, v2, Ldx0/b$g$a$a;->H:Ljava/lang/Object;

    iput-object v10, v2, Ldx0/b$g$a$a;->I:Ljava/lang/Object;

    iput-object v10, v2, Ldx0/b$g$a$a;->J:Ljava/lang/Object;

    iput v4, v2, Ldx0/b$g$a$a;->K:I

    iput v8, v2, Ldx0/b$g$a$a;->L:I

    iput v7, v2, Ldx0/b$g$a$a;->x:I

    invoke-virtual {v1, v12, v2}, Lmx0/b;->e(Ldt0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    goto/16 :goto_4

    :cond_7
    move-object v6, v13

    goto :goto_3

    :cond_8
    iget-object v1, v0, Ldx0/b$g$a;->x:Ldx0/b;

    invoke-static {v1}, Ldx0/b;->d(Ldx0/b;)Lfx0/b;

    move-result-object v1

    invoke-virtual {v12}, Ldt0/b;->a()Ldt0/c;

    move-result-object v7

    invoke-virtual {v7}, Ldt0/c;->f()J

    move-result-wide v16

    invoke-virtual {v12}, Ldt0/b;->a()Ldt0/c;

    move-result-object v7

    invoke-virtual {v7}, Ldt0/c;->e()Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v15

    new-instance v14, Lfx0/a$d;

    const/16 v20, 0x4

    const/16 v21, 0x0

    const-wide/16 v18, 0x0

    invoke-direct/range {v14 .. v21}, Lfx0/a$d;-><init>(Ljava/lang/String;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v10, v2, Ldx0/b$g$a$a;->y:Ljava/lang/Object;

    iput-object v10, v2, Ldx0/b$g$a$a;->E:Ljava/lang/Object;

    iput-object v10, v2, Ldx0/b$g$a$a;->F:Ljava/lang/Object;

    iput-object v10, v2, Ldx0/b$g$a$a;->G:Ljava/lang/Object;

    iput-object v13, v2, Ldx0/b$g$a$a;->H:Ljava/lang/Object;

    iput-object v10, v2, Ldx0/b$g$a$a;->I:Ljava/lang/Object;

    iput-object v12, v2, Ldx0/b$g$a$a;->J:Ljava/lang/Object;

    iput v4, v2, Ldx0/b$g$a$a;->K:I

    iput v8, v2, Ldx0/b$g$a$a;->L:I

    iput v6, v2, Ldx0/b$g$a$a;->x:I

    invoke-virtual {v1, v14, v2}, Lfx0/b;->a(Lfx0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_9

    goto :goto_4

    :cond_9
    move-object v6, v12

    move-object v7, v13

    :goto_2
    iget-object v1, v0, Ldx0/b$g$a;->x:Ldx0/b;

    invoke-static {v1}, Ldx0/b;->e(Ldx0/b;)Ltr2/n;

    move-result-object v1

    invoke-virtual {v6}, Ldt0/b;->a()Ldt0/c;

    move-result-object v6

    invoke-virtual {v6}, Ldt0/c;->e()Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    const-string v8, "Job already scheduled for "

    invoke-static {v8, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-array v8, v9, [Lqr2/a$a;

    invoke-interface {v1, v6, v8}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    move-object v6, v7

    :goto_3
    iput-object v10, v2, Ldx0/b$g$a$a;->y:Ljava/lang/Object;

    iput-object v10, v2, Ldx0/b$g$a$a;->E:Ljava/lang/Object;

    iput-object v10, v2, Ldx0/b$g$a$a;->F:Ljava/lang/Object;

    iput-object v10, v2, Ldx0/b$g$a$a;->G:Ljava/lang/Object;

    iput-object v10, v2, Ldx0/b$g$a$a;->H:Ljava/lang/Object;

    iput-object v10, v2, Ldx0/b$g$a$a;->I:Ljava/lang/Object;

    iput-object v10, v2, Ldx0/b$g$a$a;->J:Ljava/lang/Object;

    iput v4, v2, Ldx0/b$g$a$a;->K:I

    iput v5, v2, Ldx0/b$g$a$a;->x:I

    invoke-interface {v6, v11, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_a

    :goto_4
    return-object v3

    :cond_a
    :goto_5
    return-object v11
.end method
