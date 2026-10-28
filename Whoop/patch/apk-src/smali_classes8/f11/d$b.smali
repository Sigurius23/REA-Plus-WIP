.class public final Lf11/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf11/d;->h(Lf11/e;ZLandroidx/compose/runtime/Composer;II)V
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

.field final synthetic x:Lf11/e;

.field final synthetic y:F


# direct methods
.method public constructor <init>(Ljava/util/List;Lf11/e;F)V
    .locals 0

    iput-object p1, p0, Lf11/d$b;->w:Ljava/util/List;

    iput-object p2, p0, Lf11/d$b;->x:Lf11/e;

    iput p3, p0, Lf11/d$b;->y:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 8

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

    if-eq p4, v0, :cond_4

    const/4 p4, 0x1

    goto :goto_3

    :cond_4
    move p4, v1

    :goto_3
    and-int/lit8 v0, p1, 0x1

    move-object v6, p3

    check-cast v6, Lp1/q;

    invoke-virtual {v6, v0, p4}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_5

    iget-object p3, p0, Lf11/d$b;->w:Ljava/util/List;

    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    and-int/lit8 p1, p1, 0x7e

    move-object v3, p3

    check-cast v3, Lf11/h;

    const p3, -0x25506f4c

    invoke-virtual {v6, p3}, Lp1/q;->e0(I)V

    iget-object v4, p0, Lf11/d$b;->x:Lf11/e;

    iget v5, p0, Lf11/d$b;->y:F

    shr-int/lit8 p1, p1, 0x3

    and-int/lit8 v7, p1, 0xe

    move v2, p2

    invoke-static/range {v2 .. v7}, Lf11/d;->q(ILf11/h;Lf11/e;FLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    return-void

    :cond_5
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

    invoke-virtual {p0, p1, p2, p3, p4}, Lf11/d$b;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
