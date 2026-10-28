.class public final Lxi/a;
.super Lal/a;
.source "SourceFile"


# instance fields
.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;I)V
    .locals 0

    iput p2, p0, Lxi/a;->y:I

    const/4 p2, 0x7

    invoke-direct {p0, p1, p2}, Lal/a;-><init>(Ljava/lang/Object;I)V

    return-void
.end method


# virtual methods
.method public final k0()Lti/d;
    .locals 3

    iget v0, p0, Lxi/a;->y:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lti/m;

    iget-object v1, p0, Lal/a;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-direct {v0, v1}, Lti/m;-><init>(Ljava/util/List;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lti/i;

    iget-object v1, p0, Lal/a;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lti/i;-><init>(Ljava/util/List;I)V

    return-object v0

    :pswitch_1
    new-instance v0, Lti/i;

    iget-object v1, p0, Lal/a;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lti/i;-><init>(Ljava/util/List;I)V

    return-object v0

    :pswitch_2
    new-instance v0, Lti/e;

    iget-object v1, p0, Lal/a;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lti/e;-><init>(Ljava/util/List;I)V

    return-object v0

    :pswitch_3
    new-instance v0, Lti/i;

    iget-object v1, p0, Lal/a;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lti/i;-><init>(Ljava/util/List;I)V

    return-object v0

    :pswitch_4
    new-instance v0, Lti/e;

    iget-object v1, p0, Lal/a;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lti/e;-><init>(Ljava/util/List;I)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
