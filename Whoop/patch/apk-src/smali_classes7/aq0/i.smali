.class public final synthetic Laq0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Laq0/i;->a:I

    iput-object p1, p0, Laq0/i;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, Laq0/i;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Laq0/i;->b:Ljava/lang/Object;

    check-cast v0, Lf53/e;

    invoke-virtual {v0, p1}, Lf53/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Laq0/i;->b:Ljava/lang/Object;

    check-cast v0, Lot2/i;

    invoke-static {v0, p1}, Lot2/k;->c(Lot2/i;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_1
    iget-object v0, p0, Laq0/i;->b:Ljava/lang/Object;

    check-cast v0, Lot2/i;

    invoke-static {v0, p1}, Lot2/j;->b(Lot2/i;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_2
    iget-object v0, p0, Laq0/i;->b:Ljava/lang/Object;

    check-cast v0, Lno1/g;

    invoke-static {v0, p1}, Lnq0/i;->z(Lno1/g;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_3
    iget-object v0, p0, Laq0/i;->b:Ljava/lang/Object;

    check-cast v0, Ljt2/h;

    invoke-static {v0, p1}, Ljt2/i;->a(Ljt2/h;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_4
    iget-object v0, p0, Laq0/i;->b:Ljava/lang/Object;

    check-cast v0, Ljt2/h;

    invoke-static {v0, p1}, Ljt2/i;->d(Ljt2/h;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_5
    iget-object v0, p0, Laq0/i;->b:Ljava/lang/Object;

    check-cast v0, Leg/j;

    invoke-static {v0, p1}, Lgh0/e;->a(Leg/j;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_6
    iget-object v0, p0, Laq0/i;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_7
    iget-object v0, p0, Laq0/i;->b:Ljava/lang/Object;

    check-cast v0, Lp;

    invoke-static {v0, p1}, Laq0/q;->N(Lp;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
