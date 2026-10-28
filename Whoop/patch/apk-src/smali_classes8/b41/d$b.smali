.class final Lb41/d$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb41/d;->l(Landroidx/compose/ui/Modifier;Lb41/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.design.atomic.molecule.textinput.TextInputKt$TextInput$2$1"
    f = "TextInput.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lb41/f;

.field final synthetic y:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lb41/f;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb41/f;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lb41/d$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lb41/d$b;->x:Lb41/f;

    iput-object p2, p0, Lb41/d$b;->y:Lp1/c1;

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

    new-instance p1, Lb41/d$b;

    iget-object v0, p0, Lb41/d$b;->x:Lb41/f;

    iget-object v1, p0, Lb41/d$b;->y:Lp1/c1;

    invoke-direct {p1, v0, v1, p2}, Lb41/d$b;-><init>(Lb41/f;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lb41/d$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb41/d$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb41/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lb41/d$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lb41/d$b;->w:I

    if-nez v0, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lb41/d$b;->x:Lb41/f;

    invoke-virtual {p1}, Lb41/f;->h()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lb41/d$b;->x:Lb41/f;

    invoke-virtual {p1}, Lb41/f;->k()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lb41/d$b;->y:Lp1/c1;

    invoke-static {v0}, Lb41/d;->G(Lp1/c1;)Lb41/b;

    move-result-object v0

    invoke-virtual {v0}, Lb41/b;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lb41/d$b;->y:Lp1/c1;

    invoke-static {p1}, Lb41/d;->G(Lp1/c1;)Lb41/b;

    move-result-object v0

    iget-object v1, p0, Lb41/d$b;->x:Lb41/f;

    invoke-virtual {v1}, Lb41/f;->k()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lb41/d$b;->x:Lb41/f;

    invoke-virtual {v2}, Lb41/f;->g()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v3, p0, Lb41/d$b;->x:Lb41/f;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v3}, Lb41/f;->k()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    const-string v3, ""

    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-le v3, v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    :goto_1
    move-object v3, v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    goto :goto_1

    :goto_2
    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lb41/b;->b(Lb41/b;Ljava/lang/String;ZLjava/lang/Boolean;ILjava/lang/Object;)Lb41/b;

    move-result-object v0

    invoke-static {p1, v0}, Lb41/d;->H(Lp1/c1;Lb41/b;)V

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
