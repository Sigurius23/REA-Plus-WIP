.class public final synthetic Lih0/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lah0/h;


# direct methods
.method public synthetic constructor <init>(Lah0/h;I)V
    .locals 0

    iput p2, p0, Lih0/g0;->w:I

    iput-object p1, p0, Lih0/g0;->x:Lah0/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lih0/g0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lih0/g0;->x:Lah0/h;

    invoke-static {v0}, Lih0/e0;->P(Lah0/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lih0/g0;->x:Lah0/h;

    invoke-static {v0}, Lih0/e0;->V(Lah0/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lih0/g0;->x:Lah0/h;

    invoke-static {v0}, Lih0/e0$e;->f(Lah0/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
