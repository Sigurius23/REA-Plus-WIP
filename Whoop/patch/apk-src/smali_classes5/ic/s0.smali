.class public final synthetic Lic/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/work/Worker;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/Worker;I)V
    .locals 0

    iput p2, p0, Lic/s0;->w:I

    iput-object p1, p0, Lic/s0;->x:Landroidx/work/Worker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lic/s0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lic/s0;->x:Landroidx/work/Worker;

    invoke-virtual {v0}, Landroidx/work/Worker;->b()Lic/m;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lic/s0;->x:Landroidx/work/Worker;

    invoke-virtual {v0}, Landroidx/work/Worker;->a()Lic/t;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
