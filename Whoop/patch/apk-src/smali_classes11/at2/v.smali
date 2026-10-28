.class public final synthetic Lat2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg1/y3;


# direct methods
.method public synthetic constructor <init>(Lg1/y3;I)V
    .locals 0

    iput p2, p0, Lat2/v;->w:I

    iput-object p1, p0, Lat2/v;->x:Lg1/y3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lat2/v;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lat2/v;->x:Lg1/y3;

    invoke-static {v0}, Lat2/c0$a;->f(Lg1/y3;)Lg1/z3;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lat2/v;->x:Lg1/y3;

    invoke-static {v0}, Lat2/w$a;->f(Lg1/y3;)Lg1/z3;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
