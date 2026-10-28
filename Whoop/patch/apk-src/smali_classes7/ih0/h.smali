.class public final synthetic Lih0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(ILp1/c1;)V
    .locals 0

    iput p1, p0, Lih0/h;->w:I

    iput-object p2, p0, Lih0/h;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lih0/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lih0/h;->x:Lp1/c1;

    check-cast p1, Ly3/l;

    invoke-static {v0, p1}, Lih0/n;->c(Lp1/c1;Ly3/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lih0/h;->x:Lp1/c1;

    check-cast p1, Lg2/v;

    invoke-static {v0, p1}, Lih0/n;->b(Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lih0/h;->x:Lp1/c1;

    invoke-static {v0, p1}, Lih0/l;->b(Lp1/c1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
