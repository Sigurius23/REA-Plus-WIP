.class final Lmi2/i$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmi2/i;->s(Lji2/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.strava.view.screen.StravaSettingsConnectedScreenKt$ConnectedScreenContent$1$4$1"
    f = "StravaSettingsConnectedScreen.kt"
    l = {
        0x12b,
        0x12d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field final synthetic F:Lji2/f;

.field final synthetic G:Ln0/u;

.field w:I

.field x:I

.field y:I

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lji2/f;Ln0/u;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lji2/f;",
            "Ln0/u;",
            "Lq83/d<",
            "-",
            "Lmi2/i$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmi2/i$b;->F:Lji2/f;

    iput-object p2, p0, Lmi2/i$b;->G:Ln0/u;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Lmi2/i$b;

    iget-object v0, p0, Lmi2/i$b;->F:Lji2/f;

    iget-object v1, p0, Lmi2/i$b;->G:Ln0/u;

    invoke-direct {p1, v0, v1, p2}, Lmi2/i$b;-><init>(Lji2/f;Ln0/u;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lmi2/i$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lmi2/i$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lmi2/i$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lmi2/i$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lmi2/i$b;->E:I

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
    :goto_0
    iget-object v0, p0, Lmi2/i$b;->z:Ljava/lang/Object;

    check-cast v0, Ln0/g;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lmi2/i$b;->F:Lji2/f;

    invoke-virtual {p1}, Lji2/f;->q()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    move v4, v1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lji2/d;

    invoke-virtual {v5}, Lji2/d;->a()Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    const/4 v4, -0x1

    :goto_2
    iget-object p1, p0, Lmi2/i$b;->G:Ln0/u;

    invoke-virtual {p1}, Ln0/u;->h()Ln0/n;

    move-result-object p1

    iget-object p1, p1, Ln0/n;->k:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Ln0/g;

    check-cast v7, Ln0/o;

    iget v7, v7, Ln0/o;->a:I

    if-ne v7, v4, :cond_5

    goto :goto_3

    :cond_6
    move-object v5, v6

    :goto_3
    check-cast v5, Ln0/g;

    if-eqz v5, :cond_7

    iget-object p1, p0, Lmi2/i$b;->G:Ln0/u;

    invoke-virtual {p1}, Ln0/u;->h()Ln0/n;

    move-result-object p1

    iget p1, p1, Ln0/n;->m:I

    div-int/2addr p1, v3

    check-cast v5, Ln0/o;

    iget v1, v5, Ln0/o;->o:I

    iget v5, v5, Ln0/o;->p:I

    div-int/2addr v5, v3

    add-int/2addr v5, v1

    iget-object v1, p0, Lmi2/i$b;->G:Ln0/u;

    sub-int v3, v5, p1

    int-to-float v3, v3

    iput-object v6, p0, Lmi2/i$b;->z:Ljava/lang/Object;

    iput v4, p0, Lmi2/i$b;->w:I

    iput p1, p0, Lmi2/i$b;->x:I

    iput v5, p0, Lmi2/i$b;->y:I

    iput v2, p0, Lmi2/i$b;->E:I

    invoke-static {v1, v3, p0}, Lh0/q3;->d(Lh0/x2;FLs83/i;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_4

    :cond_7
    iget-object p1, p0, Lmi2/i$b;->G:Ln0/u;

    iput-object v6, p0, Lmi2/i$b;->z:Ljava/lang/Object;

    iput v4, p0, Lmi2/i$b;->w:I

    iput v3, p0, Lmi2/i$b;->E:I

    invoke-virtual {p1, v4, v1, p0}, Ln0/u;->f(IILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    :goto_4
    return-object v0

    :cond_8
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
