.class public final Lh5/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Class;

.field public final c:I

.field public final d:I

.field public final synthetic e:I


# direct methods
.method public constructor <init>(I)V
    .locals 3

    iput p1, p0, Lh5/d0;->e:I

    packed-switch p1, :pswitch_data_0

    const/16 p1, 0x1c

    const/4 v0, 0x0

    const v1, 0x7f0a0c34

    .line 1
    const-class v2, Ljava/lang/Boolean;

    invoke-direct {p0, v1, v2, v0, p1}, Lh5/d0;-><init>(ILjava/lang/Class;II)V

    return-void

    :pswitch_0
    const/16 p1, 0x1c

    const/4 v0, 0x0

    const v1, 0x7f0a0c2f

    .line 2
    const-class v2, Ljava/lang/Boolean;

    invoke-direct {p0, v1, v2, v0, p1}, Lh5/d0;-><init>(ILjava/lang/Class;II)V

    return-void

    :pswitch_1
    const/16 p1, 0x40

    const/16 v0, 0x1e

    const v1, 0x7f0a0c35

    .line 3
    const-class v2, Ljava/lang/CharSequence;

    invoke-direct {p0, v1, v2, p1, v0}, Lh5/d0;-><init>(ILjava/lang/Class;II)V

    return-void

    :pswitch_2
    const/16 p1, 0x8

    const/16 v0, 0x1c

    const v1, 0x7f0a0c30

    .line 4
    const-class v2, Ljava/lang/CharSequence;

    invoke-direct {p0, v1, v2, p1, v0}, Lh5/d0;-><init>(ILjava/lang/Class;II)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(ILjava/lang/Class;II)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput p1, p0, Lh5/d0;->a:I

    .line 7
    iput-object p2, p0, Lh5/d0;->b:Ljava/lang/Class;

    .line 8
    iput p3, p0, Lh5/d0;->d:I

    .line 9
    iput p4, p0, Lh5/d0;->c:I

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)Ljava/lang/Object;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    iget v1, p0, Lh5/d0;->c:I

    if-lt v0, v1, :cond_0

    iget v0, p0, Lh5/d0;->e:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lh5/l0;->b(Landroid/view/View;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_0

    :pswitch_0
    invoke-static {p1}, Lh5/n0;->a(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_0

    :pswitch_1
    invoke-static {p1}, Lh5/l0;->a(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_0

    :pswitch_2
    invoke-static {p1}, Lh5/l0;->c(Landroid/view/View;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_0
    iget v0, p0, Lh5/d0;->a:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lh5/d0;->b:Ljava/lang/Class;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Landroid/view/View;Ljava/lang/Object;)V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    iget v1, p0, Lh5/d0;->c:I

    if-lt v0, v1, :cond_0

    iget v0, p0, Lh5/d0;->e:I

    packed-switch v0, :pswitch_data_0

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, p2}, Lh5/l0;->d(Landroid/view/View;Z)V

    goto :goto_0

    :pswitch_0
    check-cast p2, Ljava/lang/CharSequence;

    invoke-static {p1, p2}, Lh5/n0;->c(Landroid/view/View;Ljava/lang/CharSequence;)V

    goto :goto_0

    :pswitch_1
    check-cast p2, Ljava/lang/CharSequence;

    invoke-static {p1, p2}, Lh5/l0;->e(Landroid/view/View;Ljava/lang/CharSequence;)V

    goto :goto_0

    :pswitch_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, p2}, Lh5/l0;->f(Landroid/view/View;Z)V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lh5/d0;->a(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lh5/d0;->e:I

    packed-switch v1, :pswitch_data_1

    check-cast v0, Ljava/lang/Boolean;

    move-object v1, p2

    check-cast v1, Ljava/lang/Boolean;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v3

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    if-ne v0, v1, :cond_3

    :goto_3
    move v2, v3

    :cond_3
    xor-int/lit8 v0, v2, 0x1

    goto :goto_7

    :pswitch_3
    check-cast v0, Ljava/lang/CharSequence;

    move-object v1, p2

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    :goto_4
    xor-int/lit8 v0, v0, 0x1

    goto :goto_7

    :pswitch_4
    check-cast v0, Ljava/lang/CharSequence;

    move-object v1, p2

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    goto :goto_4

    :pswitch_5
    check-cast v0, Ljava/lang/Boolean;

    move-object v1, p2

    check-cast v1, Ljava/lang/Boolean;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v3

    goto :goto_5

    :cond_4
    move v0, v2

    :goto_5
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_5

    move v1, v3

    goto :goto_6

    :cond_5
    move v1, v2

    :goto_6
    if-ne v0, v1, :cond_3

    goto :goto_3

    :goto_7
    if-eqz v0, :cond_9

    invoke-static {p1}, Lh5/p0;->c(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    move-result-object v0

    if-nez v0, :cond_6

    const/4 v0, 0x0

    goto :goto_8

    :cond_6
    instance-of v1, v0, Lh5/a;

    if-eqz v1, :cond_7

    check-cast v0, Lh5/a;

    iget-object v0, v0, Lh5/a;->a:Lh5/b;

    goto :goto_8

    :cond_7
    new-instance v1, Lh5/b;

    invoke-direct {v1, v0}, Lh5/b;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    move-object v0, v1

    :goto_8
    if-nez v0, :cond_8

    new-instance v0, Lh5/b;

    invoke-direct {v0}, Lh5/b;-><init>()V

    :cond_8
    invoke-static {p1, v0}, Lh5/p0;->n(Landroid/view/View;Lh5/b;)V

    iget v0, p0, Lh5/d0;->a:I

    invoke-virtual {p1, v0, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget p2, p0, Lh5/d0;->d:I

    invoke-static {p1, p2}, Lh5/p0;->h(Landroid/view/View;I)V

    :cond_9
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method
