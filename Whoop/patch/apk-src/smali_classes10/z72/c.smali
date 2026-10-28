.class public final synthetic Lz72/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ly3/c;

.field public final synthetic y:Lf0/r1;


# direct methods
.method public synthetic constructor <init>(Ly3/c;Lf0/r1;I)V
    .locals 0

    iput p3, p0, Lz72/c;->w:I

    iput-object p1, p0, Lz72/c;->x:Ly3/c;

    iput-object p2, p0, Lz72/c;->y:Lf0/r1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lz72/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lz72/c;->x:Ly3/c;

    iget-object v1, p0, Lz72/c;->y:Lf0/r1;

    invoke-static {v0, v1}, Lzd0/b;->k(Ly3/c;Lf0/r1;)F

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lz72/c;->x:Ly3/c;

    iget-object v1, p0, Lz72/c;->y:Lf0/r1;

    invoke-static {v0, v1}, Lz72/g;->x(Ly3/c;Lf0/r1;)F

    move-result v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
