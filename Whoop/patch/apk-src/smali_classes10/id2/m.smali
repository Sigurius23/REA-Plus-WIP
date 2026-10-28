.class public final synthetic Lid2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lid2/j;


# direct methods
.method public synthetic constructor <init>(Lid2/j;I)V
    .locals 0

    iput p2, p0, Lid2/m;->w:I

    iput-object p1, p0, Lid2/m;->x:Lid2/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lid2/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lid2/m;->x:Lid2/j;

    invoke-static {v0}, Lid2/n;->i(Lid2/j;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lid2/m;->x:Lid2/j;

    invoke-static {v0}, Lid2/n;->g(Lid2/j;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
