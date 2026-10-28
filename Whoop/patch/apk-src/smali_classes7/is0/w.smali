.class public final synthetic Lis0/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lis0/j;

.field public final synthetic F:Lp1/a1;

.field public final synthetic w:I

.field public final synthetic x:Lp1/a1;

.field public final synthetic y:Lp1/a1;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lp1/a1;Lp1/a1;ILis0/j;Lp1/a1;I)V
    .locals 0

    iput p6, p0, Lis0/w;->w:I

    iput-object p1, p0, Lis0/w;->x:Lp1/a1;

    iput-object p2, p0, Lis0/w;->y:Lp1/a1;

    iput p3, p0, Lis0/w;->z:I

    iput-object p4, p0, Lis0/w;->E:Lis0/j;

    iput-object p5, p0, Lis0/w;->F:Lp1/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lis0/w;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v5, p0, Lis0/w;->F:Lp1/a1;

    move-object v6, p1

    check-cast v6, Ly3/l;

    iget-object v1, p0, Lis0/w;->x:Lp1/a1;

    iget-object v2, p0, Lis0/w;->y:Lp1/a1;

    iget v3, p0, Lis0/w;->z:I

    iget-object v4, p0, Lis0/w;->E:Lis0/j;

    invoke-static/range {v1 .. v6}, Lis0/x;->i(Lp1/a1;Lp1/a1;ILis0/j;Lp1/a1;Ly3/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v4, p0, Lis0/w;->F:Lp1/a1;

    move-object v5, p1

    check-cast v5, Ly3/l;

    iget-object v0, p0, Lis0/w;->x:Lp1/a1;

    iget-object v1, p0, Lis0/w;->y:Lp1/a1;

    iget v2, p0, Lis0/w;->z:I

    iget-object v3, p0, Lis0/w;->E:Lis0/j;

    invoke-static/range {v0 .. v5}, Lis0/x;->f(Lp1/a1;Lp1/a1;ILis0/j;Lp1/a1;Ly3/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v4, p0, Lis0/w;->F:Lp1/a1;

    move-object v5, p1

    check-cast v5, Ly3/l;

    iget-object v0, p0, Lis0/w;->x:Lp1/a1;

    iget-object v1, p0, Lis0/w;->y:Lp1/a1;

    iget v2, p0, Lis0/w;->z:I

    iget-object v3, p0, Lis0/w;->E:Lis0/j;

    invoke-static/range {v0 .. v5}, Lis0/x;->j(Lp1/a1;Lp1/a1;ILis0/j;Lp1/a1;Ly3/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
