.class final Ly21/i$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly21/i;->F(FFFIIJLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic E:F

.field final synthetic F:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic G:I

.field final synthetic H:F

.field final synthetic w:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic x:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic y:Z

.field final synthetic z:F


# direct methods
.method public constructor <init>(Lp1/t2;Lp1/t2;ZFFLp1/t2;IF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            "Lp1/t2;",
            "ZFF",
            "Lp1/t2;",
            "IF)V"
        }
    .end annotation

    iput-object p1, p0, Ly21/i$d;->w:Lp1/t2;

    iput-object p2, p0, Ly21/i$d;->x:Lp1/t2;

    iput-boolean p3, p0, Ly21/i$d;->y:Z

    iput p4, p0, Ly21/i$d;->z:F

    iput p5, p0, Ly21/i$d;->E:F

    iput-object p6, p0, Ly21/i$d;->F:Lp1/t2;

    iput p7, p0, Ly21/i$d;->G:I

    iput p8, p0, Ly21/i$d;->H:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lp1/t2;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ly21/i$d;->e(Lp1/t2;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/t2;ZFFLp1/t2;IFLu2/r;F)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Ly21/i$d;->f(Lp1/t2;ZFFLp1/t2;IFLu2/r;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/t2;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ly21/i$d;->d(Lp1/t2;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lp1/t2;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ly21/i;->S(Lp1/t2;)Lc93/a;

    move-result-object p0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lp1/t2;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ly21/i;->S(Lp1/t2;)Lc93/a;

    move-result-object p0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lp1/t2;ZFFLp1/t2;IFLu2/r;F)Ll83/a0;
    .locals 1

    const-string p8, "change"

    invoke-static {p7, p8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p7}, Lu2/r;->a()V

    iget-wide p7, p7, Lu2/r;->c:J

    const/16 v0, 0x20

    shr-long/2addr p7, v0

    long-to-int p7, p7

    invoke-static {p7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p7

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    invoke-static {p7, p0, p1}, Lkd1/x;->b(FFZ)F

    move-result p0

    invoke-static {p4}, Ly21/i;->R(Lp1/t2;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    mul-float/2addr p0, p3

    add-float/2addr p0, p2

    invoke-static {p5, p2, p6, p0}, Ly21/i;->T(IFFF)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

    iget-object v0, p0, Ly21/i$d;->w:Lp1/t2;

    new-instance v2, Ly21/j;

    const/4 v1, 0x0

    invoke-direct {v2, v0, v1}, Ly21/j;-><init>(Lp1/t2;I)V

    new-instance v3, Ly21/j;

    const/4 v1, 0x1

    invoke-direct {v3, v0, v1}, Ly21/j;-><init>(Lp1/t2;I)V

    iget-object v5, p0, Ly21/i$d;->x:Lp1/t2;

    iget-boolean v6, p0, Ly21/i$d;->y:Z

    iget v7, p0, Ly21/i$d;->z:F

    iget v8, p0, Ly21/i$d;->E:F

    iget-object v9, p0, Ly21/i$d;->F:Lp1/t2;

    iget v10, p0, Ly21/i$d;->G:I

    iget v11, p0, Ly21/i$d;->H:F

    new-instance v4, Ly21/k;

    invoke-direct/range {v4 .. v11}, Ly21/k;-><init>(Lp1/t2;ZFFLp1/t2;IF)V

    const/4 v6, 0x1

    move-object v1, p1

    move-object v5, p2

    invoke-static/range {v1 .. v6}, Lh0/z0;->h(Lu2/v;Lc93/a;Lc93/a;Lc93/m;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
