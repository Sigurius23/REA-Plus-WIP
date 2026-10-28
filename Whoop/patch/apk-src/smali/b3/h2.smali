.class public final Lb3/h2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq83/i;
.implements Lb3/h3;
.implements Lp3/g;


# static fields
.field public static final synthetic w:Lb3/h2;

.field public static final x:Lb3/h2;

.field public static final y:Lb3/o3;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lb3/h2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb3/h2;->w:Lb3/h2;

    new-instance v0, Lb3/h2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb3/h2;->x:Lb3/h2;

    new-instance v0, Lb3/o3;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb3/h2;->y:Lb3/o3;

    return-void
.end method


# virtual methods
.method public a(Lb3/a;)Lc93/a;
    .locals 4

    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Landroidx/lifecycle/o1;->g(Landroid/view/View;)Landroidx/lifecycle/g0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    invoke-static {p1, v0}, Lb3/o0;->b(Lb3/a;Landroidx/lifecycle/x;)La3/m0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "View tree for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " has no ViewTreeLifecycleOwner"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lx2/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_1
    new-instance v0, Lkotlin/jvm/internal/g0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lb3/g3;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2, v0}, Lb3/g3;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    new-instance v2, La3/m0;

    const/4 v3, 0x2

    invoke-direct {v2, v3, p1, v1}, La3/m0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v2, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance p1, La3/l0;

    const/4 v1, 0x4

    invoke-direct {p1, v0, v1}, La3/l0;-><init>(Ljava/lang/Object;I)V

    return-object p1
.end method
