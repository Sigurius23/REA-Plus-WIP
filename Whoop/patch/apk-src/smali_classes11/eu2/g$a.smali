.class final Leu2/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leu2/g;->l(Ljava/util/List;Ln0/u;Lin2/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic E:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic w:Leu2/p;

.field final synthetic x:Lj31/k;

.field final synthetic y:I

.field final synthetic z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Leu2/p;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Leu2/p;Lj31/k;ILjava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu2/p;",
            "Lj31/k;",
            "I",
            "Ljava/util/List<",
            "Leu2/p;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Leu2/g$a;->w:Leu2/p;

    iput-object p2, p0, Leu2/g$a;->x:Lj31/k;

    iput p3, p0, Leu2/g$a;->y:I

    iput-object p4, p0, Leu2/g$a;->z:Ljava/util/List;

    iput-object p5, p0, Leu2/g$a;->E:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll0/u;ZLandroidx/compose/runtime/Composer;I)V
    .locals 8

    const-string p2, "$this$ReorderableItem"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit16 p1, p4, 0x81

    const/16 p2, 0x80

    const/4 v0, 0x1

    if-eq p1, p2, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    and-int/lit8 p2, p4, 0x1

    move-object v5, p3

    check-cast v5, Lp1/q;

    invoke-virtual {v5, p2, p1}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object v1, p0, Leu2/g$a;->w:Leu2/p;

    iget-object v2, p0, Leu2/g$a;->x:Lj31/k;

    iget p1, p0, Leu2/g$a;->y:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object p1, p0, Leu2/g$a;->w:Leu2/p;

    invoke-virtual {v5, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    iget p2, p0, Leu2/g$a;->y:I

    invoke-virtual {v5, p2}, Lp1/q;->e(I)Z

    move-result p2

    or-int/2addr p1, p2

    iget-object p2, p0, Leu2/g$a;->z:Ljava/util/List;

    invoke-virtual {v5, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p1, p2

    iget-object p2, p0, Leu2/g$a;->E:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v5, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p1, p2

    iget-object p2, p0, Leu2/g$a;->w:Leu2/p;

    iget p3, p0, Leu2/g$a;->y:I

    iget-object p4, p0, Leu2/g$a;->z:Ljava/util/List;

    iget-object v0, p0, Leu2/g$a;->E:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez p1, :cond_1

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne v4, p1, :cond_2

    :cond_1
    new-instance v4, Leu2/g$a$a;

    invoke-direct {v4, p2, p3, p4, v0}, Leu2/g$a$a;-><init>(Leu2/p;ILjava/util/List;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget p1, Lj31/k;->t:I

    shl-int/lit8 v6, p1, 0x6

    const/4 v7, 0x1

    const/4 v0, 0x0

    invoke-static/range {v0 .. v7}, Leu2/o;->f(Landroidx/compose/ui/Modifier;Leu2/p;Lj31/k;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    return-void

    :cond_3
    invoke-virtual {v5}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll0/u;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Leu2/g$a;->a(Ll0/u;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
