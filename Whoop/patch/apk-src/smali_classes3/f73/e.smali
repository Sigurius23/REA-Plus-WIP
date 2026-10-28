.class public abstract Lf73/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lz63/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz63/c;

    const-string v1, "task-list-done"

    invoke-direct {v0, v1}, Lz63/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lf73/e;->a:Lz63/c;

    return-void
.end method
