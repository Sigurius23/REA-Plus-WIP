.class public final synthetic Ll23/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field public final synthetic w:Lb9/b;


# direct methods
.method public synthetic constructor <init>(Lb9/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll23/a;->w:Lb9/b;

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 3

    invoke-static {p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p0, Ll23/a;->w:Lb9/b;

    iget-object p1, p1, Lb9/b;->E:Ljava/lang/Object;

    check-cast p1, Lm23/d;

    const/4 v0, 0x4

    if-ne p2, v0, :cond_5

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_5

    invoke-virtual {p3}, Landroid/view/KeyEvent;->isCanceled()Z

    move-result p2

    if-nez p2, :cond_5

    invoke-virtual {p1}, Lm23/d;->e()Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p2, p1, Lm23/d;->M:Lj23/b;

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Lm23/d;->getCurrentPosition$photoview_dialog_release()I

    move-result p1

    iget-object p2, p2, Lj23/b;->i:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    const/4 v1, 0x0

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object v2, p3

    check-cast v2, Lj23/a;

    iget v2, v2, Lj23/a;->b:I

    if-ne v2, p1, :cond_0

    goto :goto_0

    :cond_1
    move-object p3, v1

    :goto_0
    check-cast p3, Lj23/a;

    if-eqz p3, :cond_3

    iget-object p1, p3, Lj23/a;->d:Lio/getstream/photoview/PhotoView;

    const-string p2, "<this>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/photoview/PhotoView;->getMinimumScale()F

    move-result p2

    iget-object p1, p1, Lio/getstream/photoview/PhotoView;->w:Lc23/o;

    if-eqz p1, :cond_2

    iget-object p3, p1, Lc23/o;->w:Lio/getstream/photoview/PhotoView;

    invoke-virtual {p3}, Landroid/view/View;->getRight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {p3}, Landroid/view/View;->getBottom()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    int-to-float p3, p3

    invoke-virtual {p1, p2, v1, p3, v0}, Lc23/o;->e(FFFZ)V

    return v0

    :cond_2
    const-string p1, "attacher"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    return v0

    :cond_4
    invoke-virtual {p1}, Lm23/d;->d()V

    return v0

    :cond_5
    const/4 p1, 0x0

    return p1
.end method
