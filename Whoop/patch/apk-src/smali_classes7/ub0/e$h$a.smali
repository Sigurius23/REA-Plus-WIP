.class public final Lub0/e$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lub0/e$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field final synthetic x:Lub0/e;


# direct methods
.method public constructor <init>(Lec3/m;Lub0/e;)V
    .locals 0

    iput-object p2, p0, Lub0/e$h$a;->x:Lub0/e;

    iput-object p1, p0, Lub0/e$h$a;->w:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lub0/e$h$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lub0/e$h$a$a;

    iget v1, v0, Lub0/e$h$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lub0/e$h$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lub0/e$h$a$a;

    invoke-direct {v0, p0, p2}, Lub0/e$h$a$a;-><init>(Lub0/e$h$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lub0/e$h$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lub0/e$h$a$a;->x:I

    const/4 v3, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object p1, v0, Lub0/e$h$a$a;->I:Ljava/lang/Object;

    check-cast p1, Lub0/d;

    goto :goto_1

    :pswitch_1
    iget p1, v0, Lub0/e$h$a$a;->L:I

    iget-object v2, v0, Lub0/e$h$a$a;->H:Ljava/lang/Object;

    check-cast v2, Lub0/e$b;

    iget-object v2, v0, Lub0/e$h$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lub0/e$a;

    iget-object v2, v0, Lub0/e$h$a$a;->F:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Lub0/e$h$a$a;->E:Ljava/lang/Object;

    check-cast v4, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_2
    iget-object p1, v0, Lub0/e$h$a$a;->K:Ljava/lang/Object;

    check-cast p1, Lub0/d;

    iget-object p1, v0, Lub0/e$h$a$a;->J:Ljava/lang/Object;

    check-cast p1, Lub0/a;

    iget-object p1, v0, Lub0/e$h$a$a;->I:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersRequest;

    :goto_1
    :pswitch_3
    iget-object p1, v0, Lub0/e$h$a$a;->H:Ljava/lang/Object;

    check-cast p1, Lub0/e$b;

    iget-object p1, v0, Lub0/e$h$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lub0/e$a;

    iget-object p1, v0, Lub0/e$h$a$a;->F:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lub0/e$h$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_4
    iget p1, v0, Lub0/e$h$a$a;->L:I

    iget-object v2, v0, Lub0/e$h$a$a;->J:Ljava/lang/Object;

    check-cast v2, Lub0/a;

    iget-object v2, v0, Lub0/e$h$a$a;->I:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersRequest;

    iget-object v2, v0, Lub0/e$h$a$a;->H:Ljava/lang/Object;

    check-cast v2, Lub0/e$b;

    iget-object v2, v0, Lub0/e$h$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lub0/e$a;

    iget-object v2, v0, Lub0/e$h$a$a;->F:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Lub0/e$h$a$a;->E:Ljava/lang/Object;

    check-cast v4, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_5
    iget p1, v0, Lub0/e$h$a$a;->L:I

    iget-object v2, v0, Lub0/e$h$a$a;->J:Ljava/lang/Object;

    check-cast v2, Lub0/a;

    iget-object v2, v0, Lub0/e$h$a$a;->I:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersRequest;

    iget-object v2, v0, Lub0/e$h$a$a;->H:Ljava/lang/Object;

    check-cast v2, Lub0/e$b;

    iget-object v2, v0, Lub0/e$h$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lub0/e$a;

    iget-object v2, v0, Lub0/e$h$a$a;->F:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Lub0/e$h$a$a;->E:Ljava/lang/Object;

    check-cast v4, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_6
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, Lub0/e$h$a;->w:Lec3/m;

    check-cast p1, Ll83/k;

    iget-object p2, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast p2, Lub0/e$a;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Lub0/e$b;

    instance-of v4, p1, Lub0/e$b$c;

    const/4 v5, 0x0

    if-eqz v4, :cond_8

    check-cast p1, Lub0/e$b$c;

    invoke-virtual {p1}, Lub0/e$b$c;->a()Lub0/c;

    move-result-object p1

    instance-of v4, p1, Lub0/c$d;

    if-nez v4, :cond_7

    instance-of v4, p1, Lub0/c$b;

    if-nez v4, :cond_7

    instance-of v4, p1, Lub0/c$f;

    if-eqz v4, :cond_1

    goto/16 :goto_6

    :cond_1
    instance-of v4, p1, Lub0/c$e;

    if-eqz v4, :cond_5

    iget-object p1, p0, Lub0/e$h$a;->x:Lub0/e;

    invoke-virtual {p2}, Lub0/e$a;->c()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    invoke-static {p1, v4}, Lub0/e;->j(Lub0/e;Ljava/util/List;)Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersRequest;

    move-result-object p1

    iget-object v4, p0, Lub0/e$h$a;->x:Lub0/e;

    invoke-virtual {p2}, Lub0/e$a;->e()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v6}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {p2}, Lub0/e$a;->c()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    invoke-static {v7}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v7

    invoke-static {v4, v6, v7}, Lub0/e;->c(Lub0/e;Ljava/util/List;Ljava/util/List;)Lub0/a;

    move-result-object v4

    invoke-virtual {p2}, Lub0/e$a;->g()Z

    move-result v6

    if-eqz v6, :cond_3

    iget-object v6, p0, Lub0/e$h$a;->x:Lub0/e;

    invoke-virtual {p2}, Lub0/e$a;->d()Ljava/lang/String;

    move-result-object p2

    iput-object v3, v0, Lub0/e$h$a$a;->z:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->E:Ljava/lang/Object;

    iput-object v2, v0, Lub0/e$h$a$a;->F:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->G:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->H:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->I:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->J:Ljava/lang/Object;

    iput v5, v0, Lub0/e$h$a$a;->L:I

    const/4 v7, 0x2

    iput v7, v0, Lub0/e$h$a$a;->x:I

    invoke-static {v6, p2, p1, v4, v0}, Lub0/e;->d(Lub0/e;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersRequest;Lub0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_2

    goto/16 :goto_7

    :cond_2
    move p1, v5

    :goto_2
    check-cast p2, Lub0/d;

    goto :goto_4

    :cond_3
    iget-object v6, p0, Lub0/e$h$a;->x:Lub0/e;

    invoke-virtual {p2}, Lub0/e$a;->d()Ljava/lang/String;

    move-result-object p2

    iput-object v3, v0, Lub0/e$h$a$a;->z:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->E:Ljava/lang/Object;

    iput-object v2, v0, Lub0/e$h$a$a;->F:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->G:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->H:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->I:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->J:Ljava/lang/Object;

    iput v5, v0, Lub0/e$h$a$a;->L:I

    const/4 v7, 0x3

    iput v7, v0, Lub0/e$h$a$a;->x:I

    invoke-static {v6, p2, p1, v4, v0}, Lub0/e;->l(Lub0/e;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersRequest;Lub0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto/16 :goto_7

    :cond_4
    move p1, v5

    :goto_3
    check-cast p2, Lub0/d;

    :goto_4
    iput-object v3, v0, Lub0/e$h$a$a;->z:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->E:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->F:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->G:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->H:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->I:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->J:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->K:Ljava/lang/Object;

    iput p1, v0, Lub0/e$h$a$a;->L:I

    const/4 p1, 0x4

    iput p1, v0, Lub0/e$h$a$a;->x:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto/16 :goto_7

    :cond_5
    instance-of p1, p1, Lub0/c$a;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lub0/e$h$a;->x:Lub0/e;

    invoke-virtual {p2}, Lub0/e$a;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Lub0/e$a;->g()Z

    move-result p2

    iput-object v3, v0, Lub0/e$h$a$a;->z:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->E:Ljava/lang/Object;

    iput-object v2, v0, Lub0/e$h$a$a;->F:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->G:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->H:Ljava/lang/Object;

    iput v5, v0, Lub0/e$h$a$a;->L:I

    const/4 v6, 0x5

    iput v6, v0, Lub0/e$h$a$a;->x:I

    invoke-static {p1, v4, p2, v0}, Lub0/e;->f(Lub0/e;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto :goto_7

    :cond_6
    move p1, v5

    :goto_5
    check-cast p2, Lub0/d;

    iput-object v3, v0, Lub0/e$h$a$a;->z:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->E:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->F:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->G:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->H:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->I:Ljava/lang/Object;

    iput p1, v0, Lub0/e$h$a$a;->L:I

    const/4 p1, 0x6

    iput p1, v0, Lub0/e$h$a$a;->x:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto :goto_7

    :cond_7
    :goto_6
    iget-object p1, p0, Lub0/e$h$a;->x:Lub0/e;

    invoke-static {p1, p2}, Lub0/e;->e(Lub0/e;Lub0/e$a;)Lub0/d;

    move-result-object p1

    iput-object v3, v0, Lub0/e$h$a$a;->z:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->E:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->F:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->G:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->H:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->I:Ljava/lang/Object;

    iput v5, v0, Lub0/e$h$a$a;->L:I

    const/4 p2, 0x1

    iput p2, v0, Lub0/e$h$a$a;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto :goto_7

    :cond_8
    instance-of p2, p1, Lub0/e$b$a;

    if-eqz p2, :cond_9

    check-cast p1, Lub0/e$b$a;

    invoke-virtual {p1}, Lub0/e$b$a;->a()Lub0/d;

    move-result-object p1

    iput-object v3, v0, Lub0/e$h$a$a;->z:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->E:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->F:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->G:Ljava/lang/Object;

    iput-object v3, v0, Lub0/e$h$a$a;->H:Ljava/lang/Object;

    iput v5, v0, Lub0/e$h$a$a;->L:I

    const/4 p2, 0x7

    iput p2, v0, Lub0/e$h$a$a;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_7
    return-object v1

    :cond_9
    :goto_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method
