.class public abstract Lli/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lf93/a;

.field public static final b:Lf93/a;

.field public static final c:Lf93/a;

.field public static final d:Lf93/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf93/a;

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lli/a;->a:Lf93/a;

    new-instance v0, Lf93/a;

    const-wide/16 v1, -0x1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lli/a;->b:Lf93/a;

    new-instance v0, Lf93/a;

    const-wide/high16 v1, -0x4010000000000000L    # -1.0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lli/a;->c:Lf93/a;

    new-instance v0, Lf93/a;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lli/a;->d:Lf93/a;

    return-void
.end method
