.class public final synthetic Lfz/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc20/g;


# direct methods
.method public synthetic constructor <init>(Lc20/g;I)V
    .locals 0

    iput p2, p0, Lfz/a;->w:I

    iput-object p1, p0, Lfz/a;->x:Lc20/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lfz/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfz/a;->x:Lc20/g;

    invoke-virtual {v0}, Lc20/g;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lux/y;

    iget-object v0, v0, Lux/y;->w:Ljava/lang/String;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lfz/a;->x:Lc20/g;

    invoke-virtual {v0}, Lc20/g;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lux/y;

    iget-object v0, v0, Lux/y;->x:Ljava/lang/String;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
