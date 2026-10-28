.class final Lcom/whoop/settings/DebugFragment$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/settings/DebugFragment;->f4()V
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
    c = "com.whoop.settings.DebugFragment$showLocalStorageWatermarks$collectJob$1"
    f = "DebugFragment.kt"
    l = {
        0x19d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Landroid/widget/TextView;

.field final synthetic F:Lyh2/c;

.field final synthetic G:Ljk0/d;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field final synthetic z:Lcom/whoop/settings/DebugFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/settings/DebugFragment;Landroid/widget/TextView;Lyh2/c;Ljk0/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/settings/DebugFragment;",
            "Landroid/widget/TextView;",
            "Lyh2/c;",
            "Ljk0/d;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/settings/DebugFragment$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/settings/DebugFragment$i;->z:Lcom/whoop/settings/DebugFragment;

    iput-object p2, p0, Lcom/whoop/settings/DebugFragment$i;->E:Landroid/widget/TextView;

    iput-object p3, p0, Lcom/whoop/settings/DebugFragment$i;->F:Lyh2/c;

    iput-object p4, p0, Lcom/whoop/settings/DebugFragment$i;->G:Ljk0/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lcom/whoop/settings/DebugFragment$i;

    iget-object v1, p0, Lcom/whoop/settings/DebugFragment$i;->z:Lcom/whoop/settings/DebugFragment;

    iget-object v2, p0, Lcom/whoop/settings/DebugFragment$i;->E:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/whoop/settings/DebugFragment$i;->F:Lyh2/c;

    iget-object v4, p0, Lcom/whoop/settings/DebugFragment$i;->G:Ljk0/d;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/whoop/settings/DebugFragment$i;-><init>(Lcom/whoop/settings/DebugFragment;Landroid/widget/TextView;Lyh2/c;Ljk0/d;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/settings/DebugFragment$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/settings/DebugFragment$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/settings/DebugFragment$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/settings/DebugFragment$i;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/settings/DebugFragment$i;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment$i;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment$i;->w:Ljava/lang/Object;

    check-cast v0, Lt83/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    invoke-static {}, Lyh2/a;->getEntries()Lt83/a;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/settings/DebugFragment$i;->z:Lcom/whoop/settings/DebugFragment;

    iget-object v3, p0, Lcom/whoop/settings/DebugFragment$i;->F:Lyh2/c;

    iget-object v4, p0, Lcom/whoop/settings/DebugFragment$i;->G:Ljk0/d;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {p1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lyh2/a;

    invoke-static {v1, v3, v4, v7}, Lcom/whoop/settings/DebugFragment;->H1(Lcom/whoop/settings/DebugFragment;Lyh2/c;Ljk0/d;Lyh2/a;)Lec3/l;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/whoop/settings/DebugFragment$i;->z:Lcom/whoop/settings/DebugFragment;

    invoke-static {v5}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    const/4 v4, 0x0

    new-array v4, v4, [Lec3/l;

    invoke-interface {v3, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Lec3/l;

    new-instance v4, Lcom/whoop/settings/DebugFragment$i$c;

    invoke-direct {v4, v3, p1, v1}, Lcom/whoop/settings/DebugFragment$i$c;-><init>([Lec3/l;Lt83/a;Lcom/whoop/settings/DebugFragment;)V

    new-instance p1, Lcom/whoop/settings/DebugFragment$i$b;

    iget-object v1, p0, Lcom/whoop/settings/DebugFragment$i;->z:Lcom/whoop/settings/DebugFragment;

    iget-object v3, p0, Lcom/whoop/settings/DebugFragment$i;->E:Landroid/widget/TextView;

    invoke-direct {p1, v1, v3}, Lcom/whoop/settings/DebugFragment$i$b;-><init>(Lcom/whoop/settings/DebugFragment;Landroid/widget/TextView;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/whoop/settings/DebugFragment$i;->w:Ljava/lang/Object;

    iput-object v1, p0, Lcom/whoop/settings/DebugFragment$i;->x:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/settings/DebugFragment$i;->y:I

    invoke-interface {v4, p1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v0, :cond_4

    return-object v0

    :goto_1
    iget-object v0, p0, Lcom/whoop/settings/DebugFragment$i;->z:Lcom/whoop/settings/DebugFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment$i;->E:Landroid/widget/TextView;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    const-string p1, "Could not read watermarks"

    :goto_2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_4
    throw p1
.end method
