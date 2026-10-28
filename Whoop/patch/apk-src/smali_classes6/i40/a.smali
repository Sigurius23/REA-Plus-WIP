.class public abstract Li40/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J

.field public static final b:F

.field public static final c:F

.field public static final d:Landroidx/compose/ui/Modifier;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0, v0, v0, v0}, Ly3/b;->a(IIII)J

    move-result-wide v0

    sput-wide v0, Li40/a;->a:J

    const/16 v0, 0x10

    int-to-float v0, v0

    sput v0, Li40/a;->b:F

    const/16 v0, 0xc

    int-to-float v0, v0

    sput v0, Li40/a;->c:F

    const/16 v0, 0x30

    int-to-float v0, v0

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v0, v0}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sput-object v0, Li40/a;->d:Landroidx/compose/ui/Modifier;

    return-void
.end method
