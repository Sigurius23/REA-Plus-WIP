.class public final Lp40/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:Ljava/util/Map$Entry;

.field public final synthetic x:Lm40/w;

.field public final synthetic y:J


# direct methods
.method public constructor <init>(Ljava/util/Map$Entry;Lm40/w;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp40/c;->w:Ljava/util/Map$Entry;

    iput-object p2, p0, Lp40/c;->x:Lm40/w;

    iput-wide p3, p0, Lp40/c;->y:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    move-object/from16 v12, p2

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const-string v3, "it"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v2, 0x11

    const/16 v2, 0x10

    if-ne v1, v2, :cond_1

    move-object v1, v12

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v1, v0, Lp40/c;->w:Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    sget-object v1, Lb2/t;->w:Lb2/t;

    iget-wide v3, v0, Lp40/c;->y:J

    invoke-static {v3, v4}, Lh2/e;->e(J)F

    move-result v5

    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v3, v4}, Lh2/e;->c(J)F

    move-result v3

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v14, 0x0

    const/16 v15, 0x7f0

    iget-object v3, v0, Lp40/c;->x:Lm40/w;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v13, 0x180

    invoke-static/range {v2 .. v15}, Lds/q;->i(Ljava/lang/String;Lm40/w;Landroidx/compose/ui/Modifier;Ly2/k;Li2/y;Ln2/a;Lb2/h;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
