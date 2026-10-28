.class public final synthetic Lch0/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lch0/v0;Lg1/y3;Lg1/y3;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lch0/e1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch0/e1;->x:Lbc3/c0;

    iput-object p2, p0, Lch0/e1;->y:Ljava/lang/Object;

    iput-object p3, p0, Lch0/e1;->z:Ljava/lang/Object;

    iput-object p4, p0, Lch0/e1;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lc93/a;Lbc3/c0;Lf0/r1;Lc93/a;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lch0/e1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch0/e1;->y:Ljava/lang/Object;

    iput-object p2, p0, Lch0/e1;->x:Lbc3/c0;

    iput-object p3, p0, Lch0/e1;->z:Ljava/lang/Object;

    iput-object p4, p0, Lch0/e1;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lch0/e1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch0/e1;->y:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p0, Lch0/e1;->z:Ljava/lang/Object;

    check-cast v1, Lf0/r1;

    iget-object v2, p0, Lch0/e1;->E:Ljava/lang/Object;

    check-cast v2, Lc93/a;

    iget-object v3, p0, Lch0/e1;->x:Lbc3/c0;

    invoke-static {v0, v3, v1, v2}, Lch0/q0;->g(Lc93/a;Lbc3/c0;Lf0/r1;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lch0/e1;->y:Ljava/lang/Object;

    check-cast v0, Lch0/v0;

    iget-object v1, p0, Lch0/e1;->z:Ljava/lang/Object;

    check-cast v1, Lg1/y3;

    iget-object v2, p0, Lch0/e1;->E:Ljava/lang/Object;

    check-cast v2, Lg1/y3;

    iget-object v3, p0, Lch0/e1;->x:Lbc3/c0;

    invoke-static {v3, v0, v1, v2}, Lch0/c1$m;->h(Lbc3/c0;Lch0/v0;Lg1/y3;Lg1/y3;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
