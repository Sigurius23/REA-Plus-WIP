.class public final Lp6/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Landroid/widget/RemoteViews;ILa7/e;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    const-string v0, "setClipToOutline"

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Landroid/widget/RemoteViews;->setBoolean(ILjava/lang/String;Z)V

    instance-of v0, p2, La7/a;

    if-eqz v0, :cond_0

    check-cast p2, La7/a;

    iget p2, p2, La7/a;->a:F

    invoke-virtual {p0, p1, p2, v1}, Landroid/widget/RemoteViews;->setViewOutlinePreferredRadius(IFI)V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Rounded corners should not be "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "setClipToOutline is only available on SDK 31 and higher"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Landroid/widget/RemoteViews;ILa7/e;)V
    .locals 2

    instance-of v0, p2, La7/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/high16 p2, -0x40000000    # -2.0f

    invoke-virtual {p0, p1, p2, v1}, Landroid/widget/RemoteViews;->setViewLayoutHeight(IFI)V

    return-void

    :cond_0
    instance-of v0, p2, La7/b;

    if-eqz v0, :cond_1

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, v1}, Landroid/widget/RemoteViews;->setViewLayoutHeight(IFI)V

    return-void

    :cond_1
    instance-of v0, p2, La7/a;

    if-eqz v0, :cond_2

    check-cast p2, La7/a;

    iget p2, p2, La7/a;->a:F

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Landroid/widget/RemoteViews;->setViewLayoutHeight(IFI)V

    return-void

    :cond_2
    sget-object v0, La7/c;->a:La7/c;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    const/high16 p2, -0x40800000    # -1.0f

    invoke-virtual {p0, p1, p2, v1}, Landroid/widget/RemoteViews;->setViewLayoutHeight(IFI)V

    return-void

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static c(Landroid/widget/RemoteViews;ILa7/e;)V
    .locals 2

    instance-of v0, p2, La7/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/high16 p2, -0x40000000    # -2.0f

    invoke-virtual {p0, p1, p2, v1}, Landroid/widget/RemoteViews;->setViewLayoutWidth(IFI)V

    return-void

    :cond_0
    instance-of v0, p2, La7/b;

    if-eqz v0, :cond_1

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, v1}, Landroid/widget/RemoteViews;->setViewLayoutWidth(IFI)V

    return-void

    :cond_1
    instance-of v0, p2, La7/a;

    if-eqz v0, :cond_2

    check-cast p2, La7/a;

    iget p2, p2, La7/a;->a:F

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Landroid/widget/RemoteViews;->setViewLayoutWidth(IFI)V

    return-void

    :cond_2
    sget-object v0, La7/c;->a:La7/c;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    const/high16 p2, -0x40800000    # -1.0f

    invoke-virtual {p0, p1, p2, v1}, Landroid/widget/RemoteViews;->setViewLayoutWidth(IFI)V

    return-void

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
