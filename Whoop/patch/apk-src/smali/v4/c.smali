.class public abstract Lv4/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method

.method public static a(ILri/a;)V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    const/4 v2, 0x0

    if-lt v0, v1, :cond_1

    if-eqz p0, :cond_0

    invoke-static {p0}, La4/a;->x(I)Ljava/lang/Object;

    move-result-object v2

    :cond_0
    invoke-static {p1, v2}, Le3/b;->e(Landroid/graphics/Paint;Ljava/lang/Object;)V

    return-void

    :cond_1
    if-eqz p0, :cond_3

    invoke-static {p0}, Lrg/j;->i(I)Landroid/graphics/PorterDuff$Mode;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    invoke-direct {v2, p0}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    :cond_2
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    return-void

    :cond_3
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    return-void
.end method
