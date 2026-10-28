.class public final synthetic Lbp0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/z0;


# direct methods
.method public synthetic constructor <init>(Lp1/z0;I)V
    .locals 0

    iput p2, p0, Lbp0/g;->w:I

    iput-object p1, p0, Lbp0/g;->x:Lp1/z0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lbp0/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbp0/g;->x:Lp1/z0;

    check-cast p1, Ly3/l;

    invoke-static {v0, p1}, Lbp0/s;->z(Lp1/z0;Ly3/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lbp0/g;->x:Lp1/z0;

    invoke-static {v0, p1}, Lbp0/s;->d(Lp1/z0;F)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
