.class public final synthetic Lv41/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Landroid/graphics/pdf/PdfRenderer;

.field public final synthetic F:Z

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic I:Lkotlin/jvm/functions/Function1;

.field public final synthetic J:Z

.field public final synthetic K:Landroid/content/Context;

.field public final synthetic L:Lbh/e;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lbc3/c0;

.field public final synthetic z:Lmc3/a;


# direct methods
.method public synthetic constructor <init>(IIILandroid/content/Context;Landroid/graphics/pdf/PdfRenderer;Lbc3/c0;Lbh/e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lmc3/a;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lv41/v;->w:I

    iput-object p8, p0, Lv41/v;->x:Ljava/lang/String;

    iput-object p6, p0, Lv41/v;->y:Lbc3/c0;

    iput-object p10, p0, Lv41/v;->z:Lmc3/a;

    iput-object p5, p0, Lv41/v;->E:Landroid/graphics/pdf/PdfRenderer;

    iput-boolean p11, p0, Lv41/v;->F:Z

    iput p2, p0, Lv41/v;->G:I

    iput p3, p0, Lv41/v;->H:I

    iput-object p9, p0, Lv41/v;->I:Lkotlin/jvm/functions/Function1;

    iput-boolean p12, p0, Lv41/v;->J:Z

    iput-object p4, p0, Lv41/v;->K:Landroid/content/Context;

    iput-object p7, p0, Lv41/v;->L:Lbh/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v11, p0, Lv41/v;->L:Lbh/e;

    move-object v12, p1

    check-cast v12, Ln0/q;

    iget v0, p0, Lv41/v;->w:I

    iget-object v1, p0, Lv41/v;->x:Ljava/lang/String;

    iget-object v2, p0, Lv41/v;->y:Lbc3/c0;

    iget-object v3, p0, Lv41/v;->z:Lmc3/a;

    iget-object v4, p0, Lv41/v;->E:Landroid/graphics/pdf/PdfRenderer;

    iget-boolean v5, p0, Lv41/v;->F:Z

    iget v6, p0, Lv41/v;->G:I

    iget v7, p0, Lv41/v;->H:I

    iget-object v8, p0, Lv41/v;->I:Lkotlin/jvm/functions/Function1;

    iget-boolean v9, p0, Lv41/v;->J:Z

    iget-object v10, p0, Lv41/v;->K:Landroid/content/Context;

    invoke-static/range {v0 .. v12}, Lv41/d0;->e(ILjava/lang/String;Lbc3/c0;Lmc3/a;Landroid/graphics/pdf/PdfRenderer;ZIILkotlin/jvm/functions/Function1;ZLandroid/content/Context;Lbh/e;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
