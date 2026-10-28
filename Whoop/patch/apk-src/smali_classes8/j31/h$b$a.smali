.class final Lj31/h$b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj31/h$b;->invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
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
        "Lu2/v;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lu2/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.molecule.reordable.ReorderableKt$reorderable$1$1"
    f = "Reorderable.kt"
    l = {
        0x23,
        0x24,
        0x2b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lj31/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj31/m<",
            "*>;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lj31/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj31/m<",
            "*>;",
            "Lq83/d<",
            "-",
            "Lj31/h$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj31/h$b$a;->E:Lj31/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lj31/m;Lu2/r;Lh2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lj31/h$b$a;->m(Lj31/m;Lu2/r;Lh2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lj31/m;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lj31/h$b$a;->l(Lj31/m;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lj31/m;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lj31/h$b$a;->k(Lj31/m;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lj31/m;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lj31/m;->Q()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lj31/m;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lj31/m;->Q()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lj31/m;Lu2/r;Lh2/b;)Ll83/a0;
    .locals 4

    invoke-virtual {p1}, Lu2/r;->a()V

    iget-wide v0, p2, Lh2/b;->a:J

    const/16 p1, 0x20

    shr-long/2addr v0, p1

    long-to-int p1, v0

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    float-to-int p1, p1

    iget-wide v0, p2, Lh2/b;->a:J

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p2, v0

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    float-to-int p2, p2

    invoke-virtual {p0, p1, p2}, Lj31/m;->P(II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
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

    new-instance v0, Lj31/h$b$a;

    iget-object v1, p0, Lj31/h$b$a;->E:Lj31/m;

    invoke-direct {v0, v1, p2}, Lj31/h$b$a;-><init>(Lj31/m;Lq83/d;)V

    iput-object p1, v0, Lj31/h$b$a;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu2/v;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lj31/h$b$a;->j(Lu2/v;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lj31/h$b$a;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lu2/v;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lj31/h$b$a;->y:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lj31/h$b$a;->x:Ljava/lang/Object;

    check-cast v0, Lu2/r;

    iget-object v0, p0, Lj31/h$b$a;->w:Ljava/lang/Object;

    check-cast v0, Lj31/p;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, Lj31/h$b$a;->w:Ljava/lang/Object;

    check-cast v2, Lj31/p;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lj31/h$b$a;->E:Lj31/m;

    invoke-virtual {p1}, Lj31/m;->C()Ldc3/l;

    move-result-object p1

    iput-object v1, p0, Lj31/h$b$a;->z:Ljava/lang/Object;

    iput v5, p0, Lj31/h$b$a;->y:I

    invoke-interface {p1, p0}, Ldc3/w;->i(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto/16 :goto_2

    :cond_4
    :goto_0
    move-object v2, p1

    check-cast v2, Lj31/p;

    new-instance p1, Lj31/h$b$a$a;

    invoke-direct {p1, v2, v6}, Lj31/h$b$a$a;-><init>(Lj31/p;Lq83/d;)V

    iput-object v1, p0, Lj31/h$b$a;->z:Ljava/lang/Object;

    iput-object v2, p0, Lj31/h$b$a;->w:Ljava/lang/Object;

    iput v4, p0, Lj31/h$b$a;->y:I

    move-object v4, v1

    check-cast v4, Lu2/h0;

    invoke-virtual {v4, p1, p0}, Lu2/h0;->X0(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    check-cast p1, Lu2/r;

    if-eqz p1, :cond_7

    iget-wide v4, p1, Lu2/r;->c:J

    iget-object v7, p0, Lj31/h$b$a;->E:Lj31/m;

    const/16 v8, 0x20

    shr-long v9, v4, v8

    long-to-int v9, v9

    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    float-to-int v9, v9

    const-wide v10, 0xffffffffL

    and-long/2addr v4, v10

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v7, v9, v4}, Lj31/m;->R(II)Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-virtual {v2}, Lj31/p;->b()Lh2/b;

    move-result-object v2

    if-eqz v2, :cond_6

    iget-object v4, p0, Lj31/h$b$a;->E:Lj31/m;

    iget-wide v12, v2, Lh2/b;->a:J

    shr-long v7, v12, v8

    long-to-int v2, v7

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    float-to-int v2, v2

    and-long v7, v12, v10

    long-to-int v5, v7

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    float-to-int v5, v5

    invoke-virtual {v4, v2, v5}, Lj31/m;->P(II)V

    :cond_6
    iget-wide v4, p1, Lu2/r;->a:J

    iget-object p1, p0, Lj31/h$b$a;->E:Lj31/m;

    move-wide v7, v4

    new-instance v4, Lj31/i;

    const/4 v2, 0x0

    invoke-direct {v4, p1, v2}, Lj31/i;-><init>(Lj31/m;I)V

    new-instance v5, Lj31/i;

    const/4 v2, 0x1

    invoke-direct {v5, p1, v2}, Lj31/i;-><init>(Lj31/m;I)V

    new-instance v2, Lj31/j;

    const/4 v9, 0x0

    invoke-direct {v2, p1, v9}, Lj31/j;-><init>(Lj31/m;I)V

    iput-object v6, p0, Lj31/h$b$a;->z:Ljava/lang/Object;

    iput-object v6, p0, Lj31/h$b$a;->w:Ljava/lang/Object;

    iput-object v6, p0, Lj31/h$b$a;->x:Ljava/lang/Object;

    iput v3, p0, Lj31/h$b$a;->y:I

    move-object v6, v2

    move-wide v2, v7

    move-object v7, p0

    invoke-static/range {v1 .. v7}, Lj31/h;->a(Lu2/v;JLc93/a;Lc93/a;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_2
    return-object v0

    :cond_7
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final j(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/v;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lj31/h$b$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj31/h$b$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj31/h$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
