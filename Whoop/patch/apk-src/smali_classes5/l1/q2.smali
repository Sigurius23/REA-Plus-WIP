.class public final Ll1/q2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll1/r2;


# static fields
.field public static final a:Ll1/q2;

.field public static final b:Ld0/i1;

.field public static final c:Ld0/i1;

.field public static final d:Ld0/i1;

.field public static final e:Ld0/i1;

.field public static final f:Ld0/i1;

.field public static final g:Ld0/i1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ll1/q2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll1/q2;->a:Ll1/q2;

    const v0, 0x3f666666    # 0.9f

    const/high16 v1, 0x442f0000    # 700.0f

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v1

    sput-object v1, Ll1/q2;->b:Ld0/i1;

    const/high16 v1, 0x44af0000    # 1400.0f

    invoke-static {v0, v1, v2, v3}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v1

    sput-object v1, Ll1/q2;->c:Ld0/i1;

    const/high16 v1, 0x43960000    # 300.0f

    invoke-static {v0, v1, v2, v3}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v0

    sput-object v0, Ll1/q2;->d:Ld0/i1;

    const/high16 v0, 0x44c80000    # 1600.0f

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0, v2, v3}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v0

    sput-object v0, Ll1/q2;->e:Ld0/i1;

    const v0, 0x456d8000    # 3800.0f

    invoke-static {v1, v0, v2, v3}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v0

    sput-object v0, Ll1/q2;->f:Ld0/i1;

    const/high16 v0, 0x44480000    # 800.0f

    invoke-static {v1, v0, v2, v3}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v0

    sput-object v0, Ll1/q2;->g:Ld0/i1;

    return-void
.end method
