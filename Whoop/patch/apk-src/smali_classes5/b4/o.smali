.class public final Lb4/o;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final E:Lb4/o;

.field public static final F:Lb4/o;

.field public static final G:Lb4/o;

.field public static final H:Lb4/o;

.field public static final I:Lb4/o;

.field public static final J:Lb4/o;

.field public static final K:Lb4/o;

.field public static final x:Lb4/o;

.field public static final y:Lb4/o;

.field public static final z:Lb4/o;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lb4/o;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lb4/o;-><init>(II)V

    sput-object v0, Lb4/o;->x:Lb4/o;

    new-instance v0, Lb4/o;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lb4/o;-><init>(II)V

    sput-object v0, Lb4/o;->y:Lb4/o;

    new-instance v0, Lb4/o;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lb4/o;-><init>(II)V

    sput-object v0, Lb4/o;->z:Lb4/o;

    new-instance v0, Lb4/o;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lb4/o;-><init>(II)V

    sput-object v0, Lb4/o;->E:Lb4/o;

    new-instance v0, Lb4/o;

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lb4/o;-><init>(II)V

    sput-object v0, Lb4/o;->F:Lb4/o;

    new-instance v0, Lb4/o;

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lb4/o;-><init>(II)V

    sput-object v0, Lb4/o;->G:Lb4/o;

    new-instance v0, Lb4/o;

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lb4/o;-><init>(II)V

    sput-object v0, Lb4/o;->H:Lb4/o;

    new-instance v0, Lb4/o;

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lb4/o;-><init>(II)V

    sput-object v0, Lb4/o;->I:Lb4/o;

    new-instance v0, Lb4/o;

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lb4/o;-><init>(II)V

    sput-object v0, Lb4/o;->J:Lb4/o;

    new-instance v0, Lb4/o;

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lb4/o;-><init>(II)V

    sput-object v0, Lb4/o;->K:Lb4/o;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lb4/o;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lb4/o;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, La3/n0;

    check-cast p2, Ly3/m;

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/a;->c(La3/n0;)Lb4/v;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    if-eqz p2, :cond_1

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutDirection(I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, La3/n0;

    check-cast p2, Lpb/f;

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/a;->c(La3/n0;)Lb4/v;

    move-result-object p1

    invoke-virtual {p1, p2}, Lb4/l;->setSavedStateRegistryOwner(Lpb/f;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, La3/n0;

    check-cast p2, Landroidx/lifecycle/g0;

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/a;->c(La3/n0;)Lb4/v;

    move-result-object p1

    invoke-virtual {p1, p2}, Lb4/l;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, La3/n0;

    check-cast p2, Ly3/c;

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/a;->c(La3/n0;)Lb4/v;

    move-result-object p1

    invoke-virtual {p1, p2}, Lb4/l;->setDensity(Ly3/c;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, La3/n0;

    check-cast p2, Landroidx/compose/ui/Modifier;

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/a;->c(La3/n0;)Lb4/v;

    move-result-object p1

    invoke-virtual {p1, p2}, Lb4/l;->setModifier(Landroidx/compose/ui/Modifier;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    check-cast p1, La3/n0;

    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/a;->c(La3/n0;)Lb4/v;

    move-result-object p1

    invoke-virtual {p1, p2}, Lb4/v;->setReleaseBlock(Lkotlin/jvm/functions/Function1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    check-cast p1, La3/n0;

    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/a;->c(La3/n0;)Lb4/v;

    move-result-object p1

    invoke-virtual {p1, p2}, Lb4/v;->setUpdateBlock(Lkotlin/jvm/functions/Function1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    check-cast p1, La3/n0;

    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/a;->c(La3/n0;)Lb4/v;

    move-result-object p1

    invoke-virtual {p1, p2}, Lb4/v;->setReleaseBlock(Lkotlin/jvm/functions/Function1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_7
    check-cast p1, La3/n0;

    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/a;->c(La3/n0;)Lb4/v;

    move-result-object p1

    invoke-virtual {p1, p2}, Lb4/v;->setUpdateBlock(Lkotlin/jvm/functions/Function1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_8
    check-cast p1, La3/n0;

    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/a;->c(La3/n0;)Lb4/v;

    move-result-object p1

    invoke-virtual {p1, p2}, Lb4/v;->setResetBlock(Lkotlin/jvm/functions/Function1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
