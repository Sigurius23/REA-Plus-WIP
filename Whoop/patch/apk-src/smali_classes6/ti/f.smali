.class public final Lti/f;
.super Ld1/j;
.source "SourceFile"


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lti/f;->z:I

    iput-object p1, p0, Lti/f;->E:Ljava/lang/Object;

    const/16 p1, 0xb

    invoke-direct {p0, p1}, Ld1/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final z(Lej/b;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lti/f;->z:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lti/f;->E:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lti/f;->E:Ljava/lang/Object;

    check-cast v0, Ld1/j;

    invoke-virtual {v0, p1}, Ld1/j;->z(Lej/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    const v0, 0x40233333    # 2.55f

    mul-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
