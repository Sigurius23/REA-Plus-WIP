.class public final Ll1/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Lm1/o;

.field public final synthetic F:Li93/j;

.field public final synthetic G:Ll1/e0;

.field public final synthetic H:Ll1/n3;

.field public final synthetic I:Ll1/y;

.field public final synthetic J:Lg2/s;

.field public final synthetic w:Ljava/lang/Long;

.field public final synthetic x:J

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/lang/Long;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lm1/o;Li93/j;Ll1/e0;Ll1/n3;Ll1/y;Lg2/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/b1;->w:Ljava/lang/Long;

    iput-wide p2, p0, Ll1/b1;->x:J

    iput-object p4, p0, Ll1/b1;->y:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Ll1/b1;->z:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Ll1/b1;->E:Lm1/o;

    iput-object p7, p0, Ll1/b1;->F:Li93/j;

    iput-object p8, p0, Ll1/b1;->G:Ll1/e0;

    iput-object p9, p0, Ll1/b1;->H:Ll1/n3;

    iput-object p10, p0, Ll1/b1;->I:Ll1/y;

    iput-object p11, p0, Ll1/b1;->J:Lg2/s;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lc0/o;

    move-object/from16 v1, p2

    check-cast v1, Ll1/k1;

    iget v1, v1, Ll1/k1;->a:I

    move-object/from16 v2, p3

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p4

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    const/4 v3, 0x0

    if-nez v1, :cond_0

    move-object v14, v2

    check-cast v14, Lp1/q;

    const v1, 0x5d670292

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    iget-object v13, v0, Ll1/b1;->I:Ll1/y;

    const/4 v15, 0x0

    iget-object v4, v0, Ll1/b1;->w:Ljava/lang/Long;

    iget-wide v5, v0, Ll1/b1;->x:J

    iget-object v7, v0, Ll1/b1;->y:Lkotlin/jvm/functions/Function1;

    iget-object v8, v0, Ll1/b1;->z:Lkotlin/jvm/functions/Function1;

    iget-object v9, v0, Ll1/b1;->E:Lm1/o;

    iget-object v10, v0, Ll1/b1;->F:Li93/j;

    iget-object v11, v0, Ll1/b1;->G:Ll1/e0;

    iget-object v12, v0, Ll1/b1;->H:Ll1/n3;

    invoke-static/range {v4 .. v15}, Ll1/f1;->c(Ljava/lang/Long;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lm1/o;Li93/j;Ll1/e0;Ll1/n3;Ll1/y;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14, v3}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_0
    const/4 v4, 0x1

    if-ne v1, v4, :cond_1

    move-object v13, v2

    check-cast v13, Lp1/q;

    const v1, 0x5d674b60

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    iget-object v12, v0, Ll1/b1;->J:Lg2/s;

    const/4 v14, 0x0

    iget-object v5, v0, Ll1/b1;->w:Ljava/lang/Long;

    iget-object v6, v0, Ll1/b1;->y:Lkotlin/jvm/functions/Function1;

    iget-object v7, v0, Ll1/b1;->E:Lm1/o;

    iget-object v8, v0, Ll1/b1;->F:Li93/j;

    iget-object v9, v0, Ll1/b1;->G:Ll1/e0;

    iget-object v10, v0, Ll1/b1;->H:Ll1/n3;

    iget-object v11, v0, Ll1/b1;->I:Ll1/y;

    invoke-static/range {v5 .. v14}, Ll1/w;->a(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lm1/o;Li93/j;Ll1/e0;Ll1/n3;Ll1/y;Lg2/s;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_1
    check-cast v2, Lp1/q;

    const v1, 0x4f88ebe7

    invoke-virtual {v2, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
