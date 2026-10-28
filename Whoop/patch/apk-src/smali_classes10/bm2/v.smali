.class public final synthetic Lbm2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Lbc3/c0;

.field public final synthetic z:Lg1/y3;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lc93/a;Lg1/y3;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput v0, p0, Lbm2/v;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbm2/v;->y:Lbc3/c0;

    iput-object p2, p0, Lbm2/v;->x:Lc93/a;

    iput-object p3, p0, Lbm2/v;->z:Lg1/y3;

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;Lg1/y3;Lc93/a;I)V
    .locals 0

    .line 2
    iput p4, p0, Lbm2/v;->w:I

    iput-object p1, p0, Lbm2/v;->y:Lbc3/c0;

    iput-object p2, p0, Lbm2/v;->z:Lg1/y3;

    iput-object p3, p0, Lbm2/v;->x:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lc93/a;Lbc3/c0;Lg1/y3;)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Lbm2/v;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbm2/v;->x:Lc93/a;

    iput-object p2, p0, Lbm2/v;->y:Lbc3/c0;

    iput-object p3, p0, Lbm2/v;->z:Lg1/y3;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lbm2/v;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbm2/v;->x:Lc93/a;

    iget-object v1, p0, Lbm2/v;->z:Lg1/y3;

    iget-object v2, p0, Lbm2/v;->y:Lbc3/c0;

    invoke-static {v2, v0, v1}, Lwo1/l;->f(Lbc3/c0;Lc93/a;Lg1/y3;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lbm2/v;->z:Lg1/y3;

    iget-object v1, p0, Lbm2/v;->x:Lc93/a;

    iget-object v2, p0, Lbm2/v;->y:Lbc3/c0;

    invoke-static {v2, v1, v0}, Lgt1/n;->c(Lbc3/c0;Lc93/a;Lg1/y3;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lbm2/v;->y:Lbc3/c0;

    iget-object v1, p0, Lbm2/v;->z:Lg1/y3;

    iget-object v2, p0, Lbm2/v;->x:Lc93/a;

    invoke-static {v0, v2, v1}, Lgt1/n;->b(Lbc3/c0;Lc93/a;Lg1/y3;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lbm2/v;->z:Lg1/y3;

    iget-object v1, p0, Lbm2/v;->x:Lc93/a;

    iget-object v2, p0, Lbm2/v;->y:Lbc3/c0;

    invoke-static {v2, v1, v0}, Lbm2/e0;->o(Lbc3/c0;Lc93/a;Lg1/y3;)Ll83/a0;

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
