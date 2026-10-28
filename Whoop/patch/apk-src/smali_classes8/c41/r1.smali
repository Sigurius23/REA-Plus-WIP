.class public final synthetic Lc41/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z


# direct methods
.method public synthetic constructor <init>(ZI)V
    .locals 0

    iput p2, p0, Lc41/r1;->w:I

    iput-boolean p1, p0, Lc41/r1;->x:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lc41/r1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lc41/r1;->x:Z

    invoke-static {v0}, Lzv2/e;->i(Z)Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-boolean v0, p0, Lc41/r1;->x:Z

    invoke-static {v0}, Lvt2/f;->e(Z)Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-boolean v0, p0, Lc41/r1;->x:Z

    invoke-static {v0}, Lis0/j0;->c(Z)Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-boolean v0, p0, Lc41/r1;->x:Z

    invoke-static {v0}, Lhy0/g1;->g(Z)Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-boolean v0, p0, Lc41/r1;->x:Z

    invoke-static {v0}, Lc41/v1;->g(Z)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
