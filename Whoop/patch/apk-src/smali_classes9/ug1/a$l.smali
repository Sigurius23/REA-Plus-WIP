.class final Lug1/a$l;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug1/a;->U(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Ljava/lang/String;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lug1/j;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.firmwareUpdateService.strategy.BatteryPackUpdateStrategy$sendFwPackets$1"
    f = "BatteryPackUpdateStrategy.kt"
    l = {
        0xd7,
        0xda,
        0xe2,
        0xe6,
        0xe8,
        0xea,
        0xf4,
        0xf9,
        0xfd,
        0x10b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field private synthetic G:Ljava/lang/Object;

.field final synthetic H:Lug1/a;

.field final synthetic I:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

.field final synthetic J:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lug1/a;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lug1/a;",
            "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lug1/a$l;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lug1/a$l;->H:Lug1/a;

    iput-object p2, p0, Lug1/a$l;->I:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    iput-object p3, p0, Lug1/a$l;->J:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lug1/a$l;

    iget-object v1, p0, Lug1/a$l;->H:Lug1/a;

    iget-object v2, p0, Lug1/a$l;->I:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    iget-object v3, p0, Lug1/a$l;->J:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Lug1/a$l;-><init>(Lug1/a;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lug1/a$l;->G:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lug1/a$l;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lug1/a$l;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lug1/a$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lug1/a$l;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    iget-object v0, v1, Lug1/a$l;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lec3/m;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v0, v1, Lug1/a$l;->F:I

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v6, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v1, Lug1/a$l;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :pswitch_1
    iget-object v0, v1, Lug1/a$l;->w:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_a

    :catch_0
    move-exception v0

    goto/16 :goto_8

    :pswitch_2
    iget v0, v1, Lug1/a$l;->E:I

    iget v4, v1, Lug1/a$l;->z:I

    iget v7, v1, Lug1/a$l;->y:I

    iget-object v8, v1, Lug1/a$l;->w:Ljava/lang/Object;

    check-cast v8, Ljava/io/File;

    goto :goto_0

    :pswitch_3
    iget v0, v1, Lug1/a$l;->E:I

    iget v4, v1, Lug1/a$l;->z:I

    iget v7, v1, Lug1/a$l;->y:I

    iget-object v8, v1, Lug1/a$l;->x:Ljava/lang/Object;

    check-cast v8, Ll83/k;

    iget-object v8, v1, Lug1/a$l;->w:Ljava/lang/Object;

    check-cast v8, Ljava/io/File;

    :goto_0
    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_6

    :pswitch_4
    iget v0, v1, Lug1/a$l;->E:I

    iget v7, v1, Lug1/a$l;->z:I

    iget v8, v1, Lug1/a$l;->y:I

    iget-object v9, v1, Lug1/a$l;->x:Ljava/lang/Object;

    check-cast v9, Ll83/k;

    iget-object v9, v1, Lug1/a$l;->w:Ljava/lang/Object;

    check-cast v9, Ljava/io/File;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_3

    :pswitch_5
    iget v0, v1, Lug1/a$l;->E:I

    iget v7, v1, Lug1/a$l;->z:I

    iget v8, v1, Lug1/a$l;->y:I

    iget-object v9, v1, Lug1/a$l;->x:Ljava/lang/Object;

    check-cast v9, Ll83/k;

    iget-object v9, v1, Lug1/a$l;->w:Ljava/lang/Object;

    check-cast v9, Ljava/io/File;

    :try_start_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_5

    :pswitch_6
    iget v0, v1, Lug1/a$l;->E:I

    iget v7, v1, Lug1/a$l;->z:I

    iget v8, v1, Lug1/a$l;->y:I

    iget-object v9, v1, Lug1/a$l;->w:Ljava/lang/Object;

    check-cast v9, Ljava/io/File;

    :try_start_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    move-object/from16 v9, p1

    goto/16 :goto_4

    :pswitch_7
    iget-object v0, v1, Lug1/a$l;->w:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    :try_start_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_2

    :pswitch_8
    iget-object v0, v1, Lug1/a$l;->w:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    :try_start_6
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    goto :goto_1

    :pswitch_9
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_7
    iget-object v0, v1, Lug1/a$l;->H:Lug1/a;

    invoke-static {v0}, Lug1/a;->i(Lug1/a;)Lmg1/b;

    move-result-object v0

    iget-object v7, v1, Lug1/a$l;->I:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    invoke-virtual {v7}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getSerial()Ljava/lang/String;

    move-result-object v7

    iget-object v8, v1, Lug1/a$l;->I:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    invoke-virtual {v8}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getDeviceName()Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    move-result-object v8

    iget-object v9, v1, Lug1/a$l;->J:Ljava/lang/String;

    invoke-virtual {v0, v7, v8, v9}, Lmg1/b;->g(Ljava/lang/String;Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v7, v1, Lug1/a$l;->H:Lug1/a;

    invoke-static {v7}, Lug1/a;->k(Lug1/a;)Lug1/g;

    move-result-object v7

    iput-object v2, v1, Lug1/a$l;->G:Ljava/lang/Object;

    iput-object v6, v1, Lug1/a$l;->w:Ljava/lang/Object;

    const/4 v8, 0x1

    iput v8, v1, Lug1/a$l;->F:I

    invoke-interface {v7, v0, v8, v1}, Lug1/g;->b(Ljava/io/File;ZLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_0

    goto/16 :goto_9

    :cond_0
    :goto_1
    iget-object v0, v1, Lug1/a$l;->H:Lug1/a;

    invoke-static {v0}, Lug1/a;->m(Lug1/a;)I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v1, Lug1/a$l;->H:Lug1/a;

    invoke-static {v0}, Lug1/a;->k(Lug1/a;)Lug1/g;

    move-result-object v0

    iget-object v7, v1, Lug1/a$l;->H:Lug1/a;

    invoke-static {v7}, Lug1/a;->m(Lug1/a;)I

    move-result v7

    iput-object v2, v1, Lug1/a$l;->G:Ljava/lang/Object;

    iput-object v6, v1, Lug1/a$l;->w:Ljava/lang/Object;

    const/4 v8, 0x2

    iput v8, v1, Lug1/a$l;->F:I

    invoke-interface {v0, v7, v1}, Lug1/g;->d(ILq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_1

    goto/16 :goto_9

    :cond_1
    :goto_2
    iget-object v0, v1, Lug1/a$l;->H:Lug1/a;

    invoke-static {v0}, Lug1/a;->m(Lug1/a;)I

    move-result v0

    iget-object v7, v1, Lug1/a$l;->H:Lug1/a;

    invoke-static {v7}, Lug1/a;->k(Lug1/a;)Lug1/g;

    move-result-object v7

    invoke-interface {v7}, Lug1/g;->getLength()I

    move-result v7

    move v8, v0

    move v0, v5

    :cond_2
    :goto_3
    if-gt v8, v7, :cond_9

    if-gt v0, v4, :cond_8

    iget-object v9, v1, Lug1/a$l;->H:Lug1/a;

    iput-object v2, v1, Lug1/a$l;->G:Ljava/lang/Object;

    iput-object v6, v1, Lug1/a$l;->w:Ljava/lang/Object;

    iput-object v6, v1, Lug1/a$l;->x:Ljava/lang/Object;

    iput v8, v1, Lug1/a$l;->y:I

    iput v7, v1, Lug1/a$l;->z:I

    iput v0, v1, Lug1/a$l;->E:I

    const/4 v10, 0x3

    iput v10, v1, Lug1/a$l;->F:I

    invoke-static {v9, v8, v1}, Lug1/a;->t(Lug1/a;ILq83/d;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v3, :cond_3

    goto/16 :goto_9

    :cond_3
    :goto_4
    check-cast v9, Ll83/k;

    iget-object v10, v9, Ll83/k;->w:Ljava/lang/Object;

    iget-object v9, v9, Ll83/k;->x:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-eqz v10, :cond_7

    move-object v10, v9

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    const/4 v11, -0x1

    if-eq v10, v11, :cond_5

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v8

    new-instance v9, Lug1/j$f;

    invoke-direct {v9, v8, v7}, Lug1/j$f;-><init>(II)V

    iput-object v2, v1, Lug1/a$l;->G:Ljava/lang/Object;

    iput-object v6, v1, Lug1/a$l;->w:Ljava/lang/Object;

    iput-object v6, v1, Lug1/a$l;->x:Ljava/lang/Object;

    iput v8, v1, Lug1/a$l;->y:I

    iput v7, v1, Lug1/a$l;->z:I

    iput v0, v1, Lug1/a$l;->E:I

    const/4 v10, 0x4

    iput v10, v1, Lug1/a$l;->F:I

    invoke-interface {v2, v9, v1}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v3, :cond_4

    goto/16 :goto_9

    :cond_4
    :goto_5
    iget-object v9, v1, Lug1/a$l;->H:Lug1/a;

    invoke-static {v9}, Lug1/a;->j(Lug1/a;)Lsg1/a;

    move-result-object v9

    iget-object v10, v1, Lug1/a$l;->I:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    invoke-virtual {v10}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getSerial()Ljava/lang/String;

    move-result-object v10

    iget-object v11, v1, Lug1/a$l;->J:Ljava/lang/String;

    iput-object v2, v1, Lug1/a$l;->G:Ljava/lang/Object;

    iput-object v6, v1, Lug1/a$l;->w:Ljava/lang/Object;

    iput-object v6, v1, Lug1/a$l;->x:Ljava/lang/Object;

    iput v8, v1, Lug1/a$l;->y:I

    iput v7, v1, Lug1/a$l;->z:I

    iput v0, v1, Lug1/a$l;->E:I

    const/4 v12, 0x5

    iput v12, v1, Lug1/a$l;->F:I

    invoke-interface {v9, v10, v11, v8, v1}, Lsg1/a;->f(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v3, :cond_2

    goto/16 :goto_9

    :cond_5
    new-instance v9, Lug1/j$g;

    iget-object v10, v1, Lug1/a$l;->I:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    iget-object v11, v1, Lug1/a$l;->J:Ljava/lang/String;

    invoke-direct {v9, v10, v11}, Lug1/j$g;-><init>(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Ljava/lang/String;)V

    iput-object v2, v1, Lug1/a$l;->G:Ljava/lang/Object;

    iput-object v6, v1, Lug1/a$l;->w:Ljava/lang/Object;

    iput-object v6, v1, Lug1/a$l;->x:Ljava/lang/Object;

    iput v8, v1, Lug1/a$l;->y:I

    iput v7, v1, Lug1/a$l;->z:I

    iput v0, v1, Lug1/a$l;->E:I

    iput v4, v1, Lug1/a$l;->F:I

    invoke-interface {v2, v9, v1}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_6

    goto/16 :goto_9

    :cond_6
    move v4, v7

    move v7, v8

    :goto_6
    move v8, v7

    move v7, v4

    goto :goto_7

    :cond_7
    add-int/lit8 v0, v0, 0x1

    iget-object v9, v1, Lug1/a$l;->H:Lug1/a;

    invoke-virtual {v9}, Lug1/a;->h()Ltr2/n;

    move-result-object v9

    rsub-int/lit8 v10, v0, 0x6

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "No of retries left "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    new-array v11, v5, [Lqr2/a$a;

    invoke-interface {v9, v10, v11}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    goto/16 :goto_3

    :cond_8
    new-instance v4, Lug1/j$b;

    iget-object v9, v1, Lug1/a$l;->I:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    iget-object v10, v1, Lug1/a$l;->J:Ljava/lang/String;

    sget-object v11, Lgt0/f$c;->b:Lgt0/f$c;

    invoke-direct {v4, v9, v10, v11}, Lug1/j$b;-><init>(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Ljava/lang/String;Lgt0/f;)V

    iput-object v2, v1, Lug1/a$l;->G:Ljava/lang/Object;

    iput-object v6, v1, Lug1/a$l;->w:Ljava/lang/Object;

    iput-object v6, v1, Lug1/a$l;->x:Ljava/lang/Object;

    iput v8, v1, Lug1/a$l;->y:I

    iput v7, v1, Lug1/a$l;->z:I

    iput v0, v1, Lug1/a$l;->E:I

    const/4 v9, 0x7

    iput v9, v1, Lug1/a$l;->F:I

    invoke-interface {v2, v4, v1}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_6

    goto/16 :goto_9

    :cond_9
    :goto_7
    iget-object v4, v1, Lug1/a$l;->H:Lug1/a;

    invoke-static {v4}, Lug1/a;->k(Lug1/a;)Lug1/g;

    move-result-object v4

    iput-object v2, v1, Lug1/a$l;->G:Ljava/lang/Object;

    iput-object v6, v1, Lug1/a$l;->w:Ljava/lang/Object;

    iput-object v6, v1, Lug1/a$l;->x:Ljava/lang/Object;

    iput v8, v1, Lug1/a$l;->y:I

    iput v7, v1, Lug1/a$l;->z:I

    iput v0, v1, Lug1/a$l;->E:I

    const/16 v0, 0x8

    iput v0, v1, Lug1/a$l;->F:I

    invoke-interface {v4, v1}, Lug1/g;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_c

    goto/16 :goto_9

    :cond_a
    iget-object v0, v1, Lug1/a$l;->H:Lug1/a;

    invoke-virtual {v0}, Lug1/a;->h()Ltr2/n;

    move-result-object v0

    const-string v4, "Firmware file not found"

    new-array v7, v5, [Lqr2/a$a;

    invoke-interface {v0, v4, v7}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lug1/j$b;

    iget-object v4, v1, Lug1/a$l;->I:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    iget-object v7, v1, Lug1/a$l;->J:Ljava/lang/String;

    sget-object v8, Lgt0/f$b;->b:Lgt0/f$b;

    invoke-direct {v0, v4, v7, v8}, Lug1/j$b;-><init>(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Ljava/lang/String;Lgt0/f;)V

    iput-object v2, v1, Lug1/a$l;->G:Ljava/lang/Object;

    iput-object v6, v1, Lug1/a$l;->w:Ljava/lang/Object;

    const/16 v4, 0x9

    iput v4, v1, Lug1/a$l;->F:I

    invoke-interface {v2, v0, v1}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    if-ne v0, v3, :cond_c

    goto :goto_9

    :goto_8
    instance-of v4, v0, Lcom/whoop/taskexecutor/TaskInterruptedException;

    if-nez v4, :cond_b

    iget-object v4, v1, Lug1/a$l;->H:Lug1/a;

    invoke-static {v4}, Lug1/a;->g(Lug1/a;)Lgt0/d;

    move-result-object v7

    sget-object v8, Lgt0/b;->BINARY_TRANSFER:Lgt0/b;

    sget-object v9, Lgt0/c;->FAILURE:Lgt0/c;

    sget-object v10, Lgt0/a;->RETRY:Lgt0/a;

    iget-object v4, v1, Lug1/a$l;->H:Lug1/a;

    invoke-static {v4}, Lug1/a;->n(Lug1/a;)Ljava/lang/String;

    move-result-object v11

    iget-object v12, v1, Lug1/a$l;->J:Ljava/lang/String;

    const/16 v14, 0x20

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-static/range {v7 .. v15}, Lgt0/d;->a(Lgt0/d;Lgt0/b;Lgt0/c;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_b
    iget-object v4, v1, Lug1/a$l;->H:Lug1/a;

    invoke-virtual {v4}, Lug1/a;->h()Ltr2/n;

    move-result-object v4

    const-string v7, "sendFwPackets Exception >> "

    invoke-static {v0, v7}, Lb9/y;->j(Ljava/lang/Exception;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-array v5, v5, [Lqr2/a$a;

    invoke-interface {v4, v7, v5}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    const-string v4, "exception is "

    invoke-static {v0, v4}, Lb9/y;->j(Ljava/lang/Exception;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v4, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    new-instance v0, Lug1/j$b;

    iget-object v4, v1, Lug1/a$l;->I:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    iget-object v5, v1, Lug1/a$l;->J:Ljava/lang/String;

    sget-object v7, Lgt0/f$c;->b:Lgt0/f$c;

    invoke-direct {v0, v4, v5, v7}, Lug1/j$b;-><init>(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Ljava/lang/String;Lgt0/f;)V

    iput-object v6, v1, Lug1/a$l;->G:Ljava/lang/Object;

    iput-object v6, v1, Lug1/a$l;->w:Ljava/lang/Object;

    iput-object v6, v1, Lug1/a$l;->x:Ljava/lang/Object;

    const/16 v4, 0xa

    iput v4, v1, Lug1/a$l;->F:I

    invoke-interface {v2, v0, v1}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_c

    :goto_9
    return-object v3

    :cond_c
    :goto_a
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
