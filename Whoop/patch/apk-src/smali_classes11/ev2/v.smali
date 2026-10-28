.class public final synthetic Lev2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lev2/v;->w:I

    iput-object p1, p0, Lev2/v;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lev2/v;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lev2/v;->x:Ljava/lang/Object;

    check-cast v0, Leb/u0;

    invoke-static {v0}, Lev2/u;->V(Leb/u0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lev2/v;->x:Ljava/lang/Object;

    check-cast v0, Ln0/u;

    invoke-static {v0}, Lev2/u$b;->f(Ln0/u;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
