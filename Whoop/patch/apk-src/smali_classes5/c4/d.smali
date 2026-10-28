.class public final Lc4/d;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final E:Lc4/d;

.field public static final F:Lc4/d;

.field public static final G:Lc4/d;

.field public static final x:Lc4/d;

.field public static final y:Lc4/d;

.field public static final z:Lc4/d;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lc4/d;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc4/d;-><init>(II)V

    sput-object v0, Lc4/d;->x:Lc4/d;

    new-instance v0, Lc4/d;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lc4/d;-><init>(II)V

    sput-object v0, Lc4/d;->y:Lc4/d;

    new-instance v0, Lc4/d;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lc4/d;-><init>(II)V

    sput-object v0, Lc4/d;->z:Lc4/d;

    new-instance v0, Lc4/d;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lc4/d;-><init>(II)V

    sput-object v0, Lc4/d;->E:Lc4/d;

    new-instance v0, Lc4/d;

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lc4/d;-><init>(II)V

    sput-object v0, Lc4/d;->F:Lc4/d;

    new-instance v0, Lc4/d;

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lc4/d;-><init>(II)V

    sput-object v0, Lc4/d;->G:Lc4/d;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lc4/d;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lc4/d;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lc4/f0;

    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lc4/f0;->n()V

    :cond_0
    return-object v1

    :pswitch_0
    check-cast p1, Ly2/i1;

    return-object v1

    :pswitch_1
    check-cast p1, Li3/z;

    sget-object v0, Li3/w;->a:[Lj93/z;

    sget-object v0, Li3/u;->v:Li3/y;

    check-cast p1, Li3/l;

    invoke-virtual {p1, v0, v1}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    return-object v1

    :pswitch_2
    check-cast p1, Ly2/i1;

    return-object v1

    :pswitch_3
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    return-object v1

    :pswitch_4
    check-cast p1, Li3/z;

    sget-object v0, Li3/w;->a:[Lj93/z;

    sget-object v0, Li3/u;->w:Li3/y;

    check-cast p1, Li3/l;

    invoke-virtual {p1, v0, v1}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
