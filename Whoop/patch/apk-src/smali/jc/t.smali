.class public final synthetic Ljc/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/work/impl/WorkDatabase_Impl;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;I)V
    .locals 0

    iput p2, p0, Ljc/t;->w:I

    iput-object p1, p0, Ljc/t;->x:Landroidx/work/impl/WorkDatabase_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ljc/t;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lqc/g;

    iget-object v1, p0, Ljc/t;->x:Landroidx/work/impl/WorkDatabase_Impl;

    invoke-direct {v0, v1}, Lqc/g;-><init>(Landroidx/room/z0;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lqc/e;

    iget-object v1, p0, Ljc/t;->x:Landroidx/work/impl/WorkDatabase_Impl;

    invoke-direct {v0, v1}, Lqc/e;-><init>(Landroidx/room/z0;)V

    return-object v0

    :pswitch_1
    new-instance v0, Lqc/n;

    iget-object v1, p0, Ljc/t;->x:Landroidx/work/impl/WorkDatabase_Impl;

    invoke-direct {v0, v1}, Lqc/n;-><init>(Landroidx/room/z0;)V

    return-object v0

    :pswitch_2
    new-instance v0, Lqc/l;

    iget-object v1, p0, Ljc/t;->x:Landroidx/work/impl/WorkDatabase_Impl;

    invoke-direct {v0, v1}, Lqc/l;-><init>(Landroidx/room/z0;)V

    return-object v0

    :pswitch_3
    new-instance v0, Lqc/i;

    iget-object v1, p0, Ljc/t;->x:Landroidx/work/impl/WorkDatabase_Impl;

    invoke-direct {v0, v1}, Lqc/i;-><init>(Landroidx/room/z0;)V

    return-object v0

    :pswitch_4
    new-instance v0, Lqc/w;

    iget-object v1, p0, Ljc/t;->x:Landroidx/work/impl/WorkDatabase_Impl;

    invoke-direct {v0, v1}, Lqc/w;-><init>(Landroidx/room/z0;)V

    return-object v0

    :pswitch_5
    new-instance v0, Lqc/c;

    iget-object v1, p0, Ljc/t;->x:Landroidx/work/impl/WorkDatabase_Impl;

    invoke-direct {v0, v1}, Lqc/c;-><init>(Landroidx/room/z0;)V

    return-object v0

    :pswitch_6
    new-instance v0, Lqc/u;

    iget-object v1, p0, Ljc/t;->x:Landroidx/work/impl/WorkDatabase_Impl;

    invoke-direct {v0, v1}, Lqc/u;-><init>(Landroidx/room/z0;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
