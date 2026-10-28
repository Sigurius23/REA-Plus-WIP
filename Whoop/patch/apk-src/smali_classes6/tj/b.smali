.class public abstract Ltj/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp1/b0;

    sget-object v1, Ltj/a;->w:Ltj/a;

    invoke-direct {v0, v1}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v0, Ltj/b;->a:Lp1/b0;

    return-void
.end method

.method public static final a(Lcom/amplitude/android/engagement/types/Nudge;ILx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v1, 0x54306fc5

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    move-object v7, v1

    check-cast v7, Lp1/c1;

    sget-object v1, Lmj/r;->a:Lp1/u2;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/amplitude/android/engagement/a;

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llj/e0;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Llj/e0;->toJSONString()Ljava/lang/String;

    move-result-object v3

    :cond_1
    new-instance v4, Ll1/v0;

    const/4 v9, 0x0

    move-object/from16 v6, p0

    move/from16 v8, p1

    invoke-direct/range {v4 .. v9}, Ll1/v0;-><init>(Lcom/amplitude/android/engagement/a;Lcom/amplitude/android/engagement/types/Nudge;Lp1/c1;ILq83/d;)V

    invoke-static {v0, v4, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Ltj/b;->a:Lp1/b0;

    invoke-virtual {v1, v7}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    new-instance v2, Lc4/e;

    const/16 v3, 0xa

    move-object/from16 v13, p2

    move/from16 v14, p4

    invoke-direct {v2, v13, v14, v3}, Lc4/e;-><init>(Ljava/lang/Object;II)V

    const v3, -0x22e1ecfb

    invoke-static {v3, v0, v2}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    const/16 v3, 0x38

    invoke-static {v1, v2, v0, v3}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    new-instance v10, Lc4/i;

    const/4 v15, 0x7

    move-object/from16 v11, p0

    move/from16 v12, p1

    invoke-direct/range {v10 .. v15}, Lc4/i;-><init>(Lcom/amplitude/android/engagement/types/Nudge;ILl83/e;II)V

    iput-object v10, v0, Lp1/v1;->d:Lc93/m;

    return-void
.end method
