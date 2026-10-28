.class public final Lf1/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# static fields
.field public static final a:Lf1/d1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf1/d1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lf1/d1;->a:Lf1/d1;

    return-void
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 7

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

    :goto_0
    if-ge v2, v1, :cond_0

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

    goto :goto_0

    :cond_0
    new-instance p2, Lc41/e1;

    const/4 p3, 0x1

    invoke-direct {p2, v0, p3}, Lc41/e1;-><init>(Ljava/util/ArrayList;I)V

    sget-object p3, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, v3, v4, p3, p2}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method
