.class public final Lb3/d3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxb3/i;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb3/d3;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb3/d3;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb3/d3;->a:I

    iput-object p1, p0, Lb3/d3;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lb3/d3;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v1, Lb3/c3;

    invoke-direct {v1, p2, p1}, Lb3/c3;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    iget v0, p0, Lb3/d3;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lrb3/p;

    iget-object v1, p0, Lb3/d3;->b:Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lrb3/p;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :pswitch_0
    new-instance v0, Lx83/k;

    invoke-direct {v0, p0}, Lx83/k;-><init>(Lb3/d3;)V

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lb3/d3;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ViewGroup;

    new-instance v1, Lh5/r0;

    invoke-direct {v1, v0}, Lh5/r0;-><init>(Landroid/view/ViewGroup;)V

    return-object v1

    :pswitch_2
    iget-object v0, p0, Lb3/d3;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
