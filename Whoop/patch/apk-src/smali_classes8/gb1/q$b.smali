.class final Lgb1/q$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb1/q;->i(Ln0/u;Lc93/a;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.design.modifier.LazyListModifiersKt$OnBottomReached$1$1"
    f = "LazyListModifiers.kt"
    l = {
        0x42
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Ln0/u;

.field final synthetic z:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln0/u;Lc93/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/u;",
            "Lc93/a;",
            "Lq83/d<",
            "-",
            "Lgb1/q$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lgb1/q$b;->y:Ln0/u;

    iput-object p2, p0, Lgb1/q$b;->z:Lc93/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Ln0/u;Lkotlin/jvm/internal/b0;)Z
    .locals 0

    invoke-static {p0, p1}, Lgb1/q$b;->h(Ln0/u;Lkotlin/jvm/internal/b0;)Z

    move-result p0

    return p0
.end method

.method private static final h(Ln0/u;Lkotlin/jvm/internal/b0;)Z
    .locals 5

    iget-object v0, p0, Ln0/u;->e:Ll2/a;

    iget-object v0, v0, Ll2/a;->c:Ljava/lang/Object;

    check-cast v0, Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    const/4 v1, 0x1

    if-gtz v0, :cond_0

    iget-object v0, p0, Ln0/u;->e:Ll2/a;

    iget-object v0, v0, Ll2/a;->b:Ljava/lang/Object;

    check-cast v0, Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    if-lez v0, :cond_1

    :cond_0
    iput-boolean v1, p1, Lkotlin/jvm/internal/b0;->w:Z

    :cond_1
    invoke-virtual {p0}, Ln0/u;->h()Ln0/n;

    move-result-object p0

    iget-object v0, p0, Ln0/n;->k:Ljava/lang/Object;

    invoke-static {v0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/g;

    iget v2, p0, Ln0/n;->n:I

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    if-lez v2, :cond_3

    check-cast v0, Ln0/o;

    iget v4, v0, Ln0/o;->a:I

    sub-int/2addr v2, v1

    if-ne v4, v2, :cond_2

    move v2, v1

    goto :goto_0

    :cond_2
    move v2, v3

    :goto_0
    iget v4, v0, Ln0/o;->o:I

    iget v0, v0, Ln0/o;->p:I

    add-int/2addr v4, v0

    iget p0, p0, Ln0/n;->m:I

    if-eqz v2, :cond_3

    if-gt v4, p0, :cond_3

    iget-boolean p0, p1, Lkotlin/jvm/internal/b0;->w:Z

    if-eqz p0, :cond_3

    return v1

    :cond_3
    return v3
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

    new-instance p1, Lgb1/q$b;

    iget-object v0, p0, Lgb1/q$b;->y:Ln0/u;

    iget-object v1, p0, Lgb1/q$b;->z:Lc93/a;

    invoke-direct {p1, v0, v1, p2}, Lgb1/q$b;-><init>(Ln0/u;Lc93/a;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lgb1/q$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lgb1/q$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lgb1/q$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lgb1/q$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lgb1/q$b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lgb1/q$b;->w:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/b0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lkotlin/jvm/internal/b0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lgb1/q$b;->y:Ln0/u;

    new-instance v3, Lgb1/r;

    invoke-direct {v3, v1, p1}, Lgb1/r;-><init>(Ln0/u;Lkotlin/jvm/internal/b0;)V

    invoke-static {v3}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v1, Lgb1/q$b$b;

    invoke-direct {v1, p1}, Lgb1/q$b$b;-><init>(Lec3/l;)V

    new-instance p1, Lgb1/q$b$a;

    iget-object v3, p0, Lgb1/q$b;->z:Lc93/a;

    invoke-direct {p1, v3}, Lgb1/q$b$a;-><init>(Lc93/a;)V

    const/4 v3, 0x0

    iput-object v3, p0, Lgb1/q$b;->w:Ljava/lang/Object;

    iput v2, p0, Lgb1/q$b;->x:I

    invoke-interface {v1, p1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
