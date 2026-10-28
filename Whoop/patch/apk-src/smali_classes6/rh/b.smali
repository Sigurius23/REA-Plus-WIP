.class public final synthetic Lrh/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lrh/d;


# direct methods
.method public synthetic constructor <init>(Lrh/d;I)V
    .locals 0

    iput p2, p0, Lrh/b;->w:I

    iput-object p1, p0, Lrh/b;->x:Lrh/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lrh/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrh/b;->x:Lrh/d;

    iget-object v1, v0, Lrh/d;->e:Ljava/util/List;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lc93/a;

    invoke-interface {v5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v2, v5}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lm83/y;->w:Lm83/y;

    iput-object v1, v0, Lrh/d;->e:Ljava/util/List;

    return-object v2

    :pswitch_0
    iget-object v0, p0, Lrh/b;->x:Lrh/d;

    iget-object v1, v0, Lrh/d;->d:Ljava/util/List;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lc93/a;

    invoke-interface {v5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v2, v5}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    sget-object v1, Lm83/y;->w:Lm83/y;

    iput-object v1, v0, Lrh/d;->d:Ljava/util/List;

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
