.class public final synthetic Lmp0/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lmp0/b0;


# direct methods
.method public synthetic constructor <init>(Lmp0/b0;I)V
    .locals 0

    iput p2, p0, Lmp0/z;->w:I

    iput-object p1, p0, Lmp0/z;->x:Lmp0/b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lmp0/z;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmp0/z;->x:Lmp0/b0;

    invoke-static {v0}, Lmp0/b0;->M(Lmp0/b0;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lmp0/z;->x:Lmp0/b0;

    invoke-static {v0}, Lmp0/b0;->X(Lmp0/b0;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
