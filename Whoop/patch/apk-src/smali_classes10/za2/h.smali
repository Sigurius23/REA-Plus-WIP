.class public final synthetic Lza2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lza2/j;


# direct methods
.method public synthetic constructor <init>(Lza2/j;I)V
    .locals 0

    iput p2, p0, Lza2/h;->w:I

    iput-object p1, p0, Lza2/h;->x:Lza2/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lza2/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lza2/h;->x:Lza2/j;

    invoke-static {v0}, Lza2/j;->y(Lza2/j;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lza2/h;->x:Lza2/j;

    invoke-static {v0}, Lza2/j;->F(Lza2/j;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
