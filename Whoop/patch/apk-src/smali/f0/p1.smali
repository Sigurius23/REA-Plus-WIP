.class public final synthetic Lf0/p1;
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

    iput p2, p0, Lf0/p1;->w:I

    iput-object p1, p0, Lf0/p1;->x:Lf0/r1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lf0/p1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf0/p1;->x:Lf0/r1;

    invoke-static {v0}, Lwm1/k;->l(Lf0/r1;)Lwm1/b;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lf0/p1;->x:Lf0/r1;

    invoke-static {v0}, Lwm1/k;->k(Lf0/r1;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lf0/p1;->x:Lf0/r1;

    iget-object v0, v0, Lf0/r1;->a:Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lf0/p1;->x:Lf0/r1;

    iget-object v1, v0, Lf0/r1;->a:Lp1/h1;

    invoke-virtual {v1}, Lp1/h1;->x()I

    move-result v1

    iget-object v0, v0, Lf0/r1;->d:Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    if-ge v1, v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
