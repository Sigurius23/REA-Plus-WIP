.class public abstract Lgv/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgv/j;

.field public static final b:Lgv/j;

.field public static final c:Lcom/mapbox/maps/EdgeInsets;

.field public static final d:Lgv/j;

.field public static final e:Lgv/j;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lgv/j;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgv/j;-><init>(I)V

    sput-object v0, Lgv/k;->a:Lgv/j;

    new-instance v0, Lgv/j;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lgv/j;-><init>(I)V

    sput-object v0, Lgv/k;->b:Lgv/j;

    new-instance v2, Lcom/mapbox/maps/EdgeInsets;

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    invoke-direct/range {v2 .. v10}, Lcom/mapbox/maps/EdgeInsets;-><init>(DDDD)V

    sput-object v2, Lgv/k;->c:Lcom/mapbox/maps/EdgeInsets;

    new-instance v0, Lgv/j;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lgv/j;-><init>(I)V

    sput-object v0, Lgv/k;->d:Lgv/j;

    new-instance v0, Lgv/j;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lgv/j;-><init>(I)V

    sput-object v0, Lgv/k;->e:Lgv/j;

    return-void
.end method
