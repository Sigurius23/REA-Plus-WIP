.class public final synthetic Ll1/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lx1/b;

.field public final synthetic F:Lx1/b;

.field public final synthetic G:Ll1/x;

.field public final synthetic H:Lm1/t;

.field public final synthetic I:Ljava/util/Locale;

.field public final synthetic J:Ll1/y;

.field public final synthetic K:Lg2/s;

.field public final synthetic L:I

.field public final synthetic M:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Ljava/lang/Long;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lm1/o;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lm1/o;Lx1/b;Lx1/b;Ll1/x;Lm1/t;Ljava/util/Locale;Ll1/y;Lg2/s;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/t;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Ll1/t;->x:Ljava/lang/Long;

    iput-object p3, p0, Ll1/t;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Ll1/t;->z:Lm1/o;

    iput-object p5, p0, Ll1/t;->E:Lx1/b;

    iput-object p6, p0, Ll1/t;->F:Lx1/b;

    iput-object p7, p0, Ll1/t;->G:Ll1/x;

    iput-object p8, p0, Ll1/t;->H:Lm1/t;

    iput-object p9, p0, Ll1/t;->I:Ljava/util/Locale;

    iput-object p10, p0, Ll1/t;->J:Ll1/y;

    iput-object p11, p0, Ll1/t;->K:Lg2/s;

    iput p12, p0, Ll1/t;->L:I

    iput p13, p0, Ll1/t;->M:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Ll1/t;->L:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v12

    iget p1, p0, Ll1/t;->M:I

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v13

    iget-object v0, p0, Ll1/t;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Ll1/t;->x:Ljava/lang/Long;

    iget-object v2, p0, Ll1/t;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Ll1/t;->z:Lm1/o;

    iget-object v4, p0, Ll1/t;->E:Lx1/b;

    iget-object v5, p0, Ll1/t;->F:Lx1/b;

    iget-object v6, p0, Ll1/t;->G:Ll1/x;

    iget-object v7, p0, Ll1/t;->H:Lm1/t;

    iget-object v8, p0, Ll1/t;->I:Ljava/util/Locale;

    iget-object v9, p0, Ll1/t;->J:Ll1/y;

    iget-object v10, p0, Ll1/t;->K:Lg2/s;

    invoke-static/range {v0 .. v13}, Ll1/w;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lm1/o;Lx1/b;Lx1/b;Ll1/x;Lm1/t;Ljava/util/Locale;Ll1/y;Lg2/s;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
