.class public final Lgw/e;
.super Lgw/b;
.source "SourceFile"


# static fields
.field public static final w:Lgw/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lgw/e;

    sget-object v1, Lgw/f;->z:Lgw/f;

    sget-object v2, Lgw/f;->E:Lgw/f;

    sget-object v3, Lgw/f;->F:Lgw/f;

    filled-new-array {v1, v2, v3}, [Lgw/f;

    move-result-object v1

    invoke-direct {v0, v1}, Lgw/b;-><init>([Lgw/a;)V

    new-instance v0, Lgw/e;

    sget-object v1, Lgw/f;->I:Lgw/f;

    sget-object v2, Lgw/f;->J:Lgw/f;

    sget-object v3, Lgw/f;->K:Lgw/f;

    filled-new-array {v1, v2, v3}, [Lgw/f;

    move-result-object v1

    invoke-direct {v0, v1}, Lgw/b;-><init>([Lgw/a;)V

    sput-object v0, Lgw/e;->w:Lgw/e;

    return-void
.end method
