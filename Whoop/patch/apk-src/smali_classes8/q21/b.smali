.class public final synthetic Lq21/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ll0/s1;ZZII)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lq21/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq21/b;->F:Ljava/lang/Object;

    iput-boolean p2, p0, Lq21/b;->x:Z

    iput-boolean p3, p0, Lq21/b;->y:Z

    iput p4, p0, Lq21/b;->z:I

    iput p5, p0, Lq21/b;->E:I

    return-void
.end method

.method public synthetic constructor <init>(ZZLw31/b;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lq21/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lq21/b;->x:Z

    iput-boolean p2, p0, Lq21/b;->y:Z

    iput-object p3, p0, Lq21/b;->F:Ljava/lang/Object;

    iput p4, p0, Lq21/b;->z:I

    iput p5, p0, Lq21/b;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lq21/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lq21/b;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lw31/b;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v1, p0, Lq21/b;->x:Z

    iget-boolean v2, p0, Lq21/b;->y:Z

    iget v4, p0, Lq21/b;->z:I

    iget v5, p0, Lq21/b;->E:I

    invoke-static/range {v1 .. v7}, Lw31/e;->a(ZZLw31/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lq21/b;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/s1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lq21/b;->x:Z

    iget-boolean v3, p0, Lq21/b;->y:Z

    iget v4, p0, Lq21/b;->z:I

    iget v5, p0, Lq21/b;->E:I

    invoke-static/range {v1 .. v7}, Lq21/c;->f(Ll0/s1;ZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
