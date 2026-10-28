.class public final synthetic Lhj0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lhj0/k;


# direct methods
.method public synthetic constructor <init>(Lhj0/k;I)V
    .locals 0

    iput p2, p0, Lhj0/j;->w:I

    iput-object p1, p0, Lhj0/j;->x:Lhj0/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lhj0/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhj0/j;->x:Lhj0/k;

    invoke-static {v0}, Lhj0/k;->z(Lhj0/k;)Lhj0/r;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lhj0/j;->x:Lhj0/k;

    invoke-static {v0}, Lhj0/k;->A(Lhj0/k;)Ltr2/n;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
