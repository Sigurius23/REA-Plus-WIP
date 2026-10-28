.class public final Loj/p;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public constructor <init>(Lcom/amplitude/android/engagement/types/DebugStatus;Ljava/lang/String;ZLc93/m;II)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Loj/p;->w:I

    .line 1
    iput-object p1, p0, Loj/p;->E:Ljava/lang/Object;

    iput-object p2, p0, Loj/p;->F:Ljava/lang/Object;

    iput-boolean p3, p0, Loj/p;->x:Z

    iput-object p4, p0, Loj/p;->G:Ljava/lang/Object;

    iput p5, p0, Loj/p;->y:I

    iput p6, p0, Loj/p;->z:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lcom/amplitude/android/engagement/types/NudgeStep;Lsj/l;Landroidx/compose/ui/Modifier;ZII)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Loj/p;->w:I

    .line 2
    iput-object p1, p0, Loj/p;->E:Ljava/lang/Object;

    iput-object p2, p0, Loj/p;->F:Ljava/lang/Object;

    iput-object p3, p0, Loj/p;->G:Ljava/lang/Object;

    iput-boolean p4, p0, Loj/p;->x:Z

    iput p5, p0, Loj/p;->y:I

    iput p6, p0, Loj/p;->z:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Loj/p;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object p1, p0, Loj/p;->E:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lcom/amplitude/android/engagement/types/NudgeStep;

    iget-object p1, p0, Loj/p;->F:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lsj/l;

    iget-object p1, p0, Loj/p;->G:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Landroidx/compose/ui/Modifier;

    iget p1, p0, Loj/p;->y:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget v7, p0, Loj/p;->z:I

    iget-boolean v4, p0, Loj/p;->x:Z

    invoke-static/range {v1 .. v7}, Ls2/h;->a(Lcom/amplitude/android/engagement/types/NudgeStep;Lsj/l;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object p1, p0, Loj/p;->E:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Lcom/amplitude/android/engagement/types/DebugStatus;

    iget-object p1, p0, Loj/p;->F:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    iget-object p1, p0, Loj/p;->G:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lc93/m;

    iget p1, p0, Loj/p;->y:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v5

    iget v6, p0, Loj/p;->z:I

    iget-boolean v2, p0, Loj/p;->x:Z

    invoke-static/range {v0 .. v6}, Lbi/g;->g(Lcom/amplitude/android/engagement/types/DebugStatus;Ljava/lang/String;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
