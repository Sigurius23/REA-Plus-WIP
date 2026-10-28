.class public final Lq00/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:Lq00/i0;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:F

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lq00/i0;Ljava/lang/String;FLkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq00/c0;->w:Lq00/i0;

    iput-object p2, p0, Lq00/c0;->x:Ljava/lang/String;

    iput p3, p0, Lq00/c0;->y:F

    iput-object p4, p0, Lq00/c0;->z:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v0, p1

    check-cast v0, Ly00/c0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p1

    const-string p3, "selectedItem"

    invoke-static {v0, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, Lq00/c0;->w:Lq00/i0;

    invoke-virtual {p3}, Lq00/i0;->c()Lh00/o0;

    move-result-object p3

    iget-boolean p3, p3, Lh00/o0;->w:Z

    xor-int/lit8 v1, p3, 0x1

    move-object v5, p2

    check-cast v5, Lp1/q;

    const p2, -0x796116c8

    invoke-virtual {v5, p2}, Lp1/q;->e0(I)V

    iget-object p2, p0, Lq00/c0;->z:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v5, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p3, :cond_0

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne v2, p3, :cond_1

    :cond_0
    new-instance v2, Lp62/h;

    const/16 p3, 0xf

    invoke-direct {v2, p2, p3}, Lp62/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v4, v2

    check-cast v4, Lc93/a;

    const/4 p2, 0x0

    invoke-virtual {v5, p2}, Lp1/q;->q(Z)V

    and-int/lit8 v6, p1, 0xe

    iget-object v2, p0, Lq00/c0;->x:Ljava/lang/String;

    iget v3, p0, Lq00/c0;->y:F

    invoke-static/range {v0 .. v6}, Lse/h;->f(Ly00/c0;ZLjava/lang/String;FLc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
