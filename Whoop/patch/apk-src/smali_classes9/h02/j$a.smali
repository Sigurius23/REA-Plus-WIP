.class final Lh02/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh02/j;->k(Lb02/a;Lao2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
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


# instance fields
.field final synthetic w:Lm91/u;

.field final synthetic x:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lm91/u;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm91/u;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lh02/j$a;->w:Lm91/u;

    iput-object p2, p0, Lh02/j$a;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 8

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

    move-object v5, p1

    check-cast v5, Lp1/q;

    invoke-virtual {v5, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Lh02/e;->b()Lm91/p;

    move-result-object v2

    iget-object v1, p0, Lh02/j$a;->w:Lm91/u;

    sget-object v3, Lh02/j$a$a;->w:Lh02/j$a$a;

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    iget-object p2, p0, Lh02/j$a;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v5, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p1, p2

    iget-object p2, p0, Lh02/j$a;->w:Lm91/u;

    iget-object v0, p0, Lh02/j$a;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez p1, :cond_1

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne v4, p1, :cond_2

    :cond_1
    new-instance v4, Lh02/j$a$b;

    invoke-direct {v4, p2, v0}, Lh02/j$a$b;-><init>(Lm91/u;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget p1, Lm91/p;->b:I

    shl-int/lit8 v6, p1, 0x3

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    return-void

    :cond_3
    invoke-virtual {v5}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lh02/j$a;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
