.class public final synthetic Lam2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic F:Lg1/y3;

.field public final synthetic G:Lp1/c1;

.field public final synthetic w:I

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Lg1/y3;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Lp1/c1;Lg1/y3;Lp1/c1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lam2/v;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lam2/v;->x:Lbc3/c0;

    iput-object p2, p0, Lam2/v;->y:Lg1/y3;

    iput-object p3, p0, Lam2/v;->z:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lam2/v;->E:Lp1/c1;

    iput-object p5, p0, Lam2/v;->F:Lg1/y3;

    iput-object p6, p0, Lam2/v;->G:Lp1/c1;

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lp1/c1;Lg1/y3;Lp1/c1;Lg1/y3;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lam2/v;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lam2/v;->x:Lbc3/c0;

    iput-object p2, p0, Lam2/v;->z:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lam2/v;->E:Lp1/c1;

    iput-object p4, p0, Lam2/v;->y:Lg1/y3;

    iput-object p5, p0, Lam2/v;->G:Lp1/c1;

    iput-object p6, p0, Lam2/v;->F:Lg1/y3;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lam2/v;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v5, p0, Lam2/v;->F:Lg1/y3;

    iget-object v6, p0, Lam2/v;->G:Lp1/c1;

    iget-object v1, p0, Lam2/v;->x:Lbc3/c0;

    iget-object v2, p0, Lam2/v;->y:Lg1/y3;

    iget-object v3, p0, Lam2/v;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lam2/v;->E:Lp1/c1;

    invoke-static/range {v1 .. v6}, Lam2/o0;->g(Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Lp1/c1;Lg1/y3;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v6, p0, Lam2/v;->G:Lp1/c1;

    iget-object v5, p0, Lam2/v;->F:Lg1/y3;

    iget-object v1, p0, Lam2/v;->x:Lbc3/c0;

    iget-object v2, p0, Lam2/v;->y:Lg1/y3;

    iget-object v3, p0, Lam2/v;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lam2/v;->E:Lp1/c1;

    invoke-static/range {v1 .. v6}, Lam2/w;->g(Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Lp1/c1;Lg1/y3;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
