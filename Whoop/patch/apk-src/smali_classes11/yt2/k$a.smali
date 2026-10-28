.class final Lyt2/k$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyt2/k;->x(Lwt2/k$c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.weeklyplan.weeklyplan.view.SummaryV2ScreenKt$Success$2$1"
    f = "SummaryV2Screen.kt"
    l = {
        0x95,
        0x96
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
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

.field final synthetic x:Z

.field final synthetic y:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic z:Lp1/z0;


# direct methods
.method public constructor <init>(ZLp1/c1;Lp1/z0;Lp1/c1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lp1/c1;",
            "Lp1/z0;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lyt2/k$a;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lyt2/k$a;->x:Z

    iput-object p2, p0, Lyt2/k$a;->y:Lp1/c1;

    iput-object p3, p0, Lyt2/k$a;->z:Lp1/z0;

    iput-object p4, p0, Lyt2/k$a;->E:Lp1/c1;

    iput-object p5, p0, Lyt2/k$a;->F:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lp1/z0;FF)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lyt2/k$a;->h(Lp1/z0;FF)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lp1/z0;FF)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lyt2/k;->j0(Lp1/z0;F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

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

    new-instance v0, Lyt2/k$a;

    iget-boolean v1, p0, Lyt2/k$a;->x:Z

    iget-object v2, p0, Lyt2/k$a;->y:Lp1/c1;

    iget-object v3, p0, Lyt2/k$a;->z:Lp1/z0;

    iget-object v4, p0, Lyt2/k$a;->E:Lp1/c1;

    iget-object v5, p0, Lyt2/k$a;->F:Lp1/c1;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lyt2/k$a;-><init>(ZLp1/c1;Lp1/z0;Lp1/c1;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lyt2/k$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lyt2/k$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lyt2/k$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lyt2/k$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lyt2/k$a;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lyt2/k$a;->x:Z

    if-nez p1, :cond_5

    iget-object p1, p0, Lyt2/k$a;->y:Lp1/c1;

    invoke-static {p1, v3}, Lyt2/k;->e0(Lp1/c1;Z)V

    iput v3, p0, Lyt2/k$a;->w:I

    const-wide/16 v4, 0x3e8

    invoke-static {v4, v5, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    move-object v10, p0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    const/4 v1, 0x6

    const/16 v4, 0x898

    const/4 v5, 0x0

    invoke-static {v4, p1, v5, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v8

    iget-object p1, p0, Lyt2/k$a;->z:Lp1/z0;

    new-instance v9, Lyt2/j;

    const/4 v1, 0x0

    invoke-direct {v9, p1, v1}, Lyt2/j;-><init>(Ljava/lang/Object;I)V

    iput v2, p0, Lyt2/k$a;->w:I

    const/4 v6, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v11, 0x4

    move-object v10, p0

    invoke-static/range {v6 .. v11}, Ld0/f;->e(FFLd0/l;Lc93/m;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    iget-object p1, v10, Lyt2/k$a;->E:Lp1/c1;

    invoke-static {p1, v3}, Lyt2/k;->h0(Lp1/c1;Z)V

    iget-object p1, v10, Lyt2/k$a;->F:Lp1/c1;

    invoke-static {p1, v3}, Lyt2/k;->i0(Lp1/c1;Z)V

    goto :goto_3

    :cond_5
    move-object v10, p0

    iget-object p1, v10, Lyt2/k$a;->z:Lp1/z0;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p1, v0}, Lyt2/k;->j0(Lp1/z0;F)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
