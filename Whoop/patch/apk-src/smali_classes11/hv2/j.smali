.class public final synthetic Lhv2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lhv2/j;->w:I

    iput-object p1, p0, Lhv2/j;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lhv2/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhv2/j;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    invoke-static {v0}, Lhv2/i;->h(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lhv2/j;->x:Ljava/lang/Object;

    check-cast v0, Lb3/x2;

    invoke-static {v0}, Lhv2/i;->p(Lb3/x2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lhv2/j;->x:Ljava/lang/Object;

    check-cast v0, Lhv2/a;

    invoke-static {v0}, Lhv2/i;->r(Lhv2/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lhv2/j;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    invoke-static {v0}, Lhv2/i;->y(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lhv2/j;->x:Ljava/lang/Object;

    check-cast v0, Ln0/u;

    invoke-static {v0}, Lhv2/i$k;->f(Ln0/u;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
