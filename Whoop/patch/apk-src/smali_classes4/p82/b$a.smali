.class final Lp82/b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp82/b;->i(Ldt0/c;)Lec3/l;
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
        "Lp82/c;",
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
    c = "com.whoop.sensorDataUpload.SensorDataUploadInteractor$upload$1"
    f = "SensorDataUploadInteractor.kt"
    l = {
        0x24,
        0x26,
        0x27,
        0x29,
        0x2f,
        0x2f,
        0x31,
        0x36
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field private synthetic G:Ljava/lang/Object;

.field final synthetic H:Ldt0/c;

.field final synthetic I:Lp82/b;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Ldt0/c;Lp82/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt0/c;",
            "Lp82/b;",
            "Lq83/d<",
            "-",
            "Lp82/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lp82/b$a;->H:Ldt0/c;

    iput-object p2, p0, Lp82/b$a;->I:Lp82/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Lp82/b$a;

    iget-object v1, p0, Lp82/b$a;->H:Ldt0/c;

    iget-object v2, p0, Lp82/b$a;->I:Lp82/b;

    invoke-direct {v0, v1, v2, p2}, Lp82/b$a;-><init>(Ldt0/c;Lp82/b;Lq83/d;)V

    iput-object p1, v0, Lp82/b$a;->G:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lp82/b$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp82/b$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp82/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lp82/b$a;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lp82/b$a;->G:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lp82/b$a;->F:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lp82/b$a;->x:Ljava/lang/Object;

    check-cast v0, Lp82/c;

    iget-object v0, p0, Lp82/b$a;->w:Ljava/lang/Object;

    check-cast v0, Lbi2/c;

    goto :goto_0

    :pswitch_1
    iget v2, p0, Lp82/b$a;->E:I

    iget v6, p0, Lp82/b$a;->z:I

    iget-object v7, p0, Lp82/b$a;->x:Ljava/lang/Object;

    check-cast v7, Lp82/c;

    iget-object v8, p0, Lp82/b$a;->w:Ljava/lang/Object;

    check-cast v8, Lbi2/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_2
    iget v2, p0, Lp82/b$a;->E:I

    iget v6, p0, Lp82/b$a;->z:I

    iget-object v7, p0, Lp82/b$a;->x:Ljava/lang/Object;

    check-cast v7, Lp82/c;

    iget-object v7, p0, Lp82/b$a;->w:Ljava/lang/Object;

    check-cast v7, Lbi2/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v8, v7

    goto/16 :goto_6

    :pswitch_3
    iget v2, p0, Lp82/b$a;->E:I

    iget v6, p0, Lp82/b$a;->z:I

    iget-object v7, p0, Lp82/b$a;->y:Ljava/lang/Object;

    check-cast v7, Lp82/b;

    iget-object v8, p0, Lp82/b$a;->x:Ljava/lang/Object;

    check-cast v8, Lp82/c;

    iget-object v8, p0, Lp82/b$a;->w:Ljava/lang/Object;

    check-cast v8, Lbi2/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_4
    iget-object v2, p0, Lp82/b$a;->x:Ljava/lang/Object;

    check-cast v2, Lp82/c;

    iget-object v6, p0, Lp82/b$a;->w:Ljava/lang/Object;

    check-cast v6, Lbi2/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_5
    iget-object v2, p0, Lp82/b$a;->w:Ljava/lang/Object;

    check-cast v2, Lbi2/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, v2

    goto :goto_2

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :goto_0
    :pswitch_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_8
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lp82/b$a;->H:Ldt0/c;

    invoke-virtual {p1}, Ldt0/c;->e()Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    move-result-object p1

    sget-object v2, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->NONE:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    if-ne p1, v2, :cond_0

    sget-object p1, Lp82/c$c;->a:Lp82/c$c;

    iput-object v5, p0, Lp82/b$a;->G:Ljava/lang/Object;

    iput v4, p0, Lp82/b$a;->F:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto/16 :goto_8

    :cond_0
    iget-object p1, p0, Lp82/b$a;->I:Lp82/b;

    invoke-static {p1}, Lp82/b;->a(Lp82/b;)Lbi2/d;

    move-result-object p1

    iput-object v0, p0, Lp82/b$a;->G:Ljava/lang/Object;

    const/4 v2, 0x2

    iput v2, p0, Lp82/b$a;->F:I

    invoke-interface {p1, p0}, Lbi2/d;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto/16 :goto_8

    :cond_1
    :goto_1
    check-cast p1, Lbi2/c;

    iget-object v2, p0, Lp82/b$a;->I:Lp82/b;

    iput-object v0, p0, Lp82/b$a;->G:Ljava/lang/Object;

    iput-object p1, p0, Lp82/b$a;->w:Ljava/lang/Object;

    const/4 v6, 0x3

    iput v6, p0, Lp82/b$a;->F:I

    invoke-static {v2, p1, p0}, Lp82/b;->d(Lp82/b;Lbi2/c;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    goto/16 :goto_8

    :cond_2
    move-object v6, p1

    move-object p1, v2

    :goto_2
    move-object v2, p1

    check-cast v2, Lp82/c;

    instance-of p1, v2, Lp82/c$b;

    if-eqz p1, :cond_3

    iput-object v0, p0, Lp82/b$a;->G:Ljava/lang/Object;

    iput-object v6, p0, Lp82/b$a;->w:Ljava/lang/Object;

    iput-object v2, p0, Lp82/b$a;->x:Ljava/lang/Object;

    const/4 p1, 0x4

    iput p1, p0, Lp82/b$a;->F:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto/16 :goto_8

    :cond_3
    :goto_3
    instance-of p1, v6, Lbi2/c$c;

    if-eqz p1, :cond_8

    iget-object p1, p0, Lp82/b$a;->I:Lp82/b;

    invoke-static {p1}, Lp82/b;->b(Lp82/b;)Ltr2/n;

    move-result-object p1

    const-string v7, "More data in DB that should upload"

    new-array v8, v3, [Lqr2/a$a;

    invoke-interface {p1, v7, v8}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    move-object p1, v6

    check-cast p1, Lbi2/c$c;

    invoke-virtual {p1}, Lbi2/c$c;->b()I

    move-result p1

    move-object v8, v2

    move v2, p1

    move-object p1, v8

    move-object v8, v6

    move v6, v3

    :goto_4
    if-ge v6, v2, :cond_7

    iget-object p1, p0, Lp82/b$a;->I:Lp82/b;

    invoke-static {p1}, Lp82/b;->b(Lp82/b;)Ltr2/n;

    move-result-object p1

    add-int/lit8 v7, v6, 0x1

    move-object v9, v8

    check-cast v9, Lbi2/c$c;

    invoke-virtual {v9}, Lbi2/c$c;->b()I

    move-result v9

    const-string v10, "Upload attempt "

    const-string v11, " of "

    invoke-static {v7, v9, v10, v11}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-array v9, v3, [Lqr2/a$a;

    invoke-interface {p1, v7, v9}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v7, p0, Lp82/b$a;->I:Lp82/b;

    invoke-static {v7}, Lp82/b;->a(Lp82/b;)Lbi2/d;

    move-result-object p1

    iput-object v0, p0, Lp82/b$a;->G:Ljava/lang/Object;

    iput-object v8, p0, Lp82/b$a;->w:Ljava/lang/Object;

    iput-object v5, p0, Lp82/b$a;->x:Ljava/lang/Object;

    iput-object v7, p0, Lp82/b$a;->y:Ljava/lang/Object;

    iput v6, p0, Lp82/b$a;->z:I

    iput v2, p0, Lp82/b$a;->E:I

    const/4 v9, 0x5

    iput v9, p0, Lp82/b$a;->F:I

    invoke-interface {p1, p0}, Lbi2/d;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_8

    :cond_4
    :goto_5
    check-cast p1, Lbi2/c;

    iput-object v0, p0, Lp82/b$a;->G:Ljava/lang/Object;

    iput-object v8, p0, Lp82/b$a;->w:Ljava/lang/Object;

    iput-object v5, p0, Lp82/b$a;->x:Ljava/lang/Object;

    iput-object v5, p0, Lp82/b$a;->y:Ljava/lang/Object;

    iput v6, p0, Lp82/b$a;->z:I

    iput v2, p0, Lp82/b$a;->E:I

    const/4 v9, 0x6

    iput v9, p0, Lp82/b$a;->F:I

    invoke-static {v7, p1, p0}, Lp82/b;->d(Lp82/b;Lbi2/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_8

    :cond_5
    :goto_6
    move-object v7, p1

    check-cast v7, Lp82/c;

    instance-of p1, v7, Lp82/c$b;

    if-eqz p1, :cond_6

    iput-object v0, p0, Lp82/b$a;->G:Ljava/lang/Object;

    iput-object v8, p0, Lp82/b$a;->w:Ljava/lang/Object;

    iput-object v7, p0, Lp82/b$a;->x:Ljava/lang/Object;

    iput v6, p0, Lp82/b$a;->z:I

    iput v2, p0, Lp82/b$a;->E:I

    const/4 p1, 0x7

    iput p1, p0, Lp82/b$a;->F:I

    invoke-interface {v0, v7, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_8

    :cond_6
    :goto_7
    move-object p1, v7

    add-int/2addr v6, v4

    goto :goto_4

    :cond_7
    move-object v2, p1

    :cond_8
    iget-object p1, p0, Lp82/b$a;->I:Lp82/b;

    invoke-static {p1}, Lp82/b;->e(Lp82/b;)V

    iput-object v5, p0, Lp82/b$a;->G:Ljava/lang/Object;

    iput-object v5, p0, Lp82/b$a;->w:Ljava/lang/Object;

    iput-object v5, p0, Lp82/b$a;->x:Ljava/lang/Object;

    const/16 p1, 0x8

    iput p1, p0, Lp82/b$a;->F:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_8
    return-object v1

    :cond_9
    :goto_9
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

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
