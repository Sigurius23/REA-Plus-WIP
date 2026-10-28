.class public final synthetic Lwr0/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Lp1/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lp1/a1;I)V
    .locals 0

    iput p3, p0, Lwr0/q0;->w:I

    iput-object p1, p0, Lwr0/q0;->x:Ljava/util/List;

    iput-object p2, p0, Lwr0/q0;->y:Lp1/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lwr0/q0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lwr0/q0;->y:Lp1/a1;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lwr0/q0;->x:Ljava/util/List;

    invoke-static {v1, v0, p1}, Lzc1/s0;->b(Ljava/util/List;Lp1/a1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lwr0/q0;->x:Ljava/util/List;

    iget-object v1, p0, Lwr0/q0;->y:Lp1/a1;

    invoke-static {v0, v1, p1}, Lwr0/u0;->s(Ljava/util/List;Lp1/a1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
