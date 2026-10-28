.class public final Lcm/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcm/b;


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Landroid/view/Window;

.field public final c:Lh5/v1;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/view/Window;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcm/a;->a:Landroid/view/View;

    iput-object p2, p0, Lcm/a;->b:Landroid/view/Window;

    if-eqz p2, :cond_0

    new-instance v0, Lh5/v1;

    invoke-direct {v0, p1, p2}, Lh5/v1;-><init>(Landroid/view/View;Landroid/view/Window;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcm/a;->c:Lh5/v1;

    return-void
.end method


# virtual methods
.method public final a(JLkotlin/jvm/functions/Function1;)V
    .locals 2

    const-string v0, "transformColorForLightContent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, Lcm/a;->c:Lh5/v1;

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Lh5/v1;->a(Z)V

    :goto_0
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    iget-object v1, p0, Lcm/a;->b:Landroid/view/Window;

    if-lt p3, v0, :cond_2

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p3, 0x1

    invoke-virtual {v1, p3}, Landroid/view/Window;->setNavigationBarContrastEnforced(Z)V

    :cond_2
    :goto_1
    if-nez v1, :cond_3

    return-void

    :cond_3
    invoke-static {p1, p2}, Li2/w0;->H(J)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/view/Window;->setNavigationBarColor(I)V

    return-void
.end method
