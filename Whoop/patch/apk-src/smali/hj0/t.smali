.class public abstract Lhj0/t;
.super Lhj0/f;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "Registered"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhj0/t$c;,
        Lhj0/t$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lhj0/f;-><init>()V

    return-void
.end method

.method public static bridge synthetic D(Lhj0/t;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, Lhj0/t;->G(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private G(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p0}, Lhj0/t;->E()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public E()Landroid/view/View;
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const v1, 0x1020030

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public F(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0, p1}, Lhj0/t;->G(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lhj0/t$a;

    invoke-direct {v1, p0, p1}, Lhj0/t$a;-><init>(Lhj0/t;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Landroid/view/Window;->requestFeature(I)Z

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSharedElementsUseOverlay(Z)V

    invoke-super {p0, p1}, Lhj0/f;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method
