.class public final synthetic Lb70/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lld1/c;


# direct methods
.method public synthetic constructor <init>(Lld1/c;I)V
    .locals 0

    iput p2, p0, Lb70/b;->w:I

    iput-object p1, p0, Lb70/b;->x:Lld1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lb70/b;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iget-object p1, p0, Lb70/b;->x:Lld1/c;

    invoke-static {p1, v0, v1}, Lyl0/n;->d(Lld1/c;D)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb70/b;->x:Lld1/c;

    check-cast p1, Lvn1/i;

    invoke-static {v0, p1}, Lrm1/i;->f(Lld1/c;Lvn1/i;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lb70/b;->x:Lld1/c;

    check-cast p1, Ljava/time/LocalDate;

    invoke-static {v0, p1}, Ldn0/p;->a(Lld1/c;Ljava/time/LocalDate;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lb70/b;->x:Lld1/c;

    invoke-static {v0, p1}, Ldn0/p;->t(Lld1/c;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lb70/b;->x:Lld1/c;

    invoke-static {v0, p1}, Ldn0/p;->q(Lld1/c;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lb70/b;->x:Lld1/c;

    check-cast p1, Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {v0, p1}, Lb70/d;->c(Lld1/c;Lcom/whoop/analytics/AnalyticEventModel;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
