.class public final Lgj/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/LinkedHashSet;

.field public final b:Lgj/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lgj/f;->a:Ljava/util/LinkedHashSet;

    sget-object v0, Lgj/e;->x:Lgj/e;

    iput-object v0, p0, Lgj/f;->b:Lgj/e;

    return-void
.end method
