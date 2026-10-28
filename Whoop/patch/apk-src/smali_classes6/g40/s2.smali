.class public final Lg40/s2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/z2;
.implements Lg40/x2;


# instance fields
.field public final synthetic a:I

.field public final b:Ln53/e;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lg40/s2;->a:I

    const-string v0, "fields"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lg40/s2;->c:Ljava/lang/Object;

    .line 3
    check-cast p1, Ljava/lang/Iterable;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 6
    check-cast v1, Lg40/b3;

    .line 7
    invoke-virtual {v1}, Lg40/b3;->k()Lg40/k1;

    move-result-object v1

    .line 8
    invoke-interface {v1}, Lg40/z2;->f()Lec3/f2;

    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 11
    sget-object p1, Lm83/y;->w:Lm83/y;

    .line 12
    invoke-static {p1}, Lm83/s;->D0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg40/h1;

    .line 13
    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    goto :goto_1

    .line 14
    :cond_1
    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    const/4 v1, 0x0

    .line 15
    new-array v1, v1, [Lec3/l;

    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    .line 16
    check-cast p1, [Lec3/l;

    .line 17
    new-instance v1, Lg40/c;

    const/4 v2, 0x5

    invoke-direct {v1, p1, v2}, Lg40/c;-><init>([Lec3/l;I)V

    move-object p1, v1

    .line 18
    :goto_1
    new-instance v1, Lg40/d;

    const/4 v2, 0x5

    invoke-direct {v1, v0, v2}, Lg40/d;-><init>(Ljava/util/ArrayList;I)V

    .line 19
    new-instance v0, Ln53/e;

    invoke-direct {v0, p1, v1}, Ln53/e;-><init>(Lec3/l;Lc93/a;)V

    .line 20
    iput-object v0, p0, Lg40/s2;->b:Ln53/e;

    return-void
.end method

.method public constructor <init>(Lx30/o;)V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, Lg40/s2;->a:I

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lg40/s2;->c:Ljava/lang/Object;

    .line 23
    iget-object v0, p1, Lx30/o;->c:Lg40/h;

    .line 24
    invoke-interface {v0}, Lg40/h;->g()Lec3/f2;

    move-result-object v0

    .line 25
    new-instance v1, Lx30/n;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lx30/n;-><init>(Lx30/o;I)V

    invoke-static {v0, v1}, Lbi/g;->y(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    new-instance v0, Lwz/h1;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lwz/h1;-><init>(I)V

    .line 26
    invoke-static {p1, v0}, Lbi/g;->y(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lg40/s2;->b:Ln53/e;

    return-void
.end method


# virtual methods
.method public final f()Lec3/f2;
    .locals 1

    iget v0, p0, Lg40/s2;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg40/s2;->b:Ln53/e;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lg40/s2;->b:Ln53/e;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(ZLg40/y2;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    move/from16 v0, p7

    iget v1, p0, Lg40/s2;->a:I

    packed-switch v1, :pswitch_data_0

    const-string v1, "modifier"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p6

    check-cast v8, Lp1/q;

    const v1, 0x23612de3

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    iget-object v1, p0, Lg40/s2;->c:Ljava/lang/Object;

    check-cast v1, Lx30/o;

    iget-object v1, v1, Lx30/o;->d:Lg40/z2;

    instance-of v2, v1, Lg40/x2;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lg40/x2;

    and-int/lit16 v1, v0, 0x1ffe

    sget v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v3, v3, 0xc

    or-int/2addr v1, v3

    const v3, 0xe000

    and-int/2addr v0, v3

    or-int v9, v1, v0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-interface/range {v2 .. v9}, Lg40/x2;->i(ZLg40/y2;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {v8, p1}, Lp1/q;->q(Z)V

    return-void

    :pswitch_0
    const-string p2, "modifier"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p6

    check-cast v5, Lp1/q;

    const p2, 0x56e42efd

    invoke-virtual {v5, p2}, Lp1/q;->e0(I)V

    and-int/lit8 p2, v0, 0xe

    shr-int/lit8 v1, v0, 0xc

    and-int/lit8 v1, v1, 0x70

    or-int/2addr p2, v1

    shr-int/lit8 v1, v0, 0x3

    and-int/lit16 v2, v1, 0x380

    or-int/2addr p2, v2

    and-int/lit16 v1, v1, 0x1c00

    or-int/2addr p2, v1

    shl-int/lit8 v0, v0, 0x6

    const v1, 0xe000

    and-int/2addr v0, v1

    or-int v6, p2, v0

    move-object v1, p0

    move v0, p1

    move-object v4, p3

    move-object v2, p4

    move-object v3, p5

    invoke-static/range {v0 .. v6}, Le4/a;->i(ZLg40/s2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/4 p1, 0x0

    invoke-virtual {v5, p1}, Lp1/q;->q(Z)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
