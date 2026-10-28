.class public final synthetic Lt81/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic F:Lp1/c1;

.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Lp1/c1;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;I)V
    .locals 0

    iput p6, p0, Lt81/o;->w:I

    iput-object p1, p0, Lt81/o;->x:Lp1/c1;

    iput-object p2, p0, Lt81/o;->y:Lp1/c1;

    iput-object p3, p0, Lt81/o;->z:Lp1/c1;

    iput-object p4, p0, Lt81/o;->E:Lp1/c1;

    iput-object p5, p0, Lt81/o;->F:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lt81/o;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Lu81/d;

    move-object v7, p2

    check-cast v7, Lu81/b;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    iget-object v1, p0, Lt81/o;->x:Lp1/c1;

    iget-object v2, p0, Lt81/o;->y:Lp1/c1;

    iget-object v3, p0, Lt81/o;->z:Lp1/c1;

    iget-object v4, p0, Lt81/o;->E:Lp1/c1;

    iget-object v5, p0, Lt81/o;->F:Lp1/c1;

    invoke-static/range {v1 .. v9}, Lt81/l;->g(Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lu81/d;Lu81/b;ZZ)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Lu81/d;

    move-object v6, p2

    check-cast v6, Lu81/b;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    iget-object v0, p0, Lt81/o;->x:Lp1/c1;

    iget-object v1, p0, Lt81/o;->y:Lp1/c1;

    iget-object v2, p0, Lt81/o;->z:Lp1/c1;

    iget-object v3, p0, Lt81/o;->E:Lp1/c1;

    iget-object v4, p0, Lt81/o;->F:Lp1/c1;

    invoke-static/range {v0 .. v8}, Lt81/l$c;->a(Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lu81/d;Lu81/b;ZZ)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
