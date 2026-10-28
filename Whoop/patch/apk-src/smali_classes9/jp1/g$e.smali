.class public final Ljp1/g$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljp1/g;->n(Landroidx/compose/ui/Modifier;Lhp1/d;Lcp1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic E:Lp1/c1;

.field final synthetic F:Lp1/c1;

.field final synthetic w:Ljava/util/List;

.field final synthetic x:Lp1/c1;

.field final synthetic y:Lcp1/d;

.field final synthetic z:Lhp1/d;


# direct methods
.method public constructor <init>(Ljava/util/List;Lp1/c1;Lcp1/d;Lhp1/d;Lp1/c1;Lp1/c1;)V
    .locals 0

    iput-object p1, p0, Ljp1/g$e;->w:Ljava/util/List;

    iput-object p2, p0, Ljp1/g$e;->x:Lp1/c1;

    iput-object p3, p0, Ljp1/g$e;->y:Lcp1/d;

    iput-object p4, p0, Ljp1/g$e;->z:Lhp1/d;

    iput-object p5, p0, Ljp1/g$e;->E:Lp1/c1;

    iput-object p6, p0, Ljp1/g$e;->F:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 11

    and-int/lit8 v0, p4, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_1

    move-object v0, p3

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v1

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

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq p4, v0, :cond_4

    move p4, v2

    goto :goto_3

    :cond_4
    move p4, v3

    :goto_3
    and-int/2addr p1, v2

    move-object v8, p3

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p1, p4}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Ljp1/g$e;->w:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lhp1/c;

    const p1, 0x6c84bd9d

    invoke-virtual {v8, p1}, Lp1/q;->e0(I)V

    iget-object p1, p0, Ljp1/g$e;->x:Lp1/c1;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v4}, Lhp1/c;->f()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    iget-object v5, p0, Ljp1/g$e;->y:Lcp1/d;

    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_5

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne p2, p1, :cond_6

    :cond_5
    new-instance p2, Ljp1/g$b;

    iget-object p1, p0, Ljp1/g$e;->x:Lp1/c1;

    iget-object p3, p0, Ljp1/g$e;->E:Lp1/c1;

    iget-object p4, p0, Ljp1/g$e;->F:Lp1/c1;

    invoke-direct {p2, p1, v4, p3, p4}, Ljp1/g$b;-><init>(Lp1/c1;Lhp1/c;Lp1/c1;Lp1/c1;)V

    invoke-virtual {v8, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v7, p2

    check-cast v7, Lc93/a;

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Ljp1/g;->C(Lhp1/c;Lcp1/d;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    iget-object p1, p0, Ljp1/g$e;->z:Lhp1/d;

    invoke-virtual {p1}, Lhp1/d;->e()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v4}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    iget-object p2, p0, Ljp1/g$e;->z:Lhp1/d;

    invoke-virtual {p2}, Lhp1/d;->e()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lwb3/f;->C(Ljava/util/List;)I

    move-result p2

    if-eq p1, p2, :cond_7

    const p1, 0x6c8c1290

    invoke-virtual {v8, p1}, Lp1/q;->e0(I)V

    const/4 p1, 0x3

    int-to-float p1, p1

    int-to-float p2, v1

    sget-object p3, Lb2/t;->w:Lb2/t;

    invoke-static {p1, p2, p3, v8, v3}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_4

    :cond_7
    const p1, 0x6c8d4662

    invoke-virtual {v8, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    return-void

    :cond_8
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

    invoke-virtual {p0, p1, p2, p3, p4}, Ljp1/g$e;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
