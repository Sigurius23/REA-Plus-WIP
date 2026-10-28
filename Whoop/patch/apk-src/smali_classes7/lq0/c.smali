.class public final synthetic Llq0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Llq0/g;


# direct methods
.method public synthetic constructor <init>(Llq0/g;I)V
    .locals 0

    iput p2, p0, Llq0/c;->a:I

    iput-object p1, p0, Llq0/c;->b:Llq0/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 1

    iget v0, p0, Llq0/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llq0/c;->b:Llq0/g;

    invoke-static {v0, p1}, Llq0/g;->i(Llq0/g;Landroid/view/View;)Z

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Llq0/c;->b:Llq0/g;

    invoke-static {v0, p1}, Llq0/g;->f(Llq0/g;Landroid/view/View;)Z

    move-result p1

    return p1

    :pswitch_1
    iget-object v0, p0, Llq0/c;->b:Llq0/g;

    invoke-static {v0, p1}, Llq0/g;->c(Llq0/g;Landroid/view/View;)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
