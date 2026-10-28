.class public final synthetic Ll1/u3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lm1/f;

.field public final synthetic y:Lkotlin/jvm/internal/d0;


# direct methods
.method public synthetic constructor <init>(Lm1/f;Lkotlin/jvm/internal/d0;I)V
    .locals 0

    iput p3, p0, Ll1/u3;->w:I

    iput-object p1, p0, Ll1/u3;->x:Lm1/f;

    iput-object p2, p0, Ll1/u3;->y:Lkotlin/jvm/internal/d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ll1/u3;->w:I

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll1/u3;->x:Lm1/f;

    iget-object v0, v0, Lm1/f;->a:Lm1/g;

    iget-object v1, v0, Lm1/g;->j:Lp1/g1;

    invoke-virtual {v1, p1}, Lp1/g1;->y(F)V

    iget-object v0, v0, Lm1/g;->k:Lp1/g1;

    invoke-virtual {v0, p2}, Lp1/g1;->y(F)V

    iget-object p2, p0, Ll1/u3;->y:Lkotlin/jvm/internal/d0;

    iput p1, p2, Lkotlin/jvm/internal/d0;->w:F

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ll1/u3;->x:Lm1/f;

    iget-object v0, v0, Lm1/f;->a:Lm1/g;

    iget-object v1, v0, Lm1/g;->j:Lp1/g1;

    invoke-virtual {v1, p1}, Lp1/g1;->y(F)V

    iget-object v0, v0, Lm1/g;->k:Lp1/g1;

    invoke-virtual {v0, p2}, Lp1/g1;->y(F)V

    iget-object p2, p0, Ll1/u3;->y:Lkotlin/jvm/internal/d0;

    iput p1, p2, Lkotlin/jvm/internal/d0;->w:F

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
