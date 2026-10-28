.class public final synthetic Lg40/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLd0/z1;Ljava/util/List;Ll83/k;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lg40/u0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lg40/u0;->z:Ljava/lang/Object;

    iput-object p4, p0, Lg40/u0;->E:Ljava/lang/Object;

    iput-wide p1, p0, Lg40/u0;->x:J

    iput-boolean p6, p0, Lg40/u0;->y:Z

    iput-object p5, p0, Lg40/u0;->F:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZJLandroidx/compose/ui/Modifier;Lc93/a;I)V
    .locals 0

    .line 2
    const/4 p7, 0x0

    iput p7, p0, Lg40/u0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/u0;->z:Ljava/lang/Object;

    iput-boolean p2, p0, Lg40/u0;->y:Z

    iput-wide p3, p0, Lg40/u0;->x:J

    iput-object p5, p0, Lg40/u0;->E:Ljava/lang/Object;

    iput-object p6, p0, Lg40/u0;->F:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lg40/u0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg40/u0;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ld0/z1;

    iget-object v0, p0, Lg40/u0;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    iget-object v0, p0, Lg40/u0;->F:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ll83/k;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-wide v3, p0, Lg40/u0;->x:J

    iget-boolean v5, p0, Lg40/u0;->y:Z

    invoke-static/range {v1 .. v8}, Ly11/k;->f(Ld0/z1;Ljava/util/List;JZLl83/k;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lg40/u0;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lg40/u0;->E:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lg40/u0;->F:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lc93/a;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v8

    iget-boolean v2, p0, Lg40/u0;->y:Z

    iget-wide v3, p0, Lg40/u0;->x:J

    invoke-static/range {v1 .. v8}, Lg40/y0;->b(Ljava/lang/String;ZJLandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
