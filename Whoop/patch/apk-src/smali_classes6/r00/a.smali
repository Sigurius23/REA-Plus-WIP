.class public abstract Lr00/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc0/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lc0/l0;

    const/16 v1, 0x12c

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    invoke-static {v1, v2, v3, v4}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v5

    const/4 v6, 0x2

    invoke-static {v5, v6}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v5

    invoke-static {v1, v2, v3, v4}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v1

    invoke-static {v1, v6}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v1

    new-instance v2, Lp0/w0;

    const/16 v3, 0x1c

    invoke-direct {v2, v3}, Lp0/w0;-><init>(I)V

    sget v3, Landroidx/compose/animation/a;->b:I

    new-instance v3, Lc0/r1;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v2}, Lc0/r1;-><init>(ZLc93/m;)V

    const/4 v2, 0x4

    invoke-direct {v0, v5, v1, v3, v2}, Lc0/l0;-><init>(Lc0/d1;Lc0/f1;Lc0/r1;I)V

    sput-object v0, Lr00/a;->a:Lc0/l0;

    return-void
.end method
