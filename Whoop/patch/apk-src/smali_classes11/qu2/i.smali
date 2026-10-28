.class public final synthetic Lqu2/i;
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

    iput p2, p0, Lqu2/i;->w:I

    iput-object p1, p0, Lqu2/i;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lqu2/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqu2/i;->x:Ljava/lang/Object;

    check-cast v0, Ll83/h;

    invoke-static {v0}, Lqu2/h;->w(Ll83/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lqu2/i;->x:Ljava/lang/Object;

    check-cast v0, Lbm/t;

    invoke-static {v0}, Lqu2/h$b;->f(Lbm/t;)I

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
