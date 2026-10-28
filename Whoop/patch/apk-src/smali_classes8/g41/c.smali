.class public final synthetic Lg41/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Z

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(FLkd1/o;ZI)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lg41/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg41/c;->x:F

    iput-object p2, p0, Lg41/c;->E:Ljava/lang/Object;

    iput-boolean p3, p0, Lg41/c;->y:Z

    iput p4, p0, Lg41/c;->z:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;FZI)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lg41/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg41/c;->E:Ljava/lang/Object;

    iput p2, p0, Lg41/c;->x:F

    iput-boolean p3, p0, Lg41/c;->y:Z

    iput p4, p0, Lg41/c;->z:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lg41/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg41/c;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v2, p0, Lg41/c;->x:F

    iget-boolean v3, p0, Lg41/c;->y:Z

    iget v4, p0, Lg41/c;->z:I

    invoke-static/range {v1 .. v6}, Ly11/c;->e(Ljava/util/List;FZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lg41/c;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkd1/o;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v1, p0, Lg41/c;->x:F

    iget-boolean v3, p0, Lg41/c;->y:Z

    iget v4, p0, Lg41/c;->z:I

    invoke-static/range {v1 .. v6}, Lg41/d;->k(FLkd1/o;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
