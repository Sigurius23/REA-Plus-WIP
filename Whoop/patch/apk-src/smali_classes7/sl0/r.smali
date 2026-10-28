.class public final synthetic Lsl0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lsl0/n0;


# direct methods
.method public synthetic constructor <init>(Lsl0/n0;I)V
    .locals 0

    iput p2, p0, Lsl0/r;->w:I

    iput-object p1, p0, Lsl0/r;->x:Lsl0/n0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsl0/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsl0/r;->x:Lsl0/n0;

    invoke-static {v0}, Lsl0/s;->c(Lsl0/n0;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lsl0/r;->x:Lsl0/n0;

    invoke-static {v0}, Lsl0/s;->a(Lsl0/n0;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
