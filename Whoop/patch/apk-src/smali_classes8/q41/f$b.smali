.class final Lq41/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq41/f;->i(Landroidx/compose/ui/Modifier;Lq41/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic E:Z

.field final synthetic F:F

.field final synthetic w:Lq41/c;

.field final synthetic x:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
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

.field final synthetic z:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lq41/c;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/t2;ZF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq41/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Lp1/c1;",
            "Lp1/t2;",
            "ZF)V"
        }
    .end annotation

    iput-object p1, p0, Lq41/f$b;->w:Lq41/c;

    iput-object p2, p0, Lq41/f$b;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lq41/f$b;->y:Lp1/c1;

    iput-object p4, p0, Lq41/f$b;->z:Lp1/t2;

    iput-boolean p5, p0, Lq41/f$b;->E:Z

    iput p6, p0, Lq41/f$b;->F:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lq41/c;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lq41/f$b;->c(Lq41/c;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/t2;ZLq41/c;FLp1/c1;Lu2/r;F)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lq41/f$b;->d(Lp1/t2;ZLq41/c;FLp1/c1;Lu2/r;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lq41/c;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 4

    invoke-virtual {p0}, Lq41/c;->j()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Lcom/whoop/design/item/DesignItemInteraction;

    new-instance v1, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    invoke-static {p2}, Lq41/f;->q(Lp1/c1;)F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-static {p2}, Lad3/m;->b(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p2

    new-instance v2, Ll83/k;

    invoke-direct {v2, p0, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p0

    const/4 p2, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v1, p0, p2, v2, v3}, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;-><init>(Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v1, v3}, Lcom/whoop/design/item/DesignItemInteraction;-><init>(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lp1/t2;ZLq41/c;FLp1/c1;Lu2/r;F)Ll83/a0;
    .locals 1

    const-string p6, "change"

    invoke-static {p5, p6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p5}, Lu2/r;->a()V

    iget-wide p5, p5, Lu2/r;->c:J

    const/16 v0, 0x20

    shr-long/2addr p5, v0

    long-to-int p5, p5

    invoke-static {p5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p5

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    invoke-static {p5, p0, p1}, Lkd1/x;->b(FFZ)F

    move-result p0

    invoke-virtual {p2}, Lq41/c;->g()F

    move-result p1

    mul-float/2addr p0, p3

    add-float/2addr p0, p1

    invoke-static {p4, p0}, Lq41/f;->r(Lp1/c1;F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 12
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

    iget-object v3, p0, Lq41/f$b;->w:Lq41/c;

    iget-object v0, p0, Lq41/f$b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lq41/f$b;->y:Lp1/c1;

    new-instance v7, Lq41/g;

    invoke-direct {v7, v3, v0, v5}, Lq41/g;-><init>(Lq41/c;Lkotlin/jvm/functions/Function1;Lp1/c1;)V

    iget-object v1, p0, Lq41/f$b;->z:Lp1/t2;

    iget-boolean v2, p0, Lq41/f$b;->E:Z

    iget v4, p0, Lq41/f$b;->F:F

    new-instance v0, Lq41/h;

    invoke-direct/range {v0 .. v5}, Lq41/h;-><init>(Lp1/t2;ZLq41/c;FLp1/c1;)V

    const/4 v11, 0x1

    move-object v8, v7

    move-object v6, p1

    move-object v10, p2

    move-object v9, v0

    invoke-static/range {v6 .. v11}, Lh0/z0;->h(Lu2/v;Lc93/a;Lc93/a;Lc93/m;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
