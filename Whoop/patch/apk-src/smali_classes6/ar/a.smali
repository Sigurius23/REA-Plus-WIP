.class public final Lar/a;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lar/b;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lar/a;->a:I

    .line 2
    iput-object p1, p0, Lar/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lar/a;->a:I

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    iput-object p1, p0, Lar/a;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public canApplyTheme()Z
    .locals 1

    iget v0, p0, Lar/a;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Landroid/graphics/drawable/Drawable$ConstantState;->canApplyTheme()Z

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Lar/a;->b:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/drawable/Drawable$ConstantState;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->canApplyTheme()Z

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final getChangingConfigurations()I
    .locals 1

    iget v0, p0, Lar/a;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    iget-object v0, p0, Lar/a;->b:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/drawable/Drawable$ConstantState;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->getChangingConfigurations()I

    move-result v0

    return v0

    :pswitch_1
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 3

    iget v0, p0, Lar/a;->a:I

    packed-switch v0, :pswitch_data_0

    .line 1
    new-instance v0, Lkl/b;

    invoke-direct {v0, p0}, Lkl/b;-><init>(Lar/a;)V

    return-object v0

    .line 2
    :pswitch_0
    new-instance v0, Lcc/f;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 3
    invoke-direct {v0, v1, v2}, Lcc/f;-><init>(Landroid/content/Context;I)V

    .line 4
    iget-object v1, p0, Lar/a;->b:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/drawable/Drawable$ConstantState;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, v0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    .line 5
    iget-object v2, v0, Lcc/f;->F:Lcc/c;

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    return-object v0

    .line 6
    :pswitch_1
    iget-object v0, p0, Lar/a;->b:Ljava/lang/Object;

    check-cast v0, Lar/b;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 3

    iget v0, p0, Lar/a;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    .line 7
    :pswitch_0
    new-instance p1, Lkl/b;

    invoke-direct {p1, p0}, Lkl/b;-><init>(Lar/a;)V

    return-object p1

    .line 8
    :pswitch_1
    new-instance v0, Lcc/f;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, v1, v2}, Lcc/f;-><init>(Landroid/content/Context;I)V

    .line 10
    iget-object v1, p0, Lar/a;->b:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/drawable/Drawable$ConstantState;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, v0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    .line 11
    iget-object v1, v0, Lcc/f;->F:Lcc/c;

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public newDrawable(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
    .locals 3

    iget v0, p0, Lar/a;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    .line 12
    :pswitch_0
    new-instance v0, Lcc/f;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v1, v2}, Lcc/f;-><init>(Landroid/content/Context;I)V

    .line 14
    iget-object v1, p0, Lar/a;->b:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/drawable/Drawable$ConstantState;

    invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, v0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    .line 15
    iget-object p2, v0, Lcc/f;->F:Lcc/c;

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
