.class public final synthetic Lv41/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic H:Lkotlin/jvm/functions/Function1;

.field public final synthetic I:Z

.field public final synthetic J:Landroid/content/Context;

.field public final synthetic K:I

.field public final synthetic L:Lbh/e;

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Lmc3/a;

.field public final synthetic z:Landroid/graphics/pdf/PdfRenderer;


# direct methods
.method public synthetic constructor <init>(IIILandroid/content/Context;Landroid/graphics/pdf/PdfRenderer;Lbc3/c0;Lbh/e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lmc3/a;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p8, p0, Lv41/x;->w:Ljava/lang/String;

    iput-object p6, p0, Lv41/x;->x:Lbc3/c0;

    iput-object p10, p0, Lv41/x;->y:Lmc3/a;

    iput-object p5, p0, Lv41/x;->z:Landroid/graphics/pdf/PdfRenderer;

    iput-boolean p11, p0, Lv41/x;->E:Z

    iput p1, p0, Lv41/x;->F:I

    iput p2, p0, Lv41/x;->G:I

    iput-object p9, p0, Lv41/x;->H:Lkotlin/jvm/functions/Function1;

    iput-boolean p12, p0, Lv41/x;->I:Z

    iput-object p4, p0, Lv41/x;->J:Landroid/content/Context;

    iput p3, p0, Lv41/x;->K:I

    iput-object p7, p0, Lv41/x;->L:Lbh/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v13, p1

    check-cast v13, Landroidx/compose/foundation/lazy/a;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v14

    move-object/from16 v15, p3

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p4

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v16

    iget-object v1, v0, Lv41/x;->w:Ljava/lang/String;

    iget-object v2, v0, Lv41/x;->x:Lbc3/c0;

    iget-object v3, v0, Lv41/x;->y:Lmc3/a;

    iget-object v4, v0, Lv41/x;->z:Landroid/graphics/pdf/PdfRenderer;

    iget-boolean v5, v0, Lv41/x;->E:Z

    iget v6, v0, Lv41/x;->F:I

    iget v7, v0, Lv41/x;->G:I

    iget-object v8, v0, Lv41/x;->H:Lkotlin/jvm/functions/Function1;

    iget-boolean v9, v0, Lv41/x;->I:Z

    iget-object v10, v0, Lv41/x;->J:Landroid/content/Context;

    iget v11, v0, Lv41/x;->K:I

    iget-object v12, v0, Lv41/x;->L:Lbh/e;

    invoke-static/range {v1 .. v16}, Lv41/d0;->g(Ljava/lang/String;Lbc3/c0;Lmc3/a;Landroid/graphics/pdf/PdfRenderer;ZIILkotlin/jvm/functions/Function1;ZLandroid/content/Context;ILbh/e;Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
