.class public final Lh21/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh21/c;->r(Landroidx/compose/ui/Modifier;Lh21/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic w:Ljava/util/List;

.field final synthetic x:Lp1/c1;

.field final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/List;Lp1/c1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lh21/c$d;->w:Ljava/util/List;

    iput-object p2, p0, Lh21/c$d;->x:Lp1/c1;

    iput-object p3, p0, Lh21/c$d;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 3

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    move-object v0, p3

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    or-int/2addr p1, p4

    goto :goto_1

    :cond_1
    move p1, p4

    :goto_1
    and-int/lit8 p4, p4, 0x30

    if-nez p4, :cond_3

    move-object p4, p3

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p2}, Lp1/q;->e(I)Z

    move-result p4

    if-eqz p4, :cond_2

    const/16 p4, 0x20

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr p1, p4

    :cond_3
    and-int/lit16 p4, p1, 0x93

    const/16 v0, 0x92

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p4, v0, :cond_4

    move p4, v1

    goto :goto_3

    :cond_4
    move p4, v2

    :goto_3
    and-int/2addr p1, v1

    check-cast p3, Lp1/q;

    invoke-virtual {p3, p1, p4}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lh21/c$d;->w:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh21/e;

    const p2, 0x6b91b134

    invoke-virtual {p3, p2}, Lp1/q;->e0(I)V

    invoke-virtual {p1}, Lh21/e;->getId()Ljava/lang/String;

    move-result-object p2

    iget-object p4, p0, Lh21/c$d;->x:Lp1/c1;

    invoke-static {p4}, Lh21/c;->C(Lp1/c1;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    iget-object p4, p0, Lh21/c$d;->x:Lp1/c1;

    invoke-virtual {p3, p4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p4

    invoke-virtual {p3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p4, v0

    iget-object v0, p0, Lh21/c$d;->y:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p4, v0

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p4, :cond_5

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-ne v0, p4, :cond_6

    :cond_5
    new-instance v0, Lh21/c$a;

    iget-object p4, p0, Lh21/c$d;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lh21/c$d;->x:Lp1/c1;

    invoke-direct {v0, p1, p4, v1}, Lh21/c$a;-><init>(Lh21/e;Lkotlin/jvm/functions/Function1;Lp1/c1;)V

    invoke-virtual {p3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v0, Lc93/a;

    invoke-static {p1, p2, v0, p3, v2}, Lh21/c;->B(Lh21/e;ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    return-void

    :cond_7
    invoke-virtual {p3}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lh21/c$d;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
