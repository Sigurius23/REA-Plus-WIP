.class public final synthetic Lr5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lr5/e;

.field public final synthetic y:Landroidx/credentials/exceptions/GetCredentialException;


# direct methods
.method public synthetic constructor <init>(Lr5/e;Landroidx/credentials/exceptions/GetCredentialException;I)V
    .locals 0

    iput p3, p0, Lr5/a;->w:I

    iput-object p1, p0, Lr5/a;->x:Lr5/e;

    iput-object p2, p0, Lr5/a;->y:Landroidx/credentials/exceptions/GetCredentialException;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lr5/a;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "this$0"

    iget-object v1, p0, Lr5/a;->x:Lr5/e;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$e"

    iget-object v2, p0, Lr5/a;->y:Landroidx/credentials/exceptions/GetCredentialException;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lr5/e;->e()Lm5/g;

    move-result-object v0

    invoke-interface {v0, v2}, Lm5/g;->a(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    const-string v0, "this$0"

    iget-object v1, p0, Lr5/a;->x:Lr5/e;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$e"

    iget-object v2, p0, Lr5/a;->y:Landroidx/credentials/exceptions/GetCredentialException;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lr5/e;->e()Lm5/g;

    move-result-object v0

    invoke-interface {v0, v2}, Lm5/g;->a(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
