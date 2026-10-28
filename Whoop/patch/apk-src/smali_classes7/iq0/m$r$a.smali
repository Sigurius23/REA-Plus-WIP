.class final Liq0/m$r$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liq0/m$r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.whoop.community.presentation.chat.CommunityChatViewModel$uploadChatAttachments$1$1"
    f = "CommunityChatViewModel.kt"
    l = {
        0x10e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Liq0/m;

.field final synthetic F:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Liq0/m;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Liq0/m;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Liq0/m$r$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Liq0/m$r$a;->z:Ljava/util/List;

    iput-object p2, p0, Liq0/m$r$a;->E:Liq0/m;

    iput-object p3, p0, Liq0/m$r$a;->F:Ljava/lang/String;

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

    new-instance v0, Liq0/m$r$a;

    iget-object v1, p0, Liq0/m$r$a;->z:Ljava/util/List;

    iget-object v2, p0, Liq0/m$r$a;->E:Liq0/m;

    iget-object v3, p0, Liq0/m$r$a;->F:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Liq0/m$r$a;-><init>(Ljava/util/List;Liq0/m;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Liq0/m$r$a;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Liq0/m$r$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Liq0/m$r$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Liq0/m$r$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Liq0/m$r$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Liq0/m$r$a;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Liq0/m$r$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Liq0/m$r$a;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Liq0/m$r$a;->z:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->D0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object v2, p0, Liq0/m$r$a;->E:Liq0/m;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {p1, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/Bitmap;

    new-instance v7, Liq0/m$r$a$a;

    invoke-direct {v7, v2, v5, v6}, Liq0/m$r$a$a;-><init>(Liq0/m;Landroid/graphics/Bitmap;Lq83/d;)V

    const/4 v5, 0x3

    invoke-static {v0, v6, v7, v5}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iput-object v6, p0, Liq0/m$r$a;->y:Ljava/lang/Object;

    iput-object v6, p0, Liq0/m$r$a;->w:Ljava/lang/Object;

    iput v3, p0, Liq0/m$r$a;->x:I

    invoke-static {v4, p0}, Lbc3/f0;->f(Ljava/util/ArrayList;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Liq0/m$r$a;->E:Liq0/m;

    invoke-virtual {v0}, Liq0/m;->o0()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    if-nez v0, :cond_4

    iget-object v0, p0, Liq0/m$r$a;->E:Liq0/m;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->D0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object v1, p0, Liq0/m$r$a;->F:Ljava/lang/String;

    iget-object v2, p0, Liq0/m$r$a;->E:Liq0/m;

    invoke-virtual {v2}, Liq0/m;->k0()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Liq0/m$r$a;->E:Liq0/m;

    invoke-virtual {v3}, Liq0/m;->l0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, p1, v1, v2, v3}, Liq0/m;->S(Liq0/m;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, Liq0/m$r$a;->E:Liq0/m;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->D0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object v1, p0, Liq0/m$r$a;->F:Ljava/lang/String;

    invoke-static {v0, p1, v1}, Liq0/m;->V(Liq0/m;Ljava/util/List;Ljava/lang/String;)V

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
