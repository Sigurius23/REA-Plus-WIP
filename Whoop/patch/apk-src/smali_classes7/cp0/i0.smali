.class public final synthetic Lcp0/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/b;


# instance fields
.field public final synthetic w:Lzo0/c;

.field public final synthetic x:Lcp0/m0;

.field public final synthetic y:Z

.field public final synthetic z:Lch0/v0;


# direct methods
.method public synthetic constructor <init>(Lzo0/c;Lcp0/m0;ZLch0/v0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcp0/i0;->w:Lzo0/c;

    iput-object p2, p0, Lcp0/i0;->x:Lcp0/m0;

    iput-boolean p3, p0, Lcp0/i0;->y:Z

    iput-object p4, p0, Lcp0/i0;->z:Lch0/v0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    move-object v4, p1

    check-cast v4, Lsl0/n0;

    move-object/from16 v5, p2

    check-cast v5, Lc93/a;

    move-object/from16 v6, p3

    check-cast v6, Lc93/o;

    move-object/from16 v7, p4

    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object/from16 v8, p5

    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object/from16 v9, p6

    check-cast v9, Lc93/a;

    move-object/from16 v10, p7

    check-cast v10, Ljava/lang/String;

    move-object/from16 v11, p8

    check-cast v11, Lkotlin/jvm/functions/Function3;

    move-object/from16 p1, p9

    check-cast p1, Landroidx/compose/runtime/Composer;

    move-object/from16 v0, p10

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v13

    move-object v12, p1

    check-cast v12, Lp1/q;

    iget-object v0, p0, Lcp0/i0;->w:Lzo0/c;

    iget-object v1, p0, Lcp0/i0;->x:Lcp0/m0;

    iget-boolean v2, p0, Lcp0/i0;->y:Z

    iget-object v3, p0, Lcp0/i0;->z:Lch0/v0;

    invoke-static/range {v0 .. v13}, Lcp0/j0;->G(Lzo0/c;Lcp0/m0;ZLch0/v0;Lsl0/n0;Lc93/a;Lc93/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lp1/q;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
