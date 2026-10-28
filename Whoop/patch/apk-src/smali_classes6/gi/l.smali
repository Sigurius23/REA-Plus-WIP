.class public final Lgi/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public w:Z

.field public final synthetic x:Lgi/f;

.field public final synthetic y:Landroid/view/ViewTreeObserver;

.field public final synthetic z:Lbc3/m;


# direct methods
.method public constructor <init>(Lgi/f;Landroid/view/ViewTreeObserver;Lbc3/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgi/l;->x:Lgi/f;

    iput-object p2, p0, Lgi/l;->y:Landroid/view/ViewTreeObserver;

    iput-object p3, p0, Lgi/l;->z:Lbc3/m;

    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 5

    iget-object v0, p0, Lgi/l;->x:Lgi/f;

    invoke-virtual {v0}, Lgi/f;->c()Lgi/i;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iget-object v3, p0, Lgi/l;->y:Landroid/view/ViewTreeObserver;

    invoke-virtual {v3}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lgi/f;->b:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :goto_0
    iget-boolean v0, p0, Lgi/l;->w:Z

    if-nez v0, :cond_1

    iput-boolean v2, p0, Lgi/l;->w:Z

    iget-object v0, p0, Lgi/l;->z:Lbc3/m;

    invoke-virtual {v0, v1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_1
    return v2
.end method
