.class final Ln31/h$a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln31/h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "query",
        "Ll83/a0;",
        "<anonymous>",
        "(Ljava/lang/String;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.molecule.searcharchmini.SearchArchMiniWrapperKt$SearchArchMiniWrapper$2$1$2"
    f = "SearchArchMiniWrapper.kt"
    l = {
        0x42
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ln31/i;

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

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic z:Lld1/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lld1/c<",
            "Ln31/e;",
            "Ln31/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lp1/t2;Lld1/c;Ln31/i;Lp1/t2;Lp1/t2;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            "Lld1/c<",
            "Ln31/e;",
            "Ln31/c;",
            ">;",
            "Ln31/i;",
            "Lp1/t2;",
            "Lp1/t2;",
            "Lq83/d<",
            "-",
            "Ln31/h$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ln31/h$a$a;->y:Lp1/t2;

    iput-object p2, p0, Ln31/h$a$a;->z:Lld1/c;

    iput-object p3, p0, Ln31/h$a$a;->E:Ln31/i;

    iput-object p4, p0, Ln31/h$a$a;->F:Lp1/t2;

    iput-object p5, p0, Ln31/h$a$a;->G:Lp1/t2;

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

    new-instance v0, Ln31/h$a$a;

    iget-object v1, p0, Ln31/h$a$a;->y:Lp1/t2;

    iget-object v2, p0, Ln31/h$a$a;->z:Lld1/c;

    iget-object v3, p0, Ln31/h$a$a;->E:Ln31/i;

    iget-object v4, p0, Ln31/h$a$a;->F:Lp1/t2;

    iget-object v5, p0, Ln31/h$a$a;->G:Lp1/t2;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Ln31/h$a$a;-><init>(Lp1/t2;Lld1/c;Ln31/i;Lp1/t2;Lp1/t2;Lq83/d;)V

    iput-object p1, v0, Ln31/h$a$a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln31/h$a$a;->invoke(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Ln31/h$a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln31/h$a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln31/h$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Ln31/h$a$a;->x:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ln31/h$a$a;->w:I

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

    iget-object p1, p0, Ln31/h$a$a;->y:Lp1/t2;

    invoke-static {p1}, Ln31/h;->u(Lp1/t2;)J

    move-result-wide v3

    iput-object v5, p0, Ln31/h$a$a;->x:Ljava/lang/Object;

    iput v2, p0, Ln31/h$a$a;->w:I

    invoke-static {v3, v4, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object v1, p0, Ln31/h$a$a;->z:Lld1/c;

    iget-object v2, p0, Ln31/h$a$a;->E:Ln31/i;

    iget-object v3, p0, Ln31/h$a$a;->F:Lp1/t2;

    iget-object v4, p0, Ln31/h$a$a;->G:Lp1/t2;

    const/4 v6, 0x1

    invoke-static/range {v1 .. v6}, Ln31/h;->s(Lld1/c;Ln31/i;Lp1/t2;Lp1/t2;Ljava/lang/String;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
