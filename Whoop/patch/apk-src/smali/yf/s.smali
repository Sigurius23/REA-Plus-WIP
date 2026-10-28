.class public abstract Lyf/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final w:Lyf/r;

.field public final x:Ljava/io/Closeable;


# direct methods
.method public constructor <init>(Ljava/io/Closeable;)V
    .locals 1

    const-string v0, "closeable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lyf/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lyf/s;->w:Lyf/r;

    iput-object p1, p0, Lyf/s;->x:Ljava/io/Closeable;

    return-void
.end method
