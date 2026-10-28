.class public final synthetic Lsn/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyr/i;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lb30/m;

.field public final synthetic y:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(Lb30/m;Ljava/lang/Class;I)V
    .locals 0

    iput p3, p0, Lsn/i;->w:I

    iput-object p1, p0, Lsn/i;->x:Lb30/m;

    iput-object p2, p0, Lsn/i;->y:Ljava/lang/Class;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lsn/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsn/i;->x:Lb30/m;

    iget-object v0, v0, Lb30/m;->x:Ljava/lang/Object;

    check-cast v0, Ld1/j;

    iget-object v1, p0, Lsn/i;->y:Ljava/lang/Class;

    invoke-static {v1, v0}, Lsn/j;->b(Ljava/lang/Class;Ld1/j;)Lsn/u;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lsn/i;->x:Lb30/m;

    iget-object v0, v0, Lb30/m;->x:Ljava/lang/Object;

    check-cast v0, Ld1/j;

    iget-object v1, p0, Lsn/i;->y:Ljava/lang/Class;

    invoke-static {v1, v0}, Lsn/j;->b(Ljava/lang/Class;Ld1/j;)Lsn/u;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lsn/i;->x:Lb30/m;

    iget-object v0, v0, Lb30/m;->x:Ljava/lang/Object;

    check-cast v0, Ld1/j;

    iget-object v1, p0, Lsn/i;->y:Ljava/lang/Class;

    invoke-static {v1, v0}, Lsn/j;->b(Ljava/lang/Class;Ld1/j;)Lsn/u;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
