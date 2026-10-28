.class public final synthetic Lip0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lip0/h;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lip0/h;I)V
    .locals 0

    iput p3, p0, Lip0/g;->w:I

    iput-object p1, p0, Lip0/g;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lip0/g;->y:Lip0/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget v0, p0, Lip0/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lip0/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lip0/g;->y:Lip0/h;

    invoke-static {v0, v1, p1}, Lip0/h;->c(Lkotlin/jvm/functions/Function1;Lip0/h;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lip0/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lip0/g;->y:Lip0/h;

    invoke-static {v0, v1, p1}, Lip0/h;->d(Lkotlin/jvm/functions/Function1;Lip0/h;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
