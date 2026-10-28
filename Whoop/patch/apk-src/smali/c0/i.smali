.class public final Lc0/i;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:Lz1/p;

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lc0/x;

.field public final synthetic z:Lc93/n;


# direct methods
.method public constructor <init>(Lz1/p;Ljava/lang/Object;Lc0/x;Lc93/n;)V
    .locals 0

    iput-object p1, p0, Lc0/i;->w:Lz1/p;

    iput-object p2, p0, Lc0/i;->x:Ljava/lang/Object;

    iput-object p3, p0, Lc0/i;->y:Lc0/x;

    iput-object p4, p0, Lc0/i;->z:Lc93/n;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    move-object v0, p2

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    move-object v0, p2

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr p3, v0

    :cond_2
    and-int/lit8 v0, p3, 0x13

    const/16 v1, 0x12

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_3

    move v0, v3

    goto :goto_2

    :cond_3
    move v0, v2

    :goto_2
    and-int/2addr p3, v3

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_7

    iget-object p3, p0, Lc0/i;->w:Lz1/p;

    invoke-virtual {p2, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lc0/i;->x:Ljava/lang/Object;

    invoke-virtual {p2, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    iget-object v3, p0, Lc0/i;->y:Lc0/x;

    invoke-virtual {p2, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_4

    if-ne v4, v5, :cond_5

    :cond_4
    new-instance v4, Lc0/h;

    const/4 v0, 0x0

    invoke-direct {v4, p3, v1, v3, v0}, Lc0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p2, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v4, p2}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    iget-object p3, v3, Lc0/x;->e:La0/v0;

    const-string v0, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lc0/j0;

    iget-object p1, p1, Lc0/j0;->a:Lp1/k1;

    invoke-virtual {p3, v1, p1}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v5, :cond_6

    new-instance p1, Lc0/p;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast p1, Lc0/p;

    iget-object p3, p0, Lc0/i;->z:Lc93/n;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p3, p1, v1, p2, v0}, Lc93/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_7
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
