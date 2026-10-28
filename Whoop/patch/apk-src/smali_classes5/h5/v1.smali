.class public final Lh5/v1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lbi/g;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/view/Window;)V
    .locals 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance v0, Laj/d;

    invoke-direct {v0, p1}, Laj/d;-><init>(Landroid/view/View;)V

    .line 9
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-lt p1, v1, :cond_0

    .line 10
    new-instance p1, Lh5/u1;

    .line 11
    invoke-direct {p1, p2, v0}, Lh5/s1;-><init>(Landroid/view/Window;Laj/d;)V

    .line 12
    iput-object p1, p0, Lh5/v1;->a:Lbi/g;

    return-void

    :cond_0
    const/16 v1, 0x1e

    if-lt p1, v1, :cond_1

    .line 13
    new-instance p1, Lh5/s1;

    invoke-direct {p1, p2, v0}, Lh5/s1;-><init>(Landroid/view/Window;Laj/d;)V

    iput-object p1, p0, Lh5/v1;->a:Lbi/g;

    return-void

    .line 14
    :cond_1
    new-instance p1, Lh5/r1;

    .line 15
    invoke-direct {p1, p2, v0}, Lh5/r1;-><init>(Landroid/view/Window;Laj/d;)V

    .line 16
    iput-object p1, p0, Lh5/v1;->a:Lbi/g;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsController;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, Lh5/u1;

    new-instance v1, Laj/d;

    invoke-direct {v1, p1}, Laj/d;-><init>(Landroid/view/WindowInsetsController;)V

    .line 4
    invoke-direct {v0, p1, v1}, Lh5/s1;-><init>(Landroid/view/WindowInsetsController;Laj/d;)V

    .line 5
    iput-object v0, p0, Lh5/v1;->a:Lbi/g;

    return-void

    .line 6
    :cond_0
    new-instance v0, Lh5/s1;

    new-instance v1, Laj/d;

    invoke-direct {v1, p1}, Laj/d;-><init>(Landroid/view/WindowInsetsController;)V

    invoke-direct {v0, p1, v1}, Lh5/s1;-><init>(Landroid/view/WindowInsetsController;Laj/d;)V

    iput-object v0, p0, Lh5/v1;->a:Lbi/g;

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 1

    iget-object v0, p0, Lh5/v1;->a:Lbi/g;

    invoke-virtual {v0, p1}, Lbi/g;->X(Z)V

    return-void
.end method

.method public final b(Z)V
    .locals 1

    iget-object v0, p0, Lh5/v1;->a:Lbi/g;

    invoke-virtual {v0, p1}, Lbi/g;->Y(Z)V

    return-void
.end method
