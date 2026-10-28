.class public final synthetic Lip0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lip0/f;->w:I

    iput-object p1, p0, Lip0/f;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    iget v0, p0, Lip0/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lip0/f;->x:Ljava/lang/Object;

    check-cast v0, Lkn2/g;

    invoke-static {v0, p1}, Lkn2/g;->b(Lkn2/g;Landroid/content/DialogInterface;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lip0/f;->x:Ljava/lang/Object;

    check-cast v0, Lip0/h;

    invoke-static {v0, p1}, Lip0/h;->b(Lip0/h;Landroid/content/DialogInterface;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
