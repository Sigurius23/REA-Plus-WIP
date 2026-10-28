.class public final synthetic La41/f;
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

    iput p2, p0, La41/f;->w:I

    iput-object p1, p0, La41/f;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, La41/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La41/f;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    invoke-static {v0}, La41/l;->l(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, La41/f;->x:Ljava/lang/Object;

    check-cast v0, La41/m;

    invoke-static {v0}, La41/l;->m(La41/m;)I

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
