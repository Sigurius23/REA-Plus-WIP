.class public final synthetic Lcu2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Leb/q;


# direct methods
.method public synthetic constructor <init>(Leb/q;I)V
    .locals 0

    iput p2, p0, Lcu2/i;->w:I

    iput-object p1, p0, Lcu2/i;->x:Leb/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcu2/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcu2/i;->x:Leb/q;

    invoke-static {v0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$d;->b(Leb/q;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcu2/i;->x:Leb/q;

    invoke-static {v0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$a;->a(Leb/q;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
