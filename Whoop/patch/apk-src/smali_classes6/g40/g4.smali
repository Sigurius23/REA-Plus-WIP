.class public final Lg40/g4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Z

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lg40/g4;->w:Z

    iput-object p1, p0, Lg40/g4;->x:Ljava/lang/String;

    iput-boolean p3, p0, Lg40/g4;->y:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_2

    :cond_1
    :goto_0
    check-cast p1, Lp1/q;

    const p2, -0x2e02f1a1

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    iget-boolean p2, p0, Lg40/g4;->w:Z

    iget-object v0, p0, Lg40/g4;->x:Ljava/lang/String;

    if-eqz p2, :cond_2

    const p2, 0x7f141009

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p2, v0, p1}, Lq83/g;->X(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v0

    :cond_2
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    const v1, -0x2e02cc69

    invoke-virtual {p1, v1}, Lp1/q;->e0(I)V

    iget-boolean v1, p0, Lg40/g4;->y:Z

    sget-object v2, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    const v1, -0x2e02c40e

    invoke-virtual {p1, v1}, Lp1/q;->e0(I)V

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v1, v3, :cond_4

    new-instance v1, Lg40/y1;

    const/16 v3, 0x8

    invoke-direct {v1, v3}, Lg40/y1;-><init>(I)V

    invoke-virtual {p1, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    invoke-static {v2, v1}, Li3/n;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    :goto_1
    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    invoke-static {v0, v2, p1, p2, p2}, Lce/w;->o(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
