.class final Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
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
    c = "com.whoop.debug.jsonplayground.JsonPlaygroundFragment$onCreateView$1$1$1$1"
    f = "JsonPlaygroundFragment.kt"
    l = {
        0x29
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;

.field final synthetic y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$b;->x:Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;

    iput-object p2, p0, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$b;->y:Ljava/lang/String;

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

    new-instance p1, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$b;

    iget-object v0, p0, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$b;->x:Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;

    iget-object v1, p0, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$b;->y:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$b;-><init>(Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;Ljava/lang/String;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$b;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$b;->x:Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;

    invoke-static {p1}, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;->B(Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;)La6/g;

    move-result-object p1

    new-instance v1, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$b$a;

    iget-object v3, p0, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$b;->y:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$b$a;-><init>(Ljava/lang/String;Lq83/d;)V

    iput v2, p0, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$b;->w:I

    invoke-static {p1, v1, p0}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$b;->x:Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;

    invoke-static {p1}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p1

    const-string v0, "android-app://com.whoop/jsonplaygroundresult"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Leb/a0;->q(Landroid/net/Uri;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
