.class public final synthetic Lp91/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ly3/a;

.field public final synthetic F:Lp91/a;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:Ly2/j1;


# direct methods
.method public synthetic constructor <init>(FFLy2/j1;Ly3/a;Lp91/a;I)V
    .locals 0

    iput p6, p0, Lp91/d;->w:I

    iput p1, p0, Lp91/d;->x:F

    iput p2, p0, Lp91/d;->y:F

    iput-object p3, p0, Lp91/d;->z:Ly2/j1;

    iput-object p4, p0, Lp91/d;->E:Ly3/a;

    iput-object p5, p0, Lp91/d;->F:Lp91/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lp91/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v5, p0, Lp91/d;->F:Lp91/a;

    move-object v6, p1

    check-cast v6, Ly2/i1;

    iget v1, p0, Lp91/d;->x:F

    iget v2, p0, Lp91/d;->y:F

    iget-object v3, p0, Lp91/d;->z:Ly2/j1;

    iget-object v4, p0, Lp91/d;->E:Ly3/a;

    invoke-static/range {v1 .. v6}, Lp91/e;->b(FFLy2/j1;Ly3/a;Lp91/a;Ly2/i1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v4, p0, Lp91/d;->F:Lp91/a;

    move-object v5, p1

    check-cast v5, Ly2/i1;

    iget v0, p0, Lp91/d;->x:F

    iget v1, p0, Lp91/d;->y:F

    iget-object v2, p0, Lp91/d;->z:Ly2/j1;

    iget-object v3, p0, Lp91/d;->E:Ly3/a;

    invoke-static/range {v0 .. v5}, Lp91/e;->c(FFLy2/j1;Ly3/a;Lp91/a;Ly2/i1;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
