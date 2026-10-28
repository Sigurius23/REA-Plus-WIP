.class public final synthetic Lg1/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ly3/c;


# direct methods
.method public synthetic constructor <init>(ILy3/c;)V
    .locals 0

    iput p1, p0, Lg1/q0;->w:I

    iput-object p2, p0, Lg1/q0;->x:Ly3/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lg1/q0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lg1/q0;->x:Ly3/c;

    invoke-static {p1, v0}, Lqj2/b;->f(ILy3/c;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    sget p1, Landroidx/compose/material/c;->a:F

    iget-object v0, p0, Lg1/q0;->x:Ly3/c;

    invoke-interface {v0, p1}, Ly3/c;->q0(F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    sget p1, Lg1/p2;->a:F

    iget-object v0, p0, Lg1/q0;->x:Ly3/c;

    invoke-interface {v0, p1}, Ly3/c;->q0(F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
