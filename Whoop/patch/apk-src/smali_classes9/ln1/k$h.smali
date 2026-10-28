.class public final Lln1/k$h;
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
.field final synthetic w:Ljava/util/List;

.field final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lln1/k$h;->w:Ljava/util/List;

    iput-object p2, p0, Lln1/k$h;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 11

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

    const/16 v0, 0x20

    if-nez p4, :cond_3

    move-object p4, p3

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p2}, Lp1/q;->e(I)Z

    move-result p4

    if-eqz p4, :cond_2

    move p4, v0

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr p1, p4

    :cond_3
    and-int/lit16 p4, p1, 0x93

    const/16 v1, 0x92

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq p4, v1, :cond_4

    move p4, v3

    goto :goto_3

    :cond_4
    move p4, v2

    :goto_3
    and-int/lit8 v1, p1, 0x1

    move-object v8, p3

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v1, p4}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_a

    iget-object p3, p0, Lln1/k$h;->w:Ljava/util/List;

    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    move-object v4, p3

    check-cast v4, Le41/i;

    const p3, -0x6f0d55a9

    invoke-virtual {v8, p3}, Lp1/q;->e0(I)V

    iget-object p3, p0, Lln1/k$h;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p3

    and-int/lit8 p4, p1, 0x70

    xor-int/lit8 p4, p4, 0x30

    if-le p4, v0, :cond_5

    invoke-virtual {v8, p2}, Lp1/q;->e(I)Z

    move-result p4

    if-nez p4, :cond_7

    :cond_5
    and-int/lit8 p1, p1, 0x30

    if-ne p1, v0, :cond_6

    goto :goto_4

    :cond_6
    move v3, v2

    :cond_7
    :goto_4
    or-int p1, p3, v3

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p1, :cond_8

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne p3, p1, :cond_9

    :cond_8
    new-instance p3, Lln1/k$c;

    iget-object p1, p0, Lln1/k$h;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p3, p1, p2}, Lln1/k$c;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v7, p3

    check-cast v7, Lkotlin/jvm/functions/Function1;

    sget v9, Le41/i;->m:I

    const/4 v10, 0x6

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v10}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const-wide/high16 p1, 0x3ff8000000000000L    # 1.5

    double-to-float p1, p1

    const/16 p2, 0x8

    int-to-float p2, p2

    sget-object p3, Lb2/t;->w:Lb2/t;

    invoke-static {p1, p2, p3, v8, v2}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    return-void

    :cond_a
    invoke-virtual {v8}, Lp1/q;->X()V

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lln1/k$h;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
