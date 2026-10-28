.class public final Lsj/d;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/amplitude/android/engagement/types/NudgeStep;

.field public final synthetic y:Lsj/l;

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(Lcom/amplitude/android/engagement/types/NudgeStep;Lsj/l;Landroidx/compose/ui/Modifier;II)V
    .locals 0

    iput p5, p0, Lsj/d;->w:I

    iput-object p1, p0, Lsj/d;->x:Lcom/amplitude/android/engagement/types/NudgeStep;

    iput-object p2, p0, Lsj/d;->y:Lsj/l;

    iput-object p3, p0, Lsj/d;->z:Landroidx/compose/ui/Modifier;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lsj/d;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    packed-switch v0, :pswitch_data_0

    const/16 p2, 0x49

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lsj/d;->x:Lcom/amplitude/android/engagement/types/NudgeStep;

    iget-object v1, p0, Lsj/d;->y:Lsj/l;

    iget-object v2, p0, Lsj/d;->z:Landroidx/compose/ui/Modifier;

    invoke-static {v0, v1, v2, p1, p2}, Ls30/e;->c(Lcom/amplitude/android/engagement/types/NudgeStep;Lsj/l;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    const/16 p2, 0x49

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lsj/d;->x:Lcom/amplitude/android/engagement/types/NudgeStep;

    iget-object v1, p0, Lsj/d;->y:Lsj/l;

    iget-object v2, p0, Lsj/d;->z:Landroidx/compose/ui/Modifier;

    invoke-static {v0, v1, v2, p1, p2}, Ls3/d;->a(Lcom/amplitude/android/engagement/types/NudgeStep;Lsj/l;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
