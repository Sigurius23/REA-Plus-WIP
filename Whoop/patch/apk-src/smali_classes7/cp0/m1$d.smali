.class final Lcp0/m1$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcp0/m1;->x(Landroidx/compose/ui/Modifier;Lcp0/y0;)Landroidx/compose/ui/Modifier;
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
.field final synthetic w:Lcp0/y0;


# direct methods
.method public constructor <init>(Lcp0/y0;)V
    .locals 0

    iput-object p1, p0, Lcp0/m1$d;->w:Lcp0/y0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcp0/y0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcp0/m1$d;->g(Lcp0/y0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcp0/y0;Lu2/r;Lh2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcp0/m1$d;->h(Lcp0/y0;Lu2/r;Lh2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcp0/y0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcp0/m1$d;->f(Lcp0/y0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcp0/y0;Lh2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcp0/m1$d;->e(Lcp0/y0;Lh2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lcp0/y0;Lh2/b;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lcp0/y0;->k()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcp0/y0;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lcp0/y0;->j()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcp0/y0;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lcp0/y0;->i()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lcp0/y0;Lu2/r;Lh2/b;)Ll83/a0;
    .locals 2

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide p1, p2, Lh2/b;->a:J

    const-wide v0, 0xffffffffL

    and-long/2addr p1, v0

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-virtual {p0, p1}, Lcp0/y0;->h(F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 7
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

    iget-object v0, p0, Lcp0/m1$d;->w:Lcp0/y0;

    new-instance v2, Lcp0/n1;

    const/4 v1, 0x1

    invoke-direct {v2, v0, v1}, Lcp0/n1;-><init>(Lcp0/y0;I)V

    new-instance v3, Lcp0/o1;

    const/4 v1, 0x2

    invoke-direct {v3, v0, v1}, Lcp0/o1;-><init>(Lcp0/y0;I)V

    new-instance v4, Lcp0/o1;

    const/4 v1, 0x3

    invoke-direct {v4, v0, v1}, Lcp0/o1;-><init>(Lcp0/y0;I)V

    new-instance v5, Lcp0/p1;

    const/4 v1, 0x1

    invoke-direct {v5, v0, v1}, Lcp0/p1;-><init>(Lcp0/y0;I)V

    move-object v1, p1

    move-object v6, p2

    invoke-static/range {v1 .. v6}, Lh0/z0;->f(Lu2/v;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
