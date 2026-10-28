.class public final synthetic Li0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/internal/d0;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/d0;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p3, p0, Li0/d;->w:I

    iput-object p1, p0, Li0/d;->x:Lkotlin/jvm/internal/d0;

    iput-object p2, p0, Li0/d;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Li0/d;->w:I

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Li0/d;->x:Lkotlin/jvm/internal/d0;

    iget v1, v0, Lkotlin/jvm/internal/d0;->w:F

    sub-float/2addr v1, p1

    iput v1, v0, Lkotlin/jvm/internal/d0;->w:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iget-object v0, p0, Li0/d;->y:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Li0/d;->x:Lkotlin/jvm/internal/d0;

    iget v1, v0, Lkotlin/jvm/internal/d0;->w:F

    sub-float/2addr v1, p1

    iput v1, v0, Lkotlin/jvm/internal/d0;->w:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iget-object v0, p0, Li0/d;->y:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
