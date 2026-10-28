.class public final synthetic Lpj2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic F:Lg1/y3;

.field public final synthetic w:I

.field public final synthetic x:Lnj2/b;

.field public final synthetic y:Lbc3/c0;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lnj2/b;Lbc3/c0;Lp1/c1;Lp1/c1;Lg1/y3;I)V
    .locals 0

    iput p6, p0, Lpj2/l;->w:I

    iput-object p1, p0, Lpj2/l;->x:Lnj2/b;

    iput-object p2, p0, Lpj2/l;->y:Lbc3/c0;

    iput-object p3, p0, Lpj2/l;->z:Lp1/c1;

    iput-object p4, p0, Lpj2/l;->E:Lp1/c1;

    iput-object p5, p0, Lpj2/l;->F:Lg1/y3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lpj2/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpj2/l;->E:Lp1/c1;

    iget-object v1, p0, Lpj2/l;->F:Lg1/y3;

    iget-object v2, p0, Lpj2/l;->x:Lnj2/b;

    iget-object v3, p0, Lpj2/l;->y:Lbc3/c0;

    iget-object v4, p0, Lpj2/l;->z:Lp1/c1;

    invoke-static {v2, v3, v4, v0, v1}, Lpj2/q;->i(Lnj2/b;Lbc3/c0;Lp1/c1;Lp1/c1;Lg1/y3;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lpj2/l;->E:Lp1/c1;

    iget-object v1, p0, Lpj2/l;->F:Lg1/y3;

    iget-object v2, p0, Lpj2/l;->x:Lnj2/b;

    iget-object v3, p0, Lpj2/l;->y:Lbc3/c0;

    iget-object v4, p0, Lpj2/l;->z:Lp1/c1;

    invoke-static {v2, v3, v4, v0, v1}, Lpj2/q;->h(Lnj2/b;Lbc3/c0;Lp1/c1;Lp1/c1;Lg1/y3;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
