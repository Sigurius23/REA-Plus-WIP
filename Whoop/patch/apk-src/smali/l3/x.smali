.class public final synthetic Ll3/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Laa3/i1;


# direct methods
.method public synthetic constructor <init>(Laa3/i1;I)V
    .locals 0

    iput p2, p0, Ll3/x;->w:I

    iput-object p1, p0, Ll3/x;->x:Laa3/i1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    iget v0, p0, Ll3/x;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll3/x;->x:Laa3/i1;

    iget-object v0, v0, Laa3/i1;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ll3/z;

    iget-object v2, v2, Ll3/z;->a:Lt3/c;

    iget-object v2, v2, Lt3/c;->i:Lm3/h;

    invoke-virtual {v2}, Lm3/h;->c()F

    move-result v2

    invoke-static {v0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v3

    const/4 v4, 0x1

    if-gt v4, v3, :cond_2

    :goto_0
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ll3/z;

    iget-object v6, v6, Ll3/z;->a:Lt3/c;

    iget-object v6, v6, Lt3/c;->i:Lm3/h;

    invoke-virtual {v6}, Lm3/h;->c()F

    move-result v6

    invoke-static {v2, v6}, Ljava/lang/Float;->compare(FF)I

    move-result v7

    if-gez v7, :cond_1

    move-object v1, v5

    move v2, v6

    :cond_1
    if-eq v4, v3, :cond_2

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_1
    check-cast v0, Ll3/z;

    if-eqz v0, :cond_3

    iget-object v0, v0, Ll3/z;->a:Lt3/c;

    iget-object v0, v0, Lt3/c;->i:Lm3/h;

    invoke-virtual {v0}, Lm3/h;->c()F

    move-result v0

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ll3/x;->x:Laa3/i1;

    iget-object v0, v0, Laa3/i1;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v0, 0x0

    goto :goto_4

    :cond_4
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ll3/z;

    iget-object v2, v2, Ll3/z;->a:Lt3/c;

    invoke-virtual {v2}, Lt3/c;->g()F

    move-result v2

    invoke-static {v0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v3

    const/4 v4, 0x1

    if-gt v4, v3, :cond_6

    :goto_3
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ll3/z;

    iget-object v6, v6, Ll3/z;->a:Lt3/c;

    invoke-virtual {v6}, Lt3/c;->g()F

    move-result v6

    invoke-static {v2, v6}, Ljava/lang/Float;->compare(FF)I

    move-result v7

    if-gez v7, :cond_5

    move-object v1, v5

    move v2, v6

    :cond_5
    if-eq v4, v3, :cond_6

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_6
    move-object v0, v1

    :goto_4
    check-cast v0, Ll3/z;

    if-eqz v0, :cond_7

    iget-object v0, v0, Ll3/z;->a:Lt3/c;

    invoke-virtual {v0}, Lt3/c;->g()F

    move-result v0

    goto :goto_5

    :cond_7
    const/4 v0, 0x0

    :goto_5
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
