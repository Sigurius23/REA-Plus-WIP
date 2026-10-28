.class public final Lvx0/c$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvx0/c;->w(Lvx0/e;Lc93/a;Landroidx/compose/runtime/Composer;I)V
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

.field final synthetic x:Lvx0/e;

.field final synthetic y:Lp1/t2;


# direct methods
.method public constructor <init>(Ljava/util/List;Lvx0/e;Lp1/t2;)V
    .locals 0

    iput-object p1, p0, Lvx0/c$h;->w:Ljava/util/List;

    iput-object p2, p0, Lvx0/c$h;->x:Lvx0/e;

    iput-object p3, p0, Lvx0/c$h;->y:Lp1/t2;

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

    move-object v7, p3

    check-cast v7, Lp1/q;

    invoke-virtual {v7, p1, p4}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lvx0/c$h;->w:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lft0/b;

    const p1, 0x6b915fda

    invoke-virtual {v7, p1}, Lp1/q;->e0(I)V

    invoke-interface {v3}, Lft0/b;->a()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lvx0/c$h;->y:Lp1/t2;

    invoke-static {p2}, Lvx0/c;->L(Lp1/t2;)Lvx0/d;

    move-result-object p2

    invoke-virtual {p2}, Lvx0/d;->f()Lft0/a;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-interface {p2}, Lft0/b;->a()Ljava/lang/String;

    move-result-object p2

    goto :goto_4

    :cond_5
    const/4 p2, 0x0

    :goto_4
    if-nez p2, :cond_6

    move v4, v1

    goto :goto_5

    :cond_6
    invoke-static {p1, p2}, Lmj0/d;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    move v4, p1

    :goto_5
    iget-object p1, p0, Lvx0/c$h;->y:Lp1/t2;

    invoke-static {p1}, Lvx0/c;->L(Lp1/t2;)Lvx0/d;

    move-result-object p1

    invoke-virtual {p1}, Lvx0/d;->c()Z

    move-result p1

    xor-int/lit8 v5, p1, 0x1

    iget-object p1, p0, Lvx0/c$h;->x:Lvx0/e;

    invoke-virtual {v7, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v7, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p1, p2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_7

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne p2, p1, :cond_8

    :cond_7
    new-instance p2, Lvx0/c$a;

    iget-object p1, p0, Lvx0/c$h;->x:Lvx0/e;

    invoke-direct {p2, p1, v3}, Lvx0/c$a;-><init>(Lvx0/e;Lft0/b;)V

    invoke-virtual {v7, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v6, p2

    check-cast v6, Lc93/a;

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Lvx0/c;->J(Lft0/b;ZZLc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    return-void

    :cond_9
    invoke-virtual {v7}, Lp1/q;->X()V

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lvx0/c$h;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
