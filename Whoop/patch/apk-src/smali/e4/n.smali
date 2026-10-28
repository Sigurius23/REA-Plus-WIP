.class public final Le4/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La3/p;

.field public final b:La3/p;

.field public final c:La3/p;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La3/p;

    const-string v1, "base"

    invoke-direct {v0, p1, v1}, La3/p;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Le4/n;->a:La3/p;

    new-instance p1, La3/p;

    const-string v0, "min"

    const/4 v1, 0x0

    invoke-direct {p1, v1, v0}, La3/p;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Le4/n;->b:La3/p;

    new-instance p1, La3/p;

    const-string v0, "max"

    invoke-direct {p1, v1, v0}, La3/p;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Le4/n;->c:La3/p;

    return-void
.end method
