.class final Laq0/q$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laq0/q;->S0()V
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
    c = "com.whoop.community.chat.ChatFragment$addGlobalShareWidget$1"
    f = "ChatFragment.kt"
    l = {
        0xe3
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field final synthetic F:Laq0/q;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Laq0/q;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laq0/q;",
            "Lq83/d<",
            "-",
            "Laq0/q$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Laq0/q$b;->F:Laq0/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Laq0/q$b;

    iget-object v0, p0, Laq0/q$b;->F:Laq0/q;

    invoke-direct {p1, v0, p2}, Laq0/q$b;-><init>(Laq0/q;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Laq0/q$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Laq0/q$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Laq0/q$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Laq0/q$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Laq0/q$b;->E:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Laq0/q$b;->y:Ljava/lang/Object;

    check-cast v0, Lcom/bumptech/glide/f;

    iget-object v1, p0, Laq0/q$b;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, p0, Laq0/q$b;->w:Ljava/lang/Object;

    check-cast v1, Laq0/q;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Laq0/q$b;->F:Laq0/q;

    invoke-static {p1}, Laq0/q;->F0(Laq0/q;)Liq0/m;

    move-result-object p1

    invoke-virtual {p1}, Liq0/m;->H0()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v1, p0, Laq0/q$b;->F:Laq0/q;

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bumptech/glide/h;->j()Lcom/bumptech/glide/f;

    move-result-object p1

    invoke-static {v1}, Laq0/q;->F0(Laq0/q;)Liq0/m;

    move-result-object v3

    iput-object v1, p0, Laq0/q$b;->w:Ljava/lang/Object;

    const/4 v4, 0x0

    iput-object v4, p0, Laq0/q$b;->x:Ljava/lang/Object;

    iput-object p1, p0, Laq0/q$b;->y:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, p0, Laq0/q$b;->z:I

    iput v2, p0, Laq0/q$b;->E:I

    invoke-virtual {v3, p0}, Liq0/m;->G0(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    move-object p1, v3

    :goto_0
    iput-object p1, v0, Lcom/bumptech/glide/f;->Y:Ljava/lang/Object;

    iput-boolean v2, v0, Lcom/bumptech/glide/f;->a0:Z

    new-instance p1, Laq0/q$b$a;

    invoke-direct {p1, v1}, Laq0/q$b$a;-><init>(Laq0/q;)V

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/f;->z(Lql/i;)V

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
