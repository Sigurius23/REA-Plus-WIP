.class public final Ldb/q;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/TextView;

.field public final b:Landroid/widget/TextView;

.field public final c:Landroid/widget/ImageView;

.field public final synthetic d:Ldb/x;


# direct methods
.method public constructor <init>(Ldb/x;Landroid/view/View;)V
    .locals 1

    iput-object p1, p0, Ldb/q;->d:Ldb/x;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    sget p1, Lx8/t;->a:I

    const/16 v0, 0x1a

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p2, p1}, Landroid/view/View;->setFocusable(Z)V

    :cond_0
    const p1, 0x7f0a0464

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ldb/q;->a:Landroid/widget/TextView;

    const p1, 0x7f0a047a

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ldb/q;->b:Landroid/widget/TextView;

    const p1, 0x7f0a0462

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ldb/q;->c:Landroid/widget/ImageView;

    new-instance p1, Lb30/k3;

    const/4 v0, 0x5

    invoke-direct {p1, p0, v0}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
