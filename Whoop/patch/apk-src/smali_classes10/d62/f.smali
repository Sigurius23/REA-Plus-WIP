.class public final synthetic Ld62/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Ld62/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ld62/f;->x:I

    iput p2, p0, Ld62/f;->y:I

    iput-object p3, p0, Ld62/f;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;III)V
    .locals 0

    .line 2
    iput p4, p0, Ld62/f;->w:I

    iput-object p1, p0, Ld62/f;->z:Ljava/lang/Object;

    iput p2, p0, Ld62/f;->x:I

    iput p3, p0, Ld62/f;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Ld62/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld62/f;->z:Ljava/lang/Object;

    check-cast v0, Li2/j;

    check-cast p1, Ll3/y;

    iget-object v1, p1, Ll3/y;->a:Ll3/a;

    iget v2, p0, Ld62/f;->x:I

    invoke-virtual {p1, v2}, Ll3/y;->d(I)I

    move-result v2

    iget v3, p0, Ld62/f;->y:I

    invoke-virtual {p1, v3}, Ll3/y;->d(I)I

    move-result v3

    iget-object v4, v1, Ll3/a;->e:Ljava/lang/CharSequence;

    if-ltz v2, :cond_0

    if-gt v2, v3, :cond_0

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-gt v3, v5, :cond_0

    goto :goto_0

    :cond_0
    const-string v5, ") or end("

    const-string v6, ") is out of range [0.."

    const-string v7, "start("

    invoke-static {v2, v3, v7, v5, v6}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "], or start > end!"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lr3/a;->a(Ljava/lang/String;)V

    :goto_0
    new-instance v4, Landroid/graphics/Path;

    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    iget-object v1, v1, Ll3/a;->d:Lm3/m;

    iget-object v5, v1, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v5, v2, v3, v4}, Landroid/text/Layout;->getSelectionPath(IILandroid/graphics/Path;)V

    iget v1, v1, Lm3/m;->h:I

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v4}, Landroid/graphics/Path;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    int-to-float v1, v1

    invoke-virtual {v4, v2, v1}, Landroid/graphics/Path;->offset(FF)V

    :cond_1
    new-instance v1, Li2/j;

    invoke-direct {v1, v4}, Li2/j;-><init>(Landroid/graphics/Path;)V

    iget p1, p1, Ll3/y;->f:F

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v4, p1

    const/16 p1, 0x20

    shl-long/2addr v2, p1

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    or-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Li2/j;->m(J)V

    invoke-static {v0, v1}, Li2/s0;->c(Li2/s0;Li2/s0;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ld62/f;->z:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;

    check-cast p1, Ltb/a;

    iget v1, p0, Ld62/f;->x:I

    iget v2, p0, Ld62/f;->y:I

    invoke-static {v1, v2, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->d(IILio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Ltb/a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ld62/f;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    iget v1, p0, Ld62/f;->y:I

    check-cast p1, Ly2/i1;

    iget v2, p0, Ld62/f;->x:I

    invoke-static {v0, v2, v1, p1}, Ld62/g;->b(Ljava/util/ArrayList;IILy2/i1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
