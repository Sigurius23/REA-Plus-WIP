.class final Lzq0/f$c;
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

.field final synthetic x:F

.field final synthetic y:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic z:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZFLp1/t2;Lp1/t2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZF",
            "Lp1/t2;",
            "Lp1/t2;",
            ")V"
        }
    .end annotation

    iput-boolean p1, p0, Lzq0/f$c;->w:Z

    iput p2, p0, Lzq0/f$c;->x:F

    iput-object p3, p0, Lzq0/f$c;->y:Lp1/t2;

    iput-object p4, p0, Lzq0/f$c;->z:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lu2/v;ZFLp1/t2;Lp1/t2;Lh2/b;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzq0/f$c;->b(Lu2/v;ZFLp1/t2;Lp1/t2;Lh2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lu2/v;ZFLp1/t2;Lp1/t2;Lh2/b;)Ll83/a0;
    .locals 4

    iget-wide v0, p5, Lh2/b;->a:J

    check-cast p0, Lu2/h0;

    iget-wide v2, p0, Lu2/h0;->Y:J

    const/16 p0, 0x20

    shr-long/2addr v2, p0

    long-to-int p0, v2

    invoke-static {v0, v1, p0, p1, p2}, Lzq0/n;->a(JIZF)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p3}, Lzq0/f;->O(Lp1/t2;)Lzq0/l;

    move-result-object p0

    invoke-virtual {p0}, Lzq0/l;->e()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p4}, Lzq0/f;->P(Lp1/t2;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {p4}, Lzq0/f;->P(Lp1/t2;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    invoke-static {p3}, Lzq0/f;->O(Lp1/t2;)Lzq0/l;

    move-result-object p1

    invoke-virtual {p1}, Lzq0/l;->l()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 13
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

    iget-boolean v2, p0, Lzq0/f$c;->w:Z

    iget v3, p0, Lzq0/f$c;->x:F

    iget-object v4, p0, Lzq0/f$c;->y:Lp1/t2;

    iget-object v5, p0, Lzq0/f$c;->z:Lp1/t2;

    new-instance v0, Lzq0/g;

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lzq0/g;-><init>(Lu2/v;ZFLp1/t2;Lp1/t2;)V

    const/4 v12, 0x7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v11, p2

    move-object v10, v0

    move-object v6, v1

    invoke-static/range {v6 .. v12}, Lh0/o3;->e(Lu2/v;Lkotlin/jvm/functions/Function1;Lm12/c;Lg1/d6;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
