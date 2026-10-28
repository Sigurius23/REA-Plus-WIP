.class public final Lb3/t;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/internal/g0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/g0;I)V
    .locals 0

    iput p2, p0, Lb3/t;->w:I

    iput-object p1, p0, Lb3/t;->x:Lkotlin/jvm/internal/g0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lb3/t;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lu2/e;

    iget-object v0, p0, Lb3/t;->x:Lkotlin/jvm/internal/g0;

    iget-object v1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-nez v1, :cond_0

    iget-boolean v2, p1, Lu2/e;->Q:Z

    if-eqz v2, :cond_0

    iput-object p1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb3/t;->x:Lkotlin/jvm/internal/g0;

    iget-object v0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    const/4 v1, 0x1

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    check-cast v0, Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lg2/x;

    iget-object v0, p0, Lb3/t;->x:Lkotlin/jvm/internal/g0;

    iput-object p1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
