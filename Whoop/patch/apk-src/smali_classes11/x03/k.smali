.class public abstract Lx03/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld0/i1;

.field public static final b:Lx03/j;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x5

    const/4 v2, 0x0

    const/high16 v3, 0x43c80000    # 400.0f

    invoke-static {v2, v3, v1, v0}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v0

    sput-object v0, Lx03/k;->a:Ld0/i1;

    sget-object v0, Lx03/j;->w:Lx03/j;

    sput-object v0, Lx03/k;->b:Lx03/j;

    return-void
.end method
