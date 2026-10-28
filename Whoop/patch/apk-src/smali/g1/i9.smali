.class public abstract Lg1/i9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll3/v0;

.field public static final b:Lp1/u2;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v13, Lw3/i;

    sget v0, Lw3/f;->b:F

    const/4 v1, 0x0

    invoke-direct {v13, v0, v1}, Lw3/i;-><init>(FI)V

    sget-object v0, Ll3/v0;->d:Ll3/v0;

    sget-object v12, Lg1/u1;->a:Ll3/g0;

    const v14, 0xe7ffff

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    invoke-static/range {v0 .. v14}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v0

    sput-object v0, Lg1/i9;->a:Ll3/v0;

    new-instance v0, Lep0/a;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lep0/a;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Lg1/i9;->b:Lp1/u2;

    return-void
.end method

.method public static final a(Ll3/v0;Lp3/i;)Ll3/v0;
    .locals 15

    iget-object v1, p0, Ll3/v0;->a:Ll3/m0;

    iget-object v1, v1, Ll3/m0;->f:Lp3/i;

    if-eqz v1, :cond_0

    return-object p0

    :cond_0
    const/4 v13, 0x0

    const v14, 0xffffdf

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move-object v0, p0

    move-object/from16 v6, p1

    invoke-static/range {v0 .. v14}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v0

    return-object v0
.end method
