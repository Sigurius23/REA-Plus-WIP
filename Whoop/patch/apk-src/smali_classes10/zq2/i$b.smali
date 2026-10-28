.class final Lzq2/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzq2/i;->k(Lzq2/f;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic w:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic x:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lzq2/i$b;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lzq2/i$b;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lp1/c1;Lh2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzq2/i$b;->b(Lkotlin/jvm/functions/Function1;Lp1/c1;Lh2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lkotlin/jvm/functions/Function1;Lp1/c1;Lh2/b;)Ll83/a0;
    .locals 3

    iget-wide v0, p2, Lh2/b;->a:J

    invoke-static {p1}, Lzq2/i;->J(Lp1/c1;)J

    move-result-wide p1

    const/16 v2, 0x20

    shr-long/2addr p1, v2

    long-to-int p1, p1

    invoke-static {v0, v1, p1}, Lzq2/i;->K(JI)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lrq2/t0$a;->a:Lrq2/t0$a;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sget-object p1, Lrq2/t0$b;->a:Lrq2/t0$b;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

    iget-object v0, p0, Lzq2/i$b;->w:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lzq2/i$b;->x:Lp1/c1;

    new-instance v6, Lzq2/j;

    const/4 v2, 0x0

    invoke-direct {v6, v0, v1, v2}, Lzq2/j;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    const/4 v8, 0x7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    move-object v7, p2

    invoke-static/range {v2 .. v8}, Lh0/o3;->e(Lu2/v;Lkotlin/jvm/functions/Function1;Lm12/c;Lg1/d6;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
