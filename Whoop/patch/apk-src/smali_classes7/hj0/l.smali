.class public final synthetic Lhj0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lhj0/m;


# direct methods
.method public synthetic constructor <init>(Lhj0/m;I)V
    .locals 0

    iput p2, p0, Lhj0/l;->w:I

    iput-object p1, p0, Lhj0/l;->x:Lhj0/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lhj0/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhj0/l;->x:Lhj0/m;

    invoke-static {v0}, Lhj0/m;->y(Lhj0/m;)Lhj0/r;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lhj0/l;->x:Lhj0/m;

    invoke-static {v0}, Lhj0/m;->z(Lhj0/m;)Ltr2/n;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
