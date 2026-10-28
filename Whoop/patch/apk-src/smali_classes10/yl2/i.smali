.class public final synthetic Lyl2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lyl2/k;

.field public final synthetic y:Lyl2/g;


# direct methods
.method public synthetic constructor <init>(Lyl2/k;Lyl2/g;I)V
    .locals 0

    iput p3, p0, Lyl2/i;->w:I

    iput-object p1, p0, Lyl2/i;->x:Lyl2/k;

    iput-object p2, p0, Lyl2/i;->y:Lyl2/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lyl2/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lyl2/i;->x:Lyl2/k;

    iget-object v1, p0, Lyl2/i;->y:Lyl2/g;

    invoke-static {v0, v1}, Lyl2/k;->f(Lyl2/k;Lyl2/g;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lyl2/i;->x:Lyl2/k;

    iget-object v1, p0, Lyl2/i;->y:Lyl2/g;

    invoke-static {v0, v1}, Lyl2/k;->a(Lyl2/k;Lyl2/g;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
