.class public final synthetic Lh0/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/internal/d0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/d0;I)V
    .locals 0

    iput p2, p0, Lh0/u0;->w:I

    iput-object p1, p0, Lh0/u0;->x:Lkotlin/jvm/internal/d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lh0/u0;->w:I

    check-cast p1, Lu2/r;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Lu2/r;->a()V

    iget-object p1, p0, Lh0/u0;->x:Lkotlin/jvm/internal/d0;

    iput p2, p1, Lkotlin/jvm/internal/d0;->w:F

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    invoke-virtual {p1}, Lu2/r;->a()V

    iget-object p1, p0, Lh0/u0;->x:Lkotlin/jvm/internal/d0;

    iput p2, p1, Lkotlin/jvm/internal/d0;->w:F

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
