.class public final synthetic Lb3/s;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {p1}, Lr;->t(Ljava/lang/Object;)V

    check-cast p2, Lh2/e;

    iget-wide p1, p2, Lh2/e;->a:J

    check-cast p3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    sget-object v1, Landroidx/compose/ui/platform/AndroidComposeView;->h1:Ljava/lang/Class;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->fontScale:F

    new-instance v3, Ly3/d;

    invoke-direct {v3, v2, v1}, Ly3/d;-><init>(FF)V

    new-instance v1, Le2/b;

    invoke-direct {v1, v3, p1, p2, p3}, Le2/b;-><init>(Ly3/d;JLkotlin/jvm/functions/Function1;)V

    sget-object p1, Lb3/j0;->a:Lb3/j0;

    const/4 p2, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lb3/j0;->a(Landroid/view/View;Le2/g;Le2/b;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
