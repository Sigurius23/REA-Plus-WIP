.class public final synthetic Lcz0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lh2/c;

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Ljava/util/List;

.field public final synthetic z:Lh2/c;


# direct methods
.method public synthetic constructor <init>(FLjava/util/List;Lh2/c;Lh2/c;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lcz0/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcz0/j;->x:F

    iput-object p2, p0, Lcz0/j;->y:Ljava/util/List;

    iput-object p3, p0, Lcz0/j;->z:Lh2/c;

    iput-object p4, p0, Lcz0/j;->E:Lh2/c;

    iput p5, p0, Lcz0/j;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Lh2/c;Lh2/c;FLjava/util/List;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lcz0/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcz0/j;->z:Lh2/c;

    iput-object p2, p0, Lcz0/j;->E:Lh2/c;

    iput p3, p0, Lcz0/j;->x:F

    iput-object p4, p0, Lcz0/j;->y:Ljava/util/List;

    iput p5, p0, Lcz0/j;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lcz0/j;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v1, p0, Lcz0/j;->x:F

    iget-object v2, p0, Lcz0/j;->y:Ljava/util/List;

    iget-object v3, p0, Lcz0/j;->z:Lh2/c;

    iget-object v4, p0, Lcz0/j;->E:Lh2/c;

    iget v5, p0, Lcz0/j;->F:I

    invoke-static/range {v1 .. v7}, Lcz0/o;->d(FLjava/util/List;Lh2/c;Lh2/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v0, p0, Lcz0/j;->x:F

    iget-object v1, p0, Lcz0/j;->y:Ljava/util/List;

    iget-object v2, p0, Lcz0/j;->z:Lh2/c;

    iget-object v3, p0, Lcz0/j;->E:Lh2/c;

    iget v4, p0, Lcz0/j;->F:I

    invoke-static/range {v0 .. v6}, Lcz0/o;->g(FLjava/util/List;Lh2/c;Lh2/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
