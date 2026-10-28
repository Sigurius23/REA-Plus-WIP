.class public final synthetic Lio2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lc93/a;JLl1/o2;Ld0/e;Lx1/b;I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput v0, p0, Lio2/q;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio2/q;->G:Ljava/lang/Object;

    iput-wide p2, p0, Lio2/q;->E:J

    iput-object p4, p0, Lio2/q;->x:Ljava/lang/Object;

    iput-object p5, p0, Lio2/q;->y:Ljava/lang/Object;

    iput-object p6, p0, Lio2/q;->z:Ljava/lang/Object;

    iput p7, p0, Lio2/q;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/CharSequence;Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Ll3/v0;JII)V
    .locals 0

    .line 2
    iput p8, p0, Lio2/q;->w:I

    iput-object p1, p0, Lio2/q;->G:Ljava/lang/Object;

    iput-object p2, p0, Lio2/q;->x:Ljava/lang/Object;

    iput-object p3, p0, Lio2/q;->y:Ljava/lang/Object;

    iput-object p4, p0, Lio2/q;->z:Ljava/lang/Object;

    iput-wide p5, p0, Lio2/q;->E:J

    iput p7, p0, Lio2/q;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll1/b0;Ljava/lang/Long;ILl1/e0;Landroidx/compose/ui/Modifier;JI)V
    .locals 0

    .line 3
    const/4 p8, 0x2

    iput p8, p0, Lio2/q;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio2/q;->G:Ljava/lang/Object;

    iput-object p2, p0, Lio2/q;->x:Ljava/lang/Object;

    iput p3, p0, Lio2/q;->F:I

    iput-object p4, p0, Lio2/q;->y:Ljava/lang/Object;

    iput-object p5, p0, Lio2/q;->z:Ljava/lang/Object;

    iput-wide p6, p0, Lio2/q;->E:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lio2/q;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio2/q;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lc93/a;

    iget-object v0, p0, Lio2/q;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ll1/o2;

    iget-object v0, p0, Lio2/q;->y:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ld0/e;

    iget-object v0, p0, Lio2/q;->z:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lx1/b;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lio2/q;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v8

    iget-wide v2, p0, Lio2/q;->E:J

    invoke-static/range {v1 .. v8}, Ll1/k3;->h(Lc93/a;JLl1/o2;Ld0/e;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio2/q;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll1/b0;

    iget-object v0, p0, Lio2/q;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/Long;

    iget-object v0, p0, Lio2/q;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ll1/e0;

    iget-object v0, p0, Lio2/q;->z:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Landroidx/compose/ui/Modifier;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const p1, 0x30c01

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v9

    iget v3, p0, Lio2/q;->F:I

    iget-wide v6, p0, Lio2/q;->E:J

    invoke-virtual/range {v1 .. v9}, Ll1/b0;->a(Ljava/lang/Long;ILl1/e0;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lio2/q;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lio2/q;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/navigation/e;

    iget-object v0, p0, Lio2/q;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lio2/q;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ll3/v0;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-wide v5, p0, Lio2/q;->E:J

    iget v7, p0, Lio2/q;->F:I

    invoke-static/range {v1 .. v9}, Lio2/s;->c(Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Ll3/v0;JILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lio2/q;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll3/g;

    iget-object v0, p0, Lio2/q;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/navigation/e;

    iget-object v0, p0, Lio2/q;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lio2/q;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ll3/v0;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-wide v5, p0, Lio2/q;->E:J

    iget v7, p0, Lio2/q;->F:I

    invoke-static/range {v1 .. v9}, Lio2/s;->n(Ll3/g;Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Ll3/v0;JILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
