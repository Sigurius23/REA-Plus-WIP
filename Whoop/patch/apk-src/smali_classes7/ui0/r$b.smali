.class final Lui0/r$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lui0/r;->f(Lcom/whoop/archv2/feature/domain/p;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lui0/r$b$a;
    }
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
    c = "com.whoop.archv2.feature.view.MediaPickEffectsKt$LaunchPendingMediaPick$2$1"
    f = "MediaPickEffects.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Lcom/whoop/archv2/feature/domain/p;

.field final synthetic y:Lui0/a;

.field final synthetic z:Lh/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/i;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/archv2/feature/domain/p;Lui0/a;Lh/i;Lc93/a;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/archv2/feature/domain/p;",
            "Lui0/a;",
            "Lh/i;",
            "Lc93/a;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lui0/r$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lui0/r$b;->x:Lcom/whoop/archv2/feature/domain/p;

    iput-object p2, p0, Lui0/r$b;->y:Lui0/a;

    iput-object p3, p0, Lui0/r$b;->z:Lh/i;

    iput-object p4, p0, Lui0/r$b;->E:Lc93/a;

    iput-object p5, p0, Lui0/r$b;->F:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
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

    new-instance v0, Lui0/r$b;

    iget-object v1, p0, Lui0/r$b;->x:Lcom/whoop/archv2/feature/domain/p;

    iget-object v2, p0, Lui0/r$b;->y:Lui0/a;

    iget-object v3, p0, Lui0/r$b;->z:Lh/i;

    iget-object v4, p0, Lui0/r$b;->E:Lc93/a;

    iget-object v5, p0, Lui0/r$b;->F:Lp1/c1;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lui0/r$b;-><init>(Lcom/whoop/archv2/feature/domain/p;Lui0/a;Lh/i;Lc93/a;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lui0/r$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lui0/r$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lui0/r$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lui0/r$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lui0/r$b;->w:I

    if-nez v0, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lui0/r$b;->x:Lcom/whoop/archv2/feature/domain/p;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lui0/r$b;->F:Lp1/c1;

    invoke-static {p1}, Lui0/r;->n(Lp1/c1;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lui0/r$b;->F:Lp1/c1;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lui0/r;->o(Lp1/c1;Z)V

    iget-object p1, p0, Lui0/r$b;->x:Lcom/whoop/archv2/feature/domain/p;

    invoke-virtual {p1}, Lcom/whoop/archv2/feature/domain/p;->c()Lcom/whoop/whoopaction/domain/models/PickMediaSource;

    move-result-object p1

    sget-object v2, Lui0/r$b$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    :try_start_0
    iget-object p1, p0, Lui0/r$b;->z:Lh/i;

    sget-object v0, Lk/d;->a:Lk/d;

    invoke-static {v0}, Lse/g;->f(Lk/f;)Lj/m;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2}, Lh/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    invoke-static {}, Lui0/r;->p()Ltr2/n;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-interface {p1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    const-string v2, "No photo picker to open: "

    invoke-static {v2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, p1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lui0/r$b;->E:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    iget-object p1, p0, Lui0/r$b;->y:Lui0/a;

    iget-object v0, p0, Lui0/r$b;->x:Lcom/whoop/archv2/feature/domain/p;

    invoke-virtual {v0}, Lcom/whoop/archv2/feature/domain/p;->d()Ljava/lang/String;

    move-result-object v9

    check-cast p1, Lui0/b;

    iget-object v2, p1, Lui0/b;->a:Landroid/content/Context;

    iget-object v3, p1, Lui0/b;->b:Lh/i;

    iget-object v4, p1, Lui0/b;->c:Lp1/c1;

    iget-object v5, p1, Lui0/b;->d:Lh/i;

    iget-object v6, p1, Lui0/b;->e:Lp1/c1;

    iget-object v7, p1, Lui0/b;->f:Lp1/c1;

    iget-object v8, p1, Lui0/b;->g:Lp1/c1;

    invoke-static/range {v2 .. v9}, Lui0/c;->d(Landroid/content/Context;Lh/i;Lp1/c1;Lh/i;Lp1/c1;Lp1/c1;Lp1/c1;Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-object v1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
