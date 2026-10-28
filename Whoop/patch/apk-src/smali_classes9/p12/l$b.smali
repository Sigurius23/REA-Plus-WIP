.class final Lp12/l$b;
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


# direct methods
.method public constructor <init>(Lc93/a;Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lp12/l$b;->w:Lc93/a;

    iput-object p2, p0, Lp12/l$b;->x:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(ILc93/a;Lc93/a;Lh2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lp12/l$b;->b(ILc93/a;Lc93/a;Lh2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(ILc93/a;Lc93/a;Lh2/b;)Ll83/a0;
    .locals 2

    iget-wide v0, p3, Lh2/b;->a:J

    invoke-static {v0, v1, p0}, Lp12/l;->r(JI)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    :goto_0
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

    move-object v0, p1

    check-cast v0, Lu2/h0;

    iget-wide v0, v0, Lu2/h0;->Y:J

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    long-to-int v0, v0

    iget-object v1, p0, Lp12/l$b;->w:Lc93/a;

    iget-object v2, p0, Lp12/l$b;->x:Lc93/a;

    new-instance v7, Lp12/m;

    invoke-direct {v7, v0, v1, v2}, Lp12/m;-><init>(ILc93/a;Lc93/a;)V

    const/4 v9, 0x7

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p1

    move-object v8, p2

    invoke-static/range {v3 .. v9}, Lh0/o3;->e(Lu2/v;Lkotlin/jvm/functions/Function1;Lm12/c;Lg1/d6;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
