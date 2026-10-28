.class public final Lb3/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb3/m0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb3/m0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb3/m0;->a:Lb3/m0;

    return-void
.end method

.method public static b(Landroid/content/Context;Lu2/o;)Landroid/view/PointerIcon;
    .locals 1

    instance-of v0, p1, Lu2/a;

    if-eqz v0, :cond_0

    check-cast p1, Lu2/a;

    iget p1, p1, Lu2/a;->b:I

    invoke-static {p0, p1}, Landroid/view/PointerIcon;->getSystemIcon(Landroid/content/Context;I)Landroid/view/PointerIcon;

    move-result-object p0

    return-object p0

    :cond_0
    const/16 p1, 0x3e8

    invoke-static {p0, p1}, Landroid/view/PointerIcon;->getSystemIcon(Landroid/content/Context;I)Landroid/view/PointerIcon;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/view/View;Lu2/o;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p2}, Lb3/m0;->b(Landroid/content/Context;Lu2/o;)Landroid/view/PointerIcon;

    move-result-object p2

    invoke-virtual {p1}, Landroid/view/View;->getPointerIcon()Landroid/view/PointerIcon;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1, p2}, Landroid/view/View;->setPointerIcon(Landroid/view/PointerIcon;)V

    :cond_0
    return-void
.end method
