.class final Lev2/u$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lev2/u;->u0(Ldv2/e$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3;"
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
.field final synthetic w:Lm91/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm91/a<",
            "Ljava/lang/String;",
            "Lo11/m$c$b;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic x:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lm91/a;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm91/a<",
            "Ljava/lang/String;",
            "Lo11/m$c$b;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lev2/u$h;->w:Lm91/a;

    iput-object p2, p0, Lev2/u$h;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lc0/i0;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    const-string p3, "$this$AnimatedVisibility"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lev2/u$h;->w:Lm91/a;

    invoke-virtual {p1}, Lm91/a;->d()Lm91/u;

    move-result-object v0

    sget-object v2, Lev2/u$h$a;->w:Lev2/u$h$a;

    iget-object p1, p0, Lev2/u$h;->w:Lm91/a;

    move-object v4, p2

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    iget-object p2, p0, Lev2/u$h;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p1, p2

    iget-object p2, p0, Lev2/u$h;->w:Lm91/a;

    iget-object p3, p0, Lev2/u$h;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p1, :cond_0

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne v1, p1, :cond_1

    :cond_0
    new-instance v1, Lev2/u$h$b;

    invoke-direct {v1, p2, p3}, Lev2/u$h$b;-><init>(Lm91/a;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function1;

    sget v5, Lo11/m$c$b;->H:I

    const/4 v6, 0x2

    const/4 v1, 0x0

    invoke-static/range {v0 .. v6}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lev2/u$h;->a(Lc0/i0;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
