.class public final Ll1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final E:Ll1/o;

.field public static final F:Ll1/o;

.field public static final G:Ll1/o;

.field public static final x:Ll1/o;

.field public static final y:Ll1/o;

.field public static final z:Ll1/o;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Ll1/o;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll1/o;-><init>(I)V

    sput-object v0, Ll1/o;->x:Ll1/o;

    new-instance v0, Ll1/o;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll1/o;-><init>(I)V

    sput-object v0, Ll1/o;->y:Ll1/o;

    new-instance v0, Ll1/o;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ll1/o;-><init>(I)V

    sput-object v0, Ll1/o;->z:Ll1/o;

    new-instance v0, Ll1/o;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ll1/o;-><init>(I)V

    sput-object v0, Ll1/o;->E:Ll1/o;

    new-instance v0, Ll1/o;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ll1/o;-><init>(I)V

    sput-object v0, Ll1/o;->F:Ll1/o;

    new-instance v0, Ll1/o;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ll1/o;-><init>(I)V

    sput-object v0, Ll1/o;->G:Ll1/o;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ll1/o;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget v0, p0, Ll1/o;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    move-object/from16 v0, p2

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    check-cast p1, Lp1/q;

    const v0, 0x41ee897

    invoke-virtual {p1, v0}, Lp1/q;->e0(I)V

    sget-object v0, Ll1/d;->a:Ll1/d;

    invoke-static {p1}, Ll1/d;->b(Lp1/q;)Ll0/e1;

    move-result-object v0

    invoke-virtual {p1, v4}, Lp1/q;->q(Z)V

    return-object v0

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    move-object/from16 v0, p2

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    check-cast p1, Lp1/q;

    const v0, -0x1e824845

    invoke-virtual {p1, v0}, Lp1/q;->e0(I)V

    sget-object v0, Ll1/d;->a:Ll1/d;

    invoke-static {p1}, Ll1/d;->b(Lp1/q;)Ll0/e1;

    move-result-object v0

    invoke-virtual {p1, v4}, Lp1/q;->q(Z)V

    return-object v0

    :pswitch_1
    check-cast p1, Landroidx/compose/runtime/Composer;

    move-object/from16 v0, p2

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    and-int/lit8 v5, v0, 0x3

    if-eq v5, v2, :cond_0

    move v4, v3

    :cond_0
    and-int/2addr v0, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, v0, v4}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_0
    return-object v1

    :pswitch_2
    check-cast p1, Landroidx/compose/runtime/Composer;

    move-object/from16 v0, p2

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    and-int/lit8 v5, v0, 0x3

    if-eq v5, v2, :cond_2

    move v4, v3

    :cond_2
    and-int/2addr v0, v3

    move-object v12, p1

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v0, v4}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object v5, Ll1/d;->a:Ll1/d;

    const-wide/16 v10, 0x0

    const/high16 v13, 0x30000

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v5 .. v13}, Ll1/d;->a(Landroidx/compose/ui/Modifier;FFLi2/a1;JLandroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_3
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_1
    return-object v1

    :pswitch_3
    check-cast p1, Landroidx/compose/runtime/Composer;

    move-object/from16 v0, p2

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    and-int/lit8 v5, v0, 0x3

    if-eq v5, v2, :cond_4

    move v4, v3

    :cond_4
    and-int/2addr v0, v3

    move-object v12, p1

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v0, v4}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object v5, Ll1/d;->a:Ll1/d;

    const-wide/16 v10, 0x0

    const/high16 v13, 0x30000

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v5 .. v13}, Ll1/d;->a(Landroidx/compose/ui/Modifier;FFLi2/a1;JLandroidx/compose/runtime/Composer;I)V

    goto :goto_2

    :cond_5
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_2
    return-object v1

    :pswitch_4
    check-cast p1, Landroidx/compose/runtime/Composer;

    move-object/from16 v0, p2

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    and-int/lit8 v5, v0, 0x3

    if-eq v5, v2, :cond_6

    move v4, v3

    :cond_6
    and-int/2addr v0, v3

    move-object v12, p1

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v0, v4}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_7

    sget-object v5, Ll1/d;->a:Ll1/d;

    const-wide/16 v10, 0x0

    const/high16 v13, 0x30000

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v5 .. v13}, Ll1/d;->a(Landroidx/compose/ui/Modifier;FFLi2/a1;JLandroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_7
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_3
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
