.class public final La3/i;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final E:La3/i;

.field public static final F:La3/i;

.field public static final G:La3/i;

.field public static final H:La3/i;

.field public static final x:La3/i;

.field public static final y:La3/i;

.field public static final z:La3/i;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, La3/i;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, La3/i;-><init>(II)V

    sput-object v0, La3/i;->x:La3/i;

    new-instance v0, La3/i;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, La3/i;-><init>(II)V

    sput-object v0, La3/i;->y:La3/i;

    new-instance v0, La3/i;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, La3/i;-><init>(II)V

    sput-object v0, La3/i;->z:La3/i;

    new-instance v0, La3/i;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, La3/i;-><init>(II)V

    sput-object v0, La3/i;->E:La3/i;

    new-instance v0, La3/i;

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, La3/i;-><init>(II)V

    sput-object v0, La3/i;->F:La3/i;

    new-instance v0, La3/i;

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, La3/i;-><init>(II)V

    sput-object v0, La3/i;->G:La3/i;

    new-instance v0, La3/i;

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, La3/i;-><init>(II)V

    sput-object v0, La3/i;->H:La3/i;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, La3/i;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La3/i;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, La3/l;

    check-cast p2, Lb3/j3;

    check-cast p1, La3/n0;

    invoke-virtual {p1, p2}, La3/n0;->F0(Lb3/j3;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, La3/l;

    check-cast p2, Lp1/z;

    check-cast p1, La3/n0;

    invoke-virtual {p1, p2}, La3/n0;->z0(Lp1/z;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, La3/l;

    check-cast p2, Landroidx/compose/ui/Modifier;

    check-cast p1, La3/n0;

    invoke-virtual {p1, p2}, La3/n0;->E0(Landroidx/compose/ui/Modifier;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, La3/l;

    check-cast p2, Ly2/r0;

    check-cast p1, La3/n0;

    invoke-virtual {p1, p2}, La3/n0;->D0(Ly2/r0;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, La3/l;

    check-cast p2, Ly3/m;

    check-cast p1, La3/n0;

    iget-object v0, p1, La3/n0;->Y:Ly3/m;

    if-eq v0, p2, :cond_1

    iput-object p2, p1, La3/n0;->Y:Ly3/m;

    invoke-virtual {p1}, La3/n0;->R()V

    invoke-virtual {p1}, La3/n0;->G()La3/n0;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, La3/n0;->P()V

    :cond_0
    invoke-virtual {p1}, La3/n0;->Q()V

    iget-object p1, p1, La3/n0;->e0:La3/l1;

    iget-object p1, p1, La3/l1;->g:Ljava/lang/Object;

    check-cast p1, Lb2/v;

    :goto_0
    if-eqz p1, :cond_1

    invoke-interface {p1}, La3/n;->t()V

    iget-object p1, p1, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    check-cast p1, La3/l;

    check-cast p2, Ly3/c;

    check-cast p1, La3/n0;

    invoke-virtual {p1, p2}, La3/n0;->A0(Ly3/c;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    check-cast p1, La3/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
