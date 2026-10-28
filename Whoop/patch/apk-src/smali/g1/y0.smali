.class public final Lg1/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lp1/c1;

.field public final synthetic x:Ll0/k1;

.field public final synthetic y:Lkotlin/jvm/functions/Function3;


# direct methods
.method public constructor <init>(Lp1/c1;Ll0/k1;Lkotlin/jvm/functions/Function3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/y0;->w:Lp1/c1;

    iput-object p2, p0, Lg1/y0;->x:Ll0/k1;

    iput-object p3, p0, Lg1/y0;->y:Lkotlin/jvm/functions/Function3;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    sget-object p2, Lg1/j1;->a:Lp1/b0;

    iget-object v0, p0, Lg1/y0;->w:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v0, v0, Li2/x;->a:J

    invoke-static {v0, v1}, Li2/x;->e(J)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p2, v0}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p2

    new-instance v0, Lg1/x0;

    iget-object v1, p0, Lg1/y0;->y:Lkotlin/jvm/functions/Function3;

    const/4 v2, 0x1

    iget-object v3, p0, Lg1/y0;->x:Ll0/k1;

    invoke-direct {v0, v3, v1, v2}, Lg1/x0;-><init>(Ll0/k1;Lkotlin/jvm/functions/Function3;I)V

    const v1, -0x33da2ede    # -4.346791E7f

    invoke-static {v1, p1, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x38

    invoke-static {p2, v0, p1, v1}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
