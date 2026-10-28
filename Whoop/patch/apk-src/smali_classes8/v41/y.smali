.class public final synthetic Lv41/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Z

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic I:Lp1/c1;

.field public final synthetic w:Lbc3/c0;

.field public final synthetic x:Lmc3/a;

.field public final synthetic y:Landroid/graphics/pdf/PdfRenderer;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lmc3/a;Landroid/graphics/pdf/PdfRenderer;Lkotlin/jvm/functions/Function1;IZIILp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv41/y;->w:Lbc3/c0;

    iput-object p2, p0, Lv41/y;->x:Lmc3/a;

    iput-object p3, p0, Lv41/y;->y:Landroid/graphics/pdf/PdfRenderer;

    iput-object p4, p0, Lv41/y;->z:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Lv41/y;->E:I

    iput-boolean p6, p0, Lv41/y;->F:Z

    iput p7, p0, Lv41/y;->G:I

    iput p8, p0, Lv41/y;->H:I

    iput-object p9, p0, Lv41/y;->I:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v8, p0, Lv41/y;->I:Lp1/c1;

    move-object v9, p1

    check-cast v9, Lp1/i0;

    iget-object v0, p0, Lv41/y;->w:Lbc3/c0;

    iget-object v1, p0, Lv41/y;->x:Lmc3/a;

    iget-object v2, p0, Lv41/y;->y:Landroid/graphics/pdf/PdfRenderer;

    iget-object v3, p0, Lv41/y;->z:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lv41/y;->E:I

    iget-boolean v5, p0, Lv41/y;->F:Z

    iget v6, p0, Lv41/y;->G:I

    iget v7, p0, Lv41/y;->H:I

    invoke-static/range {v0 .. v9}, Lv41/d0;->p(Lbc3/c0;Lmc3/a;Landroid/graphics/pdf/PdfRenderer;Lkotlin/jvm/functions/Function1;IZIILp1/c1;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1
.end method
