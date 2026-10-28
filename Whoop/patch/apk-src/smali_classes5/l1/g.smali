.class public abstract Ll1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll0/l1;

.field public static final b:F

.field public static final c:F

.field public static final d:F


# direct methods
.method static constructor <clinit>()V
    .locals 5

    sget v0, Lo1/a;->a:F

    sget v1, Lo1/a;->b:F

    const/16 v2, 0x10

    int-to-float v2, v2

    sget v3, Lo1/b;->a:F

    const/16 v3, 0x8

    int-to-float v3, v3

    new-instance v4, Ll0/l1;

    invoke-direct {v4, v0, v3, v1, v3}, Ll0/l1;-><init>(FFFF)V

    invoke-static {v2, v3, v1, v3}, Landroidx/compose/foundation/layout/a;->b(FFFF)Ll0/l1;

    const/16 v0, 0xc

    int-to-float v0, v0

    new-instance v1, Ll0/l1;

    invoke-direct {v1, v0, v3, v0, v3}, Ll0/l1;-><init>(FFFF)V

    sput-object v1, Ll1/g;->a:Ll0/l1;

    invoke-static {v0, v3, v2, v3}, Landroidx/compose/foundation/layout/a;->b(FFFF)Ll0/l1;

    const/16 v0, 0x3a

    int-to-float v0, v0

    sput v0, Ll1/g;->b:F

    sget v0, Lo1/b;->a:F

    sput v0, Ll1/g;->c:F

    sget v0, Lo1/b;->c:F

    sput v0, Ll1/g;->d:F

    return-void
.end method

.method public static a(Ll1/m;)Ll1/f;
    .locals 10

    iget-object v0, p0, Ll1/m;->X:Ll1/f;

    if-nez v0, :cond_0

    new-instance v1, Ll1/f;

    sget-wide v2, Li2/x;->m:J

    sget-object v0, Lo1/f;->K:Lo1/f;

    invoke-static {p0, v0}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v4

    sget-object v0, Lo1/z;->a:Lo1/f;

    invoke-static {p0, v0}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v6

    sget v0, Lo1/z;->b:F

    invoke-static {v0, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v8

    move-wide v6, v2

    invoke-direct/range {v1 .. v9}, Ll1/f;-><init>(JJJJ)V

    iput-object v1, p0, Ll1/m;->X:Ll1/f;

    return-object v1

    :cond_0
    return-object v0
.end method
