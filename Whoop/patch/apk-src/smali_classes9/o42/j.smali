.class public final synthetic Lo42/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ZZI)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lo42/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo42/j;->E:Ljava/lang/Object;

    iput-boolean p2, p0, Lo42/j;->x:Z

    iput-boolean p3, p0, Lo42/j;->y:Z

    iput p4, p0, Lo42/j;->z:I

    return-void
.end method

.method public synthetic constructor <init>(ZZLl83/e;II)V
    .locals 0

    .line 2
    iput p5, p0, Lo42/j;->w:I

    iput-boolean p1, p0, Lo42/j;->x:Z

    iput-boolean p2, p0, Lo42/j;->y:Z

    iput-object p3, p0, Lo42/j;->E:Ljava/lang/Object;

    iput p4, p0, Lo42/j;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lo42/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo42/j;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lo42/j;->x:Z

    iget-boolean v3, p0, Lo42/j;->y:Z

    iget v4, p0, Lo42/j;->z:I

    invoke-static/range {v1 .. v6}, Lzc1/d8;->c(Ljava/lang/String;ZZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lo42/j;->E:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p2, p0, Lo42/j;->z:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v1, p0, Lo42/j;->x:Z

    iget-boolean v2, p0, Lo42/j;->y:Z

    invoke-static {v1, v2, v0, p1, p2}, Lse/a;->h(ZZLc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lo42/j;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v1, p0, Lo42/j;->x:Z

    iget-boolean v2, p0, Lo42/j;->y:Z

    iget v4, p0, Lo42/j;->z:I

    invoke-static/range {v1 .. v6}, Lo42/k;->q(ZZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
