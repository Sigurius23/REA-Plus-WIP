.class public final Lq3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final b:La3/p;

.field public final c:Ljava/lang/Object;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Lq3/y;

.field public k:Ll3/r0;

.field public l:Lq3/r;

.field public m:Lkotlin/jvm/functions/Function1;

.field public n:Lh2/c;

.field public o:Lh2/c;

.field public final p:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

.field public final q:[F

.field public final r:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;La3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/d;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    iput-object p2, p0, Lq3/d;->b:La3/p;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/d;->c:Ljava/lang/Object;

    sget-object p1, Lq3/c;->x:Lq3/c;

    iput-object p1, p0, Lq3/d;->m:Lkotlin/jvm/functions/Function1;

    new-instance p1, Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    invoke-direct {p1}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;-><init>()V

    iput-object p1, p0, Lq3/d;->p:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    invoke-static {}, Li2/l0;->a()[F

    move-result-object p1

    iput-object p1, p0, Lq3/d;->q:[F

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lq3/d;->r:Landroid/graphics/Matrix;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lq3/d;->b:La3/p;

    iget-object v2, v1, La3/p;->y:Ljava/lang/Object;

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, v1, La3/p;->x:Ljava/lang/Object;

    check-cast v1, Landroid/view/View;

    invoke-virtual {v3, v1}, Landroid/view/inputmethod/InputMethodManager;->isActive(Landroid/view/View;)Z

    move-result v3

    if-nez v3, :cond_0

    return-void

    :cond_0
    iget-object v3, v0, Lq3/d;->m:Lkotlin/jvm/functions/Function1;

    new-instance v4, Li2/l0;

    iget-object v5, v0, Lq3/d;->q:[F

    invoke-direct {v4, v5}, Li2/l0;-><init>([F)V

    invoke-interface {v3, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v0, Lq3/d;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v3, v5}, Landroidx/compose/ui/platform/AndroidComposeView;->u([F)V

    iget-object v10, v0, Lq3/d;->r:Landroid/graphics/Matrix;

    invoke-static {v10, v5}, Li2/w0;->A(Landroid/graphics/Matrix;[F)V

    iget-object v7, v0, Lq3/d;->j:Lq3/y;

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v8, v0, Lq3/d;->l:Lq3/r;

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v9, v0, Lq3/d;->k:Ll3/r0;

    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v11, v0, Lq3/d;->n:Lh2/c;

    invoke-static {v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v12, v0, Lq3/d;->o:Lh2/c;

    invoke-static {v12}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-boolean v13, v0, Lq3/d;->f:Z

    iget-boolean v14, v0, Lq3/d;->g:Z

    iget-boolean v15, v0, Lq3/d;->h:Z

    iget-boolean v3, v0, Lq3/d;->i:Z

    iget-object v6, v0, Lq3/d;->p:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    move/from16 v16, v3

    invoke-static/range {v6 .. v16}, Lv8/b;->i(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Lq3/y;Lq3/r;Ll3/r0;Landroid/graphics/Matrix;Lh2/c;Lh2/c;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;

    move-result-object v3

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v2, v1, v3}, Landroid/view/inputmethod/InputMethodManager;->updateCursorAnchorInfo(Landroid/view/View;Landroid/view/inputmethod/CursorAnchorInfo;)V

    const/4 v1, 0x0

    iput-boolean v1, v0, Lq3/d;->e:Z

    return-void
.end method
