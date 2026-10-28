.class public final Lgi/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lgi/f;

.field public final synthetic x:Landroid/view/ViewTreeObserver;

.field public final synthetic y:Lgi/l;


# direct methods
.method public constructor <init>(Lgi/f;Landroid/view/ViewTreeObserver;Lgi/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgi/k;->w:Lgi/f;

    iput-object p2, p0, Lgi/k;->x:Landroid/view/ViewTreeObserver;

    iput-object p3, p0, Lgi/k;->y:Lgi/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, Lgi/k;->x:Landroid/view/ViewTreeObserver;

    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    iget-object v1, p0, Lgi/k;->y:Lgi/l;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lgi/k;->w:Lgi/f;

    iget-object p1, p1, Lgi/f;->b:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
