.class final Lis0/j0$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lis0/j0;->z(Landroidx/compose/ui/Modifier;Lis0/s0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.communityreactions.view.ReactionsPanelKt$ReactionsPanel$4$1"
    f = "ReactionsPanel.kt"
    l = {
        0x80
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lg2/i;

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic G:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lis0/m0;

.field final synthetic z:Lb3/x2;


# direct methods
.method public constructor <init>(Lis0/m0;Lb3/x2;Lg2/i;Lp1/c1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lis0/m0;",
            "Lb3/x2;",
            "Lg2/i;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lis0/j0$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lis0/j0$b;->y:Lis0/m0;

    iput-object p2, p0, Lis0/j0$b;->z:Lb3/x2;

    iput-object p3, p0, Lis0/j0$b;->E:Lg2/i;

    iput-object p4, p0, Lis0/j0$b;->F:Lp1/c1;

    iput-object p5, p0, Lis0/j0$b;->G:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lis0/m0;)Lis0/b0;
    .locals 0

    invoke-static {p0}, Lis0/j0$b;->h(Lis0/m0;)Lis0/b0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lis0/m0;)Lis0/b0;
    .locals 0

    invoke-virtual {p0}, Lis0/m0;->j()Lis0/b0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lis0/j0$b;

    iget-object v1, p0, Lis0/j0$b;->y:Lis0/m0;

    iget-object v2, p0, Lis0/j0$b;->z:Lb3/x2;

    iget-object v3, p0, Lis0/j0$b;->E:Lg2/i;

    iget-object v4, p0, Lis0/j0$b;->F:Lp1/c1;

    iget-object v5, p0, Lis0/j0$b;->G:Lp1/c1;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lis0/j0$b;-><init>(Lis0/m0;Lb3/x2;Lg2/i;Lp1/c1;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lis0/j0$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lis0/j0$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lis0/j0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lis0/j0$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lis0/j0$b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lis0/j0$b;->w:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object v4

    iget-object p1, p0, Lis0/j0$b;->y:Lis0/m0;

    invoke-virtual {p1}, Lis0/m0;->j()Lis0/b0;

    move-result-object p1

    iput-object p1, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object p1, p0, Lis0/j0$b;->y:Lis0/m0;

    new-instance v1, Lis0/k0;

    const/4 v3, 0x0

    invoke-direct {v1, p1, v3}, Lis0/k0;-><init>(Lis0/m0;I)V

    invoke-static {v1}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    new-instance v3, Lis0/j0$b$a;

    iget-object v5, p0, Lis0/j0$b;->z:Lb3/x2;

    iget-object v6, p0, Lis0/j0$b;->E:Lg2/i;

    iget-object v7, p0, Lis0/j0$b;->F:Lp1/c1;

    iget-object v8, p0, Lis0/j0$b;->G:Lp1/c1;

    invoke-direct/range {v3 .. v8}, Lis0/j0$b$a;-><init>(Lkotlin/jvm/internal/g0;Lb3/x2;Lg2/i;Lp1/c1;Lp1/c1;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lis0/j0$b;->w:Ljava/lang/Object;

    iput v2, p0, Lis0/j0$b;->x:I

    invoke-virtual {p1, v3, p0}, Lec3/s1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
