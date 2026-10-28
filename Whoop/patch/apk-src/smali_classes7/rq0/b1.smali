.class public final synthetic Lrq0/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lrq0/a1$c;

.field public final synthetic y:Lrq0/a1$d;


# direct methods
.method public synthetic constructor <init>(Lrq0/a1$c;Lrq0/a1$d;I)V
    .locals 0

    iput p3, p0, Lrq0/b1;->w:I

    iput-object p1, p0, Lrq0/b1;->x:Lrq0/a1$c;

    iput-object p2, p0, Lrq0/b1;->y:Lrq0/a1$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget v0, p0, Lrq0/b1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrq0/b1;->x:Lrq0/a1$c;

    iget-object v1, p0, Lrq0/b1;->y:Lrq0/a1$d;

    invoke-static {v0, v1, p1}, Lrq0/a1$d;->a(Lrq0/a1$c;Lrq0/a1$d;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lrq0/b1;->x:Lrq0/a1$c;

    iget-object v1, p0, Lrq0/b1;->y:Lrq0/a1$d;

    invoke-static {v0, v1, p1}, Lrq0/a1$d;->b(Lrq0/a1$c;Lrq0/a1$d;Landroid/view/View;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lrq0/b1;->x:Lrq0/a1$c;

    iget-object v1, p0, Lrq0/b1;->y:Lrq0/a1$d;

    invoke-static {v0, v1, p1}, Lrq0/a1$d;->d(Lrq0/a1$c;Lrq0/a1$d;Landroid/view/View;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lrq0/b1;->x:Lrq0/a1$c;

    iget-object v1, p0, Lrq0/b1;->y:Lrq0/a1$d;

    invoke-static {v0, v1, p1}, Lrq0/a1$d;->c(Lrq0/a1$c;Lrq0/a1$d;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
