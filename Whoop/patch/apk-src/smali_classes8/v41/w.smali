.class public final synthetic Lv41/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lbc3/c0;

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic H:Lmc3/a;

.field public final synthetic I:Landroid/graphics/pdf/PdfRenderer;

.field public final synthetic J:Lkotlin/jvm/functions/Function1;

.field public final synthetic K:Landroid/content/Context;

.field public final synthetic L:Z

.field public final synthetic M:Z

.field public final synthetic N:I

.field public final synthetic O:I

.field public final synthetic w:Ll0/l;

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Lbh/e;


# direct methods
.method public synthetic constructor <init>(Ll0/l;ILjava/lang/String;Lbh/e;Lbc3/c0;IILmc3/a;Landroid/graphics/pdf/PdfRenderer;Lkotlin/jvm/functions/Function1;Landroid/content/Context;ZZII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv41/w;->w:Ll0/l;

    iput p2, p0, Lv41/w;->x:I

    iput-object p3, p0, Lv41/w;->y:Ljava/lang/String;

    iput-object p4, p0, Lv41/w;->z:Lbh/e;

    iput-object p5, p0, Lv41/w;->E:Lbc3/c0;

    iput p6, p0, Lv41/w;->F:I

    iput p7, p0, Lv41/w;->G:I

    iput-object p8, p0, Lv41/w;->H:Lmc3/a;

    iput-object p9, p0, Lv41/w;->I:Landroid/graphics/pdf/PdfRenderer;

    iput-object p10, p0, Lv41/w;->J:Lkotlin/jvm/functions/Function1;

    iput-object p11, p0, Lv41/w;->K:Landroid/content/Context;

    iput-boolean p12, p0, Lv41/w;->L:Z

    iput-boolean p13, p0, Lv41/w;->M:Z

    iput p14, p0, Lv41/w;->N:I

    iput p15, p0, Lv41/w;->O:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v16, p1

    check-cast v16, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v17

    iget-object v1, v0, Lv41/w;->w:Ll0/l;

    iget v2, v0, Lv41/w;->x:I

    iget-object v3, v0, Lv41/w;->y:Ljava/lang/String;

    iget-object v4, v0, Lv41/w;->z:Lbh/e;

    iget-object v5, v0, Lv41/w;->E:Lbc3/c0;

    iget v6, v0, Lv41/w;->F:I

    iget v7, v0, Lv41/w;->G:I

    iget-object v8, v0, Lv41/w;->H:Lmc3/a;

    iget-object v9, v0, Lv41/w;->I:Landroid/graphics/pdf/PdfRenderer;

    iget-object v10, v0, Lv41/w;->J:Lkotlin/jvm/functions/Function1;

    iget-object v11, v0, Lv41/w;->K:Landroid/content/Context;

    iget-boolean v12, v0, Lv41/w;->L:Z

    iget-boolean v13, v0, Lv41/w;->M:Z

    iget v14, v0, Lv41/w;->N:I

    iget v15, v0, Lv41/w;->O:I

    invoke-static/range {v1 .. v17}, Lv41/d0;->b(Ll0/l;ILjava/lang/String;Lbh/e;Lbc3/c0;IILmc3/a;Landroid/graphics/pdf/PdfRenderer;Lkotlin/jvm/functions/Function1;Landroid/content/Context;ZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
