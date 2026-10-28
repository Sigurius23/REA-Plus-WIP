.class public final synthetic Lg1/a6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lh0/g1;

.field public final synthetic y:Lkotlin/jvm/internal/d0;


# direct methods
.method public synthetic constructor <init>(Lh0/g1;Lkotlin/jvm/internal/d0;I)V
    .locals 0

    iput p3, p0, Lg1/a6;->w:I

    iput-object p1, p0, Lg1/a6;->x:Lh0/g1;

    iput-object p2, p0, Lg1/a6;->y:Lkotlin/jvm/internal/d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lg1/a6;->w:I

    check-cast p1, Ld0/e;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget-object v1, p0, Lg1/a6;->y:Lkotlin/jvm/internal/d0;

    iget v2, v1, Lkotlin/jvm/internal/d0;->w:F

    sub-float/2addr v0, v2

    iget-object v2, p0, Lg1/a6;->x:Lh0/g1;

    invoke-interface {v2, v0}, Lh0/g1;->a(F)V

    invoke-virtual {p1}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iput p1, v1, Lkotlin/jvm/internal/d0;->w:F

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    invoke-virtual {p1}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget-object v1, p0, Lg1/a6;->y:Lkotlin/jvm/internal/d0;

    iget v2, v1, Lkotlin/jvm/internal/d0;->w:F

    sub-float/2addr v0, v2

    iget-object v2, p0, Lg1/a6;->x:Lh0/g1;

    invoke-interface {v2, v0}, Lh0/g1;->a(F)V

    invoke-virtual {p1}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iput p1, v1, Lkotlin/jvm/internal/d0;->w:F

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
