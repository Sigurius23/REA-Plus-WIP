.class public final Lh11/f$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh11/f;->h(Landroidx/compose/ui/Modifier;Ljava/util/List;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
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

.field final synthetic x:Lkotlin/jvm/functions/Function1;

.field final synthetic y:Lc93/m;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lc93/m;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lh11/f$e;->w:Ljava/util/List;

    iput-object p2, p0, Lh11/f$e;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lh11/f$e;->y:Lc93/m;

    iput-object p4, p0, Lh11/f$e;->z:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 9

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

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p4, v0, :cond_4

    move p4, v2

    goto :goto_3

    :cond_4
    move p4, v1

    :goto_3
    and-int/2addr p1, v2

    move-object v6, p3

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p1, p4}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lh11/f$e;->w:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lh11/h;

    const p1, 0x517ab767

    invoke-virtual {v6, p1}, Lp1/q;->e0(I)V

    iget-object p1, p0, Lh11/f$e;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    iget-object p2, p0, Lh11/f$e;->y:Lc93/m;

    invoke-virtual {v6, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p1, p2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_5

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne p2, p1, :cond_6

    :cond_5
    new-instance p2, Lh11/f$b;

    iget-object p1, p0, Lh11/f$e;->x:Lkotlin/jvm/functions/Function1;

    iget-object p3, p0, Lh11/f$e;->y:Lc93/m;

    invoke-direct {p2, p1, p3}, Lh11/f$b;-><init>(Lkotlin/jvm/functions/Function1;Lc93/m;)V

    invoke-virtual {v6, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v3, p2

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object p1, p0, Lh11/f$e;->z:Ljava/lang/String;

    if-eqz p1, :cond_7

    invoke-virtual {v2}, Lh11/h;->f()Ljava/lang/String;

    move-result-object p2

    const-string p3, "_"

    invoke-static {p1, p3, p2}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_4
    move-object v5, p1

    goto :goto_5

    :cond_7
    const/4 p1, 0x0

    goto :goto_4

    :goto_5
    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v4, 0x0

    invoke-static/range {v2 .. v8}, Lh11/d;->e(Lh11/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    return-void

    :cond_8
    invoke-virtual {v6}, Lp1/q;->X()V

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lh11/f$e;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
