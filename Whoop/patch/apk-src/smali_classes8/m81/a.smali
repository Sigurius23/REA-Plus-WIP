.class public final synthetic Lm81/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# instance fields
.field public final synthetic E:Lm81/f;

.field public final synthetic F:Lm81/f;

.field public final synthetic G:Lp1/a1;

.field public final synthetic H:Lkotlin/jvm/functions/Function1;

.field public final synthetic w:Ly3/f;

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:J

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Ly3/f;Ljava/util/List;JFLm81/f;Lm81/f;Lp1/a1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm81/a;->w:Ly3/f;

    iput-object p2, p0, Lm81/a;->x:Ljava/util/List;

    iput-wide p3, p0, Lm81/a;->y:J

    iput p5, p0, Lm81/a;->z:F

    iput-object p6, p0, Lm81/a;->E:Lm81/f;

    iput-object p7, p0, Lm81/a;->F:Lm81/f;

    iput-object p8, p0, Lm81/a;->G:Lp1/a1;

    iput-object p9, p0, Lm81/a;->H:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    move-object v9, p1

    check-cast v9, Landroidx/compose/foundation/lazy/a;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v10

    move-object/from16 v11, p3

    check-cast v11, Lf31/a;

    move-object/from16 v12, p4

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p5

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-object v0, p0, Lm81/a;->w:Ly3/f;

    iget-object v1, p0, Lm81/a;->x:Ljava/util/List;

    iget-wide v2, p0, Lm81/a;->y:J

    iget v4, p0, Lm81/a;->z:F

    iget-object v5, p0, Lm81/a;->E:Lm81/f;

    iget-object v6, p0, Lm81/a;->F:Lm81/f;

    iget-object v7, p0, Lm81/a;->G:Lp1/a1;

    iget-object v8, p0, Lm81/a;->H:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v13}, Lm81/e;->d(Ly3/f;Ljava/util/List;JFLm81/f;Lm81/f;Lp1/a1;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
