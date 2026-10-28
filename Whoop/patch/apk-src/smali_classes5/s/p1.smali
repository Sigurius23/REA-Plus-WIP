.class public final Ls/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field public final synthetic w:Ls/v1;


# direct methods
.method public constructor <init>(Ls/v1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls/p1;->w:Ls/v1;

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    const/4 p1, -0x1

    if-eq p3, p1, :cond_0

    iget-object p1, p0, Ls/p1;->w:Ls/v1;

    iget-object p1, p1, Ls/v1;->y:Ls/k1;

    if-eqz p1, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ls/k1;->setListSelectionHidden(Z)V

    :cond_0
    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0

    return-void
.end method
