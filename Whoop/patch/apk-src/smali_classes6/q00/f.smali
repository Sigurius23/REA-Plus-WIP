.class public abstract Lq00/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk00/a;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lzy/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lzy/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq00/f;->a:Ljava/lang/String;

    iput-object p2, p0, Lq00/f;->b:Lzy/b;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lq00/f;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final getText()Lzy/c;
    .locals 1

    iget-object v0, p0, Lq00/f;->b:Lzy/b;

    return-object v0
.end method

.method public final isDestructive()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
