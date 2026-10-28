.class final Ln31/h$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln31/h;->f(Landroidx/compose/ui/Modifier;Ln31/i;Lkotlin/jvm/functions/Function1;Ln31/e;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.design.atomic.molecule.searcharchmini.SearchArchMiniWrapperKt$SearchArchMiniWrapper$2$1"
    f = "SearchArchMiniWrapper.kt"
    l = {
        0x41
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic F:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic G:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic y:Lld1/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lld1/c<",
            "Ln31/e;",
            "Ln31/c;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic z:Ln31/i;


# direct methods
.method public constructor <init>(Lp1/c1;Lld1/c;Ln31/i;Lp1/t2;Lp1/t2;Lp1/t2;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lld1/c<",
            "Ln31/e;",
            "Ln31/c;",
            ">;",
            "Ln31/i;",
            "Lp1/t2;",
            "Lp1/t2;",
            "Lp1/t2;",
            "Lq83/d<",
            "-",
            "Ln31/h$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ln31/h$a;->x:Lp1/c1;

    iput-object p2, p0, Ln31/h$a;->y:Lld1/c;

    iput-object p3, p0, Ln31/h$a;->z:Ln31/i;

    iput-object p4, p0, Ln31/h$a;->E:Lp1/t2;

    iput-object p5, p0, Ln31/h$a;->F:Lp1/t2;

    iput-object p6, p0, Ln31/h$a;->G:Lp1/t2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lp1/c1;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Ln31/h$a;->h(Lp1/c1;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lp1/c1;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Ln31/h;->t(Lp1/c1;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8
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

    new-instance v0, Ln31/h$a;

    iget-object v1, p0, Ln31/h$a;->x:Lp1/c1;

    iget-object v2, p0, Ln31/h$a;->y:Lld1/c;

    iget-object v3, p0, Ln31/h$a;->z:Ln31/i;

    iget-object v4, p0, Ln31/h$a;->E:Lp1/t2;

    iget-object v5, p0, Ln31/h$a;->F:Lp1/t2;

    iget-object v6, p0, Ln31/h$a;->G:Lp1/t2;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Ln31/h$a;-><init>(Lp1/c1;Lld1/c;Ln31/i;Lp1/t2;Lp1/t2;Lp1/t2;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Ln31/h$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln31/h$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln31/h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln31/h$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ln31/h$a;->w:I

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

    iget-object v3, p0, Ln31/h$a;->y:Lld1/c;

    iget-object v4, p0, Ln31/h$a;->z:Ln31/i;

    iget-object v5, p0, Ln31/h$a;->E:Lp1/t2;

    iget-object v6, p0, Ln31/h$a;->F:Lp1/t2;

    iget-object p1, p0, Ln31/h$a;->x:Lp1/c1;

    invoke-static {p1}, Ln31/h;->t(Lp1/c1;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Ln31/h;->s(Lld1/c;Ln31/i;Lp1/t2;Lp1/t2;Ljava/lang/String;Z)V

    iget-object p1, p0, Ln31/h$a;->x:Lp1/c1;

    new-instance v1, Ln31/g;

    const/4 v3, 0x0

    invoke-direct {v1, p1, v3}, Ln31/g;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    invoke-static {p1, v2}, Lec3/v;->v(Lec3/l;I)Lec3/h0;

    move-result-object p1

    new-instance v3, Ln31/h$a$a;

    iget-object v4, p0, Ln31/h$a;->G:Lp1/t2;

    iget-object v5, p0, Ln31/h$a;->y:Lld1/c;

    iget-object v6, p0, Ln31/h$a;->z:Ln31/i;

    iget-object v7, p0, Ln31/h$a;->E:Lp1/t2;

    iget-object v8, p0, Ln31/h$a;->F:Lp1/t2;

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v9}, Ln31/h$a$a;-><init>(Lp1/t2;Lld1/c;Ln31/i;Lp1/t2;Lp1/t2;Lq83/d;)V

    iput v2, p0, Ln31/h$a;->w:I

    invoke-static {p1, v3, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
