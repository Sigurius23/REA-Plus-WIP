.class public final synthetic Lf41/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic F:Lp1/c1;

.field public final synthetic G:Lp1/c1;

.field public final synthetic w:I

.field public final synthetic x:Ljava/util/Map;

.field public final synthetic y:Lkotlin/jvm/functions/Function3;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;Lkotlin/jvm/functions/Function3;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;I)V
    .locals 0

    iput p7, p0, Lf41/i;->w:I

    iput-object p1, p0, Lf41/i;->x:Ljava/util/Map;

    iput-object p2, p0, Lf41/i;->y:Lkotlin/jvm/functions/Function3;

    iput-object p3, p0, Lf41/i;->z:Lp1/c1;

    iput-object p4, p0, Lf41/i;->E:Lp1/c1;

    iput-object p5, p0, Lf41/i;->F:Lp1/c1;

    iput-object p6, p0, Lf41/i;->G:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lf41/i;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lf41/i;->x:Ljava/util/Map;

    iget-object v1, p0, Lf41/i;->y:Lkotlin/jvm/functions/Function3;

    iget-object v2, p0, Lf41/i;->z:Lp1/c1;

    iget-object v3, p0, Lf41/i;->E:Lp1/c1;

    iget-object v4, p0, Lf41/i;->F:Lp1/c1;

    iget-object v5, p0, Lf41/i;->G:Lp1/c1;

    invoke-static/range {v0 .. v6}, Lf41/p;->e(Ljava/util/Map;Lkotlin/jvm/functions/Function3;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    iget-object v0, p0, Lf41/i;->x:Ljava/util/Map;

    iget-object v1, p0, Lf41/i;->y:Lkotlin/jvm/functions/Function3;

    iget-object v2, p0, Lf41/i;->z:Lp1/c1;

    iget-object v3, p0, Lf41/i;->E:Lp1/c1;

    iget-object v4, p0, Lf41/i;->F:Lp1/c1;

    iget-object v5, p0, Lf41/i;->G:Lp1/c1;

    invoke-static/range {v0 .. v6}, Lf41/p;->r(Ljava/util/Map;Lkotlin/jvm/functions/Function3;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
