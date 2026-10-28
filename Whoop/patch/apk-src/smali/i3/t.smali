.class public final Li3/t;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final E:Li3/t;

.field public static final F:Li3/t;

.field public static final G:Li3/t;

.field public static final H:Li3/t;

.field public static final I:Li3/t;

.field public static final J:Li3/t;

.field public static final K:Li3/t;

.field public static final L:Li3/t;

.field public static final M:Li3/t;

.field public static final N:Li3/t;

.field public static final O:Li3/t;

.field public static final P:Li3/t;

.field public static final Q:Li3/t;

.field public static final R:Li3/t;

.field public static final S:Li3/t;

.field public static final x:Li3/t;

.field public static final y:Li3/t;

.field public static final z:Li3/t;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Li3/t;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Li3/t;-><init>(II)V

    sput-object v0, Li3/t;->x:Li3/t;

    new-instance v0, Li3/t;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Li3/t;-><init>(II)V

    sput-object v0, Li3/t;->y:Li3/t;

    new-instance v0, Li3/t;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Li3/t;-><init>(II)V

    sput-object v0, Li3/t;->z:Li3/t;

    new-instance v0, Li3/t;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Li3/t;-><init>(II)V

    sput-object v0, Li3/t;->E:Li3/t;

    new-instance v0, Li3/t;

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Li3/t;-><init>(II)V

    sput-object v0, Li3/t;->F:Li3/t;

    new-instance v0, Li3/t;

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Li3/t;-><init>(II)V

    sput-object v0, Li3/t;->G:Li3/t;

    new-instance v0, Li3/t;

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Li3/t;-><init>(II)V

    sput-object v0, Li3/t;->H:Li3/t;

    new-instance v0, Li3/t;

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Li3/t;-><init>(II)V

    sput-object v0, Li3/t;->I:Li3/t;

    new-instance v0, Li3/t;

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Li3/t;-><init>(II)V

    sput-object v0, Li3/t;->J:Li3/t;

    new-instance v0, Li3/t;

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Li3/t;-><init>(II)V

    sput-object v0, Li3/t;->K:Li3/t;

    new-instance v0, Li3/t;

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Li3/t;-><init>(II)V

    sput-object v0, Li3/t;->L:Li3/t;

    new-instance v0, Li3/t;

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Li3/t;-><init>(II)V

    sput-object v0, Li3/t;->M:Li3/t;

    new-instance v0, Li3/t;

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Li3/t;-><init>(II)V

    sput-object v0, Li3/t;->N:Li3/t;

    new-instance v0, Li3/t;

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Li3/t;-><init>(II)V

    sput-object v0, Li3/t;->O:Li3/t;

    new-instance v0, Li3/t;

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Li3/t;-><init>(II)V

    sput-object v0, Li3/t;->P:Li3/t;

    new-instance v0, Li3/t;

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2}, Li3/t;-><init>(II)V

    sput-object v0, Li3/t;->Q:Li3/t;

    new-instance v0, Li3/t;

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2}, Li3/t;-><init>(II)V

    sput-object v0, Li3/t;->R:Li3/t;

    new-instance v0, Li3/t;

    const/16 v2, 0x11

    invoke-direct {v0, v1, v2}, Li3/t;-><init>(II)V

    sput-object v0, Li3/t;->S:Li3/t;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Li3/t;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Li3/t;->w:I

    packed-switch v0, :pswitch_data_0

    if-nez p1, :cond_0

    move-object p1, p2

    :cond_0
    return-object p1

    :pswitch_0
    check-cast p1, Li3/a;

    check-cast p2, Li3/a;

    new-instance v0, Li3/a;

    if-eqz p1, :cond_1

    iget-object v1, p1, Li3/a;->a:Ljava/lang/String;

    if-nez v1, :cond_2

    :cond_1
    iget-object v1, p2, Li3/a;->a:Ljava/lang/String;

    :cond_2
    if-eqz p1, :cond_3

    iget-object p1, p1, Li3/a;->b:Ll83/e;

    if-nez p1, :cond_4

    :cond_3
    iget-object p1, p2, Li3/a;->b:Ll83/e;

    :cond_4
    invoke-direct {v0, v1, p1}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    return-object v0

    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Float;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    if-eqz p1, :cond_5

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move-object p2, p1

    :cond_5
    return-object p2

    :pswitch_5
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    return-object p1

    :pswitch_6
    check-cast p1, Li2/a1;

    check-cast p2, Li2/a1;

    return-object p1

    :pswitch_7
    check-cast p1, Li3/i;

    check-cast p2, Li3/i;

    iget p2, p2, Li3/i;->a:I

    return-object p1

    :pswitch_8
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "merge function called on unmergeable property PaneTitle."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_9
    check-cast p1, Ll83/a0;

    check-cast p2, Ll83/a0;

    return-object p1

    :pswitch_a
    check-cast p1, Ll83/a0;

    check-cast p2, Ll83/a0;

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_b
    check-cast p1, Ll83/a0;

    check-cast p2, Ll83/a0;

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_c
    check-cast p1, Ll83/a0;

    check-cast p2, Ll83/a0;

    return-object p1

    :pswitch_d
    check-cast p1, Ll83/a0;

    check-cast p2, Ll83/a0;

    return-object p1

    :pswitch_e
    check-cast p1, Lc2/p;

    check-cast p2, Lc2/p;

    return-object p1

    :pswitch_f
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    if-eqz p1, :cond_6

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move-object p2, p1

    :cond_6
    return-object p2

    :pswitch_10
    check-cast p1, Lc2/f;

    check-cast p2, Lc2/f;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
