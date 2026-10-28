.class public final Lb3/g3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/view/View;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;ILjava/lang/Object;)V
    .locals 0

    iput p2, p0, Lb3/g3;->w:I

    iput-object p1, p0, Lb3/g3;->x:Landroid/view/View;

    iput-object p3, p0, Lb3/g3;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method private final b(Landroid/view/View;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    iget p1, p0, Lb3/g3;->w:I

    packed-switch p1, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object p1, p0, Lb3/g3;->x:Landroid/view/View;

    check-cast p1, Lb3/a;

    invoke-static {p1}, Landroidx/lifecycle/o1;->g(Landroid/view/View;)Landroidx/lifecycle/g0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lb3/g3;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/g0;

    invoke-interface {v0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    invoke-static {p1, v0}, Lb3/o0;->b(Lb3/a;Landroidx/lifecycle/x;)La3/m0;

    move-result-object v0

    iput-object v0, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "View tree for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " has no ViewTreeLifecycleOwner"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lx2/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    iget p1, p0, Lb3/g3;->w:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lb3/g3;->x:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object p1, p0, Lb3/g3;->y:Ljava/lang/Object;

    check-cast p1, Lp1/y1;

    invoke-virtual {p1}, Lp1/y1;->v()V

    :pswitch_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
