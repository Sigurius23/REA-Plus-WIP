.class public final synthetic Lg40/e3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg40/f3;


# direct methods
.method public synthetic constructor <init>(Lg40/f3;I)V
    .locals 0

    iput p2, p0, Lg40/e3;->w:I

    iput-object p1, p0, Lg40/e3;->x:Lg40/f3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lg40/e3;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lg40/s3;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lg40/s3;->isValid()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1}, Lg40/s3;->isValid()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lg40/e3;->x:Lg40/f3;

    iget-object v0, v0, Lg40/f3;->a:Lg40/l3;

    invoke-interface {v0}, Lg40/l3;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lg40/s3;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg40/e3;->x:Lg40/f3;

    iget-object v0, v0, Lg40/f3;->c:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzy/c;

    if-nez v0, :cond_3

    :cond_2
    invoke-static {p1}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object v0

    :cond_3
    return-object v0

    :pswitch_1
    check-cast p1, Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg40/e3;->x:Lg40/f3;

    iget-object v0, v0, Lg40/f3;->a:Lg40/l3;

    invoke-interface {v0, p1}, Lg40/l3;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
