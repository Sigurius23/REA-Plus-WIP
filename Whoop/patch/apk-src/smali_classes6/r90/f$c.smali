.class final Lr90/f$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr90/f;->k(Lr90/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.activation.view.screens.privacyconsent.PrivacyConsentScreenKt$PrivacyConsentScreenView$4$1"
    f = "PrivacyConsentScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lr90/g;

.field final synthetic y:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lr90/g;Lkotlin/jvm/functions/Function1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr90/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lr90/f$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lr90/f$c;->x:Lr90/g;

    iput-object p2, p0, Lr90/f$c;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lr90/f$c;->z:Lp1/c1;

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

    new-instance p1, Lr90/f$c;

    iget-object v0, p0, Lr90/f$c;->x:Lr90/g;

    iget-object v1, p0, Lr90/f$c;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lr90/f$c;->z:Lp1/c1;

    invoke-direct {p1, v0, v1, v2, p2}, Lr90/f$c;-><init>(Lr90/g;Lkotlin/jvm/functions/Function1;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lr90/f$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lr90/f$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lr90/f$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lr90/f$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lr90/f$c;->w:I

    if-nez v0, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lr90/f$c;->z:Lp1/c1;

    iget-object v0, p0, Lr90/f$c;->x:Lr90/g;

    invoke-virtual {v0}, Lr90/g;->o()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lr90/j;

    invoke-virtual {v3}, Lr90/j;->n()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr90/j;

    invoke-virtual {v1}, Lr90/j;->k()Z

    move-result v1

    if-nez v1, :cond_3

    const/4 v2, 0x0

    :cond_4
    :goto_1
    invoke-static {p1, v2}, Lr90/f;->F(Lp1/c1;Z)V

    iget-object p1, p0, Lr90/f$c;->y:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lr90/f$c;->x:Lr90/g;

    invoke-virtual {v0}, Lr90/g;->f()Z

    move-result v0

    iget-object v1, p0, Lr90/f$c;->x:Lr90/g;

    invoke-virtual {v1}, Lr90/g;->i()Z

    move-result v1

    iget-object v2, p0, Lr90/f$c;->x:Lr90/g;

    invoke-virtual {v2}, Lr90/g;->k()Z

    move-result v2

    iget-object v3, p0, Lr90/f$c;->x:Lr90/g;

    invoke-virtual {v3}, Lr90/g;->o()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr90/j;

    new-instance v6, Lcom/whoop/activation/domain/models/ConsentSubmission;

    invoke-virtual {v5}, Lr90/j;->h()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5}, Lr90/j;->d()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5}, Lr90/j;->k()Z

    move-result v5

    invoke-direct {v6, v7, v8, v5}, Lcom/whoop/activation/domain/models/ConsentSubmission;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    new-instance v3, Lj80/a$l0;

    invoke-direct {v3, v0, v1, v2, v4}, Lj80/a$l0;-><init>(ZZZLjava/util/List;)V

    invoke-interface {p1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
