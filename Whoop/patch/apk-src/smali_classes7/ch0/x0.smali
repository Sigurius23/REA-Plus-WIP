.class public final synthetic Lch0/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, Lch0/x0;->w:I

    iput-boolean p6, p0, Lch0/x0;->x:Z

    iput-object p2, p0, Lch0/x0;->y:Ljava/lang/Object;

    iput-object p3, p0, Lch0/x0;->z:Ljava/lang/Object;

    iput-object p4, p0, Lch0/x0;->E:Ljava/lang/Object;

    iput-object p5, p0, Lch0/x0;->F:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;Lg1/y3;ZLc93/a;Lg1/y3;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lch0/x0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch0/x0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lch0/x0;->z:Ljava/lang/Object;

    iput-boolean p3, p0, Lch0/x0;->x:Z

    iput-object p4, p0, Lch0/x0;->F:Ljava/lang/Object;

    iput-object p5, p0, Lch0/x0;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lg1/z3;Ly3/c;Lkotlin/jvm/functions/Function1;Ld0/l;Z)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Lch0/x0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch0/x0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lch0/x0;->z:Ljava/lang/Object;

    iput-object p3, p0, Lch0/x0;->E:Ljava/lang/Object;

    iput-object p4, p0, Lch0/x0;->F:Ljava/lang/Object;

    iput-boolean p5, p0, Lch0/x0;->x:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lch0/x0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch0/x0;->y:Ljava/lang/Object;

    check-cast v0, Lwb0/i$d;

    iget-object v1, p0, Lch0/x0;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lch0/x0;->E:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    iget-object v3, p0, Lch0/x0;->F:Ljava/lang/Object;

    check-cast v3, Lp1/c1;

    iget-boolean v4, p0, Lch0/x0;->x:Z

    invoke-static {v4, v0, v1, v2, v3}, Lyb0/k;->K(ZLwb0/i$d;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lch0/x0;->y:Ljava/lang/Object;

    check-cast v0, Lz1/p;

    iget-object v1, p0, Lch0/x0;->z:Ljava/lang/Object;

    check-cast v1, Lj72/l;

    iget-object v2, p0, Lch0/x0;->E:Ljava/lang/Object;

    check-cast v2, Lj72/m;

    iget-object v3, p0, Lch0/x0;->F:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-boolean v4, p0, Lch0/x0;->x:Z

    invoke-static {v4, v0, v1, v2, v3}, Ll72/p;->h(ZLz1/p;Lj72/l;Lj72/m;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lch0/x0;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lg1/z3;

    iget-object v0, p0, Lch0/x0;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ly3/c;

    iget-object v0, p0, Lch0/x0;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lch0/x0;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ld0/l;

    new-instance v1, Lg1/y3;

    iget-boolean v6, p0, Lch0/x0;->x:Z

    invoke-direct/range {v1 .. v6}, Lg1/y3;-><init>(Lg1/z3;Ly3/c;Lkotlin/jvm/functions/Function1;Ld0/l;Z)V

    return-object v1

    :pswitch_2
    iget-object v0, p0, Lch0/x0;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Lch0/x0;->z:Ljava/lang/Object;

    check-cast v1, Lg1/y3;

    iget-object v2, p0, Lch0/x0;->F:Ljava/lang/Object;

    check-cast v2, Lc93/a;

    iget-object v3, p0, Lch0/x0;->E:Ljava/lang/Object;

    check-cast v3, Lg1/y3;

    iget-boolean v4, p0, Lch0/x0;->x:Z

    invoke-static {v0, v1, v4, v2, v3}, Lch0/c1;->e(Lbc3/c0;Lg1/y3;ZLc93/a;Lg1/y3;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
