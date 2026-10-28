.class public final synthetic Ls40/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/webkit/JsResult;


# direct methods
.method public synthetic constructor <init>(Landroid/webkit/JsResult;I)V
    .locals 0

    iput p2, p0, Ls40/n0;->w:I

    iput-object p1, p0, Ls40/n0;->x:Landroid/webkit/JsResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget p1, p0, Ls40/n0;->w:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Ls40/n0;->x:Landroid/webkit/JsResult;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/webkit/JsResult;->cancel()V

    :cond_0
    return-void

    :pswitch_0
    iget-object p1, p0, Ls40/n0;->x:Landroid/webkit/JsResult;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/webkit/JsResult;->confirm()V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
