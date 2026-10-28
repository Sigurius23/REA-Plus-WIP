.class public final synthetic Lvo1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic w:I

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Lso1/g;

.field public final synthetic z:Lg1/y3;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lso1/g;Lg1/y3;Lp1/c1;I)V
    .locals 0

    iput p5, p0, Lvo1/f;->w:I

    iput-object p1, p0, Lvo1/f;->x:Lbc3/c0;

    iput-object p2, p0, Lvo1/f;->y:Lso1/g;

    iput-object p3, p0, Lvo1/f;->z:Lg1/y3;

    iput-object p4, p0, Lvo1/f;->E:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lvo1/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvo1/f;->z:Lg1/y3;

    iget-object v1, p0, Lvo1/f;->E:Lp1/c1;

    iget-object v2, p0, Lvo1/f;->x:Lbc3/c0;

    iget-object v3, p0, Lvo1/f;->y:Lso1/g;

    invoke-static {v2, v3, v0, v1}, Lvo1/g;->m(Lbc3/c0;Lso1/g;Lg1/y3;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lvo1/f;->z:Lg1/y3;

    iget-object v1, p0, Lvo1/f;->E:Lp1/c1;

    iget-object v2, p0, Lvo1/f;->x:Lbc3/c0;

    iget-object v3, p0, Lvo1/f;->y:Lso1/g;

    invoke-static {v2, v3, v0, v1}, Lvo1/g;->f(Lbc3/c0;Lso1/g;Lg1/y3;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
