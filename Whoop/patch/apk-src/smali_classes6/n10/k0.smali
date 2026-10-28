.class public final Ln10/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final synthetic w:I

.field public final x:Lg73/d;

.field public final y:Lv03/h;


# direct methods
.method public synthetic constructor <init>(Lg73/d;Lv03/d;I)V
    .locals 0

    iput p3, p0, Ln10/k0;->w:I

    iput-object p1, p0, Ln10/k0;->x:Lg73/d;

    iput-object p2, p0, Ln10/k0;->y:Lv03/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ln10/k0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln10/k0;->y:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Ln10/k0;->x:Lg73/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "paymentElementCallbackIdentifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ld10/a;->a(Ljava/lang/String;)Ld10/b;

    :goto_0
    const/4 v0, 0x0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ln10/k0;->y:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Ln10/k0;->x:Lg73/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "paymentElementCallbackIdentifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ld10/a;->a(Ljava/lang/String;)Ld10/b;

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Ln10/k0;->y:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Ln10/k0;->x:Lg73/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "paymentElementCallbackIdentifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ld10/a;->a(Ljava/lang/String;)Ld10/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Ld10/b;->a:Lh20/b;

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
