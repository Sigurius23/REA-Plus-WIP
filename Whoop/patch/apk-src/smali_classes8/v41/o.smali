.class public final synthetic Lv41/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lui/i;


# direct methods
.method public synthetic constructor <init>(Lui/i;I)V
    .locals 0

    iput p2, p0, Lv41/o;->w:I

    iput-object p1, p0, Lv41/o;->x:Lui/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lv41/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lv41/o;->x:Lui/i;

    invoke-static {v0}, Lv41/q0;->b(Lui/i;)F

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lv41/o;->x:Lui/i;

    invoke-static {v0}, Lv41/p;->e(Lui/i;)F

    move-result v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
