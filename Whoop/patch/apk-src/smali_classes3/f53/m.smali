.class public final synthetic Lf53/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;
.implements Lkotlin/jvm/internal/f;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/m;


# direct methods
.method public constructor <init>(ILc93/m;)V
    .locals 0

    iput p1, p0, Lf53/m;->w:I

    packed-switch p1, :pswitch_data_0

    const-string p1, "function"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lf53/m;->x:Lc93/m;

    return-void

    :pswitch_0
    const-string p1, "function"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lf53/m;->x:Lc93/m;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lf53/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf53/m;->x:Lc93/m;

    invoke-interface {v0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lf53/m;->x:Lc93/m;

    invoke-interface {v0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    iget v0, p0, Lf53/m;->w:I

    packed-switch v0, :pswitch_data_0

    instance-of v0, p1, Lec3/m;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    instance-of v0, p1, Lkotlin/jvm/internal/f;

    if-eqz v0, :cond_0

    check-cast p1, Lkotlin/jvm/internal/f;

    invoke-interface {p1}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object p1

    iget-object v0, p0, Lf53/m;->x:Lc93/m;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :cond_0
    return v1

    :pswitch_0
    instance-of v0, p1, Lec3/m;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    instance-of v0, p1, Lkotlin/jvm/internal/f;

    if-eqz v0, :cond_1

    check-cast p1, Lkotlin/jvm/internal/f;

    invoke-interface {p1}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object p1

    iget-object v0, p0, Lf53/m;->x:Lc93/m;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :cond_1
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getFunctionDelegate()Ll83/e;
    .locals 1

    iget v0, p0, Lf53/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf53/m;->x:Lc93/m;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lf53/m;->x:Lc93/m;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lf53/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf53/m;->x:Lc93/m;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Lf53/m;->x:Lc93/m;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
