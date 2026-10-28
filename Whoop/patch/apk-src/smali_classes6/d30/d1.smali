.class public final synthetic Ld30/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/m;


# direct methods
.method public synthetic constructor <init>(ILc93/m;)V
    .locals 0

    iput p1, p0, Ld30/d1;->w:I

    iput-object p2, p0, Ld30/d1;->x:Lc93/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ld30/d1;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lwz/e1;

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v1, p0, Ld30/d1;->x:Lc93/m;

    invoke-interface {v1, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lu2/r;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lu2/d0;->k(Lu2/r;Z)J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iget-object v1, p0, Ld30/d1;->x:Lc93/m;

    invoke-interface {v1, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lu2/r;->a()V

    goto :goto_0

    :pswitch_1
    check-cast p1, Lu2/r;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lu2/d0;->k(Lu2/r;Z)J

    move-result-wide v0

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iget-object v1, p0, Ld30/d1;->x:Lc93/m;

    invoke-interface {v1, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lu2/r;->a()V

    goto :goto_0

    :pswitch_2
    check-cast p1, Ly2/y;

    const-string v0, "coordinates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "saved"

    iget-object v1, p0, Ld30/d1;->x:Lc93/m;

    invoke-interface {v1, v0, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
