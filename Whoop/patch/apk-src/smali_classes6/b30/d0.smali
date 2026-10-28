.class public final Lb30/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# static fields
.field public static final w:Lb30/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb30/d0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb30/d0;->w:Lb30/d0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p1

    check-cast v0, Ll0/s1;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const-string v3, "$this$Button"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, v2, 0x11

    const/16 v2, 0x10

    if-ne v0, v2, :cond_1

    move-object v0, v1

    check-cast v0, Lp1/q;

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    const v0, 0x7f140feb

    invoke-static {v1, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    const/16 v24, 0x0

    const v25, 0x1fffe

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, v1

    move-object v1, v0

    invoke-static/range {v1 .. v25}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
