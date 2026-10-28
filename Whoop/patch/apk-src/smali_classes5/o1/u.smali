.class public abstract Lo1/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lt0/i;

.field public static final b:Lt0/i;

.field public static final c:Lt0/i;

.field public static final d:Lt0/i;

.field public static final e:Lt0/i;

.field public static final f:Lt0/i;

.field public static final g:Lt0/i;

.field public static final h:Lt0/i;

.field public static final i:Lt0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const-wide/high16 v0, 0x4048000000000000L    # 48.0

    double-to-float v0, v0

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v1

    sput-object v1, Lo1/u;->a:Lt0/i;

    const-wide/high16 v1, 0x403c000000000000L    # 28.0

    double-to-float v1, v1

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v2

    sput-object v2, Lo1/u;->b:Lt0/i;

    const-wide/high16 v2, 0x4040000000000000L    # 32.0

    double-to-float v2, v2

    invoke-static {v2}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    sput-object v3, Lo1/u;->c:Lt0/i;

    const-wide/16 v3, 0x0

    double-to-float v3, v3

    const-wide/high16 v4, 0x4010000000000000L    # 4.0

    double-to-float v4, v4

    invoke-static {v4}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    sput-object v5, Lo1/u;->d:Lt0/i;

    const-wide/high16 v5, 0x4030000000000000L    # 16.0

    double-to-float v5, v5

    invoke-static {v5}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    sput-object v6, Lo1/u;->e:Lt0/i;

    const-wide/high16 v6, 0x4034000000000000L    # 20.0

    double-to-float v6, v6

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v7

    sput-object v7, Lo1/u;->f:Lt0/i;

    const-wide/high16 v7, 0x4028000000000000L    # 12.0

    double-to-float v7, v7

    invoke-static {v7}, Lt0/j;->e(F)Lt0/i;

    move-result-object v8

    sput-object v8, Lo1/u;->g:Lt0/i;

    const-wide/high16 v8, 0x4020000000000000L    # 8.0

    double-to-float v8, v8

    invoke-static {v8}, Lt0/j;->e(F)Lt0/i;

    move-result-object v9

    sput-object v9, Lo1/u;->h:Lt0/i;

    new-instance v9, Lt0/e;

    invoke-direct {v9, v0}, Lt0/e;-><init>(F)V

    new-instance v0, Lt0/e;

    invoke-direct {v0, v1}, Lt0/e;-><init>(F)V

    new-instance v0, Lt0/e;

    invoke-direct {v0, v2}, Lt0/e;-><init>(F)V

    new-instance v0, Lt0/e;

    invoke-direct {v0, v4}, Lt0/e;-><init>(F)V

    new-instance v0, Lt0/e;

    invoke-direct {v0, v5}, Lt0/e;-><init>(F)V

    new-instance v0, Lt0/e;

    invoke-direct {v0, v6}, Lt0/e;-><init>(F)V

    new-instance v0, Lt0/e;

    invoke-direct {v0, v7}, Lt0/e;-><init>(F)V

    new-instance v0, Lt0/e;

    invoke-direct {v0, v3}, Lt0/e;-><init>(F)V

    sput-object v0, Lo1/u;->i:Lt0/e;

    new-instance v0, Lt0/e;

    invoke-direct {v0, v8}, Lt0/e;-><init>(F)V

    return-void
.end method
