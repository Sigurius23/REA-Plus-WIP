.class public final synthetic Lbm2/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lp1/a1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lp1/a1;I)V
    .locals 0

    iput p3, p0, Lbm2/w0;->w:I

    iput-object p1, p0, Lbm2/w0;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lbm2/w0;->y:Lp1/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lbm2/w0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbm2/w0;->y:Lp1/a1;

    check-cast p1, Lhu2/a;

    iget-object v1, p0, Lbm2/w0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lqu2/h;->d(Lkotlin/jvm/functions/Function1;Lp1/a1;Lhu2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lbm2/w0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbm2/w0;->y:Lp1/a1;

    invoke-static {v0, v1, p1}, Lbm2/z0;->r(Lkotlin/jvm/functions/Function1;Lp1/a1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
