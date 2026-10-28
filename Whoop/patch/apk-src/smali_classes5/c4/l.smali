.class public final Lc4/l;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ly3/m;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ly3/m;I)V
    .locals 0

    iput p6, p0, Lc4/l;->w:I

    iput-object p1, p0, Lc4/l;->y:Ljava/lang/Object;

    iput-object p2, p0, Lc4/l;->z:Ljava/lang/Object;

    iput-object p3, p0, Lc4/l;->E:Ljava/lang/Object;

    iput-object p4, p0, Lc4/l;->F:Ljava/lang/Object;

    iput-object p5, p0, Lc4/l;->x:Ly3/m;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lc4/l;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Leu/b0;

    iget-object v0, p0, Lc4/l;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lup/b;

    iget-object v0, p0, Lc4/l;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Leu/g;

    iget-object v0, p0, Lc4/l;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Leu/w;

    iget-object v0, p0, Lc4/l;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ly3/c;

    iget-object v6, p0, Lc4/l;->x:Ly3/m;

    invoke-direct/range {v1 .. v6}, Leu/b0;-><init>(Lup/b;Leu/g;Leu/w;Ly3/c;Ly3/m;)V

    return-object v1

    :pswitch_0
    iget-object v0, p0, Lc4/l;->y:Ljava/lang/Object;

    check-cast v0, Lc4/f0;

    iget-object v1, p0, Lc4/l;->z:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    iget-object v2, p0, Lc4/l;->E:Ljava/lang/Object;

    check-cast v2, Lc4/j0;

    iget-object v3, p0, Lc4/l;->F:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, Lc4/l;->x:Ly3/m;

    invoke-virtual {v0, v1, v2, v3, v4}, Lc4/f0;->k(Lc93/a;Lc4/j0;Ljava/lang/String;Ly3/m;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
