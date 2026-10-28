.class public final synthetic Liw0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Liw0/r;->w:I

    iput p1, p0, Liw0/r;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Liw0/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Liw0/r;->x:I

    invoke-static {v0}, Lxq2/c1;->s(I)Lp1/a1;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Lo0/y;

    iget v1, p0, Liw0/r;->x:I

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo0/y;-><init>(II)V

    return-object v0

    :pswitch_1
    iget v0, p0, Liw0/r;->x:I

    invoke-static {v0}, Liw0/x;->R(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
