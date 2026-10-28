.class public final synthetic Lq22/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic F:Lp1/c1;

.field public final synthetic G:Lp1/c1;

.field public final synthetic H:Lp1/c1;

.field public final synthetic w:I

.field public final synthetic x:Lq22/e;

.field public final synthetic y:Lc93/m;

.field public final synthetic z:Lc93/m;


# direct methods
.method public synthetic constructor <init>(Lq22/e;Lc93/m;Lc93/m;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;I)V
    .locals 0

    iput p8, p0, Lq22/c;->w:I

    iput-object p1, p0, Lq22/c;->x:Lq22/e;

    iput-object p2, p0, Lq22/c;->y:Lc93/m;

    iput-object p3, p0, Lq22/c;->z:Lc93/m;

    iput-object p4, p0, Lq22/c;->E:Lp1/c1;

    iput-object p5, p0, Lq22/c;->F:Lp1/c1;

    iput-object p6, p0, Lq22/c;->G:Lp1/c1;

    iput-object p7, p0, Lq22/c;->H:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lq22/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v7, p0, Lq22/c;->H:Lp1/c1;

    move-object v8, p1

    check-cast v8, Lg2/v;

    iget-object v1, p0, Lq22/c;->x:Lq22/e;

    iget-object v2, p0, Lq22/c;->y:Lc93/m;

    iget-object v3, p0, Lq22/c;->z:Lc93/m;

    iget-object v4, p0, Lq22/c;->E:Lp1/c1;

    iget-object v5, p0, Lq22/c;->F:Lp1/c1;

    iget-object v6, p0, Lq22/c;->G:Lp1/c1;

    invoke-static/range {v1 .. v8}, Lq22/d;->n(Lq22/e;Lc93/m;Lc93/m;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v6, p0, Lq22/c;->H:Lp1/c1;

    move-object v7, p1

    check-cast v7, Lg2/v;

    iget-object v0, p0, Lq22/c;->x:Lq22/e;

    iget-object v1, p0, Lq22/c;->y:Lc93/m;

    iget-object v2, p0, Lq22/c;->z:Lc93/m;

    iget-object v3, p0, Lq22/c;->E:Lp1/c1;

    iget-object v4, p0, Lq22/c;->F:Lp1/c1;

    iget-object v5, p0, Lq22/c;->G:Lp1/c1;

    invoke-static/range {v0 .. v7}, Lq22/d;->j(Lq22/e;Lc93/m;Lc93/m;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v6, p0, Lq22/c;->H:Lp1/c1;

    move-object v7, p1

    check-cast v7, Lg2/v;

    iget-object v0, p0, Lq22/c;->x:Lq22/e;

    iget-object v1, p0, Lq22/c;->y:Lc93/m;

    iget-object v2, p0, Lq22/c;->z:Lc93/m;

    iget-object v3, p0, Lq22/c;->E:Lp1/c1;

    iget-object v4, p0, Lq22/c;->F:Lp1/c1;

    iget-object v5, p0, Lq22/c;->G:Lp1/c1;

    invoke-static/range {v0 .. v7}, Lq22/d;->m(Lq22/e;Lc93/m;Lc93/m;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v6, p0, Lq22/c;->H:Lp1/c1;

    move-object v7, p1

    check-cast v7, Lg2/v;

    iget-object v0, p0, Lq22/c;->x:Lq22/e;

    iget-object v1, p0, Lq22/c;->y:Lc93/m;

    iget-object v2, p0, Lq22/c;->z:Lc93/m;

    iget-object v3, p0, Lq22/c;->E:Lp1/c1;

    iget-object v4, p0, Lq22/c;->F:Lp1/c1;

    iget-object v5, p0, Lq22/c;->G:Lp1/c1;

    invoke-static/range {v0 .. v7}, Lq22/d;->c(Lq22/e;Lc93/m;Lc93/m;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
