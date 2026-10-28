.class public final Lor/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic w:Landroid/view/View;

.field public final synthetic x:Lor/k;


# direct methods
.method public constructor <init>(Lor/k;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/j;->x:Lor/k;

    iput-object p2, p0, Lor/j;->w:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    iget-object p1, p0, Lor/j;->w:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lor/j;->x:Lor/k;

    invoke-virtual {p2, p1}, Lor/k;->d(Landroid/view/View;)V

    :cond_0
    return-void
.end method
