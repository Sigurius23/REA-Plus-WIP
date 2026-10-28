.class public final synthetic Lb30/x3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ld0/q0;Landroidx/compose/ui/Modifier;Lnq2/a;ZZ)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lb30/x3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/x3;->z:Ljava/lang/Object;

    iput-object p2, p0, Lb30/x3;->E:Ljava/lang/Object;

    iput-object p3, p0, Lb30/x3;->F:Ljava/lang/Object;

    iput-boolean p4, p0, Lb30/x3;->x:Z

    iput-boolean p5, p0, Lb30/x3;->y:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lb30/g4;ZZLc93/a;I)V
    .locals 0

    .line 2
    const/4 p6, 0x0

    iput p6, p0, Lb30/x3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/x3;->z:Ljava/lang/Object;

    iput-object p2, p0, Lb30/x3;->E:Ljava/lang/Object;

    iput-boolean p3, p0, Lb30/x3;->x:Z

    iput-boolean p4, p0, Lb30/x3;->y:Z

    iput-object p5, p0, Lb30/x3;->F:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZZLg40/m3;Ln00/d;Lg2/s;I)V
    .locals 0

    .line 3
    const/4 p6, 0x1

    iput p6, p0, Lb30/x3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lb30/x3;->x:Z

    iput-boolean p2, p0, Lb30/x3;->y:Z

    iput-object p3, p0, Lb30/x3;->z:Ljava/lang/Object;

    iput-object p4, p0, Lb30/x3;->E:Ljava/lang/Object;

    iput-object p5, p0, Lb30/x3;->F:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZZLj0/i;Lg1/e8;Li2/a1;)V
    .locals 1

    .line 4
    const/4 v0, 0x3

    iput v0, p0, Lb30/x3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lb30/x3;->x:Z

    iput-boolean p2, p0, Lb30/x3;->y:Z

    iput-object p3, p0, Lb30/x3;->z:Ljava/lang/Object;

    iput-object p4, p0, Lb30/x3;->E:Ljava/lang/Object;

    iput-object p5, p0, Lb30/x3;->F:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lb30/x3;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb30/x3;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lj0/i;

    iget-object v0, p0, Lb30/x3;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lg1/e8;

    iget-object v0, p0, Lb30/x3;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Li2/a1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v1, p0, Lb30/x3;->x:Z

    iget-boolean v2, p0, Lb30/x3;->y:Z

    invoke-static/range {v1 .. v7}, Lqz0/k;->b(ZZLj0/i;Lg1/e8;Li2/a1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb30/x3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ld0/q0;

    iget-object v0, p0, Lb30/x3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lb30/x3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lnq2/a;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v4, p0, Lb30/x3;->x:Z

    iget-boolean v5, p0, Lb30/x3;->y:Z

    invoke-static/range {v1 .. v7}, Lnq2/e;->m(Ld0/q0;Landroidx/compose/ui/Modifier;Lnq2/a;ZZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lb30/x3;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lg40/m3;

    iget-object v0, p0, Lb30/x3;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ln00/d;

    iget-object v0, p0, Lb30/x3;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lg2/s;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p1, 0x6001

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget-boolean v1, p0, Lb30/x3;->x:Z

    iget-boolean v2, p0, Lb30/x3;->y:Z

    invoke-static/range {v1 .. v7}, Lse/b;->e(ZZLg40/m3;Ln00/d;Lg2/s;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lb30/x3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lb30/x3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lb30/g4;

    iget-object v0, p0, Lb30/x3;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lc93/a;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget-boolean v3, p0, Lb30/x3;->x:Z

    iget-boolean v4, p0, Lb30/x3;->y:Z

    invoke-static/range {v1 .. v7}, Lb30/c4;->b(Ljava/lang/String;Lb30/g4;ZZLc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
