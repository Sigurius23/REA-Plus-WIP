.class public final Lug1/a$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug1/a$e;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lug1/a;


# direct methods
.method public constructor <init>(Lec3/m;Lug1/a;)V
    .locals 0

    iput-object p1, p0, Lug1/a$e$a;->w:Lec3/m;

    iput-object p2, p0, Lug1/a$e$a;->x:Lug1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lug1/a$e$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lug1/a$e$a$a;

    iget v3, v2, Lug1/a$e$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lug1/a$e$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lug1/a$e$a$a;

    invoke-direct {v2, v0, v1}, Lug1/a$e$a$a;-><init>(Lug1/a$e$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lug1/a$e$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lug1/a$e$a$a;->x:I

    const/4 v5, 0x2

    const/4 v6, 0x0

    packed-switch v4, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v3, v2, Lug1/a$e$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lug1/a$e$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lug1/a$e$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :pswitch_1
    iget v4, v2, Lug1/a$e$a$a;->L:I

    iget-object v5, v2, Lug1/a$e$a$a;->K:Ljava/lang/Object;

    check-cast v5, Lgt0/h$b;

    goto :goto_1

    :pswitch_2
    iget v4, v2, Lug1/a$e$a$a;->M:I

    iget v5, v2, Lug1/a$e$a$a;->L:I

    iget-object v7, v2, Lug1/a$e$a$a;->K:Ljava/lang/Object;

    check-cast v7, Lgt0/h$b;

    iget-object v8, v2, Lug1/a$e$a$a;->J:Ljava/lang/Object;

    check-cast v8, Lug1/j;

    iget-object v8, v2, Lug1/a$e$a$a;->I:Ljava/lang/Object;

    check-cast v8, Lq83/d;

    iget-object v8, v2, Lug1/a$e$a$a;->H:Ljava/lang/Object;

    check-cast v8, Lec3/m;

    iget-object v9, v2, Lug1/a$e$a$a;->G:Ljava/lang/Object;

    check-cast v9, Lec3/m;

    iget-object v9, v2, Lug1/a$e$a$a;->E:Ljava/lang/Object;

    check-cast v9, Lug1/a$e$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v1, v7

    move v7, v4

    move v4, v5

    move-object v5, v1

    move-object v1, v8

    goto/16 :goto_7

    :pswitch_3
    iget v4, v2, Lug1/a$e$a$a;->L:I

    iget-object v5, v2, Lug1/a$e$a$a;->J:Ljava/lang/Object;

    check-cast v5, Lug1/j;

    iget-object v5, v2, Lug1/a$e$a$a;->I:Ljava/lang/Object;

    check-cast v5, Lq83/d;

    iget-object v5, v2, Lug1/a$e$a$a;->H:Ljava/lang/Object;

    check-cast v5, Lec3/m;

    iget-object v7, v2, Lug1/a$e$a$a;->G:Ljava/lang/Object;

    check-cast v7, Lec3/m;

    iget-object v7, v2, Lug1/a$e$a$a;->E:Ljava/lang/Object;

    check-cast v7, Lug1/a$e$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_4
    iget v4, v2, Lug1/a$e$a$a;->L:I

    iget-object v5, v2, Lug1/a$e$a$a;->K:Ljava/lang/Object;

    check-cast v5, Lgt0/h;

    :goto_1
    iget-object v7, v2, Lug1/a$e$a$a;->J:Ljava/lang/Object;

    check-cast v7, Lug1/j;

    iget-object v7, v2, Lug1/a$e$a$a;->I:Ljava/lang/Object;

    check-cast v7, Lq83/d;

    iget-object v7, v2, Lug1/a$e$a$a;->H:Ljava/lang/Object;

    check-cast v7, Lec3/m;

    iget-object v8, v2, Lug1/a$e$a$a;->G:Ljava/lang/Object;

    check-cast v8, Lec3/m;

    iget-object v8, v2, Lug1/a$e$a$a;->E:Ljava/lang/Object;

    check-cast v8, Lug1/a$e$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_5
    iget v4, v2, Lug1/a$e$a$a;->M:I

    iget v5, v2, Lug1/a$e$a$a;->L:I

    iget-object v7, v2, Lug1/a$e$a$a;->K:Ljava/lang/Object;

    check-cast v7, Lgt0/h;

    iget-object v8, v2, Lug1/a$e$a$a;->J:Ljava/lang/Object;

    check-cast v8, Lug1/j;

    iget-object v8, v2, Lug1/a$e$a$a;->I:Ljava/lang/Object;

    check-cast v8, Lq83/d;

    iget-object v8, v2, Lug1/a$e$a$a;->H:Ljava/lang/Object;

    check-cast v8, Lec3/m;

    iget-object v9, v2, Lug1/a$e$a$a;->G:Ljava/lang/Object;

    check-cast v9, Lec3/m;

    iget-object v9, v2, Lug1/a$e$a$a;->E:Ljava/lang/Object;

    check-cast v9, Lug1/a$e$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_1
    move v1, v4

    move v4, v5

    move-object v5, v7

    move-object v7, v8

    goto/16 :goto_4

    :pswitch_6
    iget v4, v2, Lug1/a$e$a$a;->M:I

    iget v5, v2, Lug1/a$e$a$a;->L:I

    iget-object v7, v2, Lug1/a$e$a$a;->K:Ljava/lang/Object;

    check-cast v7, Lgt0/h;

    iget-object v8, v2, Lug1/a$e$a$a;->J:Ljava/lang/Object;

    check-cast v8, Lug1/j;

    iget-object v8, v2, Lug1/a$e$a$a;->I:Ljava/lang/Object;

    check-cast v8, Lq83/d;

    iget-object v8, v2, Lug1/a$e$a$a;->H:Ljava/lang/Object;

    check-cast v8, Lec3/m;

    iget-object v9, v2, Lug1/a$e$a$a;->G:Ljava/lang/Object;

    check-cast v9, Lec3/m;

    iget-object v9, v2, Lug1/a$e$a$a;->E:Ljava/lang/Object;

    check-cast v9, Lug1/a$e$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_7
    iget v4, v2, Lug1/a$e$a$a;->M:I

    iget v7, v2, Lug1/a$e$a$a;->L:I

    iget-object v8, v2, Lug1/a$e$a$a;->J:Ljava/lang/Object;

    check-cast v8, Lug1/j;

    iget-object v9, v2, Lug1/a$e$a$a;->I:Ljava/lang/Object;

    check-cast v9, Lq83/d;

    iget-object v9, v2, Lug1/a$e$a$a;->H:Ljava/lang/Object;

    check-cast v9, Lec3/m;

    iget-object v10, v2, Lug1/a$e$a$a;->G:Ljava/lang/Object;

    check-cast v10, Lec3/m;

    iget-object v10, v2, Lug1/a$e$a$a;->E:Ljava/lang/Object;

    check-cast v10, Lug1/a$e$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_8
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lug1/a$e$a;->w:Lec3/m;

    move-object/from16 v8, p1

    check-cast v8, Lug1/j;

    instance-of v4, v8, Lug1/j$f;

    const/4 v7, 0x0

    if-eqz v4, :cond_2

    new-instance v4, Lgt0/h$g;

    iget-object v9, v0, Lug1/a$e$a;->x:Lug1/a;

    check-cast v8, Lug1/j$f;

    invoke-virtual {v8}, Lug1/j$f;->b()I

    move-result v10

    invoke-virtual {v8}, Lug1/j$f;->a()I

    move-result v8

    invoke-static {v9, v10, v8}, Lug1/a;->d(Lug1/a;II)I

    move-result v8

    invoke-static {v8}, Lbt0/c;->a(I)I

    move-result v8

    invoke-direct {v4, v8, v7, v5, v6}, Lgt0/h$g;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_8

    :cond_2
    instance-of v4, v8, Lug1/j$g;

    const/4 v9, 0x1

    if-eqz v4, :cond_6

    iget-object v4, v0, Lug1/a$e$a;->x:Lug1/a;

    invoke-virtual {v4}, Lug1/a;->h()Ltr2/n;

    move-result-object v4

    const-string v10, "Finished sending FW packets"

    new-array v11, v7, [Lqr2/a$a;

    invoke-interface {v4, v10, v11}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v4, v0, Lug1/a$e$a;->x:Lug1/a;

    invoke-static {v4}, Lug1/a;->g(Lug1/a;)Lgt0/d;

    move-result-object v10

    sget-object v11, Lgt0/b;->BINARY_TRANSFER:Lgt0/b;

    sget-object v12, Lgt0/c;->SUCCESS:Lgt0/c;

    iget-object v4, v0, Lug1/a$e$a;->x:Lug1/a;

    invoke-static {v4}, Lug1/a;->n(Lug1/a;)Ljava/lang/String;

    move-result-object v14

    move-object v4, v8

    check-cast v4, Lug1/j$g;

    invoke-virtual {v4}, Lug1/j$g;->b()Ljava/lang/String;

    move-result-object v15

    const/16 v17, 0x20

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    invoke-static/range {v10 .. v18}, Lgt0/d;->a(Lgt0/d;Lgt0/b;Lgt0/c;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v4, v0, Lug1/a$e$a;->x:Lug1/a;

    iput-object v6, v2, Lug1/a$e$a$a;->y:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->E:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->F:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->G:Ljava/lang/Object;

    iput-object v1, v2, Lug1/a$e$a$a;->H:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->I:Ljava/lang/Object;

    iput-object v8, v2, Lug1/a$e$a$a;->J:Ljava/lang/Object;

    iput v7, v2, Lug1/a$e$a$a;->L:I

    iput v7, v2, Lug1/a$e$a$a;->M:I

    iput v9, v2, Lug1/a$e$a$a;->x:I

    invoke-virtual {v4, v2}, Lug1/a;->P(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_3

    goto/16 :goto_9

    :cond_3
    move-object v9, v1

    move-object v1, v4

    move v4, v7

    :goto_2
    check-cast v1, Lgt0/h;

    iget-object v10, v0, Lug1/a$e$a;->x:Lug1/a;

    check-cast v8, Lug1/j$g;

    invoke-virtual {v8}, Lug1/j$g;->a()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object v11

    invoke-virtual {v8}, Lug1/j$g;->b()Ljava/lang/String;

    move-result-object v8

    iput-object v6, v2, Lug1/a$e$a$a;->y:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->E:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->F:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->G:Ljava/lang/Object;

    iput-object v9, v2, Lug1/a$e$a$a;->H:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->I:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->J:Ljava/lang/Object;

    iput-object v1, v2, Lug1/a$e$a$a;->K:Ljava/lang/Object;

    iput v7, v2, Lug1/a$e$a$a;->L:I

    iput v4, v2, Lug1/a$e$a$a;->M:I

    iput v5, v2, Lug1/a$e$a$a;->x:I

    invoke-static {v10, v11, v8, v1, v2}, Lug1/a;->r(Lug1/a;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Ljava/lang/String;Lgt0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_4

    goto/16 :goto_9

    :cond_4
    move v5, v7

    move-object v8, v9

    move-object v7, v1

    :goto_3
    sget-object v1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 v1, 0xf

    sget-object v9, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v1, v9}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v9

    iput-object v6, v2, Lug1/a$e$a$a;->y:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->E:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->F:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->G:Ljava/lang/Object;

    iput-object v8, v2, Lug1/a$e$a$a;->H:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->I:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->J:Ljava/lang/Object;

    iput-object v7, v2, Lug1/a$e$a$a;->K:Ljava/lang/Object;

    iput v5, v2, Lug1/a$e$a$a;->L:I

    iput v4, v2, Lug1/a$e$a$a;->M:I

    const/4 v1, 0x3

    iput v1, v2, Lug1/a$e$a$a;->x:I

    invoke-static {v9, v10, v2}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_1

    goto/16 :goto_9

    :goto_4
    iget-object v8, v0, Lug1/a$e$a;->x:Lug1/a;

    iput-object v6, v2, Lug1/a$e$a$a;->y:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->E:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->F:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->G:Ljava/lang/Object;

    iput-object v7, v2, Lug1/a$e$a$a;->H:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->I:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->J:Ljava/lang/Object;

    iput-object v5, v2, Lug1/a$e$a$a;->K:Ljava/lang/Object;

    iput v4, v2, Lug1/a$e$a$a;->L:I

    iput v1, v2, Lug1/a$e$a$a;->M:I

    const/4 v1, 0x4

    iput v1, v2, Lug1/a$e$a$a;->x:I

    invoke-static {v8, v2}, Lug1/a;->f(Lug1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_5

    goto/16 :goto_9

    :cond_5
    :goto_5
    move-object v1, v7

    move v7, v4

    move-object v4, v5

    goto/16 :goto_8

    :cond_6
    instance-of v4, v8, Lug1/j$c;

    if-eqz v4, :cond_8

    iget-object v4, v0, Lug1/a$e$a;->x:Lug1/a;

    iput-object v6, v2, Lug1/a$e$a$a;->y:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->E:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->F:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->G:Ljava/lang/Object;

    iput-object v1, v2, Lug1/a$e$a$a;->H:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->I:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->J:Ljava/lang/Object;

    iput v7, v2, Lug1/a$e$a$a;->L:I

    iput v7, v2, Lug1/a$e$a$a;->M:I

    const/4 v5, 0x5

    iput v5, v2, Lug1/a$e$a$a;->x:I

    invoke-static {v4, v2}, Lug1/a;->f(Lug1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_7

    goto/16 :goto_9

    :cond_7
    move-object v5, v1

    move v4, v7

    :goto_6
    sget-object v1, Lgt0/h$e;->b:Lgt0/h$e;

    move v7, v4

    move-object v4, v1

    move-object v1, v5

    goto/16 :goto_8

    :cond_8
    instance-of v4, v8, Lug1/j$b;

    const-string v10, "Firmware update failed >> "

    if-eqz v4, :cond_b

    iget-object v4, v0, Lug1/a$e$a;->x:Lug1/a;

    invoke-virtual {v4}, Lug1/a;->h()Ltr2/n;

    move-result-object v4

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    new-array v11, v7, [Lqr2/a$a;

    invoke-interface {v4, v10, v11}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v4, v0, Lug1/a$e$a;->x:Lug1/a;

    check-cast v8, Lug1/j$b;

    invoke-virtual {v8}, Lug1/j$b;->a()Lgt0/f;

    move-result-object v10

    invoke-virtual {v10}, Lgt0/f;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v4, v9, v10}, Lug1/a;->q(Lug1/a;ZLjava/lang/String;)V

    new-instance v4, Lgt0/h$b;

    invoke-virtual {v8}, Lug1/j$b;->a()Lgt0/f;

    move-result-object v9

    invoke-direct {v4, v9, v7, v5, v6}, Lgt0/h$b;-><init>(Lgt0/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v5, v0, Lug1/a$e$a;->x:Lug1/a;

    invoke-virtual {v8}, Lug1/j$b;->b()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object v9

    invoke-virtual {v8}, Lug1/j$b;->c()Ljava/lang/String;

    move-result-object v8

    iput-object v6, v2, Lug1/a$e$a$a;->y:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->E:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->F:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->G:Ljava/lang/Object;

    iput-object v1, v2, Lug1/a$e$a$a;->H:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->I:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->J:Ljava/lang/Object;

    iput-object v4, v2, Lug1/a$e$a$a;->K:Ljava/lang/Object;

    iput v7, v2, Lug1/a$e$a$a;->L:I

    iput v7, v2, Lug1/a$e$a$a;->M:I

    const/4 v10, 0x6

    iput v10, v2, Lug1/a$e$a$a;->x:I

    invoke-static {v5, v9, v8, v4, v2}, Lug1/a;->r(Lug1/a;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Ljava/lang/String;Lgt0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_9

    goto/16 :goto_9

    :cond_9
    move-object v5, v4

    move v4, v7

    :goto_7
    iget-object v8, v0, Lug1/a$e$a;->x:Lug1/a;

    iput-object v6, v2, Lug1/a$e$a$a;->y:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->E:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->F:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->G:Ljava/lang/Object;

    iput-object v1, v2, Lug1/a$e$a$a;->H:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->I:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->J:Ljava/lang/Object;

    iput-object v5, v2, Lug1/a$e$a$a;->K:Ljava/lang/Object;

    iput v4, v2, Lug1/a$e$a$a;->L:I

    iput v7, v2, Lug1/a$e$a$a;->M:I

    const/4 v7, 0x7

    iput v7, v2, Lug1/a$e$a$a;->x:I

    invoke-static {v8, v2}, Lug1/a;->f(Lug1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_a

    goto/16 :goto_9

    :cond_a
    move-object v7, v1

    goto/16 :goto_5

    :cond_b
    instance-of v4, v8, Lug1/j$a;

    if-eqz v4, :cond_c

    iget-object v4, v0, Lug1/a$e$a;->x:Lug1/a;

    invoke-virtual {v4}, Lug1/a;->h()Ltr2/n;

    move-result-object v4

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    new-array v9, v7, [Lqr2/a$a;

    invoke-interface {v4, v8, v9}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v4, Lgt0/h$b;

    sget-object v8, Lgt0/f$i;->b:Lgt0/f$i;

    invoke-direct {v4, v8, v7, v5, v6}, Lgt0/h$b;-><init>(Lgt0/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_8

    :cond_c
    instance-of v4, v8, Lug1/j$i;

    if-eqz v4, :cond_d

    iget-object v4, v0, Lug1/a$e$a;->x:Lug1/a;

    invoke-virtual {v4}, Lug1/a;->h()Ltr2/n;

    move-result-object v4

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Firmware update interrupted >> "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    new-array v9, v7, [Lqr2/a$a;

    invoke-interface {v4, v8, v9}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v4, Lgt0/h$b;

    sget-object v8, Lgt0/f$i;->b:Lgt0/f$i;

    invoke-direct {v4, v8, v7, v5, v6}, Lgt0/h$b;-><init>(Lgt0/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_8

    :cond_d
    iget-object v4, v0, Lug1/a$e$a;->x:Lug1/a;

    invoke-virtual {v4}, Lug1/a;->h()Ltr2/n;

    move-result-object v4

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Invalid state "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    new-array v9, v7, [Lqr2/a$a;

    invoke-interface {v4, v8, v9}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v4, Lgt0/h$b;

    sget-object v8, Lgt0/f$g;->b:Lgt0/f$g;

    invoke-direct {v4, v8, v7, v5, v6}, Lgt0/h$b;-><init>(Lgt0/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_8
    iput-object v6, v2, Lug1/a$e$a$a;->y:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->E:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->F:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->G:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->H:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->I:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->J:Ljava/lang/Object;

    iput-object v6, v2, Lug1/a$e$a$a;->K:Ljava/lang/Object;

    iput v7, v2, Lug1/a$e$a$a;->L:I

    const/16 v5, 0x8

    iput v5, v2, Lug1/a$e$a$a;->x:I

    invoke-interface {v1, v4, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_e

    :goto_9
    return-object v3

    :cond_e
    :goto_a
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
