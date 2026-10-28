.class final Lfr1/d$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfr1/d;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
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
    c = "com.whoop.integrations.navigation.IntegrationsNavigationRouter$startOAuthConnectedFlow$2"
    f = "IntegrationsNavigationRouter.kt"
    l = {
        0xa4,
        0xa6
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lfr1/d;

.field final synthetic F:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lfr1/d;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lfr1/d;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lfr1/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfr1/d$c;->z:Ljava/lang/String;

    iput-object p2, p0, Lfr1/d$c;->E:Lfr1/d;

    iput-object p3, p0, Lfr1/d$c;->F:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lfr1/d$c;

    iget-object v0, p0, Lfr1/d$c;->z:Ljava/lang/String;

    iget-object v1, p0, Lfr1/d$c;->E:Lfr1/d;

    iget-object v2, p0, Lfr1/d$c;->F:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lfr1/d$c;-><init>(Ljava/lang/String;Lfr1/d;Ljava/lang/String;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lfr1/d$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfr1/d$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfr1/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lfr1/d$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lfr1/d$c;->y:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_1

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lfr1/d$c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Lfr1/d$c;->w:Ljava/lang/Object;

    check-cast v0, Lh12/b;

    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lfr1/d$c;->z:Ljava/lang/String;

    const-string v1, "healthex"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    iget-object p1, p0, Lfr1/d$c;->E:Lfr1/d;

    invoke-static {p1}, Lfr1/d;->g(Lfr1/d;)Lh12/a;

    move-result-object p1

    invoke-virtual {p1}, Lh12/a;->a()Lh12/b;

    move-result-object p1

    iget-object v3, p0, Lfr1/d$c;->F:Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "code_challenge="

    invoke-static {v3, v5, v4}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Lfr1/d$c;->F:Ljava/lang/String;

    invoke-virtual {p1}, Lh12/b;->a()Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v5, v4}, Lyb3/y;->M(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_3
    iget-object v3, p0, Lfr1/d$c;->F:Ljava/lang/String;

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v3

    const-string v4, "code_challenge"

    invoke-virtual {p1}, Lh12/b;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :goto_1
    iget-object v4, p0, Lfr1/d$c;->E:Lfr1/d;

    invoke-static {v4}, Lfr1/d;->h(Lfr1/d;)Lg12/e;

    move-result-object v4

    iget-object v5, p0, Lfr1/d$c;->z:Ljava/lang/String;

    invoke-virtual {p1}, Lh12/b;->b()Ljava/lang/String;

    move-result-object p1

    iput-object v1, p0, Lfr1/d$c;->w:Ljava/lang/Object;

    iput-object v1, p0, Lfr1/d$c;->x:Ljava/lang/Object;

    iput v2, p0, Lfr1/d$c;->y:I

    invoke-virtual {v4, v3, v5, p1, p0}, Lg12/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_2

    :cond_4
    iget-object p1, p0, Lfr1/d$c;->E:Lfr1/d;

    invoke-static {p1}, Lfr1/d;->h(Lfr1/d;)Lg12/e;

    move-result-object p1

    iget-object v2, p0, Lfr1/d$c;->F:Ljava/lang/String;

    iget-object v4, p0, Lfr1/d$c;->z:Ljava/lang/String;

    iput v3, p0, Lfr1/d$c;->y:I

    invoke-virtual {p1, v2, v4, v1, p0}, Lg12/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_2
    return-object v0

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
