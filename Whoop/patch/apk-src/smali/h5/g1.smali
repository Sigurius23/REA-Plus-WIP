.class public final Lh5/g1;
.super Lh5/f1;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lh5/f1;-><init>()V

    return-void
.end method

.method public constructor <init>(Lh5/q1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lh5/f1;-><init>(Lh5/q1;)V

    return-void
.end method


# virtual methods
.method public c(ILv4/b;)V
    .locals 1

    iget-object v0, p0, Lh5/f1;->c:Landroid/view/WindowInsets$Builder;

    invoke-static {p1}, Lh5/p1;->a(I)I

    move-result p1

    invoke-virtual {p2}, Lv4/b;->d()Landroid/graphics/Insets;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Landroid/view/WindowInsets$Builder;->setInsets(ILandroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method
