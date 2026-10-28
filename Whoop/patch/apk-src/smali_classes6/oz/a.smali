.class public final synthetic Loz/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljz/f;


# direct methods
.method public synthetic constructor <init>(Ljz/f;I)V
    .locals 0

    iput p2, p0, Loz/a;->w:I

    iput-object p1, p0, Loz/a;->x:Ljz/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Loz/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Loz/a;->x:Ljz/f;

    iget-object v0, v0, Ljz/f;->y:Ljava/lang/String;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Loz/a;->x:Ljz/f;

    iget-object v0, v0, Ljz/f;->x:Ljava/lang/String;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
