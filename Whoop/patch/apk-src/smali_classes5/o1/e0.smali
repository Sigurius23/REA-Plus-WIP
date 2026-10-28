.class public abstract Lo1/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll3/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v13, Lw3/i;

    sget v0, Lw3/f;->b:F

    const/4 v1, 0x0

    invoke-direct {v13, v0, v1}, Lw3/i;-><init>(FI)V

    sget-object v0, Ll3/v0;->d:Ll3/v0;

    sget-object v12, Lm1/u;->a:Ll3/g0;

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

    sput-object v0, Lo1/e0;->a:Ll3/v0;

    return-void
.end method
