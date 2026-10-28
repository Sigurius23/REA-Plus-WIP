.class public abstract Lb2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb2/j;

.field public static final b:Lb2/j;

.field public static final c:Lb2/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb2/j;

    const/high16 v1, -0x40800000    # -1.0f

    invoke-direct {v0, v1}, Lb2/j;-><init>(F)V

    sput-object v0, Lb2/a;->a:Lb2/j;

    new-instance v0, Lb2/j;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1}, Lb2/j;-><init>(F)V

    sput-object v0, Lb2/a;->b:Lb2/j;

    new-instance v0, Lb2/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb2/a;->c:Lb2/i;

    return-void
.end method

.method public static final a(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Landroidx/compose/ui/ZIndexElement;

    invoke-direct {v0, p0}, Landroidx/compose/ui/ZIndexElement;-><init>(F)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
