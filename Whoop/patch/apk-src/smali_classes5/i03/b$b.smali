.class final Li03/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li03/b;->c(Lq83/d;)Ljava/lang/Object;
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
.field final synthetic w:Li03/b;


# direct methods
.method public constructor <init>(Li03/b;)V
    .locals 0

    iput-object p1, p0, Li03/b$b;->w:Li03/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/whoop/domain/model/Logout;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/domain/model/Logout;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p1, p2, Li03/b$b$g;

    if-eqz p1, :cond_0

    move-object p1, p2

    check-cast p1, Li03/b$b$g;

    iget v0, p1, Li03/b$b$g;->L:I

    const/high16 v1, -0x80000000

    and-int v2, v0, v1

    if-eqz v2, :cond_0

    sub-int/2addr v0, v1

    iput v0, p1, Li03/b$b$g;->L:I

    goto :goto_0

    :cond_0
    new-instance p1, Li03/b$b$g;

    invoke-direct {p1, p0, p2}, Li03/b$b$g;-><init>(Li03/b$b;Lq83/d;)V

    :goto_0
    iget-object p2, p1, Li03/b$b$g;->J:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p1, Li03/b$b$g;->L:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object p1, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/domain/model/Logout;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_14

    :pswitch_1
    iget-object v1, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/Logout;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_12

    :pswitch_2
    iget-object v1, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/Logout;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_11

    :pswitch_3
    iget-object v1, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/Logout;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_10

    :pswitch_4
    iget-object v1, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/Logout;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_f

    :pswitch_5
    iget-object v1, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/Logout;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_e

    :pswitch_6
    iget-object v1, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/Logout;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_d

    :pswitch_7
    iget v1, p1, Li03/b$b$g;->H:I

    iget-object v4, p1, Li03/b$b$g;->G:Ljava/lang/Object;

    check-cast v4, Ln6/l;

    iget-object v4, p1, Li03/b$b$g;->E:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v5, p1, Li03/b$b$g;->z:Ljava/lang/Object;

    check-cast v5, Li03/b;

    iget-object v6, p1, Li03/b$b$g;->y:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    iget-object v6, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v6, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    check-cast v6, Lcom/whoop/domain/model/Logout;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_8
    iget-object v1, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/Logout;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_9
    iget v1, p1, Li03/b$b$g;->H:I

    iget-object v4, p1, Li03/b$b$g;->G:Ljava/lang/Object;

    check-cast v4, Ln6/l;

    iget-object v4, p1, Li03/b$b$g;->E:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v5, p1, Li03/b$b$g;->z:Ljava/lang/Object;

    check-cast v5, Li03/b;

    iget-object v6, p1, Li03/b$b$g;->y:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    iget-object v6, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    check-cast v7, Lcom/whoop/domain/model/Logout;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :pswitch_a
    iget-object v1, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v4, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/domain/model/Logout;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_b
    iget v1, p1, Li03/b$b$g;->H:I

    iget-object v4, p1, Li03/b$b$g;->G:Ljava/lang/Object;

    check-cast v4, Ln6/l;

    iget-object v4, p1, Li03/b$b$g;->E:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v5, p1, Li03/b$b$g;->z:Ljava/lang/Object;

    check-cast v5, Li03/b;

    iget-object v6, p1, Li03/b$b$g;->y:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    iget-object v6, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    check-cast v7, Lcom/whoop/domain/model/Logout;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move p2, v1

    move-object v1, v6

    goto/16 :goto_8

    :pswitch_c
    iget-object v1, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v4, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/domain/model/Logout;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_d
    iget v1, p1, Li03/b$b$g;->H:I

    iget-object v4, p1, Li03/b$b$g;->G:Ljava/lang/Object;

    check-cast v4, Ln6/l;

    iget-object v4, p1, Li03/b$b$g;->E:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v5, p1, Li03/b$b$g;->z:Ljava/lang/Object;

    check-cast v5, Li03/b;

    iget-object v6, p1, Li03/b$b$g;->y:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    iget-object v6, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    check-cast v7, Lcom/whoop/domain/model/Logout;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move p2, v1

    move-object v1, v6

    goto/16 :goto_6

    :pswitch_e
    iget-object v1, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v4, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/domain/model/Logout;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_f
    iget v1, p1, Li03/b$b$g;->H:I

    iget-object v4, p1, Li03/b$b$g;->G:Ljava/lang/Object;

    check-cast v4, Ln6/l;

    iget-object v4, p1, Li03/b$b$g;->E:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v5, p1, Li03/b$b$g;->z:Ljava/lang/Object;

    check-cast v5, Li03/b;

    iget-object v6, p1, Li03/b$b$g;->y:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    iget-object v6, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    check-cast v7, Lcom/whoop/domain/model/Logout;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move p2, v1

    move-object v1, v6

    goto/16 :goto_4

    :pswitch_10
    iget-object v1, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v4, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/domain/model/Logout;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_11
    iget v1, p1, Li03/b$b$g;->H:I

    iget-object v4, p1, Li03/b$b$g;->G:Ljava/lang/Object;

    check-cast v4, Ln6/l;

    iget-object v4, p1, Li03/b$b$g;->E:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v5, p1, Li03/b$b$g;->z:Ljava/lang/Object;

    check-cast v5, Li03/b;

    iget-object v6, p1, Li03/b$b$g;->y:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    iget-object v6, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    check-cast v7, Lcom/whoop/domain/model/Logout;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move p2, v1

    move-object v1, v6

    goto :goto_2

    :pswitch_12
    iget-object v1, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v4, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/domain/model/Logout;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_13
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Li03/b$b;->w:Li03/b;

    invoke-static {p2}, Li03/b;->a(Li03/b;)Landroid/content/Context;

    move-result-object p2

    sget v1, Ld03/b;->a:I

    invoke-virtual {p2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string p2, "getString(...)"

    invoke-static {v1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lp6/n0;

    iget-object v4, p0, Li03/b$b;->w:Li03/b;

    invoke-static {v4}, Li03/b;->a(Li03/b;)Landroid/content/Context;

    move-result-object v4

    invoke-direct {p2, v4}, Lp6/n0;-><init>(Landroid/content/Context;)V

    iput-object v3, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    iput-object v1, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, p1, Li03/b$b$g;->L:I

    const-class v4, Ln03/f;

    invoke-virtual {p2, v4, p1}, Lp6/n0;->b(Ljava/lang/Class;Lq83/d;)Ljava/io/Serializable;

    move-result-object p2

    if-ne p2, v0, :cond_1

    goto/16 :goto_13

    :cond_1
    :goto_1
    check-cast p2, Ljava/lang/Iterable;

    iget-object v4, p0, Li03/b$b;->w:Li03/b;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v5, v4

    move-object v4, p2

    move p2, v2

    :cond_2
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ln6/l;

    invoke-static {v5}, Li03/b;->a(Li03/b;)Landroid/content/Context;

    move-result-object v7

    new-instance v8, Li03/b$b$a;

    invoke-direct {v8, v3}, Li03/b$b$a;-><init>(Lq83/d;)V

    iput-object v3, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    iput-object v1, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->y:Ljava/lang/Object;

    iput-object v5, p1, Li03/b$b$g;->z:Ljava/lang/Object;

    iput-object v4, p1, Li03/b$b$g;->E:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->F:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->G:Ljava/lang/Object;

    iput p2, p1, Li03/b$b$g;->H:I

    iput v2, p1, Li03/b$b$g;->I:I

    const/4 v9, 0x2

    iput v9, p1, Li03/b$b$g;->L:I

    invoke-static {v7, v6, v8, p1}, Ls6/a;->k(Landroid/content/Context;Ln6/l;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_2

    goto/16 :goto_13

    :cond_3
    new-instance p2, Lp6/n0;

    iget-object v4, p0, Li03/b$b;->w:Li03/b;

    invoke-static {v4}, Li03/b;->a(Li03/b;)Landroid/content/Context;

    move-result-object v4

    invoke-direct {p2, v4}, Lp6/n0;-><init>(Landroid/content/Context;)V

    iput-object v3, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    iput-object v1, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->y:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->z:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->E:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->F:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->G:Ljava/lang/Object;

    const/4 v4, 0x3

    iput v4, p1, Li03/b$b$g;->L:I

    const-class v4, Ln03/g;

    invoke-virtual {p2, v4, p1}, Lp6/n0;->b(Ljava/lang/Class;Lq83/d;)Ljava/io/Serializable;

    move-result-object p2

    if-ne p2, v0, :cond_4

    goto/16 :goto_13

    :cond_4
    :goto_3
    check-cast p2, Ljava/lang/Iterable;

    iget-object v4, p0, Li03/b$b;->w:Li03/b;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v5, v4

    move-object v4, p2

    move p2, v2

    :cond_5
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ln6/l;

    invoke-static {v5}, Li03/b;->a(Li03/b;)Landroid/content/Context;

    move-result-object v7

    new-instance v8, Li03/b$b$b;

    invoke-direct {v8, v1, v3}, Li03/b$b$b;-><init>(Ljava/lang/String;Lq83/d;)V

    iput-object v3, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    iput-object v1, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->y:Ljava/lang/Object;

    iput-object v5, p1, Li03/b$b$g;->z:Ljava/lang/Object;

    iput-object v4, p1, Li03/b$b$g;->E:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->F:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->G:Ljava/lang/Object;

    iput p2, p1, Li03/b$b$g;->H:I

    iput v2, p1, Li03/b$b$g;->I:I

    const/4 v9, 0x4

    iput v9, p1, Li03/b$b$g;->L:I

    invoke-static {v7, v6, v8, p1}, Ls6/a;->k(Landroid/content/Context;Ln6/l;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_5

    goto/16 :goto_13

    :cond_6
    new-instance p2, Lp6/n0;

    iget-object v4, p0, Li03/b$b;->w:Li03/b;

    invoke-static {v4}, Li03/b;->a(Li03/b;)Landroid/content/Context;

    move-result-object v4

    invoke-direct {p2, v4}, Lp6/n0;-><init>(Landroid/content/Context;)V

    iput-object v3, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    iput-object v1, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->y:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->z:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->E:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->F:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->G:Ljava/lang/Object;

    const/4 v4, 0x5

    iput v4, p1, Li03/b$b$g;->L:I

    const-class v4, Ln03/i;

    invoke-virtual {p2, v4, p1}, Lp6/n0;->b(Ljava/lang/Class;Lq83/d;)Ljava/io/Serializable;

    move-result-object p2

    if-ne p2, v0, :cond_7

    goto/16 :goto_13

    :cond_7
    :goto_5
    check-cast p2, Ljava/lang/Iterable;

    iget-object v4, p0, Li03/b$b;->w:Li03/b;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v5, v4

    move-object v4, p2

    move p2, v2

    :cond_8
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ln6/l;

    invoke-static {v5}, Li03/b;->a(Li03/b;)Landroid/content/Context;

    move-result-object v7

    new-instance v8, Li03/b$b$c;

    invoke-direct {v8, v1, v3}, Li03/b$b$c;-><init>(Ljava/lang/String;Lq83/d;)V

    iput-object v3, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    iput-object v1, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->y:Ljava/lang/Object;

    iput-object v5, p1, Li03/b$b$g;->z:Ljava/lang/Object;

    iput-object v4, p1, Li03/b$b$g;->E:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->F:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->G:Ljava/lang/Object;

    iput p2, p1, Li03/b$b$g;->H:I

    iput v2, p1, Li03/b$b$g;->I:I

    const/4 v9, 0x6

    iput v9, p1, Li03/b$b$g;->L:I

    invoke-static {v7, v6, v8, p1}, Ls6/a;->k(Landroid/content/Context;Ln6/l;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_8

    goto/16 :goto_13

    :cond_9
    new-instance p2, Lp6/n0;

    iget-object v4, p0, Li03/b$b;->w:Li03/b;

    invoke-static {v4}, Li03/b;->a(Li03/b;)Landroid/content/Context;

    move-result-object v4

    invoke-direct {p2, v4}, Lp6/n0;-><init>(Landroid/content/Context;)V

    iput-object v3, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    iput-object v1, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->y:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->z:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->E:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->F:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->G:Ljava/lang/Object;

    const/4 v4, 0x7

    iput v4, p1, Li03/b$b$g;->L:I

    const-class v4, Ln03/h;

    invoke-virtual {p2, v4, p1}, Lp6/n0;->b(Ljava/lang/Class;Lq83/d;)Ljava/io/Serializable;

    move-result-object p2

    if-ne p2, v0, :cond_a

    goto/16 :goto_13

    :cond_a
    :goto_7
    check-cast p2, Ljava/lang/Iterable;

    iget-object v4, p0, Li03/b$b;->w:Li03/b;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v5, v4

    move-object v4, p2

    move p2, v2

    :cond_b
    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ln6/l;

    invoke-static {v5}, Li03/b;->a(Li03/b;)Landroid/content/Context;

    move-result-object v7

    new-instance v8, Li03/b$b$d;

    invoke-direct {v8, v1, v3}, Li03/b$b$d;-><init>(Ljava/lang/String;Lq83/d;)V

    iput-object v3, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    iput-object v1, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->y:Ljava/lang/Object;

    iput-object v5, p1, Li03/b$b$g;->z:Ljava/lang/Object;

    iput-object v4, p1, Li03/b$b$g;->E:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->F:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->G:Ljava/lang/Object;

    iput p2, p1, Li03/b$b$g;->H:I

    iput v2, p1, Li03/b$b$g;->I:I

    const/16 v9, 0x8

    iput v9, p1, Li03/b$b$g;->L:I

    invoke-static {v7, v6, v8, p1}, Ls6/a;->k(Landroid/content/Context;Ln6/l;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_b

    goto/16 :goto_13

    :cond_c
    new-instance p2, Lp6/n0;

    iget-object v4, p0, Li03/b$b;->w:Li03/b;

    invoke-static {v4}, Li03/b;->a(Li03/b;)Landroid/content/Context;

    move-result-object v4

    invoke-direct {p2, v4}, Lp6/n0;-><init>(Landroid/content/Context;)V

    iput-object v3, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    iput-object v1, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->y:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->z:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->E:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->F:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->G:Ljava/lang/Object;

    const/16 v4, 0x9

    iput v4, p1, Li03/b$b$g;->L:I

    const-class v4, Lk03/c;

    invoke-virtual {p2, v4, p1}, Lp6/n0;->b(Ljava/lang/Class;Lq83/d;)Ljava/io/Serializable;

    move-result-object p2

    if-ne p2, v0, :cond_d

    goto/16 :goto_13

    :cond_d
    :goto_9
    check-cast p2, Ljava/lang/Iterable;

    iget-object v4, p0, Li03/b$b;->w:Li03/b;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v6, v1

    move v1, v2

    move-object v5, v4

    move-object v4, p2

    :cond_e
    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ln6/l;

    invoke-static {v5}, Li03/b;->a(Li03/b;)Landroid/content/Context;

    move-result-object v7

    new-instance v8, Li03/b$b$e;

    invoke-direct {v8, v6, v3}, Li03/b$b$e;-><init>(Ljava/lang/String;Lq83/d;)V

    iput-object v3, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    iput-object v6, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->y:Ljava/lang/Object;

    iput-object v5, p1, Li03/b$b$g;->z:Ljava/lang/Object;

    iput-object v4, p1, Li03/b$b$g;->E:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->F:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->G:Ljava/lang/Object;

    iput v1, p1, Li03/b$b$g;->H:I

    iput v2, p1, Li03/b$b$g;->I:I

    const/16 v9, 0xa

    iput v9, p1, Li03/b$b$g;->L:I

    invoke-static {v7, p2, v8, p1}, Ls6/a;->k(Landroid/content/Context;Ln6/l;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_e

    goto/16 :goto_13

    :cond_f
    new-instance p2, Lp6/n0;

    iget-object v1, p0, Li03/b$b;->w:Li03/b;

    invoke-static {v1}, Li03/b;->a(Li03/b;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {p2, v1}, Lp6/n0;-><init>(Landroid/content/Context;)V

    iput-object v3, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->y:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->z:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->E:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->F:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->G:Ljava/lang/Object;

    const/16 v1, 0xb

    iput v1, p1, Li03/b$b$g;->L:I

    const-class v1, Ln03/j;

    invoke-virtual {p2, v1, p1}, Lp6/n0;->b(Ljava/lang/Class;Lq83/d;)Ljava/io/Serializable;

    move-result-object p2

    if-ne p2, v0, :cond_10

    goto/16 :goto_13

    :cond_10
    :goto_b
    check-cast p2, Ljava/lang/Iterable;

    iget-object v1, p0, Li03/b$b;->w:Li03/b;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v4, p2

    move-object v5, v1

    move v1, v2

    :cond_11
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_12

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ln6/l;

    invoke-static {v5}, Li03/b;->a(Li03/b;)Landroid/content/Context;

    move-result-object v6

    new-instance v7, Li03/b$b$f;

    invoke-direct {v7, v3}, Li03/b$b$f;-><init>(Lq83/d;)V

    iput-object v3, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->y:Ljava/lang/Object;

    iput-object v5, p1, Li03/b$b$g;->z:Ljava/lang/Object;

    iput-object v4, p1, Li03/b$b$g;->E:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->F:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->G:Ljava/lang/Object;

    iput v1, p1, Li03/b$b$g;->H:I

    iput v2, p1, Li03/b$b$g;->I:I

    const/16 v8, 0xc

    iput v8, p1, Li03/b$b$g;->L:I

    invoke-static {v6, p2, v7, p1}, Ls6/a;->k(Landroid/content/Context;Ln6/l;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_11

    goto/16 :goto_13

    :cond_12
    iget-object p2, p0, Li03/b$b;->w:Li03/b;

    invoke-static {p2}, Li03/b;->b(Li03/b;)Lcom/whoop/widget/ui/healthspan/a;

    move-result-object p2

    iput-object v3, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->y:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->z:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->E:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->F:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->G:Ljava/lang/Object;

    const/16 v1, 0xd

    iput v1, p1, Li03/b$b$g;->L:I

    invoke-virtual {p2, p1}, Lcom/whoop/widget/ui/healthspan/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_13

    goto/16 :goto_13

    :cond_13
    :goto_d
    new-instance p2, Ln03/f;

    invoke-direct {p2}, Ln03/f;-><init>()V

    iget-object v1, p0, Li03/b$b;->w:Li03/b;

    invoke-static {v1}, Li03/b;->a(Li03/b;)Landroid/content/Context;

    move-result-object v1

    iput-object v3, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    const/16 v2, 0xe

    iput v2, p1, Li03/b$b$g;->L:I

    invoke-static {p2, v1, p1}, Lpf/c;->a0(Lp6/g0;Landroid/content/Context;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_14

    goto/16 :goto_13

    :cond_14
    :goto_e
    new-instance p2, Ln03/i;

    invoke-direct {p2}, Ln03/i;-><init>()V

    iget-object v1, p0, Li03/b$b;->w:Li03/b;

    invoke-static {v1}, Li03/b;->a(Li03/b;)Landroid/content/Context;

    move-result-object v1

    iput-object v3, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    const/16 v2, 0xf

    iput v2, p1, Li03/b$b$g;->L:I

    invoke-static {p2, v1, p1}, Lpf/c;->a0(Lp6/g0;Landroid/content/Context;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_15

    goto :goto_13

    :cond_15
    :goto_f
    new-instance p2, Ln03/g;

    invoke-direct {p2}, Ln03/g;-><init>()V

    iget-object v1, p0, Li03/b$b;->w:Li03/b;

    invoke-static {v1}, Li03/b;->a(Li03/b;)Landroid/content/Context;

    move-result-object v1

    iput-object v3, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    const/16 v2, 0x10

    iput v2, p1, Li03/b$b$g;->L:I

    invoke-static {p2, v1, p1}, Lpf/c;->a0(Lp6/g0;Landroid/content/Context;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_16

    goto :goto_13

    :cond_16
    :goto_10
    new-instance p2, Ln03/i;

    invoke-direct {p2}, Ln03/i;-><init>()V

    iget-object v1, p0, Li03/b$b;->w:Li03/b;

    invoke-static {v1}, Li03/b;->a(Li03/b;)Landroid/content/Context;

    move-result-object v1

    iput-object v3, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    const/16 v2, 0x11

    iput v2, p1, Li03/b$b$g;->L:I

    invoke-static {p2, v1, p1}, Lpf/c;->a0(Lp6/g0;Landroid/content/Context;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_17

    goto :goto_13

    :cond_17
    :goto_11
    new-instance p2, Ln03/j;

    invoke-direct {p2}, Ln03/j;-><init>()V

    iget-object v1, p0, Li03/b$b;->w:Li03/b;

    invoke-static {v1}, Li03/b;->a(Li03/b;)Landroid/content/Context;

    move-result-object v1

    iput-object v3, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    const/16 v2, 0x12

    iput v2, p1, Li03/b$b$g;->L:I

    invoke-static {p2, v1, p1}, Lpf/c;->a0(Lp6/g0;Landroid/content/Context;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_18

    goto :goto_13

    :cond_18
    :goto_12
    new-instance p2, Lk03/c;

    invoke-direct {p2}, Lk03/c;-><init>()V

    iget-object v1, p0, Li03/b$b;->w:Li03/b;

    invoke-static {v1}, Li03/b;->a(Li03/b;)Landroid/content/Context;

    move-result-object v1

    iput-object v3, p1, Li03/b$b$g;->w:Ljava/lang/Object;

    iput-object v3, p1, Li03/b$b$g;->x:Ljava/lang/Object;

    const/16 v2, 0x13

    iput v2, p1, Li03/b$b$g;->L:I

    invoke-static {p2, v1, p1}, Lpf/c;->a0(Lp6/g0;Landroid/content/Context;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_19

    :goto_13
    return-object v0

    :cond_19
    :goto_14
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
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

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/domain/model/Logout;

    invoke-virtual {p0, p1, p2}, Li03/b$b;->b(Lcom/whoop/domain/model/Logout;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
