.class public final Lu2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lf1/p1;

.field public final c:I

.field public final d:I

.field public final e:I

.field public f:I


# direct methods
.method public constructor <init>(Ljava/util/List;Lf1/p1;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/k;->a:Ljava/lang/Object;

    iput-object p2, p0, Lu2/k;->b:Lf1/p1;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-lt v0, v1, :cond_1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lf1/p1;->l()Landroid/view/MotionEvent;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getClassification()I

    move-result v0

    goto :goto_1

    :cond_1
    move v0, v3

    :goto_1
    iput v0, p0, Lu2/k;->c:I

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lf1/p1;->l()Landroid/view/MotionEvent;

    move-result-object v0

    goto :goto_2

    :cond_2
    move-object v0, v2

    :goto_2
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v0

    goto :goto_3

    :cond_3
    move v0, v3

    :goto_3
    iput v0, p0, Lu2/k;->d:I

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lf1/p1;->l()Landroid/view/MotionEvent;

    move-result-object v0

    goto :goto_4

    :cond_4
    move-object v0, v2

    :goto_4
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getMetaState()I

    move-result v0

    goto :goto_5

    :cond_5
    move v0, v3

    :goto_5
    iput v0, p0, Lu2/k;->e:I

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lf1/p1;->l()Landroid/view/MotionEvent;

    move-result-object v2

    :cond_6
    const/4 p2, 0x3

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    if-eqz p1, :cond_9

    if-eq p1, v1, :cond_8

    if-eq p1, v0, :cond_7

    packed-switch p1, :pswitch_data_0

    goto :goto_9

    :pswitch_0
    const/4 v3, 0x5

    goto :goto_9

    :pswitch_1
    const/4 v3, 0x4

    goto :goto_9

    :pswitch_2
    const/4 v3, 0x6

    goto :goto_9

    :cond_7
    :pswitch_3
    move v3, p2

    goto :goto_9

    :cond_8
    :goto_6
    :pswitch_4
    move v3, v0

    goto :goto_9

    :cond_9
    :goto_7
    :pswitch_5
    move v3, v1

    goto :goto_9

    :cond_a
    move-object v2, p1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    :goto_8
    if-ge v3, v2, :cond_7

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu2/r;

    invoke-static {v4}, Lu2/d0;->e(Lu2/r;)Z

    move-result v5

    if-eqz v5, :cond_b

    goto :goto_6

    :cond_b
    invoke-static {v4}, Lu2/d0;->c(Lu2/r;)Z

    move-result v4

    if-eqz v4, :cond_c

    goto :goto_7

    :cond_c
    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    :goto_9
    iput v3, p0, Lu2/k;->f:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
