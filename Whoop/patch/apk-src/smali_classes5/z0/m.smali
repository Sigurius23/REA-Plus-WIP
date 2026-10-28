.class public final Lz0/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lz0/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz0/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lz0/m;->a:Lz0/m;

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;Landroidx/compose/runtime/Composer;I)V
    .locals 5

    check-cast p2, Lp1/q;

    const v0, 0xf5caf94

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p3

    and-int/lit8 v2, v0, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v2, v1, :cond_1

    move v1, v4

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    and-int/2addr v0, v4

    invoke-virtual {p2, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lb2/t;->w:Lb2/t;

    sget v1, Lg0/e;->j:F

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_2

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_3

    :cond_2
    new-instance v2, Lx30/h1;

    const/16 v1, 0xa

    invoke-direct {v2, p1, v1}, Lx30/h1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, p2, v3}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_2

    :cond_4
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_5

    new-instance v0, Lx30/f1;

    const/16 v1, 0xa

    invoke-direct {v0, p0, p1, p3, v1}, Lx30/f1;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method public final b(Landroid/graphics/drawable/Icon;Landroidx/compose/runtime/Composer;I)V
    .locals 4

    check-cast p2, Lp1/q;

    const v0, 0x7e274b59

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    move v1, v3

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    and-int/2addr v0, v3

    invoke-virtual {p2, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {p2, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_2

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_3

    :cond_2
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Icon;->loadDrawable(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {p2, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v2, Landroid/graphics/drawable/Drawable;

    if-nez v2, :cond_4

    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Lz0/l;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p3, v1}, Lz0/l;-><init>(Lz0/m;Landroid/graphics/drawable/Icon;II)V

    :goto_2
    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_4
    const/16 v0, 0x30

    invoke-virtual {p0, v2, p2, v0}, Lz0/m;->a(Landroid/graphics/drawable/Drawable;Landroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_5
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Lz0/l;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, Lz0/l;-><init>(Lz0/m;Landroid/graphics/drawable/Icon;II)V

    goto :goto_2

    :cond_6
    return-void
.end method
