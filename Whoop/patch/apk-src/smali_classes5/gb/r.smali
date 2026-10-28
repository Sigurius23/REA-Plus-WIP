.class public final Lgb/r;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ll83/e;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    const/4 p1, 0x4

    iput p1, p0, Lgb/r;->w:I

    .line 1
    iput-object p2, p0, Lgb/r;->y:Ljava/lang/Object;

    iput-object p3, p0, Lgb/r;->z:Ljava/lang/Object;

    check-cast p4, Lkotlin/jvm/internal/m;

    iput-object p4, p0, Lgb/r;->x:Ll83/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/Modifier;Lx1/b;Ly2/r0;I)V
    .locals 0

    const/4 p4, 0x6

    iput p4, p0, Lgb/r;->w:I

    .line 2
    iput-object p1, p0, Lgb/r;->y:Ljava/lang/Object;

    iput-object p2, p0, Lgb/r;->x:Ll83/e;

    iput-object p3, p0, Lgb/r;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V
    .locals 0

    .line 3
    iput p5, p0, Lgb/r;->w:I

    iput-object p1, p0, Lgb/r;->y:Ljava/lang/Object;

    iput-object p2, p0, Lgb/r;->z:Ljava/lang/Object;

    iput-object p3, p0, Lgb/r;->x:Ll83/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lgb/r;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    packed-switch v0, :pswitch_data_0

    iget-object p2, p0, Lgb/r;->y:Ljava/lang/Object;

    check-cast p2, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lgb/r;->x:Ll83/e;

    check-cast v0, Lx1/b;

    iget-object v1, p0, Lgb/r;->z:Ljava/lang/Object;

    check-cast v1, Ly2/r0;

    const/16 v2, 0x31

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, Ly2/q1;->a(Landroidx/compose/ui/Modifier;Lx1/b;Ly2/r0;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object p2, p0, Lgb/r;->y:Ljava/lang/Object;

    check-cast p2, Lcom/amplitude/android/engagement/types/ContentBlock;

    iget-object v0, p0, Lgb/r;->z:Ljava/lang/Object;

    check-cast v0, Llj/e0;

    iget-object v1, p0, Lgb/r;->x:Ll83/e;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x1

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, Lrj/j;->c(Lcom/amplitude/android/engagement/types/ContentBlock;Llj/e0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object p2, p0, Lgb/r;->y:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lgb/r;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lgb/r;->x:Ll83/e;

    check-cast v1, Lkotlin/jvm/internal/m;

    const/4 v2, 0x1

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, Lrj/j;->b(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    iget-object p2, p0, Lgb/r;->y:Ljava/lang/Object;

    check-cast p2, Lcom/amplitude/android/engagement/types/Nudge;

    iget-object v0, p0, Lgb/r;->z:Ljava/lang/Object;

    check-cast v0, Lcom/amplitude/android/engagement/types/NudgeStep;

    iget-object v1, p0, Lgb/r;->x:Ll83/e;

    check-cast v1, Lmj/n;

    const/16 v2, 0x49

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, Lv8/b;->c(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Lmj/n;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    iget-object p2, p0, Lgb/r;->y:Ljava/lang/Object;

    check-cast p2, Lcom/amplitude/android/engagement/a;

    iget-object v0, p0, Lgb/r;->z:Ljava/lang/Object;

    check-cast v0, Lb2/z;

    iget-object v1, p0, Lgb/r;->x:Ll83/e;

    check-cast v1, Lc93/a;

    const/16 v2, 0x9

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, Lx43/j;->f(Lcom/amplitude/android/engagement/a;Lb2/z;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    iget-object p2, p0, Lgb/r;->y:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lgb/r;->z:Ljava/lang/Object;

    check-cast v0, Lcom/amplitude/android/engagement/types/DebugStatus;

    iget-object v1, p0, Lgb/r;->x:Ll83/e;

    check-cast v1, Lx1/b;

    const/16 v2, 0x187

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, Lx30/s0;->b(Ljava/lang/String;Lcom/amplitude/android/engagement/types/DebugStatus;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    iget-object p2, p0, Lgb/r;->y:Ljava/lang/Object;

    check-cast p2, Leb/q;

    iget-object v0, p0, Lgb/r;->z:Ljava/lang/Object;

    check-cast v0, Ly1/c;

    iget-object v1, p0, Lgb/r;->x:Ll83/e;

    check-cast v1, Lx1/b;

    const/16 v2, 0x181

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, Ldt/b;->b(Leb/q;Ly1/c;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
