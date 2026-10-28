.class public final synthetic Lim1/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lf0/r1;


# direct methods
.method public synthetic constructor <init>(Lf0/r1;I)V
    .locals 0

    iput p2, p0, Lim1/u0;->w:I

    iput-object p1, p0, Lim1/u0;->x:Lf0/r1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lim1/u0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lim1/u0;->x:Lf0/r1;

    invoke-static {v0}, Lim1/t0;->a(Lf0/r1;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lim1/u0;->x:Lf0/r1;

    invoke-static {v0}, Lim1/t0$e;->f(Lf0/r1;)I

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
