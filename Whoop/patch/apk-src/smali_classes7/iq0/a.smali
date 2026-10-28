.class public final synthetic Liq0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/recyclerview/widget/o2;

.field public final synthetic y:Landroidx/recyclerview/widget/i1;


# direct methods
.method public synthetic constructor <init>(Landroidx/recyclerview/widget/i1;Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    iput p3, p0, Liq0/a;->w:I

    iput-object p2, p0, Liq0/a;->x:Landroidx/recyclerview/widget/o2;

    iput-object p1, p0, Liq0/a;->y:Landroidx/recyclerview/widget/i1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget v0, p0, Liq0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Liq0/a;->x:Landroidx/recyclerview/widget/o2;

    check-cast v0, Llq0/b;

    iget-object v1, p0, Liq0/a;->y:Landroidx/recyclerview/widget/i1;

    check-cast v1, Liq0/e;

    invoke-static {v0, v1, p1}, Liq0/e;->a(Llq0/b;Liq0/e;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Liq0/a;->x:Landroidx/recyclerview/widget/o2;

    check-cast v0, Liq0/b$a;

    iget-object v1, p0, Liq0/a;->y:Landroidx/recyclerview/widget/i1;

    check-cast v1, Liq0/b;

    invoke-static {v0, v1, p1}, Liq0/b;->a(Liq0/b$a;Liq0/b;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
