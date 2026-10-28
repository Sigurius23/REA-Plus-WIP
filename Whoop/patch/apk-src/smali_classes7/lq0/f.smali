.class public final synthetic Llq0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Llq0/g;


# direct methods
.method public synthetic constructor <init>(Llq0/g;I)V
    .locals 0

    iput p2, p0, Llq0/f;->w:I

    iput-object p1, p0, Llq0/f;->x:Llq0/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget v0, p0, Llq0/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llq0/f;->x:Llq0/g;

    invoke-static {v0, p1}, Llq0/g;->g(Llq0/g;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Llq0/f;->x:Llq0/g;

    invoke-static {v0, p1}, Llq0/g;->a(Llq0/g;Landroid/view/View;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Llq0/f;->x:Llq0/g;

    invoke-static {v0, p1}, Llq0/g;->d(Llq0/g;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
