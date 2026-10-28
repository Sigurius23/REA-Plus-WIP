.class public final Lhf3/a;
.super Lq83/g;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Lhf3/a;->a:I

    const/4 p1, 0x4

    const-string v0, "level"

    invoke-static {p1, v0}, Lih0/d0;->w(ILjava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final I(ILjava/lang/String;)V
    .locals 2

    iget v0, p0, Lhf3/a;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "level"

    invoke-static {p1, v0}, Lih0/d0;->w(ILjava/lang/String;)V

    const-string p1, "msg"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :pswitch_0
    const-string v0, "level"

    invoke-static {p1, v0}, Lih0/d0;->w(ILjava/lang/String;)V

    const-string v0, "msg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-static {v0, p1}, Le4/p;->b(II)I

    move-result v0

    if-gtz v0, :cond_3

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    const-string v0, "[Koin]"

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    invoke-static {v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    invoke-static {v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    invoke-static {v0, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_2
    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
