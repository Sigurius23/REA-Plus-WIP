.class public final synthetic Lb30/u4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lnq2/a;ZZ)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lb30/u4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/u4;->z:Ljava/lang/Object;

    iput-object p2, p0, Lb30/u4;->E:Ljava/lang/Object;

    iput-boolean p3, p0, Lb30/u4;->x:Z

    iput-boolean p4, p0, Lb30/u4;->y:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZLc93/a;Ljava/lang/String;I)V
    .locals 0

    .line 2
    const/4 p5, 0x0

    iput p5, p0, Lb30/u4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lb30/u4;->x:Z

    iput-boolean p2, p0, Lb30/u4;->y:Z

    iput-object p3, p0, Lb30/u4;->z:Ljava/lang/Object;

    iput-object p4, p0, Lb30/u4;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lb30/u4;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb30/u4;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lb30/u4;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lnq2/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v3, p0, Lb30/u4;->x:Z

    iget-boolean v4, p0, Lb30/u4;->y:Z

    invoke-static/range {v1 .. v6}, Lnq2/e;->b(Landroidx/compose/ui/Modifier;Lnq2/a;ZZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb30/u4;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    iget-object v0, p0, Lb30/u4;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget-boolean v1, p0, Lb30/u4;->x:Z

    iget-boolean v2, p0, Lb30/u4;->y:Z

    invoke-static/range {v1 .. v6}, Lb30/a5;->b(ZZLc93/a;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
