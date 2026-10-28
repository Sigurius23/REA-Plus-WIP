.class final Lbm2/q$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbm2/q;->h(Landroidx/compose/ui/Modifier;Lbm2/r;Lcom/whoop/util/TrendKey;Lor2/h0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic w:Lm91/u;

.field final synthetic x:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic y:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lm91/u;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm91/u;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lbm2/q$c;->w:Lm91/u;

    iput-object p2, p0, Lbm2/q$c;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lbm2/q$c;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lbm2/q$c;->z:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll0/s1;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    const-string v0, "$this$DropdownMenuItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p1, v0, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    and-int/2addr p3, v1

    move-object v6, p2

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p3, p1}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object v2, p0, Lbm2/q$c;->w:Lm91/u;

    const/4 p1, 0x0

    invoke-static {p1, v1, p1}, Lm91/m;->h(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lm91/p;

    move-result-object v3

    new-instance v4, Lbm2/q$c$a;

    iget-object p1, p0, Lbm2/q$c;->w:Lm91/u;

    invoke-direct {v4, p1}, Lbm2/q$c$a;-><init>(Lm91/u;)V

    iget-object p1, p0, Lbm2/q$c;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    iget-object p2, p0, Lbm2/q$c;->y:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v6, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p1, p2

    iget-object p2, p0, Lbm2/q$c;->x:Lkotlin/jvm/functions/Function1;

    iget-object p3, p0, Lbm2/q$c;->y:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lbm2/q$c;->z:Lp1/c1;

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p1, :cond_1

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne v1, p1, :cond_2

    :cond_1
    new-instance v1, Lbm2/q$c$b;

    invoke-direct {v1, p2, p3, v0}, Lbm2/q$c$b;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;)V

    invoke-virtual {v6, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    sget p1, Lm91/p;->b:I

    shl-int/lit8 v7, p1, 0x3

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    return-void

    :cond_3
    invoke-virtual {v6}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll0/s1;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lbm2/q$c;->a(Ll0/s1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
