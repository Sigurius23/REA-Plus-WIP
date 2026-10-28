.class public final Lc21/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc21/b;->g(Landroidx/compose/ui/Modifier;Lc21/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/n;"
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
.field final synthetic w:Ljava/util/List;

.field final synthetic x:Lc21/d;


# direct methods
.method public constructor <init>(Ljava/util/List;Lc21/d;)V
    .locals 0

    iput-object p1, p0, Lc21/b$c;->w:Ljava/util/List;

    iput-object p2, p0, Lc21/b$c;->x:Lc21/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 6

    and-int/lit8 v0, p4, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_1

    move-object v0, p3

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    or-int/2addr p1, p4

    goto :goto_1

    :cond_1
    move p1, p4

    :goto_1
    and-int/lit8 p4, p4, 0x30

    if-nez p4, :cond_3

    move-object p4, p3

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p2}, Lp1/q;->e(I)Z

    move-result p4

    if-eqz p4, :cond_2

    const/16 p4, 0x20

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr p1, p4

    :cond_3
    and-int/lit16 p4, p1, 0x93

    const/16 v0, 0x92

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq p4, v0, :cond_4

    move p4, v2

    goto :goto_3

    :cond_4
    move p4, v3

    :goto_3
    and-int/2addr p1, v2

    check-cast p3, Lp1/q;

    invoke-virtual {p3, p1, p4}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lc21/b$c;->w:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc21/e;

    const p2, -0x40c9373b    # -0.714001f

    invoke-virtual {p3, p2}, Lp1/q;->e0(I)V

    const-wide/high16 v4, 0x3fe8000000000000L    # 0.75

    double-to-float p2, v4

    const/16 p4, 0x8

    int-to-float p4, p4

    mul-float/2addr p2, p4

    sget-object p4, Lb2/t;->w:Lb2/t;

    invoke-static {p2, p4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {p3, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {p1, p3, v3}, Lc21/b;->m(Lc21/e;Landroidx/compose/runtime/Composer;I)V

    invoke-static {p2, p4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-static {p3, p2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    iget-object p2, p0, Lc21/b$c;->x:Lc21/d;

    invoke-virtual {p2}, Lc21/d;->b()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    const p1, -0x40c56eba

    invoke-virtual {p3, p1}, Lp1/q;->e0(I)V

    int-to-float p1, v2

    invoke-static {p1, p4}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const/16 p2, 0x12

    int-to-float p2, p2

    int-to-float p4, v1

    mul-float/2addr p2, p4

    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object p2, Li2/w0;->a:Li2/v0;

    invoke-static {p1, p2}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object p4, Lx81/d;->a:Lx81/d;

    const/4 v0, 0x6

    invoke-virtual {p4, p3, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p4

    invoke-virtual {p4}, Ly81/i;->W0()J

    move-result-wide v0

    invoke-static {p1, v0, v1, p2}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-static {p1, p3, v3}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_5
    const p1, -0x40c0581f

    invoke-virtual {p3, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    return-void

    :cond_6
    invoke-virtual {p3}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lc21/b$c;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
