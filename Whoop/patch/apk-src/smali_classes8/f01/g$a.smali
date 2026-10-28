.class public final Lf01/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf01/g;->l(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/m;"
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 12

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v1

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    const p2, 0x697f7a6f

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    invoke-static {}, Lf01/g;->t()Lf01/h;

    move-result-object v4

    invoke-static {}, Lf01/g;->u()Lf01/j0;

    move-result-object v5

    sget-object v9, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    const/4 v10, 0x7

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v11}, Lf01/j0;->b(Lf01/j0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lny0/h;Ly81/f;ILjava/lang/Object;)Lf01/j0;

    move-result-object v7

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v5, 0x0

    sget-object v6, Lm83/y;->w:Lm83/y;

    invoke-static/range {v4 .. v9}, Lf01/h;->b(Lf01/h;Lf01/r0;Ljava/util/List;Lf01/j0;ILjava/lang/Object;)Lf01/h;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p2, v0, p1, v2, v3}, Lf01/g;->h(Lf01/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p1, v2}, Lp1/q;->q(Z)V

    return-void

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lf01/g$a;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
