.class final Lzq0/f$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzq0/f;->w(Landroidx/compose/ui/Modifier;Lzq0/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Z

.field final synthetic x:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic y:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLp1/t2;Lp1/t2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lp1/t2;",
            "Lp1/t2;",
            ")V"
        }
    .end annotation

    iput-boolean p1, p0, Lzq0/f$d;->w:Z

    iput-object p2, p0, Lzq0/f$d;->x:Lp1/t2;

    iput-object p3, p0, Lzq0/f$d;->y:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/internal/d0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzq0/f$d;->g(Lkotlin/jvm/internal/d0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/internal/d0;FZLp1/t2;Lp1/t2;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lzq0/f$d;->f(Lkotlin/jvm/internal/d0;FZLp1/t2;Lp1/t2;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/internal/d0;Lh2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzq0/f$d;->e(Lkotlin/jvm/internal/d0;Lh2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/internal/d0;Lu2/r;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzq0/f$d;->h(Lkotlin/jvm/internal/d0;Lu2/r;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lkotlin/jvm/internal/d0;Lh2/b;)Ll83/a0;
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, Lkotlin/jvm/internal/d0;->w:F

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/internal/d0;FZLp1/t2;Lp1/t2;)Ll83/a0;
    .locals 1

    iget v0, p0, Lkotlin/jvm/internal/d0;->w:F

    invoke-static {v0, p1, p2}, Lzq0/f;->X(FFZ)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p3}, Lzq0/f;->P(Lp1/t2;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-static {p4}, Lzq0/f;->O(Lp1/t2;)Lzq0/l;

    move-result-object p2

    invoke-virtual {p2}, Lzq0/l;->l()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p2

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget v0, p0, Lkotlin/jvm/internal/d0;->w:F

    invoke-static {v0, p1, p2}, Lzq0/f;->W(FFZ)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p4}, Lzq0/f;->O(Lp1/t2;)Lzq0/l;

    move-result-object p1

    invoke-virtual {p1}, Lzq0/l;->e()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p3}, Lzq0/f;->P(Lp1/t2;)Lkotlin/jvm/functions/Function1;

    move-result-object p2

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    const/4 p1, 0x0

    iput p1, p0, Lkotlin/jvm/internal/d0;->w:F

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/internal/d0;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lkotlin/jvm/internal/d0;->w:F

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/internal/d0;Lu2/r;F)Ll83/a0;
    .locals 1

    const-string v0, "change"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lu2/r;->a()V

    iget p1, p0, Lkotlin/jvm/internal/d0;->w:F

    add-float/2addr p1, p2

    iput p1, p0, Lkotlin/jvm/internal/d0;->w:F

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 10
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

    new-instance v1, Lkotlin/jvm/internal/d0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    move-object v0, p1

    check-cast v0, Lu2/h0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    iget-object v0, v0, La3/n0;->Z:Lb3/j3;

    invoke-interface {v0}, Lb3/j3;->g()F

    move-result v2

    new-instance v6, Lzq0/h;

    const/4 v7, 0x0

    invoke-direct {v6, v1, v7}, Lzq0/h;-><init>(Ljava/lang/Object;I)V

    iget-boolean v3, p0, Lzq0/f$d;->w:Z

    iget-object v4, p0, Lzq0/f$d;->x:Lp1/t2;

    iget-object v5, p0, Lzq0/f$d;->y:Lp1/t2;

    new-instance v0, Lzq0/i;

    invoke-direct/range {v0 .. v5}, Lzq0/i;-><init>(Lkotlin/jvm/internal/d0;FZLp1/t2;Lp1/t2;)V

    move v2, v7

    new-instance v7, Lzq0/e;

    const/4 v3, 0x2

    invoke-direct {v7, v1, v3}, Lzq0/e;-><init>(Ljava/lang/Object;I)V

    new-instance v5, Lzq0/j;

    invoke-direct {v5, v1, v2}, Lzq0/j;-><init>(Ljava/lang/Object;I)V

    sget v1, Lh0/z0;->a:F

    new-instance v3, Lh0/v0;

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, v6

    move-object v6, v0

    invoke-direct/range {v3 .. v9}, Lh0/v0;-><init>(Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/a;Lc93/a;Lq83/d;I)V

    invoke-static {p1, v3, p2}, Lh0/q3;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    return-object v0
.end method
