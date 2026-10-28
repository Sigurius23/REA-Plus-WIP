.class public final Lu80/c$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu80/c;->l(Lu80/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic E:Lu80/d;

.field final synthetic F:Lkotlin/jvm/functions/Function1;

.field final synthetic G:Lb3/x2;

.field final synthetic w:Ljava/util/List;

.field final synthetic x:Lp1/c1;

.field final synthetic y:Lp1/c1;

.field final synthetic z:Lu80/e;


# direct methods
.method public constructor <init>(Ljava/util/List;Lp1/c1;Lp1/c1;Lu80/e;Lu80/d;Lkotlin/jvm/functions/Function1;Lb3/x2;)V
    .locals 0

    iput-object p1, p0, Lu80/c$e;->w:Ljava/util/List;

    iput-object p2, p0, Lu80/c$e;->x:Lp1/c1;

    iput-object p3, p0, Lu80/c$e;->y:Lp1/c1;

    iput-object p4, p0, Lu80/c$e;->z:Lu80/e;

    iput-object p5, p0, Lu80/c$e;->E:Lu80/d;

    iput-object p6, p0, Lu80/c$e;->F:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lu80/c$e;->G:Lb3/x2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 10

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

    if-eqz p1, :cond_8

    iget-object p1, p0, Lu80/c$e;->w:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu80/a;

    const p4, 0x3094098b

    invoke-virtual {p3, p4}, Lp1/q;->e0(I)V

    iget-object p4, p0, Lu80/c$e;->x:Lp1/c1;

    invoke-virtual {p3, p4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p4

    iget-object v0, p0, Lu80/c$e;->y:Lp1/c1;

    invoke-virtual {p3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p4, v0

    iget-object v0, p0, Lu80/c$e;->z:Lu80/e;

    invoke-virtual {p3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p4, v0

    iget-object v0, p0, Lu80/c$e;->E:Lu80/d;

    invoke-virtual {p3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p4, v0

    iget-object v0, p0, Lu80/c$e;->F:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p4, v0

    iget-object v0, p0, Lu80/c$e;->G:Lb3/x2;

    invoke-virtual {p3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p4, v0

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p4, :cond_5

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-ne v0, p4, :cond_6

    :cond_5
    new-instance v3, Lu80/c$c;

    iget-object v4, p0, Lu80/c$e;->z:Lu80/e;

    iget-object v5, p0, Lu80/c$e;->E:Lu80/d;

    iget-object v6, p0, Lu80/c$e;->F:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lu80/c$e;->G:Lb3/x2;

    iget-object v8, p0, Lu80/c$e;->x:Lp1/c1;

    iget-object v9, p0, Lu80/c$e;->y:Lp1/c1;

    invoke-direct/range {v3 .. v9}, Lu80/c$c;-><init>(Lu80/e;Lu80/d;Lkotlin/jvm/functions/Function1;Lb3/x2;Lp1/c1;Lp1/c1;)V

    invoke-virtual {p3, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v0, v3

    :cond_6
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0, p3, v2, v2}, Lu80/c;->h(Lu80/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    iget-object p1, p0, Lu80/c$e;->y:Lp1/c1;

    invoke-static {p1}, Lu80/c;->x(Lp1/c1;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result p1

    if-ne p2, p1, :cond_7

    const p1, 0x30a3499a

    invoke-virtual {p3, p1}, Lp1/q;->e0(I)V

    const/16 p1, 0xd

    int-to-float p1, p1

    const/16 p2, 0x8

    int-to-float p2, p2

    sget-object p4, Lb2/t;->w:Lb2/t;

    invoke-static {p1, p2, p4, p3, v2}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    goto :goto_4

    :cond_7
    const p1, 0x30a493f2

    invoke-virtual {p3, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    return-void

    :cond_8
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

    invoke-virtual {p0, p1, p2, p3, p4}, Lu80/c$e;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
