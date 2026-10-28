.class public final Lj00/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final x:Lj00/a;

.field public static final y:Lj00/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lj00/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj00/a;-><init>(I)V

    sput-object v0, Lj00/a;->x:Lj00/a;

    new-instance v0, Lj00/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lj00/a;-><init>(I)V

    sput-object v0, Lj00/a;->y:Lj00/a;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lj00/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lj00/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p2, Lj00/q;->a:Landroidx/compose/ui/Modifier;

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, Lug/m;->c(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    const/4 v0, 0x2

    if-ne p2, v0, :cond_3

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    sget-object p2, Lj00/q;->a:Landroidx/compose/ui/Modifier;

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, Lug/m;->c(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
