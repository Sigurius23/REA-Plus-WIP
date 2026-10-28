.class public final Lgb/z;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput p2, p0, Lgb/z;->w:I

    iput-object p3, p0, Lgb/z;->E:Ljava/lang/Object;

    iput-object p4, p0, Lgb/z;->x:Ljava/lang/Object;

    iput-object p5, p0, Lgb/z;->y:Ljava/lang/Object;

    iput-object p6, p0, Lgb/z;->F:Ljava/lang/Object;

    iput p1, p0, Lgb/z;->z:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lc93/a;Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lgb/z;->w:I

    .line 2
    iput-object p1, p0, Lgb/z;->E:Ljava/lang/Object;

    iput-object p2, p0, Lgb/z;->F:Ljava/lang/Object;

    iput-object p3, p0, Lgb/z;->x:Ljava/lang/Object;

    iput-object p4, p0, Lgb/z;->y:Ljava/lang/Object;

    iput p5, p0, Lgb/z;->z:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lgb/z;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object p1, p0, Lgb/z;->E:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lcom/amplitude/android/engagement/types/SurveyListBlock;

    iget-object p1, p0, Lgb/z;->x:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Ljava/util/List;

    iget-object p1, p0, Lgb/z;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lcom/amplitude/android/engagement/types/SurveyResponseMultiSelect;

    iget-object p1, p0, Lgb/z;->F:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget p1, p0, Lgb/z;->z:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    invoke-static/range {v1 .. v6}, Lrj/j;->f(Lcom/amplitude/android/engagement/types/SurveyListBlock;Ljava/util/List;Lcom/amplitude/android/engagement/types/SurveyResponseMultiSelect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object p1, p0, Lgb/z;->E:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Lc93/a;

    iget-object p1, p0, Lgb/z;->F:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lo2/e;

    iget-object p1, p0, Lgb/z;->x:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    iget-object p1, p0, Lgb/z;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Landroidx/compose/ui/Modifier;

    iget p1, p0, Lgb/z;->z:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v5

    invoke-static/range {v0 .. v5}, Lvp/c;->b(Lc93/a;Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object p1, p0, Lgb/z;->E:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Leb/u0;

    iget-object p1, p0, Lgb/z;->x:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    iget-object p1, p0, Lgb/z;->y:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Landroidx/compose/ui/Modifier;

    iget-object p1, p0, Lgb/z;->F:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget p1, p0, Lgb/z;->z:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v5

    invoke-static/range {v0 .. v5}, Lhg3/i;->e(Leb/u0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
