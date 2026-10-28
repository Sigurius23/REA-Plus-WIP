.class public final Lte3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbf3/a;
.implements Lqe3/a;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lte3/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lab/i0;)V
    .locals 2

    iget v0, p0, Lte3/b;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lwe3/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lwe3/a;-><init>(I)V

    iget-object p1, p1, Lab/i0;->y:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_0
    new-instance v0, Lue3/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, Lab/i0;->z:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
