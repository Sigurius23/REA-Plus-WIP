.class public final Lkh1/d$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkh1/d;->l(Lkh1/b$e;Lkh1/f;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.gifting.feature.gifting.domain.GiftingInteractor$performAction$$inlined$flatMapLatest$1"
    f = "GiftingInteractor.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lkh1/f;

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lkh1/d;


# direct methods
.method public constructor <init>(Lq83/d;Lkh1/d;Lkh1/f;)V
    .locals 0

    iput-object p2, p0, Lkh1/d$h;->z:Lkh1/d;

    iput-object p3, p0, Lkh1/d$h;->E:Lkh1/f;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lqw2/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkh1/d$h;

    iget-object v1, p0, Lkh1/d$h;->z:Lkh1/d;

    iget-object v2, p0, Lkh1/d$h;->E:Lkh1/f;

    invoke-direct {v0, p3, v1, v2}, Lkh1/d$h;-><init>(Lq83/d;Lkh1/d;Lkh1/f;)V

    iput-object p1, v0, Lkh1/d$h;->x:Ljava/lang/Object;

    iput-object p2, v0, Lkh1/d$h;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lkh1/d$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lkh1/d$h;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lkh1/d$h;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lkh1/d$h;->x:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lkh1/d$h;->x:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Lkh1/d$h;->y:Ljava/lang/Object;

    check-cast v4, Lqw2/b;

    instance-of v5, v4, Lqw2/b$f;

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    iget-object v7, v0, Lkh1/d$h;->z:Lkh1/d;

    iget-object v4, v0, Lkh1/d$h;->E:Lkh1/f;

    invoke-virtual {v4}, Lkh1/f;->f()Ljava/lang/String;

    move-result-object v9

    iget-object v4, v0, Lkh1/d$h;->E:Lkh1/f;

    invoke-virtual {v4}, Lkh1/f;->c()Ljava/lang/String;

    move-result-object v10

    iget-object v4, v0, Lkh1/d$h;->E:Lkh1/f;

    invoke-virtual {v4}, Lkh1/f;->g()Ljava/lang/String;

    move-result-object v11

    iget-object v4, v0, Lkh1/d$h;->E:Lkh1/f;

    invoke-virtual {v4}, Lkh1/f;->e()Ljava/lang/String;

    move-result-object v12

    const/16 v14, 0x21

    const/4 v15, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    invoke-static/range {v7 .. v15}, Lkh1/d;->k(Lkh1/d;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v4

    new-instance v5, Lkh1/d$i;

    invoke-direct {v5, v4}, Lkh1/d$i;-><init>(Lec3/l;)V

    goto/16 :goto_2

    :cond_2
    instance-of v5, v4, Lqw2/b$c;

    if-eqz v5, :cond_3

    new-instance v4, Lkh1/e$c;

    sget-object v5, Lkh1/a$b;->a:Lkh1/a$b;

    invoke-direct {v4, v5}, Lkh1/e$c;-><init>(Lkh1/a;)V

    new-instance v5, La6/u;

    const/4 v7, 0x1

    invoke-direct {v5, v4, v7}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_2

    :cond_3
    instance-of v5, v4, Lqw2/b$i;

    if-eqz v5, :cond_4

    new-instance v4, Lkh1/e$c;

    sget-object v5, Lkh1/a$b;->a:Lkh1/a$b;

    invoke-direct {v4, v5}, Lkh1/e$c;-><init>(Lkh1/a;)V

    new-instance v5, La6/u;

    const/4 v7, 0x1

    invoke-direct {v5, v4, v7}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_2

    :cond_4
    instance-of v5, v4, Lqw2/b$n;

    if-eqz v5, :cond_5

    new-instance v4, Lkh1/e$c;

    sget-object v5, Lkh1/a$e;->a:Lkh1/a$e;

    invoke-direct {v4, v5}, Lkh1/e$c;-><init>(Lkh1/a;)V

    new-instance v5, La6/u;

    const/4 v7, 0x1

    invoke-direct {v5, v4, v7}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_2

    :cond_5
    instance-of v5, v4, Lqw2/b$d;

    if-eqz v5, :cond_6

    new-instance v7, Lkh1/c;

    iget-object v5, v0, Lkh1/d$h;->E:Lkh1/f;

    invoke-virtual {v5}, Lkh1/f;->f()Ljava/lang/String;

    move-result-object v8

    iget-object v5, v0, Lkh1/d$h;->E:Lkh1/f;

    invoke-virtual {v5}, Lkh1/f;->c()Ljava/lang/String;

    move-result-object v9

    iget-object v5, v0, Lkh1/d$h;->E:Lkh1/f;

    invoke-virtual {v5}, Lkh1/f;->g()Ljava/lang/String;

    move-result-object v10

    iget-object v5, v0, Lkh1/d$h;->E:Lkh1/f;

    invoke-virtual {v5}, Lkh1/f;->e()Ljava/lang/String;

    move-result-object v11

    new-instance v5, Lnh1/a$c;

    check-cast v4, Lqw2/b$d;

    invoke-virtual {v4}, Lqw2/b$d;->b()Lcom/whoop/navigation/e;

    move-result-object v4

    invoke-direct {v5, v4}, Lnh1/a$c;-><init>(Lcom/whoop/navigation/e;)V

    const/16 v21, 0xff0

    const/16 v22, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v20, v5

    invoke-direct/range {v7 .. v22}, Lkh1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkh1/a;Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;Ljava/lang/String;ILjava/lang/String;ZZZLnh1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lkh1/e$b;

    invoke-direct {v4, v7}, Lkh1/e$b;-><init>(Lkh1/c;)V

    new-instance v5, La6/u;

    const/4 v7, 0x1

    invoke-direct {v5, v4, v7}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_2

    :cond_6
    instance-of v5, v4, Lqw2/b$a;

    if-eqz v5, :cond_8

    check-cast v4, Lqw2/b$a;

    invoke-virtual {v4}, Lqw2/b$a;->c()Ljava/lang/String;

    move-result-object v4

    const-string v5, "network"

    invoke-static {v4, v5, v3}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-eqz v4, :cond_7

    sget-object v4, Lkh1/a$c;->a:Lkh1/a$c;

    goto :goto_0

    :cond_7
    sget-object v4, Lkh1/a$d;->a:Lkh1/a$d;

    :goto_0
    new-instance v5, Lkh1/e$c;

    invoke-direct {v5, v4}, Lkh1/e$c;-><init>(Lkh1/a;)V

    new-instance v4, La6/u;

    const/4 v7, 0x1

    invoke-direct {v4, v5, v7}, La6/u;-><init>(Ljava/lang/Object;I)V

    move-object v5, v4

    goto :goto_2

    :cond_8
    instance-of v5, v4, Lqw2/b$m;

    if-nez v5, :cond_a

    instance-of v5, v4, Lqw2/b$l;

    if-nez v5, :cond_a

    instance-of v5, v4, Lqw2/b$k;

    if-nez v5, :cond_a

    instance-of v5, v4, Lqw2/b$j;

    if-nez v5, :cond_a

    instance-of v5, v4, Lqw2/b$g;

    if-nez v5, :cond_a

    instance-of v5, v4, Lqw2/b$e;

    if-nez v5, :cond_a

    instance-of v5, v4, Lqw2/b$h;

    if-nez v5, :cond_a

    instance-of v4, v4, Lqw2/b$b;

    if-eqz v4, :cond_9

    goto :goto_1

    :cond_9
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_a
    :goto_1
    new-instance v4, Lkh1/e$c;

    invoke-direct {v4, v6}, Lkh1/e$c;-><init>(Lkh1/a;)V

    new-instance v5, La6/u;

    const/4 v7, 0x1

    invoke-direct {v5, v4, v7}, La6/u;-><init>(Ljava/lang/Object;I)V

    :goto_2
    iput-object v6, v0, Lkh1/d$h;->x:Ljava/lang/Object;

    iput-object v6, v0, Lkh1/d$h;->y:Ljava/lang/Object;

    iput v3, v0, Lkh1/d$h;->w:I

    invoke-static {v2, v5, v0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_b

    return-object v1

    :cond_b
    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
