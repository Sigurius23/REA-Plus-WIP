.class public final synthetic Le1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Le1/j;


# direct methods
.method public synthetic constructor <init>(Le1/j;I)V
    .locals 0

    iput p2, p0, Le1/i;->w:I

    iput-object p1, p0, Le1/i;->x:Le1/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Le1/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Le1/i;->x:Le1/j;

    iget-object v0, v0, Le1/j;->z:Le1/l;

    invoke-virtual {v0}, Le1/l;->b()Ly2/y;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Le1/i;->x:Le1/j;

    iget-object v0, v0, Le1/j;->z:Le1/l;

    invoke-virtual {v0}, Le1/l;->e()Ll3/r0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Le1/i;->x:Le1/j;

    iget-object v0, v0, Le1/j;->z:Le1/l;

    invoke-virtual {v0}, Le1/l;->b()Ly2/y;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
