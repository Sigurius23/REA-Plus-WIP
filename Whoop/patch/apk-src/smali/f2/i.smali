.class public final Lf2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf2/b;


# static fields
.field public static final w:Lf2/i;

.field public static final x:Ly3/m;

.field public static final y:Ly3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf2/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lf2/i;->w:Lf2/i;

    sget-object v0, Ly3/m;->w:Ly3/m;

    sput-object v0, Lf2/i;->x:Ly3/m;

    new-instance v0, Ly3/d;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v1}, Ly3/d;-><init>(FF)V

    sput-object v0, Lf2/i;->y:Ly3/d;

    return-void
.end method


# virtual methods
.method public final d()J
    .locals 2

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    return-wide v0
.end method

.method public final getDensity()Ly3/c;
    .locals 1

    sget-object v0, Lf2/i;->y:Ly3/d;

    return-object v0
.end method

.method public final getLayoutDirection()Ly3/m;
    .locals 1

    sget-object v0, Lf2/i;->x:Ly3/m;

    return-object v0
.end method
