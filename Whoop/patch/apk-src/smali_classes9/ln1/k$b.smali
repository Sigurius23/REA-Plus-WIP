.class final Lln1/k$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lln1/k;->m(Ll0/y;Lin1/d$c;Ln0/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic w:Le41/i;

.field final synthetic x:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic y:I

.field final synthetic z:Lj31/k;


# direct methods
.method public constructor <init>(Le41/i;Lkotlin/jvm/functions/Function1;ILj31/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le41/i;",
            "Lkotlin/jvm/functions/Function1;",
            "I",
            "Lj31/k;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lln1/k$b;->w:Le41/i;

    iput-object p2, p0, Lln1/k$b;->x:Lkotlin/jvm/functions/Function1;

    iput p3, p0, Lln1/k$b;->y:I

    iput-object p4, p0, Lln1/k$b;->z:Lj31/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll0/u;ZLandroidx/compose/runtime/Composer;I)V
    .locals 7

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

    move-object v4, p3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p2, p1}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Lln1/k$b;->w:Le41/i;

    new-instance v2, Lln1/k$b$a;

    iget-object p1, p0, Lln1/k$b;->z:Lj31/k;

    invoke-direct {v2, p1}, Lln1/k$b$a;-><init>(Lj31/k;)V

    iget-object p1, p0, Lln1/k$b;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    iget p2, p0, Lln1/k$b;->y:I

    invoke-virtual {v4, p2}, Lp1/q;->e(I)Z

    move-result p2

    or-int/2addr p1, p2

    iget-object p2, p0, Lln1/k$b;->x:Lkotlin/jvm/functions/Function1;

    iget p3, p0, Lln1/k$b;->y:I

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p4

    if-nez p1, :cond_1

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne p4, p1, :cond_2

    :cond_1
    new-instance p4, Lln1/k$b$b;

    invoke-direct {p4, p2, p3}, Lln1/k$b$b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v4, p4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v3, p4

    check-cast v3, Lkotlin/jvm/functions/Function1;

    sget v5, Le41/i;->m:I

    const/4 v6, 0x2

    const/4 v1, 0x0

    invoke-static/range {v0 .. v6}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    return-void

    :cond_3
    invoke-virtual {v4}, Lp1/q;->X()V

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lln1/k$b;->a(Ll0/u;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
