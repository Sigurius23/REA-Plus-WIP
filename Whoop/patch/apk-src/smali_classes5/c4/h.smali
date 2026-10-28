.class public final Lc4/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# static fields
.field public static final b:Lc4/h;

.field public static final c:Lc4/h;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lc4/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc4/h;-><init>(I)V

    sput-object v0, Lc4/h;->b:Lc4/h;

    new-instance v0, Lc4/h;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lc4/h;-><init>(I)V

    sput-object v0, Lc4/h;->c:Lc4/h;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lc4/h;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 8

    iget v0, p0, Lc4/h;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    sget-object v1, Lm83/z;->w:Lm83/z;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    const/4 v3, 0x1

    if-eq v0, v3, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    move-object v3, p2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    move v4, v2

    move v5, v4

    :goto_0
    if-ge v2, v3, :cond_0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly2/q0;

    invoke-interface {v6, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v6

    iget v7, v6, Ly2/j1;->w:I

    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    move-result v4

    iget v7, v6, Ly2/j1;->x:I

    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p2, Lc4/g;

    const/4 p3, 0x1

    invoke-direct {p2, v0, p3}, Lc4/g;-><init>(Ljava/util/ArrayList;I)V

    invoke-interface {p1, v4, v5, v1, p2}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ly2/q0;

    invoke-interface {p2, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget p3, p2, Ly2/j1;->w:I

    iget p4, p2, Ly2/j1;->x:I

    new-instance v0, Lc0/x0;

    const/4 v2, 0x2

    invoke-direct {v0, p2, v2}, Lc0/x0;-><init>(Ly2/j1;I)V

    invoke-interface {p1, p3, p4, v1, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    goto :goto_1

    :cond_2
    sget-object p2, Lc4/d;->F:Lc4/d;

    invoke-interface {p1, v2, v2, v1, p2}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    :goto_1
    return-object p1

    :pswitch_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    move-object v1, p2

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_2
    if-ge v2, v1, :cond_3

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly2/q0;

    invoke-interface {v5, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v5

    iget v6, v5, Ly2/j1;->w:I

    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget v6, v5, Ly2/j1;->x:I

    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-static {p3, p4}, Ly3/a;->k(J)I

    move-result v3

    invoke-static {p3, p4}, Ly3/a;->j(J)I

    move-result v4

    :cond_4
    new-instance p2, Lc4/g;

    const/4 p3, 0x0

    invoke-direct {p2, v0, p3}, Lc4/g;-><init>(Ljava/util/ArrayList;I)V

    sget-object p3, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, v3, v4, p3, p2}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
