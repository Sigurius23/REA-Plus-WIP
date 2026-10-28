.class final Lp12/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp12/l;->h(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp12/l$a$a;
    }
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
.field final synthetic w:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic x:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic y:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc93/a;Lc93/a;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lp12/l$a;->w:Lc93/a;

    iput-object p2, p0, Lp12/l$a;->x:Lc93/a;

    iput-object p3, p0, Lp12/l$a;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lp1/c1;Lu2/r;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lp12/l$a;->d(Lp1/c1;Lu2/r;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;Lc93/a;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lp12/l$a;->c(Lc93/a;Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lc93/a;Lc93/a;Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p2}, Lp12/l;->p(Lp1/c1;)Lp12/d0;

    move-result-object p2

    sget-object v0, Lp12/l$a$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 p0, 0x2

    if-eq p2, p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lp1/c1;Lu2/r;F)Ll83/a0;
    .locals 1

    const-string v0, "change"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lu2/r;->a()V

    const/4 p1, 0x0

    cmpg-float v0, p2, p1

    if-gez v0, :cond_0

    sget-object p1, Lp12/d0;->NEXT:Lp12/d0;

    invoke-static {p0, p1}, Lp12/l;->q(Lp1/c1;Lp12/d0;)V

    goto :goto_0

    :cond_0
    cmpl-float p1, p2, p1

    if-lez p1, :cond_1

    sget-object p1, Lp12/d0;->PREVIOUS:Lp12/d0;

    invoke-static {p0, p1}, Lp12/l;->q(Lp1/c1;Lp12/d0;)V

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 9
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

    iget-object v0, p0, Lp12/l$a;->w:Lc93/a;

    iget-object v1, p0, Lp12/l$a;->x:Lc93/a;

    iget-object v2, p0, Lp12/l$a;->y:Lp1/c1;

    new-instance v4, Lp12/j;

    invoke-direct {v4, v0, v1, v2}, Lp12/j;-><init>(Lc93/a;Lc93/a;Lp1/c1;)V

    new-instance v6, Lp12/k;

    invoke-direct {v6, v2}, Lp12/k;-><init>(Lp1/c1;)V

    const/4 v8, 0x5

    const/4 v5, 0x0

    move-object v3, p1

    move-object v7, p2

    invoke-static/range {v3 .. v8}, Lh0/z0;->h(Lu2/v;Lc93/a;Lc93/a;Lc93/m;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
