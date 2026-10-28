.class public final Lm/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic w:Lm/h;

.field public final synthetic x:Lm/e;


# direct methods
.method public constructor <init>(Lm/e;Lm/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm/d;->x:Lm/e;

    iput-object p2, p0, Lm/d;->w:Lm/h;

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    iget-object p1, p0, Lm/d;->x:Lm/e;

    iget-object p2, p1, Lm/e;->r:Landroid/content/DialogInterface$OnClickListener;

    iget-object p4, p0, Lm/d;->w:Lm/h;

    iget-object p5, p4, Lm/h;->b:Lm/j;

    invoke-interface {p2, p5, p3}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    iget-boolean p1, p1, Lm/e;->t:Z

    if-nez p1, :cond_0

    iget-object p1, p4, Lm/h;->b:Lm/j;

    invoke-virtual {p1}, Lm/c0;->dismiss()V

    :cond_0
    return-void
.end method
