.class public abstract Lf1/a2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/b0;

.field public static final b:Lf1/y1;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lf1/z1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf1/z1;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Lf1/a2;->a:Lp1/b0;

    const-wide v0, 0xff4286f4L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    new-instance v2, Lf1/y1;

    const v3, 0x3ecccccd    # 0.4f

    invoke-static {v3, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v3

    invoke-direct {v2, v0, v1, v3, v4}, Lf1/y1;-><init>(JJ)V

    sput-object v2, Lf1/a2;->b:Lf1/y1;

    return-void
.end method
