.class public abstract Lsv/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgv/j;

.field public static final b:Lgv/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgv/j;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lgv/j;-><init>(I)V

    sput-object v0, Lsv/a;->a:Lgv/j;

    new-instance v0, Lgv/j;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lgv/j;-><init>(I)V

    sput-object v0, Lsv/a;->b:Lgv/j;

    return-void
.end method
